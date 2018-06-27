package org.framed.iorm.editpolicymodel.validator;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Solver;
import com.microsoft.z3.Status;

import editpolicymodel.AndConstraintRule;
import editpolicymodel.AndFeatureRule;
import editpolicymodel.ConstraintRule;
import editpolicymodel.ContainsType;
import editpolicymodel.FalseConstraintRule;
import editpolicymodel.FalseFeatureRule;
import editpolicymodel.FeatureRule;
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

public class LogicSolver<T> {	
	protected Context ctx;
	protected BoolExpr expression;

	public LogicSolver(Context ctx) {
    	this.ctx = ctx;
	}
	
	public void parseRule(T rule) {
		this.expression = this.dispatchRule(rule);
	}
	
	public void isSatisfiable() {
			Solver solver = this.ctx.mkSolver();
	        solver.add(this.expression);
	        Status status = solver.check();
            System.out.println("STATUS Check: " + status);

	        if (status != Status.SATISFIABLE) {
	            System.out.println("NO  SAT!");
	            throw new RuntimeException("not satisfiable!");
	        } else {
	            System.out.println("Satisfiable!");
	        }
	}
	
	public BoolExpr getExpression() {
		return this.expression;
	}
	
	public String getStringForRuleAndArg(Object o, Object a) {
			String key = o.getClass().getName();
			String arg = a != null ? a.toString() : null;
			return key + arg;
	}
		 
	protected BoolExpr dispatchRule(T rule) {
		try {
			if (rule instanceof AndConstraintRule|| rule instanceof AndFeatureRule) {
				return this.addAnd(rule);
			}
			if (rule instanceof OrConstraintRule || rule instanceof OrFeatureRule) {
				return this.addOr(rule);
			}
			if (rule instanceof IsFeature) {
				return ctx.mkBoolConst(this.getStringForRuleAndArg(rule, ((IsFeature)rule).getFeatureName()));
			}
			if (rule instanceof NotConstraintRule || rule instanceof NotFeatureRule)
				return addNot(rule);

			if (rule instanceof InType) {
				return ctx.mkBoolConst(this.getStringForRuleAndArg(rule, ((TypeArgumentRule)rule).getType().getLiteral()));
			}

			if (rule instanceof IsSourceType) {
				return ctx.mkBoolConst(this.getStringForRuleAndArg(rule, ((TypeArgumentRule)rule).getType().getLiteral()));
			}

			if (rule instanceof SourceEqualsTargetType) {
				return ctx.mkBoolConst(this.getStringForRuleAndArg(rule, null));
			}

			if (rule instanceof SourceEqualsTarget) {
				return ctx.mkBoolConst(this.getStringForRuleAndArg(rule, null));
			}

			if (rule instanceof IsTargetType) {
				return ctx.mkBoolConst(this.getStringForRuleAndArg(rule, ((TypeArgumentRule)rule).getType().getLiteral()));
			}

			if (rule instanceof ContainsType) {
				return ctx.mkBoolConst(this.getStringForRuleAndArg(rule, ((TypeArgumentRule)rule).getType().getLiteral()));
			}
			if (rule instanceof IsTargetConnectionType) {
				return ctx.mkBoolConst(this.getStringForRuleAndArg(rule, ((TypeArgumentRule)rule).getType().getLiteral()));
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
			return null;
		}
		System.out.println("checkRule for " + rule.getClass().toString() + " not implemented");
		System.exit(-1);
		return null;
	}
	
	private BoolExpr addTrue() {
		return this.ctx.mkTrue();
	}
	
	private BoolExpr addFalse() {
		return this.ctx.mkFalse();
	}
	
	@SuppressWarnings("unchecked")
	protected BoolExpr addAnd(T rule) {
		if(rule instanceof AndConstraintRule) {
			AndConstraintRule aR = (AndConstraintRule) rule;
			BoolExpr[] exprs = new BoolExpr[aR.getRules().size()];
			int i = 0;
			for (ConstraintRule r : aR.getRules()) {
				exprs[i++] = this.dispatchRule((T) r);
			}
			return this.ctx.mkAnd((BoolExpr[])exprs);
		}
		if(rule instanceof AndFeatureRule) {
			AndFeatureRule aR = (AndFeatureRule) rule;
			BoolExpr[] exprs = new BoolExpr[aR.getRules().size()];
			int i = 0;
			for (FeatureRule r : aR.getRules()) {
				exprs[i++] = this.dispatchRule((T) r);
			}
			return this.ctx.mkAnd((BoolExpr[])exprs);
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	protected BoolExpr addOr(T rule) {
		if(rule instanceof OrConstraintRule) {
			OrConstraintRule aR = (OrConstraintRule) rule;
			BoolExpr[] exprs = new BoolExpr[aR.getRules().size()];
			int i = 0;
			for (ConstraintRule r : aR.getRules()) {
				exprs[i++] = this.dispatchRule((T) r);
			}
			return this.ctx.mkOr((BoolExpr[])exprs);
		}
		if(rule instanceof OrFeatureRule) {
			OrFeatureRule aR = (OrFeatureRule) rule;
			BoolExpr[] exprs = new BoolExpr[aR.getRules().size()];
			int i = 0;
			for (FeatureRule r : aR.getRules()) {
				exprs[i++] = this.dispatchRule((T) r);
			}
			return this.ctx.mkOr((BoolExpr[])exprs);
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	protected BoolExpr addNot(T rule) {
		if(rule instanceof NotConstraintRule) {
			NotConstraintRule aR = (NotConstraintRule) rule;
			return this.ctx.mkNot((BoolExpr)this.dispatchRule((T)aR.getRule()));
		}
		if(rule instanceof NotFeatureRule) {
			NotFeatureRule aR = (NotFeatureRule) rule;
			return this.ctx.mkNot((BoolExpr)this.dispatchRule((T)aR.getRule()));
		}
		return null;
	}

}
