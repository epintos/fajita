package rfm.alloy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import kodkod.ast.Relation;
import kodkod.engine.Solution;
import kodkod.engine.fol2sat.Translation;
import kodkod.engine.satlab.SATSolver;
import kodkod.instance.Tuple;
import kodkod.instance.TupleSet;
import kodkod.util.ints.IntIterator;
import kodkod.util.ints.IntSet;

public class CoverageClauseAdder {

    enum SolutionCoverage {
        CLASS_COVERAGE, GOAL_COVERAGE
    }

    public static SolutionCoverage solution_coverage = SolutionCoverage.CLASS_COVERAGE;

    private ClauseBuilder clause_builder;
    private int sol_counter = 0;

    public CoverageClauseAdder() {
        switch (solution_coverage) {
        case CLASS_COVERAGE: {
            this.clause_builder = new ClassCoverageClauseBuilder();
        }
            break;
        case GOAL_COVERAGE: {
            this.clause_builder = new GoalCoverageClauseBuilder();
        }
            break;
        default: {
            this.clause_builder = null;
        }
            break;
        }
    }

    private Set<Integer> boolean_query_primary_variables = new HashSet<Integer>();
    private Map<String, Integer> bqVariablesToPrimaryVariables = new HashMap<String, Integer>();

    private String nameBQ(String completeBQ) {
        return completeBQ.substring(completeBQ.indexOf("BQ__"), completeBQ.length());
    }

    private Integer idBQ(String completeBQ) {
        return Integer.parseInt(completeBQ.substring(completeBQ.indexOf("BQ__") + "BQ__".length(), completeBQ.length()));
    }

    /**
     * If {pi...} are primary variables for each boolean query (i.e. BQ__i),
     * this method returns a vector such that
     * 
     * @return a Vector<Integer> such that each primary variable
     * 
     */
    private Map<Integer, Boolean> create_boolean_query_valuation(Translation translation, final SATSolver sat_solver, Solution solution) {

        Map<Integer, Boolean> bq_valuation = new HashMap<Integer, Boolean>();
        Iterator<Relation> rel_iterator = Relation.booleanQueries();
        while (rel_iterator.hasNext()) {
            Relation boolean_query_relation = rel_iterator.next();

            if (CLI.loopExhaustionId != null && idBQ(boolean_query_relation.name()) >= CLI.loopExhaustionId)
                continue;

            TupleSet tupleSet = solution.instance().tuples(boolean_query_relation);

            assert tupleSet.size() == 1;

            Tuple tuple = tupleSet.iterator().next();

            assert tuple.toString().equals("[true$0]") || tuple.toString().equals("[false$0]");

            boolean boolean_query_evaluation;
            if (tuple.toString().equals("[true$0]")) {
                boolean_query_evaluation = true;
            } else if (tuple.toString().equals("[false$0]")) {
                boolean_query_evaluation = false;
            } else {
                throw new IllegalArgumentException();
            }

            IntSet boolean_query_primary_vars = translation.primaryVariables(boolean_query_relation);

            assert boolean_query_primary_vars != null;
            assert boolean_query_primary_vars.size() == 2;

            IntIterator it = boolean_query_primary_vars.iterator();
            int primary_var_0 = it.next();
            int primary_var_1 = it.next();

            boolean primary_var_0_value = sat_solver.valueOf(primary_var_0);
            boolean primary_var_1_value = sat_solver.valueOf(primary_var_1);

            assert (primary_var_0_value == false && primary_var_1_value == true)
                    || (primary_var_0_value == true && primary_var_1_value == false);

            int primary_var = primary_var_0_value ? primary_var_0 : primary_var_1;
            boolean_query_primary_variables.add(primary_var_0);
            bq_valuation.put(primary_var_0, primary_var_0_value);
            bqVariablesToPrimaryVariables.put(nameBQ(boolean_query_relation.name()), primary_var);

        }
        return bq_valuation;
    }

    private static void print(Translation translation) {
        for (Iterator<Relation> rel_iterator = Relation.booleanQueries(); rel_iterator.hasNext();) {
            Relation boolean_query = (Relation) rel_iterator.next();

            IntSet boolean_query_primary_vars = translation.primaryVariables(boolean_query);

            System.out.println("BQ : " + boolean_query.toString() + "->" + boolean_query_primary_vars.toString());
        }
    }

    public void addCoverageClause(Translation translation, final SATSolver sat_solver, Solution solution) {
        CLI.solutionObtained();

        if (sol_counter == 0) {
            CoverageClauseAdder.print(translation);
        }

        sol_counter++;

        Map<Integer, Boolean> bq_valuation = create_boolean_query_valuation(translation, sat_solver, solution);
        
        if (translation.existsVariableWithName("terminatesInTime")) {
            Iterator<Relation> rel_iterator = Relation.booleanQueries();

            List<Integer> clause = new ArrayList<>();
            while (rel_iterator.hasNext()) {
                Relation boolean_query = (Relation) rel_iterator.next();

                IntSet boolean_query_primary_vars = translation.primaryVariables(boolean_query);

                int varnum = boolean_query_primary_vars.min();
                boolean value = bq_valuation.get(varnum);
                if (value == true) {
                    clause.add(-varnum);
                }
            }
            sat_solver.addClause(buildIntArray(clause));
        } else {

            if (!bq_valuation.isEmpty()) {
    
                String s = String.format("BQ : class # %s : %s", sol_counter, bq_valuation.toString());
    
                System.out.println(s);
    
                int[] bq_valuation_clause = clause_builder.create_clause(bq_valuation);
    
                if (bq_valuation_clause.length == 0) {
                    sat_solver.addClause(new int[] { 1 });
                    sat_solver.addClause(new int[] { -1 });
                } else {
                    sat_solver.addClause(bq_valuation_clause);
                }
            }
        }

    }

    private int[] buildIntArray(List<Integer> list) {
        int[] ret = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }

    private abstract class ClauseBuilder {
        public abstract int[] create_clause(Map<Integer, Boolean> valuation);
    }

    private class ClassCoverageClauseBuilder extends ClauseBuilder {

        public int[] create_clause(Map<Integer, Boolean> valuation) {
            int[] bq_valuation_clause = new int[valuation.size()];
            int i = 0;
            for (int primary_variable : valuation.keySet()) {
                boolean primary_variable_valuation = valuation.get(primary_variable);
                if (primary_variable_valuation == true) {
                    int negation_literal = -primary_variable;
                    bq_valuation_clause[i] = negation_literal;
                } else {
                    assert (primary_variable_valuation == false);
                    int positive_literal = primary_variable;
                    bq_valuation_clause[i] = positive_literal;
                }
                i++;
            }
            return bq_valuation_clause;
        }
    }

    private class GoalCoverageClauseBuilder extends ClauseBuilder {

        private Set<Integer> covered_primary_vars = new HashSet<Integer>();

        public int[] create_clause(Map<Integer, Boolean> valuation) {

            for (int primary_variable : valuation.keySet()) {
                if (valuation.get(primary_variable) == true) {
                    covered_primary_vars.add(primary_variable);
                }
            }

            Vector<Integer> cnf_clause = new Vector<Integer>();
            for (Integer primary_variable : boolean_query_primary_variables) {
                if (!covered_primary_vars.contains(primary_variable)) {
                    cnf_clause.add(primary_variable);
                }
            }

            int[] result = toIntArray(cnf_clause);
            return result;
        }

        private int[] toIntArray(Vector<Integer> cnf_clause) {
            int[] result = new int[cnf_clause.size()];
            for (int j = 0; j < cnf_clause.size(); j++) {
                result[j] = cnf_clause.get(j).intValue();
            }
            return result;
        }
    }

    // END ADDITION

}
