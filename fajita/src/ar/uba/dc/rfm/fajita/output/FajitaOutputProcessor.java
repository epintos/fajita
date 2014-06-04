package ar.uba.dc.rfm.fajita.output;

import java.util.HashMap;
import java.util.Map;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import ar.uba.dc.rfm.fajita.FajitaConfiguration;


/**
 * This class takes care of processing fajita's output in order to determine
 * the coverage achieved. The output will depend in the counter-examples found
 * by AlloyCLI and the chosen coverage criteria.<br/><br/>
 * 
 * This is an abstract class that acts as a factory of the different classes that
 * actually processes information for a given configuration.
 * 
 * @see GoalOutputProcessor
 * 
 */
public abstract class FajitaOutputProcessor {
	
	/** Runtime configuration. */
	protected final FajitaConfiguration configuration;
	
	
	/**
	 * This function acts as a factory method that returns the right
	 * <code>FajitaOutputProcessor</code> for the given configuration.
	 * 
	 * @param configuration a <code>FajitaConfiguration</code> with the state
	 *	of fajita and the necessary data recover the results.
	 *
	 * @return an implementation of <code>FajitaOutputProcessor</code> with the
	 *	right output processor for the given configuration.
	 *
	 */
	public static FajitaOutputProcessor newProcessor(FajitaConfiguration configuration) {
		FajitaOutputProcessor processor = null;
		switch (configuration.getCoverageCriteria()) {
			case GOAL_COVERAGE: processor = new GoalOutputProcessor(configuration); break;
			case CLASS_COVERAGE: processor = new ClassOutputProcessor(configuration); break;
			case MCC: processor = new AllUsesOutputProcessor(configuration); break;
			case ALL_DEF_USES: processor = new AllUsesOutputProcessor(configuration); break;
			case BRANCH_COVERAGE: processor = new BranchOutputProcessor(configuration); break;
			case DUAL_CLASS_BRANCH_COVERAGE: processor = new DualClassBranchOutputPorcessor(configuration); break;
		}
		return processor;
	}
	
	
	public FajitaOutputProcessor(FajitaConfiguration configuration) {
		this.configuration = configuration;
	}
	
	
	/** Subclass responsibility of actually printing the coverage results. */
	public abstract void getCoverage();
	
	
	/**
	 * This private class captures the information related to goals while
	 * parsing the xml file with AlloyCLI's output.
	 */
	public static class GoalHandler extends DefaultHandler {
		
		public Map<String,Boolean> bq_coverage = new HashMap<String,Boolean>();
		boolean visiting_field = false;
		boolean visiting_tuple = false;
		String current_BQ = null;

		public void startElement(
				String uri, String localName, String qName, Attributes attributes)
				throws SAXException
		{
 			if ((qName.equalsIgnoreCase("field") &&
 				(attributes.getValue("label").startsWith("BQ__"))))
 			{
 				current_BQ = attributes.getValue("label");
 				visiting_field = true;
 			}
 			else if (visiting_field && qName.equalsIgnoreCase("tuple"))
 			{
 				visiting_tuple = true;
 			}
 			else if (visiting_field && visiting_tuple &&
 				qName.equalsIgnoreCase("atom"))
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
