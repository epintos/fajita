package ar.edu.taco.stryker;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;

import mujava.api.Mutant;

import org.apache.log4j.Logger;

import ar.edu.taco.stryker.api.StrykerAPI;
import ar.edu.taco.stryker.api.impl.SimpleStrykerAPI;
import ar.edu.taco.stryker.exceptions.FatalStrykerStageException;

/**
 * Stage to launch the stryker process that will attemp to fix the discovered bug.
 *
 */

public class StrykerInitialStage implements IStrykerStage {


	private static Logger log = Logger.getLogger(StrykerInitialStage.class);

	// The class to be mutated
	private File classToMutate;

	// The class name to be mutated
	private String classNameToMutate;

	// The method to be mutated
	private String methodToMutate;

	// The mutant operators to use
	private HashSet<Mutant> mutOps;

	// The amount of generations wanted
	private int generationsWanted;

	private String junitFile;
	
	private String configFile;
	
	private Properties overridingProperties;
	
	private int maxMethodsInFile;
	
	public StrykerInitialStage(String junitFile, File classToMutate, String classNameToMutate,
			String methodToMutate, HashSet<Mutant> mutOps, int generationsWanted, String configFile, Properties overridingProperties, int maxMethodsInFile) {
		this.classToMutate = classToMutate;
		this.classNameToMutate = classNameToMutate;
		this.methodToMutate = methodToMutate;
		this.mutOps = mutOps;
		this.generationsWanted = generationsWanted;
		this.configFile = configFile;
		this.junitFile = junitFile;
		this.overridingProperties = overridingProperties;
		this.maxMethodsInFile = maxMethodsInFile;
	}

	@Override
	public void execute() throws FatalStrykerStageException {
		StrykerAPI api = new SimpleStrykerAPI();
		log.info("***** Starting Stryker Controllers *****");
		api.start();
		List<String> result = api.fixBug(junitFile, classToMutate, classNameToMutate, methodToMutate, mutOps, generationsWanted, configFile, overridingProperties, maxMethodsInFile);
		if(result == null || result.isEmpty()) {
			log.warn("****** No fix was found ******");
		} else {
			log.warn(String.format("****** FIX FOUND!!! Look for file %s ******", result));
		}
	}

}
