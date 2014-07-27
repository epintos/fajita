package ar.uba.dc.rfm.fajita.output;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import ar.uba.dc.rfm.fajita.FajitaConfiguration;

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
        System.out.println("Covered paths: " + configuration.getDiscoveredPaths());
    }

}
