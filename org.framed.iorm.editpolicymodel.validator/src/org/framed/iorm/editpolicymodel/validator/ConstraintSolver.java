package org.framed.iorm.editpolicymodel.validator;

import org.sat4j.core.VecInt;
import org.sat4j.specs.ContradictionException;

import editpolicymodel.AndConstraintRule;
import editpolicymodel.ConstraintRule;
import editpolicymodel.NotConstraintRule;
import editpolicymodel.OrConstraintRule;

public class ConstraintSolver extends AbstractLogicSolver<ConstraintRule> {

	protected int addAnd(ConstraintRule rule) throws ContradictionException {
		AndConstraintRule aR = (AndConstraintRule) rule;
		int[] ints = new int[aR.getRules().size()];
		int i = 0;
		for (ConstraintRule r : aR.getRules()) {
			ints[i++] = this.dispatchRule(r);
		}
		this.solver.and(this.literals.getNextInt(), new VecInt(ints));
		return this.literals.getCrrntInt();
	}

	protected int addOr(ConstraintRule rule) throws ContradictionException {
		OrConstraintRule aR = (OrConstraintRule) rule;
		int[] ints = new int[aR.getRules().size()];
		int i = 0;
		for (ConstraintRule r : aR.getRules()) {
			ints[i++] = this.dispatchRule(r);
		}
		this.solver.or(this.literals.getNextInt(), new VecInt(ints));
		return this.literals.getCrrntInt();
	}
	
	protected int addNot(ConstraintRule rule) throws ContradictionException {
		NotConstraintRule aR = (NotConstraintRule) rule;
		this.solver.not(this.literals.getNextInt(), this.dispatchRule(aR.getRule()));
		return this.literals.getCrrntInt();
	}

}

