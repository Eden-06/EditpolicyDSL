package org.framed.iorm.editpolicydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.framed.iorm.editpolicydsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Add'", "'Reconnect'", "'Create'", "'Start'", "'Execute'", "'Direct_Edit'", "'Add_Property'", "'Create_Attribute'", "'Create_Operation'", "'Create_Property'", "'Acyclic'", "'CompartmentType'", "'Cyclic'", "'Total'", "'DataType'", "'Fulfillment'", "'Inheritance'", "'Group'", "'Reflexive'", "'Relationship'", "'RelationshipExclusion'", "'RelationshipImplication'", "'RoleType'", "'RoleEquivalence'", "'RoleGroup'", "'RoleImplication'", "'RoleProhibition'", "'Irreflexive'", "'NaturalType'", "'Compartment_Behavior'", "'Compartment_Inheritance'", "'Compartment_Properties'", "'Compartment_Structure'", "'Compartment_Types'", "'Contains_Compartments'", "'Compartments'", "'Data_Type_Inheritance'", "'Data_Types'", "'Dates'", "'Dependent'", "'Group_Constraints'", "'Inter_Relationship_Constraints'", "'Intra_Relationship_Constraints'", "'Naturals'", "'Occurrence_Constraints'", "'On_Compartments'", "'On_Relationships'", "'Parthood_Constraints'", "'Participants'", "'Playable'", "'Playable_by_Defining_Compartment'", "'Players'", "'Relationship_Cardinality'", "'Relationship_Constraints'", "'Relationships'", "'RML_Feature_Model'", "'Role_Behavior'", "'Role_Constraints'", "'Role_Equivalence'", "'Role_Implication'", "'Role_Inheritance'", "'Role_Prohibition'", "'Role_Properties'", "'Role_Structure'", "'Role_Types'", "'Roles'", "'('", "')'", "'when'", "';'", "'ContainsCompartment'", "'IsTargetType'", "'IsParent'", "'IsSourceType'", "'IsTarget'", "'InType'", "'SourceEqualsTarget'", "'SourceEqualsTargetType'", "'true'", "'false'", "'or'", "'and'", "'!'", "'=>'", "'override'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }


    	private DslGrammarAccess grammarAccess;

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleModel EOF )
            // InternalDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 )? ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Model__Group__0 )? ) )
            // InternalDsl.g:67:2: ( ( rule__Model__Group__0 )? )
            {
            // InternalDsl.g:67:2: ( ( rule__Model__Group__0 )? )
            // InternalDsl.g:68:3: ( rule__Model__Group__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__Model__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=20)||LA1_0==95) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:69:4: rule__Model__Group__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePolicy"
    // InternalDsl.g:78:1: entryRulePolicy : rulePolicy EOF ;
    public final void entryRulePolicy() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( rulePolicy EOF )
            // InternalDsl.g:80:1: rulePolicy EOF
            {
             before(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_1);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getPolicyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // InternalDsl.g:87:1: rulePolicy : ( ( rule__Policy__Group__0 ) ) ;
    public final void rulePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Policy__Group__0 ) ) )
            // InternalDsl.g:92:2: ( ( rule__Policy__Group__0 ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Policy__Group__0 ) )
            // InternalDsl.g:93:3: ( rule__Policy__Group__0 )
            {
             before(grammarAccess.getPolicyAccess().getGroup()); 
            // InternalDsl.g:94:3: ( rule__Policy__Group__0 )
            // InternalDsl.g:94:4: rule__Policy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleConstraintRule"
    // InternalDsl.g:103:1: entryRuleConstraintRule : ruleConstraintRule EOF ;
    public final void entryRuleConstraintRule() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleConstraintRule EOF )
            // InternalDsl.g:105:1: ruleConstraintRule EOF
            {
             before(grammarAccess.getConstraintRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraintRule();

            state._fsp--;

             after(grammarAccess.getConstraintRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraintRule"


    // $ANTLR start "ruleConstraintRule"
    // InternalDsl.g:112:1: ruleConstraintRule : ( ( rule__ConstraintRule__Alternatives ) ) ;
    public final void ruleConstraintRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__ConstraintRule__Alternatives ) ) )
            // InternalDsl.g:117:2: ( ( rule__ConstraintRule__Alternatives ) )
            {
            // InternalDsl.g:117:2: ( ( rule__ConstraintRule__Alternatives ) )
            // InternalDsl.g:118:3: ( rule__ConstraintRule__Alternatives )
            {
             before(grammarAccess.getConstraintRuleAccess().getAlternatives()); 
            // InternalDsl.g:119:3: ( rule__ConstraintRule__Alternatives )
            // InternalDsl.g:119:4: rule__ConstraintRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstraintRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintRule"


    // $ANTLR start "entryRuleContainsCompartmentConstrainRule"
    // InternalDsl.g:128:1: entryRuleContainsCompartmentConstrainRule : ruleContainsCompartmentConstrainRule EOF ;
    public final void entryRuleContainsCompartmentConstrainRule() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleContainsCompartmentConstrainRule EOF )
            // InternalDsl.g:130:1: ruleContainsCompartmentConstrainRule EOF
            {
             before(grammarAccess.getContainsCompartmentConstrainRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleContainsCompartmentConstrainRule();

            state._fsp--;

             after(grammarAccess.getContainsCompartmentConstrainRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContainsCompartmentConstrainRule"


    // $ANTLR start "ruleContainsCompartmentConstrainRule"
    // InternalDsl.g:137:1: ruleContainsCompartmentConstrainRule : ( ( rule__ContainsCompartmentConstrainRule__Group__0 ) ) ;
    public final void ruleContainsCompartmentConstrainRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__ContainsCompartmentConstrainRule__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__ContainsCompartmentConstrainRule__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__ContainsCompartmentConstrainRule__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__ContainsCompartmentConstrainRule__Group__0 )
            {
             before(grammarAccess.getContainsCompartmentConstrainRuleAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__ContainsCompartmentConstrainRule__Group__0 )
            // InternalDsl.g:144:4: rule__ContainsCompartmentConstrainRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContainsCompartmentConstrainRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainsCompartmentConstrainRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainsCompartmentConstrainRule"


    // $ANTLR start "entryRuleIsTargetTypeConstraintRule"
    // InternalDsl.g:153:1: entryRuleIsTargetTypeConstraintRule : ruleIsTargetTypeConstraintRule EOF ;
    public final void entryRuleIsTargetTypeConstraintRule() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleIsTargetTypeConstraintRule EOF )
            // InternalDsl.g:155:1: ruleIsTargetTypeConstraintRule EOF
            {
             before(grammarAccess.getIsTargetTypeConstraintRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleIsTargetTypeConstraintRule();

            state._fsp--;

             after(grammarAccess.getIsTargetTypeConstraintRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIsTargetTypeConstraintRule"


    // $ANTLR start "ruleIsTargetTypeConstraintRule"
    // InternalDsl.g:162:1: ruleIsTargetTypeConstraintRule : ( ( rule__IsTargetTypeConstraintRule__Group__0 ) ) ;
    public final void ruleIsTargetTypeConstraintRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__IsTargetTypeConstraintRule__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__IsTargetTypeConstraintRule__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__IsTargetTypeConstraintRule__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__IsTargetTypeConstraintRule__Group__0 )
            {
             before(grammarAccess.getIsTargetTypeConstraintRuleAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__IsTargetTypeConstraintRule__Group__0 )
            // InternalDsl.g:169:4: rule__IsTargetTypeConstraintRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IsTargetTypeConstraintRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIsTargetTypeConstraintRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIsTargetTypeConstraintRule"


    // $ANTLR start "entryRuleIsParentConstraintRule"
    // InternalDsl.g:178:1: entryRuleIsParentConstraintRule : ruleIsParentConstraintRule EOF ;
    public final void entryRuleIsParentConstraintRule() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleIsParentConstraintRule EOF )
            // InternalDsl.g:180:1: ruleIsParentConstraintRule EOF
            {
             before(grammarAccess.getIsParentConstraintRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleIsParentConstraintRule();

            state._fsp--;

             after(grammarAccess.getIsParentConstraintRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIsParentConstraintRule"


    // $ANTLR start "ruleIsParentConstraintRule"
    // InternalDsl.g:187:1: ruleIsParentConstraintRule : ( ( rule__IsParentConstraintRule__Group__0 ) ) ;
    public final void ruleIsParentConstraintRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__IsParentConstraintRule__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__IsParentConstraintRule__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__IsParentConstraintRule__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__IsParentConstraintRule__Group__0 )
            {
             before(grammarAccess.getIsParentConstraintRuleAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__IsParentConstraintRule__Group__0 )
            // InternalDsl.g:194:4: rule__IsParentConstraintRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IsParentConstraintRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIsParentConstraintRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIsParentConstraintRule"


    // $ANTLR start "entryRuleIsSourceTypeConstraintRule"
    // InternalDsl.g:203:1: entryRuleIsSourceTypeConstraintRule : ruleIsSourceTypeConstraintRule EOF ;
    public final void entryRuleIsSourceTypeConstraintRule() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleIsSourceTypeConstraintRule EOF )
            // InternalDsl.g:205:1: ruleIsSourceTypeConstraintRule EOF
            {
             before(grammarAccess.getIsSourceTypeConstraintRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleIsSourceTypeConstraintRule();

            state._fsp--;

             after(grammarAccess.getIsSourceTypeConstraintRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIsSourceTypeConstraintRule"


    // $ANTLR start "ruleIsSourceTypeConstraintRule"
    // InternalDsl.g:212:1: ruleIsSourceTypeConstraintRule : ( ( rule__IsSourceTypeConstraintRule__Group__0 ) ) ;
    public final void ruleIsSourceTypeConstraintRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__IsSourceTypeConstraintRule__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__IsSourceTypeConstraintRule__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__IsSourceTypeConstraintRule__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__IsSourceTypeConstraintRule__Group__0 )
            {
             before(grammarAccess.getIsSourceTypeConstraintRuleAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__IsSourceTypeConstraintRule__Group__0 )
            // InternalDsl.g:219:4: rule__IsSourceTypeConstraintRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IsSourceTypeConstraintRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIsSourceTypeConstraintRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIsSourceTypeConstraintRule"


    // $ANTLR start "entryRuleIsTargetConstraintRule"
    // InternalDsl.g:228:1: entryRuleIsTargetConstraintRule : ruleIsTargetConstraintRule EOF ;
    public final void entryRuleIsTargetConstraintRule() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleIsTargetConstraintRule EOF )
            // InternalDsl.g:230:1: ruleIsTargetConstraintRule EOF
            {
             before(grammarAccess.getIsTargetConstraintRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleIsTargetConstraintRule();

            state._fsp--;

             after(grammarAccess.getIsTargetConstraintRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIsTargetConstraintRule"


    // $ANTLR start "ruleIsTargetConstraintRule"
    // InternalDsl.g:237:1: ruleIsTargetConstraintRule : ( ( rule__IsTargetConstraintRule__Group__0 ) ) ;
    public final void ruleIsTargetConstraintRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__IsTargetConstraintRule__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__IsTargetConstraintRule__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__IsTargetConstraintRule__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__IsTargetConstraintRule__Group__0 )
            {
             before(grammarAccess.getIsTargetConstraintRuleAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__IsTargetConstraintRule__Group__0 )
            // InternalDsl.g:244:4: rule__IsTargetConstraintRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IsTargetConstraintRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIsTargetConstraintRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIsTargetConstraintRule"


    // $ANTLR start "entryRuleInTypeConstraintRule"
    // InternalDsl.g:253:1: entryRuleInTypeConstraintRule : ruleInTypeConstraintRule EOF ;
    public final void entryRuleInTypeConstraintRule() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleInTypeConstraintRule EOF )
            // InternalDsl.g:255:1: ruleInTypeConstraintRule EOF
            {
             before(grammarAccess.getInTypeConstraintRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleInTypeConstraintRule();

            state._fsp--;

             after(grammarAccess.getInTypeConstraintRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInTypeConstraintRule"


    // $ANTLR start "ruleInTypeConstraintRule"
    // InternalDsl.g:262:1: ruleInTypeConstraintRule : ( ( rule__InTypeConstraintRule__Group__0 ) ) ;
    public final void ruleInTypeConstraintRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__InTypeConstraintRule__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__InTypeConstraintRule__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__InTypeConstraintRule__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__InTypeConstraintRule__Group__0 )
            {
             before(grammarAccess.getInTypeConstraintRuleAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__InTypeConstraintRule__Group__0 )
            // InternalDsl.g:269:4: rule__InTypeConstraintRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InTypeConstraintRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInTypeConstraintRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInTypeConstraintRule"


    // $ANTLR start "entryRuleSourceEqualsTargetConstraintRule"
    // InternalDsl.g:278:1: entryRuleSourceEqualsTargetConstraintRule : ruleSourceEqualsTargetConstraintRule EOF ;
    public final void entryRuleSourceEqualsTargetConstraintRule() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleSourceEqualsTargetConstraintRule EOF )
            // InternalDsl.g:280:1: ruleSourceEqualsTargetConstraintRule EOF
            {
             before(grammarAccess.getSourceEqualsTargetConstraintRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSourceEqualsTargetConstraintRule();

            state._fsp--;

             after(grammarAccess.getSourceEqualsTargetConstraintRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSourceEqualsTargetConstraintRule"


    // $ANTLR start "ruleSourceEqualsTargetConstraintRule"
    // InternalDsl.g:287:1: ruleSourceEqualsTargetConstraintRule : ( ( rule__SourceEqualsTargetConstraintRule__Group__0 ) ) ;
    public final void ruleSourceEqualsTargetConstraintRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__SourceEqualsTargetConstraintRule__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__SourceEqualsTargetConstraintRule__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__SourceEqualsTargetConstraintRule__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__SourceEqualsTargetConstraintRule__Group__0 )
            {
             before(grammarAccess.getSourceEqualsTargetConstraintRuleAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__SourceEqualsTargetConstraintRule__Group__0 )
            // InternalDsl.g:294:4: rule__SourceEqualsTargetConstraintRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SourceEqualsTargetConstraintRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceEqualsTargetConstraintRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceEqualsTargetConstraintRule"


    // $ANTLR start "entryRuleSourceEqualsTargetTypeConstraintRule"
    // InternalDsl.g:303:1: entryRuleSourceEqualsTargetTypeConstraintRule : ruleSourceEqualsTargetTypeConstraintRule EOF ;
    public final void entryRuleSourceEqualsTargetTypeConstraintRule() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleSourceEqualsTargetTypeConstraintRule EOF )
            // InternalDsl.g:305:1: ruleSourceEqualsTargetTypeConstraintRule EOF
            {
             before(grammarAccess.getSourceEqualsTargetTypeConstraintRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSourceEqualsTargetTypeConstraintRule();

            state._fsp--;

             after(grammarAccess.getSourceEqualsTargetTypeConstraintRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSourceEqualsTargetTypeConstraintRule"


    // $ANTLR start "ruleSourceEqualsTargetTypeConstraintRule"
    // InternalDsl.g:312:1: ruleSourceEqualsTargetTypeConstraintRule : ( ( rule__SourceEqualsTargetTypeConstraintRule__Group__0 ) ) ;
    public final void ruleSourceEqualsTargetTypeConstraintRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__SourceEqualsTargetTypeConstraintRule__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__SourceEqualsTargetTypeConstraintRule__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__SourceEqualsTargetTypeConstraintRule__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__SourceEqualsTargetTypeConstraintRule__Group__0 )
            {
             before(grammarAccess.getSourceEqualsTargetTypeConstraintRuleAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__SourceEqualsTargetTypeConstraintRule__Group__0 )
            // InternalDsl.g:319:4: rule__SourceEqualsTargetTypeConstraintRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SourceEqualsTargetTypeConstraintRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceEqualsTargetTypeConstraintRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceEqualsTargetTypeConstraintRule"


    // $ANTLR start "entryRuleFeatureRule"
    // InternalDsl.g:328:1: entryRuleFeatureRule : ruleFeatureRule EOF ;
    public final void entryRuleFeatureRule() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleFeatureRule EOF )
            // InternalDsl.g:330:1: ruleFeatureRule EOF
            {
             before(grammarAccess.getFeatureRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureRule();

            state._fsp--;

             after(grammarAccess.getFeatureRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureRule"


    // $ANTLR start "ruleFeatureRule"
    // InternalDsl.g:337:1: ruleFeatureRule : ( ( rule__FeatureRule__Alternatives ) ) ;
    public final void ruleFeatureRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__FeatureRule__Alternatives ) ) )
            // InternalDsl.g:342:2: ( ( rule__FeatureRule__Alternatives ) )
            {
            // InternalDsl.g:342:2: ( ( rule__FeatureRule__Alternatives ) )
            // InternalDsl.g:343:3: ( rule__FeatureRule__Alternatives )
            {
             before(grammarAccess.getFeatureRuleAccess().getAlternatives()); 
            // InternalDsl.g:344:3: ( rule__FeatureRule__Alternatives )
            // InternalDsl.g:344:4: rule__FeatureRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FeatureRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureRule"


    // $ANTLR start "entryRuleIsFeature"
    // InternalDsl.g:353:1: entryRuleIsFeature : ruleIsFeature EOF ;
    public final void entryRuleIsFeature() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleIsFeature EOF )
            // InternalDsl.g:355:1: ruleIsFeature EOF
            {
             before(grammarAccess.getIsFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleIsFeature();

            state._fsp--;

             after(grammarAccess.getIsFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIsFeature"


    // $ANTLR start "ruleIsFeature"
    // InternalDsl.g:362:1: ruleIsFeature : ( ( rule__IsFeature__Group__0 ) ) ;
    public final void ruleIsFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__IsFeature__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__IsFeature__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__IsFeature__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__IsFeature__Group__0 )
            {
             before(grammarAccess.getIsFeatureAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__IsFeature__Group__0 )
            // InternalDsl.g:369:4: rule__IsFeature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IsFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIsFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIsFeature"


    // $ANTLR start "entryRuleTrueFeatureRule"
    // InternalDsl.g:378:1: entryRuleTrueFeatureRule : ruleTrueFeatureRule EOF ;
    public final void entryRuleTrueFeatureRule() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleTrueFeatureRule EOF )
            // InternalDsl.g:380:1: ruleTrueFeatureRule EOF
            {
             before(grammarAccess.getTrueFeatureRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleTrueFeatureRule();

            state._fsp--;

             after(grammarAccess.getTrueFeatureRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrueFeatureRule"


    // $ANTLR start "ruleTrueFeatureRule"
    // InternalDsl.g:387:1: ruleTrueFeatureRule : ( ( rule__TrueFeatureRule__Group__0 ) ) ;
    public final void ruleTrueFeatureRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__TrueFeatureRule__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__TrueFeatureRule__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__TrueFeatureRule__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__TrueFeatureRule__Group__0 )
            {
             before(grammarAccess.getTrueFeatureRuleAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__TrueFeatureRule__Group__0 )
            // InternalDsl.g:394:4: rule__TrueFeatureRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrueFeatureRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrueFeatureRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrueFeatureRule"


    // $ANTLR start "entryRuleTrueConstraintRule"
    // InternalDsl.g:403:1: entryRuleTrueConstraintRule : ruleTrueConstraintRule EOF ;
    public final void entryRuleTrueConstraintRule() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( ruleTrueConstraintRule EOF )
            // InternalDsl.g:405:1: ruleTrueConstraintRule EOF
            {
             before(grammarAccess.getTrueConstraintRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleTrueConstraintRule();

            state._fsp--;

             after(grammarAccess.getTrueConstraintRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrueConstraintRule"


    // $ANTLR start "ruleTrueConstraintRule"
    // InternalDsl.g:412:1: ruleTrueConstraintRule : ( ( rule__TrueConstraintRule__Group__0 ) ) ;
    public final void ruleTrueConstraintRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__TrueConstraintRule__Group__0 ) ) )
            // InternalDsl.g:417:2: ( ( rule__TrueConstraintRule__Group__0 ) )
            {
            // InternalDsl.g:417:2: ( ( rule__TrueConstraintRule__Group__0 ) )
            // InternalDsl.g:418:3: ( rule__TrueConstraintRule__Group__0 )
            {
             before(grammarAccess.getTrueConstraintRuleAccess().getGroup()); 
            // InternalDsl.g:419:3: ( rule__TrueConstraintRule__Group__0 )
            // InternalDsl.g:419:4: rule__TrueConstraintRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrueConstraintRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrueConstraintRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrueConstraintRule"


    // $ANTLR start "entryRuleFalseFeatureRule"
    // InternalDsl.g:428:1: entryRuleFalseFeatureRule : ruleFalseFeatureRule EOF ;
    public final void entryRuleFalseFeatureRule() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( ruleFalseFeatureRule EOF )
            // InternalDsl.g:430:1: ruleFalseFeatureRule EOF
            {
             before(grammarAccess.getFalseFeatureRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleFalseFeatureRule();

            state._fsp--;

             after(grammarAccess.getFalseFeatureRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFalseFeatureRule"


    // $ANTLR start "ruleFalseFeatureRule"
    // InternalDsl.g:437:1: ruleFalseFeatureRule : ( ( rule__FalseFeatureRule__Group__0 ) ) ;
    public final void ruleFalseFeatureRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( ( rule__FalseFeatureRule__Group__0 ) ) )
            // InternalDsl.g:442:2: ( ( rule__FalseFeatureRule__Group__0 ) )
            {
            // InternalDsl.g:442:2: ( ( rule__FalseFeatureRule__Group__0 ) )
            // InternalDsl.g:443:3: ( rule__FalseFeatureRule__Group__0 )
            {
             before(grammarAccess.getFalseFeatureRuleAccess().getGroup()); 
            // InternalDsl.g:444:3: ( rule__FalseFeatureRule__Group__0 )
            // InternalDsl.g:444:4: rule__FalseFeatureRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FalseFeatureRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFalseFeatureRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFalseFeatureRule"


    // $ANTLR start "entryRuleFalseConstraintRule"
    // InternalDsl.g:453:1: entryRuleFalseConstraintRule : ruleFalseConstraintRule EOF ;
    public final void entryRuleFalseConstraintRule() throws RecognitionException {
        try {
            // InternalDsl.g:454:1: ( ruleFalseConstraintRule EOF )
            // InternalDsl.g:455:1: ruleFalseConstraintRule EOF
            {
             before(grammarAccess.getFalseConstraintRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleFalseConstraintRule();

            state._fsp--;

             after(grammarAccess.getFalseConstraintRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFalseConstraintRule"


    // $ANTLR start "ruleFalseConstraintRule"
    // InternalDsl.g:462:1: ruleFalseConstraintRule : ( ( rule__FalseConstraintRule__Group__0 ) ) ;
    public final void ruleFalseConstraintRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:2: ( ( ( rule__FalseConstraintRule__Group__0 ) ) )
            // InternalDsl.g:467:2: ( ( rule__FalseConstraintRule__Group__0 ) )
            {
            // InternalDsl.g:467:2: ( ( rule__FalseConstraintRule__Group__0 ) )
            // InternalDsl.g:468:3: ( rule__FalseConstraintRule__Group__0 )
            {
             before(grammarAccess.getFalseConstraintRuleAccess().getGroup()); 
            // InternalDsl.g:469:3: ( rule__FalseConstraintRule__Group__0 )
            // InternalDsl.g:469:4: rule__FalseConstraintRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FalseConstraintRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFalseConstraintRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFalseConstraintRule"


    // $ANTLR start "entryRuleFeatureExpression"
    // InternalDsl.g:478:1: entryRuleFeatureExpression : ruleFeatureExpression EOF ;
    public final void entryRuleFeatureExpression() throws RecognitionException {
        try {
            // InternalDsl.g:479:1: ( ruleFeatureExpression EOF )
            // InternalDsl.g:480:1: ruleFeatureExpression EOF
            {
             before(grammarAccess.getFeatureExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureExpression();

            state._fsp--;

             after(grammarAccess.getFeatureExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureExpression"


    // $ANTLR start "ruleFeatureExpression"
    // InternalDsl.g:487:1: ruleFeatureExpression : ( ruleOrFeature ) ;
    public final void ruleFeatureExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:2: ( ( ruleOrFeature ) )
            // InternalDsl.g:492:2: ( ruleOrFeature )
            {
            // InternalDsl.g:492:2: ( ruleOrFeature )
            // InternalDsl.g:493:3: ruleOrFeature
            {
             before(grammarAccess.getFeatureExpressionAccess().getOrFeatureParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleOrFeature();

            state._fsp--;

             after(grammarAccess.getFeatureExpressionAccess().getOrFeatureParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureExpression"


    // $ANTLR start "entryRuleOrFeature"
    // InternalDsl.g:503:1: entryRuleOrFeature : ruleOrFeature EOF ;
    public final void entryRuleOrFeature() throws RecognitionException {
        try {
            // InternalDsl.g:504:1: ( ruleOrFeature EOF )
            // InternalDsl.g:505:1: ruleOrFeature EOF
            {
             before(grammarAccess.getOrFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleOrFeature();

            state._fsp--;

             after(grammarAccess.getOrFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrFeature"


    // $ANTLR start "ruleOrFeature"
    // InternalDsl.g:512:1: ruleOrFeature : ( ( rule__OrFeature__Group__0 ) ) ;
    public final void ruleOrFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:2: ( ( ( rule__OrFeature__Group__0 ) ) )
            // InternalDsl.g:517:2: ( ( rule__OrFeature__Group__0 ) )
            {
            // InternalDsl.g:517:2: ( ( rule__OrFeature__Group__0 ) )
            // InternalDsl.g:518:3: ( rule__OrFeature__Group__0 )
            {
             before(grammarAccess.getOrFeatureAccess().getGroup()); 
            // InternalDsl.g:519:3: ( rule__OrFeature__Group__0 )
            // InternalDsl.g:519:4: rule__OrFeature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrFeature"


    // $ANTLR start "entryRuleAndFeature"
    // InternalDsl.g:528:1: entryRuleAndFeature : ruleAndFeature EOF ;
    public final void entryRuleAndFeature() throws RecognitionException {
        try {
            // InternalDsl.g:529:1: ( ruleAndFeature EOF )
            // InternalDsl.g:530:1: ruleAndFeature EOF
            {
             before(grammarAccess.getAndFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleAndFeature();

            state._fsp--;

             after(grammarAccess.getAndFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndFeature"


    // $ANTLR start "ruleAndFeature"
    // InternalDsl.g:537:1: ruleAndFeature : ( ( rule__AndFeature__Group__0 ) ) ;
    public final void ruleAndFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:2: ( ( ( rule__AndFeature__Group__0 ) ) )
            // InternalDsl.g:542:2: ( ( rule__AndFeature__Group__0 ) )
            {
            // InternalDsl.g:542:2: ( ( rule__AndFeature__Group__0 ) )
            // InternalDsl.g:543:3: ( rule__AndFeature__Group__0 )
            {
             before(grammarAccess.getAndFeatureAccess().getGroup()); 
            // InternalDsl.g:544:3: ( rule__AndFeature__Group__0 )
            // InternalDsl.g:544:4: rule__AndFeature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndFeature"


    // $ANTLR start "entryRuleNotFeatureExpression"
    // InternalDsl.g:553:1: entryRuleNotFeatureExpression : ruleNotFeatureExpression EOF ;
    public final void entryRuleNotFeatureExpression() throws RecognitionException {
        try {
            // InternalDsl.g:554:1: ( ruleNotFeatureExpression EOF )
            // InternalDsl.g:555:1: ruleNotFeatureExpression EOF
            {
             before(grammarAccess.getNotFeatureExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNotFeatureExpression();

            state._fsp--;

             after(grammarAccess.getNotFeatureExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotFeatureExpression"


    // $ANTLR start "ruleNotFeatureExpression"
    // InternalDsl.g:562:1: ruleNotFeatureExpression : ( ( rule__NotFeatureExpression__Alternatives ) ) ;
    public final void ruleNotFeatureExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:566:2: ( ( ( rule__NotFeatureExpression__Alternatives ) ) )
            // InternalDsl.g:567:2: ( ( rule__NotFeatureExpression__Alternatives ) )
            {
            // InternalDsl.g:567:2: ( ( rule__NotFeatureExpression__Alternatives ) )
            // InternalDsl.g:568:3: ( rule__NotFeatureExpression__Alternatives )
            {
             before(grammarAccess.getNotFeatureExpressionAccess().getAlternatives()); 
            // InternalDsl.g:569:3: ( rule__NotFeatureExpression__Alternatives )
            // InternalDsl.g:569:4: rule__NotFeatureExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NotFeatureExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNotFeatureExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotFeatureExpression"


    // $ANTLR start "entryRulePrimaryFeature"
    // InternalDsl.g:578:1: entryRulePrimaryFeature : rulePrimaryFeature EOF ;
    public final void entryRulePrimaryFeature() throws RecognitionException {
        try {
            // InternalDsl.g:579:1: ( rulePrimaryFeature EOF )
            // InternalDsl.g:580:1: rulePrimaryFeature EOF
            {
             before(grammarAccess.getPrimaryFeatureRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryFeature();

            state._fsp--;

             after(grammarAccess.getPrimaryFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryFeature"


    // $ANTLR start "rulePrimaryFeature"
    // InternalDsl.g:587:1: rulePrimaryFeature : ( ( rule__PrimaryFeature__Alternatives ) ) ;
    public final void rulePrimaryFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:591:2: ( ( ( rule__PrimaryFeature__Alternatives ) ) )
            // InternalDsl.g:592:2: ( ( rule__PrimaryFeature__Alternatives ) )
            {
            // InternalDsl.g:592:2: ( ( rule__PrimaryFeature__Alternatives ) )
            // InternalDsl.g:593:3: ( rule__PrimaryFeature__Alternatives )
            {
             before(grammarAccess.getPrimaryFeatureAccess().getAlternatives()); 
            // InternalDsl.g:594:3: ( rule__PrimaryFeature__Alternatives )
            // InternalDsl.g:594:4: rule__PrimaryFeature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryFeature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryFeature"


    // $ANTLR start "entryRuleConstraintExpression"
    // InternalDsl.g:603:1: entryRuleConstraintExpression : ruleConstraintExpression EOF ;
    public final void entryRuleConstraintExpression() throws RecognitionException {
        try {
            // InternalDsl.g:604:1: ( ruleConstraintExpression EOF )
            // InternalDsl.g:605:1: ruleConstraintExpression EOF
            {
             before(grammarAccess.getConstraintExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraintExpression();

            state._fsp--;

             after(grammarAccess.getConstraintExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraintExpression"


    // $ANTLR start "ruleConstraintExpression"
    // InternalDsl.g:612:1: ruleConstraintExpression : ( ruleImplicationConstraint ) ;
    public final void ruleConstraintExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:616:2: ( ( ruleImplicationConstraint ) )
            // InternalDsl.g:617:2: ( ruleImplicationConstraint )
            {
            // InternalDsl.g:617:2: ( ruleImplicationConstraint )
            // InternalDsl.g:618:3: ruleImplicationConstraint
            {
             before(grammarAccess.getConstraintExpressionAccess().getImplicationConstraintParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleImplicationConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintExpressionAccess().getImplicationConstraintParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintExpression"


    // $ANTLR start "entryRuleImplicationConstraint"
    // InternalDsl.g:628:1: entryRuleImplicationConstraint : ruleImplicationConstraint EOF ;
    public final void entryRuleImplicationConstraint() throws RecognitionException {
        try {
            // InternalDsl.g:629:1: ( ruleImplicationConstraint EOF )
            // InternalDsl.g:630:1: ruleImplicationConstraint EOF
            {
             before(grammarAccess.getImplicationConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleImplicationConstraint();

            state._fsp--;

             after(grammarAccess.getImplicationConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImplicationConstraint"


    // $ANTLR start "ruleImplicationConstraint"
    // InternalDsl.g:637:1: ruleImplicationConstraint : ( ( rule__ImplicationConstraint__Group__0 ) ) ;
    public final void ruleImplicationConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:641:2: ( ( ( rule__ImplicationConstraint__Group__0 ) ) )
            // InternalDsl.g:642:2: ( ( rule__ImplicationConstraint__Group__0 ) )
            {
            // InternalDsl.g:642:2: ( ( rule__ImplicationConstraint__Group__0 ) )
            // InternalDsl.g:643:3: ( rule__ImplicationConstraint__Group__0 )
            {
             before(grammarAccess.getImplicationConstraintAccess().getGroup()); 
            // InternalDsl.g:644:3: ( rule__ImplicationConstraint__Group__0 )
            // InternalDsl.g:644:4: rule__ImplicationConstraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImplicationConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImplicationConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImplicationConstraint"


    // $ANTLR start "entryRuleOrConstraint"
    // InternalDsl.g:653:1: entryRuleOrConstraint : ruleOrConstraint EOF ;
    public final void entryRuleOrConstraint() throws RecognitionException {
        try {
            // InternalDsl.g:654:1: ( ruleOrConstraint EOF )
            // InternalDsl.g:655:1: ruleOrConstraint EOF
            {
             before(grammarAccess.getOrConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleOrConstraint();

            state._fsp--;

             after(grammarAccess.getOrConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrConstraint"


    // $ANTLR start "ruleOrConstraint"
    // InternalDsl.g:662:1: ruleOrConstraint : ( ( rule__OrConstraint__Group__0 ) ) ;
    public final void ruleOrConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:666:2: ( ( ( rule__OrConstraint__Group__0 ) ) )
            // InternalDsl.g:667:2: ( ( rule__OrConstraint__Group__0 ) )
            {
            // InternalDsl.g:667:2: ( ( rule__OrConstraint__Group__0 ) )
            // InternalDsl.g:668:3: ( rule__OrConstraint__Group__0 )
            {
             before(grammarAccess.getOrConstraintAccess().getGroup()); 
            // InternalDsl.g:669:3: ( rule__OrConstraint__Group__0 )
            // InternalDsl.g:669:4: rule__OrConstraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrConstraint"


    // $ANTLR start "entryRuleAndConstraint"
    // InternalDsl.g:678:1: entryRuleAndConstraint : ruleAndConstraint EOF ;
    public final void entryRuleAndConstraint() throws RecognitionException {
        try {
            // InternalDsl.g:679:1: ( ruleAndConstraint EOF )
            // InternalDsl.g:680:1: ruleAndConstraint EOF
            {
             before(grammarAccess.getAndConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleAndConstraint();

            state._fsp--;

             after(grammarAccess.getAndConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndConstraint"


    // $ANTLR start "ruleAndConstraint"
    // InternalDsl.g:687:1: ruleAndConstraint : ( ( rule__AndConstraint__Group__0 ) ) ;
    public final void ruleAndConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:691:2: ( ( ( rule__AndConstraint__Group__0 ) ) )
            // InternalDsl.g:692:2: ( ( rule__AndConstraint__Group__0 ) )
            {
            // InternalDsl.g:692:2: ( ( rule__AndConstraint__Group__0 ) )
            // InternalDsl.g:693:3: ( rule__AndConstraint__Group__0 )
            {
             before(grammarAccess.getAndConstraintAccess().getGroup()); 
            // InternalDsl.g:694:3: ( rule__AndConstraint__Group__0 )
            // InternalDsl.g:694:4: rule__AndConstraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndConstraint"


    // $ANTLR start "entryRuleNotConstraintExpression"
    // InternalDsl.g:703:1: entryRuleNotConstraintExpression : ruleNotConstraintExpression EOF ;
    public final void entryRuleNotConstraintExpression() throws RecognitionException {
        try {
            // InternalDsl.g:704:1: ( ruleNotConstraintExpression EOF )
            // InternalDsl.g:705:1: ruleNotConstraintExpression EOF
            {
             before(grammarAccess.getNotConstraintExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNotConstraintExpression();

            state._fsp--;

             after(grammarAccess.getNotConstraintExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotConstraintExpression"


    // $ANTLR start "ruleNotConstraintExpression"
    // InternalDsl.g:712:1: ruleNotConstraintExpression : ( ( rule__NotConstraintExpression__Alternatives ) ) ;
    public final void ruleNotConstraintExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:716:2: ( ( ( rule__NotConstraintExpression__Alternatives ) ) )
            // InternalDsl.g:717:2: ( ( rule__NotConstraintExpression__Alternatives ) )
            {
            // InternalDsl.g:717:2: ( ( rule__NotConstraintExpression__Alternatives ) )
            // InternalDsl.g:718:3: ( rule__NotConstraintExpression__Alternatives )
            {
             before(grammarAccess.getNotConstraintExpressionAccess().getAlternatives()); 
            // InternalDsl.g:719:3: ( rule__NotConstraintExpression__Alternatives )
            // InternalDsl.g:719:4: rule__NotConstraintExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NotConstraintExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNotConstraintExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotConstraintExpression"


    // $ANTLR start "entryRulePrimaryConstraint"
    // InternalDsl.g:728:1: entryRulePrimaryConstraint : rulePrimaryConstraint EOF ;
    public final void entryRulePrimaryConstraint() throws RecognitionException {
        try {
            // InternalDsl.g:729:1: ( rulePrimaryConstraint EOF )
            // InternalDsl.g:730:1: rulePrimaryConstraint EOF
            {
             before(grammarAccess.getPrimaryConstraintRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryConstraint();

            state._fsp--;

             after(grammarAccess.getPrimaryConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryConstraint"


    // $ANTLR start "rulePrimaryConstraint"
    // InternalDsl.g:737:1: rulePrimaryConstraint : ( ( rule__PrimaryConstraint__Alternatives ) ) ;
    public final void rulePrimaryConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:741:2: ( ( ( rule__PrimaryConstraint__Alternatives ) ) )
            // InternalDsl.g:742:2: ( ( rule__PrimaryConstraint__Alternatives ) )
            {
            // InternalDsl.g:742:2: ( ( rule__PrimaryConstraint__Alternatives ) )
            // InternalDsl.g:743:3: ( rule__PrimaryConstraint__Alternatives )
            {
             before(grammarAccess.getPrimaryConstraintAccess().getAlternatives()); 
            // InternalDsl.g:744:3: ( rule__PrimaryConstraint__Alternatives )
            // InternalDsl.g:744:4: rule__PrimaryConstraint__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryConstraint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryConstraintAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryConstraint"


    // $ANTLR start "ruleActionEnum"
    // InternalDsl.g:753:1: ruleActionEnum : ( ( rule__ActionEnum__Alternatives ) ) ;
    public final void ruleActionEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:757:1: ( ( ( rule__ActionEnum__Alternatives ) ) )
            // InternalDsl.g:758:2: ( ( rule__ActionEnum__Alternatives ) )
            {
            // InternalDsl.g:758:2: ( ( rule__ActionEnum__Alternatives ) )
            // InternalDsl.g:759:3: ( rule__ActionEnum__Alternatives )
            {
             before(grammarAccess.getActionEnumAccess().getAlternatives()); 
            // InternalDsl.g:760:3: ( rule__ActionEnum__Alternatives )
            // InternalDsl.g:760:4: rule__ActionEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActionEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionEnum"


    // $ANTLR start "ruleFeatureTypeEnum"
    // InternalDsl.g:769:1: ruleFeatureTypeEnum : ( ( rule__FeatureTypeEnum__Alternatives ) ) ;
    public final void ruleFeatureTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:773:1: ( ( ( rule__FeatureTypeEnum__Alternatives ) ) )
            // InternalDsl.g:774:2: ( ( rule__FeatureTypeEnum__Alternatives ) )
            {
            // InternalDsl.g:774:2: ( ( rule__FeatureTypeEnum__Alternatives ) )
            // InternalDsl.g:775:3: ( rule__FeatureTypeEnum__Alternatives )
            {
             before(grammarAccess.getFeatureTypeEnumAccess().getAlternatives()); 
            // InternalDsl.g:776:3: ( rule__FeatureTypeEnum__Alternatives )
            // InternalDsl.g:776:4: rule__FeatureTypeEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FeatureTypeEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureTypeEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureTypeEnum"


    // $ANTLR start "ruleFeatureNameEnum"
    // InternalDsl.g:785:1: ruleFeatureNameEnum : ( ( rule__FeatureNameEnum__Alternatives ) ) ;
    public final void ruleFeatureNameEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:789:1: ( ( ( rule__FeatureNameEnum__Alternatives ) ) )
            // InternalDsl.g:790:2: ( ( rule__FeatureNameEnum__Alternatives ) )
            {
            // InternalDsl.g:790:2: ( ( rule__FeatureNameEnum__Alternatives ) )
            // InternalDsl.g:791:3: ( rule__FeatureNameEnum__Alternatives )
            {
             before(grammarAccess.getFeatureNameEnumAccess().getAlternatives()); 
            // InternalDsl.g:792:3: ( rule__FeatureNameEnum__Alternatives )
            // InternalDsl.g:792:4: rule__FeatureNameEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FeatureNameEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureNameEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureNameEnum"


    // $ANTLR start "rule__ConstraintRule__Alternatives"
    // InternalDsl.g:800:1: rule__ConstraintRule__Alternatives : ( ( ruleTrueConstraintRule ) | ( ruleFalseConstraintRule ) | ( ruleContainsCompartmentConstrainRule ) | ( ruleIsTargetConstraintRule ) | ( ruleIsTargetTypeConstraintRule ) | ( ruleIsSourceTypeConstraintRule ) | ( ruleIsParentConstraintRule ) | ( ruleSourceEqualsTargetConstraintRule ) | ( ruleSourceEqualsTargetTypeConstraintRule ) | ( ruleInTypeConstraintRule ) );
    public final void rule__ConstraintRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:804:1: ( ( ruleTrueConstraintRule ) | ( ruleFalseConstraintRule ) | ( ruleContainsCompartmentConstrainRule ) | ( ruleIsTargetConstraintRule ) | ( ruleIsTargetTypeConstraintRule ) | ( ruleIsSourceTypeConstraintRule ) | ( ruleIsParentConstraintRule ) | ( ruleSourceEqualsTargetConstraintRule ) | ( ruleSourceEqualsTargetTypeConstraintRule ) | ( ruleInTypeConstraintRule ) )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt2=1;
                }
                break;
            case 90:
                {
                alt2=2;
                }
                break;
            case 81:
                {
                alt2=3;
                }
                break;
            case 85:
                {
                alt2=4;
                }
                break;
            case 82:
                {
                alt2=5;
                }
                break;
            case 84:
                {
                alt2=6;
                }
                break;
            case 83:
                {
                alt2=7;
                }
                break;
            case 87:
                {
                alt2=8;
                }
                break;
            case 88:
                {
                alt2=9;
                }
                break;
            case 86:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDsl.g:805:2: ( ruleTrueConstraintRule )
                    {
                    // InternalDsl.g:805:2: ( ruleTrueConstraintRule )
                    // InternalDsl.g:806:3: ruleTrueConstraintRule
                    {
                     before(grammarAccess.getConstraintRuleAccess().getTrueConstraintRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTrueConstraintRule();

                    state._fsp--;

                     after(grammarAccess.getConstraintRuleAccess().getTrueConstraintRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:811:2: ( ruleFalseConstraintRule )
                    {
                    // InternalDsl.g:811:2: ( ruleFalseConstraintRule )
                    // InternalDsl.g:812:3: ruleFalseConstraintRule
                    {
                     before(grammarAccess.getConstraintRuleAccess().getFalseConstraintRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFalseConstraintRule();

                    state._fsp--;

                     after(grammarAccess.getConstraintRuleAccess().getFalseConstraintRuleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:817:2: ( ruleContainsCompartmentConstrainRule )
                    {
                    // InternalDsl.g:817:2: ( ruleContainsCompartmentConstrainRule )
                    // InternalDsl.g:818:3: ruleContainsCompartmentConstrainRule
                    {
                     before(grammarAccess.getConstraintRuleAccess().getContainsCompartmentConstrainRuleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleContainsCompartmentConstrainRule();

                    state._fsp--;

                     after(grammarAccess.getConstraintRuleAccess().getContainsCompartmentConstrainRuleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:823:2: ( ruleIsTargetConstraintRule )
                    {
                    // InternalDsl.g:823:2: ( ruleIsTargetConstraintRule )
                    // InternalDsl.g:824:3: ruleIsTargetConstraintRule
                    {
                     before(grammarAccess.getConstraintRuleAccess().getIsTargetConstraintRuleParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleIsTargetConstraintRule();

                    state._fsp--;

                     after(grammarAccess.getConstraintRuleAccess().getIsTargetConstraintRuleParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:829:2: ( ruleIsTargetTypeConstraintRule )
                    {
                    // InternalDsl.g:829:2: ( ruleIsTargetTypeConstraintRule )
                    // InternalDsl.g:830:3: ruleIsTargetTypeConstraintRule
                    {
                     before(grammarAccess.getConstraintRuleAccess().getIsTargetTypeConstraintRuleParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleIsTargetTypeConstraintRule();

                    state._fsp--;

                     after(grammarAccess.getConstraintRuleAccess().getIsTargetTypeConstraintRuleParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:835:2: ( ruleIsSourceTypeConstraintRule )
                    {
                    // InternalDsl.g:835:2: ( ruleIsSourceTypeConstraintRule )
                    // InternalDsl.g:836:3: ruleIsSourceTypeConstraintRule
                    {
                     before(grammarAccess.getConstraintRuleAccess().getIsSourceTypeConstraintRuleParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleIsSourceTypeConstraintRule();

                    state._fsp--;

                     after(grammarAccess.getConstraintRuleAccess().getIsSourceTypeConstraintRuleParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:841:2: ( ruleIsParentConstraintRule )
                    {
                    // InternalDsl.g:841:2: ( ruleIsParentConstraintRule )
                    // InternalDsl.g:842:3: ruleIsParentConstraintRule
                    {
                     before(grammarAccess.getConstraintRuleAccess().getIsParentConstraintRuleParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleIsParentConstraintRule();

                    state._fsp--;

                     after(grammarAccess.getConstraintRuleAccess().getIsParentConstraintRuleParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:847:2: ( ruleSourceEqualsTargetConstraintRule )
                    {
                    // InternalDsl.g:847:2: ( ruleSourceEqualsTargetConstraintRule )
                    // InternalDsl.g:848:3: ruleSourceEqualsTargetConstraintRule
                    {
                     before(grammarAccess.getConstraintRuleAccess().getSourceEqualsTargetConstraintRuleParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleSourceEqualsTargetConstraintRule();

                    state._fsp--;

                     after(grammarAccess.getConstraintRuleAccess().getSourceEqualsTargetConstraintRuleParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:853:2: ( ruleSourceEqualsTargetTypeConstraintRule )
                    {
                    // InternalDsl.g:853:2: ( ruleSourceEqualsTargetTypeConstraintRule )
                    // InternalDsl.g:854:3: ruleSourceEqualsTargetTypeConstraintRule
                    {
                     before(grammarAccess.getConstraintRuleAccess().getSourceEqualsTargetTypeConstraintRuleParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleSourceEqualsTargetTypeConstraintRule();

                    state._fsp--;

                     after(grammarAccess.getConstraintRuleAccess().getSourceEqualsTargetTypeConstraintRuleParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDsl.g:859:2: ( ruleInTypeConstraintRule )
                    {
                    // InternalDsl.g:859:2: ( ruleInTypeConstraintRule )
                    // InternalDsl.g:860:3: ruleInTypeConstraintRule
                    {
                     before(grammarAccess.getConstraintRuleAccess().getInTypeConstraintRuleParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleInTypeConstraintRule();

                    state._fsp--;

                     after(grammarAccess.getConstraintRuleAccess().getInTypeConstraintRuleParserRuleCall_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintRule__Alternatives"


    // $ANTLR start "rule__FeatureRule__Alternatives"
    // InternalDsl.g:869:1: rule__FeatureRule__Alternatives : ( ( ruleIsFeature ) | ( ruleTrueFeatureRule ) | ( ruleFalseFeatureRule ) );
    public final void rule__FeatureRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:873:1: ( ( ruleIsFeature ) | ( ruleTrueFeatureRule ) | ( ruleFalseFeatureRule ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt3=1;
                }
                break;
            case 89:
                {
                alt3=2;
                }
                break;
            case 90:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:874:2: ( ruleIsFeature )
                    {
                    // InternalDsl.g:874:2: ( ruleIsFeature )
                    // InternalDsl.g:875:3: ruleIsFeature
                    {
                     before(grammarAccess.getFeatureRuleAccess().getIsFeatureParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIsFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureRuleAccess().getIsFeatureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:880:2: ( ruleTrueFeatureRule )
                    {
                    // InternalDsl.g:880:2: ( ruleTrueFeatureRule )
                    // InternalDsl.g:881:3: ruleTrueFeatureRule
                    {
                     before(grammarAccess.getFeatureRuleAccess().getTrueFeatureRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTrueFeatureRule();

                    state._fsp--;

                     after(grammarAccess.getFeatureRuleAccess().getTrueFeatureRuleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:886:2: ( ruleFalseFeatureRule )
                    {
                    // InternalDsl.g:886:2: ( ruleFalseFeatureRule )
                    // InternalDsl.g:887:3: ruleFalseFeatureRule
                    {
                     before(grammarAccess.getFeatureRuleAccess().getFalseFeatureRuleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFalseFeatureRule();

                    state._fsp--;

                     after(grammarAccess.getFeatureRuleAccess().getFalseFeatureRuleParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureRule__Alternatives"


    // $ANTLR start "rule__NotFeatureExpression__Alternatives"
    // InternalDsl.g:896:1: rule__NotFeatureExpression__Alternatives : ( ( rulePrimaryFeature ) | ( ( rule__NotFeatureExpression__Group_1__0 ) ) );
    public final void rule__NotFeatureExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:900:1: ( ( rulePrimaryFeature ) | ( ( rule__NotFeatureExpression__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=40 && LA4_0<=77)||(LA4_0>=89 && LA4_0<=90)) ) {
                alt4=1;
            }
            else if ( (LA4_0==93) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:901:2: ( rulePrimaryFeature )
                    {
                    // InternalDsl.g:901:2: ( rulePrimaryFeature )
                    // InternalDsl.g:902:3: rulePrimaryFeature
                    {
                     before(grammarAccess.getNotFeatureExpressionAccess().getPrimaryFeatureParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimaryFeature();

                    state._fsp--;

                     after(grammarAccess.getNotFeatureExpressionAccess().getPrimaryFeatureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:907:2: ( ( rule__NotFeatureExpression__Group_1__0 ) )
                    {
                    // InternalDsl.g:907:2: ( ( rule__NotFeatureExpression__Group_1__0 ) )
                    // InternalDsl.g:908:3: ( rule__NotFeatureExpression__Group_1__0 )
                    {
                     before(grammarAccess.getNotFeatureExpressionAccess().getGroup_1()); 
                    // InternalDsl.g:909:3: ( rule__NotFeatureExpression__Group_1__0 )
                    // InternalDsl.g:909:4: rule__NotFeatureExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NotFeatureExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNotFeatureExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotFeatureExpression__Alternatives"


    // $ANTLR start "rule__PrimaryFeature__Alternatives"
    // InternalDsl.g:917:1: rule__PrimaryFeature__Alternatives : ( ( ruleFeatureRule ) | ( ( rule__PrimaryFeature__Group_1__0 ) ) );
    public final void rule__PrimaryFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:921:1: ( ( ruleFeatureRule ) | ( ( rule__PrimaryFeature__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=40 && LA5_0<=76)||(LA5_0>=89 && LA5_0<=90)) ) {
                alt5=1;
            }
            else if ( (LA5_0==77) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:922:2: ( ruleFeatureRule )
                    {
                    // InternalDsl.g:922:2: ( ruleFeatureRule )
                    // InternalDsl.g:923:3: ruleFeatureRule
                    {
                     before(grammarAccess.getPrimaryFeatureAccess().getFeatureRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFeatureRule();

                    state._fsp--;

                     after(grammarAccess.getPrimaryFeatureAccess().getFeatureRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:928:2: ( ( rule__PrimaryFeature__Group_1__0 ) )
                    {
                    // InternalDsl.g:928:2: ( ( rule__PrimaryFeature__Group_1__0 ) )
                    // InternalDsl.g:929:3: ( rule__PrimaryFeature__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryFeatureAccess().getGroup_1()); 
                    // InternalDsl.g:930:3: ( rule__PrimaryFeature__Group_1__0 )
                    // InternalDsl.g:930:4: rule__PrimaryFeature__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryFeature__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryFeatureAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryFeature__Alternatives"


    // $ANTLR start "rule__NotConstraintExpression__Alternatives"
    // InternalDsl.g:938:1: rule__NotConstraintExpression__Alternatives : ( ( rulePrimaryConstraint ) | ( ( rule__NotConstraintExpression__Group_1__0 ) ) );
    public final void rule__NotConstraintExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:942:1: ( ( rulePrimaryConstraint ) | ( ( rule__NotConstraintExpression__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==77||(LA6_0>=81 && LA6_0<=90)) ) {
                alt6=1;
            }
            else if ( (LA6_0==93) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:943:2: ( rulePrimaryConstraint )
                    {
                    // InternalDsl.g:943:2: ( rulePrimaryConstraint )
                    // InternalDsl.g:944:3: rulePrimaryConstraint
                    {
                     before(grammarAccess.getNotConstraintExpressionAccess().getPrimaryConstraintParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimaryConstraint();

                    state._fsp--;

                     after(grammarAccess.getNotConstraintExpressionAccess().getPrimaryConstraintParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:949:2: ( ( rule__NotConstraintExpression__Group_1__0 ) )
                    {
                    // InternalDsl.g:949:2: ( ( rule__NotConstraintExpression__Group_1__0 ) )
                    // InternalDsl.g:950:3: ( rule__NotConstraintExpression__Group_1__0 )
                    {
                     before(grammarAccess.getNotConstraintExpressionAccess().getGroup_1()); 
                    // InternalDsl.g:951:3: ( rule__NotConstraintExpression__Group_1__0 )
                    // InternalDsl.g:951:4: rule__NotConstraintExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NotConstraintExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNotConstraintExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotConstraintExpression__Alternatives"


    // $ANTLR start "rule__PrimaryConstraint__Alternatives"
    // InternalDsl.g:959:1: rule__PrimaryConstraint__Alternatives : ( ( ruleConstraintRule ) | ( ( rule__PrimaryConstraint__Group_1__0 ) ) );
    public final void rule__PrimaryConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:963:1: ( ( ruleConstraintRule ) | ( ( rule__PrimaryConstraint__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=81 && LA7_0<=90)) ) {
                alt7=1;
            }
            else if ( (LA7_0==77) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:964:2: ( ruleConstraintRule )
                    {
                    // InternalDsl.g:964:2: ( ruleConstraintRule )
                    // InternalDsl.g:965:3: ruleConstraintRule
                    {
                     before(grammarAccess.getPrimaryConstraintAccess().getConstraintRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConstraintRule();

                    state._fsp--;

                     after(grammarAccess.getPrimaryConstraintAccess().getConstraintRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:970:2: ( ( rule__PrimaryConstraint__Group_1__0 ) )
                    {
                    // InternalDsl.g:970:2: ( ( rule__PrimaryConstraint__Group_1__0 ) )
                    // InternalDsl.g:971:3: ( rule__PrimaryConstraint__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryConstraintAccess().getGroup_1()); 
                    // InternalDsl.g:972:3: ( rule__PrimaryConstraint__Group_1__0 )
                    // InternalDsl.g:972:4: rule__PrimaryConstraint__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryConstraint__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryConstraintAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryConstraint__Alternatives"


    // $ANTLR start "rule__ActionEnum__Alternatives"
    // InternalDsl.g:980:1: rule__ActionEnum__Alternatives : ( ( ( 'Add' ) ) | ( ( 'Reconnect' ) ) | ( ( 'Create' ) ) | ( ( 'Start' ) ) | ( ( 'Execute' ) ) | ( ( 'Direct_Edit' ) ) | ( ( 'Add_Property' ) ) | ( ( 'Create_Attribute' ) ) | ( ( 'Create_Operation' ) ) | ( ( 'Create_Property' ) ) );
    public final void rule__ActionEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:984:1: ( ( ( 'Add' ) ) | ( ( 'Reconnect' ) ) | ( ( 'Create' ) ) | ( ( 'Start' ) ) | ( ( 'Execute' ) ) | ( ( 'Direct_Edit' ) ) | ( ( 'Add_Property' ) ) | ( ( 'Create_Attribute' ) ) | ( ( 'Create_Operation' ) ) | ( ( 'Create_Property' ) ) )
            int alt8=10;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 13:
                {
                alt8=3;
                }
                break;
            case 14:
                {
                alt8=4;
                }
                break;
            case 15:
                {
                alt8=5;
                }
                break;
            case 16:
                {
                alt8=6;
                }
                break;
            case 17:
                {
                alt8=7;
                }
                break;
            case 18:
                {
                alt8=8;
                }
                break;
            case 19:
                {
                alt8=9;
                }
                break;
            case 20:
                {
                alt8=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDsl.g:985:2: ( ( 'Add' ) )
                    {
                    // InternalDsl.g:985:2: ( ( 'Add' ) )
                    // InternalDsl.g:986:3: ( 'Add' )
                    {
                     before(grammarAccess.getActionEnumAccess().getAddEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:987:3: ( 'Add' )
                    // InternalDsl.g:987:4: 'Add'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:991:2: ( ( 'Reconnect' ) )
                    {
                    // InternalDsl.g:991:2: ( ( 'Reconnect' ) )
                    // InternalDsl.g:992:3: ( 'Reconnect' )
                    {
                     before(grammarAccess.getActionEnumAccess().getReconnectEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:993:3: ( 'Reconnect' )
                    // InternalDsl.g:993:4: 'Reconnect'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getReconnectEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:997:2: ( ( 'Create' ) )
                    {
                    // InternalDsl.g:997:2: ( ( 'Create' ) )
                    // InternalDsl.g:998:3: ( 'Create' )
                    {
                     before(grammarAccess.getActionEnumAccess().getCreateEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:999:3: ( 'Create' )
                    // InternalDsl.g:999:4: 'Create'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getCreateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1003:2: ( ( 'Start' ) )
                    {
                    // InternalDsl.g:1003:2: ( ( 'Start' ) )
                    // InternalDsl.g:1004:3: ( 'Start' )
                    {
                     before(grammarAccess.getActionEnumAccess().getStartEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:1005:3: ( 'Start' )
                    // InternalDsl.g:1005:4: 'Start'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getStartEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1009:2: ( ( 'Execute' ) )
                    {
                    // InternalDsl.g:1009:2: ( ( 'Execute' ) )
                    // InternalDsl.g:1010:3: ( 'Execute' )
                    {
                     before(grammarAccess.getActionEnumAccess().getExecuteEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:1011:3: ( 'Execute' )
                    // InternalDsl.g:1011:4: 'Execute'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getExecuteEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:1015:2: ( ( 'Direct_Edit' ) )
                    {
                    // InternalDsl.g:1015:2: ( ( 'Direct_Edit' ) )
                    // InternalDsl.g:1016:3: ( 'Direct_Edit' )
                    {
                     before(grammarAccess.getActionEnumAccess().getDirect_EditEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:1017:3: ( 'Direct_Edit' )
                    // InternalDsl.g:1017:4: 'Direct_Edit'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getDirect_EditEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:1021:2: ( ( 'Add_Property' ) )
                    {
                    // InternalDsl.g:1021:2: ( ( 'Add_Property' ) )
                    // InternalDsl.g:1022:3: ( 'Add_Property' )
                    {
                     before(grammarAccess.getActionEnumAccess().getAdd_PropertyEnumLiteralDeclaration_6()); 
                    // InternalDsl.g:1023:3: ( 'Add_Property' )
                    // InternalDsl.g:1023:4: 'Add_Property'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getAdd_PropertyEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:1027:2: ( ( 'Create_Attribute' ) )
                    {
                    // InternalDsl.g:1027:2: ( ( 'Create_Attribute' ) )
                    // InternalDsl.g:1028:3: ( 'Create_Attribute' )
                    {
                     before(grammarAccess.getActionEnumAccess().getCreate_AttributeEnumLiteralDeclaration_7()); 
                    // InternalDsl.g:1029:3: ( 'Create_Attribute' )
                    // InternalDsl.g:1029:4: 'Create_Attribute'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getCreate_AttributeEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:1033:2: ( ( 'Create_Operation' ) )
                    {
                    // InternalDsl.g:1033:2: ( ( 'Create_Operation' ) )
                    // InternalDsl.g:1034:3: ( 'Create_Operation' )
                    {
                     before(grammarAccess.getActionEnumAccess().getCreate_OperationEnumLiteralDeclaration_8()); 
                    // InternalDsl.g:1035:3: ( 'Create_Operation' )
                    // InternalDsl.g:1035:4: 'Create_Operation'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getCreate_OperationEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDsl.g:1039:2: ( ( 'Create_Property' ) )
                    {
                    // InternalDsl.g:1039:2: ( ( 'Create_Property' ) )
                    // InternalDsl.g:1040:3: ( 'Create_Property' )
                    {
                     before(grammarAccess.getActionEnumAccess().getCreate_PropertyEnumLiteralDeclaration_9()); 
                    // InternalDsl.g:1041:3: ( 'Create_Property' )
                    // InternalDsl.g:1041:4: 'Create_Property'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getCreate_PropertyEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionEnum__Alternatives"


    // $ANTLR start "rule__FeatureTypeEnum__Alternatives"
    // InternalDsl.g:1049:1: rule__FeatureTypeEnum__Alternatives : ( ( ( 'Acyclic' ) ) | ( ( 'CompartmentType' ) ) | ( ( 'Cyclic' ) ) | ( ( 'Total' ) ) | ( ( 'DataType' ) ) | ( ( 'Fulfillment' ) ) | ( ( 'Inheritance' ) ) | ( ( 'Group' ) ) | ( ( 'Reflexive' ) ) | ( ( 'Relationship' ) ) | ( ( 'RelationshipExclusion' ) ) | ( ( 'RelationshipImplication' ) ) | ( ( 'RoleType' ) ) | ( ( 'RoleEquivalence' ) ) | ( ( 'RoleGroup' ) ) | ( ( 'RoleImplication' ) ) | ( ( 'RoleProhibition' ) ) | ( ( 'Irreflexive' ) ) | ( ( 'NaturalType' ) ) );
    public final void rule__FeatureTypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1053:1: ( ( ( 'Acyclic' ) ) | ( ( 'CompartmentType' ) ) | ( ( 'Cyclic' ) ) | ( ( 'Total' ) ) | ( ( 'DataType' ) ) | ( ( 'Fulfillment' ) ) | ( ( 'Inheritance' ) ) | ( ( 'Group' ) ) | ( ( 'Reflexive' ) ) | ( ( 'Relationship' ) ) | ( ( 'RelationshipExclusion' ) ) | ( ( 'RelationshipImplication' ) ) | ( ( 'RoleType' ) ) | ( ( 'RoleEquivalence' ) ) | ( ( 'RoleGroup' ) ) | ( ( 'RoleImplication' ) ) | ( ( 'RoleProhibition' ) ) | ( ( 'Irreflexive' ) ) | ( ( 'NaturalType' ) ) )
            int alt9=19;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt9=1;
                }
                break;
            case 22:
                {
                alt9=2;
                }
                break;
            case 23:
                {
                alt9=3;
                }
                break;
            case 24:
                {
                alt9=4;
                }
                break;
            case 25:
                {
                alt9=5;
                }
                break;
            case 26:
                {
                alt9=6;
                }
                break;
            case 27:
                {
                alt9=7;
                }
                break;
            case 28:
                {
                alt9=8;
                }
                break;
            case 29:
                {
                alt9=9;
                }
                break;
            case 30:
                {
                alt9=10;
                }
                break;
            case 31:
                {
                alt9=11;
                }
                break;
            case 32:
                {
                alt9=12;
                }
                break;
            case 33:
                {
                alt9=13;
                }
                break;
            case 34:
                {
                alt9=14;
                }
                break;
            case 35:
                {
                alt9=15;
                }
                break;
            case 36:
                {
                alt9=16;
                }
                break;
            case 37:
                {
                alt9=17;
                }
                break;
            case 38:
                {
                alt9=18;
                }
                break;
            case 39:
                {
                alt9=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDsl.g:1054:2: ( ( 'Acyclic' ) )
                    {
                    // InternalDsl.g:1054:2: ( ( 'Acyclic' ) )
                    // InternalDsl.g:1055:3: ( 'Acyclic' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getAcyclicEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:1056:3: ( 'Acyclic' )
                    // InternalDsl.g:1056:4: 'Acyclic'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getAcyclicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1060:2: ( ( 'CompartmentType' ) )
                    {
                    // InternalDsl.g:1060:2: ( ( 'CompartmentType' ) )
                    // InternalDsl.g:1061:3: ( 'CompartmentType' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getCompartmentTypeEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:1062:3: ( 'CompartmentType' )
                    // InternalDsl.g:1062:4: 'CompartmentType'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getCompartmentTypeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1066:2: ( ( 'Cyclic' ) )
                    {
                    // InternalDsl.g:1066:2: ( ( 'Cyclic' ) )
                    // InternalDsl.g:1067:3: ( 'Cyclic' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getCyclicEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:1068:3: ( 'Cyclic' )
                    // InternalDsl.g:1068:4: 'Cyclic'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getCyclicEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1072:2: ( ( 'Total' ) )
                    {
                    // InternalDsl.g:1072:2: ( ( 'Total' ) )
                    // InternalDsl.g:1073:3: ( 'Total' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getTotalEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:1074:3: ( 'Total' )
                    // InternalDsl.g:1074:4: 'Total'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getTotalEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1078:2: ( ( 'DataType' ) )
                    {
                    // InternalDsl.g:1078:2: ( ( 'DataType' ) )
                    // InternalDsl.g:1079:3: ( 'DataType' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getDataTypeEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:1080:3: ( 'DataType' )
                    // InternalDsl.g:1080:4: 'DataType'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getDataTypeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:1084:2: ( ( 'Fulfillment' ) )
                    {
                    // InternalDsl.g:1084:2: ( ( 'Fulfillment' ) )
                    // InternalDsl.g:1085:3: ( 'Fulfillment' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getFulfillmentEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:1086:3: ( 'Fulfillment' )
                    // InternalDsl.g:1086:4: 'Fulfillment'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getFulfillmentEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:1090:2: ( ( 'Inheritance' ) )
                    {
                    // InternalDsl.g:1090:2: ( ( 'Inheritance' ) )
                    // InternalDsl.g:1091:3: ( 'Inheritance' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getInheritanceEnumLiteralDeclaration_6()); 
                    // InternalDsl.g:1092:3: ( 'Inheritance' )
                    // InternalDsl.g:1092:4: 'Inheritance'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getInheritanceEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:1096:2: ( ( 'Group' ) )
                    {
                    // InternalDsl.g:1096:2: ( ( 'Group' ) )
                    // InternalDsl.g:1097:3: ( 'Group' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getGroupEnumLiteralDeclaration_7()); 
                    // InternalDsl.g:1098:3: ( 'Group' )
                    // InternalDsl.g:1098:4: 'Group'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getGroupEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:1102:2: ( ( 'Reflexive' ) )
                    {
                    // InternalDsl.g:1102:2: ( ( 'Reflexive' ) )
                    // InternalDsl.g:1103:3: ( 'Reflexive' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getReflexiveEnumLiteralDeclaration_8()); 
                    // InternalDsl.g:1104:3: ( 'Reflexive' )
                    // InternalDsl.g:1104:4: 'Reflexive'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getReflexiveEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDsl.g:1108:2: ( ( 'Relationship' ) )
                    {
                    // InternalDsl.g:1108:2: ( ( 'Relationship' ) )
                    // InternalDsl.g:1109:3: ( 'Relationship' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getRelationshipEnumLiteralDeclaration_9()); 
                    // InternalDsl.g:1110:3: ( 'Relationship' )
                    // InternalDsl.g:1110:4: 'Relationship'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getRelationshipEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDsl.g:1114:2: ( ( 'RelationshipExclusion' ) )
                    {
                    // InternalDsl.g:1114:2: ( ( 'RelationshipExclusion' ) )
                    // InternalDsl.g:1115:3: ( 'RelationshipExclusion' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getRelationshipExclusionEnumLiteralDeclaration_10()); 
                    // InternalDsl.g:1116:3: ( 'RelationshipExclusion' )
                    // InternalDsl.g:1116:4: 'RelationshipExclusion'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getRelationshipExclusionEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalDsl.g:1120:2: ( ( 'RelationshipImplication' ) )
                    {
                    // InternalDsl.g:1120:2: ( ( 'RelationshipImplication' ) )
                    // InternalDsl.g:1121:3: ( 'RelationshipImplication' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getRelationshipImplicationEnumLiteralDeclaration_11()); 
                    // InternalDsl.g:1122:3: ( 'RelationshipImplication' )
                    // InternalDsl.g:1122:4: 'RelationshipImplication'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getRelationshipImplicationEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalDsl.g:1126:2: ( ( 'RoleType' ) )
                    {
                    // InternalDsl.g:1126:2: ( ( 'RoleType' ) )
                    // InternalDsl.g:1127:3: ( 'RoleType' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getRoleTypeEnumLiteralDeclaration_12()); 
                    // InternalDsl.g:1128:3: ( 'RoleType' )
                    // InternalDsl.g:1128:4: 'RoleType'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getRoleTypeEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalDsl.g:1132:2: ( ( 'RoleEquivalence' ) )
                    {
                    // InternalDsl.g:1132:2: ( ( 'RoleEquivalence' ) )
                    // InternalDsl.g:1133:3: ( 'RoleEquivalence' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getRoleEquivalenceEnumLiteralDeclaration_13()); 
                    // InternalDsl.g:1134:3: ( 'RoleEquivalence' )
                    // InternalDsl.g:1134:4: 'RoleEquivalence'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getRoleEquivalenceEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalDsl.g:1138:2: ( ( 'RoleGroup' ) )
                    {
                    // InternalDsl.g:1138:2: ( ( 'RoleGroup' ) )
                    // InternalDsl.g:1139:3: ( 'RoleGroup' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getRoleGroupEnumLiteralDeclaration_14()); 
                    // InternalDsl.g:1140:3: ( 'RoleGroup' )
                    // InternalDsl.g:1140:4: 'RoleGroup'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getRoleGroupEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalDsl.g:1144:2: ( ( 'RoleImplication' ) )
                    {
                    // InternalDsl.g:1144:2: ( ( 'RoleImplication' ) )
                    // InternalDsl.g:1145:3: ( 'RoleImplication' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getRoleImplicationEnumLiteralDeclaration_15()); 
                    // InternalDsl.g:1146:3: ( 'RoleImplication' )
                    // InternalDsl.g:1146:4: 'RoleImplication'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getRoleImplicationEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalDsl.g:1150:2: ( ( 'RoleProhibition' ) )
                    {
                    // InternalDsl.g:1150:2: ( ( 'RoleProhibition' ) )
                    // InternalDsl.g:1151:3: ( 'RoleProhibition' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getRoleProhibitionEnumLiteralDeclaration_16()); 
                    // InternalDsl.g:1152:3: ( 'RoleProhibition' )
                    // InternalDsl.g:1152:4: 'RoleProhibition'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getRoleProhibitionEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalDsl.g:1156:2: ( ( 'Irreflexive' ) )
                    {
                    // InternalDsl.g:1156:2: ( ( 'Irreflexive' ) )
                    // InternalDsl.g:1157:3: ( 'Irreflexive' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getIrreflexiveEnumLiteralDeclaration_17()); 
                    // InternalDsl.g:1158:3: ( 'Irreflexive' )
                    // InternalDsl.g:1158:4: 'Irreflexive'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getIrreflexiveEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalDsl.g:1162:2: ( ( 'NaturalType' ) )
                    {
                    // InternalDsl.g:1162:2: ( ( 'NaturalType' ) )
                    // InternalDsl.g:1163:3: ( 'NaturalType' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getNaturalTypeEnumLiteralDeclaration_18()); 
                    // InternalDsl.g:1164:3: ( 'NaturalType' )
                    // InternalDsl.g:1164:4: 'NaturalType'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getNaturalTypeEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureTypeEnum__Alternatives"


    // $ANTLR start "rule__FeatureNameEnum__Alternatives"
    // InternalDsl.g:1172:1: rule__FeatureNameEnum__Alternatives : ( ( ( 'Compartment_Behavior' ) ) | ( ( 'Compartment_Inheritance' ) ) | ( ( 'Compartment_Properties' ) ) | ( ( 'Compartment_Structure' ) ) | ( ( 'Compartment_Types' ) ) | ( ( 'Contains_Compartments' ) ) | ( ( 'Compartments' ) ) | ( ( 'Data_Type_Inheritance' ) ) | ( ( 'Data_Types' ) ) | ( ( 'Dates' ) ) | ( ( 'Dependent' ) ) | ( ( 'Group_Constraints' ) ) | ( ( 'Inter_Relationship_Constraints' ) ) | ( ( 'Intra_Relationship_Constraints' ) ) | ( ( 'Naturals' ) ) | ( ( 'Occurrence_Constraints' ) ) | ( ( 'On_Compartments' ) ) | ( ( 'On_Relationships' ) ) | ( ( 'Parthood_Constraints' ) ) | ( ( 'Participants' ) ) | ( ( 'Playable' ) ) | ( ( 'Playable_by_Defining_Compartment' ) ) | ( ( 'Players' ) ) | ( ( 'Relationship_Cardinality' ) ) | ( ( 'Relationship_Constraints' ) ) | ( ( 'Relationships' ) ) | ( ( 'RML_Feature_Model' ) ) | ( ( 'Role_Behavior' ) ) | ( ( 'Role_Constraints' ) ) | ( ( 'Role_Equivalence' ) ) | ( ( 'Role_Implication' ) ) | ( ( 'Role_Inheritance' ) ) | ( ( 'Role_Prohibition' ) ) | ( ( 'Role_Properties' ) ) | ( ( 'Role_Structure' ) ) | ( ( 'Role_Types' ) ) | ( ( 'Roles' ) ) );
    public final void rule__FeatureNameEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1176:1: ( ( ( 'Compartment_Behavior' ) ) | ( ( 'Compartment_Inheritance' ) ) | ( ( 'Compartment_Properties' ) ) | ( ( 'Compartment_Structure' ) ) | ( ( 'Compartment_Types' ) ) | ( ( 'Contains_Compartments' ) ) | ( ( 'Compartments' ) ) | ( ( 'Data_Type_Inheritance' ) ) | ( ( 'Data_Types' ) ) | ( ( 'Dates' ) ) | ( ( 'Dependent' ) ) | ( ( 'Group_Constraints' ) ) | ( ( 'Inter_Relationship_Constraints' ) ) | ( ( 'Intra_Relationship_Constraints' ) ) | ( ( 'Naturals' ) ) | ( ( 'Occurrence_Constraints' ) ) | ( ( 'On_Compartments' ) ) | ( ( 'On_Relationships' ) ) | ( ( 'Parthood_Constraints' ) ) | ( ( 'Participants' ) ) | ( ( 'Playable' ) ) | ( ( 'Playable_by_Defining_Compartment' ) ) | ( ( 'Players' ) ) | ( ( 'Relationship_Cardinality' ) ) | ( ( 'Relationship_Constraints' ) ) | ( ( 'Relationships' ) ) | ( ( 'RML_Feature_Model' ) ) | ( ( 'Role_Behavior' ) ) | ( ( 'Role_Constraints' ) ) | ( ( 'Role_Equivalence' ) ) | ( ( 'Role_Implication' ) ) | ( ( 'Role_Inheritance' ) ) | ( ( 'Role_Prohibition' ) ) | ( ( 'Role_Properties' ) ) | ( ( 'Role_Structure' ) ) | ( ( 'Role_Types' ) ) | ( ( 'Roles' ) ) )
            int alt10=37;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt10=1;
                }
                break;
            case 41:
                {
                alt10=2;
                }
                break;
            case 42:
                {
                alt10=3;
                }
                break;
            case 43:
                {
                alt10=4;
                }
                break;
            case 44:
                {
                alt10=5;
                }
                break;
            case 45:
                {
                alt10=6;
                }
                break;
            case 46:
                {
                alt10=7;
                }
                break;
            case 47:
                {
                alt10=8;
                }
                break;
            case 48:
                {
                alt10=9;
                }
                break;
            case 49:
                {
                alt10=10;
                }
                break;
            case 50:
                {
                alt10=11;
                }
                break;
            case 51:
                {
                alt10=12;
                }
                break;
            case 52:
                {
                alt10=13;
                }
                break;
            case 53:
                {
                alt10=14;
                }
                break;
            case 54:
                {
                alt10=15;
                }
                break;
            case 55:
                {
                alt10=16;
                }
                break;
            case 56:
                {
                alt10=17;
                }
                break;
            case 57:
                {
                alt10=18;
                }
                break;
            case 58:
                {
                alt10=19;
                }
                break;
            case 59:
                {
                alt10=20;
                }
                break;
            case 60:
                {
                alt10=21;
                }
                break;
            case 61:
                {
                alt10=22;
                }
                break;
            case 62:
                {
                alt10=23;
                }
                break;
            case 63:
                {
                alt10=24;
                }
                break;
            case 64:
                {
                alt10=25;
                }
                break;
            case 65:
                {
                alt10=26;
                }
                break;
            case 66:
                {
                alt10=27;
                }
                break;
            case 67:
                {
                alt10=28;
                }
                break;
            case 68:
                {
                alt10=29;
                }
                break;
            case 69:
                {
                alt10=30;
                }
                break;
            case 70:
                {
                alt10=31;
                }
                break;
            case 71:
                {
                alt10=32;
                }
                break;
            case 72:
                {
                alt10=33;
                }
                break;
            case 73:
                {
                alt10=34;
                }
                break;
            case 74:
                {
                alt10=35;
                }
                break;
            case 75:
                {
                alt10=36;
                }
                break;
            case 76:
                {
                alt10=37;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDsl.g:1177:2: ( ( 'Compartment_Behavior' ) )
                    {
                    // InternalDsl.g:1177:2: ( ( 'Compartment_Behavior' ) )
                    // InternalDsl.g:1178:3: ( 'Compartment_Behavior' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getCompartment_BehaviorEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:1179:3: ( 'Compartment_Behavior' )
                    // InternalDsl.g:1179:4: 'Compartment_Behavior'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getCompartment_BehaviorEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1183:2: ( ( 'Compartment_Inheritance' ) )
                    {
                    // InternalDsl.g:1183:2: ( ( 'Compartment_Inheritance' ) )
                    // InternalDsl.g:1184:3: ( 'Compartment_Inheritance' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getCompartment_InheritanceEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:1185:3: ( 'Compartment_Inheritance' )
                    // InternalDsl.g:1185:4: 'Compartment_Inheritance'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getCompartment_InheritanceEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1189:2: ( ( 'Compartment_Properties' ) )
                    {
                    // InternalDsl.g:1189:2: ( ( 'Compartment_Properties' ) )
                    // InternalDsl.g:1190:3: ( 'Compartment_Properties' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getCompartment_PropertiesEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:1191:3: ( 'Compartment_Properties' )
                    // InternalDsl.g:1191:4: 'Compartment_Properties'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getCompartment_PropertiesEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1195:2: ( ( 'Compartment_Structure' ) )
                    {
                    // InternalDsl.g:1195:2: ( ( 'Compartment_Structure' ) )
                    // InternalDsl.g:1196:3: ( 'Compartment_Structure' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getCompartment_StructureEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:1197:3: ( 'Compartment_Structure' )
                    // InternalDsl.g:1197:4: 'Compartment_Structure'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getCompartment_StructureEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1201:2: ( ( 'Compartment_Types' ) )
                    {
                    // InternalDsl.g:1201:2: ( ( 'Compartment_Types' ) )
                    // InternalDsl.g:1202:3: ( 'Compartment_Types' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getCompartment_TypesEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:1203:3: ( 'Compartment_Types' )
                    // InternalDsl.g:1203:4: 'Compartment_Types'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getCompartment_TypesEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:1207:2: ( ( 'Contains_Compartments' ) )
                    {
                    // InternalDsl.g:1207:2: ( ( 'Contains_Compartments' ) )
                    // InternalDsl.g:1208:3: ( 'Contains_Compartments' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getContains_CompartmentsEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:1209:3: ( 'Contains_Compartments' )
                    // InternalDsl.g:1209:4: 'Contains_Compartments'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getContains_CompartmentsEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:1213:2: ( ( 'Compartments' ) )
                    {
                    // InternalDsl.g:1213:2: ( ( 'Compartments' ) )
                    // InternalDsl.g:1214:3: ( 'Compartments' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getCompartmentsEnumLiteralDeclaration_6()); 
                    // InternalDsl.g:1215:3: ( 'Compartments' )
                    // InternalDsl.g:1215:4: 'Compartments'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getCompartmentsEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:1219:2: ( ( 'Data_Type_Inheritance' ) )
                    {
                    // InternalDsl.g:1219:2: ( ( 'Data_Type_Inheritance' ) )
                    // InternalDsl.g:1220:3: ( 'Data_Type_Inheritance' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getData_Type_InheritanceEnumLiteralDeclaration_7()); 
                    // InternalDsl.g:1221:3: ( 'Data_Type_Inheritance' )
                    // InternalDsl.g:1221:4: 'Data_Type_Inheritance'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getData_Type_InheritanceEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:1225:2: ( ( 'Data_Types' ) )
                    {
                    // InternalDsl.g:1225:2: ( ( 'Data_Types' ) )
                    // InternalDsl.g:1226:3: ( 'Data_Types' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getData_TypesEnumLiteralDeclaration_8()); 
                    // InternalDsl.g:1227:3: ( 'Data_Types' )
                    // InternalDsl.g:1227:4: 'Data_Types'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getData_TypesEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDsl.g:1231:2: ( ( 'Dates' ) )
                    {
                    // InternalDsl.g:1231:2: ( ( 'Dates' ) )
                    // InternalDsl.g:1232:3: ( 'Dates' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getDatesEnumLiteralDeclaration_9()); 
                    // InternalDsl.g:1233:3: ( 'Dates' )
                    // InternalDsl.g:1233:4: 'Dates'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getDatesEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDsl.g:1237:2: ( ( 'Dependent' ) )
                    {
                    // InternalDsl.g:1237:2: ( ( 'Dependent' ) )
                    // InternalDsl.g:1238:3: ( 'Dependent' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getDependentEnumLiteralDeclaration_10()); 
                    // InternalDsl.g:1239:3: ( 'Dependent' )
                    // InternalDsl.g:1239:4: 'Dependent'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getDependentEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalDsl.g:1243:2: ( ( 'Group_Constraints' ) )
                    {
                    // InternalDsl.g:1243:2: ( ( 'Group_Constraints' ) )
                    // InternalDsl.g:1244:3: ( 'Group_Constraints' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getGroup_ConstraintsEnumLiteralDeclaration_11()); 
                    // InternalDsl.g:1245:3: ( 'Group_Constraints' )
                    // InternalDsl.g:1245:4: 'Group_Constraints'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getGroup_ConstraintsEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalDsl.g:1249:2: ( ( 'Inter_Relationship_Constraints' ) )
                    {
                    // InternalDsl.g:1249:2: ( ( 'Inter_Relationship_Constraints' ) )
                    // InternalDsl.g:1250:3: ( 'Inter_Relationship_Constraints' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getInter_Relationship_ConstraintsEnumLiteralDeclaration_12()); 
                    // InternalDsl.g:1251:3: ( 'Inter_Relationship_Constraints' )
                    // InternalDsl.g:1251:4: 'Inter_Relationship_Constraints'
                    {
                    match(input,52,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getInter_Relationship_ConstraintsEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalDsl.g:1255:2: ( ( 'Intra_Relationship_Constraints' ) )
                    {
                    // InternalDsl.g:1255:2: ( ( 'Intra_Relationship_Constraints' ) )
                    // InternalDsl.g:1256:3: ( 'Intra_Relationship_Constraints' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getIntra_Relationship_ConstraintsEnumLiteralDeclaration_13()); 
                    // InternalDsl.g:1257:3: ( 'Intra_Relationship_Constraints' )
                    // InternalDsl.g:1257:4: 'Intra_Relationship_Constraints'
                    {
                    match(input,53,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getIntra_Relationship_ConstraintsEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalDsl.g:1261:2: ( ( 'Naturals' ) )
                    {
                    // InternalDsl.g:1261:2: ( ( 'Naturals' ) )
                    // InternalDsl.g:1262:3: ( 'Naturals' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getNaturalsEnumLiteralDeclaration_14()); 
                    // InternalDsl.g:1263:3: ( 'Naturals' )
                    // InternalDsl.g:1263:4: 'Naturals'
                    {
                    match(input,54,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getNaturalsEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalDsl.g:1267:2: ( ( 'Occurrence_Constraints' ) )
                    {
                    // InternalDsl.g:1267:2: ( ( 'Occurrence_Constraints' ) )
                    // InternalDsl.g:1268:3: ( 'Occurrence_Constraints' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getOccurrence_ConstraintsEnumLiteralDeclaration_15()); 
                    // InternalDsl.g:1269:3: ( 'Occurrence_Constraints' )
                    // InternalDsl.g:1269:4: 'Occurrence_Constraints'
                    {
                    match(input,55,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getOccurrence_ConstraintsEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalDsl.g:1273:2: ( ( 'On_Compartments' ) )
                    {
                    // InternalDsl.g:1273:2: ( ( 'On_Compartments' ) )
                    // InternalDsl.g:1274:3: ( 'On_Compartments' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getOn_CompartmentsEnumLiteralDeclaration_16()); 
                    // InternalDsl.g:1275:3: ( 'On_Compartments' )
                    // InternalDsl.g:1275:4: 'On_Compartments'
                    {
                    match(input,56,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getOn_CompartmentsEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalDsl.g:1279:2: ( ( 'On_Relationships' ) )
                    {
                    // InternalDsl.g:1279:2: ( ( 'On_Relationships' ) )
                    // InternalDsl.g:1280:3: ( 'On_Relationships' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getOn_RelationshipsEnumLiteralDeclaration_17()); 
                    // InternalDsl.g:1281:3: ( 'On_Relationships' )
                    // InternalDsl.g:1281:4: 'On_Relationships'
                    {
                    match(input,57,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getOn_RelationshipsEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalDsl.g:1285:2: ( ( 'Parthood_Constraints' ) )
                    {
                    // InternalDsl.g:1285:2: ( ( 'Parthood_Constraints' ) )
                    // InternalDsl.g:1286:3: ( 'Parthood_Constraints' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getParthood_ConstraintsEnumLiteralDeclaration_18()); 
                    // InternalDsl.g:1287:3: ( 'Parthood_Constraints' )
                    // InternalDsl.g:1287:4: 'Parthood_Constraints'
                    {
                    match(input,58,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getParthood_ConstraintsEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalDsl.g:1291:2: ( ( 'Participants' ) )
                    {
                    // InternalDsl.g:1291:2: ( ( 'Participants' ) )
                    // InternalDsl.g:1292:3: ( 'Participants' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getParticipantsEnumLiteralDeclaration_19()); 
                    // InternalDsl.g:1293:3: ( 'Participants' )
                    // InternalDsl.g:1293:4: 'Participants'
                    {
                    match(input,59,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getParticipantsEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalDsl.g:1297:2: ( ( 'Playable' ) )
                    {
                    // InternalDsl.g:1297:2: ( ( 'Playable' ) )
                    // InternalDsl.g:1298:3: ( 'Playable' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getPlayableEnumLiteralDeclaration_20()); 
                    // InternalDsl.g:1299:3: ( 'Playable' )
                    // InternalDsl.g:1299:4: 'Playable'
                    {
                    match(input,60,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getPlayableEnumLiteralDeclaration_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalDsl.g:1303:2: ( ( 'Playable_by_Defining_Compartment' ) )
                    {
                    // InternalDsl.g:1303:2: ( ( 'Playable_by_Defining_Compartment' ) )
                    // InternalDsl.g:1304:3: ( 'Playable_by_Defining_Compartment' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getPlayable_by_Defining_CompartmentEnumLiteralDeclaration_21()); 
                    // InternalDsl.g:1305:3: ( 'Playable_by_Defining_Compartment' )
                    // InternalDsl.g:1305:4: 'Playable_by_Defining_Compartment'
                    {
                    match(input,61,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getPlayable_by_Defining_CompartmentEnumLiteralDeclaration_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalDsl.g:1309:2: ( ( 'Players' ) )
                    {
                    // InternalDsl.g:1309:2: ( ( 'Players' ) )
                    // InternalDsl.g:1310:3: ( 'Players' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getPlayersEnumLiteralDeclaration_22()); 
                    // InternalDsl.g:1311:3: ( 'Players' )
                    // InternalDsl.g:1311:4: 'Players'
                    {
                    match(input,62,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getPlayersEnumLiteralDeclaration_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalDsl.g:1315:2: ( ( 'Relationship_Cardinality' ) )
                    {
                    // InternalDsl.g:1315:2: ( ( 'Relationship_Cardinality' ) )
                    // InternalDsl.g:1316:3: ( 'Relationship_Cardinality' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRelationship_CardinalityEnumLiteralDeclaration_23()); 
                    // InternalDsl.g:1317:3: ( 'Relationship_Cardinality' )
                    // InternalDsl.g:1317:4: 'Relationship_Cardinality'
                    {
                    match(input,63,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRelationship_CardinalityEnumLiteralDeclaration_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalDsl.g:1321:2: ( ( 'Relationship_Constraints' ) )
                    {
                    // InternalDsl.g:1321:2: ( ( 'Relationship_Constraints' ) )
                    // InternalDsl.g:1322:3: ( 'Relationship_Constraints' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRelationship_ConstraintsEnumLiteralDeclaration_24()); 
                    // InternalDsl.g:1323:3: ( 'Relationship_Constraints' )
                    // InternalDsl.g:1323:4: 'Relationship_Constraints'
                    {
                    match(input,64,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRelationship_ConstraintsEnumLiteralDeclaration_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalDsl.g:1327:2: ( ( 'Relationships' ) )
                    {
                    // InternalDsl.g:1327:2: ( ( 'Relationships' ) )
                    // InternalDsl.g:1328:3: ( 'Relationships' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRelationshipsEnumLiteralDeclaration_25()); 
                    // InternalDsl.g:1329:3: ( 'Relationships' )
                    // InternalDsl.g:1329:4: 'Relationships'
                    {
                    match(input,65,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRelationshipsEnumLiteralDeclaration_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalDsl.g:1333:2: ( ( 'RML_Feature_Model' ) )
                    {
                    // InternalDsl.g:1333:2: ( ( 'RML_Feature_Model' ) )
                    // InternalDsl.g:1334:3: ( 'RML_Feature_Model' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRML_Feature_ModelEnumLiteralDeclaration_26()); 
                    // InternalDsl.g:1335:3: ( 'RML_Feature_Model' )
                    // InternalDsl.g:1335:4: 'RML_Feature_Model'
                    {
                    match(input,66,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRML_Feature_ModelEnumLiteralDeclaration_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalDsl.g:1339:2: ( ( 'Role_Behavior' ) )
                    {
                    // InternalDsl.g:1339:2: ( ( 'Role_Behavior' ) )
                    // InternalDsl.g:1340:3: ( 'Role_Behavior' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRole_BehaviorEnumLiteralDeclaration_27()); 
                    // InternalDsl.g:1341:3: ( 'Role_Behavior' )
                    // InternalDsl.g:1341:4: 'Role_Behavior'
                    {
                    match(input,67,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRole_BehaviorEnumLiteralDeclaration_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalDsl.g:1345:2: ( ( 'Role_Constraints' ) )
                    {
                    // InternalDsl.g:1345:2: ( ( 'Role_Constraints' ) )
                    // InternalDsl.g:1346:3: ( 'Role_Constraints' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRole_ConstraintsEnumLiteralDeclaration_28()); 
                    // InternalDsl.g:1347:3: ( 'Role_Constraints' )
                    // InternalDsl.g:1347:4: 'Role_Constraints'
                    {
                    match(input,68,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRole_ConstraintsEnumLiteralDeclaration_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalDsl.g:1351:2: ( ( 'Role_Equivalence' ) )
                    {
                    // InternalDsl.g:1351:2: ( ( 'Role_Equivalence' ) )
                    // InternalDsl.g:1352:3: ( 'Role_Equivalence' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRole_EquivalenceEnumLiteralDeclaration_29()); 
                    // InternalDsl.g:1353:3: ( 'Role_Equivalence' )
                    // InternalDsl.g:1353:4: 'Role_Equivalence'
                    {
                    match(input,69,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRole_EquivalenceEnumLiteralDeclaration_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalDsl.g:1357:2: ( ( 'Role_Implication' ) )
                    {
                    // InternalDsl.g:1357:2: ( ( 'Role_Implication' ) )
                    // InternalDsl.g:1358:3: ( 'Role_Implication' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRole_ImplicationEnumLiteralDeclaration_30()); 
                    // InternalDsl.g:1359:3: ( 'Role_Implication' )
                    // InternalDsl.g:1359:4: 'Role_Implication'
                    {
                    match(input,70,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRole_ImplicationEnumLiteralDeclaration_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalDsl.g:1363:2: ( ( 'Role_Inheritance' ) )
                    {
                    // InternalDsl.g:1363:2: ( ( 'Role_Inheritance' ) )
                    // InternalDsl.g:1364:3: ( 'Role_Inheritance' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRole_InheritanceEnumLiteralDeclaration_31()); 
                    // InternalDsl.g:1365:3: ( 'Role_Inheritance' )
                    // InternalDsl.g:1365:4: 'Role_Inheritance'
                    {
                    match(input,71,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRole_InheritanceEnumLiteralDeclaration_31()); 

                    }


                    }
                    break;
                case 33 :
                    // InternalDsl.g:1369:2: ( ( 'Role_Prohibition' ) )
                    {
                    // InternalDsl.g:1369:2: ( ( 'Role_Prohibition' ) )
                    // InternalDsl.g:1370:3: ( 'Role_Prohibition' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRole_ProhibitionEnumLiteralDeclaration_32()); 
                    // InternalDsl.g:1371:3: ( 'Role_Prohibition' )
                    // InternalDsl.g:1371:4: 'Role_Prohibition'
                    {
                    match(input,72,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRole_ProhibitionEnumLiteralDeclaration_32()); 

                    }


                    }
                    break;
                case 34 :
                    // InternalDsl.g:1375:2: ( ( 'Role_Properties' ) )
                    {
                    // InternalDsl.g:1375:2: ( ( 'Role_Properties' ) )
                    // InternalDsl.g:1376:3: ( 'Role_Properties' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRole_PropertiesEnumLiteralDeclaration_33()); 
                    // InternalDsl.g:1377:3: ( 'Role_Properties' )
                    // InternalDsl.g:1377:4: 'Role_Properties'
                    {
                    match(input,73,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRole_PropertiesEnumLiteralDeclaration_33()); 

                    }


                    }
                    break;
                case 35 :
                    // InternalDsl.g:1381:2: ( ( 'Role_Structure' ) )
                    {
                    // InternalDsl.g:1381:2: ( ( 'Role_Structure' ) )
                    // InternalDsl.g:1382:3: ( 'Role_Structure' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRole_StructureEnumLiteralDeclaration_34()); 
                    // InternalDsl.g:1383:3: ( 'Role_Structure' )
                    // InternalDsl.g:1383:4: 'Role_Structure'
                    {
                    match(input,74,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRole_StructureEnumLiteralDeclaration_34()); 

                    }


                    }
                    break;
                case 36 :
                    // InternalDsl.g:1387:2: ( ( 'Role_Types' ) )
                    {
                    // InternalDsl.g:1387:2: ( ( 'Role_Types' ) )
                    // InternalDsl.g:1388:3: ( 'Role_Types' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRole_TypesEnumLiteralDeclaration_35()); 
                    // InternalDsl.g:1389:3: ( 'Role_Types' )
                    // InternalDsl.g:1389:4: 'Role_Types'
                    {
                    match(input,75,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRole_TypesEnumLiteralDeclaration_35()); 

                    }


                    }
                    break;
                case 37 :
                    // InternalDsl.g:1393:2: ( ( 'Roles' ) )
                    {
                    // InternalDsl.g:1393:2: ( ( 'Roles' ) )
                    // InternalDsl.g:1394:3: ( 'Roles' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRolesEnumLiteralDeclaration_36()); 
                    // InternalDsl.g:1395:3: ( 'Roles' )
                    // InternalDsl.g:1395:4: 'Roles'
                    {
                    match(input,76,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRolesEnumLiteralDeclaration_36()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureNameEnum__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalDsl.g:1403:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1407:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDsl.g:1408:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalDsl.g:1415:1: rule__Model__Group__0__Impl : ( ( rule__Model__PoliciesAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1419:1: ( ( ( rule__Model__PoliciesAssignment_0 ) ) )
            // InternalDsl.g:1420:1: ( ( rule__Model__PoliciesAssignment_0 ) )
            {
            // InternalDsl.g:1420:1: ( ( rule__Model__PoliciesAssignment_0 ) )
            // InternalDsl.g:1421:2: ( rule__Model__PoliciesAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getPoliciesAssignment_0()); 
            // InternalDsl.g:1422:2: ( rule__Model__PoliciesAssignment_0 )
            // InternalDsl.g:1422:3: rule__Model__PoliciesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__PoliciesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPoliciesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalDsl.g:1430:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1434:1: ( rule__Model__Group__1__Impl )
            // InternalDsl.g:1435:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalDsl.g:1441:1: rule__Model__Group__1__Impl : ( ( rule__Model__PoliciesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1445:1: ( ( ( rule__Model__PoliciesAssignment_1 )* ) )
            // InternalDsl.g:1446:1: ( ( rule__Model__PoliciesAssignment_1 )* )
            {
            // InternalDsl.g:1446:1: ( ( rule__Model__PoliciesAssignment_1 )* )
            // InternalDsl.g:1447:2: ( rule__Model__PoliciesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getPoliciesAssignment_1()); 
            // InternalDsl.g:1448:2: ( rule__Model__PoliciesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=11 && LA11_0<=20)||LA11_0==95) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:1448:3: rule__Model__PoliciesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__PoliciesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPoliciesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Policy__Group__0"
    // InternalDsl.g:1457:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1461:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // InternalDsl.g:1462:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Policy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__0"


    // $ANTLR start "rule__Policy__Group__0__Impl"
    // InternalDsl.g:1469:1: rule__Policy__Group__0__Impl : ( ( rule__Policy__OverrideAssignment_0 )? ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1473:1: ( ( ( rule__Policy__OverrideAssignment_0 )? ) )
            // InternalDsl.g:1474:1: ( ( rule__Policy__OverrideAssignment_0 )? )
            {
            // InternalDsl.g:1474:1: ( ( rule__Policy__OverrideAssignment_0 )? )
            // InternalDsl.g:1475:2: ( rule__Policy__OverrideAssignment_0 )?
            {
             before(grammarAccess.getPolicyAccess().getOverrideAssignment_0()); 
            // InternalDsl.g:1476:2: ( rule__Policy__OverrideAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==95) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:1476:3: rule__Policy__OverrideAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Policy__OverrideAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPolicyAccess().getOverrideAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__0__Impl"


    // $ANTLR start "rule__Policy__Group__1"
    // InternalDsl.g:1484:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1488:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // InternalDsl.g:1489:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Policy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__1"


    // $ANTLR start "rule__Policy__Group__1__Impl"
    // InternalDsl.g:1496:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__ActionAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1500:1: ( ( ( rule__Policy__ActionAssignment_1 ) ) )
            // InternalDsl.g:1501:1: ( ( rule__Policy__ActionAssignment_1 ) )
            {
            // InternalDsl.g:1501:1: ( ( rule__Policy__ActionAssignment_1 ) )
            // InternalDsl.g:1502:2: ( rule__Policy__ActionAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getActionAssignment_1()); 
            // InternalDsl.g:1503:2: ( rule__Policy__ActionAssignment_1 )
            // InternalDsl.g:1503:3: rule__Policy__ActionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Policy__ActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getActionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__1__Impl"


    // $ANTLR start "rule__Policy__Group__2"
    // InternalDsl.g:1511:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1515:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // InternalDsl.g:1516:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Policy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__2"


    // $ANTLR start "rule__Policy__Group__2__Impl"
    // InternalDsl.g:1523:1: rule__Policy__Group__2__Impl : ( ( rule__Policy__ActionTypeAssignment_2 ) ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1527:1: ( ( ( rule__Policy__ActionTypeAssignment_2 ) ) )
            // InternalDsl.g:1528:1: ( ( rule__Policy__ActionTypeAssignment_2 ) )
            {
            // InternalDsl.g:1528:1: ( ( rule__Policy__ActionTypeAssignment_2 ) )
            // InternalDsl.g:1529:2: ( rule__Policy__ActionTypeAssignment_2 )
            {
             before(grammarAccess.getPolicyAccess().getActionTypeAssignment_2()); 
            // InternalDsl.g:1530:2: ( rule__Policy__ActionTypeAssignment_2 )
            // InternalDsl.g:1530:3: rule__Policy__ActionTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Policy__ActionTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getActionTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__2__Impl"


    // $ANTLR start "rule__Policy__Group__3"
    // InternalDsl.g:1538:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl rule__Policy__Group__4 ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1542:1: ( rule__Policy__Group__3__Impl rule__Policy__Group__4 )
            // InternalDsl.g:1543:2: rule__Policy__Group__3__Impl rule__Policy__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Policy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__3"


    // $ANTLR start "rule__Policy__Group__3__Impl"
    // InternalDsl.g:1550:1: rule__Policy__Group__3__Impl : ( '(' ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1554:1: ( ( '(' ) )
            // InternalDsl.g:1555:1: ( '(' )
            {
            // InternalDsl.g:1555:1: ( '(' )
            // InternalDsl.g:1556:2: '('
            {
             before(grammarAccess.getPolicyAccess().getLeftParenthesisKeyword_3()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__3__Impl"


    // $ANTLR start "rule__Policy__Group__4"
    // InternalDsl.g:1565:1: rule__Policy__Group__4 : rule__Policy__Group__4__Impl rule__Policy__Group__5 ;
    public final void rule__Policy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1569:1: ( rule__Policy__Group__4__Impl rule__Policy__Group__5 )
            // InternalDsl.g:1570:2: rule__Policy__Group__4__Impl rule__Policy__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Policy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__4"


    // $ANTLR start "rule__Policy__Group__4__Impl"
    // InternalDsl.g:1577:1: rule__Policy__Group__4__Impl : ( ( rule__Policy__FeatureRuleAssignment_4 ) ) ;
    public final void rule__Policy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1581:1: ( ( ( rule__Policy__FeatureRuleAssignment_4 ) ) )
            // InternalDsl.g:1582:1: ( ( rule__Policy__FeatureRuleAssignment_4 ) )
            {
            // InternalDsl.g:1582:1: ( ( rule__Policy__FeatureRuleAssignment_4 ) )
            // InternalDsl.g:1583:2: ( rule__Policy__FeatureRuleAssignment_4 )
            {
             before(grammarAccess.getPolicyAccess().getFeatureRuleAssignment_4()); 
            // InternalDsl.g:1584:2: ( rule__Policy__FeatureRuleAssignment_4 )
            // InternalDsl.g:1584:3: rule__Policy__FeatureRuleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Policy__FeatureRuleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getFeatureRuleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__4__Impl"


    // $ANTLR start "rule__Policy__Group__5"
    // InternalDsl.g:1592:1: rule__Policy__Group__5 : rule__Policy__Group__5__Impl rule__Policy__Group__6 ;
    public final void rule__Policy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1596:1: ( rule__Policy__Group__5__Impl rule__Policy__Group__6 )
            // InternalDsl.g:1597:2: rule__Policy__Group__5__Impl rule__Policy__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Policy__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__5"


    // $ANTLR start "rule__Policy__Group__5__Impl"
    // InternalDsl.g:1604:1: rule__Policy__Group__5__Impl : ( ')' ) ;
    public final void rule__Policy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1608:1: ( ( ')' ) )
            // InternalDsl.g:1609:1: ( ')' )
            {
            // InternalDsl.g:1609:1: ( ')' )
            // InternalDsl.g:1610:2: ')'
            {
             before(grammarAccess.getPolicyAccess().getRightParenthesisKeyword_5()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__5__Impl"


    // $ANTLR start "rule__Policy__Group__6"
    // InternalDsl.g:1619:1: rule__Policy__Group__6 : rule__Policy__Group__6__Impl rule__Policy__Group__7 ;
    public final void rule__Policy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1623:1: ( rule__Policy__Group__6__Impl rule__Policy__Group__7 )
            // InternalDsl.g:1624:2: rule__Policy__Group__6__Impl rule__Policy__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Policy__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__6"


    // $ANTLR start "rule__Policy__Group__6__Impl"
    // InternalDsl.g:1631:1: rule__Policy__Group__6__Impl : ( 'when' ) ;
    public final void rule__Policy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1635:1: ( ( 'when' ) )
            // InternalDsl.g:1636:1: ( 'when' )
            {
            // InternalDsl.g:1636:1: ( 'when' )
            // InternalDsl.g:1637:2: 'when'
            {
             before(grammarAccess.getPolicyAccess().getWhenKeyword_6()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getWhenKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__6__Impl"


    // $ANTLR start "rule__Policy__Group__7"
    // InternalDsl.g:1646:1: rule__Policy__Group__7 : rule__Policy__Group__7__Impl rule__Policy__Group__8 ;
    public final void rule__Policy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1650:1: ( rule__Policy__Group__7__Impl rule__Policy__Group__8 )
            // InternalDsl.g:1651:2: rule__Policy__Group__7__Impl rule__Policy__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Policy__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__7"


    // $ANTLR start "rule__Policy__Group__7__Impl"
    // InternalDsl.g:1658:1: rule__Policy__Group__7__Impl : ( ( rule__Policy__ConstraintRuleAssignment_7 ) ) ;
    public final void rule__Policy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1662:1: ( ( ( rule__Policy__ConstraintRuleAssignment_7 ) ) )
            // InternalDsl.g:1663:1: ( ( rule__Policy__ConstraintRuleAssignment_7 ) )
            {
            // InternalDsl.g:1663:1: ( ( rule__Policy__ConstraintRuleAssignment_7 ) )
            // InternalDsl.g:1664:2: ( rule__Policy__ConstraintRuleAssignment_7 )
            {
             before(grammarAccess.getPolicyAccess().getConstraintRuleAssignment_7()); 
            // InternalDsl.g:1665:2: ( rule__Policy__ConstraintRuleAssignment_7 )
            // InternalDsl.g:1665:3: rule__Policy__ConstraintRuleAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Policy__ConstraintRuleAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getConstraintRuleAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__7__Impl"


    // $ANTLR start "rule__Policy__Group__8"
    // InternalDsl.g:1673:1: rule__Policy__Group__8 : rule__Policy__Group__8__Impl ;
    public final void rule__Policy__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1677:1: ( rule__Policy__Group__8__Impl )
            // InternalDsl.g:1678:2: rule__Policy__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__8"


    // $ANTLR start "rule__Policy__Group__8__Impl"
    // InternalDsl.g:1684:1: rule__Policy__Group__8__Impl : ( ';' ) ;
    public final void rule__Policy__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1688:1: ( ( ';' ) )
            // InternalDsl.g:1689:1: ( ';' )
            {
            // InternalDsl.g:1689:1: ( ';' )
            // InternalDsl.g:1690:2: ';'
            {
             before(grammarAccess.getPolicyAccess().getSemicolonKeyword_8()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__8__Impl"


    // $ANTLR start "rule__ContainsCompartmentConstrainRule__Group__0"
    // InternalDsl.g:1700:1: rule__ContainsCompartmentConstrainRule__Group__0 : rule__ContainsCompartmentConstrainRule__Group__0__Impl rule__ContainsCompartmentConstrainRule__Group__1 ;
    public final void rule__ContainsCompartmentConstrainRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1704:1: ( rule__ContainsCompartmentConstrainRule__Group__0__Impl rule__ContainsCompartmentConstrainRule__Group__1 )
            // InternalDsl.g:1705:2: rule__ContainsCompartmentConstrainRule__Group__0__Impl rule__ContainsCompartmentConstrainRule__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ContainsCompartmentConstrainRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainsCompartmentConstrainRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainsCompartmentConstrainRule__Group__0"


    // $ANTLR start "rule__ContainsCompartmentConstrainRule__Group__0__Impl"
    // InternalDsl.g:1712:1: rule__ContainsCompartmentConstrainRule__Group__0__Impl : ( () ) ;
    public final void rule__ContainsCompartmentConstrainRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1716:1: ( ( () ) )
            // InternalDsl.g:1717:1: ( () )
            {
            // InternalDsl.g:1717:1: ( () )
            // InternalDsl.g:1718:2: ()
            {
             before(grammarAccess.getContainsCompartmentConstrainRuleAccess().getContainsCompartmentAction_0()); 
            // InternalDsl.g:1719:2: ()
            // InternalDsl.g:1719:3: 
            {
            }

             after(grammarAccess.getContainsCompartmentConstrainRuleAccess().getContainsCompartmentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainsCompartmentConstrainRule__Group__0__Impl"


    // $ANTLR start "rule__ContainsCompartmentConstrainRule__Group__1"
    // InternalDsl.g:1727:1: rule__ContainsCompartmentConstrainRule__Group__1 : rule__ContainsCompartmentConstrainRule__Group__1__Impl rule__ContainsCompartmentConstrainRule__Group__2 ;
    public final void rule__ContainsCompartmentConstrainRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1731:1: ( rule__ContainsCompartmentConstrainRule__Group__1__Impl rule__ContainsCompartmentConstrainRule__Group__2 )
            // InternalDsl.g:1732:2: rule__ContainsCompartmentConstrainRule__Group__1__Impl rule__ContainsCompartmentConstrainRule__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ContainsCompartmentConstrainRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainsCompartmentConstrainRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainsCompartmentConstrainRule__Group__1"


    // $ANTLR start "rule__ContainsCompartmentConstrainRule__Group__1__Impl"
    // InternalDsl.g:1739:1: rule__ContainsCompartmentConstrainRule__Group__1__Impl : ( 'ContainsCompartment' ) ;
    public final void rule__ContainsCompartmentConstrainRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1743:1: ( ( 'ContainsCompartment' ) )
            // InternalDsl.g:1744:1: ( 'ContainsCompartment' )
            {
            // InternalDsl.g:1744:1: ( 'ContainsCompartment' )
            // InternalDsl.g:1745:2: 'ContainsCompartment'
            {
             before(grammarAccess.getContainsCompartmentConstrainRuleAccess().getContainsCompartmentKeyword_1()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getContainsCompartmentConstrainRuleAccess().getContainsCompartmentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainsCompartmentConstrainRule__Group__1__Impl"


    // $ANTLR start "rule__ContainsCompartmentConstrainRule__Group__2"
    // InternalDsl.g:1754:1: rule__ContainsCompartmentConstrainRule__Group__2 : rule__ContainsCompartmentConstrainRule__Group__2__Impl rule__ContainsCompartmentConstrainRule__Group__3 ;
    public final void rule__ContainsCompartmentConstrainRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1758:1: ( rule__ContainsCompartmentConstrainRule__Group__2__Impl rule__ContainsCompartmentConstrainRule__Group__3 )
            // InternalDsl.g:1759:2: rule__ContainsCompartmentConstrainRule__Group__2__Impl rule__ContainsCompartmentConstrainRule__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ContainsCompartmentConstrainRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainsCompartmentConstrainRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainsCompartmentConstrainRule__Group__2"


    // $ANTLR start "rule__ContainsCompartmentConstrainRule__Group__2__Impl"
    // InternalDsl.g:1766:1: rule__ContainsCompartmentConstrainRule__Group__2__Impl : ( '(' ) ;
    public final void rule__ContainsCompartmentConstrainRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1770:1: ( ( '(' ) )
            // InternalDsl.g:1771:1: ( '(' )
            {
            // InternalDsl.g:1771:1: ( '(' )
            // InternalDsl.g:1772:2: '('
            {
             before(grammarAccess.getContainsCompartmentConstrainRuleAccess().getLeftParenthesisKeyword_2()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getContainsCompartmentConstrainRuleAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainsCompartmentConstrainRule__Group__2__Impl"


    // $ANTLR start "rule__ContainsCompartmentConstrainRule__Group__3"
    // InternalDsl.g:1781:1: rule__ContainsCompartmentConstrainRule__Group__3 : rule__ContainsCompartmentConstrainRule__Group__3__Impl ;
    public final void rule__ContainsCompartmentConstrainRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1785:1: ( rule__ContainsCompartmentConstrainRule__Group__3__Impl )
            // InternalDsl.g:1786:2: rule__ContainsCompartmentConstrainRule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContainsCompartmentConstrainRule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainsCompartmentConstrainRule__Group__3"


    // $ANTLR start "rule__ContainsCompartmentConstrainRule__Group__3__Impl"
    // InternalDsl.g:1792:1: rule__ContainsCompartmentConstrainRule__Group__3__Impl : ( ')' ) ;
    public final void rule__ContainsCompartmentConstrainRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1796:1: ( ( ')' ) )
            // InternalDsl.g:1797:1: ( ')' )
            {
            // InternalDsl.g:1797:1: ( ')' )
            // InternalDsl.g:1798:2: ')'
            {
             before(grammarAccess.getContainsCompartmentConstrainRuleAccess().getRightParenthesisKeyword_3()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getContainsCompartmentConstrainRuleAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainsCompartmentConstrainRule__Group__3__Impl"


    // $ANTLR start "rule__IsTargetTypeConstraintRule__Group__0"
    // InternalDsl.g:1808:1: rule__IsTargetTypeConstraintRule__Group__0 : rule__IsTargetTypeConstraintRule__Group__0__Impl rule__IsTargetTypeConstraintRule__Group__1 ;
    public final void rule__IsTargetTypeConstraintRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1812:1: ( rule__IsTargetTypeConstraintRule__Group__0__Impl rule__IsTargetTypeConstraintRule__Group__1 )
            // InternalDsl.g:1813:2: rule__IsTargetTypeConstraintRule__Group__0__Impl rule__IsTargetTypeConstraintRule__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__IsTargetTypeConstraintRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsTargetTypeConstraintRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetTypeConstraintRule__Group__0"


    // $ANTLR start "rule__IsTargetTypeConstraintRule__Group__0__Impl"
    // InternalDsl.g:1820:1: rule__IsTargetTypeConstraintRule__Group__0__Impl : ( () ) ;
    public final void rule__IsTargetTypeConstraintRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1824:1: ( ( () ) )
            // InternalDsl.g:1825:1: ( () )
            {
            // InternalDsl.g:1825:1: ( () )
            // InternalDsl.g:1826:2: ()
            {
             before(grammarAccess.getIsTargetTypeConstraintRuleAccess().getIsTargetTypeAction_0()); 
            // InternalDsl.g:1827:2: ()
            // InternalDsl.g:1827:3: 
            {
            }

             after(grammarAccess.getIsTargetTypeConstraintRuleAccess().getIsTargetTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetTypeConstraintRule__Group__0__Impl"


    // $ANTLR start "rule__IsTargetTypeConstraintRule__Group__1"
    // InternalDsl.g:1835:1: rule__IsTargetTypeConstraintRule__Group__1 : rule__IsTargetTypeConstraintRule__Group__1__Impl rule__IsTargetTypeConstraintRule__Group__2 ;
    public final void rule__IsTargetTypeConstraintRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1839:1: ( rule__IsTargetTypeConstraintRule__Group__1__Impl rule__IsTargetTypeConstraintRule__Group__2 )
            // InternalDsl.g:1840:2: rule__IsTargetTypeConstraintRule__Group__1__Impl rule__IsTargetTypeConstraintRule__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__IsTargetTypeConstraintRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsTargetTypeConstraintRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetTypeConstraintRule__Group__1"


    // $ANTLR start "rule__IsTargetTypeConstraintRule__Group__1__Impl"
    // InternalDsl.g:1847:1: rule__IsTargetTypeConstraintRule__Group__1__Impl : ( 'IsTargetType' ) ;
    public final void rule__IsTargetTypeConstraintRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1851:1: ( ( 'IsTargetType' ) )
            // InternalDsl.g:1852:1: ( 'IsTargetType' )
            {
            // InternalDsl.g:1852:1: ( 'IsTargetType' )
            // InternalDsl.g:1853:2: 'IsTargetType'
            {
             before(grammarAccess.getIsTargetTypeConstraintRuleAccess().getIsTargetTypeKeyword_1()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getIsTargetTypeConstraintRuleAccess().getIsTargetTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetTypeConstraintRule__Group__1__Impl"


    // $ANTLR start "rule__IsTargetTypeConstraintRule__Group__2"
    // InternalDsl.g:1862:1: rule__IsTargetTypeConstraintRule__Group__2 : rule__IsTargetTypeConstraintRule__Group__2__Impl rule__IsTargetTypeConstraintRule__Group__3 ;
    public final void rule__IsTargetTypeConstraintRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1866:1: ( rule__IsTargetTypeConstraintRule__Group__2__Impl rule__IsTargetTypeConstraintRule__Group__3 )
            // InternalDsl.g:1867:2: rule__IsTargetTypeConstraintRule__Group__2__Impl rule__IsTargetTypeConstraintRule__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__IsTargetTypeConstraintRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsTargetTypeConstraintRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetTypeConstraintRule__Group__2"


    // $ANTLR start "rule__IsTargetTypeConstraintRule__Group__2__Impl"
    // InternalDsl.g:1874:1: rule__IsTargetTypeConstraintRule__Group__2__Impl : ( '(' ) ;
    public final void rule__IsTargetTypeConstraintRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1878:1: ( ( '(' ) )
            // InternalDsl.g:1879:1: ( '(' )
            {
            // InternalDsl.g:1879:1: ( '(' )
            // InternalDsl.g:1880:2: '('
            {
             before(grammarAccess.getIsTargetTypeConstraintRuleAccess().getLeftParenthesisKeyword_2()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getIsTargetTypeConstraintRuleAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetTypeConstraintRule__Group__2__Impl"


    // $ANTLR start "rule__IsTargetTypeConstraintRule__Group__3"
    // InternalDsl.g:1889:1: rule__IsTargetTypeConstraintRule__Group__3 : rule__IsTargetTypeConstraintRule__Group__3__Impl rule__IsTargetTypeConstraintRule__Group__4 ;
    public final void rule__IsTargetTypeConstraintRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1893:1: ( rule__IsTargetTypeConstraintRule__Group__3__Impl rule__IsTargetTypeConstraintRule__Group__4 )
            // InternalDsl.g:1894:2: rule__IsTargetTypeConstraintRule__Group__3__Impl rule__IsTargetTypeConstraintRule__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__IsTargetTypeConstraintRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsTargetTypeConstraintRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetTypeConstraintRule__Group__3"


    // $ANTLR start "rule__IsTargetTypeConstraintRule__Group__3__Impl"
    // InternalDsl.g:1901:1: rule__IsTargetTypeConstraintRule__Group__3__Impl : ( ( rule__IsTargetTypeConstraintRule__TypeAssignment_3 ) ) ;
    public final void rule__IsTargetTypeConstraintRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1905:1: ( ( ( rule__IsTargetTypeConstraintRule__TypeAssignment_3 ) ) )
            // InternalDsl.g:1906:1: ( ( rule__IsTargetTypeConstraintRule__TypeAssignment_3 ) )
            {
            // InternalDsl.g:1906:1: ( ( rule__IsTargetTypeConstraintRule__TypeAssignment_3 ) )
            // InternalDsl.g:1907:2: ( rule__IsTargetTypeConstraintRule__TypeAssignment_3 )
            {
             before(grammarAccess.getIsTargetTypeConstraintRuleAccess().getTypeAssignment_3()); 
            // InternalDsl.g:1908:2: ( rule__IsTargetTypeConstraintRule__TypeAssignment_3 )
            // InternalDsl.g:1908:3: rule__IsTargetTypeConstraintRule__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IsTargetTypeConstraintRule__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIsTargetTypeConstraintRuleAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetTypeConstraintRule__Group__3__Impl"


    // $ANTLR start "rule__IsTargetTypeConstraintRule__Group__4"
    // InternalDsl.g:1916:1: rule__IsTargetTypeConstraintRule__Group__4 : rule__IsTargetTypeConstraintRule__Group__4__Impl ;
    public final void rule__IsTargetTypeConstraintRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1920:1: ( rule__IsTargetTypeConstraintRule__Group__4__Impl )
            // InternalDsl.g:1921:2: rule__IsTargetTypeConstraintRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IsTargetTypeConstraintRule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetTypeConstraintRule__Group__4"


    // $ANTLR start "rule__IsTargetTypeConstraintRule__Group__4__Impl"
    // InternalDsl.g:1927:1: rule__IsTargetTypeConstraintRule__Group__4__Impl : ( ')' ) ;
    public final void rule__IsTargetTypeConstraintRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1931:1: ( ( ')' ) )
            // InternalDsl.g:1932:1: ( ')' )
            {
            // InternalDsl.g:1932:1: ( ')' )
            // InternalDsl.g:1933:2: ')'
            {
             before(grammarAccess.getIsTargetTypeConstraintRuleAccess().getRightParenthesisKeyword_4()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getIsTargetTypeConstraintRuleAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetTypeConstraintRule__Group__4__Impl"


    // $ANTLR start "rule__IsParentConstraintRule__Group__0"
    // InternalDsl.g:1943:1: rule__IsParentConstraintRule__Group__0 : rule__IsParentConstraintRule__Group__0__Impl rule__IsParentConstraintRule__Group__1 ;
    public final void rule__IsParentConstraintRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1947:1: ( rule__IsParentConstraintRule__Group__0__Impl rule__IsParentConstraintRule__Group__1 )
            // InternalDsl.g:1948:2: rule__IsParentConstraintRule__Group__0__Impl rule__IsParentConstraintRule__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__IsParentConstraintRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsParentConstraintRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsParentConstraintRule__Group__0"


    // $ANTLR start "rule__IsParentConstraintRule__Group__0__Impl"
    // InternalDsl.g:1955:1: rule__IsParentConstraintRule__Group__0__Impl : ( () ) ;
    public final void rule__IsParentConstraintRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1959:1: ( ( () ) )
            // InternalDsl.g:1960:1: ( () )
            {
            // InternalDsl.g:1960:1: ( () )
            // InternalDsl.g:1961:2: ()
            {
             before(grammarAccess.getIsParentConstraintRuleAccess().getIsParentAction_0()); 
            // InternalDsl.g:1962:2: ()
            // InternalDsl.g:1962:3: 
            {
            }

             after(grammarAccess.getIsParentConstraintRuleAccess().getIsParentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsParentConstraintRule__Group__0__Impl"


    // $ANTLR start "rule__IsParentConstraintRule__Group__1"
    // InternalDsl.g:1970:1: rule__IsParentConstraintRule__Group__1 : rule__IsParentConstraintRule__Group__1__Impl rule__IsParentConstraintRule__Group__2 ;
    public final void rule__IsParentConstraintRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1974:1: ( rule__IsParentConstraintRule__Group__1__Impl rule__IsParentConstraintRule__Group__2 )
            // InternalDsl.g:1975:2: rule__IsParentConstraintRule__Group__1__Impl rule__IsParentConstraintRule__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__IsParentConstraintRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsParentConstraintRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsParentConstraintRule__Group__1"


    // $ANTLR start "rule__IsParentConstraintRule__Group__1__Impl"
    // InternalDsl.g:1982:1: rule__IsParentConstraintRule__Group__1__Impl : ( 'IsParent' ) ;
    public final void rule__IsParentConstraintRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1986:1: ( ( 'IsParent' ) )
            // InternalDsl.g:1987:1: ( 'IsParent' )
            {
            // InternalDsl.g:1987:1: ( 'IsParent' )
            // InternalDsl.g:1988:2: 'IsParent'
            {
             before(grammarAccess.getIsParentConstraintRuleAccess().getIsParentKeyword_1()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getIsParentConstraintRuleAccess().getIsParentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsParentConstraintRule__Group__1__Impl"


    // $ANTLR start "rule__IsParentConstraintRule__Group__2"
    // InternalDsl.g:1997:1: rule__IsParentConstraintRule__Group__2 : rule__IsParentConstraintRule__Group__2__Impl rule__IsParentConstraintRule__Group__3 ;
    public final void rule__IsParentConstraintRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2001:1: ( rule__IsParentConstraintRule__Group__2__Impl rule__IsParentConstraintRule__Group__3 )
            // InternalDsl.g:2002:2: rule__IsParentConstraintRule__Group__2__Impl rule__IsParentConstraintRule__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__IsParentConstraintRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsParentConstraintRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsParentConstraintRule__Group__2"


    // $ANTLR start "rule__IsParentConstraintRule__Group__2__Impl"
    // InternalDsl.g:2009:1: rule__IsParentConstraintRule__Group__2__Impl : ( '(' ) ;
    public final void rule__IsParentConstraintRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2013:1: ( ( '(' ) )
            // InternalDsl.g:2014:1: ( '(' )
            {
            // InternalDsl.g:2014:1: ( '(' )
            // InternalDsl.g:2015:2: '('
            {
             before(grammarAccess.getIsParentConstraintRuleAccess().getLeftParenthesisKeyword_2()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getIsParentConstraintRuleAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsParentConstraintRule__Group__2__Impl"


    // $ANTLR start "rule__IsParentConstraintRule__Group__3"
    // InternalDsl.g:2024:1: rule__IsParentConstraintRule__Group__3 : rule__IsParentConstraintRule__Group__3__Impl rule__IsParentConstraintRule__Group__4 ;
    public final void rule__IsParentConstraintRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2028:1: ( rule__IsParentConstraintRule__Group__3__Impl rule__IsParentConstraintRule__Group__4 )
            // InternalDsl.g:2029:2: rule__IsParentConstraintRule__Group__3__Impl rule__IsParentConstraintRule__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__IsParentConstraintRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsParentConstraintRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsParentConstraintRule__Group__3"


    // $ANTLR start "rule__IsParentConstraintRule__Group__3__Impl"
    // InternalDsl.g:2036:1: rule__IsParentConstraintRule__Group__3__Impl : ( ( rule__IsParentConstraintRule__TypeAssignment_3 ) ) ;
    public final void rule__IsParentConstraintRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2040:1: ( ( ( rule__IsParentConstraintRule__TypeAssignment_3 ) ) )
            // InternalDsl.g:2041:1: ( ( rule__IsParentConstraintRule__TypeAssignment_3 ) )
            {
            // InternalDsl.g:2041:1: ( ( rule__IsParentConstraintRule__TypeAssignment_3 ) )
            // InternalDsl.g:2042:2: ( rule__IsParentConstraintRule__TypeAssignment_3 )
            {
             before(grammarAccess.getIsParentConstraintRuleAccess().getTypeAssignment_3()); 
            // InternalDsl.g:2043:2: ( rule__IsParentConstraintRule__TypeAssignment_3 )
            // InternalDsl.g:2043:3: rule__IsParentConstraintRule__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IsParentConstraintRule__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIsParentConstraintRuleAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsParentConstraintRule__Group__3__Impl"


    // $ANTLR start "rule__IsParentConstraintRule__Group__4"
    // InternalDsl.g:2051:1: rule__IsParentConstraintRule__Group__4 : rule__IsParentConstraintRule__Group__4__Impl ;
    public final void rule__IsParentConstraintRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2055:1: ( rule__IsParentConstraintRule__Group__4__Impl )
            // InternalDsl.g:2056:2: rule__IsParentConstraintRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IsParentConstraintRule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsParentConstraintRule__Group__4"


    // $ANTLR start "rule__IsParentConstraintRule__Group__4__Impl"
    // InternalDsl.g:2062:1: rule__IsParentConstraintRule__Group__4__Impl : ( ')' ) ;
    public final void rule__IsParentConstraintRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2066:1: ( ( ')' ) )
            // InternalDsl.g:2067:1: ( ')' )
            {
            // InternalDsl.g:2067:1: ( ')' )
            // InternalDsl.g:2068:2: ')'
            {
             before(grammarAccess.getIsParentConstraintRuleAccess().getRightParenthesisKeyword_4()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getIsParentConstraintRuleAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsParentConstraintRule__Group__4__Impl"


    // $ANTLR start "rule__IsSourceTypeConstraintRule__Group__0"
    // InternalDsl.g:2078:1: rule__IsSourceTypeConstraintRule__Group__0 : rule__IsSourceTypeConstraintRule__Group__0__Impl rule__IsSourceTypeConstraintRule__Group__1 ;
    public final void rule__IsSourceTypeConstraintRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2082:1: ( rule__IsSourceTypeConstraintRule__Group__0__Impl rule__IsSourceTypeConstraintRule__Group__1 )
            // InternalDsl.g:2083:2: rule__IsSourceTypeConstraintRule__Group__0__Impl rule__IsSourceTypeConstraintRule__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__IsSourceTypeConstraintRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsSourceTypeConstraintRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsSourceTypeConstraintRule__Group__0"


    // $ANTLR start "rule__IsSourceTypeConstraintRule__Group__0__Impl"
    // InternalDsl.g:2090:1: rule__IsSourceTypeConstraintRule__Group__0__Impl : ( () ) ;
    public final void rule__IsSourceTypeConstraintRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2094:1: ( ( () ) )
            // InternalDsl.g:2095:1: ( () )
            {
            // InternalDsl.g:2095:1: ( () )
            // InternalDsl.g:2096:2: ()
            {
             before(grammarAccess.getIsSourceTypeConstraintRuleAccess().getIsSourceTypeAction_0()); 
            // InternalDsl.g:2097:2: ()
            // InternalDsl.g:2097:3: 
            {
            }

             after(grammarAccess.getIsSourceTypeConstraintRuleAccess().getIsSourceTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsSourceTypeConstraintRule__Group__0__Impl"


    // $ANTLR start "rule__IsSourceTypeConstraintRule__Group__1"
    // InternalDsl.g:2105:1: rule__IsSourceTypeConstraintRule__Group__1 : rule__IsSourceTypeConstraintRule__Group__1__Impl rule__IsSourceTypeConstraintRule__Group__2 ;
    public final void rule__IsSourceTypeConstraintRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2109:1: ( rule__IsSourceTypeConstraintRule__Group__1__Impl rule__IsSourceTypeConstraintRule__Group__2 )
            // InternalDsl.g:2110:2: rule__IsSourceTypeConstraintRule__Group__1__Impl rule__IsSourceTypeConstraintRule__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__IsSourceTypeConstraintRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsSourceTypeConstraintRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsSourceTypeConstraintRule__Group__1"


    // $ANTLR start "rule__IsSourceTypeConstraintRule__Group__1__Impl"
    // InternalDsl.g:2117:1: rule__IsSourceTypeConstraintRule__Group__1__Impl : ( 'IsSourceType' ) ;
    public final void rule__IsSourceTypeConstraintRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2121:1: ( ( 'IsSourceType' ) )
            // InternalDsl.g:2122:1: ( 'IsSourceType' )
            {
            // InternalDsl.g:2122:1: ( 'IsSourceType' )
            // InternalDsl.g:2123:2: 'IsSourceType'
            {
             before(grammarAccess.getIsSourceTypeConstraintRuleAccess().getIsSourceTypeKeyword_1()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getIsSourceTypeConstraintRuleAccess().getIsSourceTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsSourceTypeConstraintRule__Group__1__Impl"


    // $ANTLR start "rule__IsSourceTypeConstraintRule__Group__2"
    // InternalDsl.g:2132:1: rule__IsSourceTypeConstraintRule__Group__2 : rule__IsSourceTypeConstraintRule__Group__2__Impl rule__IsSourceTypeConstraintRule__Group__3 ;
    public final void rule__IsSourceTypeConstraintRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2136:1: ( rule__IsSourceTypeConstraintRule__Group__2__Impl rule__IsSourceTypeConstraintRule__Group__3 )
            // InternalDsl.g:2137:2: rule__IsSourceTypeConstraintRule__Group__2__Impl rule__IsSourceTypeConstraintRule__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__IsSourceTypeConstraintRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsSourceTypeConstraintRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsSourceTypeConstraintRule__Group__2"


    // $ANTLR start "rule__IsSourceTypeConstraintRule__Group__2__Impl"
    // InternalDsl.g:2144:1: rule__IsSourceTypeConstraintRule__Group__2__Impl : ( '(' ) ;
    public final void rule__IsSourceTypeConstraintRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2148:1: ( ( '(' ) )
            // InternalDsl.g:2149:1: ( '(' )
            {
            // InternalDsl.g:2149:1: ( '(' )
            // InternalDsl.g:2150:2: '('
            {
             before(grammarAccess.getIsSourceTypeConstraintRuleAccess().getLeftParenthesisKeyword_2()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getIsSourceTypeConstraintRuleAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsSourceTypeConstraintRule__Group__2__Impl"


    // $ANTLR start "rule__IsSourceTypeConstraintRule__Group__3"
    // InternalDsl.g:2159:1: rule__IsSourceTypeConstraintRule__Group__3 : rule__IsSourceTypeConstraintRule__Group__3__Impl rule__IsSourceTypeConstraintRule__Group__4 ;
    public final void rule__IsSourceTypeConstraintRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2163:1: ( rule__IsSourceTypeConstraintRule__Group__3__Impl rule__IsSourceTypeConstraintRule__Group__4 )
            // InternalDsl.g:2164:2: rule__IsSourceTypeConstraintRule__Group__3__Impl rule__IsSourceTypeConstraintRule__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__IsSourceTypeConstraintRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsSourceTypeConstraintRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsSourceTypeConstraintRule__Group__3"


    // $ANTLR start "rule__IsSourceTypeConstraintRule__Group__3__Impl"
    // InternalDsl.g:2171:1: rule__IsSourceTypeConstraintRule__Group__3__Impl : ( ( rule__IsSourceTypeConstraintRule__TypeAssignment_3 ) ) ;
    public final void rule__IsSourceTypeConstraintRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2175:1: ( ( ( rule__IsSourceTypeConstraintRule__TypeAssignment_3 ) ) )
            // InternalDsl.g:2176:1: ( ( rule__IsSourceTypeConstraintRule__TypeAssignment_3 ) )
            {
            // InternalDsl.g:2176:1: ( ( rule__IsSourceTypeConstraintRule__TypeAssignment_3 ) )
            // InternalDsl.g:2177:2: ( rule__IsSourceTypeConstraintRule__TypeAssignment_3 )
            {
             before(grammarAccess.getIsSourceTypeConstraintRuleAccess().getTypeAssignment_3()); 
            // InternalDsl.g:2178:2: ( rule__IsSourceTypeConstraintRule__TypeAssignment_3 )
            // InternalDsl.g:2178:3: rule__IsSourceTypeConstraintRule__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IsSourceTypeConstraintRule__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIsSourceTypeConstraintRuleAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsSourceTypeConstraintRule__Group__3__Impl"


    // $ANTLR start "rule__IsSourceTypeConstraintRule__Group__4"
    // InternalDsl.g:2186:1: rule__IsSourceTypeConstraintRule__Group__4 : rule__IsSourceTypeConstraintRule__Group__4__Impl ;
    public final void rule__IsSourceTypeConstraintRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2190:1: ( rule__IsSourceTypeConstraintRule__Group__4__Impl )
            // InternalDsl.g:2191:2: rule__IsSourceTypeConstraintRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IsSourceTypeConstraintRule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsSourceTypeConstraintRule__Group__4"


    // $ANTLR start "rule__IsSourceTypeConstraintRule__Group__4__Impl"
    // InternalDsl.g:2197:1: rule__IsSourceTypeConstraintRule__Group__4__Impl : ( ')' ) ;
    public final void rule__IsSourceTypeConstraintRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2201:1: ( ( ')' ) )
            // InternalDsl.g:2202:1: ( ')' )
            {
            // InternalDsl.g:2202:1: ( ')' )
            // InternalDsl.g:2203:2: ')'
            {
             before(grammarAccess.getIsSourceTypeConstraintRuleAccess().getRightParenthesisKeyword_4()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getIsSourceTypeConstraintRuleAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsSourceTypeConstraintRule__Group__4__Impl"


    // $ANTLR start "rule__IsTargetConstraintRule__Group__0"
    // InternalDsl.g:2213:1: rule__IsTargetConstraintRule__Group__0 : rule__IsTargetConstraintRule__Group__0__Impl rule__IsTargetConstraintRule__Group__1 ;
    public final void rule__IsTargetConstraintRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2217:1: ( rule__IsTargetConstraintRule__Group__0__Impl rule__IsTargetConstraintRule__Group__1 )
            // InternalDsl.g:2218:2: rule__IsTargetConstraintRule__Group__0__Impl rule__IsTargetConstraintRule__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__IsTargetConstraintRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsTargetConstraintRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetConstraintRule__Group__0"


    // $ANTLR start "rule__IsTargetConstraintRule__Group__0__Impl"
    // InternalDsl.g:2225:1: rule__IsTargetConstraintRule__Group__0__Impl : ( () ) ;
    public final void rule__IsTargetConstraintRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2229:1: ( ( () ) )
            // InternalDsl.g:2230:1: ( () )
            {
            // InternalDsl.g:2230:1: ( () )
            // InternalDsl.g:2231:2: ()
            {
             before(grammarAccess.getIsTargetConstraintRuleAccess().getIsTargetAction_0()); 
            // InternalDsl.g:2232:2: ()
            // InternalDsl.g:2232:3: 
            {
            }

             after(grammarAccess.getIsTargetConstraintRuleAccess().getIsTargetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetConstraintRule__Group__0__Impl"


    // $ANTLR start "rule__IsTargetConstraintRule__Group__1"
    // InternalDsl.g:2240:1: rule__IsTargetConstraintRule__Group__1 : rule__IsTargetConstraintRule__Group__1__Impl rule__IsTargetConstraintRule__Group__2 ;
    public final void rule__IsTargetConstraintRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2244:1: ( rule__IsTargetConstraintRule__Group__1__Impl rule__IsTargetConstraintRule__Group__2 )
            // InternalDsl.g:2245:2: rule__IsTargetConstraintRule__Group__1__Impl rule__IsTargetConstraintRule__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__IsTargetConstraintRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsTargetConstraintRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetConstraintRule__Group__1"


    // $ANTLR start "rule__IsTargetConstraintRule__Group__1__Impl"
    // InternalDsl.g:2252:1: rule__IsTargetConstraintRule__Group__1__Impl : ( 'IsTarget' ) ;
    public final void rule__IsTargetConstraintRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2256:1: ( ( 'IsTarget' ) )
            // InternalDsl.g:2257:1: ( 'IsTarget' )
            {
            // InternalDsl.g:2257:1: ( 'IsTarget' )
            // InternalDsl.g:2258:2: 'IsTarget'
            {
             before(grammarAccess.getIsTargetConstraintRuleAccess().getIsTargetKeyword_1()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getIsTargetConstraintRuleAccess().getIsTargetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetConstraintRule__Group__1__Impl"


    // $ANTLR start "rule__IsTargetConstraintRule__Group__2"
    // InternalDsl.g:2267:1: rule__IsTargetConstraintRule__Group__2 : rule__IsTargetConstraintRule__Group__2__Impl rule__IsTargetConstraintRule__Group__3 ;
    public final void rule__IsTargetConstraintRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2271:1: ( rule__IsTargetConstraintRule__Group__2__Impl rule__IsTargetConstraintRule__Group__3 )
            // InternalDsl.g:2272:2: rule__IsTargetConstraintRule__Group__2__Impl rule__IsTargetConstraintRule__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__IsTargetConstraintRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsTargetConstraintRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetConstraintRule__Group__2"


    // $ANTLR start "rule__IsTargetConstraintRule__Group__2__Impl"
    // InternalDsl.g:2279:1: rule__IsTargetConstraintRule__Group__2__Impl : ( '(' ) ;
    public final void rule__IsTargetConstraintRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2283:1: ( ( '(' ) )
            // InternalDsl.g:2284:1: ( '(' )
            {
            // InternalDsl.g:2284:1: ( '(' )
            // InternalDsl.g:2285:2: '('
            {
             before(grammarAccess.getIsTargetConstraintRuleAccess().getLeftParenthesisKeyword_2()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getIsTargetConstraintRuleAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetConstraintRule__Group__2__Impl"


    // $ANTLR start "rule__IsTargetConstraintRule__Group__3"
    // InternalDsl.g:2294:1: rule__IsTargetConstraintRule__Group__3 : rule__IsTargetConstraintRule__Group__3__Impl rule__IsTargetConstraintRule__Group__4 ;
    public final void rule__IsTargetConstraintRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2298:1: ( rule__IsTargetConstraintRule__Group__3__Impl rule__IsTargetConstraintRule__Group__4 )
            // InternalDsl.g:2299:2: rule__IsTargetConstraintRule__Group__3__Impl rule__IsTargetConstraintRule__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__IsTargetConstraintRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsTargetConstraintRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetConstraintRule__Group__3"


    // $ANTLR start "rule__IsTargetConstraintRule__Group__3__Impl"
    // InternalDsl.g:2306:1: rule__IsTargetConstraintRule__Group__3__Impl : ( ( rule__IsTargetConstraintRule__TypeAssignment_3 ) ) ;
    public final void rule__IsTargetConstraintRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2310:1: ( ( ( rule__IsTargetConstraintRule__TypeAssignment_3 ) ) )
            // InternalDsl.g:2311:1: ( ( rule__IsTargetConstraintRule__TypeAssignment_3 ) )
            {
            // InternalDsl.g:2311:1: ( ( rule__IsTargetConstraintRule__TypeAssignment_3 ) )
            // InternalDsl.g:2312:2: ( rule__IsTargetConstraintRule__TypeAssignment_3 )
            {
             before(grammarAccess.getIsTargetConstraintRuleAccess().getTypeAssignment_3()); 
            // InternalDsl.g:2313:2: ( rule__IsTargetConstraintRule__TypeAssignment_3 )
            // InternalDsl.g:2313:3: rule__IsTargetConstraintRule__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IsTargetConstraintRule__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIsTargetConstraintRuleAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetConstraintRule__Group__3__Impl"


    // $ANTLR start "rule__IsTargetConstraintRule__Group__4"
    // InternalDsl.g:2321:1: rule__IsTargetConstraintRule__Group__4 : rule__IsTargetConstraintRule__Group__4__Impl ;
    public final void rule__IsTargetConstraintRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2325:1: ( rule__IsTargetConstraintRule__Group__4__Impl )
            // InternalDsl.g:2326:2: rule__IsTargetConstraintRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IsTargetConstraintRule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetConstraintRule__Group__4"


    // $ANTLR start "rule__IsTargetConstraintRule__Group__4__Impl"
    // InternalDsl.g:2332:1: rule__IsTargetConstraintRule__Group__4__Impl : ( ')' ) ;
    public final void rule__IsTargetConstraintRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2336:1: ( ( ')' ) )
            // InternalDsl.g:2337:1: ( ')' )
            {
            // InternalDsl.g:2337:1: ( ')' )
            // InternalDsl.g:2338:2: ')'
            {
             before(grammarAccess.getIsTargetConstraintRuleAccess().getRightParenthesisKeyword_4()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getIsTargetConstraintRuleAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetConstraintRule__Group__4__Impl"


    // $ANTLR start "rule__InTypeConstraintRule__Group__0"
    // InternalDsl.g:2348:1: rule__InTypeConstraintRule__Group__0 : rule__InTypeConstraintRule__Group__0__Impl rule__InTypeConstraintRule__Group__1 ;
    public final void rule__InTypeConstraintRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2352:1: ( rule__InTypeConstraintRule__Group__0__Impl rule__InTypeConstraintRule__Group__1 )
            // InternalDsl.g:2353:2: rule__InTypeConstraintRule__Group__0__Impl rule__InTypeConstraintRule__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__InTypeConstraintRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InTypeConstraintRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTypeConstraintRule__Group__0"


    // $ANTLR start "rule__InTypeConstraintRule__Group__0__Impl"
    // InternalDsl.g:2360:1: rule__InTypeConstraintRule__Group__0__Impl : ( () ) ;
    public final void rule__InTypeConstraintRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2364:1: ( ( () ) )
            // InternalDsl.g:2365:1: ( () )
            {
            // InternalDsl.g:2365:1: ( () )
            // InternalDsl.g:2366:2: ()
            {
             before(grammarAccess.getInTypeConstraintRuleAccess().getInTypeAction_0()); 
            // InternalDsl.g:2367:2: ()
            // InternalDsl.g:2367:3: 
            {
            }

             after(grammarAccess.getInTypeConstraintRuleAccess().getInTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTypeConstraintRule__Group__0__Impl"


    // $ANTLR start "rule__InTypeConstraintRule__Group__1"
    // InternalDsl.g:2375:1: rule__InTypeConstraintRule__Group__1 : rule__InTypeConstraintRule__Group__1__Impl rule__InTypeConstraintRule__Group__2 ;
    public final void rule__InTypeConstraintRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2379:1: ( rule__InTypeConstraintRule__Group__1__Impl rule__InTypeConstraintRule__Group__2 )
            // InternalDsl.g:2380:2: rule__InTypeConstraintRule__Group__1__Impl rule__InTypeConstraintRule__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__InTypeConstraintRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InTypeConstraintRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTypeConstraintRule__Group__1"


    // $ANTLR start "rule__InTypeConstraintRule__Group__1__Impl"
    // InternalDsl.g:2387:1: rule__InTypeConstraintRule__Group__1__Impl : ( 'InType' ) ;
    public final void rule__InTypeConstraintRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2391:1: ( ( 'InType' ) )
            // InternalDsl.g:2392:1: ( 'InType' )
            {
            // InternalDsl.g:2392:1: ( 'InType' )
            // InternalDsl.g:2393:2: 'InType'
            {
             before(grammarAccess.getInTypeConstraintRuleAccess().getInTypeKeyword_1()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getInTypeConstraintRuleAccess().getInTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTypeConstraintRule__Group__1__Impl"


    // $ANTLR start "rule__InTypeConstraintRule__Group__2"
    // InternalDsl.g:2402:1: rule__InTypeConstraintRule__Group__2 : rule__InTypeConstraintRule__Group__2__Impl rule__InTypeConstraintRule__Group__3 ;
    public final void rule__InTypeConstraintRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2406:1: ( rule__InTypeConstraintRule__Group__2__Impl rule__InTypeConstraintRule__Group__3 )
            // InternalDsl.g:2407:2: rule__InTypeConstraintRule__Group__2__Impl rule__InTypeConstraintRule__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__InTypeConstraintRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InTypeConstraintRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTypeConstraintRule__Group__2"


    // $ANTLR start "rule__InTypeConstraintRule__Group__2__Impl"
    // InternalDsl.g:2414:1: rule__InTypeConstraintRule__Group__2__Impl : ( '(' ) ;
    public final void rule__InTypeConstraintRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2418:1: ( ( '(' ) )
            // InternalDsl.g:2419:1: ( '(' )
            {
            // InternalDsl.g:2419:1: ( '(' )
            // InternalDsl.g:2420:2: '('
            {
             before(grammarAccess.getInTypeConstraintRuleAccess().getLeftParenthesisKeyword_2()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getInTypeConstraintRuleAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTypeConstraintRule__Group__2__Impl"


    // $ANTLR start "rule__InTypeConstraintRule__Group__3"
    // InternalDsl.g:2429:1: rule__InTypeConstraintRule__Group__3 : rule__InTypeConstraintRule__Group__3__Impl rule__InTypeConstraintRule__Group__4 ;
    public final void rule__InTypeConstraintRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2433:1: ( rule__InTypeConstraintRule__Group__3__Impl rule__InTypeConstraintRule__Group__4 )
            // InternalDsl.g:2434:2: rule__InTypeConstraintRule__Group__3__Impl rule__InTypeConstraintRule__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__InTypeConstraintRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InTypeConstraintRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTypeConstraintRule__Group__3"


    // $ANTLR start "rule__InTypeConstraintRule__Group__3__Impl"
    // InternalDsl.g:2441:1: rule__InTypeConstraintRule__Group__3__Impl : ( ( rule__InTypeConstraintRule__TypeAssignment_3 ) ) ;
    public final void rule__InTypeConstraintRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2445:1: ( ( ( rule__InTypeConstraintRule__TypeAssignment_3 ) ) )
            // InternalDsl.g:2446:1: ( ( rule__InTypeConstraintRule__TypeAssignment_3 ) )
            {
            // InternalDsl.g:2446:1: ( ( rule__InTypeConstraintRule__TypeAssignment_3 ) )
            // InternalDsl.g:2447:2: ( rule__InTypeConstraintRule__TypeAssignment_3 )
            {
             before(grammarAccess.getInTypeConstraintRuleAccess().getTypeAssignment_3()); 
            // InternalDsl.g:2448:2: ( rule__InTypeConstraintRule__TypeAssignment_3 )
            // InternalDsl.g:2448:3: rule__InTypeConstraintRule__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InTypeConstraintRule__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInTypeConstraintRuleAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTypeConstraintRule__Group__3__Impl"


    // $ANTLR start "rule__InTypeConstraintRule__Group__4"
    // InternalDsl.g:2456:1: rule__InTypeConstraintRule__Group__4 : rule__InTypeConstraintRule__Group__4__Impl ;
    public final void rule__InTypeConstraintRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2460:1: ( rule__InTypeConstraintRule__Group__4__Impl )
            // InternalDsl.g:2461:2: rule__InTypeConstraintRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InTypeConstraintRule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTypeConstraintRule__Group__4"


    // $ANTLR start "rule__InTypeConstraintRule__Group__4__Impl"
    // InternalDsl.g:2467:1: rule__InTypeConstraintRule__Group__4__Impl : ( ')' ) ;
    public final void rule__InTypeConstraintRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2471:1: ( ( ')' ) )
            // InternalDsl.g:2472:1: ( ')' )
            {
            // InternalDsl.g:2472:1: ( ')' )
            // InternalDsl.g:2473:2: ')'
            {
             before(grammarAccess.getInTypeConstraintRuleAccess().getRightParenthesisKeyword_4()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getInTypeConstraintRuleAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTypeConstraintRule__Group__4__Impl"


    // $ANTLR start "rule__SourceEqualsTargetConstraintRule__Group__0"
    // InternalDsl.g:2483:1: rule__SourceEqualsTargetConstraintRule__Group__0 : rule__SourceEqualsTargetConstraintRule__Group__0__Impl rule__SourceEqualsTargetConstraintRule__Group__1 ;
    public final void rule__SourceEqualsTargetConstraintRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2487:1: ( rule__SourceEqualsTargetConstraintRule__Group__0__Impl rule__SourceEqualsTargetConstraintRule__Group__1 )
            // InternalDsl.g:2488:2: rule__SourceEqualsTargetConstraintRule__Group__0__Impl rule__SourceEqualsTargetConstraintRule__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__SourceEqualsTargetConstraintRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceEqualsTargetConstraintRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceEqualsTargetConstraintRule__Group__0"


    // $ANTLR start "rule__SourceEqualsTargetConstraintRule__Group__0__Impl"
    // InternalDsl.g:2495:1: rule__SourceEqualsTargetConstraintRule__Group__0__Impl : ( () ) ;
    public final void rule__SourceEqualsTargetConstraintRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2499:1: ( ( () ) )
            // InternalDsl.g:2500:1: ( () )
            {
            // InternalDsl.g:2500:1: ( () )
            // InternalDsl.g:2501:2: ()
            {
             before(grammarAccess.getSourceEqualsTargetConstraintRuleAccess().getSourceEqualsTargetAction_0()); 
            // InternalDsl.g:2502:2: ()
            // InternalDsl.g:2502:3: 
            {
            }

             after(grammarAccess.getSourceEqualsTargetConstraintRuleAccess().getSourceEqualsTargetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceEqualsTargetConstraintRule__Group__0__Impl"


    // $ANTLR start "rule__SourceEqualsTargetConstraintRule__Group__1"
    // InternalDsl.g:2510:1: rule__SourceEqualsTargetConstraintRule__Group__1 : rule__SourceEqualsTargetConstraintRule__Group__1__Impl rule__SourceEqualsTargetConstraintRule__Group__2 ;
    public final void rule__SourceEqualsTargetConstraintRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2514:1: ( rule__SourceEqualsTargetConstraintRule__Group__1__Impl rule__SourceEqualsTargetConstraintRule__Group__2 )
            // InternalDsl.g:2515:2: rule__SourceEqualsTargetConstraintRule__Group__1__Impl rule__SourceEqualsTargetConstraintRule__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__SourceEqualsTargetConstraintRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceEqualsTargetConstraintRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceEqualsTargetConstraintRule__Group__1"


    // $ANTLR start "rule__SourceEqualsTargetConstraintRule__Group__1__Impl"
    // InternalDsl.g:2522:1: rule__SourceEqualsTargetConstraintRule__Group__1__Impl : ( 'SourceEqualsTarget' ) ;
    public final void rule__SourceEqualsTargetConstraintRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2526:1: ( ( 'SourceEqualsTarget' ) )
            // InternalDsl.g:2527:1: ( 'SourceEqualsTarget' )
            {
            // InternalDsl.g:2527:1: ( 'SourceEqualsTarget' )
            // InternalDsl.g:2528:2: 'SourceEqualsTarget'
            {
             before(grammarAccess.getSourceEqualsTargetConstraintRuleAccess().getSourceEqualsTargetKeyword_1()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getSourceEqualsTargetConstraintRuleAccess().getSourceEqualsTargetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceEqualsTargetConstraintRule__Group__1__Impl"


    // $ANTLR start "rule__SourceEqualsTargetConstraintRule__Group__2"
    // InternalDsl.g:2537:1: rule__SourceEqualsTargetConstraintRule__Group__2 : rule__SourceEqualsTargetConstraintRule__Group__2__Impl rule__SourceEqualsTargetConstraintRule__Group__3 ;
    public final void rule__SourceEqualsTargetConstraintRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2541:1: ( rule__SourceEqualsTargetConstraintRule__Group__2__Impl rule__SourceEqualsTargetConstraintRule__Group__3 )
            // InternalDsl.g:2542:2: rule__SourceEqualsTargetConstraintRule__Group__2__Impl rule__SourceEqualsTargetConstraintRule__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__SourceEqualsTargetConstraintRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceEqualsTargetConstraintRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceEqualsTargetConstraintRule__Group__2"


    // $ANTLR start "rule__SourceEqualsTargetConstraintRule__Group__2__Impl"
    // InternalDsl.g:2549:1: rule__SourceEqualsTargetConstraintRule__Group__2__Impl : ( '(' ) ;
    public final void rule__SourceEqualsTargetConstraintRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2553:1: ( ( '(' ) )
            // InternalDsl.g:2554:1: ( '(' )
            {
            // InternalDsl.g:2554:1: ( '(' )
            // InternalDsl.g:2555:2: '('
            {
             before(grammarAccess.getSourceEqualsTargetConstraintRuleAccess().getLeftParenthesisKeyword_2()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getSourceEqualsTargetConstraintRuleAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceEqualsTargetConstraintRule__Group__2__Impl"


    // $ANTLR start "rule__SourceEqualsTargetConstraintRule__Group__3"
    // InternalDsl.g:2564:1: rule__SourceEqualsTargetConstraintRule__Group__3 : rule__SourceEqualsTargetConstraintRule__Group__3__Impl ;
    public final void rule__SourceEqualsTargetConstraintRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2568:1: ( rule__SourceEqualsTargetConstraintRule__Group__3__Impl )
            // InternalDsl.g:2569:2: rule__SourceEqualsTargetConstraintRule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceEqualsTargetConstraintRule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceEqualsTargetConstraintRule__Group__3"


    // $ANTLR start "rule__SourceEqualsTargetConstraintRule__Group__3__Impl"
    // InternalDsl.g:2575:1: rule__SourceEqualsTargetConstraintRule__Group__3__Impl : ( ')' ) ;
    public final void rule__SourceEqualsTargetConstraintRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2579:1: ( ( ')' ) )
            // InternalDsl.g:2580:1: ( ')' )
            {
            // InternalDsl.g:2580:1: ( ')' )
            // InternalDsl.g:2581:2: ')'
            {
             before(grammarAccess.getSourceEqualsTargetConstraintRuleAccess().getRightParenthesisKeyword_3()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getSourceEqualsTargetConstraintRuleAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceEqualsTargetConstraintRule__Group__3__Impl"


    // $ANTLR start "rule__SourceEqualsTargetTypeConstraintRule__Group__0"
    // InternalDsl.g:2591:1: rule__SourceEqualsTargetTypeConstraintRule__Group__0 : rule__SourceEqualsTargetTypeConstraintRule__Group__0__Impl rule__SourceEqualsTargetTypeConstraintRule__Group__1 ;
    public final void rule__SourceEqualsTargetTypeConstraintRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2595:1: ( rule__SourceEqualsTargetTypeConstraintRule__Group__0__Impl rule__SourceEqualsTargetTypeConstraintRule__Group__1 )
            // InternalDsl.g:2596:2: rule__SourceEqualsTargetTypeConstraintRule__Group__0__Impl rule__SourceEqualsTargetTypeConstraintRule__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__SourceEqualsTargetTypeConstraintRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceEqualsTargetTypeConstraintRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceEqualsTargetTypeConstraintRule__Group__0"


    // $ANTLR start "rule__SourceEqualsTargetTypeConstraintRule__Group__0__Impl"
    // InternalDsl.g:2603:1: rule__SourceEqualsTargetTypeConstraintRule__Group__0__Impl : ( () ) ;
    public final void rule__SourceEqualsTargetTypeConstraintRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2607:1: ( ( () ) )
            // InternalDsl.g:2608:1: ( () )
            {
            // InternalDsl.g:2608:1: ( () )
            // InternalDsl.g:2609:2: ()
            {
             before(grammarAccess.getSourceEqualsTargetTypeConstraintRuleAccess().getSourceEqualsTargetTypeAction_0()); 
            // InternalDsl.g:2610:2: ()
            // InternalDsl.g:2610:3: 
            {
            }

             after(grammarAccess.getSourceEqualsTargetTypeConstraintRuleAccess().getSourceEqualsTargetTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceEqualsTargetTypeConstraintRule__Group__0__Impl"


    // $ANTLR start "rule__SourceEqualsTargetTypeConstraintRule__Group__1"
    // InternalDsl.g:2618:1: rule__SourceEqualsTargetTypeConstraintRule__Group__1 : rule__SourceEqualsTargetTypeConstraintRule__Group__1__Impl rule__SourceEqualsTargetTypeConstraintRule__Group__2 ;
    public final void rule__SourceEqualsTargetTypeConstraintRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2622:1: ( rule__SourceEqualsTargetTypeConstraintRule__Group__1__Impl rule__SourceEqualsTargetTypeConstraintRule__Group__2 )
            // InternalDsl.g:2623:2: rule__SourceEqualsTargetTypeConstraintRule__Group__1__Impl rule__SourceEqualsTargetTypeConstraintRule__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__SourceEqualsTargetTypeConstraintRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceEqualsTargetTypeConstraintRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceEqualsTargetTypeConstraintRule__Group__1"


    // $ANTLR start "rule__SourceEqualsTargetTypeConstraintRule__Group__1__Impl"
    // InternalDsl.g:2630:1: rule__SourceEqualsTargetTypeConstraintRule__Group__1__Impl : ( 'SourceEqualsTargetType' ) ;
    public final void rule__SourceEqualsTargetTypeConstraintRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2634:1: ( ( 'SourceEqualsTargetType' ) )
            // InternalDsl.g:2635:1: ( 'SourceEqualsTargetType' )
            {
            // InternalDsl.g:2635:1: ( 'SourceEqualsTargetType' )
            // InternalDsl.g:2636:2: 'SourceEqualsTargetType'
            {
             before(grammarAccess.getSourceEqualsTargetTypeConstraintRuleAccess().getSourceEqualsTargetTypeKeyword_1()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getSourceEqualsTargetTypeConstraintRuleAccess().getSourceEqualsTargetTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceEqualsTargetTypeConstraintRule__Group__1__Impl"


    // $ANTLR start "rule__SourceEqualsTargetTypeConstraintRule__Group__2"
    // InternalDsl.g:2645:1: rule__SourceEqualsTargetTypeConstraintRule__Group__2 : rule__SourceEqualsTargetTypeConstraintRule__Group__2__Impl rule__SourceEqualsTargetTypeConstraintRule__Group__3 ;
    public final void rule__SourceEqualsTargetTypeConstraintRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2649:1: ( rule__SourceEqualsTargetTypeConstraintRule__Group__2__Impl rule__SourceEqualsTargetTypeConstraintRule__Group__3 )
            // InternalDsl.g:2650:2: rule__SourceEqualsTargetTypeConstraintRule__Group__2__Impl rule__SourceEqualsTargetTypeConstraintRule__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__SourceEqualsTargetTypeConstraintRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceEqualsTargetTypeConstraintRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceEqualsTargetTypeConstraintRule__Group__2"


    // $ANTLR start "rule__SourceEqualsTargetTypeConstraintRule__Group__2__Impl"
    // InternalDsl.g:2657:1: rule__SourceEqualsTargetTypeConstraintRule__Group__2__Impl : ( '(' ) ;
    public final void rule__SourceEqualsTargetTypeConstraintRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2661:1: ( ( '(' ) )
            // InternalDsl.g:2662:1: ( '(' )
            {
            // InternalDsl.g:2662:1: ( '(' )
            // InternalDsl.g:2663:2: '('
            {
             before(grammarAccess.getSourceEqualsTargetTypeConstraintRuleAccess().getLeftParenthesisKeyword_2()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getSourceEqualsTargetTypeConstraintRuleAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceEqualsTargetTypeConstraintRule__Group__2__Impl"


    // $ANTLR start "rule__SourceEqualsTargetTypeConstraintRule__Group__3"
    // InternalDsl.g:2672:1: rule__SourceEqualsTargetTypeConstraintRule__Group__3 : rule__SourceEqualsTargetTypeConstraintRule__Group__3__Impl ;
    public final void rule__SourceEqualsTargetTypeConstraintRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2676:1: ( rule__SourceEqualsTargetTypeConstraintRule__Group__3__Impl )
            // InternalDsl.g:2677:2: rule__SourceEqualsTargetTypeConstraintRule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceEqualsTargetTypeConstraintRule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceEqualsTargetTypeConstraintRule__Group__3"


    // $ANTLR start "rule__SourceEqualsTargetTypeConstraintRule__Group__3__Impl"
    // InternalDsl.g:2683:1: rule__SourceEqualsTargetTypeConstraintRule__Group__3__Impl : ( ')' ) ;
    public final void rule__SourceEqualsTargetTypeConstraintRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2687:1: ( ( ')' ) )
            // InternalDsl.g:2688:1: ( ')' )
            {
            // InternalDsl.g:2688:1: ( ')' )
            // InternalDsl.g:2689:2: ')'
            {
             before(grammarAccess.getSourceEqualsTargetTypeConstraintRuleAccess().getRightParenthesisKeyword_3()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getSourceEqualsTargetTypeConstraintRuleAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceEqualsTargetTypeConstraintRule__Group__3__Impl"


    // $ANTLR start "rule__IsFeature__Group__0"
    // InternalDsl.g:2699:1: rule__IsFeature__Group__0 : rule__IsFeature__Group__0__Impl rule__IsFeature__Group__1 ;
    public final void rule__IsFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2703:1: ( rule__IsFeature__Group__0__Impl rule__IsFeature__Group__1 )
            // InternalDsl.g:2704:2: rule__IsFeature__Group__0__Impl rule__IsFeature__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__IsFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsFeature__Group__0"


    // $ANTLR start "rule__IsFeature__Group__0__Impl"
    // InternalDsl.g:2711:1: rule__IsFeature__Group__0__Impl : ( () ) ;
    public final void rule__IsFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2715:1: ( ( () ) )
            // InternalDsl.g:2716:1: ( () )
            {
            // InternalDsl.g:2716:1: ( () )
            // InternalDsl.g:2717:2: ()
            {
             before(grammarAccess.getIsFeatureAccess().getIsFeatureAction_0()); 
            // InternalDsl.g:2718:2: ()
            // InternalDsl.g:2718:3: 
            {
            }

             after(grammarAccess.getIsFeatureAccess().getIsFeatureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsFeature__Group__0__Impl"


    // $ANTLR start "rule__IsFeature__Group__1"
    // InternalDsl.g:2726:1: rule__IsFeature__Group__1 : rule__IsFeature__Group__1__Impl ;
    public final void rule__IsFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2730:1: ( rule__IsFeature__Group__1__Impl )
            // InternalDsl.g:2731:2: rule__IsFeature__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IsFeature__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsFeature__Group__1"


    // $ANTLR start "rule__IsFeature__Group__1__Impl"
    // InternalDsl.g:2737:1: rule__IsFeature__Group__1__Impl : ( ( rule__IsFeature__FeatureNameAssignment_1 ) ) ;
    public final void rule__IsFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2741:1: ( ( ( rule__IsFeature__FeatureNameAssignment_1 ) ) )
            // InternalDsl.g:2742:1: ( ( rule__IsFeature__FeatureNameAssignment_1 ) )
            {
            // InternalDsl.g:2742:1: ( ( rule__IsFeature__FeatureNameAssignment_1 ) )
            // InternalDsl.g:2743:2: ( rule__IsFeature__FeatureNameAssignment_1 )
            {
             before(grammarAccess.getIsFeatureAccess().getFeatureNameAssignment_1()); 
            // InternalDsl.g:2744:2: ( rule__IsFeature__FeatureNameAssignment_1 )
            // InternalDsl.g:2744:3: rule__IsFeature__FeatureNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IsFeature__FeatureNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIsFeatureAccess().getFeatureNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsFeature__Group__1__Impl"


    // $ANTLR start "rule__TrueFeatureRule__Group__0"
    // InternalDsl.g:2753:1: rule__TrueFeatureRule__Group__0 : rule__TrueFeatureRule__Group__0__Impl rule__TrueFeatureRule__Group__1 ;
    public final void rule__TrueFeatureRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2757:1: ( rule__TrueFeatureRule__Group__0__Impl rule__TrueFeatureRule__Group__1 )
            // InternalDsl.g:2758:2: rule__TrueFeatureRule__Group__0__Impl rule__TrueFeatureRule__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__TrueFeatureRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueFeatureRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFeatureRule__Group__0"


    // $ANTLR start "rule__TrueFeatureRule__Group__0__Impl"
    // InternalDsl.g:2765:1: rule__TrueFeatureRule__Group__0__Impl : ( () ) ;
    public final void rule__TrueFeatureRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2769:1: ( ( () ) )
            // InternalDsl.g:2770:1: ( () )
            {
            // InternalDsl.g:2770:1: ( () )
            // InternalDsl.g:2771:2: ()
            {
             before(grammarAccess.getTrueFeatureRuleAccess().getTrueFeatureRuleAction_0()); 
            // InternalDsl.g:2772:2: ()
            // InternalDsl.g:2772:3: 
            {
            }

             after(grammarAccess.getTrueFeatureRuleAccess().getTrueFeatureRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFeatureRule__Group__0__Impl"


    // $ANTLR start "rule__TrueFeatureRule__Group__1"
    // InternalDsl.g:2780:1: rule__TrueFeatureRule__Group__1 : rule__TrueFeatureRule__Group__1__Impl ;
    public final void rule__TrueFeatureRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2784:1: ( rule__TrueFeatureRule__Group__1__Impl )
            // InternalDsl.g:2785:2: rule__TrueFeatureRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrueFeatureRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFeatureRule__Group__1"


    // $ANTLR start "rule__TrueFeatureRule__Group__1__Impl"
    // InternalDsl.g:2791:1: rule__TrueFeatureRule__Group__1__Impl : ( 'true' ) ;
    public final void rule__TrueFeatureRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2795:1: ( ( 'true' ) )
            // InternalDsl.g:2796:1: ( 'true' )
            {
            // InternalDsl.g:2796:1: ( 'true' )
            // InternalDsl.g:2797:2: 'true'
            {
             before(grammarAccess.getTrueFeatureRuleAccess().getTrueKeyword_1()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getTrueFeatureRuleAccess().getTrueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueFeatureRule__Group__1__Impl"


    // $ANTLR start "rule__TrueConstraintRule__Group__0"
    // InternalDsl.g:2807:1: rule__TrueConstraintRule__Group__0 : rule__TrueConstraintRule__Group__0__Impl rule__TrueConstraintRule__Group__1 ;
    public final void rule__TrueConstraintRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2811:1: ( rule__TrueConstraintRule__Group__0__Impl rule__TrueConstraintRule__Group__1 )
            // InternalDsl.g:2812:2: rule__TrueConstraintRule__Group__0__Impl rule__TrueConstraintRule__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__TrueConstraintRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueConstraintRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueConstraintRule__Group__0"


    // $ANTLR start "rule__TrueConstraintRule__Group__0__Impl"
    // InternalDsl.g:2819:1: rule__TrueConstraintRule__Group__0__Impl : ( () ) ;
    public final void rule__TrueConstraintRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2823:1: ( ( () ) )
            // InternalDsl.g:2824:1: ( () )
            {
            // InternalDsl.g:2824:1: ( () )
            // InternalDsl.g:2825:2: ()
            {
             before(grammarAccess.getTrueConstraintRuleAccess().getTrueConstraintRuleAction_0()); 
            // InternalDsl.g:2826:2: ()
            // InternalDsl.g:2826:3: 
            {
            }

             after(grammarAccess.getTrueConstraintRuleAccess().getTrueConstraintRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueConstraintRule__Group__0__Impl"


    // $ANTLR start "rule__TrueConstraintRule__Group__1"
    // InternalDsl.g:2834:1: rule__TrueConstraintRule__Group__1 : rule__TrueConstraintRule__Group__1__Impl ;
    public final void rule__TrueConstraintRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2838:1: ( rule__TrueConstraintRule__Group__1__Impl )
            // InternalDsl.g:2839:2: rule__TrueConstraintRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrueConstraintRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueConstraintRule__Group__1"


    // $ANTLR start "rule__TrueConstraintRule__Group__1__Impl"
    // InternalDsl.g:2845:1: rule__TrueConstraintRule__Group__1__Impl : ( 'true' ) ;
    public final void rule__TrueConstraintRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2849:1: ( ( 'true' ) )
            // InternalDsl.g:2850:1: ( 'true' )
            {
            // InternalDsl.g:2850:1: ( 'true' )
            // InternalDsl.g:2851:2: 'true'
            {
             before(grammarAccess.getTrueConstraintRuleAccess().getTrueKeyword_1()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getTrueConstraintRuleAccess().getTrueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueConstraintRule__Group__1__Impl"


    // $ANTLR start "rule__FalseFeatureRule__Group__0"
    // InternalDsl.g:2861:1: rule__FalseFeatureRule__Group__0 : rule__FalseFeatureRule__Group__0__Impl rule__FalseFeatureRule__Group__1 ;
    public final void rule__FalseFeatureRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2865:1: ( rule__FalseFeatureRule__Group__0__Impl rule__FalseFeatureRule__Group__1 )
            // InternalDsl.g:2866:2: rule__FalseFeatureRule__Group__0__Impl rule__FalseFeatureRule__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__FalseFeatureRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FalseFeatureRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FalseFeatureRule__Group__0"


    // $ANTLR start "rule__FalseFeatureRule__Group__0__Impl"
    // InternalDsl.g:2873:1: rule__FalseFeatureRule__Group__0__Impl : ( () ) ;
    public final void rule__FalseFeatureRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2877:1: ( ( () ) )
            // InternalDsl.g:2878:1: ( () )
            {
            // InternalDsl.g:2878:1: ( () )
            // InternalDsl.g:2879:2: ()
            {
             before(grammarAccess.getFalseFeatureRuleAccess().getFalseFeatureRuleAction_0()); 
            // InternalDsl.g:2880:2: ()
            // InternalDsl.g:2880:3: 
            {
            }

             after(grammarAccess.getFalseFeatureRuleAccess().getFalseFeatureRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FalseFeatureRule__Group__0__Impl"


    // $ANTLR start "rule__FalseFeatureRule__Group__1"
    // InternalDsl.g:2888:1: rule__FalseFeatureRule__Group__1 : rule__FalseFeatureRule__Group__1__Impl ;
    public final void rule__FalseFeatureRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2892:1: ( rule__FalseFeatureRule__Group__1__Impl )
            // InternalDsl.g:2893:2: rule__FalseFeatureRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FalseFeatureRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FalseFeatureRule__Group__1"


    // $ANTLR start "rule__FalseFeatureRule__Group__1__Impl"
    // InternalDsl.g:2899:1: rule__FalseFeatureRule__Group__1__Impl : ( 'false' ) ;
    public final void rule__FalseFeatureRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2903:1: ( ( 'false' ) )
            // InternalDsl.g:2904:1: ( 'false' )
            {
            // InternalDsl.g:2904:1: ( 'false' )
            // InternalDsl.g:2905:2: 'false'
            {
             before(grammarAccess.getFalseFeatureRuleAccess().getFalseKeyword_1()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getFalseFeatureRuleAccess().getFalseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FalseFeatureRule__Group__1__Impl"


    // $ANTLR start "rule__FalseConstraintRule__Group__0"
    // InternalDsl.g:2915:1: rule__FalseConstraintRule__Group__0 : rule__FalseConstraintRule__Group__0__Impl rule__FalseConstraintRule__Group__1 ;
    public final void rule__FalseConstraintRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2919:1: ( rule__FalseConstraintRule__Group__0__Impl rule__FalseConstraintRule__Group__1 )
            // InternalDsl.g:2920:2: rule__FalseConstraintRule__Group__0__Impl rule__FalseConstraintRule__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__FalseConstraintRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FalseConstraintRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FalseConstraintRule__Group__0"


    // $ANTLR start "rule__FalseConstraintRule__Group__0__Impl"
    // InternalDsl.g:2927:1: rule__FalseConstraintRule__Group__0__Impl : ( () ) ;
    public final void rule__FalseConstraintRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2931:1: ( ( () ) )
            // InternalDsl.g:2932:1: ( () )
            {
            // InternalDsl.g:2932:1: ( () )
            // InternalDsl.g:2933:2: ()
            {
             before(grammarAccess.getFalseConstraintRuleAccess().getFalseConstraintRuleAction_0()); 
            // InternalDsl.g:2934:2: ()
            // InternalDsl.g:2934:3: 
            {
            }

             after(grammarAccess.getFalseConstraintRuleAccess().getFalseConstraintRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FalseConstraintRule__Group__0__Impl"


    // $ANTLR start "rule__FalseConstraintRule__Group__1"
    // InternalDsl.g:2942:1: rule__FalseConstraintRule__Group__1 : rule__FalseConstraintRule__Group__1__Impl ;
    public final void rule__FalseConstraintRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2946:1: ( rule__FalseConstraintRule__Group__1__Impl )
            // InternalDsl.g:2947:2: rule__FalseConstraintRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FalseConstraintRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FalseConstraintRule__Group__1"


    // $ANTLR start "rule__FalseConstraintRule__Group__1__Impl"
    // InternalDsl.g:2953:1: rule__FalseConstraintRule__Group__1__Impl : ( 'false' ) ;
    public final void rule__FalseConstraintRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2957:1: ( ( 'false' ) )
            // InternalDsl.g:2958:1: ( 'false' )
            {
            // InternalDsl.g:2958:1: ( 'false' )
            // InternalDsl.g:2959:2: 'false'
            {
             before(grammarAccess.getFalseConstraintRuleAccess().getFalseKeyword_1()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getFalseConstraintRuleAccess().getFalseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FalseConstraintRule__Group__1__Impl"


    // $ANTLR start "rule__OrFeature__Group__0"
    // InternalDsl.g:2969:1: rule__OrFeature__Group__0 : rule__OrFeature__Group__0__Impl rule__OrFeature__Group__1 ;
    public final void rule__OrFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2973:1: ( rule__OrFeature__Group__0__Impl rule__OrFeature__Group__1 )
            // InternalDsl.g:2974:2: rule__OrFeature__Group__0__Impl rule__OrFeature__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__OrFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrFeature__Group__0"


    // $ANTLR start "rule__OrFeature__Group__0__Impl"
    // InternalDsl.g:2981:1: rule__OrFeature__Group__0__Impl : ( ruleAndFeature ) ;
    public final void rule__OrFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2985:1: ( ( ruleAndFeature ) )
            // InternalDsl.g:2986:1: ( ruleAndFeature )
            {
            // InternalDsl.g:2986:1: ( ruleAndFeature )
            // InternalDsl.g:2987:2: ruleAndFeature
            {
             before(grammarAccess.getOrFeatureAccess().getAndFeatureParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndFeature();

            state._fsp--;

             after(grammarAccess.getOrFeatureAccess().getAndFeatureParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrFeature__Group__0__Impl"


    // $ANTLR start "rule__OrFeature__Group__1"
    // InternalDsl.g:2996:1: rule__OrFeature__Group__1 : rule__OrFeature__Group__1__Impl ;
    public final void rule__OrFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3000:1: ( rule__OrFeature__Group__1__Impl )
            // InternalDsl.g:3001:2: rule__OrFeature__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrFeature__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrFeature__Group__1"


    // $ANTLR start "rule__OrFeature__Group__1__Impl"
    // InternalDsl.g:3007:1: rule__OrFeature__Group__1__Impl : ( ( rule__OrFeature__Group_1__0 )* ) ;
    public final void rule__OrFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3011:1: ( ( ( rule__OrFeature__Group_1__0 )* ) )
            // InternalDsl.g:3012:1: ( ( rule__OrFeature__Group_1__0 )* )
            {
            // InternalDsl.g:3012:1: ( ( rule__OrFeature__Group_1__0 )* )
            // InternalDsl.g:3013:2: ( rule__OrFeature__Group_1__0 )*
            {
             before(grammarAccess.getOrFeatureAccess().getGroup_1()); 
            // InternalDsl.g:3014:2: ( rule__OrFeature__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==91) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:3014:3: rule__OrFeature__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__OrFeature__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getOrFeatureAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrFeature__Group__1__Impl"


    // $ANTLR start "rule__OrFeature__Group_1__0"
    // InternalDsl.g:3023:1: rule__OrFeature__Group_1__0 : rule__OrFeature__Group_1__0__Impl rule__OrFeature__Group_1__1 ;
    public final void rule__OrFeature__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3027:1: ( rule__OrFeature__Group_1__0__Impl rule__OrFeature__Group_1__1 )
            // InternalDsl.g:3028:2: rule__OrFeature__Group_1__0__Impl rule__OrFeature__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__OrFeature__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrFeature__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrFeature__Group_1__0"


    // $ANTLR start "rule__OrFeature__Group_1__0__Impl"
    // InternalDsl.g:3035:1: rule__OrFeature__Group_1__0__Impl : ( () ) ;
    public final void rule__OrFeature__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3039:1: ( ( () ) )
            // InternalDsl.g:3040:1: ( () )
            {
            // InternalDsl.g:3040:1: ( () )
            // InternalDsl.g:3041:2: ()
            {
             before(grammarAccess.getOrFeatureAccess().getOrFeatureRuleRulesAction_1_0()); 
            // InternalDsl.g:3042:2: ()
            // InternalDsl.g:3042:3: 
            {
            }

             after(grammarAccess.getOrFeatureAccess().getOrFeatureRuleRulesAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrFeature__Group_1__0__Impl"


    // $ANTLR start "rule__OrFeature__Group_1__1"
    // InternalDsl.g:3050:1: rule__OrFeature__Group_1__1 : rule__OrFeature__Group_1__1__Impl rule__OrFeature__Group_1__2 ;
    public final void rule__OrFeature__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3054:1: ( rule__OrFeature__Group_1__1__Impl rule__OrFeature__Group_1__2 )
            // InternalDsl.g:3055:2: rule__OrFeature__Group_1__1__Impl rule__OrFeature__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__OrFeature__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrFeature__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrFeature__Group_1__1"


    // $ANTLR start "rule__OrFeature__Group_1__1__Impl"
    // InternalDsl.g:3062:1: rule__OrFeature__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__OrFeature__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3066:1: ( ( 'or' ) )
            // InternalDsl.g:3067:1: ( 'or' )
            {
            // InternalDsl.g:3067:1: ( 'or' )
            // InternalDsl.g:3068:2: 'or'
            {
             before(grammarAccess.getOrFeatureAccess().getOrKeyword_1_1()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getOrFeatureAccess().getOrKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrFeature__Group_1__1__Impl"


    // $ANTLR start "rule__OrFeature__Group_1__2"
    // InternalDsl.g:3077:1: rule__OrFeature__Group_1__2 : rule__OrFeature__Group_1__2__Impl ;
    public final void rule__OrFeature__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3081:1: ( rule__OrFeature__Group_1__2__Impl )
            // InternalDsl.g:3082:2: rule__OrFeature__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrFeature__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrFeature__Group_1__2"


    // $ANTLR start "rule__OrFeature__Group_1__2__Impl"
    // InternalDsl.g:3088:1: rule__OrFeature__Group_1__2__Impl : ( ( rule__OrFeature__RulesAssignment_1_2 ) ) ;
    public final void rule__OrFeature__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3092:1: ( ( ( rule__OrFeature__RulesAssignment_1_2 ) ) )
            // InternalDsl.g:3093:1: ( ( rule__OrFeature__RulesAssignment_1_2 ) )
            {
            // InternalDsl.g:3093:1: ( ( rule__OrFeature__RulesAssignment_1_2 ) )
            // InternalDsl.g:3094:2: ( rule__OrFeature__RulesAssignment_1_2 )
            {
             before(grammarAccess.getOrFeatureAccess().getRulesAssignment_1_2()); 
            // InternalDsl.g:3095:2: ( rule__OrFeature__RulesAssignment_1_2 )
            // InternalDsl.g:3095:3: rule__OrFeature__RulesAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrFeature__RulesAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrFeatureAccess().getRulesAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrFeature__Group_1__2__Impl"


    // $ANTLR start "rule__AndFeature__Group__0"
    // InternalDsl.g:3104:1: rule__AndFeature__Group__0 : rule__AndFeature__Group__0__Impl rule__AndFeature__Group__1 ;
    public final void rule__AndFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3108:1: ( rule__AndFeature__Group__0__Impl rule__AndFeature__Group__1 )
            // InternalDsl.g:3109:2: rule__AndFeature__Group__0__Impl rule__AndFeature__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__AndFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndFeature__Group__0"


    // $ANTLR start "rule__AndFeature__Group__0__Impl"
    // InternalDsl.g:3116:1: rule__AndFeature__Group__0__Impl : ( ruleNotFeatureExpression ) ;
    public final void rule__AndFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3120:1: ( ( ruleNotFeatureExpression ) )
            // InternalDsl.g:3121:1: ( ruleNotFeatureExpression )
            {
            // InternalDsl.g:3121:1: ( ruleNotFeatureExpression )
            // InternalDsl.g:3122:2: ruleNotFeatureExpression
            {
             before(grammarAccess.getAndFeatureAccess().getNotFeatureExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNotFeatureExpression();

            state._fsp--;

             after(grammarAccess.getAndFeatureAccess().getNotFeatureExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndFeature__Group__0__Impl"


    // $ANTLR start "rule__AndFeature__Group__1"
    // InternalDsl.g:3131:1: rule__AndFeature__Group__1 : rule__AndFeature__Group__1__Impl ;
    public final void rule__AndFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3135:1: ( rule__AndFeature__Group__1__Impl )
            // InternalDsl.g:3136:2: rule__AndFeature__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndFeature__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndFeature__Group__1"


    // $ANTLR start "rule__AndFeature__Group__1__Impl"
    // InternalDsl.g:3142:1: rule__AndFeature__Group__1__Impl : ( ( rule__AndFeature__Group_1__0 )* ) ;
    public final void rule__AndFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3146:1: ( ( ( rule__AndFeature__Group_1__0 )* ) )
            // InternalDsl.g:3147:1: ( ( rule__AndFeature__Group_1__0 )* )
            {
            // InternalDsl.g:3147:1: ( ( rule__AndFeature__Group_1__0 )* )
            // InternalDsl.g:3148:2: ( rule__AndFeature__Group_1__0 )*
            {
             before(grammarAccess.getAndFeatureAccess().getGroup_1()); 
            // InternalDsl.g:3149:2: ( rule__AndFeature__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==92) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:3149:3: rule__AndFeature__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__AndFeature__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAndFeatureAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndFeature__Group__1__Impl"


    // $ANTLR start "rule__AndFeature__Group_1__0"
    // InternalDsl.g:3158:1: rule__AndFeature__Group_1__0 : rule__AndFeature__Group_1__0__Impl rule__AndFeature__Group_1__1 ;
    public final void rule__AndFeature__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3162:1: ( rule__AndFeature__Group_1__0__Impl rule__AndFeature__Group_1__1 )
            // InternalDsl.g:3163:2: rule__AndFeature__Group_1__0__Impl rule__AndFeature__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__AndFeature__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndFeature__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndFeature__Group_1__0"


    // $ANTLR start "rule__AndFeature__Group_1__0__Impl"
    // InternalDsl.g:3170:1: rule__AndFeature__Group_1__0__Impl : ( () ) ;
    public final void rule__AndFeature__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3174:1: ( ( () ) )
            // InternalDsl.g:3175:1: ( () )
            {
            // InternalDsl.g:3175:1: ( () )
            // InternalDsl.g:3176:2: ()
            {
             before(grammarAccess.getAndFeatureAccess().getAndFeatureRuleRulesAction_1_0()); 
            // InternalDsl.g:3177:2: ()
            // InternalDsl.g:3177:3: 
            {
            }

             after(grammarAccess.getAndFeatureAccess().getAndFeatureRuleRulesAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndFeature__Group_1__0__Impl"


    // $ANTLR start "rule__AndFeature__Group_1__1"
    // InternalDsl.g:3185:1: rule__AndFeature__Group_1__1 : rule__AndFeature__Group_1__1__Impl rule__AndFeature__Group_1__2 ;
    public final void rule__AndFeature__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3189:1: ( rule__AndFeature__Group_1__1__Impl rule__AndFeature__Group_1__2 )
            // InternalDsl.g:3190:2: rule__AndFeature__Group_1__1__Impl rule__AndFeature__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__AndFeature__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndFeature__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndFeature__Group_1__1"


    // $ANTLR start "rule__AndFeature__Group_1__1__Impl"
    // InternalDsl.g:3197:1: rule__AndFeature__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__AndFeature__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3201:1: ( ( 'and' ) )
            // InternalDsl.g:3202:1: ( 'and' )
            {
            // InternalDsl.g:3202:1: ( 'and' )
            // InternalDsl.g:3203:2: 'and'
            {
             before(grammarAccess.getAndFeatureAccess().getAndKeyword_1_1()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getAndFeatureAccess().getAndKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndFeature__Group_1__1__Impl"


    // $ANTLR start "rule__AndFeature__Group_1__2"
    // InternalDsl.g:3212:1: rule__AndFeature__Group_1__2 : rule__AndFeature__Group_1__2__Impl ;
    public final void rule__AndFeature__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3216:1: ( rule__AndFeature__Group_1__2__Impl )
            // InternalDsl.g:3217:2: rule__AndFeature__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndFeature__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndFeature__Group_1__2"


    // $ANTLR start "rule__AndFeature__Group_1__2__Impl"
    // InternalDsl.g:3223:1: rule__AndFeature__Group_1__2__Impl : ( ( rule__AndFeature__RulesAssignment_1_2 ) ) ;
    public final void rule__AndFeature__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3227:1: ( ( ( rule__AndFeature__RulesAssignment_1_2 ) ) )
            // InternalDsl.g:3228:1: ( ( rule__AndFeature__RulesAssignment_1_2 ) )
            {
            // InternalDsl.g:3228:1: ( ( rule__AndFeature__RulesAssignment_1_2 ) )
            // InternalDsl.g:3229:2: ( rule__AndFeature__RulesAssignment_1_2 )
            {
             before(grammarAccess.getAndFeatureAccess().getRulesAssignment_1_2()); 
            // InternalDsl.g:3230:2: ( rule__AndFeature__RulesAssignment_1_2 )
            // InternalDsl.g:3230:3: rule__AndFeature__RulesAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndFeature__RulesAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndFeatureAccess().getRulesAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndFeature__Group_1__2__Impl"


    // $ANTLR start "rule__NotFeatureExpression__Group_1__0"
    // InternalDsl.g:3239:1: rule__NotFeatureExpression__Group_1__0 : rule__NotFeatureExpression__Group_1__0__Impl rule__NotFeatureExpression__Group_1__1 ;
    public final void rule__NotFeatureExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3243:1: ( rule__NotFeatureExpression__Group_1__0__Impl rule__NotFeatureExpression__Group_1__1 )
            // InternalDsl.g:3244:2: rule__NotFeatureExpression__Group_1__0__Impl rule__NotFeatureExpression__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__NotFeatureExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotFeatureExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotFeatureExpression__Group_1__0"


    // $ANTLR start "rule__NotFeatureExpression__Group_1__0__Impl"
    // InternalDsl.g:3251:1: rule__NotFeatureExpression__Group_1__0__Impl : ( '!' ) ;
    public final void rule__NotFeatureExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3255:1: ( ( '!' ) )
            // InternalDsl.g:3256:1: ( '!' )
            {
            // InternalDsl.g:3256:1: ( '!' )
            // InternalDsl.g:3257:2: '!'
            {
             before(grammarAccess.getNotFeatureExpressionAccess().getExclamationMarkKeyword_1_0()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getNotFeatureExpressionAccess().getExclamationMarkKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotFeatureExpression__Group_1__0__Impl"


    // $ANTLR start "rule__NotFeatureExpression__Group_1__1"
    // InternalDsl.g:3266:1: rule__NotFeatureExpression__Group_1__1 : rule__NotFeatureExpression__Group_1__1__Impl rule__NotFeatureExpression__Group_1__2 ;
    public final void rule__NotFeatureExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3270:1: ( rule__NotFeatureExpression__Group_1__1__Impl rule__NotFeatureExpression__Group_1__2 )
            // InternalDsl.g:3271:2: rule__NotFeatureExpression__Group_1__1__Impl rule__NotFeatureExpression__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__NotFeatureExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotFeatureExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotFeatureExpression__Group_1__1"


    // $ANTLR start "rule__NotFeatureExpression__Group_1__1__Impl"
    // InternalDsl.g:3278:1: rule__NotFeatureExpression__Group_1__1__Impl : ( () ) ;
    public final void rule__NotFeatureExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3282:1: ( ( () ) )
            // InternalDsl.g:3283:1: ( () )
            {
            // InternalDsl.g:3283:1: ( () )
            // InternalDsl.g:3284:2: ()
            {
             before(grammarAccess.getNotFeatureExpressionAccess().getNotFeatureRuleAction_1_1()); 
            // InternalDsl.g:3285:2: ()
            // InternalDsl.g:3285:3: 
            {
            }

             after(grammarAccess.getNotFeatureExpressionAccess().getNotFeatureRuleAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotFeatureExpression__Group_1__1__Impl"


    // $ANTLR start "rule__NotFeatureExpression__Group_1__2"
    // InternalDsl.g:3293:1: rule__NotFeatureExpression__Group_1__2 : rule__NotFeatureExpression__Group_1__2__Impl ;
    public final void rule__NotFeatureExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3297:1: ( rule__NotFeatureExpression__Group_1__2__Impl )
            // InternalDsl.g:3298:2: rule__NotFeatureExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotFeatureExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotFeatureExpression__Group_1__2"


    // $ANTLR start "rule__NotFeatureExpression__Group_1__2__Impl"
    // InternalDsl.g:3304:1: rule__NotFeatureExpression__Group_1__2__Impl : ( ( rule__NotFeatureExpression__RuleAssignment_1_2 ) ) ;
    public final void rule__NotFeatureExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3308:1: ( ( ( rule__NotFeatureExpression__RuleAssignment_1_2 ) ) )
            // InternalDsl.g:3309:1: ( ( rule__NotFeatureExpression__RuleAssignment_1_2 ) )
            {
            // InternalDsl.g:3309:1: ( ( rule__NotFeatureExpression__RuleAssignment_1_2 ) )
            // InternalDsl.g:3310:2: ( rule__NotFeatureExpression__RuleAssignment_1_2 )
            {
             before(grammarAccess.getNotFeatureExpressionAccess().getRuleAssignment_1_2()); 
            // InternalDsl.g:3311:2: ( rule__NotFeatureExpression__RuleAssignment_1_2 )
            // InternalDsl.g:3311:3: rule__NotFeatureExpression__RuleAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__NotFeatureExpression__RuleAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNotFeatureExpressionAccess().getRuleAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotFeatureExpression__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryFeature__Group_1__0"
    // InternalDsl.g:3320:1: rule__PrimaryFeature__Group_1__0 : rule__PrimaryFeature__Group_1__0__Impl rule__PrimaryFeature__Group_1__1 ;
    public final void rule__PrimaryFeature__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3324:1: ( rule__PrimaryFeature__Group_1__0__Impl rule__PrimaryFeature__Group_1__1 )
            // InternalDsl.g:3325:2: rule__PrimaryFeature__Group_1__0__Impl rule__PrimaryFeature__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__PrimaryFeature__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryFeature__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryFeature__Group_1__0"


    // $ANTLR start "rule__PrimaryFeature__Group_1__0__Impl"
    // InternalDsl.g:3332:1: rule__PrimaryFeature__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PrimaryFeature__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3336:1: ( ( '(' ) )
            // InternalDsl.g:3337:1: ( '(' )
            {
            // InternalDsl.g:3337:1: ( '(' )
            // InternalDsl.g:3338:2: '('
            {
             before(grammarAccess.getPrimaryFeatureAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getPrimaryFeatureAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryFeature__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryFeature__Group_1__1"
    // InternalDsl.g:3347:1: rule__PrimaryFeature__Group_1__1 : rule__PrimaryFeature__Group_1__1__Impl rule__PrimaryFeature__Group_1__2 ;
    public final void rule__PrimaryFeature__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3351:1: ( rule__PrimaryFeature__Group_1__1__Impl rule__PrimaryFeature__Group_1__2 )
            // InternalDsl.g:3352:2: rule__PrimaryFeature__Group_1__1__Impl rule__PrimaryFeature__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__PrimaryFeature__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryFeature__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryFeature__Group_1__1"


    // $ANTLR start "rule__PrimaryFeature__Group_1__1__Impl"
    // InternalDsl.g:3359:1: rule__PrimaryFeature__Group_1__1__Impl : ( ruleFeatureExpression ) ;
    public final void rule__PrimaryFeature__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3363:1: ( ( ruleFeatureExpression ) )
            // InternalDsl.g:3364:1: ( ruleFeatureExpression )
            {
            // InternalDsl.g:3364:1: ( ruleFeatureExpression )
            // InternalDsl.g:3365:2: ruleFeatureExpression
            {
             before(grammarAccess.getPrimaryFeatureAccess().getFeatureExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleFeatureExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryFeatureAccess().getFeatureExpressionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryFeature__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryFeature__Group_1__2"
    // InternalDsl.g:3374:1: rule__PrimaryFeature__Group_1__2 : rule__PrimaryFeature__Group_1__2__Impl ;
    public final void rule__PrimaryFeature__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3378:1: ( rule__PrimaryFeature__Group_1__2__Impl )
            // InternalDsl.g:3379:2: rule__PrimaryFeature__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryFeature__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryFeature__Group_1__2"


    // $ANTLR start "rule__PrimaryFeature__Group_1__2__Impl"
    // InternalDsl.g:3385:1: rule__PrimaryFeature__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PrimaryFeature__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3389:1: ( ( ')' ) )
            // InternalDsl.g:3390:1: ( ')' )
            {
            // InternalDsl.g:3390:1: ( ')' )
            // InternalDsl.g:3391:2: ')'
            {
             before(grammarAccess.getPrimaryFeatureAccess().getRightParenthesisKeyword_1_2()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getPrimaryFeatureAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryFeature__Group_1__2__Impl"


    // $ANTLR start "rule__ImplicationConstraint__Group__0"
    // InternalDsl.g:3401:1: rule__ImplicationConstraint__Group__0 : rule__ImplicationConstraint__Group__0__Impl rule__ImplicationConstraint__Group__1 ;
    public final void rule__ImplicationConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3405:1: ( rule__ImplicationConstraint__Group__0__Impl rule__ImplicationConstraint__Group__1 )
            // InternalDsl.g:3406:2: rule__ImplicationConstraint__Group__0__Impl rule__ImplicationConstraint__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__ImplicationConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicationConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationConstraint__Group__0"


    // $ANTLR start "rule__ImplicationConstraint__Group__0__Impl"
    // InternalDsl.g:3413:1: rule__ImplicationConstraint__Group__0__Impl : ( ruleOrConstraint ) ;
    public final void rule__ImplicationConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3417:1: ( ( ruleOrConstraint ) )
            // InternalDsl.g:3418:1: ( ruleOrConstraint )
            {
            // InternalDsl.g:3418:1: ( ruleOrConstraint )
            // InternalDsl.g:3419:2: ruleOrConstraint
            {
             before(grammarAccess.getImplicationConstraintAccess().getOrConstraintParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOrConstraint();

            state._fsp--;

             after(grammarAccess.getImplicationConstraintAccess().getOrConstraintParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationConstraint__Group__0__Impl"


    // $ANTLR start "rule__ImplicationConstraint__Group__1"
    // InternalDsl.g:3428:1: rule__ImplicationConstraint__Group__1 : rule__ImplicationConstraint__Group__1__Impl ;
    public final void rule__ImplicationConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3432:1: ( rule__ImplicationConstraint__Group__1__Impl )
            // InternalDsl.g:3433:2: rule__ImplicationConstraint__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImplicationConstraint__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationConstraint__Group__1"


    // $ANTLR start "rule__ImplicationConstraint__Group__1__Impl"
    // InternalDsl.g:3439:1: rule__ImplicationConstraint__Group__1__Impl : ( ( rule__ImplicationConstraint__Group_1__0 )? ) ;
    public final void rule__ImplicationConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3443:1: ( ( ( rule__ImplicationConstraint__Group_1__0 )? ) )
            // InternalDsl.g:3444:1: ( ( rule__ImplicationConstraint__Group_1__0 )? )
            {
            // InternalDsl.g:3444:1: ( ( rule__ImplicationConstraint__Group_1__0 )? )
            // InternalDsl.g:3445:2: ( rule__ImplicationConstraint__Group_1__0 )?
            {
             before(grammarAccess.getImplicationConstraintAccess().getGroup_1()); 
            // InternalDsl.g:3446:2: ( rule__ImplicationConstraint__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==94) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:3446:3: rule__ImplicationConstraint__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImplicationConstraint__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImplicationConstraintAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationConstraint__Group__1__Impl"


    // $ANTLR start "rule__ImplicationConstraint__Group_1__0"
    // InternalDsl.g:3455:1: rule__ImplicationConstraint__Group_1__0 : rule__ImplicationConstraint__Group_1__0__Impl rule__ImplicationConstraint__Group_1__1 ;
    public final void rule__ImplicationConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3459:1: ( rule__ImplicationConstraint__Group_1__0__Impl rule__ImplicationConstraint__Group_1__1 )
            // InternalDsl.g:3460:2: rule__ImplicationConstraint__Group_1__0__Impl rule__ImplicationConstraint__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__ImplicationConstraint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicationConstraint__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationConstraint__Group_1__0"


    // $ANTLR start "rule__ImplicationConstraint__Group_1__0__Impl"
    // InternalDsl.g:3467:1: rule__ImplicationConstraint__Group_1__0__Impl : ( () ) ;
    public final void rule__ImplicationConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3471:1: ( ( () ) )
            // InternalDsl.g:3472:1: ( () )
            {
            // InternalDsl.g:3472:1: ( () )
            // InternalDsl.g:3473:2: ()
            {
             before(grammarAccess.getImplicationConstraintAccess().getImplicationConstraintRuleLeftRuleAction_1_0()); 
            // InternalDsl.g:3474:2: ()
            // InternalDsl.g:3474:3: 
            {
            }

             after(grammarAccess.getImplicationConstraintAccess().getImplicationConstraintRuleLeftRuleAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__ImplicationConstraint__Group_1__1"
    // InternalDsl.g:3482:1: rule__ImplicationConstraint__Group_1__1 : rule__ImplicationConstraint__Group_1__1__Impl rule__ImplicationConstraint__Group_1__2 ;
    public final void rule__ImplicationConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3486:1: ( rule__ImplicationConstraint__Group_1__1__Impl rule__ImplicationConstraint__Group_1__2 )
            // InternalDsl.g:3487:2: rule__ImplicationConstraint__Group_1__1__Impl rule__ImplicationConstraint__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__ImplicationConstraint__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImplicationConstraint__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationConstraint__Group_1__1"


    // $ANTLR start "rule__ImplicationConstraint__Group_1__1__Impl"
    // InternalDsl.g:3494:1: rule__ImplicationConstraint__Group_1__1__Impl : ( '=>' ) ;
    public final void rule__ImplicationConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3498:1: ( ( '=>' ) )
            // InternalDsl.g:3499:1: ( '=>' )
            {
            // InternalDsl.g:3499:1: ( '=>' )
            // InternalDsl.g:3500:2: '=>'
            {
             before(grammarAccess.getImplicationConstraintAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getImplicationConstraintAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__ImplicationConstraint__Group_1__2"
    // InternalDsl.g:3509:1: rule__ImplicationConstraint__Group_1__2 : rule__ImplicationConstraint__Group_1__2__Impl ;
    public final void rule__ImplicationConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3513:1: ( rule__ImplicationConstraint__Group_1__2__Impl )
            // InternalDsl.g:3514:2: rule__ImplicationConstraint__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImplicationConstraint__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationConstraint__Group_1__2"


    // $ANTLR start "rule__ImplicationConstraint__Group_1__2__Impl"
    // InternalDsl.g:3520:1: rule__ImplicationConstraint__Group_1__2__Impl : ( ( rule__ImplicationConstraint__RightRuleAssignment_1_2 ) ) ;
    public final void rule__ImplicationConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3524:1: ( ( ( rule__ImplicationConstraint__RightRuleAssignment_1_2 ) ) )
            // InternalDsl.g:3525:1: ( ( rule__ImplicationConstraint__RightRuleAssignment_1_2 ) )
            {
            // InternalDsl.g:3525:1: ( ( rule__ImplicationConstraint__RightRuleAssignment_1_2 ) )
            // InternalDsl.g:3526:2: ( rule__ImplicationConstraint__RightRuleAssignment_1_2 )
            {
             before(grammarAccess.getImplicationConstraintAccess().getRightRuleAssignment_1_2()); 
            // InternalDsl.g:3527:2: ( rule__ImplicationConstraint__RightRuleAssignment_1_2 )
            // InternalDsl.g:3527:3: rule__ImplicationConstraint__RightRuleAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ImplicationConstraint__RightRuleAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getImplicationConstraintAccess().getRightRuleAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationConstraint__Group_1__2__Impl"


    // $ANTLR start "rule__OrConstraint__Group__0"
    // InternalDsl.g:3536:1: rule__OrConstraint__Group__0 : rule__OrConstraint__Group__0__Impl rule__OrConstraint__Group__1 ;
    public final void rule__OrConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3540:1: ( rule__OrConstraint__Group__0__Impl rule__OrConstraint__Group__1 )
            // InternalDsl.g:3541:2: rule__OrConstraint__Group__0__Impl rule__OrConstraint__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__OrConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrConstraint__Group__0"


    // $ANTLR start "rule__OrConstraint__Group__0__Impl"
    // InternalDsl.g:3548:1: rule__OrConstraint__Group__0__Impl : ( ruleAndConstraint ) ;
    public final void rule__OrConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3552:1: ( ( ruleAndConstraint ) )
            // InternalDsl.g:3553:1: ( ruleAndConstraint )
            {
            // InternalDsl.g:3553:1: ( ruleAndConstraint )
            // InternalDsl.g:3554:2: ruleAndConstraint
            {
             before(grammarAccess.getOrConstraintAccess().getAndConstraintParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndConstraint();

            state._fsp--;

             after(grammarAccess.getOrConstraintAccess().getAndConstraintParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrConstraint__Group__0__Impl"


    // $ANTLR start "rule__OrConstraint__Group__1"
    // InternalDsl.g:3563:1: rule__OrConstraint__Group__1 : rule__OrConstraint__Group__1__Impl ;
    public final void rule__OrConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3567:1: ( rule__OrConstraint__Group__1__Impl )
            // InternalDsl.g:3568:2: rule__OrConstraint__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrConstraint__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrConstraint__Group__1"


    // $ANTLR start "rule__OrConstraint__Group__1__Impl"
    // InternalDsl.g:3574:1: rule__OrConstraint__Group__1__Impl : ( ( rule__OrConstraint__Group_1__0 )* ) ;
    public final void rule__OrConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3578:1: ( ( ( rule__OrConstraint__Group_1__0 )* ) )
            // InternalDsl.g:3579:1: ( ( rule__OrConstraint__Group_1__0 )* )
            {
            // InternalDsl.g:3579:1: ( ( rule__OrConstraint__Group_1__0 )* )
            // InternalDsl.g:3580:2: ( rule__OrConstraint__Group_1__0 )*
            {
             before(grammarAccess.getOrConstraintAccess().getGroup_1()); 
            // InternalDsl.g:3581:2: ( rule__OrConstraint__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==91) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:3581:3: rule__OrConstraint__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__OrConstraint__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getOrConstraintAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrConstraint__Group__1__Impl"


    // $ANTLR start "rule__OrConstraint__Group_1__0"
    // InternalDsl.g:3590:1: rule__OrConstraint__Group_1__0 : rule__OrConstraint__Group_1__0__Impl rule__OrConstraint__Group_1__1 ;
    public final void rule__OrConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3594:1: ( rule__OrConstraint__Group_1__0__Impl rule__OrConstraint__Group_1__1 )
            // InternalDsl.g:3595:2: rule__OrConstraint__Group_1__0__Impl rule__OrConstraint__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__OrConstraint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrConstraint__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrConstraint__Group_1__0"


    // $ANTLR start "rule__OrConstraint__Group_1__0__Impl"
    // InternalDsl.g:3602:1: rule__OrConstraint__Group_1__0__Impl : ( () ) ;
    public final void rule__OrConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3606:1: ( ( () ) )
            // InternalDsl.g:3607:1: ( () )
            {
            // InternalDsl.g:3607:1: ( () )
            // InternalDsl.g:3608:2: ()
            {
             before(grammarAccess.getOrConstraintAccess().getOrConstraintRuleRulesAction_1_0()); 
            // InternalDsl.g:3609:2: ()
            // InternalDsl.g:3609:3: 
            {
            }

             after(grammarAccess.getOrConstraintAccess().getOrConstraintRuleRulesAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__OrConstraint__Group_1__1"
    // InternalDsl.g:3617:1: rule__OrConstraint__Group_1__1 : rule__OrConstraint__Group_1__1__Impl rule__OrConstraint__Group_1__2 ;
    public final void rule__OrConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3621:1: ( rule__OrConstraint__Group_1__1__Impl rule__OrConstraint__Group_1__2 )
            // InternalDsl.g:3622:2: rule__OrConstraint__Group_1__1__Impl rule__OrConstraint__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__OrConstraint__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrConstraint__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrConstraint__Group_1__1"


    // $ANTLR start "rule__OrConstraint__Group_1__1__Impl"
    // InternalDsl.g:3629:1: rule__OrConstraint__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__OrConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3633:1: ( ( 'or' ) )
            // InternalDsl.g:3634:1: ( 'or' )
            {
            // InternalDsl.g:3634:1: ( 'or' )
            // InternalDsl.g:3635:2: 'or'
            {
             before(grammarAccess.getOrConstraintAccess().getOrKeyword_1_1()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getOrConstraintAccess().getOrKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__OrConstraint__Group_1__2"
    // InternalDsl.g:3644:1: rule__OrConstraint__Group_1__2 : rule__OrConstraint__Group_1__2__Impl ;
    public final void rule__OrConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3648:1: ( rule__OrConstraint__Group_1__2__Impl )
            // InternalDsl.g:3649:2: rule__OrConstraint__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrConstraint__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrConstraint__Group_1__2"


    // $ANTLR start "rule__OrConstraint__Group_1__2__Impl"
    // InternalDsl.g:3655:1: rule__OrConstraint__Group_1__2__Impl : ( ( rule__OrConstraint__RulesAssignment_1_2 ) ) ;
    public final void rule__OrConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3659:1: ( ( ( rule__OrConstraint__RulesAssignment_1_2 ) ) )
            // InternalDsl.g:3660:1: ( ( rule__OrConstraint__RulesAssignment_1_2 ) )
            {
            // InternalDsl.g:3660:1: ( ( rule__OrConstraint__RulesAssignment_1_2 ) )
            // InternalDsl.g:3661:2: ( rule__OrConstraint__RulesAssignment_1_2 )
            {
             before(grammarAccess.getOrConstraintAccess().getRulesAssignment_1_2()); 
            // InternalDsl.g:3662:2: ( rule__OrConstraint__RulesAssignment_1_2 )
            // InternalDsl.g:3662:3: rule__OrConstraint__RulesAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrConstraint__RulesAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrConstraintAccess().getRulesAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrConstraint__Group_1__2__Impl"


    // $ANTLR start "rule__AndConstraint__Group__0"
    // InternalDsl.g:3671:1: rule__AndConstraint__Group__0 : rule__AndConstraint__Group__0__Impl rule__AndConstraint__Group__1 ;
    public final void rule__AndConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3675:1: ( rule__AndConstraint__Group__0__Impl rule__AndConstraint__Group__1 )
            // InternalDsl.g:3676:2: rule__AndConstraint__Group__0__Impl rule__AndConstraint__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__AndConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndConstraint__Group__0"


    // $ANTLR start "rule__AndConstraint__Group__0__Impl"
    // InternalDsl.g:3683:1: rule__AndConstraint__Group__0__Impl : ( ruleNotConstraintExpression ) ;
    public final void rule__AndConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3687:1: ( ( ruleNotConstraintExpression ) )
            // InternalDsl.g:3688:1: ( ruleNotConstraintExpression )
            {
            // InternalDsl.g:3688:1: ( ruleNotConstraintExpression )
            // InternalDsl.g:3689:2: ruleNotConstraintExpression
            {
             before(grammarAccess.getAndConstraintAccess().getNotConstraintExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNotConstraintExpression();

            state._fsp--;

             after(grammarAccess.getAndConstraintAccess().getNotConstraintExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndConstraint__Group__0__Impl"


    // $ANTLR start "rule__AndConstraint__Group__1"
    // InternalDsl.g:3698:1: rule__AndConstraint__Group__1 : rule__AndConstraint__Group__1__Impl ;
    public final void rule__AndConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3702:1: ( rule__AndConstraint__Group__1__Impl )
            // InternalDsl.g:3703:2: rule__AndConstraint__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndConstraint__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndConstraint__Group__1"


    // $ANTLR start "rule__AndConstraint__Group__1__Impl"
    // InternalDsl.g:3709:1: rule__AndConstraint__Group__1__Impl : ( ( rule__AndConstraint__Group_1__0 )* ) ;
    public final void rule__AndConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3713:1: ( ( ( rule__AndConstraint__Group_1__0 )* ) )
            // InternalDsl.g:3714:1: ( ( rule__AndConstraint__Group_1__0 )* )
            {
            // InternalDsl.g:3714:1: ( ( rule__AndConstraint__Group_1__0 )* )
            // InternalDsl.g:3715:2: ( rule__AndConstraint__Group_1__0 )*
            {
             before(grammarAccess.getAndConstraintAccess().getGroup_1()); 
            // InternalDsl.g:3716:2: ( rule__AndConstraint__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==92) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:3716:3: rule__AndConstraint__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__AndConstraint__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getAndConstraintAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndConstraint__Group__1__Impl"


    // $ANTLR start "rule__AndConstraint__Group_1__0"
    // InternalDsl.g:3725:1: rule__AndConstraint__Group_1__0 : rule__AndConstraint__Group_1__0__Impl rule__AndConstraint__Group_1__1 ;
    public final void rule__AndConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3729:1: ( rule__AndConstraint__Group_1__0__Impl rule__AndConstraint__Group_1__1 )
            // InternalDsl.g:3730:2: rule__AndConstraint__Group_1__0__Impl rule__AndConstraint__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__AndConstraint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndConstraint__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndConstraint__Group_1__0"


    // $ANTLR start "rule__AndConstraint__Group_1__0__Impl"
    // InternalDsl.g:3737:1: rule__AndConstraint__Group_1__0__Impl : ( () ) ;
    public final void rule__AndConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3741:1: ( ( () ) )
            // InternalDsl.g:3742:1: ( () )
            {
            // InternalDsl.g:3742:1: ( () )
            // InternalDsl.g:3743:2: ()
            {
             before(grammarAccess.getAndConstraintAccess().getAndConstraintRuleRulesAction_1_0()); 
            // InternalDsl.g:3744:2: ()
            // InternalDsl.g:3744:3: 
            {
            }

             after(grammarAccess.getAndConstraintAccess().getAndConstraintRuleRulesAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__AndConstraint__Group_1__1"
    // InternalDsl.g:3752:1: rule__AndConstraint__Group_1__1 : rule__AndConstraint__Group_1__1__Impl rule__AndConstraint__Group_1__2 ;
    public final void rule__AndConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3756:1: ( rule__AndConstraint__Group_1__1__Impl rule__AndConstraint__Group_1__2 )
            // InternalDsl.g:3757:2: rule__AndConstraint__Group_1__1__Impl rule__AndConstraint__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__AndConstraint__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndConstraint__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndConstraint__Group_1__1"


    // $ANTLR start "rule__AndConstraint__Group_1__1__Impl"
    // InternalDsl.g:3764:1: rule__AndConstraint__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__AndConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3768:1: ( ( 'and' ) )
            // InternalDsl.g:3769:1: ( 'and' )
            {
            // InternalDsl.g:3769:1: ( 'and' )
            // InternalDsl.g:3770:2: 'and'
            {
             before(grammarAccess.getAndConstraintAccess().getAndKeyword_1_1()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getAndConstraintAccess().getAndKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__AndConstraint__Group_1__2"
    // InternalDsl.g:3779:1: rule__AndConstraint__Group_1__2 : rule__AndConstraint__Group_1__2__Impl ;
    public final void rule__AndConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3783:1: ( rule__AndConstraint__Group_1__2__Impl )
            // InternalDsl.g:3784:2: rule__AndConstraint__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndConstraint__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndConstraint__Group_1__2"


    // $ANTLR start "rule__AndConstraint__Group_1__2__Impl"
    // InternalDsl.g:3790:1: rule__AndConstraint__Group_1__2__Impl : ( ( rule__AndConstraint__RulesAssignment_1_2 ) ) ;
    public final void rule__AndConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3794:1: ( ( ( rule__AndConstraint__RulesAssignment_1_2 ) ) )
            // InternalDsl.g:3795:1: ( ( rule__AndConstraint__RulesAssignment_1_2 ) )
            {
            // InternalDsl.g:3795:1: ( ( rule__AndConstraint__RulesAssignment_1_2 ) )
            // InternalDsl.g:3796:2: ( rule__AndConstraint__RulesAssignment_1_2 )
            {
             before(grammarAccess.getAndConstraintAccess().getRulesAssignment_1_2()); 
            // InternalDsl.g:3797:2: ( rule__AndConstraint__RulesAssignment_1_2 )
            // InternalDsl.g:3797:3: rule__AndConstraint__RulesAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndConstraint__RulesAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndConstraintAccess().getRulesAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndConstraint__Group_1__2__Impl"


    // $ANTLR start "rule__NotConstraintExpression__Group_1__0"
    // InternalDsl.g:3806:1: rule__NotConstraintExpression__Group_1__0 : rule__NotConstraintExpression__Group_1__0__Impl rule__NotConstraintExpression__Group_1__1 ;
    public final void rule__NotConstraintExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3810:1: ( rule__NotConstraintExpression__Group_1__0__Impl rule__NotConstraintExpression__Group_1__1 )
            // InternalDsl.g:3811:2: rule__NotConstraintExpression__Group_1__0__Impl rule__NotConstraintExpression__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__NotConstraintExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotConstraintExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotConstraintExpression__Group_1__0"


    // $ANTLR start "rule__NotConstraintExpression__Group_1__0__Impl"
    // InternalDsl.g:3818:1: rule__NotConstraintExpression__Group_1__0__Impl : ( '!' ) ;
    public final void rule__NotConstraintExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3822:1: ( ( '!' ) )
            // InternalDsl.g:3823:1: ( '!' )
            {
            // InternalDsl.g:3823:1: ( '!' )
            // InternalDsl.g:3824:2: '!'
            {
             before(grammarAccess.getNotConstraintExpressionAccess().getExclamationMarkKeyword_1_0()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getNotConstraintExpressionAccess().getExclamationMarkKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotConstraintExpression__Group_1__0__Impl"


    // $ANTLR start "rule__NotConstraintExpression__Group_1__1"
    // InternalDsl.g:3833:1: rule__NotConstraintExpression__Group_1__1 : rule__NotConstraintExpression__Group_1__1__Impl rule__NotConstraintExpression__Group_1__2 ;
    public final void rule__NotConstraintExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3837:1: ( rule__NotConstraintExpression__Group_1__1__Impl rule__NotConstraintExpression__Group_1__2 )
            // InternalDsl.g:3838:2: rule__NotConstraintExpression__Group_1__1__Impl rule__NotConstraintExpression__Group_1__2
            {
            pushFollow(FOLLOW_30);
            rule__NotConstraintExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotConstraintExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotConstraintExpression__Group_1__1"


    // $ANTLR start "rule__NotConstraintExpression__Group_1__1__Impl"
    // InternalDsl.g:3845:1: rule__NotConstraintExpression__Group_1__1__Impl : ( () ) ;
    public final void rule__NotConstraintExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3849:1: ( ( () ) )
            // InternalDsl.g:3850:1: ( () )
            {
            // InternalDsl.g:3850:1: ( () )
            // InternalDsl.g:3851:2: ()
            {
             before(grammarAccess.getNotConstraintExpressionAccess().getNotConstraintRuleAction_1_1()); 
            // InternalDsl.g:3852:2: ()
            // InternalDsl.g:3852:3: 
            {
            }

             after(grammarAccess.getNotConstraintExpressionAccess().getNotConstraintRuleAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotConstraintExpression__Group_1__1__Impl"


    // $ANTLR start "rule__NotConstraintExpression__Group_1__2"
    // InternalDsl.g:3860:1: rule__NotConstraintExpression__Group_1__2 : rule__NotConstraintExpression__Group_1__2__Impl ;
    public final void rule__NotConstraintExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3864:1: ( rule__NotConstraintExpression__Group_1__2__Impl )
            // InternalDsl.g:3865:2: rule__NotConstraintExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotConstraintExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotConstraintExpression__Group_1__2"


    // $ANTLR start "rule__NotConstraintExpression__Group_1__2__Impl"
    // InternalDsl.g:3871:1: rule__NotConstraintExpression__Group_1__2__Impl : ( ( rule__NotConstraintExpression__RuleAssignment_1_2 ) ) ;
    public final void rule__NotConstraintExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3875:1: ( ( ( rule__NotConstraintExpression__RuleAssignment_1_2 ) ) )
            // InternalDsl.g:3876:1: ( ( rule__NotConstraintExpression__RuleAssignment_1_2 ) )
            {
            // InternalDsl.g:3876:1: ( ( rule__NotConstraintExpression__RuleAssignment_1_2 ) )
            // InternalDsl.g:3877:2: ( rule__NotConstraintExpression__RuleAssignment_1_2 )
            {
             before(grammarAccess.getNotConstraintExpressionAccess().getRuleAssignment_1_2()); 
            // InternalDsl.g:3878:2: ( rule__NotConstraintExpression__RuleAssignment_1_2 )
            // InternalDsl.g:3878:3: rule__NotConstraintExpression__RuleAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__NotConstraintExpression__RuleAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNotConstraintExpressionAccess().getRuleAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotConstraintExpression__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryConstraint__Group_1__0"
    // InternalDsl.g:3887:1: rule__PrimaryConstraint__Group_1__0 : rule__PrimaryConstraint__Group_1__0__Impl rule__PrimaryConstraint__Group_1__1 ;
    public final void rule__PrimaryConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3891:1: ( rule__PrimaryConstraint__Group_1__0__Impl rule__PrimaryConstraint__Group_1__1 )
            // InternalDsl.g:3892:2: rule__PrimaryConstraint__Group_1__0__Impl rule__PrimaryConstraint__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__PrimaryConstraint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryConstraint__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryConstraint__Group_1__0"


    // $ANTLR start "rule__PrimaryConstraint__Group_1__0__Impl"
    // InternalDsl.g:3899:1: rule__PrimaryConstraint__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PrimaryConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3903:1: ( ( '(' ) )
            // InternalDsl.g:3904:1: ( '(' )
            {
            // InternalDsl.g:3904:1: ( '(' )
            // InternalDsl.g:3905:2: '('
            {
             before(grammarAccess.getPrimaryConstraintAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getPrimaryConstraintAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryConstraint__Group_1__1"
    // InternalDsl.g:3914:1: rule__PrimaryConstraint__Group_1__1 : rule__PrimaryConstraint__Group_1__1__Impl rule__PrimaryConstraint__Group_1__2 ;
    public final void rule__PrimaryConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3918:1: ( rule__PrimaryConstraint__Group_1__1__Impl rule__PrimaryConstraint__Group_1__2 )
            // InternalDsl.g:3919:2: rule__PrimaryConstraint__Group_1__1__Impl rule__PrimaryConstraint__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__PrimaryConstraint__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryConstraint__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryConstraint__Group_1__1"


    // $ANTLR start "rule__PrimaryConstraint__Group_1__1__Impl"
    // InternalDsl.g:3926:1: rule__PrimaryConstraint__Group_1__1__Impl : ( ruleConstraintExpression ) ;
    public final void rule__PrimaryConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3930:1: ( ( ruleConstraintExpression ) )
            // InternalDsl.g:3931:1: ( ruleConstraintExpression )
            {
            // InternalDsl.g:3931:1: ( ruleConstraintExpression )
            // InternalDsl.g:3932:2: ruleConstraintExpression
            {
             before(grammarAccess.getPrimaryConstraintAccess().getConstraintExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleConstraintExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryConstraintAccess().getConstraintExpressionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryConstraint__Group_1__2"
    // InternalDsl.g:3941:1: rule__PrimaryConstraint__Group_1__2 : rule__PrimaryConstraint__Group_1__2__Impl ;
    public final void rule__PrimaryConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3945:1: ( rule__PrimaryConstraint__Group_1__2__Impl )
            // InternalDsl.g:3946:2: rule__PrimaryConstraint__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryConstraint__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryConstraint__Group_1__2"


    // $ANTLR start "rule__PrimaryConstraint__Group_1__2__Impl"
    // InternalDsl.g:3952:1: rule__PrimaryConstraint__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PrimaryConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3956:1: ( ( ')' ) )
            // InternalDsl.g:3957:1: ( ')' )
            {
            // InternalDsl.g:3957:1: ( ')' )
            // InternalDsl.g:3958:2: ')'
            {
             before(grammarAccess.getPrimaryConstraintAccess().getRightParenthesisKeyword_1_2()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getPrimaryConstraintAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryConstraint__Group_1__2__Impl"


    // $ANTLR start "rule__Model__PoliciesAssignment_0"
    // InternalDsl.g:3968:1: rule__Model__PoliciesAssignment_0 : ( rulePolicy ) ;
    public final void rule__Model__PoliciesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3972:1: ( ( rulePolicy ) )
            // InternalDsl.g:3973:2: ( rulePolicy )
            {
            // InternalDsl.g:3973:2: ( rulePolicy )
            // InternalDsl.g:3974:3: rulePolicy
            {
             before(grammarAccess.getModelAccess().getPoliciesPolicyParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPoliciesPolicyParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PoliciesAssignment_0"


    // $ANTLR start "rule__Model__PoliciesAssignment_1"
    // InternalDsl.g:3983:1: rule__Model__PoliciesAssignment_1 : ( rulePolicy ) ;
    public final void rule__Model__PoliciesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3987:1: ( ( rulePolicy ) )
            // InternalDsl.g:3988:2: ( rulePolicy )
            {
            // InternalDsl.g:3988:2: ( rulePolicy )
            // InternalDsl.g:3989:3: rulePolicy
            {
             before(grammarAccess.getModelAccess().getPoliciesPolicyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPoliciesPolicyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PoliciesAssignment_1"


    // $ANTLR start "rule__Policy__OverrideAssignment_0"
    // InternalDsl.g:3998:1: rule__Policy__OverrideAssignment_0 : ( ( 'override' ) ) ;
    public final void rule__Policy__OverrideAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4002:1: ( ( ( 'override' ) ) )
            // InternalDsl.g:4003:2: ( ( 'override' ) )
            {
            // InternalDsl.g:4003:2: ( ( 'override' ) )
            // InternalDsl.g:4004:3: ( 'override' )
            {
             before(grammarAccess.getPolicyAccess().getOverrideOverrideKeyword_0_0()); 
            // InternalDsl.g:4005:3: ( 'override' )
            // InternalDsl.g:4006:4: 'override'
            {
             before(grammarAccess.getPolicyAccess().getOverrideOverrideKeyword_0_0()); 
            match(input,95,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getOverrideOverrideKeyword_0_0()); 

            }

             after(grammarAccess.getPolicyAccess().getOverrideOverrideKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__OverrideAssignment_0"


    // $ANTLR start "rule__Policy__ActionAssignment_1"
    // InternalDsl.g:4017:1: rule__Policy__ActionAssignment_1 : ( ruleActionEnum ) ;
    public final void rule__Policy__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4021:1: ( ( ruleActionEnum ) )
            // InternalDsl.g:4022:2: ( ruleActionEnum )
            {
            // InternalDsl.g:4022:2: ( ruleActionEnum )
            // InternalDsl.g:4023:3: ruleActionEnum
            {
             before(grammarAccess.getPolicyAccess().getActionActionEnumEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActionEnum();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getActionActionEnumEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__ActionAssignment_1"


    // $ANTLR start "rule__Policy__ActionTypeAssignment_2"
    // InternalDsl.g:4032:1: rule__Policy__ActionTypeAssignment_2 : ( ruleFeatureTypeEnum ) ;
    public final void rule__Policy__ActionTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4036:1: ( ( ruleFeatureTypeEnum ) )
            // InternalDsl.g:4037:2: ( ruleFeatureTypeEnum )
            {
            // InternalDsl.g:4037:2: ( ruleFeatureTypeEnum )
            // InternalDsl.g:4038:3: ruleFeatureTypeEnum
            {
             before(grammarAccess.getPolicyAccess().getActionTypeFeatureTypeEnumEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureTypeEnum();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getActionTypeFeatureTypeEnumEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__ActionTypeAssignment_2"


    // $ANTLR start "rule__Policy__FeatureRuleAssignment_4"
    // InternalDsl.g:4047:1: rule__Policy__FeatureRuleAssignment_4 : ( ruleFeatureExpression ) ;
    public final void rule__Policy__FeatureRuleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4051:1: ( ( ruleFeatureExpression ) )
            // InternalDsl.g:4052:2: ( ruleFeatureExpression )
            {
            // InternalDsl.g:4052:2: ( ruleFeatureExpression )
            // InternalDsl.g:4053:3: ruleFeatureExpression
            {
             before(grammarAccess.getPolicyAccess().getFeatureRuleFeatureExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureExpression();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getFeatureRuleFeatureExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__FeatureRuleAssignment_4"


    // $ANTLR start "rule__Policy__ConstraintRuleAssignment_7"
    // InternalDsl.g:4062:1: rule__Policy__ConstraintRuleAssignment_7 : ( ruleConstraintExpression ) ;
    public final void rule__Policy__ConstraintRuleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4066:1: ( ( ruleConstraintExpression ) )
            // InternalDsl.g:4067:2: ( ruleConstraintExpression )
            {
            // InternalDsl.g:4067:2: ( ruleConstraintExpression )
            // InternalDsl.g:4068:3: ruleConstraintExpression
            {
             before(grammarAccess.getPolicyAccess().getConstraintRuleConstraintExpressionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraintExpression();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getConstraintRuleConstraintExpressionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__ConstraintRuleAssignment_7"


    // $ANTLR start "rule__IsTargetTypeConstraintRule__TypeAssignment_3"
    // InternalDsl.g:4077:1: rule__IsTargetTypeConstraintRule__TypeAssignment_3 : ( ruleFeatureTypeEnum ) ;
    public final void rule__IsTargetTypeConstraintRule__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4081:1: ( ( ruleFeatureTypeEnum ) )
            // InternalDsl.g:4082:2: ( ruleFeatureTypeEnum )
            {
            // InternalDsl.g:4082:2: ( ruleFeatureTypeEnum )
            // InternalDsl.g:4083:3: ruleFeatureTypeEnum
            {
             before(grammarAccess.getIsTargetTypeConstraintRuleAccess().getTypeFeatureTypeEnumEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureTypeEnum();

            state._fsp--;

             after(grammarAccess.getIsTargetTypeConstraintRuleAccess().getTypeFeatureTypeEnumEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetTypeConstraintRule__TypeAssignment_3"


    // $ANTLR start "rule__IsParentConstraintRule__TypeAssignment_3"
    // InternalDsl.g:4092:1: rule__IsParentConstraintRule__TypeAssignment_3 : ( ruleFeatureTypeEnum ) ;
    public final void rule__IsParentConstraintRule__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4096:1: ( ( ruleFeatureTypeEnum ) )
            // InternalDsl.g:4097:2: ( ruleFeatureTypeEnum )
            {
            // InternalDsl.g:4097:2: ( ruleFeatureTypeEnum )
            // InternalDsl.g:4098:3: ruleFeatureTypeEnum
            {
             before(grammarAccess.getIsParentConstraintRuleAccess().getTypeFeatureTypeEnumEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureTypeEnum();

            state._fsp--;

             after(grammarAccess.getIsParentConstraintRuleAccess().getTypeFeatureTypeEnumEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsParentConstraintRule__TypeAssignment_3"


    // $ANTLR start "rule__IsSourceTypeConstraintRule__TypeAssignment_3"
    // InternalDsl.g:4107:1: rule__IsSourceTypeConstraintRule__TypeAssignment_3 : ( ruleFeatureTypeEnum ) ;
    public final void rule__IsSourceTypeConstraintRule__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4111:1: ( ( ruleFeatureTypeEnum ) )
            // InternalDsl.g:4112:2: ( ruleFeatureTypeEnum )
            {
            // InternalDsl.g:4112:2: ( ruleFeatureTypeEnum )
            // InternalDsl.g:4113:3: ruleFeatureTypeEnum
            {
             before(grammarAccess.getIsSourceTypeConstraintRuleAccess().getTypeFeatureTypeEnumEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureTypeEnum();

            state._fsp--;

             after(grammarAccess.getIsSourceTypeConstraintRuleAccess().getTypeFeatureTypeEnumEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsSourceTypeConstraintRule__TypeAssignment_3"


    // $ANTLR start "rule__IsTargetConstraintRule__TypeAssignment_3"
    // InternalDsl.g:4122:1: rule__IsTargetConstraintRule__TypeAssignment_3 : ( ruleFeatureTypeEnum ) ;
    public final void rule__IsTargetConstraintRule__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4126:1: ( ( ruleFeatureTypeEnum ) )
            // InternalDsl.g:4127:2: ( ruleFeatureTypeEnum )
            {
            // InternalDsl.g:4127:2: ( ruleFeatureTypeEnum )
            // InternalDsl.g:4128:3: ruleFeatureTypeEnum
            {
             before(grammarAccess.getIsTargetConstraintRuleAccess().getTypeFeatureTypeEnumEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureTypeEnum();

            state._fsp--;

             after(grammarAccess.getIsTargetConstraintRuleAccess().getTypeFeatureTypeEnumEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetConstraintRule__TypeAssignment_3"


    // $ANTLR start "rule__InTypeConstraintRule__TypeAssignment_3"
    // InternalDsl.g:4137:1: rule__InTypeConstraintRule__TypeAssignment_3 : ( ruleFeatureTypeEnum ) ;
    public final void rule__InTypeConstraintRule__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4141:1: ( ( ruleFeatureTypeEnum ) )
            // InternalDsl.g:4142:2: ( ruleFeatureTypeEnum )
            {
            // InternalDsl.g:4142:2: ( ruleFeatureTypeEnum )
            // InternalDsl.g:4143:3: ruleFeatureTypeEnum
            {
             before(grammarAccess.getInTypeConstraintRuleAccess().getTypeFeatureTypeEnumEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureTypeEnum();

            state._fsp--;

             after(grammarAccess.getInTypeConstraintRuleAccess().getTypeFeatureTypeEnumEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InTypeConstraintRule__TypeAssignment_3"


    // $ANTLR start "rule__IsFeature__FeatureNameAssignment_1"
    // InternalDsl.g:4152:1: rule__IsFeature__FeatureNameAssignment_1 : ( ruleFeatureNameEnum ) ;
    public final void rule__IsFeature__FeatureNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4156:1: ( ( ruleFeatureNameEnum ) )
            // InternalDsl.g:4157:2: ( ruleFeatureNameEnum )
            {
            // InternalDsl.g:4157:2: ( ruleFeatureNameEnum )
            // InternalDsl.g:4158:3: ruleFeatureNameEnum
            {
             before(grammarAccess.getIsFeatureAccess().getFeatureNameFeatureNameEnumEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureNameEnum();

            state._fsp--;

             after(grammarAccess.getIsFeatureAccess().getFeatureNameFeatureNameEnumEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsFeature__FeatureNameAssignment_1"


    // $ANTLR start "rule__OrFeature__RulesAssignment_1_2"
    // InternalDsl.g:4167:1: rule__OrFeature__RulesAssignment_1_2 : ( ruleAndFeature ) ;
    public final void rule__OrFeature__RulesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4171:1: ( ( ruleAndFeature ) )
            // InternalDsl.g:4172:2: ( ruleAndFeature )
            {
            // InternalDsl.g:4172:2: ( ruleAndFeature )
            // InternalDsl.g:4173:3: ruleAndFeature
            {
             before(grammarAccess.getOrFeatureAccess().getRulesAndFeatureParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndFeature();

            state._fsp--;

             after(grammarAccess.getOrFeatureAccess().getRulesAndFeatureParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrFeature__RulesAssignment_1_2"


    // $ANTLR start "rule__AndFeature__RulesAssignment_1_2"
    // InternalDsl.g:4182:1: rule__AndFeature__RulesAssignment_1_2 : ( ruleNotFeatureExpression ) ;
    public final void rule__AndFeature__RulesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4186:1: ( ( ruleNotFeatureExpression ) )
            // InternalDsl.g:4187:2: ( ruleNotFeatureExpression )
            {
            // InternalDsl.g:4187:2: ( ruleNotFeatureExpression )
            // InternalDsl.g:4188:3: ruleNotFeatureExpression
            {
             before(grammarAccess.getAndFeatureAccess().getRulesNotFeatureExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNotFeatureExpression();

            state._fsp--;

             after(grammarAccess.getAndFeatureAccess().getRulesNotFeatureExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndFeature__RulesAssignment_1_2"


    // $ANTLR start "rule__NotFeatureExpression__RuleAssignment_1_2"
    // InternalDsl.g:4197:1: rule__NotFeatureExpression__RuleAssignment_1_2 : ( rulePrimaryFeature ) ;
    public final void rule__NotFeatureExpression__RuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4201:1: ( ( rulePrimaryFeature ) )
            // InternalDsl.g:4202:2: ( rulePrimaryFeature )
            {
            // InternalDsl.g:4202:2: ( rulePrimaryFeature )
            // InternalDsl.g:4203:3: rulePrimaryFeature
            {
             before(grammarAccess.getNotFeatureExpressionAccess().getRulePrimaryFeatureParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryFeature();

            state._fsp--;

             after(grammarAccess.getNotFeatureExpressionAccess().getRulePrimaryFeatureParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotFeatureExpression__RuleAssignment_1_2"


    // $ANTLR start "rule__ImplicationConstraint__RightRuleAssignment_1_2"
    // InternalDsl.g:4212:1: rule__ImplicationConstraint__RightRuleAssignment_1_2 : ( ruleOrConstraint ) ;
    public final void rule__ImplicationConstraint__RightRuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4216:1: ( ( ruleOrConstraint ) )
            // InternalDsl.g:4217:2: ( ruleOrConstraint )
            {
            // InternalDsl.g:4217:2: ( ruleOrConstraint )
            // InternalDsl.g:4218:3: ruleOrConstraint
            {
             before(grammarAccess.getImplicationConstraintAccess().getRightRuleOrConstraintParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrConstraint();

            state._fsp--;

             after(grammarAccess.getImplicationConstraintAccess().getRightRuleOrConstraintParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicationConstraint__RightRuleAssignment_1_2"


    // $ANTLR start "rule__OrConstraint__RulesAssignment_1_2"
    // InternalDsl.g:4227:1: rule__OrConstraint__RulesAssignment_1_2 : ( ruleAndConstraint ) ;
    public final void rule__OrConstraint__RulesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4231:1: ( ( ruleAndConstraint ) )
            // InternalDsl.g:4232:2: ( ruleAndConstraint )
            {
            // InternalDsl.g:4232:2: ( ruleAndConstraint )
            // InternalDsl.g:4233:3: ruleAndConstraint
            {
             before(grammarAccess.getOrConstraintAccess().getRulesAndConstraintParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndConstraint();

            state._fsp--;

             after(grammarAccess.getOrConstraintAccess().getRulesAndConstraintParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrConstraint__RulesAssignment_1_2"


    // $ANTLR start "rule__AndConstraint__RulesAssignment_1_2"
    // InternalDsl.g:4242:1: rule__AndConstraint__RulesAssignment_1_2 : ( ruleNotConstraintExpression ) ;
    public final void rule__AndConstraint__RulesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4246:1: ( ( ruleNotConstraintExpression ) )
            // InternalDsl.g:4247:2: ( ruleNotConstraintExpression )
            {
            // InternalDsl.g:4247:2: ( ruleNotConstraintExpression )
            // InternalDsl.g:4248:3: ruleNotConstraintExpression
            {
             before(grammarAccess.getAndConstraintAccess().getRulesNotConstraintExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNotConstraintExpression();

            state._fsp--;

             after(grammarAccess.getAndConstraintAccess().getRulesNotConstraintExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndConstraint__RulesAssignment_1_2"


    // $ANTLR start "rule__NotConstraintExpression__RuleAssignment_1_2"
    // InternalDsl.g:4257:1: rule__NotConstraintExpression__RuleAssignment_1_2 : ( rulePrimaryConstraint ) ;
    public final void rule__NotConstraintExpression__RuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4261:1: ( ( rulePrimaryConstraint ) )
            // InternalDsl.g:4262:2: ( rulePrimaryConstraint )
            {
            // InternalDsl.g:4262:2: ( rulePrimaryConstraint )
            // InternalDsl.g:4263:3: rulePrimaryConstraint
            {
             before(grammarAccess.getNotConstraintExpressionAccess().getRulePrimaryConstraintParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryConstraint();

            state._fsp--;

             after(grammarAccess.getNotConstraintExpressionAccess().getRulePrimaryConstraintParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotConstraintExpression__RuleAssignment_1_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000001FF800L,0x0000000080000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000001FF802L,0x0000000080000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000FFFFE00000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0xFFFFFF0000000000L,0x0000000026003FFFL});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000027FE2000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000007FE0000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0xFFFFFF0000000000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0xFFFFFF0000000000L,0x0000000006001FFFL});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xFFFFFF0000000000L,0x0000000006003FFFL});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000007FE2000L});

}