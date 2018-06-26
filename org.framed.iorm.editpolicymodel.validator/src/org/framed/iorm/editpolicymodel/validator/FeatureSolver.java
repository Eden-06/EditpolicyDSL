package org.framed.iorm.editpolicymodel.validator;

import org.sat4j.core.VecInt;
import org.sat4j.specs.ContradictionException;

import editpolicymodel.AndFeatureRule;
import editpolicymodel.FeatureRule;
import editpolicymodel.NotFeatureRule;
import editpolicymodel.OrFeatureRule;

public class FeatureSolver extends AbstractLogicSolver<FeatureRule> {

	protected int addAnd(FeatureRule rule) throws ContradictionException {
		AndFeatureRule aR = (AndFeatureRule) rule;
		int[] ints = new int[aR.getRules().size()];
		int i = 0;
		for (FeatureRule r : aR.getRules()) {
			ints[i++] = this.dispatchRule(r);
		}
		this.solver.and(this.literals.getNextInt(), new VecInt(ints));
		return this.literals.getCrrntInt();
	}

	protected int addOr(FeatureRule rule) throws ContradictionException {
		OrFeatureRule aR = (OrFeatureRule) rule;
		int[] ints = new int[aR.getRules().size()];
		int i = 0;
		for (FeatureRule r : aR.getRules()) {
			ints[i++] = this.dispatchRule(r);
		}
		this.solver.or(this.literals.getNextInt(), new VecInt(ints));
		return this.literals.getCrrntInt();
	}
	
	protected int addNot(FeatureRule rule) throws ContradictionException {
		NotFeatureRule aR = (NotFeatureRule) rule;
		this.solver.not(this.literals.getNextInt(), this.dispatchRule(aR.getRule()));
		return this.literals.getCrrntInt();
	}

}

