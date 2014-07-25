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
 * for the branch coverage criteria.
 * 
 * @see FajitaOutputProcessor
 * 
 */
public class AllUsesOutputProcessor extends FajitaOutputProcessor {

	
	/**
	 * Constructor for a <code>BranchOutputProcessor</code>.
	 * 
	 * @param configuration a <code>FajitaConfiguration</code> with enough
	 *	data to check which branches were covered.
	 *
	 */
	public AllUsesOutputProcessor(FajitaConfiguration configuration) {
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
			
			GoalHandler handler = new GoalHandler();
			for (int i = 0; i < list.length; i++)
				saxParser.parse(xmlDir + list[i], (DefaultHandler)handler);
			
			if (!handler.bq_coverage.isEmpty()) {
				for (String goal : handler.bq_coverage.keySet()) {
					Integer goalIndex = Integer.parseInt(goal.replace("BQ__", "").trim());
					if (handler.bq_coverage.get(goal))
						configuration.getCoveredGoals().add(goalIndex);
				}
				float coverage = 100 * configuration.getCoveredGoals().size() / configuration.getDiscoveredGoals();
				System.out.println("Covered branches: " + coverage + "%" +
					" (branches/total: " + configuration.getCoveredGoals().size() + " / " + configuration.getDiscoveredGoals() + ")");
				System.out.println(configuration.getCoveredGoals());
			}
		} catch (Exception e) {
			throw new FajitaException(e.getMessage(), e);
		}
		configuration.setAllUsesUnrollCount(configuration.getAllUsesUnrollCount() + 1);
	}
	
}
