package ar.uba.dc.rfm.fajita.output;

import static ar.uba.dc.rfm.tools.FileSystemTools.separator;

import java.io.File;
import java.io.FilenameFilter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.helpers.DefaultHandler;

import ar.uba.dc.rfm.fajita.FajitaConfiguration;
import ar.uba.dc.rfm.fajita.FajitaException;
import ar.uba.dc.rfm.fajita.output.FajitaOutputProcessor.GoalHandler;

/**
 * This class holds the logic for processing the results after executing Fajita
 * for the branch coverage criteria.
 * 
 * @see FajitaOutputProcessor
 * 
 */
public class PathOutputProcessor extends FajitaOutputProcessor {

    /**
     * Constructor for a <code>BranchOutputProcessor</code>.
     * 
     * @param configuration
     *            a <code>FajitaConfiguration</code> with enough data to check
     *            which branches were covered.
     * 
     */
    public PathOutputProcessor(FajitaConfiguration configuration) {
        super(configuration);
    }

    /**
     * This method fulfills the responsibility inherited from the
     * <code>FajitaOutputProcessor</code> and prints into the console the
     * information about the reached branches.
     * 
     */
    @Override
    public void getCoverage() {
        
        try {
            SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();
            String xmlDir = configuration.getTacoOutputDirectory() + separator;
            File dir = new File(xmlDir);
            String[] list = dir.list(new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    return name.endsWith(".xml");
                }
            });
            
            for (String file: list) {
                GoalHandler handler = new GoalHandler();
                saxParser.parse(xmlDir + file, (DefaultHandler)handler);
                List<Integer> path = new ArrayList<>();
                
                if (!handler.bq_coverage.isEmpty()) {
                    for (String goal : handler.bq_coverage.keySet()) {
                        Integer goalIndex = Integer.parseInt(goal.replace("BQ__", "").trim());
                        if (handler.bq_coverage.get(goal)) {
                            path.add(goalIndex);
                        }
                    }
                    Collections.sort(path);
                    if (!containsPath(configuration.getDiscoveredPaths(), path)) {
                        configuration.getDiscoveredPaths().add(path);
                    }
                }
            }
            int coverage = configuration.getDiscoveredPaths().size();
            System.out.println("Covered Paths: " + coverage);
            printAllPaths(configuration.getDiscoveredPaths());
            
        } catch (Exception e) {
            throw new FajitaException(e.getMessage(), e);
        }
    }
    
    private void printAllPaths(List<List<Integer>> discoveredPaths) {
        for (List<Integer> path: discoveredPaths) {
            printPath(path);
        }
    }

    private void printPath(List<Integer> path) {
        for (Integer goal: path) {
            System.out.print(goal + " ");
        }
        System.out.println("");
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
