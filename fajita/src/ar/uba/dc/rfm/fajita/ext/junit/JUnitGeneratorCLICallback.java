package ar.uba.dc.rfm.fajita.ext.junit;

import static ar.uba.dc.rfm.tools.FileSystemTools.separator;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.helpers.DefaultHandler;

import rfm.alloy.CoverageClauseCallback;
import ar.edu.taco.TacoAnalysisResult;
import ar.edu.taco.engine.SnapshotStage;
import ar.edu.taco.jml.parser.JmlParser;
import ar.edu.taco.junit.UnitTestBuilder;
import ar.uba.dc.rfm.dynalloy.analyzer.AlloyAnalysisResult;
import ar.uba.dc.rfm.fajita.FajitaConfiguration;
import ar.uba.dc.rfm.fajita.FajitaConfiguration.CoverageCriteria;
import ar.uba.dc.rfm.fajita.FajitaException;
import ar.uba.dc.rfm.fajita.output.FajitaOutputProcessor.GoalHandler;
import edu.mit.csail.sdg.alloy4compiler.ast.Command;
import edu.mit.csail.sdg.alloy4compiler.ast.Module;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;

/**
 * This class implements the <code>CoverageClauseCallback</code> interface which
 * provides a mechanism to capture the event of a new solution being generated
 * by AlloyCli.<br />
 * <br />
 * 
 * For each counter example found this class creates a JUnit test method that
 * can show how the coverage criteria is met.
 * 
 */
public class JUnitGeneratorCLICallback implements CoverageClauseCallback {

    /** Fajita runtime configuration. */
    private final FajitaConfiguration configuration;

    /**
     * Constructor for a <code>JUnitGeneratorCLICallback</code>.
     * 
     * @param configuration
     *            a <code>FajitaConfiguration</code> with the necessary data to
     *            create unit test. <br />
     * <br />
     *            <b>Note:</b> This class uses AlloyCli and Taco, so
     *            short-circuited logic is not recommended.
     * 
     */
    public JUnitGeneratorCLICallback(FajitaConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * This method implements the <code>CoverageClauseCallback</code> interface
     * if this object is set to the coverageClauseCallback attribute in
     * AlloyCLI's CLI class, this method will be ivoked for each solution found. <br />
     * <br />
     * A junit test method will be generated for each conunter-example.
     * 
     * @param a4Solution
     *            an alloy solution with the counter-example found.
     * 
     * @param world
     *            the state of the alloy module being used.
     * 
     * @param command
     *            the representation of the command being processed by the
     *            SAT-solving engine.
     * 
     */
    @Override
    public void call(A4Solution a4Solution, Module world, Command command) {

        if (!configuration.getGenerateJUnit() || !newGoalCovered())
            return;

        try {

            ClassLoader cl = ClassLoader.getSystemClassLoader();
            @SuppressWarnings("resource")
            ClassLoader loader = new URLClassLoader(new URL[] { new File(configuration.getCompiledClassToCheckPath()).toURI().toURL() }, cl);

            String classToCheck = configuration.getClassToCheck();
            String[] splitClassToCheck = classToCheck.split("\\.");
            classToCheck = "";
            for (int idx = 0; idx < splitClassToCheck.length - 2; idx++) {
                classToCheck += splitClassToCheck[idx] + ".";
            }
            if (splitClassToCheck.length > 1) {
                classToCheck += splitClassToCheck[splitClassToCheck.length - 2] + "Instrumented.";
            }
            classToCheck += splitClassToCheck[splitClassToCheck.length - 1];

            SnapshotStage snapshotStage = new SnapshotStage(JmlParser.getInstance().getCompilationUnits(), new TacoAnalysisResult(
                    new AlloyAnalysisResult(true, world, command, a4Solution)), classToCheck, configuration.getMethodToCheck() + "_0");
            snapshotStage.setLoader(loader);
            snapshotStage.setNoVerify(true);
            snapshotStage.execute();

            UnitTestBuilder unitTestBuilder = new UnitTestBuilder(snapshotStage.getRecoveredInformation());
            unitTestBuilder.setLoader(loader);
            unitTestBuilder.setOutputPath(configuration.getUserResultPath() + separator);
            unitTestBuilder.setStaticFieldNameFilter(configuration.getGoalTagFilter());
            unitTestBuilder.createUnitTest();

        } catch (Exception e) {
            System.out.println("\nFAJITA: Error while generating unit test.\n" + e.getMessage());
        }

    }

    /** This method indicates whether a new goal was covered or not. */
    public boolean newGoalCovered() {
        if (configuration.getCoverageCriteria() == CoverageCriteria.PATH) {
            return newPathCovered();
        }
        try {

            SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();
            String xmlDir = configuration.getTacoOutputDirectory() + separator;
            File dir = new File(xmlDir);
            String[] list = dir.list(new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    return name.endsWith(".xml");
                }
            });

            GoalHandler handler = new GoalHandler();
            for (int i = 0; i < list.length; i++)
                saxParser.parse(xmlDir + list[i], (DefaultHandler) handler);

            for (String goal : handler.bq_coverage.keySet()) {
                Integer goalIndex = Integer.parseInt(goal.replace("BQ__", "").trim());
                if (handler.bq_coverage.get(goal) && !configuration.getCoveredGoals().contains(goalIndex)) {
                    return true;
                }
            }

        } catch (Exception e) {
            throw new FajitaException(e.getMessage(), e);
        }

        return false;
    }

    private boolean newPathCovered() {
        try {

            SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();
            String xmlDir = configuration.getTacoOutputDirectory() + separator;
            File dir = new File(xmlDir);
            String[] list = dir.list(new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    return name.endsWith(".xml");
                }
            });

            GoalHandler handler = new GoalHandler();
            String file = getLatestSol(list);
            
            List<Integer> path = new ArrayList<>();
            
            saxParser.parse(xmlDir + file, (DefaultHandler) handler);

            for (String goal : handler.bq_coverage.keySet()) {
                Integer goalIndex = Integer.parseInt(goal.replace("BQ__", "").trim());
                if (handler.bq_coverage.get(goal)) {
                    path.add(goalIndex);
                }
            }
            
            Collections.sort(path);
            return !containsPath(configuration.getDiscoveredPaths(), path);
            
        } catch (Exception e) {
            throw new FajitaException(e.getMessage(), e);
        }
    }
    
    private String getLatestSol(String[] listFiles) {
        String[] splitted = listFiles[0].split("\\.");
        String baseName = splitted[0];
        int biggest = 0;
        for (String file: listFiles) {
            String[] split = file.split("\\.");
            int num = Integer.parseInt(split[1].substring(3, split[1].length()));
            biggest = num > biggest ? num : biggest;
        }
        return baseName + "." + "sol" + biggest + ".xml";
    }
    
    private boolean containsPath(List<List<Integer>> allPaths, List<Integer> newPath) {
        for(List<Integer> path: allPaths) {
            if (pathIsTheSame(path, newPath)) {
                return true;
            }
        }
        return false;
    }

    private boolean pathIsTheSame(List<Integer> path, List<Integer> newPath) {
        if (path.size() != newPath.size()) {
            return false;
        }
        for (int i = 0; i < path.size() - 1; i++) {
            if (path.get(i) != newPath.get(i)) {
                return false;
            }
        }
        return true;
    }

}
