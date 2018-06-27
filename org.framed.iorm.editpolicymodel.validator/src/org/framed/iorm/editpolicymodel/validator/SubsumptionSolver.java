package org.framed.iorm.editpolicymodel.validator;

import java.io.PrintWriter;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Solver;

import editpolicymodel.ConstraintRule;
import editpolicymodel.FeatureRule;
import editpolicymodel.Policy;


public class SubsumptionSolver {
	Context ctx;
	
	public SubsumptionSolver() {
		this.ctx = new Context();
	}
	//Map action with features and constrains
	Map<String, List<Entry<FeatureRule, ConstraintRule>>> policies = new HashMap<>();
	void addPolicy(Policy p) {
		String type = null;
		if(p.getActionType() != null) {
			type = p.getActionType().getName();
		} 
		if(!this.policies.containsKey(p.getAction().getName() + type)) {
			this.policies.put(p.getAction().getName() + type, new LinkedList<>());
		}
		List<Entry<FeatureRule, ConstraintRule>> list = this.policies.get(p.getAction().getName() + type);
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

				//ConstraintRule c1 = entry1.getValue();
				for (Entry<FeatureRule, ConstraintRule> entry2: list) {
					if(entry1.equals(entry2)) continue;
					LogicSolver<FeatureRule> f2 = new LogicSolver<>(this.ctx);
					f2.parseRule(entry2.getKey());
					
					if(this.checkSubsumption(f1.getExpression(), f2.getExpression())) {
						LogicSolver<ConstraintRule> c2 = new LogicSolver<>(this.ctx);
						c2.parseRule(entry2.getValue());
						if(this.checkSubsumption(c1.getExpression(), c2.getExpression())) {
							System.out.println("Action " + action + ", Subsumption between rules");
						}
					}
				}
			}
		}
	}
	
	private boolean checkSubsumption(BoolExpr e1, BoolExpr e2) {
		Solver solver = this.ctx.mkSolver();
		BoolExpr e3 = this.ctx.mkIff(e1, e2);
		solver.add(e3);
		System.out.println("checking: " + solver.check());
		return false;
	}
	
}

