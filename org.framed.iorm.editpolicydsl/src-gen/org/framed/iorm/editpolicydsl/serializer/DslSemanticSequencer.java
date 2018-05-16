/*
 * generated by Xtext 2.13.0
 */
package org.framed.iorm.editpolicydsl.serializer;

import com.google.inject.Inject;
import editpolicymodel.AndConstraintRule;
import editpolicymodel.AndFeatureRule;
import editpolicymodel.ContainsCompartment;
import editpolicymodel.FalseConstraintRule;
import editpolicymodel.FalseFeatureRule;
import editpolicymodel.ImplicationConstraintRule;
import editpolicymodel.ImplicationFeatureRule;
import editpolicymodel.InCompartment;
import editpolicymodel.IsFeature;
import editpolicymodel.IsParent;
import editpolicymodel.IsSourceType;
import editpolicymodel.IsTarget;
import editpolicymodel.IsTargetType;
import editpolicymodel.Model;
import editpolicymodel.NotConstraintRule;
import editpolicymodel.NotFeatureRule;
import editpolicymodel.OrConstraintRule;
import editpolicymodel.OrFeatureRule;
import editpolicymodel.Policy;
import editpolicymodel.SourceEqualsTarget;
import editpolicymodel.SourceEqualsTargetType;
import editpolicymodel.TrueConstraintRule;
import editpolicymodel.TrueFeatureRule;
import editpolicymodel.editpolicymodelPackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.framed.iorm.editpolicydsl.services.DslGrammarAccess;

@SuppressWarnings("all")
public class DslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == editpolicymodelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case editpolicymodelPackage.AND_CONSTRAINT_RULE:
				sequence_AndConstraint(context, (AndConstraintRule) semanticObject); 
				return; 
			case editpolicymodelPackage.AND_FEATURE_RULE:
				sequence_AndFeature(context, (AndFeatureRule) semanticObject); 
				return; 
			case editpolicymodelPackage.CONTAINS_COMPARTMENT:
				sequence_ContainsCompartmentConstrainRule(context, (ContainsCompartment) semanticObject); 
				return; 
			case editpolicymodelPackage.FALSE_CONSTRAINT_RULE:
				sequence_FalseConstraintRule(context, (FalseConstraintRule) semanticObject); 
				return; 
			case editpolicymodelPackage.FALSE_FEATURE_RULE:
				sequence_FalseFeatureRule(context, (FalseFeatureRule) semanticObject); 
				return; 
			case editpolicymodelPackage.IMPLICATION_CONSTRAINT_RULE:
				sequence_ImplicationConstraint(context, (ImplicationConstraintRule) semanticObject); 
				return; 
			case editpolicymodelPackage.IMPLICATION_FEATURE_RULE:
				sequence_ImplicationFeature(context, (ImplicationFeatureRule) semanticObject); 
				return; 
			case editpolicymodelPackage.IN_COMPARTMENT:
				sequence_InCompartmentConstraintRule(context, (InCompartment) semanticObject); 
				return; 
			case editpolicymodelPackage.IS_FEATURE:
				sequence_IsFeature(context, (IsFeature) semanticObject); 
				return; 
			case editpolicymodelPackage.IS_PARENT:
				sequence_IsParentConstraintRule(context, (IsParent) semanticObject); 
				return; 
			case editpolicymodelPackage.IS_SOURCE_TYPE:
				sequence_IsSourceTypeConstraintRule(context, (IsSourceType) semanticObject); 
				return; 
			case editpolicymodelPackage.IS_TARGET:
				sequence_IsTargetConstraintRule(context, (IsTarget) semanticObject); 
				return; 
			case editpolicymodelPackage.IS_TARGET_TYPE:
				sequence_IsTargetTypeConstraintRule(context, (IsTargetType) semanticObject); 
				return; 
			case editpolicymodelPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case editpolicymodelPackage.NOT_CONSTRAINT_RULE:
				sequence_NotConstraintExpression(context, (NotConstraintRule) semanticObject); 
				return; 
			case editpolicymodelPackage.NOT_FEATURE_RULE:
				sequence_NotFeatureExpression(context, (NotFeatureRule) semanticObject); 
				return; 
			case editpolicymodelPackage.OR_CONSTRAINT_RULE:
				sequence_OrConstraint(context, (OrConstraintRule) semanticObject); 
				return; 
			case editpolicymodelPackage.OR_FEATURE_RULE:
				sequence_OrFeature(context, (OrFeatureRule) semanticObject); 
				return; 
			case editpolicymodelPackage.POLICY:
				sequence_Policy(context, (Policy) semanticObject); 
				return; 
			case editpolicymodelPackage.SOURCE_EQUALS_TARGET:
				sequence_SourceEqualsTargetConstraintRule(context, (SourceEqualsTarget) semanticObject); 
				return; 
			case editpolicymodelPackage.SOURCE_EQUALS_TARGET_TYPE:
				sequence_SourceEqualsTargetTypeConstraintRule(context, (SourceEqualsTargetType) semanticObject); 
				return; 
			case editpolicymodelPackage.TRUE_CONSTRAINT_RULE:
				sequence_TrueConstraintRule(context, (TrueConstraintRule) semanticObject); 
				return; 
			case editpolicymodelPackage.TRUE_FEATURE_RULE:
				sequence_TrueFeatureRule(context, (TrueFeatureRule) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ConstraintExpression returns AndConstraintRule
	 *     ImplicationConstraint returns AndConstraintRule
	 *     ImplicationConstraint.ImplicationConstraintRule_1_0 returns AndConstraintRule
	 *     OrConstraint returns AndConstraintRule
	 *     OrConstraint.OrConstraintRule_1_0 returns AndConstraintRule
	 *     AndConstraint returns AndConstraintRule
	 *     AndConstraint.AndConstraintRule_1_0 returns AndConstraintRule
	 *     NotConstraintExpression returns AndConstraintRule
	 *     PrimaryConstraint returns AndConstraintRule
	 *
	 * Constraint:
	 *     (rules+=AndConstraint_AndConstraintRule_1_0 rules+=NotConstraintExpression)
	 */
	protected void sequence_AndConstraint(ISerializationContext context, AndConstraintRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureExpression returns AndFeatureRule
	 *     ImplicationFeature returns AndFeatureRule
	 *     ImplicationFeature.ImplicationFeatureRule_1_0 returns AndFeatureRule
	 *     OrFeature returns AndFeatureRule
	 *     OrFeature.OrFeatureRule_1_0 returns AndFeatureRule
	 *     AndFeature returns AndFeatureRule
	 *     AndFeature.AndFeatureRule_1_0 returns AndFeatureRule
	 *     NotFeatureExpression returns AndFeatureRule
	 *     PrimaryFeature returns AndFeatureRule
	 *
	 * Constraint:
	 *     (rules+=AndFeature_AndFeatureRule_1_0 rules+=NotFeatureExpression)
	 */
	protected void sequence_AndFeature(ISerializationContext context, AndFeatureRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintRule returns ContainsCompartment
	 *     ContainsCompartmentConstrainRule returns ContainsCompartment
	 *     ConstraintExpression returns ContainsCompartment
	 *     ImplicationConstraint returns ContainsCompartment
	 *     ImplicationConstraint.ImplicationConstraintRule_1_0 returns ContainsCompartment
	 *     OrConstraint returns ContainsCompartment
	 *     OrConstraint.OrConstraintRule_1_0 returns ContainsCompartment
	 *     AndConstraint returns ContainsCompartment
	 *     AndConstraint.AndConstraintRule_1_0 returns ContainsCompartment
	 *     NotConstraintExpression returns ContainsCompartment
	 *     PrimaryConstraint returns ContainsCompartment
	 *
	 * Constraint:
	 *     {ContainsCompartment}
	 */
	protected void sequence_ContainsCompartmentConstrainRule(ISerializationContext context, ContainsCompartment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintRule returns FalseConstraintRule
	 *     FalseConstraintRule returns FalseConstraintRule
	 *     ConstraintExpression returns FalseConstraintRule
	 *     ImplicationConstraint returns FalseConstraintRule
	 *     ImplicationConstraint.ImplicationConstraintRule_1_0 returns FalseConstraintRule
	 *     OrConstraint returns FalseConstraintRule
	 *     OrConstraint.OrConstraintRule_1_0 returns FalseConstraintRule
	 *     AndConstraint returns FalseConstraintRule
	 *     AndConstraint.AndConstraintRule_1_0 returns FalseConstraintRule
	 *     NotConstraintExpression returns FalseConstraintRule
	 *     PrimaryConstraint returns FalseConstraintRule
	 *
	 * Constraint:
	 *     {FalseConstraintRule}
	 */
	protected void sequence_FalseConstraintRule(ISerializationContext context, FalseConstraintRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureRule returns FalseFeatureRule
	 *     FalseFeatureRule returns FalseFeatureRule
	 *     FeatureExpression returns FalseFeatureRule
	 *     ImplicationFeature returns FalseFeatureRule
	 *     ImplicationFeature.ImplicationFeatureRule_1_0 returns FalseFeatureRule
	 *     OrFeature returns FalseFeatureRule
	 *     OrFeature.OrFeatureRule_1_0 returns FalseFeatureRule
	 *     AndFeature returns FalseFeatureRule
	 *     AndFeature.AndFeatureRule_1_0 returns FalseFeatureRule
	 *     NotFeatureExpression returns FalseFeatureRule
	 *     PrimaryFeature returns FalseFeatureRule
	 *
	 * Constraint:
	 *     {FalseFeatureRule}
	 */
	protected void sequence_FalseFeatureRule(ISerializationContext context, FalseFeatureRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintExpression returns ImplicationConstraintRule
	 *     ImplicationConstraint returns ImplicationConstraintRule
	 *     ImplicationConstraint.ImplicationConstraintRule_1_0 returns ImplicationConstraintRule
	 *     OrConstraint returns ImplicationConstraintRule
	 *     OrConstraint.OrConstraintRule_1_0 returns ImplicationConstraintRule
	 *     AndConstraint returns ImplicationConstraintRule
	 *     AndConstraint.AndConstraintRule_1_0 returns ImplicationConstraintRule
	 *     NotConstraintExpression returns ImplicationConstraintRule
	 *     PrimaryConstraint returns ImplicationConstraintRule
	 *
	 * Constraint:
	 *     (leftRule=ImplicationConstraint_ImplicationConstraintRule_1_0 rightRule=OrConstraint)
	 */
	protected void sequence_ImplicationConstraint(ISerializationContext context, ImplicationConstraintRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, editpolicymodelPackage.Literals.BINARY_CONSTRAINT_RULE__LEFT_RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, editpolicymodelPackage.Literals.BINARY_CONSTRAINT_RULE__LEFT_RULE));
			if (transientValues.isValueTransient(semanticObject, editpolicymodelPackage.Literals.BINARY_CONSTRAINT_RULE__RIGHT_RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, editpolicymodelPackage.Literals.BINARY_CONSTRAINT_RULE__RIGHT_RULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImplicationConstraintAccess().getImplicationConstraintRuleLeftRuleAction_1_0(), semanticObject.getLeftRule());
		feeder.accept(grammarAccess.getImplicationConstraintAccess().getRightRuleOrConstraintParserRuleCall_1_2_0(), semanticObject.getRightRule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ImplicationFeature returns ImplicationFeatureRule
	 *
	 * Constraint:
	 *     (leftRule=ImplicationFeature_ImplicationFeatureRule_1_0 rightRule=OrFeature)
	 */
	protected void sequence_ImplicationFeature(ISerializationContext context, ImplicationFeatureRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, editpolicymodelPackage.Literals.BINARY_FEATURE_RULE__LEFT_RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, editpolicymodelPackage.Literals.BINARY_FEATURE_RULE__LEFT_RULE));
			if (transientValues.isValueTransient(semanticObject, editpolicymodelPackage.Literals.BINARY_FEATURE_RULE__RIGHT_RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, editpolicymodelPackage.Literals.BINARY_FEATURE_RULE__RIGHT_RULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImplicationFeatureAccess().getImplicationFeatureRuleLeftRuleAction_1_0(), semanticObject.getLeftRule());
		feeder.accept(grammarAccess.getImplicationFeatureAccess().getRightRuleOrFeatureParserRuleCall_1_2_0(), semanticObject.getRightRule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintRule returns InCompartment
	 *     InCompartmentConstraintRule returns InCompartment
	 *     ConstraintExpression returns InCompartment
	 *     ImplicationConstraint returns InCompartment
	 *     ImplicationConstraint.ImplicationConstraintRule_1_0 returns InCompartment
	 *     OrConstraint returns InCompartment
	 *     OrConstraint.OrConstraintRule_1_0 returns InCompartment
	 *     AndConstraint returns InCompartment
	 *     AndConstraint.AndConstraintRule_1_0 returns InCompartment
	 *     NotConstraintExpression returns InCompartment
	 *     PrimaryConstraint returns InCompartment
	 *
	 * Constraint:
	 *     {InCompartment}
	 */
	protected void sequence_InCompartmentConstraintRule(ISerializationContext context, InCompartment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureRule returns IsFeature
	 *     IsFeature returns IsFeature
	 *     FeatureExpression returns IsFeature
	 *     ImplicationFeature returns IsFeature
	 *     ImplicationFeature.ImplicationFeatureRule_1_0 returns IsFeature
	 *     OrFeature returns IsFeature
	 *     OrFeature.OrFeatureRule_1_0 returns IsFeature
	 *     AndFeature returns IsFeature
	 *     AndFeature.AndFeatureRule_1_0 returns IsFeature
	 *     NotFeatureExpression returns IsFeature
	 *     PrimaryFeature returns IsFeature
	 *
	 * Constraint:
	 *     featureName=FeatureNameEnum
	 */
	protected void sequence_IsFeature(ISerializationContext context, IsFeature semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, editpolicymodelPackage.Literals.IS_FEATURE__FEATURE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, editpolicymodelPackage.Literals.IS_FEATURE__FEATURE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIsFeatureAccess().getFeatureNameFeatureNameEnumEnumRuleCall_1_0(), semanticObject.getFeatureName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintRule returns IsParent
	 *     IsParentConstraintRule returns IsParent
	 *     ConstraintExpression returns IsParent
	 *     ImplicationConstraint returns IsParent
	 *     ImplicationConstraint.ImplicationConstraintRule_1_0 returns IsParent
	 *     OrConstraint returns IsParent
	 *     OrConstraint.OrConstraintRule_1_0 returns IsParent
	 *     AndConstraint returns IsParent
	 *     AndConstraint.AndConstraintRule_1_0 returns IsParent
	 *     NotConstraintExpression returns IsParent
	 *     PrimaryConstraint returns IsParent
	 *
	 * Constraint:
	 *     type=FeatureTypeEnum
	 */
	protected void sequence_IsParentConstraintRule(ISerializationContext context, IsParent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, editpolicymodelPackage.Literals.TYPE_ARGUMENT_RULE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, editpolicymodelPackage.Literals.TYPE_ARGUMENT_RULE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIsParentConstraintRuleAccess().getTypeFeatureTypeEnumEnumRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintRule returns IsSourceType
	 *     IsSourceTypeConstraintRule returns IsSourceType
	 *     ConstraintExpression returns IsSourceType
	 *     ImplicationConstraint returns IsSourceType
	 *     ImplicationConstraint.ImplicationConstraintRule_1_0 returns IsSourceType
	 *     OrConstraint returns IsSourceType
	 *     OrConstraint.OrConstraintRule_1_0 returns IsSourceType
	 *     AndConstraint returns IsSourceType
	 *     AndConstraint.AndConstraintRule_1_0 returns IsSourceType
	 *     NotConstraintExpression returns IsSourceType
	 *     PrimaryConstraint returns IsSourceType
	 *
	 * Constraint:
	 *     type=FeatureTypeEnum
	 */
	protected void sequence_IsSourceTypeConstraintRule(ISerializationContext context, IsSourceType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, editpolicymodelPackage.Literals.TYPE_ARGUMENT_RULE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, editpolicymodelPackage.Literals.TYPE_ARGUMENT_RULE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIsSourceTypeConstraintRuleAccess().getTypeFeatureTypeEnumEnumRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintRule returns IsTarget
	 *     IsTargetConstraintRule returns IsTarget
	 *     ConstraintExpression returns IsTarget
	 *     ImplicationConstraint returns IsTarget
	 *     ImplicationConstraint.ImplicationConstraintRule_1_0 returns IsTarget
	 *     OrConstraint returns IsTarget
	 *     OrConstraint.OrConstraintRule_1_0 returns IsTarget
	 *     AndConstraint returns IsTarget
	 *     AndConstraint.AndConstraintRule_1_0 returns IsTarget
	 *     NotConstraintExpression returns IsTarget
	 *     PrimaryConstraint returns IsTarget
	 *
	 * Constraint:
	 *     type=FeatureTypeEnum
	 */
	protected void sequence_IsTargetConstraintRule(ISerializationContext context, IsTarget semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, editpolicymodelPackage.Literals.TYPE_ARGUMENT_RULE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, editpolicymodelPackage.Literals.TYPE_ARGUMENT_RULE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIsTargetConstraintRuleAccess().getTypeFeatureTypeEnumEnumRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintRule returns IsTargetType
	 *     IsTargetTypeConstraintRule returns IsTargetType
	 *     ConstraintExpression returns IsTargetType
	 *     ImplicationConstraint returns IsTargetType
	 *     ImplicationConstraint.ImplicationConstraintRule_1_0 returns IsTargetType
	 *     OrConstraint returns IsTargetType
	 *     OrConstraint.OrConstraintRule_1_0 returns IsTargetType
	 *     AndConstraint returns IsTargetType
	 *     AndConstraint.AndConstraintRule_1_0 returns IsTargetType
	 *     NotConstraintExpression returns IsTargetType
	 *     PrimaryConstraint returns IsTargetType
	 *
	 * Constraint:
	 *     type=FeatureTypeEnum
	 */
	protected void sequence_IsTargetTypeConstraintRule(ISerializationContext context, IsTargetType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, editpolicymodelPackage.Literals.TYPE_ARGUMENT_RULE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, editpolicymodelPackage.Literals.TYPE_ARGUMENT_RULE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIsTargetTypeConstraintRuleAccess().getTypeFeatureTypeEnumEnumRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (policies+=Policy policies+=Policy*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintExpression returns NotConstraintRule
	 *     ImplicationConstraint returns NotConstraintRule
	 *     ImplicationConstraint.ImplicationConstraintRule_1_0 returns NotConstraintRule
	 *     OrConstraint returns NotConstraintRule
	 *     OrConstraint.OrConstraintRule_1_0 returns NotConstraintRule
	 *     AndConstraint returns NotConstraintRule
	 *     AndConstraint.AndConstraintRule_1_0 returns NotConstraintRule
	 *     NotConstraintExpression returns NotConstraintRule
	 *     PrimaryConstraint returns NotConstraintRule
	 *
	 * Constraint:
	 *     rule=PrimaryConstraint
	 */
	protected void sequence_NotConstraintExpression(ISerializationContext context, NotConstraintRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, editpolicymodelPackage.Literals.UNARY_CONSTRAINT_RULE__RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, editpolicymodelPackage.Literals.UNARY_CONSTRAINT_RULE__RULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotConstraintExpressionAccess().getRulePrimaryConstraintParserRuleCall_1_2_0(), semanticObject.getRule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FeatureExpression returns NotFeatureRule
	 *     ImplicationFeature returns NotFeatureRule
	 *     ImplicationFeature.ImplicationFeatureRule_1_0 returns NotFeatureRule
	 *     OrFeature returns NotFeatureRule
	 *     OrFeature.OrFeatureRule_1_0 returns NotFeatureRule
	 *     AndFeature returns NotFeatureRule
	 *     AndFeature.AndFeatureRule_1_0 returns NotFeatureRule
	 *     NotFeatureExpression returns NotFeatureRule
	 *     PrimaryFeature returns NotFeatureRule
	 *
	 * Constraint:
	 *     rule=PrimaryFeature
	 */
	protected void sequence_NotFeatureExpression(ISerializationContext context, NotFeatureRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, editpolicymodelPackage.Literals.UNARY_FEATURE_RULE__RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, editpolicymodelPackage.Literals.UNARY_FEATURE_RULE__RULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotFeatureExpressionAccess().getRulePrimaryFeatureParserRuleCall_1_2_0(), semanticObject.getRule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintExpression returns OrConstraintRule
	 *     ImplicationConstraint returns OrConstraintRule
	 *     ImplicationConstraint.ImplicationConstraintRule_1_0 returns OrConstraintRule
	 *     OrConstraint returns OrConstraintRule
	 *     OrConstraint.OrConstraintRule_1_0 returns OrConstraintRule
	 *     AndConstraint returns OrConstraintRule
	 *     AndConstraint.AndConstraintRule_1_0 returns OrConstraintRule
	 *     NotConstraintExpression returns OrConstraintRule
	 *     PrimaryConstraint returns OrConstraintRule
	 *
	 * Constraint:
	 *     (rules+=OrConstraint_OrConstraintRule_1_0 rules+=AndConstraint)
	 */
	protected void sequence_OrConstraint(ISerializationContext context, OrConstraintRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureExpression returns OrFeatureRule
	 *     ImplicationFeature returns OrFeatureRule
	 *     ImplicationFeature.ImplicationFeatureRule_1_0 returns OrFeatureRule
	 *     OrFeature returns OrFeatureRule
	 *     OrFeature.OrFeatureRule_1_0 returns OrFeatureRule
	 *     AndFeature returns OrFeatureRule
	 *     AndFeature.AndFeatureRule_1_0 returns OrFeatureRule
	 *     NotFeatureExpression returns OrFeatureRule
	 *     PrimaryFeature returns OrFeatureRule
	 *
	 * Constraint:
	 *     (rules+=OrFeature_OrFeatureRule_1_0 rules+=AndFeature)
	 */
	protected void sequence_OrFeature(ISerializationContext context, OrFeatureRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Policy returns Policy
	 *
	 * Constraint:
	 *     (override?='override'? action=ActionEnum actionType=FeatureTypeEnum featureRule=FeatureExpression constraintRule=ConstraintExpression)
	 */
	protected void sequence_Policy(ISerializationContext context, Policy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintRule returns SourceEqualsTarget
	 *     SourceEqualsTargetConstraintRule returns SourceEqualsTarget
	 *     ConstraintExpression returns SourceEqualsTarget
	 *     ImplicationConstraint returns SourceEqualsTarget
	 *     ImplicationConstraint.ImplicationConstraintRule_1_0 returns SourceEqualsTarget
	 *     OrConstraint returns SourceEqualsTarget
	 *     OrConstraint.OrConstraintRule_1_0 returns SourceEqualsTarget
	 *     AndConstraint returns SourceEqualsTarget
	 *     AndConstraint.AndConstraintRule_1_0 returns SourceEqualsTarget
	 *     NotConstraintExpression returns SourceEqualsTarget
	 *     PrimaryConstraint returns SourceEqualsTarget
	 *
	 * Constraint:
	 *     {SourceEqualsTarget}
	 */
	protected void sequence_SourceEqualsTargetConstraintRule(ISerializationContext context, SourceEqualsTarget semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintRule returns SourceEqualsTargetType
	 *     SourceEqualsTargetTypeConstraintRule returns SourceEqualsTargetType
	 *     ConstraintExpression returns SourceEqualsTargetType
	 *     ImplicationConstraint returns SourceEqualsTargetType
	 *     ImplicationConstraint.ImplicationConstraintRule_1_0 returns SourceEqualsTargetType
	 *     OrConstraint returns SourceEqualsTargetType
	 *     OrConstraint.OrConstraintRule_1_0 returns SourceEqualsTargetType
	 *     AndConstraint returns SourceEqualsTargetType
	 *     AndConstraint.AndConstraintRule_1_0 returns SourceEqualsTargetType
	 *     NotConstraintExpression returns SourceEqualsTargetType
	 *     PrimaryConstraint returns SourceEqualsTargetType
	 *
	 * Constraint:
	 *     {SourceEqualsTargetType}
	 */
	protected void sequence_SourceEqualsTargetTypeConstraintRule(ISerializationContext context, SourceEqualsTargetType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintRule returns TrueConstraintRule
	 *     TrueConstraintRule returns TrueConstraintRule
	 *     ConstraintExpression returns TrueConstraintRule
	 *     ImplicationConstraint returns TrueConstraintRule
	 *     ImplicationConstraint.ImplicationConstraintRule_1_0 returns TrueConstraintRule
	 *     OrConstraint returns TrueConstraintRule
	 *     OrConstraint.OrConstraintRule_1_0 returns TrueConstraintRule
	 *     AndConstraint returns TrueConstraintRule
	 *     AndConstraint.AndConstraintRule_1_0 returns TrueConstraintRule
	 *     NotConstraintExpression returns TrueConstraintRule
	 *     PrimaryConstraint returns TrueConstraintRule
	 *
	 * Constraint:
	 *     {TrueConstraintRule}
	 */
	protected void sequence_TrueConstraintRule(ISerializationContext context, TrueConstraintRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureRule returns TrueFeatureRule
	 *     TrueFeatureRule returns TrueFeatureRule
	 *     FeatureExpression returns TrueFeatureRule
	 *     ImplicationFeature returns TrueFeatureRule
	 *     ImplicationFeature.ImplicationFeatureRule_1_0 returns TrueFeatureRule
	 *     OrFeature returns TrueFeatureRule
	 *     OrFeature.OrFeatureRule_1_0 returns TrueFeatureRule
	 *     AndFeature returns TrueFeatureRule
	 *     AndFeature.AndFeatureRule_1_0 returns TrueFeatureRule
	 *     NotFeatureExpression returns TrueFeatureRule
	 *     PrimaryFeature returns TrueFeatureRule
	 *
	 * Constraint:
	 *     {TrueFeatureRule}
	 */
	protected void sequence_TrueFeatureRule(ISerializationContext context, TrueFeatureRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}