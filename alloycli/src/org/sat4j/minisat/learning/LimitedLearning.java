/*******************************************************************************
* SAT4J: a SATisfiability library for Java Copyright (C) 2004-2008 Daniel Le Berre
*
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Alternatively, the contents of this file may be used under the terms of
* either the GNU Lesser General Public License Version 2.1 or later (the
* "LGPL"), in which case the provisions of the LGPL are applicable instead
* of those above. If you wish to allow use of your version of this file only
* under the terms of the LGPL, and not to allow others to use your version of
* this file under the terms of the EPL, indicate your decision by deleting
* the provisions above and replace them with the notice and other provisions
* required by the LGPL. If you do not delete the provisions above, a recipient
* may use your version of this file under the terms of the EPL or the LGPL.
* 
* Based on the original MiniSat specification from:
* 
* An extensible SAT solver. Niklas Een and Niklas Sorensson. Proceedings of the
* Sixth International Conference on Theory and Applications of Satisfiability
* Testing, LNCS 2919, pp 502-518, 2003.
*
* See www.minisat.se for the original solver in C++.
* 
*******************************************************************************/
package org.sat4j.minisat.learning;

import org.sat4j.minisat.core.Constr;
import org.sat4j.minisat.core.DataStructureFactory;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.LearningStrategy;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.core.SolverStats;
import org.sat4j.minisat.core.VarActivityListener;

/**
 * Learn only clauses which size is smaller than a percentage of the number of
 * variables.
 * 
 * @author leberre
 */
public abstract class LimitedLearning<L extends ILits,D extends DataStructureFactory<L>> implements LearningStrategy<L,D> {

    private static final long serialVersionUID = 1L;

    private final NoLearningButHeuristics<L,D> none;

    private final MiniSATLearning<L,D> all;

    protected L lits;
    
    private SolverStats stats;

    public LimitedLearning() {
        none = new NoLearningButHeuristics<L,D>();
        all = new MiniSATLearning<L,D>();
    }

    public void setSolver(Solver<L,D> s) {
        this.lits = s.getVocabulary();
        setVarActivityListener(s);
        all.setDataStructureFactory(s.getDSFactory());
        stats = s.getStats();
    }

    public void learns(Constr constr) {
        if (learningCondition(constr)) {
            all.learns(constr);
        } else {
            none.learns(constr);
            stats.ignoredclauses++;
        }
    }

    abstract protected boolean learningCondition(Constr constr);
    
    public void init() {
        all.init();
        none.init();
    }

    public void setVarActivityListener(VarActivityListener s) {
        none.setVarActivityListener(s);
        all.setVarActivityListener(s);
    }
}
