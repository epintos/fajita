/*
 * TACO: Translation of Annotated COde
 * Copyright (c) 2010 Universidad de Buenos Aires
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA,
 * 02110-1301, USA
 */
package ar.edu.taco.engine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import ar.edu.jdynalloy.ast.JDynAlloyModule;
import ar.edu.jdynalloy.binding.BindingManager;
import ar.edu.jdynalloy.modifies.ModifiesSolverManager;
import ar.edu.jdynalloy.relevancy.RelevancyAnalysisManager;
import ar.edu.jdynalloy.relevancy.Scene;
import ar.edu.jdynalloy.slicer.SceneSlicerManager;
import ar.edu.jdynalloy.xlator.JDynAlloyBinding;
import ar.edu.taco.TacoConfigurator;
import ar.edu.taco.jdynalloy.JDynAlloyToDynAlloyManager;
import ar.edu.taco.simplejml.JavaToJDynAlloyManager;
import ar.edu.taco.utils.FileUtils;

/**
 * @author ggasser
 * 
 */
public class JDynAlloyStage implements ITacoStage {
	private static Logger log = Logger.getLogger(JDynAlloyStage.class);
	static final private String OUTPUT_DYNALLOY_EXTENSION = ".dals";
	static final private String OUTPUT_JDYNALLOY_WITH_OUT_MODIFIES_EXTENSION = ".without.modifies.djals";
	static final private String OUTPUT_JDYNALLOY_WITH_OUT_CALLSPEC_EXTENSION = ".without.callspec.djals";

	private List<JDynAlloyModule> modules;
	private List<String> outputFileNames;

	public JDynAlloyStage(List<JDynAlloyModule> modules) {
		this.modules = modules;
	}

	public List<String> getOutputFileNames() {
		return outputFileNames;
	}

	public List<JDynAlloyModule> getPrunedModules() {
		return modules;
	}

	@Override
	public void execute() {

		outputFileNames = new ArrayList<String>();

		JDynAlloyBinding dynJAlloyBinding;
		dynJAlloyBinding = regenerateBindings();

		// relevancy analysis
		TacoConfigurator tacoConfigurator = TacoConfigurator.getInstance();
		List<String> relevantClassesList = null;
		Scene relevantAnalysisScene = null;
		if (tacoConfigurator.getRelevancyAnalysis()) {
			log.debug("Starting relevancy analysis");
			RelevancyAnalysisManager relevancyAnalysisManager = new RelevancyAnalysisManager();
			String relevantClasses = relevancyAnalysisManager.process(this.modules, dynJAlloyBinding);

			relevantAnalysisScene = relevancyAnalysisManager.getScene();

			tacoConfigurator.setProperty(TacoConfigurator.RELEVANT_CLASSES, relevantClasses);
			relevantClassesList = tacoConfigurator.getRelevantClasses();
			log.debug("Relevant Classes: " + relevantClassesList);
		}

		// slice unrelevant modules, fields & programs
		if (relevantClassesList != null && relevantAnalysisScene != null) {
			SceneSlicerManager sceneSlicerManager = new SceneSlicerManager();
			this.modules = sceneSlicerManager.process(this.modules, relevantClassesList, relevantAnalysisScene);
		}

		// Modifies Solver
		ModifiesSolverManager modifiesSolverManager = new ModifiesSolverManager();
		this.modules = modifiesSolverManager.process(this.modules, (JDynAlloyBinding) null);

		// activate setting "debug" logger lever for this class log4j
		// configuration!
		if (log.getLevel() == Level.DEBUG || log.getLevel() == Level.TRACE) {
			printToFile(this.modules, OUTPUT_JDYNALLOY_WITH_OUT_MODIFIES_EXTENSION);
		}

		dynJAlloyBinding = regenerateBindings();

		// activate setting "debug" logger lever for this class log4j
		// configuration!
		if (log.getLevel() == Level.DEBUG || log.getLevel() == Level.TRACE) {
			printToFile(this.modules, OUTPUT_JDYNALLOY_WITH_OUT_CALLSPEC_EXTENSION);
		}

		dynJAlloyBinding = regenerateBindings();

		JDynAlloyToDynAlloyManager dynJAlloyToDynAlloyManager = new JDynAlloyToDynAlloyManager();
		Map<String, String> output = dynJAlloyToDynAlloyManager.process(this.modules, dynJAlloyBinding);

		for (Entry<String, String> entry : output.entrySet()) {
			String moduleName = entry.getKey();
			String moduleBody = entry.getValue();

			String output_dir = TacoConfigurator.getInstance().getOutputDir();

			String moduleFilename = output_dir + java.io.File.separator + moduleName.replaceAll("_", "/") + OUTPUT_DYNALLOY_EXTENSION;
			try {
				FileUtils.writeToFile(moduleFilename, moduleBody);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		// print output in DynAlloy
		String output_dir = TacoConfigurator.getInstance().getOutputDir();
		String filename = output_dir + java.io.File.separator + "output" + OUTPUT_DYNALLOY_EXTENSION;

		try {
			writeDynAlloyOutput(filename, output);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// add to output current dynalloy module
		outputFileNames.add(filename);

	}

	private JDynAlloyBinding regenerateBindings() {
		BindingManager bindingManager;
		JDynAlloyBinding dynJAlloyBinding;
		bindingManager = new BindingManager(modules);
		bindingManager.execute();
		dynJAlloyBinding = bindingManager.getDynJAlloyBinding();
		return dynJAlloyBinding;
	}

	private void writeDynAlloyOutput(String path, Map<String, String> output) throws IOException {

		StringBuffer sb = new StringBuffer();

		// the firt entry must be the prelude entry
		String preludeModuleBody = output.get("prelude");
		appendModule(sb, "prelude", preludeModuleBody);

		for (Entry<String, String> outputEntry : output.entrySet()) {
			// skip prelude entry
			if (!outputEntry.getKey().equals("prelude")) {
				String moduleHeader = outputEntry.getKey();
				String moduleBody = outputEntry.getValue();
				appendModule(sb, moduleHeader, moduleBody);
			}
		}

		FileUtils.writeToFile(path, sb.toString());
	}

	private void appendModule(StringBuffer sb, String moduleHeader, String moduleBody) {
		sb.append(headerComment(moduleHeader));
		sb.append(moduleBody);
	}

	private String headerComment(String fragmentId) {
		return "//-------------- " + fragmentId + "--------------//" + "\n";
	}

	private void printToFile(List<JDynAlloyModule> modules, String extension) {
		for (JDynAlloyModule dynJAlloyModule : modules) {
			printToFile(dynJAlloyModule, extension);
		}
	}

	private void printToFile(JDynAlloyModule module, String extension) {
		String output_dir = TacoConfigurator.getInstance().getOutputDir();
		String filePath = output_dir + java.io.File.separator + module.getModuleId().replaceAll("_", "/") + extension;
		try {
			String moduleOutput = JavaToJDynAlloyManager.getModuleOutput(module);
			FileUtils.writeToFile(filePath, moduleOutput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}