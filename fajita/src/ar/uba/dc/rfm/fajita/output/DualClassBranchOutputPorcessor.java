package ar.uba.dc.rfm.fajita.output;

import static ar.uba.dc.rfm.tools.FileSystemTools.separator;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import ar.uba.dc.rfm.fajita.FajitaConfiguration;
import ar.uba.dc.rfm.fajita.FajitaException;
import ar.uba.dc.rfm.fajita.translation.DualClassBranchTransformation;


/**
 * This class holds the logic for processing the results after executing Fajita
 * for the dual class branch coverage criteria.
 * 
 * @see FajitaOutputProcessor
 * 
 */
public class DualClassBranchOutputPorcessor extends FajitaOutputProcessor {
	
	
	/**
	 * Constructor for a <code>DualClassBranchOutputPorcessor</code>.
	 * 
	 * @param configuration a <code>FajitaConfiguration</code> with enough
	 *	data to check which branches and partitions were covered.
	 *
	 */
	public DualClassBranchOutputPorcessor(FajitaConfiguration configuration) {
		super(configuration);
	}
	
	
	/**
	 * This method fulfills the responsibility inherited from the
	 * <code>FajitaOutputProcessor</code> and prints into the console the
	 * information about the reached branches and partitions.
	 * 
	 */
	@Override
	public void getCoverage() {
		if (configuration.getDualClassBranchIteration() != 0) {
			new BranchOutputProcessor(configuration).getCoverage();
			
		} else {
		
			try {
				SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();
				String xmlDir = configuration.getTacoOutputDirectory() + separator;
				File dir = new File(xmlDir);
				String[] list = dir.list(new FilenameFilter() {
					public boolean accept(File dir, String name) {
						return name.endsWith(".xml");
					}
				});
				
				BranchHandler handler = new BranchHandler();
				for (int i = 0; i < list.length; i++)
					saxParser.parse(xmlDir + list[i], (DefaultHandler)handler);
				
				if (!handler.bq_coverage.isEmpty()) {
					System.out.println("Covered branches ids: ");
					for (String goal : handler.bq_coverage.keySet()) {
						int tagIndex = goal.indexOf(DualClassBranchTransformation.FAJITA_BRANCH_GOAL_TAG);
						int tagLength = DualClassBranchTransformation.FAJITA_BRANCH_GOAL_TAG.length();
						Integer goalIndex = Integer.parseInt(
							goal.substring(tagIndex + tagLength + 1).replace("_2", "").trim());
						if (handler.bq_coverage.get(goal)) {
							configuration.getCoveredGoals().add(goalIndex);
							System.out.print(goalIndex + ",");
						}
					}
					float coverage = 100 * configuration.getCoveredGoals().size() / configuration.getDualDiscoveredBranches();
					System.out.println("Covered branches: " + coverage + "%" +
						" (branches/total: " + configuration.getCoveredGoals().size() + " / " + configuration.getDualDiscoveredBranches() + ")");
					System.out.println(configuration.getCoveredGoals());
				}
				
				if (configuration.isIncrementalLoopUnroll()) {
					configuration.setObjectScope(FajitaConfiguration.INITIAL_INCREMENTAL_OBJECT_SCOPE);
					configuration.setLoopUnroll(FajitaConfiguration.INITIAL_INCREMENAL_LOOP_UNROLL);
				}
				
			} catch (Exception e) {
				throw new FajitaException(e.getMessage(), e);
			}
		}
		
		configuration.setDualClassBranchIteration(configuration.getDualClassBranchIteration() + 1);
		
	}
	
	
	
	/**
	 * This private class captures the information related to goals while
	 * parsing the xml file with AlloyCLI's output.
	 */
	public static class BranchHandler extends DefaultHandler {
		
		public Map<String,Boolean> bq_coverage = new HashMap<String,Boolean>();
		boolean visiting_field = false;
		boolean visiting_tuple = false;
		String current_BQ = null;

		public void startElement(
				String uri, String localName, String qName, Attributes attributes)
				throws SAXException
		{
 			if (qName.equalsIgnoreCase("field") && attributes.getValue("label").matches(
				".*" + DualClassBranchTransformation.FAJITA_BRANCH_GOAL_TAG + "_[0-9]+_2"))
 			{
 				current_BQ = attributes.getValue("label");
 				visiting_field = true;
 			}
 			else if (visiting_field && qName.equalsIgnoreCase("tuple"))
 			{
 				visiting_tuple = true;
 			}
 			else if (visiting_field && visiting_tuple && qName.equalsIgnoreCase("atom"))
 			{
 				String label_value = attributes.getValue("label");
 				if (label_value.equals("true$0")) {
 					bq_coverage.put(current_BQ, new Boolean(true));
 				} else if (label_value.equals("false$0")) {
 					if (!bq_coverage.containsKey(current_BQ))
 						bq_coverage.put(current_BQ, new Boolean(false));
 				}
 			}
		}
		
		public void endElement(String uri, String localName, String qName)
			throws SAXException
		{
			if (visiting_field && qName.equalsIgnoreCase("field"))
			{
				visiting_field = false;
				current_BQ = null;
			}
			else if (visiting_field && visiting_tuple &&
				qName.equalsIgnoreCase("tuple"))
			{
				visiting_tuple = false;
			}
		}

	}
	

}
