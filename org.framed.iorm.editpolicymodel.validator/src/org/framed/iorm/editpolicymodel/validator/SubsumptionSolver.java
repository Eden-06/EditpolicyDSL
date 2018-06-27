package org.framed.iorm.editpolicymodel.validator;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Solver;
import com.microsoft.z3.Status;

import editpolicymodel.ConstraintRule;
import editpolicymodel.FeatureRule;
import editpolicymodel.Policy;


public class SubsumptionSolver {
	Context ctx;
	
	public SubsumptionSolver() {
		this.ctx = new Context();
	}

	Map<String, List<Entry<FeatureRule, ConstraintRule>>> policies = new HashMap<>();
	void addPolicy(Policy p) {
		String policyName = EditpolicyValidator.getNameForPolicy(p);
		if(!this.policies.containsKey(policyName)) {
			this.policies.put(policyName, new LinkedList<>());
		}
		List<Entry<FeatureRule, ConstraintRule>> list = this.policies.get(policyName);
		list.add(new SimpleEntry<FeatureRule, ConstraintRule>(p.getFeatureRule(), p.getConstraintRule()));
	}
	
	public void checkForSubsumtions() {
		for(String action: this.policies.keySet()) {
			List<Entry<FeatureRule, ConstraintRule>> list = this.policies.get(action);
			for (Entry<FeatureRule, ConstraintRule> entry1: list) {
				LogicSolver<FeatureRule> f1 = new LogicSolver<>(this.ctx);
				LogicSolver<ConstraintRule> c1 = new LogicSolver<>(this.ctx);
				f1.parseRule(entry1.getKey());
				c1.parseRule(entry1.getValue());

				for (Entry<FeatureRule, ConstraintRule> entry2: list) {
					if(entry1.equals(entry2)) continue;
					LogicSolver<FeatureRule> f2 = new LogicSolver<>(this.ctx);
					f2.parseRule(entry2.getKey());

					if(this.checkSubsumption(f1.getExpression(), f2.getExpression())) {
						LogicSolver<ConstraintRule> c2 = new LogicSolver<>(this.ctx);
						c2.parseRule(entry2.getValue());
						if(this.checkSubsumption(c1.getExpression(), c2.getExpression())) {
							System.out.println("WARNING: Subsumed policy " + action + " f1: " + f1.getExpression() + ", f2: " + f2.getExpression());
						}
					}
				}
			}
		}
	}
	
	/**
	 * if SAT(!(e1 => e2)) then e1 is obsolete
	 * @param e1
	 * @param e2
	 * @return
	 */
	private boolean checkSubsumption(BoolExpr e1, BoolExpr e2) {
		Solver solver = this.ctx.mkSolver();		
		BoolExpr implies = this.ctx.mkImplies(e1, e2);
		solver.add(this.ctx.mkNot(implies)); //check negation for SAT to see if it is tautology
		Status status = solver.check();
		//System.out.println("check: " + checkExpr.toString());
		//System.out.println("checking: " + status + ", e1: " + e1.toString() + ", e2: " + e2.toString());
		return status == Status.UNSATISFIABLE;
	}
}

