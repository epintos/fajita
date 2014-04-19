package ar.uba.dc.rfm.fajita.output;

import static ar.uba.dc.rfm.tools.FileSystemTools.separator;

import java.io.File;
import java.io.FilenameFilter;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.helpers.DefaultHandler;

import ar.uba.dc.rfm.fajita.FajitaConfiguration;
import ar.uba.dc.rfm.fajita.FajitaException;


/**
 * This class holds the logic for processing the results after executing Fajita
 * for the goal coverage criteria.
 * 
 * @see FajitaOutputProcessor
 * 
 */
public class GoalOutputProcessor extends FajitaOutputProcessor {

	
	/**
	 * Constructor for a <code>GoalOutputReporter</code>.
	 * 
	 * @param configuration a <code>FajitaConfiguration</code> with enough
	 *	data to check which goals were covered.
	 *
	 */
	public GoalOutputProcessor(FajitaConfiguration configuration) {
		super(configuration);
	}
	
	
	/**
	 * This method fulfills the responsibility inherited from the
	 * <code>FajitaOutputProcessor</code> and prints into the console the
	 * information about the reached goals.
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
			
			GoalHandler handler = new GoalHandler();
			for (int i = 0; i < list.length; i++)
				saxParser.parse(xmlDir + list[i], (DefaultHandler)handler);
			
			if (handler.bq_coverage.isEmpty()) {
				System.out.println("No goals covered.");
				System.exit(-2);
			} else {
				for (String goal : handler.bq_coverage.keySet()) {
					Integer goalIndex = Integer.parseInt(goal.replace("BQ__", "").trim());
					if (handler.bq_coverage.get(goal)) {
						if (configuration.getCoveredGoals().add(goalIndex) &&
							goalIndex < configuration.getDiscoveredGoals())
							System.out.println("Goal " + goalIndex + " : COVERED");
					} else {
						if (!configuration.getCoveredGoals().contains(goalIndex) &&
							goalIndex < configuration.getDiscoveredGoals())
							System.out.println("Goal " + goalIndex + " : NOT COVERED");
					}
				}
			}
		} catch (Exception e) {
			throw new FajitaException(e.getMessage(), e);
		}
	}
	
}
