/*
 * generated by Xtext 2.13.0
 */
package org.framed.iorm.editpolicydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.framed.iorm.editpolicydsl.ide.contentassist.antlr.internal.InternalDslParser;
import org.framed.iorm.editpolicydsl.services.DslGrammarAccess;

public class DslParser extends AbstractContentAssistParser {

	@Inject
	private DslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalDslParser createParser() {
		InternalDslParser result = new InternalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getConstraintRuleAccess().getAlternatives(), "rule__ConstraintRule__Alternatives");
					put(grammarAccess.getFeatureRuleAccess().getAlternatives(), "rule__FeatureRule__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getNotFeatureExpressionAccess().getAlternatives(), "rule__NotFeatureExpression__Alternatives");
					put(grammarAccess.getPrimaryFeatureAccess().getAlternatives(), "rule__PrimaryFeature__Alternatives");
					put(grammarAccess.getNotConstraintExpressionAccess().getAlternatives(), "rule__NotConstraintExpression__Alternatives");
					put(grammarAccess.getPrimaryConstraintAccess().getAlternatives(), "rule__PrimaryConstraint__Alternatives");
					put(grammarAccess.getActionEnumAccess().getAlternatives(), "rule__ActionEnum__Alternatives");
					put(grammarAccess.getFeatureTypeEnumAccess().getAlternatives(), "rule__FeatureTypeEnum__Alternatives");
					put(grammarAccess.getFeatureNameEnumAccess().getAlternatives(), "rule__FeatureNameEnum__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getPolicyAccess().getGroup(), "rule__Policy__Group__0");
					put(grammarAccess.getContainsCompartmentConstrainRuleAccess().getGroup(), "rule__ContainsCompartmentConstrainRule__Group__0");
					put(grammarAccess.getIsTargetTypeConstraintRuleAccess().getGroup(), "rule__IsTargetTypeConstraintRule__Group__0");
					put(grammarAccess.getIsParentConstraintRuleAccess().getGroup(), "rule__IsParentConstraintRule__Group__0");
					put(grammarAccess.getIsSourceTypeConstraintRuleAccess().getGroup(), "rule__IsSourceTypeConstraintRule__Group__0");
					put(grammarAccess.getIsTargetConstraintRuleAccess().getGroup(), "rule__IsTargetConstraintRule__Group__0");
					put(grammarAccess.getInCompartmentConstraintRuleAccess().getGroup(), "rule__InCompartmentConstraintRule__Group__0");
					put(grammarAccess.getSourceEqualsTargetConstraintRuleAccess().getGroup(), "rule__SourceEqualsTargetConstraintRule__Group__0");
					put(grammarAccess.getSourceEqualsTargetTypeConstraintRuleAccess().getGroup(), "rule__SourceEqualsTargetTypeConstraintRule__Group__0");
					put(grammarAccess.getIsFeatureAccess().getGroup(), "rule__IsFeature__Group__0");
					put(grammarAccess.getTrueFeatureRuleAccess().getGroup(), "rule__TrueFeatureRule__Group__0");
					put(grammarAccess.getTrueConstraintRuleAccess().getGroup(), "rule__TrueConstraintRule__Group__0");
					put(grammarAccess.getFalseFeatureRuleAccess().getGroup(), "rule__FalseFeatureRule__Group__0");
					put(grammarAccess.getFalseConstraintRuleAccess().getGroup(), "rule__FalseConstraintRule__Group__0");
					put(grammarAccess.getImplicationFeatureAccess().getGroup(), "rule__ImplicationFeature__Group__0");
					put(grammarAccess.getImplicationFeatureAccess().getGroup_1(), "rule__ImplicationFeature__Group_1__0");
					put(grammarAccess.getOrFeatureAccess().getGroup(), "rule__OrFeature__Group__0");
					put(grammarAccess.getOrFeatureAccess().getGroup_1(), "rule__OrFeature__Group_1__0");
					put(grammarAccess.getAndFeatureAccess().getGroup(), "rule__AndFeature__Group__0");
					put(grammarAccess.getAndFeatureAccess().getGroup_1(), "rule__AndFeature__Group_1__0");
					put(grammarAccess.getNotFeatureExpressionAccess().getGroup_1(), "rule__NotFeatureExpression__Group_1__0");
					put(grammarAccess.getPrimaryFeatureAccess().getGroup_1(), "rule__PrimaryFeature__Group_1__0");
					put(grammarAccess.getImplicationConstraintAccess().getGroup(), "rule__ImplicationConstraint__Group__0");
					put(grammarAccess.getImplicationConstraintAccess().getGroup_1(), "rule__ImplicationConstraint__Group_1__0");
					put(grammarAccess.getOrConstraintAccess().getGroup(), "rule__OrConstraint__Group__0");
					put(grammarAccess.getOrConstraintAccess().getGroup_1(), "rule__OrConstraint__Group_1__0");
					put(grammarAccess.getAndConstraintAccess().getGroup(), "rule__AndConstraint__Group__0");
					put(grammarAccess.getAndConstraintAccess().getGroup_1(), "rule__AndConstraint__Group_1__0");
					put(grammarAccess.getNotConstraintExpressionAccess().getGroup_1(), "rule__NotConstraintExpression__Group_1__0");
					put(grammarAccess.getPrimaryConstraintAccess().getGroup_1(), "rule__PrimaryConstraint__Group_1__0");
					put(grammarAccess.getModelAccess().getPoliciesAssignment_0(), "rule__Model__PoliciesAssignment_0");
					put(grammarAccess.getModelAccess().getPoliciesAssignment_1(), "rule__Model__PoliciesAssignment_1");
					put(grammarAccess.getPolicyAccess().getOverrideAssignment_0(), "rule__Policy__OverrideAssignment_0");
					put(grammarAccess.getPolicyAccess().getActionAssignment_1(), "rule__Policy__ActionAssignment_1");
					put(grammarAccess.getPolicyAccess().getActionTypeAssignment_2(), "rule__Policy__ActionTypeAssignment_2");
					put(grammarAccess.getPolicyAccess().getFeatureRuleAssignment_4(), "rule__Policy__FeatureRuleAssignment_4");
					put(grammarAccess.getPolicyAccess().getConstraintRuleAssignment_7(), "rule__Policy__ConstraintRuleAssignment_7");
					put(grammarAccess.getIsTargetTypeConstraintRuleAccess().getTypeAssignment_3(), "rule__IsTargetTypeConstraintRule__TypeAssignment_3");
					put(grammarAccess.getIsParentConstraintRuleAccess().getTypeAssignment_3(), "rule__IsParentConstraintRule__TypeAssignment_3");
					put(grammarAccess.getIsSourceTypeConstraintRuleAccess().getTypeAssignment_3(), "rule__IsSourceTypeConstraintRule__TypeAssignment_3");
					put(grammarAccess.getIsTargetConstraintRuleAccess().getTypeAssignment_3(), "rule__IsTargetConstraintRule__TypeAssignment_3");
					put(grammarAccess.getIsFeatureAccess().getFeatureNameAssignment_1(), "rule__IsFeature__FeatureNameAssignment_1");
					put(grammarAccess.getImplicationFeatureAccess().getRightRuleAssignment_1_2(), "rule__ImplicationFeature__RightRuleAssignment_1_2");
					put(grammarAccess.getOrFeatureAccess().getRulesAssignment_1_2(), "rule__OrFeature__RulesAssignment_1_2");
					put(grammarAccess.getAndFeatureAccess().getRulesAssignment_1_2(), "rule__AndFeature__RulesAssignment_1_2");
					put(grammarAccess.getNotFeatureExpressionAccess().getRuleAssignment_1_2(), "rule__NotFeatureExpression__RuleAssignment_1_2");
					put(grammarAccess.getImplicationConstraintAccess().getRightRuleAssignment_1_2(), "rule__ImplicationConstraint__RightRuleAssignment_1_2");
					put(grammarAccess.getOrConstraintAccess().getRulesAssignment_1_2(), "rule__OrConstraint__RulesAssignment_1_2");
					put(grammarAccess.getAndConstraintAccess().getRulesAssignment_1_2(), "rule__AndConstraint__RulesAssignment_1_2");
					put(grammarAccess.getNotConstraintExpressionAccess().getRuleAssignment_1_2(), "rule__NotConstraintExpression__RuleAssignment_1_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}