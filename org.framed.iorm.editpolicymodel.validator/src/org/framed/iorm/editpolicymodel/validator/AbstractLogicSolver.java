package org.framed.iorm.editpolicymodel.validator;
import java.util.HashMap;
import java.util.Map;

import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.TimeoutException;
import org.sat4j.tools.GateTranslator;

import editpolicymodel.AndConstraintRule;
import editpolicymodel.AndFeatureRule;
import editpolicymodel.ContainsType;
import editpolicymodel.FalseConstraintRule;
import editpolicymodel.FalseFeatureRule;
import editpolicymodel.InType;
import editpolicymodel.IsFeature;
import editpolicymodel.IsSourceType;
import editpolicymodel.IsTargetConnectionType;
import editpolicymodel.IsTargetType;
import editpolicymodel.NotConstraintRule;
import editpolicymodel.NotFeatureRule;
import editpolicymodel.OrConstraintRule;
import editpolicymodel.OrFeatureRule;
import editpolicymodel.SourceEqualsTarget;
import editpolicymodel.SourceEqualsTargetType;
import editpolicymodel.TrueConstraintRule;
import editpolicymodel.TrueFeatureRule;
import editpolicymodel.TypeArgumentRule;

public abstract class AbstractLogicSolver<T> {
	public class LiteralGenerator {
		
		Map<String, Map<String, Integer>> literals = new HashMap<>();
		
		int crrntInt = 0;
		
		public int getNextInt() {
			return ++crrntInt;
		}
		
		public int getCrrntInt() {
			return crrntInt;
		}
		
		public int getLiteralForRuleAndArg(Object o, Object a) {
			String key = o.getClass().getName();
			String arg = a != null ? a.toString() : null;
			//System.out.println("object: " + key + ", arg: " + arg);
			if(!literals.containsKey(key)) {
				literals.put(key, new HashMap<>());
			}
			Map<String, Integer> map = literals.get(key);
			if(!map.containsKey(arg)) {
				map.put(arg, this.getNextInt());
			} 
			return map.get(arg);
		}
		
		//add constraint, that for some rules, like InType it can only be true for One ARG
	}
	
	protected GateTranslator solver = new GateTranslator(SolverFactory.newDefault());
	protected LiteralGenerator literals = new LiteralGenerator();

	abstract protected int addAnd(T rule) throws ContradictionException;
	abstract protected int addOr(T rule) throws ContradictionException;
	abstract protected int addNot(T rule) throws ContradictionException;

	public void parseRule(T rule) {
		this.dispatchRule(rule);
	}
	
	public void solve() {
		this.solver.setVerbose(true);
		this.solver.toString();
		try {
			if(this.solver.isSatisfiable()) {
				System.out.println("Is isSatisfiable!");
			} else {
				System.out.println("NOT Satisfiable!!");
			}
		} catch (TimeoutException e) {
			System.out.println("error during solve");
			e.printStackTrace();
		}
	}
	protected int dispatchRule(T rule) {
		try {
			if (rule instanceof AndConstraintRule|| rule instanceof AndFeatureRule) {
				return this.addAnd(rule);
			}
			if (rule instanceof OrConstraintRule || rule instanceof OrFeatureRule) {
				return this.addOr(rule);
			}
			if (rule instanceof IsFeature) {
				return this.literals.getLiteralForRuleAndArg(rule, ((IsFeature)rule).getFeatureName());
			}
			if (rule instanceof NotConstraintRule || rule instanceof NotFeatureRule)
				return addNot(rule);

			if (rule instanceof InType) {
				return this.literals.getLiteralForRuleAndArg(rule, ((TypeArgumentRule)rule).getType().getLiteral());
			}

			if (rule instanceof IsSourceType) {
				return this.literals.getLiteralForRuleAndArg(rule, ((TypeArgumentRule)rule).getType().getLiteral());
			}

			if (rule instanceof SourceEqualsTargetType) {
				return this.literals.getLiteralForRuleAndArg(rule, null);
			}

			if (rule instanceof SourceEqualsTarget) {
				return this.literals.getLiteralForRuleAndArg(rule, null);
			}

			if (rule instanceof IsTargetType) {
				return this.literals.getLiteralForRuleAndArg(rule, ((TypeArgumentRule)rule).getType().getLiteral());
			}

			if (rule instanceof ContainsType) {
				return this.literals.getLiteralForRuleAndArg(rule, ((TypeArgumentRule)rule).getType().getLiteral());
			}
			if (rule instanceof IsTargetConnectionType) {
				return this.literals.getLiteralForRuleAndArg(rule, ((TypeArgumentRule)rule).getType().getLiteral());
			}

			if (rule instanceof TrueConstraintRule || rule instanceof TrueFeatureRule) {
				return addTrue();
			}

			if (rule instanceof FalseConstraintRule || rule instanceof FalseFeatureRule) {
				return addFalse();
			}
		} catch (Exception e) {
			System.out.println("error during dispatch");
			e.printStackTrace();
			return 0;
		}
		System.out.println("checkRule for " + rule.getClass().toString() + " not implemented");
		System.exit(-1);
		return 0;
	}
	
	private int addTrue() throws ContradictionException {
		this.solver.gateTrue(this.literals.getNextInt());
		return this.literals.getCrrntInt();
	}
	
	private int addFalse() throws ContradictionException {
		this.solver.gateFalse(this.literals.getNextInt());
		return this.literals.getCrrntInt();
	}

}
