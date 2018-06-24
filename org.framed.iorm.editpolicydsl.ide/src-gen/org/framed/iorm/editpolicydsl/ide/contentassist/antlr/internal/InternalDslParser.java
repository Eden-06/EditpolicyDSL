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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Add'", "'Reconnect'", "'Create'", "'Start'", "'Execute'", "'Direct_Edit'", "'Add_Property'", "'Create_Attribute'", "'Create_Operation'", "'Create_Property'", "'Acyclic'", "'CompartmentType'", "'Cyclic'", "'Total'", "'DataType'", "'Fulfillment'", "'Inheritance'", "'Group'", "'Reflexive'", "'Relationship'", "'RelationshipExclusion'", "'RelationshipImplication'", "'RoleType'", "'RoleEquivalence'", "'RoleGroup'", "'RoleImplication'", "'RoleProhibition'", "'Irreflexive'", "'NaturalType'", "'Compartment_Behavior'", "'Compartment_Inheritance'", "'Compartment_Properties'", "'Compartment_Structure'", "'Compartment_Types'", "'Contains_Compartments'", "'Compartments'", "'Data_Type_Inheritance'", "'Data_Types'", "'Dates'", "'Dependent'", "'Group_Constraints'", "'Inter_Relationship_Constraints'", "'Intra_Relationship_Constraints'", "'Naturals'", "'Occurrence_Constraints'", "'On_Compartments'", "'On_Relationships'", "'Parthood_Constraints'", "'Participants'", "'Playable'", "'Playable_by_Defining_Compartment'", "'Players'", "'Relationship_Cardinality'", "'Relationship_Constraints'", "'Relationships'", "'RML_Feature_Model'", "'Role_Behavior'", "'Role_Constraints'", "'Role_Equivalence'", "'Role_Implication'", "'Role_Inheritance'", "'Role_Prohibition'", "'Role_Properties'", "'Role_Structure'", "'Role_Types'", "'Roles'", "'('", "')'", "'when'", "';'", "'ContainsType'", "'IsTargetType'", "'IsTargetConnectionType'", "'IsSourceType'", "'InType'", "'SourceEqualsTarget'", "'SourceEqualsTargetType'", "'true'", "'false'", "'or'", "'and'", "'!'", "'=>'", "'override'"
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

            if ( ((LA1_0>=11 && LA1_0<=20)||LA1_0==94) ) {
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


    // $ANTLR start "entryRuleContainsTypeConstrainRule"
    // InternalDsl.g:128:1: entryRuleContainsTypeConstrainRule : ruleContainsTypeConstrainRule EOF ;
    public final void entryRuleContainsTypeConstrainRule() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleContainsTypeConstrainRule EOF )
            // InternalDsl.g:130:1: ruleContainsTypeConstrainRule EOF
            {
             before(grammarAccess.getContainsTypeConstrainRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleContainsTypeConstrainRule();

            state._fsp--;

             after(grammarAccess.getContainsTypeConstrainRuleRule()); 
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
    // $ANTLR end "entryRuleContainsTypeConstrainRule"


    // $ANTLR start "ruleContainsTypeConstrainRule"
    // InternalDsl.g:137:1: ruleContainsTypeConstrainRule : ( ( rule__ContainsTypeConstrainRule__Group__0 ) ) ;
    public final void ruleContainsTypeConstrainRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__ContainsTypeConstrainRule__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__ContainsTypeConstrainRule__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__ContainsTypeConstrainRule__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__ContainsTypeConstrainRule__Group__0 )
            {
             before(grammarAccess.getContainsTypeConstrainRuleAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__ContainsTypeConstrainRule__Group__0 )
            // InternalDsl.g:144:4: rule__ContainsTypeConstrainRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContainsTypeConstrainRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainsTypeConstrainRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleContainsTypeConstrainRule"


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


    // $ANTLR start "entryRuleIsTargetConnectionTypeConstraintRule"
    // InternalDsl.g:178:1: entryRuleIsTargetConnectionTypeConstraintRule : ruleIsTargetConnectionTypeConstraintRule EOF ;
    public final void entryRuleIsTargetConnectionTypeConstraintRule() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleIsTargetConnectionTypeConstraintRule EOF )
            // InternalDsl.g:180:1: ruleIsTargetConnectionTypeConstraintRule EOF
            {
             before(grammarAccess.getIsTargetConnectionTypeConstraintRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleIsTargetConnectionTypeConstraintRule();

            state._fsp--;

             after(grammarAccess.getIsTargetConnectionTypeConstraintRuleRule()); 
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
    // $ANTLR end "entryRuleIsTargetConnectionTypeConstraintRule"


    // $ANTLR start "ruleIsTargetConnectionTypeConstraintRule"
    // InternalDsl.g:187:1: ruleIsTargetConnectionTypeConstraintRule : ( ( rule__IsTargetConnectionTypeConstraintRule__Group__0 ) ) ;
    public final void ruleIsTargetConnectionTypeConstraintRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__IsTargetConnectionTypeConstraintRule__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__IsTargetConnectionTypeConstraintRule__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__IsTargetConnectionTypeConstraintRule__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__IsTargetConnectionTypeConstraintRule__Group__0 )
            {
             before(grammarAccess.getIsTargetConnectionTypeConstraintRuleAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__IsTargetConnectionTypeConstraintRule__Group__0 )
            // InternalDsl.g:194:4: rule__IsTargetConnectionTypeConstraintRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IsTargetConnectionTypeConstraintRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIsTargetConnectionTypeConstraintRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleIsTargetConnectionTypeConstraintRule"


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


    // $ANTLR start "entryRuleInTypeConstraintRule"
    // InternalDsl.g:228:1: entryRuleInTypeConstraintRule : ruleInTypeConstraintRule EOF ;
    public final void entryRuleInTypeConstraintRule() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleInTypeConstraintRule EOF )
            // InternalDsl.g:230:1: ruleInTypeConstraintRule EOF
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
    // InternalDsl.g:237:1: ruleInTypeConstraintRule : ( ( rule__InTypeConstraintRule__Group__0 ) ) ;
    public final void ruleInTypeConstraintRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__InTypeConstraintRule__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__InTypeConstraintRule__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__InTypeConstraintRule__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__InTypeConstraintRule__Group__0 )
            {
             before(grammarAccess.getInTypeConstraintRuleAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__InTypeConstraintRule__Group__0 )
            // InternalDsl.g:244:4: rule__InTypeConstraintRule__Group__0
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
    // InternalDsl.g:253:1: entryRuleSourceEqualsTargetConstraintRule : ruleSourceEqualsTargetConstraintRule EOF ;
    public final void entryRuleSourceEqualsTargetConstraintRule() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleSourceEqualsTargetConstraintRule EOF )
            // InternalDsl.g:255:1: ruleSourceEqualsTargetConstraintRule EOF
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
    // InternalDsl.g:262:1: ruleSourceEqualsTargetConstraintRule : ( ( rule__SourceEqualsTargetConstraintRule__Group__0 ) ) ;
    public final void ruleSourceEqualsTargetConstraintRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__SourceEqualsTargetConstraintRule__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__SourceEqualsTargetConstraintRule__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__SourceEqualsTargetConstraintRule__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__SourceEqualsTargetConstraintRule__Group__0 )
            {
             before(grammarAccess.getSourceEqualsTargetConstraintRuleAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__SourceEqualsTargetConstraintRule__Group__0 )
            // InternalDsl.g:269:4: rule__SourceEqualsTargetConstraintRule__Group__0
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
    // InternalDsl.g:278:1: entryRuleSourceEqualsTargetTypeConstraintRule : ruleSourceEqualsTargetTypeConstraintRule EOF ;
    public final void entryRuleSourceEqualsTargetTypeConstraintRule() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleSourceEqualsTargetTypeConstraintRule EOF )
            // InternalDsl.g:280:1: ruleSourceEqualsTargetTypeConstraintRule EOF
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
    // InternalDsl.g:287:1: ruleSourceEqualsTargetTypeConstraintRule : ( ( rule__SourceEqualsTargetTypeConstraintRule__Group__0 ) ) ;
    public final void ruleSourceEqualsTargetTypeConstraintRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__SourceEqualsTargetTypeConstraintRule__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__SourceEqualsTargetTypeConstraintRule__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__SourceEqualsTargetTypeConstraintRule__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__SourceEqualsTargetTypeConstraintRule__Group__0 )
            {
             before(grammarAccess.getSourceEqualsTargetTypeConstraintRuleAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__SourceEqualsTargetTypeConstraintRule__Group__0 )
            // InternalDsl.g:294:4: rule__SourceEqualsTargetTypeConstraintRule__Group__0
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
    // InternalDsl.g:303:1: entryRuleFeatureRule : ruleFeatureRule EOF ;
    public final void entryRuleFeatureRule() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleFeatureRule EOF )
            // InternalDsl.g:305:1: ruleFeatureRule EOF
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
    // InternalDsl.g:312:1: ruleFeatureRule : ( ( rule__FeatureRule__Alternatives ) ) ;
    public final void ruleFeatureRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__FeatureRule__Alternatives ) ) )
            // InternalDsl.g:317:2: ( ( rule__FeatureRule__Alternatives ) )
            {
            // InternalDsl.g:317:2: ( ( rule__FeatureRule__Alternatives ) )
            // InternalDsl.g:318:3: ( rule__FeatureRule__Alternatives )
            {
             before(grammarAccess.getFeatureRuleAccess().getAlternatives()); 
            // InternalDsl.g:319:3: ( rule__FeatureRule__Alternatives )
            // InternalDsl.g:319:4: rule__FeatureRule__Alternatives
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
    // InternalDsl.g:328:1: entryRuleIsFeature : ruleIsFeature EOF ;
    public final void entryRuleIsFeature() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleIsFeature EOF )
            // InternalDsl.g:330:1: ruleIsFeature EOF
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
    // InternalDsl.g:337:1: ruleIsFeature : ( ( rule__IsFeature__Group__0 ) ) ;
    public final void ruleIsFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__IsFeature__Group__0 ) ) )
            // InternalDsl.g:342:2: ( ( rule__IsFeature__Group__0 ) )
            {
            // InternalDsl.g:342:2: ( ( rule__IsFeature__Group__0 ) )
            // InternalDsl.g:343:3: ( rule__IsFeature__Group__0 )
            {
             before(grammarAccess.getIsFeatureAccess().getGroup()); 
            // InternalDsl.g:344:3: ( rule__IsFeature__Group__0 )
            // InternalDsl.g:344:4: rule__IsFeature__Group__0
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
    // InternalDsl.g:353:1: entryRuleTrueFeatureRule : ruleTrueFeatureRule EOF ;
    public final void entryRuleTrueFeatureRule() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleTrueFeatureRule EOF )
            // InternalDsl.g:355:1: ruleTrueFeatureRule EOF
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
    // InternalDsl.g:362:1: ruleTrueFeatureRule : ( ( rule__TrueFeatureRule__Group__0 ) ) ;
    public final void ruleTrueFeatureRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__TrueFeatureRule__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__TrueFeatureRule__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__TrueFeatureRule__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__TrueFeatureRule__Group__0 )
            {
             before(grammarAccess.getTrueFeatureRuleAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__TrueFeatureRule__Group__0 )
            // InternalDsl.g:369:4: rule__TrueFeatureRule__Group__0
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
    // InternalDsl.g:378:1: entryRuleTrueConstraintRule : ruleTrueConstraintRule EOF ;
    public final void entryRuleTrueConstraintRule() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleTrueConstraintRule EOF )
            // InternalDsl.g:380:1: ruleTrueConstraintRule EOF
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
    // InternalDsl.g:387:1: ruleTrueConstraintRule : ( ( rule__TrueConstraintRule__Group__0 ) ) ;
    public final void ruleTrueConstraintRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__TrueConstraintRule__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__TrueConstraintRule__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__TrueConstraintRule__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__TrueConstraintRule__Group__0 )
            {
             before(grammarAccess.getTrueConstraintRuleAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__TrueConstraintRule__Group__0 )
            // InternalDsl.g:394:4: rule__TrueConstraintRule__Group__0
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
    // InternalDsl.g:403:1: entryRuleFalseFeatureRule : ruleFalseFeatureRule EOF ;
    public final void entryRuleFalseFeatureRule() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( ruleFalseFeatureRule EOF )
            // InternalDsl.g:405:1: ruleFalseFeatureRule EOF
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
    // InternalDsl.g:412:1: ruleFalseFeatureRule : ( ( rule__FalseFeatureRule__Group__0 ) ) ;
    public final void ruleFalseFeatureRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__FalseFeatureRule__Group__0 ) ) )
            // InternalDsl.g:417:2: ( ( rule__FalseFeatureRule__Group__0 ) )
            {
            // InternalDsl.g:417:2: ( ( rule__FalseFeatureRule__Group__0 ) )
            // InternalDsl.g:418:3: ( rule__FalseFeatureRule__Group__0 )
            {
             before(grammarAccess.getFalseFeatureRuleAccess().getGroup()); 
            // InternalDsl.g:419:3: ( rule__FalseFeatureRule__Group__0 )
            // InternalDsl.g:419:4: rule__FalseFeatureRule__Group__0
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
    // InternalDsl.g:428:1: entryRuleFalseConstraintRule : ruleFalseConstraintRule EOF ;
    public final void entryRuleFalseConstraintRule() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( ruleFalseConstraintRule EOF )
            // InternalDsl.g:430:1: ruleFalseConstraintRule EOF
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
    // InternalDsl.g:437:1: ruleFalseConstraintRule : ( ( rule__FalseConstraintRule__Group__0 ) ) ;
    public final void ruleFalseConstraintRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( ( rule__FalseConstraintRule__Group__0 ) ) )
            // InternalDsl.g:442:2: ( ( rule__FalseConstraintRule__Group__0 ) )
            {
            // InternalDsl.g:442:2: ( ( rule__FalseConstraintRule__Group__0 ) )
            // InternalDsl.g:443:3: ( rule__FalseConstraintRule__Group__0 )
            {
             before(grammarAccess.getFalseConstraintRuleAccess().getGroup()); 
            // InternalDsl.g:444:3: ( rule__FalseConstraintRule__Group__0 )
            // InternalDsl.g:444:4: rule__FalseConstraintRule__Group__0
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
    // InternalDsl.g:453:1: entryRuleFeatureExpression : ruleFeatureExpression EOF ;
    public final void entryRuleFeatureExpression() throws RecognitionException {
        try {
            // InternalDsl.g:454:1: ( ruleFeatureExpression EOF )
            // InternalDsl.g:455:1: ruleFeatureExpression EOF
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
    // InternalDsl.g:462:1: ruleFeatureExpression : ( ruleOrFeature ) ;
    public final void ruleFeatureExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:2: ( ( ruleOrFeature ) )
            // InternalDsl.g:467:2: ( ruleOrFeature )
            {
            // InternalDsl.g:467:2: ( ruleOrFeature )
            // InternalDsl.g:468:3: ruleOrFeature
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
    // InternalDsl.g:478:1: entryRuleOrFeature : ruleOrFeature EOF ;
    public final void entryRuleOrFeature() throws RecognitionException {
        try {
            // InternalDsl.g:479:1: ( ruleOrFeature EOF )
            // InternalDsl.g:480:1: ruleOrFeature EOF
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
    // InternalDsl.g:487:1: ruleOrFeature : ( ( rule__OrFeature__Group__0 ) ) ;
    public final void ruleOrFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:2: ( ( ( rule__OrFeature__Group__0 ) ) )
            // InternalDsl.g:492:2: ( ( rule__OrFeature__Group__0 ) )
            {
            // InternalDsl.g:492:2: ( ( rule__OrFeature__Group__0 ) )
            // InternalDsl.g:493:3: ( rule__OrFeature__Group__0 )
            {
             before(grammarAccess.getOrFeatureAccess().getGroup()); 
            // InternalDsl.g:494:3: ( rule__OrFeature__Group__0 )
            // InternalDsl.g:494:4: rule__OrFeature__Group__0
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
    // InternalDsl.g:503:1: entryRuleAndFeature : ruleAndFeature EOF ;
    public final void entryRuleAndFeature() throws RecognitionException {
        try {
            // InternalDsl.g:504:1: ( ruleAndFeature EOF )
            // InternalDsl.g:505:1: ruleAndFeature EOF
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
    // InternalDsl.g:512:1: ruleAndFeature : ( ( rule__AndFeature__Group__0 ) ) ;
    public final void ruleAndFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:2: ( ( ( rule__AndFeature__Group__0 ) ) )
            // InternalDsl.g:517:2: ( ( rule__AndFeature__Group__0 ) )
            {
            // InternalDsl.g:517:2: ( ( rule__AndFeature__Group__0 ) )
            // InternalDsl.g:518:3: ( rule__AndFeature__Group__0 )
            {
             before(grammarAccess.getAndFeatureAccess().getGroup()); 
            // InternalDsl.g:519:3: ( rule__AndFeature__Group__0 )
            // InternalDsl.g:519:4: rule__AndFeature__Group__0
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
    // InternalDsl.g:528:1: entryRuleNotFeatureExpression : ruleNotFeatureExpression EOF ;
    public final void entryRuleNotFeatureExpression() throws RecognitionException {
        try {
            // InternalDsl.g:529:1: ( ruleNotFeatureExpression EOF )
            // InternalDsl.g:530:1: ruleNotFeatureExpression EOF
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
    // InternalDsl.g:537:1: ruleNotFeatureExpression : ( ( rule__NotFeatureExpression__Alternatives ) ) ;
    public final void ruleNotFeatureExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:2: ( ( ( rule__NotFeatureExpression__Alternatives ) ) )
            // InternalDsl.g:542:2: ( ( rule__NotFeatureExpression__Alternatives ) )
            {
            // InternalDsl.g:542:2: ( ( rule__NotFeatureExpression__Alternatives ) )
            // InternalDsl.g:543:3: ( rule__NotFeatureExpression__Alternatives )
            {
             before(grammarAccess.getNotFeatureExpressionAccess().getAlternatives()); 
            // InternalDsl.g:544:3: ( rule__NotFeatureExpression__Alternatives )
            // InternalDsl.g:544:4: rule__NotFeatureExpression__Alternatives
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
    // InternalDsl.g:553:1: entryRulePrimaryFeature : rulePrimaryFeature EOF ;
    public final void entryRulePrimaryFeature() throws RecognitionException {
        try {
            // InternalDsl.g:554:1: ( rulePrimaryFeature EOF )
            // InternalDsl.g:555:1: rulePrimaryFeature EOF
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
    // InternalDsl.g:562:1: rulePrimaryFeature : ( ( rule__PrimaryFeature__Alternatives ) ) ;
    public final void rulePrimaryFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:566:2: ( ( ( rule__PrimaryFeature__Alternatives ) ) )
            // InternalDsl.g:567:2: ( ( rule__PrimaryFeature__Alternatives ) )
            {
            // InternalDsl.g:567:2: ( ( rule__PrimaryFeature__Alternatives ) )
            // InternalDsl.g:568:3: ( rule__PrimaryFeature__Alternatives )
            {
             before(grammarAccess.getPrimaryFeatureAccess().getAlternatives()); 
            // InternalDsl.g:569:3: ( rule__PrimaryFeature__Alternatives )
            // InternalDsl.g:569:4: rule__PrimaryFeature__Alternatives
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
    // InternalDsl.g:578:1: entryRuleConstraintExpression : ruleConstraintExpression EOF ;
    public final void entryRuleConstraintExpression() throws RecognitionException {
        try {
            // InternalDsl.g:579:1: ( ruleConstraintExpression EOF )
            // InternalDsl.g:580:1: ruleConstraintExpression EOF
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
    // InternalDsl.g:587:1: ruleConstraintExpression : ( ruleImplicationConstraint ) ;
    public final void ruleConstraintExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:591:2: ( ( ruleImplicationConstraint ) )
            // InternalDsl.g:592:2: ( ruleImplicationConstraint )
            {
            // InternalDsl.g:592:2: ( ruleImplicationConstraint )
            // InternalDsl.g:593:3: ruleImplicationConstraint
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
    // InternalDsl.g:603:1: entryRuleImplicationConstraint : ruleImplicationConstraint EOF ;
    public final void entryRuleImplicationConstraint() throws RecognitionException {
        try {
            // InternalDsl.g:604:1: ( ruleImplicationConstraint EOF )
            // InternalDsl.g:605:1: ruleImplicationConstraint EOF
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
    // InternalDsl.g:612:1: ruleImplicationConstraint : ( ( rule__ImplicationConstraint__Group__0 ) ) ;
    public final void ruleImplicationConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:616:2: ( ( ( rule__ImplicationConstraint__Group__0 ) ) )
            // InternalDsl.g:617:2: ( ( rule__ImplicationConstraint__Group__0 ) )
            {
            // InternalDsl.g:617:2: ( ( rule__ImplicationConstraint__Group__0 ) )
            // InternalDsl.g:618:3: ( rule__ImplicationConstraint__Group__0 )
            {
             before(grammarAccess.getImplicationConstraintAccess().getGroup()); 
            // InternalDsl.g:619:3: ( rule__ImplicationConstraint__Group__0 )
            // InternalDsl.g:619:4: rule__ImplicationConstraint__Group__0
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
    // InternalDsl.g:628:1: entryRuleOrConstraint : ruleOrConstraint EOF ;
    public final void entryRuleOrConstraint() throws RecognitionException {
        try {
            // InternalDsl.g:629:1: ( ruleOrConstraint EOF )
            // InternalDsl.g:630:1: ruleOrConstraint EOF
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
    // InternalDsl.g:637:1: ruleOrConstraint : ( ( rule__OrConstraint__Group__0 ) ) ;
    public final void ruleOrConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:641:2: ( ( ( rule__OrConstraint__Group__0 ) ) )
            // InternalDsl.g:642:2: ( ( rule__OrConstraint__Group__0 ) )
            {
            // InternalDsl.g:642:2: ( ( rule__OrConstraint__Group__0 ) )
            // InternalDsl.g:643:3: ( rule__OrConstraint__Group__0 )
            {
             before(grammarAccess.getOrConstraintAccess().getGroup()); 
            // InternalDsl.g:644:3: ( rule__OrConstraint__Group__0 )
            // InternalDsl.g:644:4: rule__OrConstraint__Group__0
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
    // InternalDsl.g:653:1: entryRuleAndConstraint : ruleAndConstraint EOF ;
    public final void entryRuleAndConstraint() throws RecognitionException {
        try {
            // InternalDsl.g:654:1: ( ruleAndConstraint EOF )
            // InternalDsl.g:655:1: ruleAndConstraint EOF
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
    // InternalDsl.g:662:1: ruleAndConstraint : ( ( rule__AndConstraint__Group__0 ) ) ;
    public final void ruleAndConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:666:2: ( ( ( rule__AndConstraint__Group__0 ) ) )
            // InternalDsl.g:667:2: ( ( rule__AndConstraint__Group__0 ) )
            {
            // InternalDsl.g:667:2: ( ( rule__AndConstraint__Group__0 ) )
            // InternalDsl.g:668:3: ( rule__AndConstraint__Group__0 )
            {
             before(grammarAccess.getAndConstraintAccess().getGroup()); 
            // InternalDsl.g:669:3: ( rule__AndConstraint__Group__0 )
            // InternalDsl.g:669:4: rule__AndConstraint__Group__0
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
    // InternalDsl.g:678:1: entryRuleNotConstraintExpression : ruleNotConstraintExpression EOF ;
    public final void entryRuleNotConstraintExpression() throws RecognitionException {
        try {
            // InternalDsl.g:679:1: ( ruleNotConstraintExpression EOF )
            // InternalDsl.g:680:1: ruleNotConstraintExpression EOF
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
    // InternalDsl.g:687:1: ruleNotConstraintExpression : ( ( rule__NotConstraintExpression__Alternatives ) ) ;
    public final void ruleNotConstraintExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:691:2: ( ( ( rule__NotConstraintExpression__Alternatives ) ) )
            // InternalDsl.g:692:2: ( ( rule__NotConstraintExpression__Alternatives ) )
            {
            // InternalDsl.g:692:2: ( ( rule__NotConstraintExpression__Alternatives ) )
            // InternalDsl.g:693:3: ( rule__NotConstraintExpression__Alternatives )
            {
             before(grammarAccess.getNotConstraintExpressionAccess().getAlternatives()); 
            // InternalDsl.g:694:3: ( rule__NotConstraintExpression__Alternatives )
            // InternalDsl.g:694:4: rule__NotConstraintExpression__Alternatives
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
    // InternalDsl.g:703:1: entryRulePrimaryConstraint : rulePrimaryConstraint EOF ;
    public final void entryRulePrimaryConstraint() throws RecognitionException {
        try {
            // InternalDsl.g:704:1: ( rulePrimaryConstraint EOF )
            // InternalDsl.g:705:1: rulePrimaryConstraint EOF
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
    // InternalDsl.g:712:1: rulePrimaryConstraint : ( ( rule__PrimaryConstraint__Alternatives ) ) ;
    public final void rulePrimaryConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:716:2: ( ( ( rule__PrimaryConstraint__Alternatives ) ) )
            // InternalDsl.g:717:2: ( ( rule__PrimaryConstraint__Alternatives ) )
            {
            // InternalDsl.g:717:2: ( ( rule__PrimaryConstraint__Alternatives ) )
            // InternalDsl.g:718:3: ( rule__PrimaryConstraint__Alternatives )
            {
             before(grammarAccess.getPrimaryConstraintAccess().getAlternatives()); 
            // InternalDsl.g:719:3: ( rule__PrimaryConstraint__Alternatives )
            // InternalDsl.g:719:4: rule__PrimaryConstraint__Alternatives
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
    // InternalDsl.g:728:1: ruleActionEnum : ( ( rule__ActionEnum__Alternatives ) ) ;
    public final void ruleActionEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:732:1: ( ( ( rule__ActionEnum__Alternatives ) ) )
            // InternalDsl.g:733:2: ( ( rule__ActionEnum__Alternatives ) )
            {
            // InternalDsl.g:733:2: ( ( rule__ActionEnum__Alternatives ) )
            // InternalDsl.g:734:3: ( rule__ActionEnum__Alternatives )
            {
             before(grammarAccess.getActionEnumAccess().getAlternatives()); 
            // InternalDsl.g:735:3: ( rule__ActionEnum__Alternatives )
            // InternalDsl.g:735:4: rule__ActionEnum__Alternatives
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
    // InternalDsl.g:744:1: ruleFeatureTypeEnum : ( ( rule__FeatureTypeEnum__Alternatives ) ) ;
    public final void ruleFeatureTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:748:1: ( ( ( rule__FeatureTypeEnum__Alternatives ) ) )
            // InternalDsl.g:749:2: ( ( rule__FeatureTypeEnum__Alternatives ) )
            {
            // InternalDsl.g:749:2: ( ( rule__FeatureTypeEnum__Alternatives ) )
            // InternalDsl.g:750:3: ( rule__FeatureTypeEnum__Alternatives )
            {
             before(grammarAccess.getFeatureTypeEnumAccess().getAlternatives()); 
            // InternalDsl.g:751:3: ( rule__FeatureTypeEnum__Alternatives )
            // InternalDsl.g:751:4: rule__FeatureTypeEnum__Alternatives
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
    // InternalDsl.g:760:1: ruleFeatureNameEnum : ( ( rule__FeatureNameEnum__Alternatives ) ) ;
    public final void ruleFeatureNameEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:764:1: ( ( ( rule__FeatureNameEnum__Alternatives ) ) )
            // InternalDsl.g:765:2: ( ( rule__FeatureNameEnum__Alternatives ) )
            {
            // InternalDsl.g:765:2: ( ( rule__FeatureNameEnum__Alternatives ) )
            // InternalDsl.g:766:3: ( rule__FeatureNameEnum__Alternatives )
            {
             before(grammarAccess.getFeatureNameEnumAccess().getAlternatives()); 
            // InternalDsl.g:767:3: ( rule__FeatureNameEnum__Alternatives )
            // InternalDsl.g:767:4: rule__FeatureNameEnum__Alternatives
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
    // InternalDsl.g:775:1: rule__ConstraintRule__Alternatives : ( ( ruleTrueConstraintRule ) | ( ruleFalseConstraintRule ) | ( ruleContainsTypeConstrainRule ) | ( ruleIsTargetConnectionTypeConstraintRule ) | ( ruleIsTargetTypeConstraintRule ) | ( ruleIsSourceTypeConstraintRule ) | ( ruleSourceEqualsTargetConstraintRule ) | ( ruleSourceEqualsTargetTypeConstraintRule ) | ( ruleInTypeConstraintRule ) );
    public final void rule__ConstraintRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:779:1: ( ( ruleTrueConstraintRule ) | ( ruleFalseConstraintRule ) | ( ruleContainsTypeConstrainRule ) | ( ruleIsTargetConnectionTypeConstraintRule ) | ( ruleIsTargetTypeConstraintRule ) | ( ruleIsSourceTypeConstraintRule ) | ( ruleSourceEqualsTargetConstraintRule ) | ( ruleSourceEqualsTargetTypeConstraintRule ) | ( ruleInTypeConstraintRule ) )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt2=1;
                }
                break;
            case 89:
                {
                alt2=2;
                }
                break;
            case 81:
                {
                alt2=3;
                }
                break;
            case 83:
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
            case 86:
                {
                alt2=7;
                }
                break;
            case 87:
                {
                alt2=8;
                }
                break;
            case 85:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDsl.g:780:2: ( ruleTrueConstraintRule )
                    {
                    // InternalDsl.g:780:2: ( ruleTrueConstraintRule )
                    // InternalDsl.g:781:3: ruleTrueConstraintRule
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
                    // InternalDsl.g:786:2: ( ruleFalseConstraintRule )
                    {
                    // InternalDsl.g:786:2: ( ruleFalseConstraintRule )
                    // InternalDsl.g:787:3: ruleFalseConstraintRule
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
                    // InternalDsl.g:792:2: ( ruleContainsTypeConstrainRule )
                    {
                    // InternalDsl.g:792:2: ( ruleContainsTypeConstrainRule )
                    // InternalDsl.g:793:3: ruleContainsTypeConstrainRule
                    {
                     before(grammarAccess.getConstraintRuleAccess().getContainsTypeConstrainRuleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleContainsTypeConstrainRule();

                    state._fsp--;

                     after(grammarAccess.getConstraintRuleAccess().getContainsTypeConstrainRuleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:798:2: ( ruleIsTargetConnectionTypeConstraintRule )
                    {
                    // InternalDsl.g:798:2: ( ruleIsTargetConnectionTypeConstraintRule )
                    // InternalDsl.g:799:3: ruleIsTargetConnectionTypeConstraintRule
                    {
                     before(grammarAccess.getConstraintRuleAccess().getIsTargetConnectionTypeConstraintRuleParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleIsTargetConnectionTypeConstraintRule();

                    state._fsp--;

                     after(grammarAccess.getConstraintRuleAccess().getIsTargetConnectionTypeConstraintRuleParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:804:2: ( ruleIsTargetTypeConstraintRule )
                    {
                    // InternalDsl.g:804:2: ( ruleIsTargetTypeConstraintRule )
                    // InternalDsl.g:805:3: ruleIsTargetTypeConstraintRule
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
                    // InternalDsl.g:810:2: ( ruleIsSourceTypeConstraintRule )
                    {
                    // InternalDsl.g:810:2: ( ruleIsSourceTypeConstraintRule )
                    // InternalDsl.g:811:3: ruleIsSourceTypeConstraintRule
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
                    // InternalDsl.g:816:2: ( ruleSourceEqualsTargetConstraintRule )
                    {
                    // InternalDsl.g:816:2: ( ruleSourceEqualsTargetConstraintRule )
                    // InternalDsl.g:817:3: ruleSourceEqualsTargetConstraintRule
                    {
                     before(grammarAccess.getConstraintRuleAccess().getSourceEqualsTargetConstraintRuleParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleSourceEqualsTargetConstraintRule();

                    state._fsp--;

                     after(grammarAccess.getConstraintRuleAccess().getSourceEqualsTargetConstraintRuleParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:822:2: ( ruleSourceEqualsTargetTypeConstraintRule )
                    {
                    // InternalDsl.g:822:2: ( ruleSourceEqualsTargetTypeConstraintRule )
                    // InternalDsl.g:823:3: ruleSourceEqualsTargetTypeConstraintRule
                    {
                     before(grammarAccess.getConstraintRuleAccess().getSourceEqualsTargetTypeConstraintRuleParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleSourceEqualsTargetTypeConstraintRule();

                    state._fsp--;

                     after(grammarAccess.getConstraintRuleAccess().getSourceEqualsTargetTypeConstraintRuleParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:828:2: ( ruleInTypeConstraintRule )
                    {
                    // InternalDsl.g:828:2: ( ruleInTypeConstraintRule )
                    // InternalDsl.g:829:3: ruleInTypeConstraintRule
                    {
                     before(grammarAccess.getConstraintRuleAccess().getInTypeConstraintRuleParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleInTypeConstraintRule();

                    state._fsp--;

                     after(grammarAccess.getConstraintRuleAccess().getInTypeConstraintRuleParserRuleCall_8()); 

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
    // InternalDsl.g:838:1: rule__FeatureRule__Alternatives : ( ( ruleIsFeature ) | ( ruleTrueFeatureRule ) | ( ruleFalseFeatureRule ) );
    public final void rule__FeatureRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:842:1: ( ( ruleIsFeature ) | ( ruleTrueFeatureRule ) | ( ruleFalseFeatureRule ) )
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
            case 88:
                {
                alt3=2;
                }
                break;
            case 89:
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
                    // InternalDsl.g:843:2: ( ruleIsFeature )
                    {
                    // InternalDsl.g:843:2: ( ruleIsFeature )
                    // InternalDsl.g:844:3: ruleIsFeature
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
                    // InternalDsl.g:849:2: ( ruleTrueFeatureRule )
                    {
                    // InternalDsl.g:849:2: ( ruleTrueFeatureRule )
                    // InternalDsl.g:850:3: ruleTrueFeatureRule
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
                    // InternalDsl.g:855:2: ( ruleFalseFeatureRule )
                    {
                    // InternalDsl.g:855:2: ( ruleFalseFeatureRule )
                    // InternalDsl.g:856:3: ruleFalseFeatureRule
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
    // InternalDsl.g:865:1: rule__NotFeatureExpression__Alternatives : ( ( rulePrimaryFeature ) | ( ( rule__NotFeatureExpression__Group_1__0 ) ) );
    public final void rule__NotFeatureExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:869:1: ( ( rulePrimaryFeature ) | ( ( rule__NotFeatureExpression__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=40 && LA4_0<=77)||(LA4_0>=88 && LA4_0<=89)) ) {
                alt4=1;
            }
            else if ( (LA4_0==92) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:870:2: ( rulePrimaryFeature )
                    {
                    // InternalDsl.g:870:2: ( rulePrimaryFeature )
                    // InternalDsl.g:871:3: rulePrimaryFeature
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
                    // InternalDsl.g:876:2: ( ( rule__NotFeatureExpression__Group_1__0 ) )
                    {
                    // InternalDsl.g:876:2: ( ( rule__NotFeatureExpression__Group_1__0 ) )
                    // InternalDsl.g:877:3: ( rule__NotFeatureExpression__Group_1__0 )
                    {
                     before(grammarAccess.getNotFeatureExpressionAccess().getGroup_1()); 
                    // InternalDsl.g:878:3: ( rule__NotFeatureExpression__Group_1__0 )
                    // InternalDsl.g:878:4: rule__NotFeatureExpression__Group_1__0
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
    // InternalDsl.g:886:1: rule__PrimaryFeature__Alternatives : ( ( ruleFeatureRule ) | ( ( rule__PrimaryFeature__Group_1__0 ) ) );
    public final void rule__PrimaryFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:890:1: ( ( ruleFeatureRule ) | ( ( rule__PrimaryFeature__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=40 && LA5_0<=76)||(LA5_0>=88 && LA5_0<=89)) ) {
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
                    // InternalDsl.g:891:2: ( ruleFeatureRule )
                    {
                    // InternalDsl.g:891:2: ( ruleFeatureRule )
                    // InternalDsl.g:892:3: ruleFeatureRule
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
                    // InternalDsl.g:897:2: ( ( rule__PrimaryFeature__Group_1__0 ) )
                    {
                    // InternalDsl.g:897:2: ( ( rule__PrimaryFeature__Group_1__0 ) )
                    // InternalDsl.g:898:3: ( rule__PrimaryFeature__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryFeatureAccess().getGroup_1()); 
                    // InternalDsl.g:899:3: ( rule__PrimaryFeature__Group_1__0 )
                    // InternalDsl.g:899:4: rule__PrimaryFeature__Group_1__0
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
    // InternalDsl.g:907:1: rule__NotConstraintExpression__Alternatives : ( ( rulePrimaryConstraint ) | ( ( rule__NotConstraintExpression__Group_1__0 ) ) );
    public final void rule__NotConstraintExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:911:1: ( ( rulePrimaryConstraint ) | ( ( rule__NotConstraintExpression__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==77||(LA6_0>=81 && LA6_0<=89)) ) {
                alt6=1;
            }
            else if ( (LA6_0==92) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:912:2: ( rulePrimaryConstraint )
                    {
                    // InternalDsl.g:912:2: ( rulePrimaryConstraint )
                    // InternalDsl.g:913:3: rulePrimaryConstraint
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
                    // InternalDsl.g:918:2: ( ( rule__NotConstraintExpression__Group_1__0 ) )
                    {
                    // InternalDsl.g:918:2: ( ( rule__NotConstraintExpression__Group_1__0 ) )
                    // InternalDsl.g:919:3: ( rule__NotConstraintExpression__Group_1__0 )
                    {
                     before(grammarAccess.getNotConstraintExpressionAccess().getGroup_1()); 
                    // InternalDsl.g:920:3: ( rule__NotConstraintExpression__Group_1__0 )
                    // InternalDsl.g:920:4: rule__NotConstraintExpression__Group_1__0
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
    // InternalDsl.g:928:1: rule__PrimaryConstraint__Alternatives : ( ( ruleConstraintRule ) | ( ( rule__PrimaryConstraint__Group_1__0 ) ) );
    public final void rule__PrimaryConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:932:1: ( ( ruleConstraintRule ) | ( ( rule__PrimaryConstraint__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=81 && LA7_0<=89)) ) {
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
                    // InternalDsl.g:933:2: ( ruleConstraintRule )
                    {
                    // InternalDsl.g:933:2: ( ruleConstraintRule )
                    // InternalDsl.g:934:3: ruleConstraintRule
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
                    // InternalDsl.g:939:2: ( ( rule__PrimaryConstraint__Group_1__0 ) )
                    {
                    // InternalDsl.g:939:2: ( ( rule__PrimaryConstraint__Group_1__0 ) )
                    // InternalDsl.g:940:3: ( rule__PrimaryConstraint__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryConstraintAccess().getGroup_1()); 
                    // InternalDsl.g:941:3: ( rule__PrimaryConstraint__Group_1__0 )
                    // InternalDsl.g:941:4: rule__PrimaryConstraint__Group_1__0
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
    // InternalDsl.g:949:1: rule__ActionEnum__Alternatives : ( ( ( 'Add' ) ) | ( ( 'Reconnect' ) ) | ( ( 'Create' ) ) | ( ( 'Start' ) ) | ( ( 'Execute' ) ) | ( ( 'Direct_Edit' ) ) | ( ( 'Add_Property' ) ) | ( ( 'Create_Attribute' ) ) | ( ( 'Create_Operation' ) ) | ( ( 'Create_Property' ) ) );
    public final void rule__ActionEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:953:1: ( ( ( 'Add' ) ) | ( ( 'Reconnect' ) ) | ( ( 'Create' ) ) | ( ( 'Start' ) ) | ( ( 'Execute' ) ) | ( ( 'Direct_Edit' ) ) | ( ( 'Add_Property' ) ) | ( ( 'Create_Attribute' ) ) | ( ( 'Create_Operation' ) ) | ( ( 'Create_Property' ) ) )
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
                    // InternalDsl.g:954:2: ( ( 'Add' ) )
                    {
                    // InternalDsl.g:954:2: ( ( 'Add' ) )
                    // InternalDsl.g:955:3: ( 'Add' )
                    {
                     before(grammarAccess.getActionEnumAccess().getAddEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:956:3: ( 'Add' )
                    // InternalDsl.g:956:4: 'Add'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:960:2: ( ( 'Reconnect' ) )
                    {
                    // InternalDsl.g:960:2: ( ( 'Reconnect' ) )
                    // InternalDsl.g:961:3: ( 'Reconnect' )
                    {
                     before(grammarAccess.getActionEnumAccess().getReconnectEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:962:3: ( 'Reconnect' )
                    // InternalDsl.g:962:4: 'Reconnect'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getReconnectEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:966:2: ( ( 'Create' ) )
                    {
                    // InternalDsl.g:966:2: ( ( 'Create' ) )
                    // InternalDsl.g:967:3: ( 'Create' )
                    {
                     before(grammarAccess.getActionEnumAccess().getCreateEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:968:3: ( 'Create' )
                    // InternalDsl.g:968:4: 'Create'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getCreateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:972:2: ( ( 'Start' ) )
                    {
                    // InternalDsl.g:972:2: ( ( 'Start' ) )
                    // InternalDsl.g:973:3: ( 'Start' )
                    {
                     before(grammarAccess.getActionEnumAccess().getStartEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:974:3: ( 'Start' )
                    // InternalDsl.g:974:4: 'Start'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getStartEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:978:2: ( ( 'Execute' ) )
                    {
                    // InternalDsl.g:978:2: ( ( 'Execute' ) )
                    // InternalDsl.g:979:3: ( 'Execute' )
                    {
                     before(grammarAccess.getActionEnumAccess().getExecuteEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:980:3: ( 'Execute' )
                    // InternalDsl.g:980:4: 'Execute'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getExecuteEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:984:2: ( ( 'Direct_Edit' ) )
                    {
                    // InternalDsl.g:984:2: ( ( 'Direct_Edit' ) )
                    // InternalDsl.g:985:3: ( 'Direct_Edit' )
                    {
                     before(grammarAccess.getActionEnumAccess().getDirect_EditEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:986:3: ( 'Direct_Edit' )
                    // InternalDsl.g:986:4: 'Direct_Edit'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getDirect_EditEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:990:2: ( ( 'Add_Property' ) )
                    {
                    // InternalDsl.g:990:2: ( ( 'Add_Property' ) )
                    // InternalDsl.g:991:3: ( 'Add_Property' )
                    {
                     before(grammarAccess.getActionEnumAccess().getAdd_PropertyEnumLiteralDeclaration_6()); 
                    // InternalDsl.g:992:3: ( 'Add_Property' )
                    // InternalDsl.g:992:4: 'Add_Property'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getAdd_PropertyEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:996:2: ( ( 'Create_Attribute' ) )
                    {
                    // InternalDsl.g:996:2: ( ( 'Create_Attribute' ) )
                    // InternalDsl.g:997:3: ( 'Create_Attribute' )
                    {
                     before(grammarAccess.getActionEnumAccess().getCreate_AttributeEnumLiteralDeclaration_7()); 
                    // InternalDsl.g:998:3: ( 'Create_Attribute' )
                    // InternalDsl.g:998:4: 'Create_Attribute'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getCreate_AttributeEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:1002:2: ( ( 'Create_Operation' ) )
                    {
                    // InternalDsl.g:1002:2: ( ( 'Create_Operation' ) )
                    // InternalDsl.g:1003:3: ( 'Create_Operation' )
                    {
                     before(grammarAccess.getActionEnumAccess().getCreate_OperationEnumLiteralDeclaration_8()); 
                    // InternalDsl.g:1004:3: ( 'Create_Operation' )
                    // InternalDsl.g:1004:4: 'Create_Operation'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionEnumAccess().getCreate_OperationEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDsl.g:1008:2: ( ( 'Create_Property' ) )
                    {
                    // InternalDsl.g:1008:2: ( ( 'Create_Property' ) )
                    // InternalDsl.g:1009:3: ( 'Create_Property' )
                    {
                     before(grammarAccess.getActionEnumAccess().getCreate_PropertyEnumLiteralDeclaration_9()); 
                    // InternalDsl.g:1010:3: ( 'Create_Property' )
                    // InternalDsl.g:1010:4: 'Create_Property'
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
    // InternalDsl.g:1018:1: rule__FeatureTypeEnum__Alternatives : ( ( ( 'Acyclic' ) ) | ( ( 'CompartmentType' ) ) | ( ( 'Cyclic' ) ) | ( ( 'Total' ) ) | ( ( 'DataType' ) ) | ( ( 'Fulfillment' ) ) | ( ( 'Inheritance' ) ) | ( ( 'Group' ) ) | ( ( 'Reflexive' ) ) | ( ( 'Relationship' ) ) | ( ( 'RelationshipExclusion' ) ) | ( ( 'RelationshipImplication' ) ) | ( ( 'RoleType' ) ) | ( ( 'RoleEquivalence' ) ) | ( ( 'RoleGroup' ) ) | ( ( 'RoleImplication' ) ) | ( ( 'RoleProhibition' ) ) | ( ( 'Irreflexive' ) ) | ( ( 'NaturalType' ) ) );
    public final void rule__FeatureTypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1022:1: ( ( ( 'Acyclic' ) ) | ( ( 'CompartmentType' ) ) | ( ( 'Cyclic' ) ) | ( ( 'Total' ) ) | ( ( 'DataType' ) ) | ( ( 'Fulfillment' ) ) | ( ( 'Inheritance' ) ) | ( ( 'Group' ) ) | ( ( 'Reflexive' ) ) | ( ( 'Relationship' ) ) | ( ( 'RelationshipExclusion' ) ) | ( ( 'RelationshipImplication' ) ) | ( ( 'RoleType' ) ) | ( ( 'RoleEquivalence' ) ) | ( ( 'RoleGroup' ) ) | ( ( 'RoleImplication' ) ) | ( ( 'RoleProhibition' ) ) | ( ( 'Irreflexive' ) ) | ( ( 'NaturalType' ) ) )
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
                    // InternalDsl.g:1023:2: ( ( 'Acyclic' ) )
                    {
                    // InternalDsl.g:1023:2: ( ( 'Acyclic' ) )
                    // InternalDsl.g:1024:3: ( 'Acyclic' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getAcyclicEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:1025:3: ( 'Acyclic' )
                    // InternalDsl.g:1025:4: 'Acyclic'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getAcyclicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1029:2: ( ( 'CompartmentType' ) )
                    {
                    // InternalDsl.g:1029:2: ( ( 'CompartmentType' ) )
                    // InternalDsl.g:1030:3: ( 'CompartmentType' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getCompartmentTypeEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:1031:3: ( 'CompartmentType' )
                    // InternalDsl.g:1031:4: 'CompartmentType'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getCompartmentTypeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1035:2: ( ( 'Cyclic' ) )
                    {
                    // InternalDsl.g:1035:2: ( ( 'Cyclic' ) )
                    // InternalDsl.g:1036:3: ( 'Cyclic' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getCyclicEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:1037:3: ( 'Cyclic' )
                    // InternalDsl.g:1037:4: 'Cyclic'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getCyclicEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1041:2: ( ( 'Total' ) )
                    {
                    // InternalDsl.g:1041:2: ( ( 'Total' ) )
                    // InternalDsl.g:1042:3: ( 'Total' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getTotalEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:1043:3: ( 'Total' )
                    // InternalDsl.g:1043:4: 'Total'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getTotalEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1047:2: ( ( 'DataType' ) )
                    {
                    // InternalDsl.g:1047:2: ( ( 'DataType' ) )
                    // InternalDsl.g:1048:3: ( 'DataType' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getDataTypeEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:1049:3: ( 'DataType' )
                    // InternalDsl.g:1049:4: 'DataType'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getDataTypeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:1053:2: ( ( 'Fulfillment' ) )
                    {
                    // InternalDsl.g:1053:2: ( ( 'Fulfillment' ) )
                    // InternalDsl.g:1054:3: ( 'Fulfillment' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getFulfillmentEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:1055:3: ( 'Fulfillment' )
                    // InternalDsl.g:1055:4: 'Fulfillment'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getFulfillmentEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:1059:2: ( ( 'Inheritance' ) )
                    {
                    // InternalDsl.g:1059:2: ( ( 'Inheritance' ) )
                    // InternalDsl.g:1060:3: ( 'Inheritance' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getInheritanceEnumLiteralDeclaration_6()); 
                    // InternalDsl.g:1061:3: ( 'Inheritance' )
                    // InternalDsl.g:1061:4: 'Inheritance'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getInheritanceEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:1065:2: ( ( 'Group' ) )
                    {
                    // InternalDsl.g:1065:2: ( ( 'Group' ) )
                    // InternalDsl.g:1066:3: ( 'Group' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getGroupEnumLiteralDeclaration_7()); 
                    // InternalDsl.g:1067:3: ( 'Group' )
                    // InternalDsl.g:1067:4: 'Group'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getGroupEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:1071:2: ( ( 'Reflexive' ) )
                    {
                    // InternalDsl.g:1071:2: ( ( 'Reflexive' ) )
                    // InternalDsl.g:1072:3: ( 'Reflexive' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getReflexiveEnumLiteralDeclaration_8()); 
                    // InternalDsl.g:1073:3: ( 'Reflexive' )
                    // InternalDsl.g:1073:4: 'Reflexive'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getReflexiveEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDsl.g:1077:2: ( ( 'Relationship' ) )
                    {
                    // InternalDsl.g:1077:2: ( ( 'Relationship' ) )
                    // InternalDsl.g:1078:3: ( 'Relationship' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getRelationshipEnumLiteralDeclaration_9()); 
                    // InternalDsl.g:1079:3: ( 'Relationship' )
                    // InternalDsl.g:1079:4: 'Relationship'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getRelationshipEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDsl.g:1083:2: ( ( 'RelationshipExclusion' ) )
                    {
                    // InternalDsl.g:1083:2: ( ( 'RelationshipExclusion' ) )
                    // InternalDsl.g:1084:3: ( 'RelationshipExclusion' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getRelationshipExclusionEnumLiteralDeclaration_10()); 
                    // InternalDsl.g:1085:3: ( 'RelationshipExclusion' )
                    // InternalDsl.g:1085:4: 'RelationshipExclusion'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getRelationshipExclusionEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalDsl.g:1089:2: ( ( 'RelationshipImplication' ) )
                    {
                    // InternalDsl.g:1089:2: ( ( 'RelationshipImplication' ) )
                    // InternalDsl.g:1090:3: ( 'RelationshipImplication' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getRelationshipImplicationEnumLiteralDeclaration_11()); 
                    // InternalDsl.g:1091:3: ( 'RelationshipImplication' )
                    // InternalDsl.g:1091:4: 'RelationshipImplication'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getRelationshipImplicationEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalDsl.g:1095:2: ( ( 'RoleType' ) )
                    {
                    // InternalDsl.g:1095:2: ( ( 'RoleType' ) )
                    // InternalDsl.g:1096:3: ( 'RoleType' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getRoleTypeEnumLiteralDeclaration_12()); 
                    // InternalDsl.g:1097:3: ( 'RoleType' )
                    // InternalDsl.g:1097:4: 'RoleType'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getRoleTypeEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalDsl.g:1101:2: ( ( 'RoleEquivalence' ) )
                    {
                    // InternalDsl.g:1101:2: ( ( 'RoleEquivalence' ) )
                    // InternalDsl.g:1102:3: ( 'RoleEquivalence' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getRoleEquivalenceEnumLiteralDeclaration_13()); 
                    // InternalDsl.g:1103:3: ( 'RoleEquivalence' )
                    // InternalDsl.g:1103:4: 'RoleEquivalence'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getRoleEquivalenceEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalDsl.g:1107:2: ( ( 'RoleGroup' ) )
                    {
                    // InternalDsl.g:1107:2: ( ( 'RoleGroup' ) )
                    // InternalDsl.g:1108:3: ( 'RoleGroup' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getRoleGroupEnumLiteralDeclaration_14()); 
                    // InternalDsl.g:1109:3: ( 'RoleGroup' )
                    // InternalDsl.g:1109:4: 'RoleGroup'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getRoleGroupEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalDsl.g:1113:2: ( ( 'RoleImplication' ) )
                    {
                    // InternalDsl.g:1113:2: ( ( 'RoleImplication' ) )
                    // InternalDsl.g:1114:3: ( 'RoleImplication' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getRoleImplicationEnumLiteralDeclaration_15()); 
                    // InternalDsl.g:1115:3: ( 'RoleImplication' )
                    // InternalDsl.g:1115:4: 'RoleImplication'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getRoleImplicationEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalDsl.g:1119:2: ( ( 'RoleProhibition' ) )
                    {
                    // InternalDsl.g:1119:2: ( ( 'RoleProhibition' ) )
                    // InternalDsl.g:1120:3: ( 'RoleProhibition' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getRoleProhibitionEnumLiteralDeclaration_16()); 
                    // InternalDsl.g:1121:3: ( 'RoleProhibition' )
                    // InternalDsl.g:1121:4: 'RoleProhibition'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getRoleProhibitionEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalDsl.g:1125:2: ( ( 'Irreflexive' ) )
                    {
                    // InternalDsl.g:1125:2: ( ( 'Irreflexive' ) )
                    // InternalDsl.g:1126:3: ( 'Irreflexive' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getIrreflexiveEnumLiteralDeclaration_17()); 
                    // InternalDsl.g:1127:3: ( 'Irreflexive' )
                    // InternalDsl.g:1127:4: 'Irreflexive'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureTypeEnumAccess().getIrreflexiveEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalDsl.g:1131:2: ( ( 'NaturalType' ) )
                    {
                    // InternalDsl.g:1131:2: ( ( 'NaturalType' ) )
                    // InternalDsl.g:1132:3: ( 'NaturalType' )
                    {
                     before(grammarAccess.getFeatureTypeEnumAccess().getNaturalTypeEnumLiteralDeclaration_18()); 
                    // InternalDsl.g:1133:3: ( 'NaturalType' )
                    // InternalDsl.g:1133:4: 'NaturalType'
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
    // InternalDsl.g:1141:1: rule__FeatureNameEnum__Alternatives : ( ( ( 'Compartment_Behavior' ) ) | ( ( 'Compartment_Inheritance' ) ) | ( ( 'Compartment_Properties' ) ) | ( ( 'Compartment_Structure' ) ) | ( ( 'Compartment_Types' ) ) | ( ( 'Contains_Compartments' ) ) | ( ( 'Compartments' ) ) | ( ( 'Data_Type_Inheritance' ) ) | ( ( 'Data_Types' ) ) | ( ( 'Dates' ) ) | ( ( 'Dependent' ) ) | ( ( 'Group_Constraints' ) ) | ( ( 'Inter_Relationship_Constraints' ) ) | ( ( 'Intra_Relationship_Constraints' ) ) | ( ( 'Naturals' ) ) | ( ( 'Occurrence_Constraints' ) ) | ( ( 'On_Compartments' ) ) | ( ( 'On_Relationships' ) ) | ( ( 'Parthood_Constraints' ) ) | ( ( 'Participants' ) ) | ( ( 'Playable' ) ) | ( ( 'Playable_by_Defining_Compartment' ) ) | ( ( 'Players' ) ) | ( ( 'Relationship_Cardinality' ) ) | ( ( 'Relationship_Constraints' ) ) | ( ( 'Relationships' ) ) | ( ( 'RML_Feature_Model' ) ) | ( ( 'Role_Behavior' ) ) | ( ( 'Role_Constraints' ) ) | ( ( 'Role_Equivalence' ) ) | ( ( 'Role_Implication' ) ) | ( ( 'Role_Inheritance' ) ) | ( ( 'Role_Prohibition' ) ) | ( ( 'Role_Properties' ) ) | ( ( 'Role_Structure' ) ) | ( ( 'Role_Types' ) ) | ( ( 'Roles' ) ) );
    public final void rule__FeatureNameEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1145:1: ( ( ( 'Compartment_Behavior' ) ) | ( ( 'Compartment_Inheritance' ) ) | ( ( 'Compartment_Properties' ) ) | ( ( 'Compartment_Structure' ) ) | ( ( 'Compartment_Types' ) ) | ( ( 'Contains_Compartments' ) ) | ( ( 'Compartments' ) ) | ( ( 'Data_Type_Inheritance' ) ) | ( ( 'Data_Types' ) ) | ( ( 'Dates' ) ) | ( ( 'Dependent' ) ) | ( ( 'Group_Constraints' ) ) | ( ( 'Inter_Relationship_Constraints' ) ) | ( ( 'Intra_Relationship_Constraints' ) ) | ( ( 'Naturals' ) ) | ( ( 'Occurrence_Constraints' ) ) | ( ( 'On_Compartments' ) ) | ( ( 'On_Relationships' ) ) | ( ( 'Parthood_Constraints' ) ) | ( ( 'Participants' ) ) | ( ( 'Playable' ) ) | ( ( 'Playable_by_Defining_Compartment' ) ) | ( ( 'Players' ) ) | ( ( 'Relationship_Cardinality' ) ) | ( ( 'Relationship_Constraints' ) ) | ( ( 'Relationships' ) ) | ( ( 'RML_Feature_Model' ) ) | ( ( 'Role_Behavior' ) ) | ( ( 'Role_Constraints' ) ) | ( ( 'Role_Equivalence' ) ) | ( ( 'Role_Implication' ) ) | ( ( 'Role_Inheritance' ) ) | ( ( 'Role_Prohibition' ) ) | ( ( 'Role_Properties' ) ) | ( ( 'Role_Structure' ) ) | ( ( 'Role_Types' ) ) | ( ( 'Roles' ) ) )
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
                    // InternalDsl.g:1146:2: ( ( 'Compartment_Behavior' ) )
                    {
                    // InternalDsl.g:1146:2: ( ( 'Compartment_Behavior' ) )
                    // InternalDsl.g:1147:3: ( 'Compartment_Behavior' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getCompartment_BehaviorEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:1148:3: ( 'Compartment_Behavior' )
                    // InternalDsl.g:1148:4: 'Compartment_Behavior'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getCompartment_BehaviorEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1152:2: ( ( 'Compartment_Inheritance' ) )
                    {
                    // InternalDsl.g:1152:2: ( ( 'Compartment_Inheritance' ) )
                    // InternalDsl.g:1153:3: ( 'Compartment_Inheritance' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getCompartment_InheritanceEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:1154:3: ( 'Compartment_Inheritance' )
                    // InternalDsl.g:1154:4: 'Compartment_Inheritance'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getCompartment_InheritanceEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1158:2: ( ( 'Compartment_Properties' ) )
                    {
                    // InternalDsl.g:1158:2: ( ( 'Compartment_Properties' ) )
                    // InternalDsl.g:1159:3: ( 'Compartment_Properties' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getCompartment_PropertiesEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:1160:3: ( 'Compartment_Properties' )
                    // InternalDsl.g:1160:4: 'Compartment_Properties'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getCompartment_PropertiesEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1164:2: ( ( 'Compartment_Structure' ) )
                    {
                    // InternalDsl.g:1164:2: ( ( 'Compartment_Structure' ) )
                    // InternalDsl.g:1165:3: ( 'Compartment_Structure' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getCompartment_StructureEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:1166:3: ( 'Compartment_Structure' )
                    // InternalDsl.g:1166:4: 'Compartment_Structure'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getCompartment_StructureEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1170:2: ( ( 'Compartment_Types' ) )
                    {
                    // InternalDsl.g:1170:2: ( ( 'Compartment_Types' ) )
                    // InternalDsl.g:1171:3: ( 'Compartment_Types' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getCompartment_TypesEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:1172:3: ( 'Compartment_Types' )
                    // InternalDsl.g:1172:4: 'Compartment_Types'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getCompartment_TypesEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:1176:2: ( ( 'Contains_Compartments' ) )
                    {
                    // InternalDsl.g:1176:2: ( ( 'Contains_Compartments' ) )
                    // InternalDsl.g:1177:3: ( 'Contains_Compartments' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getContains_CompartmentsEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:1178:3: ( 'Contains_Compartments' )
                    // InternalDsl.g:1178:4: 'Contains_Compartments'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getContains_CompartmentsEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:1182:2: ( ( 'Compartments' ) )
                    {
                    // InternalDsl.g:1182:2: ( ( 'Compartments' ) )
                    // InternalDsl.g:1183:3: ( 'Compartments' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getCompartmentsEnumLiteralDeclaration_6()); 
                    // InternalDsl.g:1184:3: ( 'Compartments' )
                    // InternalDsl.g:1184:4: 'Compartments'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getCompartmentsEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:1188:2: ( ( 'Data_Type_Inheritance' ) )
                    {
                    // InternalDsl.g:1188:2: ( ( 'Data_Type_Inheritance' ) )
                    // InternalDsl.g:1189:3: ( 'Data_Type_Inheritance' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getData_Type_InheritanceEnumLiteralDeclaration_7()); 
                    // InternalDsl.g:1190:3: ( 'Data_Type_Inheritance' )
                    // InternalDsl.g:1190:4: 'Data_Type_Inheritance'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getData_Type_InheritanceEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:1194:2: ( ( 'Data_Types' ) )
                    {
                    // InternalDsl.g:1194:2: ( ( 'Data_Types' ) )
                    // InternalDsl.g:1195:3: ( 'Data_Types' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getData_TypesEnumLiteralDeclaration_8()); 
                    // InternalDsl.g:1196:3: ( 'Data_Types' )
                    // InternalDsl.g:1196:4: 'Data_Types'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getData_TypesEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDsl.g:1200:2: ( ( 'Dates' ) )
                    {
                    // InternalDsl.g:1200:2: ( ( 'Dates' ) )
                    // InternalDsl.g:1201:3: ( 'Dates' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getDatesEnumLiteralDeclaration_9()); 
                    // InternalDsl.g:1202:3: ( 'Dates' )
                    // InternalDsl.g:1202:4: 'Dates'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getDatesEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDsl.g:1206:2: ( ( 'Dependent' ) )
                    {
                    // InternalDsl.g:1206:2: ( ( 'Dependent' ) )
                    // InternalDsl.g:1207:3: ( 'Dependent' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getDependentEnumLiteralDeclaration_10()); 
                    // InternalDsl.g:1208:3: ( 'Dependent' )
                    // InternalDsl.g:1208:4: 'Dependent'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getDependentEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalDsl.g:1212:2: ( ( 'Group_Constraints' ) )
                    {
                    // InternalDsl.g:1212:2: ( ( 'Group_Constraints' ) )
                    // InternalDsl.g:1213:3: ( 'Group_Constraints' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getGroup_ConstraintsEnumLiteralDeclaration_11()); 
                    // InternalDsl.g:1214:3: ( 'Group_Constraints' )
                    // InternalDsl.g:1214:4: 'Group_Constraints'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getGroup_ConstraintsEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalDsl.g:1218:2: ( ( 'Inter_Relationship_Constraints' ) )
                    {
                    // InternalDsl.g:1218:2: ( ( 'Inter_Relationship_Constraints' ) )
                    // InternalDsl.g:1219:3: ( 'Inter_Relationship_Constraints' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getInter_Relationship_ConstraintsEnumLiteralDeclaration_12()); 
                    // InternalDsl.g:1220:3: ( 'Inter_Relationship_Constraints' )
                    // InternalDsl.g:1220:4: 'Inter_Relationship_Constraints'
                    {
                    match(input,52,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getInter_Relationship_ConstraintsEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalDsl.g:1224:2: ( ( 'Intra_Relationship_Constraints' ) )
                    {
                    // InternalDsl.g:1224:2: ( ( 'Intra_Relationship_Constraints' ) )
                    // InternalDsl.g:1225:3: ( 'Intra_Relationship_Constraints' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getIntra_Relationship_ConstraintsEnumLiteralDeclaration_13()); 
                    // InternalDsl.g:1226:3: ( 'Intra_Relationship_Constraints' )
                    // InternalDsl.g:1226:4: 'Intra_Relationship_Constraints'
                    {
                    match(input,53,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getIntra_Relationship_ConstraintsEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalDsl.g:1230:2: ( ( 'Naturals' ) )
                    {
                    // InternalDsl.g:1230:2: ( ( 'Naturals' ) )
                    // InternalDsl.g:1231:3: ( 'Naturals' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getNaturalsEnumLiteralDeclaration_14()); 
                    // InternalDsl.g:1232:3: ( 'Naturals' )
                    // InternalDsl.g:1232:4: 'Naturals'
                    {
                    match(input,54,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getNaturalsEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalDsl.g:1236:2: ( ( 'Occurrence_Constraints' ) )
                    {
                    // InternalDsl.g:1236:2: ( ( 'Occurrence_Constraints' ) )
                    // InternalDsl.g:1237:3: ( 'Occurrence_Constraints' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getOccurrence_ConstraintsEnumLiteralDeclaration_15()); 
                    // InternalDsl.g:1238:3: ( 'Occurrence_Constraints' )
                    // InternalDsl.g:1238:4: 'Occurrence_Constraints'
                    {
                    match(input,55,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getOccurrence_ConstraintsEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalDsl.g:1242:2: ( ( 'On_Compartments' ) )
                    {
                    // InternalDsl.g:1242:2: ( ( 'On_Compartments' ) )
                    // InternalDsl.g:1243:3: ( 'On_Compartments' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getOn_CompartmentsEnumLiteralDeclaration_16()); 
                    // InternalDsl.g:1244:3: ( 'On_Compartments' )
                    // InternalDsl.g:1244:4: 'On_Compartments'
                    {
                    match(input,56,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getOn_CompartmentsEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalDsl.g:1248:2: ( ( 'On_Relationships' ) )
                    {
                    // InternalDsl.g:1248:2: ( ( 'On_Relationships' ) )
                    // InternalDsl.g:1249:3: ( 'On_Relationships' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getOn_RelationshipsEnumLiteralDeclaration_17()); 
                    // InternalDsl.g:1250:3: ( 'On_Relationships' )
                    // InternalDsl.g:1250:4: 'On_Relationships'
                    {
                    match(input,57,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getOn_RelationshipsEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalDsl.g:1254:2: ( ( 'Parthood_Constraints' ) )
                    {
                    // InternalDsl.g:1254:2: ( ( 'Parthood_Constraints' ) )
                    // InternalDsl.g:1255:3: ( 'Parthood_Constraints' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getParthood_ConstraintsEnumLiteralDeclaration_18()); 
                    // InternalDsl.g:1256:3: ( 'Parthood_Constraints' )
                    // InternalDsl.g:1256:4: 'Parthood_Constraints'
                    {
                    match(input,58,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getParthood_ConstraintsEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalDsl.g:1260:2: ( ( 'Participants' ) )
                    {
                    // InternalDsl.g:1260:2: ( ( 'Participants' ) )
                    // InternalDsl.g:1261:3: ( 'Participants' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getParticipantsEnumLiteralDeclaration_19()); 
                    // InternalDsl.g:1262:3: ( 'Participants' )
                    // InternalDsl.g:1262:4: 'Participants'
                    {
                    match(input,59,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getParticipantsEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalDsl.g:1266:2: ( ( 'Playable' ) )
                    {
                    // InternalDsl.g:1266:2: ( ( 'Playable' ) )
                    // InternalDsl.g:1267:3: ( 'Playable' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getPlayableEnumLiteralDeclaration_20()); 
                    // InternalDsl.g:1268:3: ( 'Playable' )
                    // InternalDsl.g:1268:4: 'Playable'
                    {
                    match(input,60,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getPlayableEnumLiteralDeclaration_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalDsl.g:1272:2: ( ( 'Playable_by_Defining_Compartment' ) )
                    {
                    // InternalDsl.g:1272:2: ( ( 'Playable_by_Defining_Compartment' ) )
                    // InternalDsl.g:1273:3: ( 'Playable_by_Defining_Compartment' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getPlayable_by_Defining_CompartmentEnumLiteralDeclaration_21()); 
                    // InternalDsl.g:1274:3: ( 'Playable_by_Defining_Compartment' )
                    // InternalDsl.g:1274:4: 'Playable_by_Defining_Compartment'
                    {
                    match(input,61,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getPlayable_by_Defining_CompartmentEnumLiteralDeclaration_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalDsl.g:1278:2: ( ( 'Players' ) )
                    {
                    // InternalDsl.g:1278:2: ( ( 'Players' ) )
                    // InternalDsl.g:1279:3: ( 'Players' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getPlayersEnumLiteralDeclaration_22()); 
                    // InternalDsl.g:1280:3: ( 'Players' )
                    // InternalDsl.g:1280:4: 'Players'
                    {
                    match(input,62,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getPlayersEnumLiteralDeclaration_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalDsl.g:1284:2: ( ( 'Relationship_Cardinality' ) )
                    {
                    // InternalDsl.g:1284:2: ( ( 'Relationship_Cardinality' ) )
                    // InternalDsl.g:1285:3: ( 'Relationship_Cardinality' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRelationship_CardinalityEnumLiteralDeclaration_23()); 
                    // InternalDsl.g:1286:3: ( 'Relationship_Cardinality' )
                    // InternalDsl.g:1286:4: 'Relationship_Cardinality'
                    {
                    match(input,63,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRelationship_CardinalityEnumLiteralDeclaration_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalDsl.g:1290:2: ( ( 'Relationship_Constraints' ) )
                    {
                    // InternalDsl.g:1290:2: ( ( 'Relationship_Constraints' ) )
                    // InternalDsl.g:1291:3: ( 'Relationship_Constraints' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRelationship_ConstraintsEnumLiteralDeclaration_24()); 
                    // InternalDsl.g:1292:3: ( 'Relationship_Constraints' )
                    // InternalDsl.g:1292:4: 'Relationship_Constraints'
                    {
                    match(input,64,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRelationship_ConstraintsEnumLiteralDeclaration_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalDsl.g:1296:2: ( ( 'Relationships' ) )
                    {
                    // InternalDsl.g:1296:2: ( ( 'Relationships' ) )
                    // InternalDsl.g:1297:3: ( 'Relationships' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRelationshipsEnumLiteralDeclaration_25()); 
                    // InternalDsl.g:1298:3: ( 'Relationships' )
                    // InternalDsl.g:1298:4: 'Relationships'
                    {
                    match(input,65,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRelationshipsEnumLiteralDeclaration_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalDsl.g:1302:2: ( ( 'RML_Feature_Model' ) )
                    {
                    // InternalDsl.g:1302:2: ( ( 'RML_Feature_Model' ) )
                    // InternalDsl.g:1303:3: ( 'RML_Feature_Model' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRML_Feature_ModelEnumLiteralDeclaration_26()); 
                    // InternalDsl.g:1304:3: ( 'RML_Feature_Model' )
                    // InternalDsl.g:1304:4: 'RML_Feature_Model'
                    {
                    match(input,66,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRML_Feature_ModelEnumLiteralDeclaration_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalDsl.g:1308:2: ( ( 'Role_Behavior' ) )
                    {
                    // InternalDsl.g:1308:2: ( ( 'Role_Behavior' ) )
                    // InternalDsl.g:1309:3: ( 'Role_Behavior' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRole_BehaviorEnumLiteralDeclaration_27()); 
                    // InternalDsl.g:1310:3: ( 'Role_Behavior' )
                    // InternalDsl.g:1310:4: 'Role_Behavior'
                    {
                    match(input,67,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRole_BehaviorEnumLiteralDeclaration_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalDsl.g:1314:2: ( ( 'Role_Constraints' ) )
                    {
                    // InternalDsl.g:1314:2: ( ( 'Role_Constraints' ) )
                    // InternalDsl.g:1315:3: ( 'Role_Constraints' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRole_ConstraintsEnumLiteralDeclaration_28()); 
                    // InternalDsl.g:1316:3: ( 'Role_Constraints' )
                    // InternalDsl.g:1316:4: 'Role_Constraints'
                    {
                    match(input,68,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRole_ConstraintsEnumLiteralDeclaration_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalDsl.g:1320:2: ( ( 'Role_Equivalence' ) )
                    {
                    // InternalDsl.g:1320:2: ( ( 'Role_Equivalence' ) )
                    // InternalDsl.g:1321:3: ( 'Role_Equivalence' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRole_EquivalenceEnumLiteralDeclaration_29()); 
                    // InternalDsl.g:1322:3: ( 'Role_Equivalence' )
                    // InternalDsl.g:1322:4: 'Role_Equivalence'
                    {
                    match(input,69,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRole_EquivalenceEnumLiteralDeclaration_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalDsl.g:1326:2: ( ( 'Role_Implication' ) )
                    {
                    // InternalDsl.g:1326:2: ( ( 'Role_Implication' ) )
                    // InternalDsl.g:1327:3: ( 'Role_Implication' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRole_ImplicationEnumLiteralDeclaration_30()); 
                    // InternalDsl.g:1328:3: ( 'Role_Implication' )
                    // InternalDsl.g:1328:4: 'Role_Implication'
                    {
                    match(input,70,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRole_ImplicationEnumLiteralDeclaration_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalDsl.g:1332:2: ( ( 'Role_Inheritance' ) )
                    {
                    // InternalDsl.g:1332:2: ( ( 'Role_Inheritance' ) )
                    // InternalDsl.g:1333:3: ( 'Role_Inheritance' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRole_InheritanceEnumLiteralDeclaration_31()); 
                    // InternalDsl.g:1334:3: ( 'Role_Inheritance' )
                    // InternalDsl.g:1334:4: 'Role_Inheritance'
                    {
                    match(input,71,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRole_InheritanceEnumLiteralDeclaration_31()); 

                    }


                    }
                    break;
                case 33 :
                    // InternalDsl.g:1338:2: ( ( 'Role_Prohibition' ) )
                    {
                    // InternalDsl.g:1338:2: ( ( 'Role_Prohibition' ) )
                    // InternalDsl.g:1339:3: ( 'Role_Prohibition' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRole_ProhibitionEnumLiteralDeclaration_32()); 
                    // InternalDsl.g:1340:3: ( 'Role_Prohibition' )
                    // InternalDsl.g:1340:4: 'Role_Prohibition'
                    {
                    match(input,72,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRole_ProhibitionEnumLiteralDeclaration_32()); 

                    }


                    }
                    break;
                case 34 :
                    // InternalDsl.g:1344:2: ( ( 'Role_Properties' ) )
                    {
                    // InternalDsl.g:1344:2: ( ( 'Role_Properties' ) )
                    // InternalDsl.g:1345:3: ( 'Role_Properties' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRole_PropertiesEnumLiteralDeclaration_33()); 
                    // InternalDsl.g:1346:3: ( 'Role_Properties' )
                    // InternalDsl.g:1346:4: 'Role_Properties'
                    {
                    match(input,73,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRole_PropertiesEnumLiteralDeclaration_33()); 

                    }


                    }
                    break;
                case 35 :
                    // InternalDsl.g:1350:2: ( ( 'Role_Structure' ) )
                    {
                    // InternalDsl.g:1350:2: ( ( 'Role_Structure' ) )
                    // InternalDsl.g:1351:3: ( 'Role_Structure' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRole_StructureEnumLiteralDeclaration_34()); 
                    // InternalDsl.g:1352:3: ( 'Role_Structure' )
                    // InternalDsl.g:1352:4: 'Role_Structure'
                    {
                    match(input,74,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRole_StructureEnumLiteralDeclaration_34()); 

                    }


                    }
                    break;
                case 36 :
                    // InternalDsl.g:1356:2: ( ( 'Role_Types' ) )
                    {
                    // InternalDsl.g:1356:2: ( ( 'Role_Types' ) )
                    // InternalDsl.g:1357:3: ( 'Role_Types' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRole_TypesEnumLiteralDeclaration_35()); 
                    // InternalDsl.g:1358:3: ( 'Role_Types' )
                    // InternalDsl.g:1358:4: 'Role_Types'
                    {
                    match(input,75,FOLLOW_2); 

                    }

                     after(grammarAccess.getFeatureNameEnumAccess().getRole_TypesEnumLiteralDeclaration_35()); 

                    }


                    }
                    break;
                case 37 :
                    // InternalDsl.g:1362:2: ( ( 'Roles' ) )
                    {
                    // InternalDsl.g:1362:2: ( ( 'Roles' ) )
                    // InternalDsl.g:1363:3: ( 'Roles' )
                    {
                     before(grammarAccess.getFeatureNameEnumAccess().getRolesEnumLiteralDeclaration_36()); 
                    // InternalDsl.g:1364:3: ( 'Roles' )
                    // InternalDsl.g:1364:4: 'Roles'
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
    // InternalDsl.g:1372:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1376:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDsl.g:1377:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalDsl.g:1384:1: rule__Model__Group__0__Impl : ( ( rule__Model__PoliciesAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1388:1: ( ( ( rule__Model__PoliciesAssignment_0 ) ) )
            // InternalDsl.g:1389:1: ( ( rule__Model__PoliciesAssignment_0 ) )
            {
            // InternalDsl.g:1389:1: ( ( rule__Model__PoliciesAssignment_0 ) )
            // InternalDsl.g:1390:2: ( rule__Model__PoliciesAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getPoliciesAssignment_0()); 
            // InternalDsl.g:1391:2: ( rule__Model__PoliciesAssignment_0 )
            // InternalDsl.g:1391:3: rule__Model__PoliciesAssignment_0
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
    // InternalDsl.g:1399:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1403:1: ( rule__Model__Group__1__Impl )
            // InternalDsl.g:1404:2: rule__Model__Group__1__Impl
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
    // InternalDsl.g:1410:1: rule__Model__Group__1__Impl : ( ( rule__Model__PoliciesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1414:1: ( ( ( rule__Model__PoliciesAssignment_1 )* ) )
            // InternalDsl.g:1415:1: ( ( rule__Model__PoliciesAssignment_1 )* )
            {
            // InternalDsl.g:1415:1: ( ( rule__Model__PoliciesAssignment_1 )* )
            // InternalDsl.g:1416:2: ( rule__Model__PoliciesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getPoliciesAssignment_1()); 
            // InternalDsl.g:1417:2: ( rule__Model__PoliciesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=11 && LA11_0<=20)||LA11_0==94) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:1417:3: rule__Model__PoliciesAssignment_1
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
    // InternalDsl.g:1426:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1430:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // InternalDsl.g:1431:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
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
    // InternalDsl.g:1438:1: rule__Policy__Group__0__Impl : ( ( rule__Policy__OverrideAssignment_0 )? ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1442:1: ( ( ( rule__Policy__OverrideAssignment_0 )? ) )
            // InternalDsl.g:1443:1: ( ( rule__Policy__OverrideAssignment_0 )? )
            {
            // InternalDsl.g:1443:1: ( ( rule__Policy__OverrideAssignment_0 )? )
            // InternalDsl.g:1444:2: ( rule__Policy__OverrideAssignment_0 )?
            {
             before(grammarAccess.getPolicyAccess().getOverrideAssignment_0()); 
            // InternalDsl.g:1445:2: ( rule__Policy__OverrideAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==94) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:1445:3: rule__Policy__OverrideAssignment_0
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
    // InternalDsl.g:1453:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1457:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // InternalDsl.g:1458:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
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
    // InternalDsl.g:1465:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__ActionAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1469:1: ( ( ( rule__Policy__ActionAssignment_1 ) ) )
            // InternalDsl.g:1470:1: ( ( rule__Policy__ActionAssignment_1 ) )
            {
            // InternalDsl.g:1470:1: ( ( rule__Policy__ActionAssignment_1 ) )
            // InternalDsl.g:1471:2: ( rule__Policy__ActionAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getActionAssignment_1()); 
            // InternalDsl.g:1472:2: ( rule__Policy__ActionAssignment_1 )
            // InternalDsl.g:1472:3: rule__Policy__ActionAssignment_1
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
    // InternalDsl.g:1480:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1484:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // InternalDsl.g:1485:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
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
    // InternalDsl.g:1492:1: rule__Policy__Group__2__Impl : ( ( rule__Policy__ActionTypeAssignment_2 ) ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1496:1: ( ( ( rule__Policy__ActionTypeAssignment_2 ) ) )
            // InternalDsl.g:1497:1: ( ( rule__Policy__ActionTypeAssignment_2 ) )
            {
            // InternalDsl.g:1497:1: ( ( rule__Policy__ActionTypeAssignment_2 ) )
            // InternalDsl.g:1498:2: ( rule__Policy__ActionTypeAssignment_2 )
            {
             before(grammarAccess.getPolicyAccess().getActionTypeAssignment_2()); 
            // InternalDsl.g:1499:2: ( rule__Policy__ActionTypeAssignment_2 )
            // InternalDsl.g:1499:3: rule__Policy__ActionTypeAssignment_2
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
    // InternalDsl.g:1507:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl rule__Policy__Group__4 ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1511:1: ( rule__Policy__Group__3__Impl rule__Policy__Group__4 )
            // InternalDsl.g:1512:2: rule__Policy__Group__3__Impl rule__Policy__Group__4
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
    // InternalDsl.g:1519:1: rule__Policy__Group__3__Impl : ( '(' ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1523:1: ( ( '(' ) )
            // InternalDsl.g:1524:1: ( '(' )
            {
            // InternalDsl.g:1524:1: ( '(' )
            // InternalDsl.g:1525:2: '('
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
    // InternalDsl.g:1534:1: rule__Policy__Group__4 : rule__Policy__Group__4__Impl rule__Policy__Group__5 ;
    public final void rule__Policy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1538:1: ( rule__Policy__Group__4__Impl rule__Policy__Group__5 )
            // InternalDsl.g:1539:2: rule__Policy__Group__4__Impl rule__Policy__Group__5
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
    // InternalDsl.g:1546:1: rule__Policy__Group__4__Impl : ( ( rule__Policy__FeatureRuleAssignment_4 ) ) ;
    public final void rule__Policy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1550:1: ( ( ( rule__Policy__FeatureRuleAssignment_4 ) ) )
            // InternalDsl.g:1551:1: ( ( rule__Policy__FeatureRuleAssignment_4 ) )
            {
            // InternalDsl.g:1551:1: ( ( rule__Policy__FeatureRuleAssignment_4 ) )
            // InternalDsl.g:1552:2: ( rule__Policy__FeatureRuleAssignment_4 )
            {
             before(grammarAccess.getPolicyAccess().getFeatureRuleAssignment_4()); 
            // InternalDsl.g:1553:2: ( rule__Policy__FeatureRuleAssignment_4 )
            // InternalDsl.g:1553:3: rule__Policy__FeatureRuleAssignment_4
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
    // InternalDsl.g:1561:1: rule__Policy__Group__5 : rule__Policy__Group__5__Impl rule__Policy__Group__6 ;
    public final void rule__Policy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1565:1: ( rule__Policy__Group__5__Impl rule__Policy__Group__6 )
            // InternalDsl.g:1566:2: rule__Policy__Group__5__Impl rule__Policy__Group__6
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
    // InternalDsl.g:1573:1: rule__Policy__Group__5__Impl : ( ')' ) ;
    public final void rule__Policy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1577:1: ( ( ')' ) )
            // InternalDsl.g:1578:1: ( ')' )
            {
            // InternalDsl.g:1578:1: ( ')' )
            // InternalDsl.g:1579:2: ')'
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
    // InternalDsl.g:1588:1: rule__Policy__Group__6 : rule__Policy__Group__6__Impl rule__Policy__Group__7 ;
    public final void rule__Policy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1592:1: ( rule__Policy__Group__6__Impl rule__Policy__Group__7 )
            // InternalDsl.g:1593:2: rule__Policy__Group__6__Impl rule__Policy__Group__7
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
    // InternalDsl.g:1600:1: rule__Policy__Group__6__Impl : ( 'when' ) ;
    public final void rule__Policy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1604:1: ( ( 'when' ) )
            // InternalDsl.g:1605:1: ( 'when' )
            {
            // InternalDsl.g:1605:1: ( 'when' )
            // InternalDsl.g:1606:2: 'when'
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
    // InternalDsl.g:1615:1: rule__Policy__Group__7 : rule__Policy__Group__7__Impl rule__Policy__Group__8 ;
    public final void rule__Policy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1619:1: ( rule__Policy__Group__7__Impl rule__Policy__Group__8 )
            // InternalDsl.g:1620:2: rule__Policy__Group__7__Impl rule__Policy__Group__8
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
    // InternalDsl.g:1627:1: rule__Policy__Group__7__Impl : ( ( rule__Policy__ConstraintRuleAssignment_7 ) ) ;
    public final void rule__Policy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1631:1: ( ( ( rule__Policy__ConstraintRuleAssignment_7 ) ) )
            // InternalDsl.g:1632:1: ( ( rule__Policy__ConstraintRuleAssignment_7 ) )
            {
            // InternalDsl.g:1632:1: ( ( rule__Policy__ConstraintRuleAssignment_7 ) )
            // InternalDsl.g:1633:2: ( rule__Policy__ConstraintRuleAssignment_7 )
            {
             before(grammarAccess.getPolicyAccess().getConstraintRuleAssignment_7()); 
            // InternalDsl.g:1634:2: ( rule__Policy__ConstraintRuleAssignment_7 )
            // InternalDsl.g:1634:3: rule__Policy__ConstraintRuleAssignment_7
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
    // InternalDsl.g:1642:1: rule__Policy__Group__8 : rule__Policy__Group__8__Impl ;
    public final void rule__Policy__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1646:1: ( rule__Policy__Group__8__Impl )
            // InternalDsl.g:1647:2: rule__Policy__Group__8__Impl
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
    // InternalDsl.g:1653:1: rule__Policy__Group__8__Impl : ( ';' ) ;
    public final void rule__Policy__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1657:1: ( ( ';' ) )
            // InternalDsl.g:1658:1: ( ';' )
            {
            // InternalDsl.g:1658:1: ( ';' )
            // InternalDsl.g:1659:2: ';'
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


    // $ANTLR start "rule__ContainsTypeConstrainRule__Group__0"
    // InternalDsl.g:1669:1: rule__ContainsTypeConstrainRule__Group__0 : rule__ContainsTypeConstrainRule__Group__0__Impl rule__ContainsTypeConstrainRule__Group__1 ;
    public final void rule__ContainsTypeConstrainRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1673:1: ( rule__ContainsTypeConstrainRule__Group__0__Impl rule__ContainsTypeConstrainRule__Group__1 )
            // InternalDsl.g:1674:2: rule__ContainsTypeConstrainRule__Group__0__Impl rule__ContainsTypeConstrainRule__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ContainsTypeConstrainRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainsTypeConstrainRule__Group__1();

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
    // $ANTLR end "rule__ContainsTypeConstrainRule__Group__0"


    // $ANTLR start "rule__ContainsTypeConstrainRule__Group__0__Impl"
    // InternalDsl.g:1681:1: rule__ContainsTypeConstrainRule__Group__0__Impl : ( () ) ;
    public final void rule__ContainsTypeConstrainRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1685:1: ( ( () ) )
            // InternalDsl.g:1686:1: ( () )
            {
            // InternalDsl.g:1686:1: ( () )
            // InternalDsl.g:1687:2: ()
            {
             before(grammarAccess.getContainsTypeConstrainRuleAccess().getContainsTypeAction_0()); 
            // InternalDsl.g:1688:2: ()
            // InternalDsl.g:1688:3: 
            {
            }

             after(grammarAccess.getContainsTypeConstrainRuleAccess().getContainsTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainsTypeConstrainRule__Group__0__Impl"


    // $ANTLR start "rule__ContainsTypeConstrainRule__Group__1"
    // InternalDsl.g:1696:1: rule__ContainsTypeConstrainRule__Group__1 : rule__ContainsTypeConstrainRule__Group__1__Impl rule__ContainsTypeConstrainRule__Group__2 ;
    public final void rule__ContainsTypeConstrainRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1700:1: ( rule__ContainsTypeConstrainRule__Group__1__Impl rule__ContainsTypeConstrainRule__Group__2 )
            // InternalDsl.g:1701:2: rule__ContainsTypeConstrainRule__Group__1__Impl rule__ContainsTypeConstrainRule__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ContainsTypeConstrainRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainsTypeConstrainRule__Group__2();

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
    // $ANTLR end "rule__ContainsTypeConstrainRule__Group__1"


    // $ANTLR start "rule__ContainsTypeConstrainRule__Group__1__Impl"
    // InternalDsl.g:1708:1: rule__ContainsTypeConstrainRule__Group__1__Impl : ( 'ContainsType' ) ;
    public final void rule__ContainsTypeConstrainRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1712:1: ( ( 'ContainsType' ) )
            // InternalDsl.g:1713:1: ( 'ContainsType' )
            {
            // InternalDsl.g:1713:1: ( 'ContainsType' )
            // InternalDsl.g:1714:2: 'ContainsType'
            {
             before(grammarAccess.getContainsTypeConstrainRuleAccess().getContainsTypeKeyword_1()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getContainsTypeConstrainRuleAccess().getContainsTypeKeyword_1()); 

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
    // $ANTLR end "rule__ContainsTypeConstrainRule__Group__1__Impl"


    // $ANTLR start "rule__ContainsTypeConstrainRule__Group__2"
    // InternalDsl.g:1723:1: rule__ContainsTypeConstrainRule__Group__2 : rule__ContainsTypeConstrainRule__Group__2__Impl rule__ContainsTypeConstrainRule__Group__3 ;
    public final void rule__ContainsTypeConstrainRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1727:1: ( rule__ContainsTypeConstrainRule__Group__2__Impl rule__ContainsTypeConstrainRule__Group__3 )
            // InternalDsl.g:1728:2: rule__ContainsTypeConstrainRule__Group__2__Impl rule__ContainsTypeConstrainRule__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ContainsTypeConstrainRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainsTypeConstrainRule__Group__3();

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
    // $ANTLR end "rule__ContainsTypeConstrainRule__Group__2"


    // $ANTLR start "rule__ContainsTypeConstrainRule__Group__2__Impl"
    // InternalDsl.g:1735:1: rule__ContainsTypeConstrainRule__Group__2__Impl : ( '(' ) ;
    public final void rule__ContainsTypeConstrainRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1739:1: ( ( '(' ) )
            // InternalDsl.g:1740:1: ( '(' )
            {
            // InternalDsl.g:1740:1: ( '(' )
            // InternalDsl.g:1741:2: '('
            {
             before(grammarAccess.getContainsTypeConstrainRuleAccess().getLeftParenthesisKeyword_2()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getContainsTypeConstrainRuleAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__ContainsTypeConstrainRule__Group__2__Impl"


    // $ANTLR start "rule__ContainsTypeConstrainRule__Group__3"
    // InternalDsl.g:1750:1: rule__ContainsTypeConstrainRule__Group__3 : rule__ContainsTypeConstrainRule__Group__3__Impl rule__ContainsTypeConstrainRule__Group__4 ;
    public final void rule__ContainsTypeConstrainRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1754:1: ( rule__ContainsTypeConstrainRule__Group__3__Impl rule__ContainsTypeConstrainRule__Group__4 )
            // InternalDsl.g:1755:2: rule__ContainsTypeConstrainRule__Group__3__Impl rule__ContainsTypeConstrainRule__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__ContainsTypeConstrainRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainsTypeConstrainRule__Group__4();

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
    // $ANTLR end "rule__ContainsTypeConstrainRule__Group__3"


    // $ANTLR start "rule__ContainsTypeConstrainRule__Group__3__Impl"
    // InternalDsl.g:1762:1: rule__ContainsTypeConstrainRule__Group__3__Impl : ( ( rule__ContainsTypeConstrainRule__TypeAssignment_3 ) ) ;
    public final void rule__ContainsTypeConstrainRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1766:1: ( ( ( rule__ContainsTypeConstrainRule__TypeAssignment_3 ) ) )
            // InternalDsl.g:1767:1: ( ( rule__ContainsTypeConstrainRule__TypeAssignment_3 ) )
            {
            // InternalDsl.g:1767:1: ( ( rule__ContainsTypeConstrainRule__TypeAssignment_3 ) )
            // InternalDsl.g:1768:2: ( rule__ContainsTypeConstrainRule__TypeAssignment_3 )
            {
             before(grammarAccess.getContainsTypeConstrainRuleAccess().getTypeAssignment_3()); 
            // InternalDsl.g:1769:2: ( rule__ContainsTypeConstrainRule__TypeAssignment_3 )
            // InternalDsl.g:1769:3: rule__ContainsTypeConstrainRule__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ContainsTypeConstrainRule__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getContainsTypeConstrainRuleAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__ContainsTypeConstrainRule__Group__3__Impl"


    // $ANTLR start "rule__ContainsTypeConstrainRule__Group__4"
    // InternalDsl.g:1777:1: rule__ContainsTypeConstrainRule__Group__4 : rule__ContainsTypeConstrainRule__Group__4__Impl ;
    public final void rule__ContainsTypeConstrainRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1781:1: ( rule__ContainsTypeConstrainRule__Group__4__Impl )
            // InternalDsl.g:1782:2: rule__ContainsTypeConstrainRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContainsTypeConstrainRule__Group__4__Impl();

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
    // $ANTLR end "rule__ContainsTypeConstrainRule__Group__4"


    // $ANTLR start "rule__ContainsTypeConstrainRule__Group__4__Impl"
    // InternalDsl.g:1788:1: rule__ContainsTypeConstrainRule__Group__4__Impl : ( ')' ) ;
    public final void rule__ContainsTypeConstrainRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1792:1: ( ( ')' ) )
            // InternalDsl.g:1793:1: ( ')' )
            {
            // InternalDsl.g:1793:1: ( ')' )
            // InternalDsl.g:1794:2: ')'
            {
             before(grammarAccess.getContainsTypeConstrainRuleAccess().getRightParenthesisKeyword_4()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getContainsTypeConstrainRuleAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__ContainsTypeConstrainRule__Group__4__Impl"


    // $ANTLR start "rule__IsTargetTypeConstraintRule__Group__0"
    // InternalDsl.g:1804:1: rule__IsTargetTypeConstraintRule__Group__0 : rule__IsTargetTypeConstraintRule__Group__0__Impl rule__IsTargetTypeConstraintRule__Group__1 ;
    public final void rule__IsTargetTypeConstraintRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1808:1: ( rule__IsTargetTypeConstraintRule__Group__0__Impl rule__IsTargetTypeConstraintRule__Group__1 )
            // InternalDsl.g:1809:2: rule__IsTargetTypeConstraintRule__Group__0__Impl rule__IsTargetTypeConstraintRule__Group__1
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
    // InternalDsl.g:1816:1: rule__IsTargetTypeConstraintRule__Group__0__Impl : ( () ) ;
    public final void rule__IsTargetTypeConstraintRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1820:1: ( ( () ) )
            // InternalDsl.g:1821:1: ( () )
            {
            // InternalDsl.g:1821:1: ( () )
            // InternalDsl.g:1822:2: ()
            {
             before(grammarAccess.getIsTargetTypeConstraintRuleAccess().getIsTargetTypeAction_0()); 
            // InternalDsl.g:1823:2: ()
            // InternalDsl.g:1823:3: 
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
    // InternalDsl.g:1831:1: rule__IsTargetTypeConstraintRule__Group__1 : rule__IsTargetTypeConstraintRule__Group__1__Impl rule__IsTargetTypeConstraintRule__Group__2 ;
    public final void rule__IsTargetTypeConstraintRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1835:1: ( rule__IsTargetTypeConstraintRule__Group__1__Impl rule__IsTargetTypeConstraintRule__Group__2 )
            // InternalDsl.g:1836:2: rule__IsTargetTypeConstraintRule__Group__1__Impl rule__IsTargetTypeConstraintRule__Group__2
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
    // InternalDsl.g:1843:1: rule__IsTargetTypeConstraintRule__Group__1__Impl : ( 'IsTargetType' ) ;
    public final void rule__IsTargetTypeConstraintRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1847:1: ( ( 'IsTargetType' ) )
            // InternalDsl.g:1848:1: ( 'IsTargetType' )
            {
            // InternalDsl.g:1848:1: ( 'IsTargetType' )
            // InternalDsl.g:1849:2: 'IsTargetType'
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
    // InternalDsl.g:1858:1: rule__IsTargetTypeConstraintRule__Group__2 : rule__IsTargetTypeConstraintRule__Group__2__Impl rule__IsTargetTypeConstraintRule__Group__3 ;
    public final void rule__IsTargetTypeConstraintRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1862:1: ( rule__IsTargetTypeConstraintRule__Group__2__Impl rule__IsTargetTypeConstraintRule__Group__3 )
            // InternalDsl.g:1863:2: rule__IsTargetTypeConstraintRule__Group__2__Impl rule__IsTargetTypeConstraintRule__Group__3
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
    // InternalDsl.g:1870:1: rule__IsTargetTypeConstraintRule__Group__2__Impl : ( '(' ) ;
    public final void rule__IsTargetTypeConstraintRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1874:1: ( ( '(' ) )
            // InternalDsl.g:1875:1: ( '(' )
            {
            // InternalDsl.g:1875:1: ( '(' )
            // InternalDsl.g:1876:2: '('
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
    // InternalDsl.g:1885:1: rule__IsTargetTypeConstraintRule__Group__3 : rule__IsTargetTypeConstraintRule__Group__3__Impl rule__IsTargetTypeConstraintRule__Group__4 ;
    public final void rule__IsTargetTypeConstraintRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1889:1: ( rule__IsTargetTypeConstraintRule__Group__3__Impl rule__IsTargetTypeConstraintRule__Group__4 )
            // InternalDsl.g:1890:2: rule__IsTargetTypeConstraintRule__Group__3__Impl rule__IsTargetTypeConstraintRule__Group__4
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
    // InternalDsl.g:1897:1: rule__IsTargetTypeConstraintRule__Group__3__Impl : ( ( rule__IsTargetTypeConstraintRule__TypeAssignment_3 ) ) ;
    public final void rule__IsTargetTypeConstraintRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1901:1: ( ( ( rule__IsTargetTypeConstraintRule__TypeAssignment_3 ) ) )
            // InternalDsl.g:1902:1: ( ( rule__IsTargetTypeConstraintRule__TypeAssignment_3 ) )
            {
            // InternalDsl.g:1902:1: ( ( rule__IsTargetTypeConstraintRule__TypeAssignment_3 ) )
            // InternalDsl.g:1903:2: ( rule__IsTargetTypeConstraintRule__TypeAssignment_3 )
            {
             before(grammarAccess.getIsTargetTypeConstraintRuleAccess().getTypeAssignment_3()); 
            // InternalDsl.g:1904:2: ( rule__IsTargetTypeConstraintRule__TypeAssignment_3 )
            // InternalDsl.g:1904:3: rule__IsTargetTypeConstraintRule__TypeAssignment_3
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
    // InternalDsl.g:1912:1: rule__IsTargetTypeConstraintRule__Group__4 : rule__IsTargetTypeConstraintRule__Group__4__Impl ;
    public final void rule__IsTargetTypeConstraintRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1916:1: ( rule__IsTargetTypeConstraintRule__Group__4__Impl )
            // InternalDsl.g:1917:2: rule__IsTargetTypeConstraintRule__Group__4__Impl
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
    // InternalDsl.g:1923:1: rule__IsTargetTypeConstraintRule__Group__4__Impl : ( ')' ) ;
    public final void rule__IsTargetTypeConstraintRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1927:1: ( ( ')' ) )
            // InternalDsl.g:1928:1: ( ')' )
            {
            // InternalDsl.g:1928:1: ( ')' )
            // InternalDsl.g:1929:2: ')'
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


    // $ANTLR start "rule__IsTargetConnectionTypeConstraintRule__Group__0"
    // InternalDsl.g:1939:1: rule__IsTargetConnectionTypeConstraintRule__Group__0 : rule__IsTargetConnectionTypeConstraintRule__Group__0__Impl rule__IsTargetConnectionTypeConstraintRule__Group__1 ;
    public final void rule__IsTargetConnectionTypeConstraintRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1943:1: ( rule__IsTargetConnectionTypeConstraintRule__Group__0__Impl rule__IsTargetConnectionTypeConstraintRule__Group__1 )
            // InternalDsl.g:1944:2: rule__IsTargetConnectionTypeConstraintRule__Group__0__Impl rule__IsTargetConnectionTypeConstraintRule__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__IsTargetConnectionTypeConstraintRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsTargetConnectionTypeConstraintRule__Group__1();

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
    // $ANTLR end "rule__IsTargetConnectionTypeConstraintRule__Group__0"


    // $ANTLR start "rule__IsTargetConnectionTypeConstraintRule__Group__0__Impl"
    // InternalDsl.g:1951:1: rule__IsTargetConnectionTypeConstraintRule__Group__0__Impl : ( () ) ;
    public final void rule__IsTargetConnectionTypeConstraintRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1955:1: ( ( () ) )
            // InternalDsl.g:1956:1: ( () )
            {
            // InternalDsl.g:1956:1: ( () )
            // InternalDsl.g:1957:2: ()
            {
             before(grammarAccess.getIsTargetConnectionTypeConstraintRuleAccess().getIsTargetConnectionTypeAction_0()); 
            // InternalDsl.g:1958:2: ()
            // InternalDsl.g:1958:3: 
            {
            }

             after(grammarAccess.getIsTargetConnectionTypeConstraintRuleAccess().getIsTargetConnectionTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsTargetConnectionTypeConstraintRule__Group__0__Impl"


    // $ANTLR start "rule__IsTargetConnectionTypeConstraintRule__Group__1"
    // InternalDsl.g:1966:1: rule__IsTargetConnectionTypeConstraintRule__Group__1 : rule__IsTargetConnectionTypeConstraintRule__Group__1__Impl rule__IsTargetConnectionTypeConstraintRule__Group__2 ;
    public final void rule__IsTargetConnectionTypeConstraintRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1970:1: ( rule__IsTargetConnectionTypeConstraintRule__Group__1__Impl rule__IsTargetConnectionTypeConstraintRule__Group__2 )
            // InternalDsl.g:1971:2: rule__IsTargetConnectionTypeConstraintRule__Group__1__Impl rule__IsTargetConnectionTypeConstraintRule__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__IsTargetConnectionTypeConstraintRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsTargetConnectionTypeConstraintRule__Group__2();

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
    // $ANTLR end "rule__IsTargetConnectionTypeConstraintRule__Group__1"


    // $ANTLR start "rule__IsTargetConnectionTypeConstraintRule__Group__1__Impl"
    // InternalDsl.g:1978:1: rule__IsTargetConnectionTypeConstraintRule__Group__1__Impl : ( 'IsTargetConnectionType' ) ;
    public final void rule__IsTargetConnectionTypeConstraintRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1982:1: ( ( 'IsTargetConnectionType' ) )
            // InternalDsl.g:1983:1: ( 'IsTargetConnectionType' )
            {
            // InternalDsl.g:1983:1: ( 'IsTargetConnectionType' )
            // InternalDsl.g:1984:2: 'IsTargetConnectionType'
            {
             before(grammarAccess.getIsTargetConnectionTypeConstraintRuleAccess().getIsTargetConnectionTypeKeyword_1()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getIsTargetConnectionTypeConstraintRuleAccess().getIsTargetConnectionTypeKeyword_1()); 

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
    // $ANTLR end "rule__IsTargetConnectionTypeConstraintRule__Group__1__Impl"


    // $ANTLR start "rule__IsTargetConnectionTypeConstraintRule__Group__2"
    // InternalDsl.g:1993:1: rule__IsTargetConnectionTypeConstraintRule__Group__2 : rule__IsTargetConnectionTypeConstraintRule__Group__2__Impl rule__IsTargetConnectionTypeConstraintRule__Group__3 ;
    public final void rule__IsTargetConnectionTypeConstraintRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1997:1: ( rule__IsTargetConnectionTypeConstraintRule__Group__2__Impl rule__IsTargetConnectionTypeConstraintRule__Group__3 )
            // InternalDsl.g:1998:2: rule__IsTargetConnectionTypeConstraintRule__Group__2__Impl rule__IsTargetConnectionTypeConstraintRule__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__IsTargetConnectionTypeConstraintRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsTargetConnectionTypeConstraintRule__Group__3();

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
    // $ANTLR end "rule__IsTargetConnectionTypeConstraintRule__Group__2"


    // $ANTLR start "rule__IsTargetConnectionTypeConstraintRule__Group__2__Impl"
    // InternalDsl.g:2005:1: rule__IsTargetConnectionTypeConstraintRule__Group__2__Impl : ( '(' ) ;
    public final void rule__IsTargetConnectionTypeConstraintRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2009:1: ( ( '(' ) )
            // InternalDsl.g:2010:1: ( '(' )
            {
            // InternalDsl.g:2010:1: ( '(' )
            // InternalDsl.g:2011:2: '('
            {
             before(grammarAccess.getIsTargetConnectionTypeConstraintRuleAccess().getLeftParenthesisKeyword_2()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getIsTargetConnectionTypeConstraintRuleAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__IsTargetConnectionTypeConstraintRule__Group__2__Impl"


    // $ANTLR start "rule__IsTargetConnectionTypeConstraintRule__Group__3"
    // InternalDsl.g:2020:1: rule__IsTargetConnectionTypeConstraintRule__Group__3 : rule__IsTargetConnectionTypeConstraintRule__Group__3__Impl rule__IsTargetConnectionTypeConstraintRule__Group__4 ;
    public final void rule__IsTargetConnectionTypeConstraintRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2024:1: ( rule__IsTargetConnectionTypeConstraintRule__Group__3__Impl rule__IsTargetConnectionTypeConstraintRule__Group__4 )
            // InternalDsl.g:2025:2: rule__IsTargetConnectionTypeConstraintRule__Group__3__Impl rule__IsTargetConnectionTypeConstraintRule__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__IsTargetConnectionTypeConstraintRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsTargetConnectionTypeConstraintRule__Group__4();

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
    // $ANTLR end "rule__IsTargetConnectionTypeConstraintRule__Group__3"


    // $ANTLR start "rule__IsTargetConnectionTypeConstraintRule__Group__3__Impl"
    // InternalDsl.g:2032:1: rule__IsTargetConnectionTypeConstraintRule__Group__3__Impl : ( ( rule__IsTargetConnectionTypeConstraintRule__TypeAssignment_3 ) ) ;
    public final void rule__IsTargetConnectionTypeConstraintRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2036:1: ( ( ( rule__IsTargetConnectionTypeConstraintRule__TypeAssignment_3 ) ) )
            // InternalDsl.g:2037:1: ( ( rule__IsTargetConnectionTypeConstraintRule__TypeAssignment_3 ) )
            {
            // InternalDsl.g:2037:1: ( ( rule__IsTargetConnectionTypeConstraintRule__TypeAssignment_3 ) )
            // InternalDsl.g:2038:2: ( rule__IsTargetConnectionTypeConstraintRule__TypeAssignment_3 )
            {
             before(grammarAccess.getIsTargetConnectionTypeConstraintRuleAccess().getTypeAssignment_3()); 
            // InternalDsl.g:2039:2: ( rule__IsTargetConnectionTypeConstraintRule__TypeAssignment_3 )
            // InternalDsl.g:2039:3: rule__IsTargetConnectionTypeConstraintRule__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IsTargetConnectionTypeConstraintRule__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIsTargetConnectionTypeConstraintRuleAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__IsTargetConnectionTypeConstraintRule__Group__3__Impl"


    // $ANTLR start "rule__IsTargetConnectionTypeConstraintRule__Group__4"
    // InternalDsl.g:2047:1: rule__IsTargetConnectionTypeConstraintRule__Group__4 : rule__IsTargetConnectionTypeConstraintRule__Group__4__Impl ;
    public final void rule__IsTargetConnectionTypeConstraintRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2051:1: ( rule__IsTargetConnectionTypeConstraintRule__Group__4__Impl )
            // InternalDsl.g:2052:2: rule__IsTargetConnectionTypeConstraintRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IsTargetConnectionTypeConstraintRule__Group__4__Impl();

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
    // $ANTLR end "rule__IsTargetConnectionTypeConstraintRule__Group__4"


    // $ANTLR start "rule__IsTargetConnectionTypeConstraintRule__Group__4__Impl"
    // InternalDsl.g:2058:1: rule__IsTargetConnectionTypeConstraintRule__Group__4__Impl : ( ')' ) ;
    public final void rule__IsTargetConnectionTypeConstraintRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2062:1: ( ( ')' ) )
            // InternalDsl.g:2063:1: ( ')' )
            {
            // InternalDsl.g:2063:1: ( ')' )
            // InternalDsl.g:2064:2: ')'
            {
             before(grammarAccess.getIsTargetConnectionTypeConstraintRuleAccess().getRightParenthesisKeyword_4()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getIsTargetConnectionTypeConstraintRuleAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__IsTargetConnectionTypeConstraintRule__Group__4__Impl"


    // $ANTLR start "rule__IsSourceTypeConstraintRule__Group__0"
    // InternalDsl.g:2074:1: rule__IsSourceTypeConstraintRule__Group__0 : rule__IsSourceTypeConstraintRule__Group__0__Impl rule__IsSourceTypeConstraintRule__Group__1 ;
    public final void rule__IsSourceTypeConstraintRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2078:1: ( rule__IsSourceTypeConstraintRule__Group__0__Impl rule__IsSourceTypeConstraintRule__Group__1 )
            // InternalDsl.g:2079:2: rule__IsSourceTypeConstraintRule__Group__0__Impl rule__IsSourceTypeConstraintRule__Group__1
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
    // InternalDsl.g:2086:1: rule__IsSourceTypeConstraintRule__Group__0__Impl : ( () ) ;
    public final void rule__IsSourceTypeConstraintRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2090:1: ( ( () ) )
            // InternalDsl.g:2091:1: ( () )
            {
            // InternalDsl.g:2091:1: ( () )
            // InternalDsl.g:2092:2: ()
            {
             before(grammarAccess.getIsSourceTypeConstraintRuleAccess().getIsSourceTypeAction_0()); 
            // InternalDsl.g:2093:2: ()
            // InternalDsl.g:2093:3: 
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
    // InternalDsl.g:2101:1: rule__IsSourceTypeConstraintRule__Group__1 : rule__IsSourceTypeConstraintRule__Group__1__Impl rule__IsSourceTypeConstraintRule__Group__2 ;
    public final void rule__IsSourceTypeConstraintRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2105:1: ( rule__IsSourceTypeConstraintRule__Group__1__Impl rule__IsSourceTypeConstraintRule__Group__2 )
            // InternalDsl.g:2106:2: rule__IsSourceTypeConstraintRule__Group__1__Impl rule__IsSourceTypeConstraintRule__Group__2
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
    // InternalDsl.g:2113:1: rule__IsSourceTypeConstraintRule__Group__1__Impl : ( 'IsSourceType' ) ;
    public final void rule__IsSourceTypeConstraintRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2117:1: ( ( 'IsSourceType' ) )
            // InternalDsl.g:2118:1: ( 'IsSourceType' )
            {
            // InternalDsl.g:2118:1: ( 'IsSourceType' )
            // InternalDsl.g:2119:2: 'IsSourceType'
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
    // InternalDsl.g:2128:1: rule__IsSourceTypeConstraintRule__Group__2 : rule__IsSourceTypeConstraintRule__Group__2__Impl rule__IsSourceTypeConstraintRule__Group__3 ;
    public final void rule__IsSourceTypeConstraintRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2132:1: ( rule__IsSourceTypeConstraintRule__Group__2__Impl rule__IsSourceTypeConstraintRule__Group__3 )
            // InternalDsl.g:2133:2: rule__IsSourceTypeConstraintRule__Group__2__Impl rule__IsSourceTypeConstraintRule__Group__3
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
    // InternalDsl.g:2140:1: rule__IsSourceTypeConstraintRule__Group__2__Impl : ( '(' ) ;
    public final void rule__IsSourceTypeConstraintRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2144:1: ( ( '(' ) )
            // InternalDsl.g:2145:1: ( '(' )
            {
            // InternalDsl.g:2145:1: ( '(' )
            // InternalDsl.g:2146:2: '('
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
    // InternalDsl.g:2155:1: rule__IsSourceTypeConstraintRule__Group__3 : rule__IsSourceTypeConstraintRule__Group__3__Impl rule__IsSourceTypeConstraintRule__Group__4 ;
    public final void rule__IsSourceTypeConstraintRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2159:1: ( rule__IsSourceTypeConstraintRule__Group__3__Impl rule__IsSourceTypeConstraintRule__Group__4 )
            // InternalDsl.g:2160:2: rule__IsSourceTypeConstraintRule__Group__3__Impl rule__IsSourceTypeConstraintRule__Group__4
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
    // InternalDsl.g:2167:1: rule__IsSourceTypeConstraintRule__Group__3__Impl : ( ( rule__IsSourceTypeConstraintRule__TypeAssignment_3 ) ) ;
    public final void rule__IsSourceTypeConstraintRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2171:1: ( ( ( rule__IsSourceTypeConstraintRule__TypeAssignment_3 ) ) )
            // InternalDsl.g:2172:1: ( ( rule__IsSourceTypeConstraintRule__TypeAssignment_3 ) )
            {
            // InternalDsl.g:2172:1: ( ( rule__IsSourceTypeConstraintRule__TypeAssignment_3 ) )
            // InternalDsl.g:2173:2: ( rule__IsSourceTypeConstraintRule__TypeAssignment_3 )
            {
             before(grammarAccess.getIsSourceTypeConstraintRuleAccess().getTypeAssignment_3()); 
            // InternalDsl.g:2174:2: ( rule__IsSourceTypeConstraintRule__TypeAssignment_3 )
            // InternalDsl.g:2174:3: rule__IsSourceTypeConstraintRule__TypeAssignment_3
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
    // InternalDsl.g:2182:1: rule__IsSourceTypeConstraintRule__Group__4 : rule__IsSourceTypeConstraintRule__Group__4__Impl ;
    public final void rule__IsSourceTypeConstraintRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2186:1: ( rule__IsSourceTypeConstraintRule__Group__4__Impl )
            // InternalDsl.g:2187:2: rule__IsSourceTypeConstraintRule__Group__4__Impl
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
    // InternalDsl.g:2193:1: rule__IsSourceTypeConstraintRule__Group__4__Impl : ( ')' ) ;
    public final void rule__IsSourceTypeConstraintRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2197:1: ( ( ')' ) )
            // InternalDsl.g:2198:1: ( ')' )
            {
            // InternalDsl.g:2198:1: ( ')' )
            // InternalDsl.g:2199:2: ')'
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


    // $ANTLR start "rule__InTypeConstraintRule__Group__0"
    // InternalDsl.g:2209:1: rule__InTypeConstraintRule__Group__0 : rule__InTypeConstraintRule__Group__0__Impl rule__InTypeConstraintRule__Group__1 ;
    public final void rule__InTypeConstraintRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2213:1: ( rule__InTypeConstraintRule__Group__0__Impl rule__InTypeConstraintRule__Group__1 )
            // InternalDsl.g:2214:2: rule__InTypeConstraintRule__Group__0__Impl rule__InTypeConstraintRule__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDsl.g:2221:1: rule__InTypeConstraintRule__Group__0__Impl : ( () ) ;
    public final void rule__InTypeConstraintRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2225:1: ( ( () ) )
            // InternalDsl.g:2226:1: ( () )
            {
            // InternalDsl.g:2226:1: ( () )
            // InternalDsl.g:2227:2: ()
            {
             before(grammarAccess.getInTypeConstraintRuleAccess().getInTypeAction_0()); 
            // InternalDsl.g:2228:2: ()
            // InternalDsl.g:2228:3: 
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
    // InternalDsl.g:2236:1: rule__InTypeConstraintRule__Group__1 : rule__InTypeConstraintRule__Group__1__Impl rule__InTypeConstraintRule__Group__2 ;
    public final void rule__InTypeConstraintRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2240:1: ( rule__InTypeConstraintRule__Group__1__Impl rule__InTypeConstraintRule__Group__2 )
            // InternalDsl.g:2241:2: rule__InTypeConstraintRule__Group__1__Impl rule__InTypeConstraintRule__Group__2
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
    // InternalDsl.g:2248:1: rule__InTypeConstraintRule__Group__1__Impl : ( 'InType' ) ;
    public final void rule__InTypeConstraintRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2252:1: ( ( 'InType' ) )
            // InternalDsl.g:2253:1: ( 'InType' )
            {
            // InternalDsl.g:2253:1: ( 'InType' )
            // InternalDsl.g:2254:2: 'InType'
            {
             before(grammarAccess.getInTypeConstraintRuleAccess().getInTypeKeyword_1()); 
            match(input,85,FOLLOW_2); 
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
    // InternalDsl.g:2263:1: rule__InTypeConstraintRule__Group__2 : rule__InTypeConstraintRule__Group__2__Impl rule__InTypeConstraintRule__Group__3 ;
    public final void rule__InTypeConstraintRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2267:1: ( rule__InTypeConstraintRule__Group__2__Impl rule__InTypeConstraintRule__Group__3 )
            // InternalDsl.g:2268:2: rule__InTypeConstraintRule__Group__2__Impl rule__InTypeConstraintRule__Group__3
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
    // InternalDsl.g:2275:1: rule__InTypeConstraintRule__Group__2__Impl : ( '(' ) ;
    public final void rule__InTypeConstraintRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2279:1: ( ( '(' ) )
            // InternalDsl.g:2280:1: ( '(' )
            {
            // InternalDsl.g:2280:1: ( '(' )
            // InternalDsl.g:2281:2: '('
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
    // InternalDsl.g:2290:1: rule__InTypeConstraintRule__Group__3 : rule__InTypeConstraintRule__Group__3__Impl rule__InTypeConstraintRule__Group__4 ;
    public final void rule__InTypeConstraintRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2294:1: ( rule__InTypeConstraintRule__Group__3__Impl rule__InTypeConstraintRule__Group__4 )
            // InternalDsl.g:2295:2: rule__InTypeConstraintRule__Group__3__Impl rule__InTypeConstraintRule__Group__4
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
    // InternalDsl.g:2302:1: rule__InTypeConstraintRule__Group__3__Impl : ( ( rule__InTypeConstraintRule__TypeAssignment_3 ) ) ;
    public final void rule__InTypeConstraintRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2306:1: ( ( ( rule__InTypeConstraintRule__TypeAssignment_3 ) ) )
            // InternalDsl.g:2307:1: ( ( rule__InTypeConstraintRule__TypeAssignment_3 ) )
            {
            // InternalDsl.g:2307:1: ( ( rule__InTypeConstraintRule__TypeAssignment_3 ) )
            // InternalDsl.g:2308:2: ( rule__InTypeConstraintRule__TypeAssignment_3 )
            {
             before(grammarAccess.getInTypeConstraintRuleAccess().getTypeAssignment_3()); 
            // InternalDsl.g:2309:2: ( rule__InTypeConstraintRule__TypeAssignment_3 )
            // InternalDsl.g:2309:3: rule__InTypeConstraintRule__TypeAssignment_3
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
    // InternalDsl.g:2317:1: rule__InTypeConstraintRule__Group__4 : rule__InTypeConstraintRule__Group__4__Impl ;
    public final void rule__InTypeConstraintRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2321:1: ( rule__InTypeConstraintRule__Group__4__Impl )
            // InternalDsl.g:2322:2: rule__InTypeConstraintRule__Group__4__Impl
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
    // InternalDsl.g:2328:1: rule__InTypeConstraintRule__Group__4__Impl : ( ')' ) ;
    public final void rule__InTypeConstraintRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2332:1: ( ( ')' ) )
            // InternalDsl.g:2333:1: ( ')' )
            {
            // InternalDsl.g:2333:1: ( ')' )
            // InternalDsl.g:2334:2: ')'
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
    // InternalDsl.g:2344:1: rule__SourceEqualsTargetConstraintRule__Group__0 : rule__SourceEqualsTargetConstraintRule__Group__0__Impl rule__SourceEqualsTargetConstraintRule__Group__1 ;
    public final void rule__SourceEqualsTargetConstraintRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2348:1: ( rule__SourceEqualsTargetConstraintRule__Group__0__Impl rule__SourceEqualsTargetConstraintRule__Group__1 )
            // InternalDsl.g:2349:2: rule__SourceEqualsTargetConstraintRule__Group__0__Impl rule__SourceEqualsTargetConstraintRule__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalDsl.g:2356:1: rule__SourceEqualsTargetConstraintRule__Group__0__Impl : ( () ) ;
    public final void rule__SourceEqualsTargetConstraintRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2360:1: ( ( () ) )
            // InternalDsl.g:2361:1: ( () )
            {
            // InternalDsl.g:2361:1: ( () )
            // InternalDsl.g:2362:2: ()
            {
             before(grammarAccess.getSourceEqualsTargetConstraintRuleAccess().getSourceEqualsTargetAction_0()); 
            // InternalDsl.g:2363:2: ()
            // InternalDsl.g:2363:3: 
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
    // InternalDsl.g:2371:1: rule__SourceEqualsTargetConstraintRule__Group__1 : rule__SourceEqualsTargetConstraintRule__Group__1__Impl rule__SourceEqualsTargetConstraintRule__Group__2 ;
    public final void rule__SourceEqualsTargetConstraintRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2375:1: ( rule__SourceEqualsTargetConstraintRule__Group__1__Impl rule__SourceEqualsTargetConstraintRule__Group__2 )
            // InternalDsl.g:2376:2: rule__SourceEqualsTargetConstraintRule__Group__1__Impl rule__SourceEqualsTargetConstraintRule__Group__2
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
    // InternalDsl.g:2383:1: rule__SourceEqualsTargetConstraintRule__Group__1__Impl : ( 'SourceEqualsTarget' ) ;
    public final void rule__SourceEqualsTargetConstraintRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2387:1: ( ( 'SourceEqualsTarget' ) )
            // InternalDsl.g:2388:1: ( 'SourceEqualsTarget' )
            {
            // InternalDsl.g:2388:1: ( 'SourceEqualsTarget' )
            // InternalDsl.g:2389:2: 'SourceEqualsTarget'
            {
             before(grammarAccess.getSourceEqualsTargetConstraintRuleAccess().getSourceEqualsTargetKeyword_1()); 
            match(input,86,FOLLOW_2); 
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
    // InternalDsl.g:2398:1: rule__SourceEqualsTargetConstraintRule__Group__2 : rule__SourceEqualsTargetConstraintRule__Group__2__Impl rule__SourceEqualsTargetConstraintRule__Group__3 ;
    public final void rule__SourceEqualsTargetConstraintRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2402:1: ( rule__SourceEqualsTargetConstraintRule__Group__2__Impl rule__SourceEqualsTargetConstraintRule__Group__3 )
            // InternalDsl.g:2403:2: rule__SourceEqualsTargetConstraintRule__Group__2__Impl rule__SourceEqualsTargetConstraintRule__Group__3
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
    // InternalDsl.g:2410:1: rule__SourceEqualsTargetConstraintRule__Group__2__Impl : ( '(' ) ;
    public final void rule__SourceEqualsTargetConstraintRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2414:1: ( ( '(' ) )
            // InternalDsl.g:2415:1: ( '(' )
            {
            // InternalDsl.g:2415:1: ( '(' )
            // InternalDsl.g:2416:2: '('
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
    // InternalDsl.g:2425:1: rule__SourceEqualsTargetConstraintRule__Group__3 : rule__SourceEqualsTargetConstraintRule__Group__3__Impl ;
    public final void rule__SourceEqualsTargetConstraintRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2429:1: ( rule__SourceEqualsTargetConstraintRule__Group__3__Impl )
            // InternalDsl.g:2430:2: rule__SourceEqualsTargetConstraintRule__Group__3__Impl
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
    // InternalDsl.g:2436:1: rule__SourceEqualsTargetConstraintRule__Group__3__Impl : ( ')' ) ;
    public final void rule__SourceEqualsTargetConstraintRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2440:1: ( ( ')' ) )
            // InternalDsl.g:2441:1: ( ')' )
            {
            // InternalDsl.g:2441:1: ( ')' )
            // InternalDsl.g:2442:2: ')'
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
    // InternalDsl.g:2452:1: rule__SourceEqualsTargetTypeConstraintRule__Group__0 : rule__SourceEqualsTargetTypeConstraintRule__Group__0__Impl rule__SourceEqualsTargetTypeConstraintRule__Group__1 ;
    public final void rule__SourceEqualsTargetTypeConstraintRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2456:1: ( rule__SourceEqualsTargetTypeConstraintRule__Group__0__Impl rule__SourceEqualsTargetTypeConstraintRule__Group__1 )
            // InternalDsl.g:2457:2: rule__SourceEqualsTargetTypeConstraintRule__Group__0__Impl rule__SourceEqualsTargetTypeConstraintRule__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalDsl.g:2464:1: rule__SourceEqualsTargetTypeConstraintRule__Group__0__Impl : ( () ) ;
    public final void rule__SourceEqualsTargetTypeConstraintRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2468:1: ( ( () ) )
            // InternalDsl.g:2469:1: ( () )
            {
            // InternalDsl.g:2469:1: ( () )
            // InternalDsl.g:2470:2: ()
            {
             before(grammarAccess.getSourceEqualsTargetTypeConstraintRuleAccess().getSourceEqualsTargetTypeAction_0()); 
            // InternalDsl.g:2471:2: ()
            // InternalDsl.g:2471:3: 
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
    // InternalDsl.g:2479:1: rule__SourceEqualsTargetTypeConstraintRule__Group__1 : rule__SourceEqualsTargetTypeConstraintRule__Group__1__Impl rule__SourceEqualsTargetTypeConstraintRule__Group__2 ;
    public final void rule__SourceEqualsTargetTypeConstraintRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2483:1: ( rule__SourceEqualsTargetTypeConstraintRule__Group__1__Impl rule__SourceEqualsTargetTypeConstraintRule__Group__2 )
            // InternalDsl.g:2484:2: rule__SourceEqualsTargetTypeConstraintRule__Group__1__Impl rule__SourceEqualsTargetTypeConstraintRule__Group__2
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
    // InternalDsl.g:2491:1: rule__SourceEqualsTargetTypeConstraintRule__Group__1__Impl : ( 'SourceEqualsTargetType' ) ;
    public final void rule__SourceEqualsTargetTypeConstraintRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2495:1: ( ( 'SourceEqualsTargetType' ) )
            // InternalDsl.g:2496:1: ( 'SourceEqualsTargetType' )
            {
            // InternalDsl.g:2496:1: ( 'SourceEqualsTargetType' )
            // InternalDsl.g:2497:2: 'SourceEqualsTargetType'
            {
             before(grammarAccess.getSourceEqualsTargetTypeConstraintRuleAccess().getSourceEqualsTargetTypeKeyword_1()); 
            match(input,87,FOLLOW_2); 
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
    // InternalDsl.g:2506:1: rule__SourceEqualsTargetTypeConstraintRule__Group__2 : rule__SourceEqualsTargetTypeConstraintRule__Group__2__Impl rule__SourceEqualsTargetTypeConstraintRule__Group__3 ;
    public final void rule__SourceEqualsTargetTypeConstraintRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2510:1: ( rule__SourceEqualsTargetTypeConstraintRule__Group__2__Impl rule__SourceEqualsTargetTypeConstraintRule__Group__3 )
            // InternalDsl.g:2511:2: rule__SourceEqualsTargetTypeConstraintRule__Group__2__Impl rule__SourceEqualsTargetTypeConstraintRule__Group__3
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
    // InternalDsl.g:2518:1: rule__SourceEqualsTargetTypeConstraintRule__Group__2__Impl : ( '(' ) ;
    public final void rule__SourceEqualsTargetTypeConstraintRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2522:1: ( ( '(' ) )
            // InternalDsl.g:2523:1: ( '(' )
            {
            // InternalDsl.g:2523:1: ( '(' )
            // InternalDsl.g:2524:2: '('
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
    // InternalDsl.g:2533:1: rule__SourceEqualsTargetTypeConstraintRule__Group__3 : rule__SourceEqualsTargetTypeConstraintRule__Group__3__Impl ;
    public final void rule__SourceEqualsTargetTypeConstraintRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2537:1: ( rule__SourceEqualsTargetTypeConstraintRule__Group__3__Impl )
            // InternalDsl.g:2538:2: rule__SourceEqualsTargetTypeConstraintRule__Group__3__Impl
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
    // InternalDsl.g:2544:1: rule__SourceEqualsTargetTypeConstraintRule__Group__3__Impl : ( ')' ) ;
    public final void rule__SourceEqualsTargetTypeConstraintRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2548:1: ( ( ')' ) )
            // InternalDsl.g:2549:1: ( ')' )
            {
            // InternalDsl.g:2549:1: ( ')' )
            // InternalDsl.g:2550:2: ')'
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
    // InternalDsl.g:2560:1: rule__IsFeature__Group__0 : rule__IsFeature__Group__0__Impl rule__IsFeature__Group__1 ;
    public final void rule__IsFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2564:1: ( rule__IsFeature__Group__0__Impl rule__IsFeature__Group__1 )
            // InternalDsl.g:2565:2: rule__IsFeature__Group__0__Impl rule__IsFeature__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:2572:1: rule__IsFeature__Group__0__Impl : ( () ) ;
    public final void rule__IsFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2576:1: ( ( () ) )
            // InternalDsl.g:2577:1: ( () )
            {
            // InternalDsl.g:2577:1: ( () )
            // InternalDsl.g:2578:2: ()
            {
             before(grammarAccess.getIsFeatureAccess().getIsFeatureAction_0()); 
            // InternalDsl.g:2579:2: ()
            // InternalDsl.g:2579:3: 
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
    // InternalDsl.g:2587:1: rule__IsFeature__Group__1 : rule__IsFeature__Group__1__Impl ;
    public final void rule__IsFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2591:1: ( rule__IsFeature__Group__1__Impl )
            // InternalDsl.g:2592:2: rule__IsFeature__Group__1__Impl
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
    // InternalDsl.g:2598:1: rule__IsFeature__Group__1__Impl : ( ( rule__IsFeature__FeatureNameAssignment_1 ) ) ;
    public final void rule__IsFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2602:1: ( ( ( rule__IsFeature__FeatureNameAssignment_1 ) ) )
            // InternalDsl.g:2603:1: ( ( rule__IsFeature__FeatureNameAssignment_1 ) )
            {
            // InternalDsl.g:2603:1: ( ( rule__IsFeature__FeatureNameAssignment_1 ) )
            // InternalDsl.g:2604:2: ( rule__IsFeature__FeatureNameAssignment_1 )
            {
             before(grammarAccess.getIsFeatureAccess().getFeatureNameAssignment_1()); 
            // InternalDsl.g:2605:2: ( rule__IsFeature__FeatureNameAssignment_1 )
            // InternalDsl.g:2605:3: rule__IsFeature__FeatureNameAssignment_1
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
    // InternalDsl.g:2614:1: rule__TrueFeatureRule__Group__0 : rule__TrueFeatureRule__Group__0__Impl rule__TrueFeatureRule__Group__1 ;
    public final void rule__TrueFeatureRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2618:1: ( rule__TrueFeatureRule__Group__0__Impl rule__TrueFeatureRule__Group__1 )
            // InternalDsl.g:2619:2: rule__TrueFeatureRule__Group__0__Impl rule__TrueFeatureRule__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalDsl.g:2626:1: rule__TrueFeatureRule__Group__0__Impl : ( () ) ;
    public final void rule__TrueFeatureRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2630:1: ( ( () ) )
            // InternalDsl.g:2631:1: ( () )
            {
            // InternalDsl.g:2631:1: ( () )
            // InternalDsl.g:2632:2: ()
            {
             before(grammarAccess.getTrueFeatureRuleAccess().getTrueFeatureRuleAction_0()); 
            // InternalDsl.g:2633:2: ()
            // InternalDsl.g:2633:3: 
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
    // InternalDsl.g:2641:1: rule__TrueFeatureRule__Group__1 : rule__TrueFeatureRule__Group__1__Impl ;
    public final void rule__TrueFeatureRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2645:1: ( rule__TrueFeatureRule__Group__1__Impl )
            // InternalDsl.g:2646:2: rule__TrueFeatureRule__Group__1__Impl
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
    // InternalDsl.g:2652:1: rule__TrueFeatureRule__Group__1__Impl : ( 'true' ) ;
    public final void rule__TrueFeatureRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2656:1: ( ( 'true' ) )
            // InternalDsl.g:2657:1: ( 'true' )
            {
            // InternalDsl.g:2657:1: ( 'true' )
            // InternalDsl.g:2658:2: 'true'
            {
             before(grammarAccess.getTrueFeatureRuleAccess().getTrueKeyword_1()); 
            match(input,88,FOLLOW_2); 
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
    // InternalDsl.g:2668:1: rule__TrueConstraintRule__Group__0 : rule__TrueConstraintRule__Group__0__Impl rule__TrueConstraintRule__Group__1 ;
    public final void rule__TrueConstraintRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2672:1: ( rule__TrueConstraintRule__Group__0__Impl rule__TrueConstraintRule__Group__1 )
            // InternalDsl.g:2673:2: rule__TrueConstraintRule__Group__0__Impl rule__TrueConstraintRule__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalDsl.g:2680:1: rule__TrueConstraintRule__Group__0__Impl : ( () ) ;
    public final void rule__TrueConstraintRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2684:1: ( ( () ) )
            // InternalDsl.g:2685:1: ( () )
            {
            // InternalDsl.g:2685:1: ( () )
            // InternalDsl.g:2686:2: ()
            {
             before(grammarAccess.getTrueConstraintRuleAccess().getTrueConstraintRuleAction_0()); 
            // InternalDsl.g:2687:2: ()
            // InternalDsl.g:2687:3: 
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
    // InternalDsl.g:2695:1: rule__TrueConstraintRule__Group__1 : rule__TrueConstraintRule__Group__1__Impl ;
    public final void rule__TrueConstraintRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2699:1: ( rule__TrueConstraintRule__Group__1__Impl )
            // InternalDsl.g:2700:2: rule__TrueConstraintRule__Group__1__Impl
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
    // InternalDsl.g:2706:1: rule__TrueConstraintRule__Group__1__Impl : ( 'true' ) ;
    public final void rule__TrueConstraintRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2710:1: ( ( 'true' ) )
            // InternalDsl.g:2711:1: ( 'true' )
            {
            // InternalDsl.g:2711:1: ( 'true' )
            // InternalDsl.g:2712:2: 'true'
            {
             before(grammarAccess.getTrueConstraintRuleAccess().getTrueKeyword_1()); 
            match(input,88,FOLLOW_2); 
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
    // InternalDsl.g:2722:1: rule__FalseFeatureRule__Group__0 : rule__FalseFeatureRule__Group__0__Impl rule__FalseFeatureRule__Group__1 ;
    public final void rule__FalseFeatureRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2726:1: ( rule__FalseFeatureRule__Group__0__Impl rule__FalseFeatureRule__Group__1 )
            // InternalDsl.g:2727:2: rule__FalseFeatureRule__Group__0__Impl rule__FalseFeatureRule__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalDsl.g:2734:1: rule__FalseFeatureRule__Group__0__Impl : ( () ) ;
    public final void rule__FalseFeatureRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2738:1: ( ( () ) )
            // InternalDsl.g:2739:1: ( () )
            {
            // InternalDsl.g:2739:1: ( () )
            // InternalDsl.g:2740:2: ()
            {
             before(grammarAccess.getFalseFeatureRuleAccess().getFalseFeatureRuleAction_0()); 
            // InternalDsl.g:2741:2: ()
            // InternalDsl.g:2741:3: 
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
    // InternalDsl.g:2749:1: rule__FalseFeatureRule__Group__1 : rule__FalseFeatureRule__Group__1__Impl ;
    public final void rule__FalseFeatureRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2753:1: ( rule__FalseFeatureRule__Group__1__Impl )
            // InternalDsl.g:2754:2: rule__FalseFeatureRule__Group__1__Impl
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
    // InternalDsl.g:2760:1: rule__FalseFeatureRule__Group__1__Impl : ( 'false' ) ;
    public final void rule__FalseFeatureRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2764:1: ( ( 'false' ) )
            // InternalDsl.g:2765:1: ( 'false' )
            {
            // InternalDsl.g:2765:1: ( 'false' )
            // InternalDsl.g:2766:2: 'false'
            {
             before(grammarAccess.getFalseFeatureRuleAccess().getFalseKeyword_1()); 
            match(input,89,FOLLOW_2); 
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
    // InternalDsl.g:2776:1: rule__FalseConstraintRule__Group__0 : rule__FalseConstraintRule__Group__0__Impl rule__FalseConstraintRule__Group__1 ;
    public final void rule__FalseConstraintRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2780:1: ( rule__FalseConstraintRule__Group__0__Impl rule__FalseConstraintRule__Group__1 )
            // InternalDsl.g:2781:2: rule__FalseConstraintRule__Group__0__Impl rule__FalseConstraintRule__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalDsl.g:2788:1: rule__FalseConstraintRule__Group__0__Impl : ( () ) ;
    public final void rule__FalseConstraintRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2792:1: ( ( () ) )
            // InternalDsl.g:2793:1: ( () )
            {
            // InternalDsl.g:2793:1: ( () )
            // InternalDsl.g:2794:2: ()
            {
             before(grammarAccess.getFalseConstraintRuleAccess().getFalseConstraintRuleAction_0()); 
            // InternalDsl.g:2795:2: ()
            // InternalDsl.g:2795:3: 
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
    // InternalDsl.g:2803:1: rule__FalseConstraintRule__Group__1 : rule__FalseConstraintRule__Group__1__Impl ;
    public final void rule__FalseConstraintRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2807:1: ( rule__FalseConstraintRule__Group__1__Impl )
            // InternalDsl.g:2808:2: rule__FalseConstraintRule__Group__1__Impl
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
    // InternalDsl.g:2814:1: rule__FalseConstraintRule__Group__1__Impl : ( 'false' ) ;
    public final void rule__FalseConstraintRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2818:1: ( ( 'false' ) )
            // InternalDsl.g:2819:1: ( 'false' )
            {
            // InternalDsl.g:2819:1: ( 'false' )
            // InternalDsl.g:2820:2: 'false'
            {
             before(grammarAccess.getFalseConstraintRuleAccess().getFalseKeyword_1()); 
            match(input,89,FOLLOW_2); 
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
    // InternalDsl.g:2830:1: rule__OrFeature__Group__0 : rule__OrFeature__Group__0__Impl rule__OrFeature__Group__1 ;
    public final void rule__OrFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2834:1: ( rule__OrFeature__Group__0__Impl rule__OrFeature__Group__1 )
            // InternalDsl.g:2835:2: rule__OrFeature__Group__0__Impl rule__OrFeature__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalDsl.g:2842:1: rule__OrFeature__Group__0__Impl : ( ruleAndFeature ) ;
    public final void rule__OrFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2846:1: ( ( ruleAndFeature ) )
            // InternalDsl.g:2847:1: ( ruleAndFeature )
            {
            // InternalDsl.g:2847:1: ( ruleAndFeature )
            // InternalDsl.g:2848:2: ruleAndFeature
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
    // InternalDsl.g:2857:1: rule__OrFeature__Group__1 : rule__OrFeature__Group__1__Impl ;
    public final void rule__OrFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2861:1: ( rule__OrFeature__Group__1__Impl )
            // InternalDsl.g:2862:2: rule__OrFeature__Group__1__Impl
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
    // InternalDsl.g:2868:1: rule__OrFeature__Group__1__Impl : ( ( rule__OrFeature__Group_1__0 )* ) ;
    public final void rule__OrFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2872:1: ( ( ( rule__OrFeature__Group_1__0 )* ) )
            // InternalDsl.g:2873:1: ( ( rule__OrFeature__Group_1__0 )* )
            {
            // InternalDsl.g:2873:1: ( ( rule__OrFeature__Group_1__0 )* )
            // InternalDsl.g:2874:2: ( rule__OrFeature__Group_1__0 )*
            {
             before(grammarAccess.getOrFeatureAccess().getGroup_1()); 
            // InternalDsl.g:2875:2: ( rule__OrFeature__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==90) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:2875:3: rule__OrFeature__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
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
    // InternalDsl.g:2884:1: rule__OrFeature__Group_1__0 : rule__OrFeature__Group_1__0__Impl rule__OrFeature__Group_1__1 ;
    public final void rule__OrFeature__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2888:1: ( rule__OrFeature__Group_1__0__Impl rule__OrFeature__Group_1__1 )
            // InternalDsl.g:2889:2: rule__OrFeature__Group_1__0__Impl rule__OrFeature__Group_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalDsl.g:2896:1: rule__OrFeature__Group_1__0__Impl : ( () ) ;
    public final void rule__OrFeature__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2900:1: ( ( () ) )
            // InternalDsl.g:2901:1: ( () )
            {
            // InternalDsl.g:2901:1: ( () )
            // InternalDsl.g:2902:2: ()
            {
             before(grammarAccess.getOrFeatureAccess().getOrFeatureRuleRulesAction_1_0()); 
            // InternalDsl.g:2903:2: ()
            // InternalDsl.g:2903:3: 
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
    // InternalDsl.g:2911:1: rule__OrFeature__Group_1__1 : rule__OrFeature__Group_1__1__Impl rule__OrFeature__Group_1__2 ;
    public final void rule__OrFeature__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2915:1: ( rule__OrFeature__Group_1__1__Impl rule__OrFeature__Group_1__2 )
            // InternalDsl.g:2916:2: rule__OrFeature__Group_1__1__Impl rule__OrFeature__Group_1__2
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
    // InternalDsl.g:2923:1: rule__OrFeature__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__OrFeature__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2927:1: ( ( 'or' ) )
            // InternalDsl.g:2928:1: ( 'or' )
            {
            // InternalDsl.g:2928:1: ( 'or' )
            // InternalDsl.g:2929:2: 'or'
            {
             before(grammarAccess.getOrFeatureAccess().getOrKeyword_1_1()); 
            match(input,90,FOLLOW_2); 
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
    // InternalDsl.g:2938:1: rule__OrFeature__Group_1__2 : rule__OrFeature__Group_1__2__Impl ;
    public final void rule__OrFeature__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2942:1: ( rule__OrFeature__Group_1__2__Impl )
            // InternalDsl.g:2943:2: rule__OrFeature__Group_1__2__Impl
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
    // InternalDsl.g:2949:1: rule__OrFeature__Group_1__2__Impl : ( ( rule__OrFeature__RulesAssignment_1_2 ) ) ;
    public final void rule__OrFeature__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2953:1: ( ( ( rule__OrFeature__RulesAssignment_1_2 ) ) )
            // InternalDsl.g:2954:1: ( ( rule__OrFeature__RulesAssignment_1_2 ) )
            {
            // InternalDsl.g:2954:1: ( ( rule__OrFeature__RulesAssignment_1_2 ) )
            // InternalDsl.g:2955:2: ( rule__OrFeature__RulesAssignment_1_2 )
            {
             before(grammarAccess.getOrFeatureAccess().getRulesAssignment_1_2()); 
            // InternalDsl.g:2956:2: ( rule__OrFeature__RulesAssignment_1_2 )
            // InternalDsl.g:2956:3: rule__OrFeature__RulesAssignment_1_2
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
    // InternalDsl.g:2965:1: rule__AndFeature__Group__0 : rule__AndFeature__Group__0__Impl rule__AndFeature__Group__1 ;
    public final void rule__AndFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2969:1: ( rule__AndFeature__Group__0__Impl rule__AndFeature__Group__1 )
            // InternalDsl.g:2970:2: rule__AndFeature__Group__0__Impl rule__AndFeature__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalDsl.g:2977:1: rule__AndFeature__Group__0__Impl : ( ruleNotFeatureExpression ) ;
    public final void rule__AndFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2981:1: ( ( ruleNotFeatureExpression ) )
            // InternalDsl.g:2982:1: ( ruleNotFeatureExpression )
            {
            // InternalDsl.g:2982:1: ( ruleNotFeatureExpression )
            // InternalDsl.g:2983:2: ruleNotFeatureExpression
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
    // InternalDsl.g:2992:1: rule__AndFeature__Group__1 : rule__AndFeature__Group__1__Impl ;
    public final void rule__AndFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2996:1: ( rule__AndFeature__Group__1__Impl )
            // InternalDsl.g:2997:2: rule__AndFeature__Group__1__Impl
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
    // InternalDsl.g:3003:1: rule__AndFeature__Group__1__Impl : ( ( rule__AndFeature__Group_1__0 )* ) ;
    public final void rule__AndFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3007:1: ( ( ( rule__AndFeature__Group_1__0 )* ) )
            // InternalDsl.g:3008:1: ( ( rule__AndFeature__Group_1__0 )* )
            {
            // InternalDsl.g:3008:1: ( ( rule__AndFeature__Group_1__0 )* )
            // InternalDsl.g:3009:2: ( rule__AndFeature__Group_1__0 )*
            {
             before(grammarAccess.getAndFeatureAccess().getGroup_1()); 
            // InternalDsl.g:3010:2: ( rule__AndFeature__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==91) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:3010:3: rule__AndFeature__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
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
    // InternalDsl.g:3019:1: rule__AndFeature__Group_1__0 : rule__AndFeature__Group_1__0__Impl rule__AndFeature__Group_1__1 ;
    public final void rule__AndFeature__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3023:1: ( rule__AndFeature__Group_1__0__Impl rule__AndFeature__Group_1__1 )
            // InternalDsl.g:3024:2: rule__AndFeature__Group_1__0__Impl rule__AndFeature__Group_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalDsl.g:3031:1: rule__AndFeature__Group_1__0__Impl : ( () ) ;
    public final void rule__AndFeature__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3035:1: ( ( () ) )
            // InternalDsl.g:3036:1: ( () )
            {
            // InternalDsl.g:3036:1: ( () )
            // InternalDsl.g:3037:2: ()
            {
             before(grammarAccess.getAndFeatureAccess().getAndFeatureRuleRulesAction_1_0()); 
            // InternalDsl.g:3038:2: ()
            // InternalDsl.g:3038:3: 
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
    // InternalDsl.g:3046:1: rule__AndFeature__Group_1__1 : rule__AndFeature__Group_1__1__Impl rule__AndFeature__Group_1__2 ;
    public final void rule__AndFeature__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3050:1: ( rule__AndFeature__Group_1__1__Impl rule__AndFeature__Group_1__2 )
            // InternalDsl.g:3051:2: rule__AndFeature__Group_1__1__Impl rule__AndFeature__Group_1__2
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
    // InternalDsl.g:3058:1: rule__AndFeature__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__AndFeature__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3062:1: ( ( 'and' ) )
            // InternalDsl.g:3063:1: ( 'and' )
            {
            // InternalDsl.g:3063:1: ( 'and' )
            // InternalDsl.g:3064:2: 'and'
            {
             before(grammarAccess.getAndFeatureAccess().getAndKeyword_1_1()); 
            match(input,91,FOLLOW_2); 
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
    // InternalDsl.g:3073:1: rule__AndFeature__Group_1__2 : rule__AndFeature__Group_1__2__Impl ;
    public final void rule__AndFeature__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3077:1: ( rule__AndFeature__Group_1__2__Impl )
            // InternalDsl.g:3078:2: rule__AndFeature__Group_1__2__Impl
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
    // InternalDsl.g:3084:1: rule__AndFeature__Group_1__2__Impl : ( ( rule__AndFeature__RulesAssignment_1_2 ) ) ;
    public final void rule__AndFeature__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3088:1: ( ( ( rule__AndFeature__RulesAssignment_1_2 ) ) )
            // InternalDsl.g:3089:1: ( ( rule__AndFeature__RulesAssignment_1_2 ) )
            {
            // InternalDsl.g:3089:1: ( ( rule__AndFeature__RulesAssignment_1_2 ) )
            // InternalDsl.g:3090:2: ( rule__AndFeature__RulesAssignment_1_2 )
            {
             before(grammarAccess.getAndFeatureAccess().getRulesAssignment_1_2()); 
            // InternalDsl.g:3091:2: ( rule__AndFeature__RulesAssignment_1_2 )
            // InternalDsl.g:3091:3: rule__AndFeature__RulesAssignment_1_2
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
    // InternalDsl.g:3100:1: rule__NotFeatureExpression__Group_1__0 : rule__NotFeatureExpression__Group_1__0__Impl rule__NotFeatureExpression__Group_1__1 ;
    public final void rule__NotFeatureExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3104:1: ( rule__NotFeatureExpression__Group_1__0__Impl rule__NotFeatureExpression__Group_1__1 )
            // InternalDsl.g:3105:2: rule__NotFeatureExpression__Group_1__0__Impl rule__NotFeatureExpression__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:3112:1: rule__NotFeatureExpression__Group_1__0__Impl : ( '!' ) ;
    public final void rule__NotFeatureExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3116:1: ( ( '!' ) )
            // InternalDsl.g:3117:1: ( '!' )
            {
            // InternalDsl.g:3117:1: ( '!' )
            // InternalDsl.g:3118:2: '!'
            {
             before(grammarAccess.getNotFeatureExpressionAccess().getExclamationMarkKeyword_1_0()); 
            match(input,92,FOLLOW_2); 
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
    // InternalDsl.g:3127:1: rule__NotFeatureExpression__Group_1__1 : rule__NotFeatureExpression__Group_1__1__Impl rule__NotFeatureExpression__Group_1__2 ;
    public final void rule__NotFeatureExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3131:1: ( rule__NotFeatureExpression__Group_1__1__Impl rule__NotFeatureExpression__Group_1__2 )
            // InternalDsl.g:3132:2: rule__NotFeatureExpression__Group_1__1__Impl rule__NotFeatureExpression__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalDsl.g:3139:1: rule__NotFeatureExpression__Group_1__1__Impl : ( () ) ;
    public final void rule__NotFeatureExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3143:1: ( ( () ) )
            // InternalDsl.g:3144:1: ( () )
            {
            // InternalDsl.g:3144:1: ( () )
            // InternalDsl.g:3145:2: ()
            {
             before(grammarAccess.getNotFeatureExpressionAccess().getNotFeatureRuleAction_1_1()); 
            // InternalDsl.g:3146:2: ()
            // InternalDsl.g:3146:3: 
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
    // InternalDsl.g:3154:1: rule__NotFeatureExpression__Group_1__2 : rule__NotFeatureExpression__Group_1__2__Impl ;
    public final void rule__NotFeatureExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3158:1: ( rule__NotFeatureExpression__Group_1__2__Impl )
            // InternalDsl.g:3159:2: rule__NotFeatureExpression__Group_1__2__Impl
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
    // InternalDsl.g:3165:1: rule__NotFeatureExpression__Group_1__2__Impl : ( ( rule__NotFeatureExpression__RuleAssignment_1_2 ) ) ;
    public final void rule__NotFeatureExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3169:1: ( ( ( rule__NotFeatureExpression__RuleAssignment_1_2 ) ) )
            // InternalDsl.g:3170:1: ( ( rule__NotFeatureExpression__RuleAssignment_1_2 ) )
            {
            // InternalDsl.g:3170:1: ( ( rule__NotFeatureExpression__RuleAssignment_1_2 ) )
            // InternalDsl.g:3171:2: ( rule__NotFeatureExpression__RuleAssignment_1_2 )
            {
             before(grammarAccess.getNotFeatureExpressionAccess().getRuleAssignment_1_2()); 
            // InternalDsl.g:3172:2: ( rule__NotFeatureExpression__RuleAssignment_1_2 )
            // InternalDsl.g:3172:3: rule__NotFeatureExpression__RuleAssignment_1_2
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
    // InternalDsl.g:3181:1: rule__PrimaryFeature__Group_1__0 : rule__PrimaryFeature__Group_1__0__Impl rule__PrimaryFeature__Group_1__1 ;
    public final void rule__PrimaryFeature__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3185:1: ( rule__PrimaryFeature__Group_1__0__Impl rule__PrimaryFeature__Group_1__1 )
            // InternalDsl.g:3186:2: rule__PrimaryFeature__Group_1__0__Impl rule__PrimaryFeature__Group_1__1
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
    // InternalDsl.g:3193:1: rule__PrimaryFeature__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PrimaryFeature__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3197:1: ( ( '(' ) )
            // InternalDsl.g:3198:1: ( '(' )
            {
            // InternalDsl.g:3198:1: ( '(' )
            // InternalDsl.g:3199:2: '('
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
    // InternalDsl.g:3208:1: rule__PrimaryFeature__Group_1__1 : rule__PrimaryFeature__Group_1__1__Impl rule__PrimaryFeature__Group_1__2 ;
    public final void rule__PrimaryFeature__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3212:1: ( rule__PrimaryFeature__Group_1__1__Impl rule__PrimaryFeature__Group_1__2 )
            // InternalDsl.g:3213:2: rule__PrimaryFeature__Group_1__1__Impl rule__PrimaryFeature__Group_1__2
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
    // InternalDsl.g:3220:1: rule__PrimaryFeature__Group_1__1__Impl : ( ruleFeatureExpression ) ;
    public final void rule__PrimaryFeature__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3224:1: ( ( ruleFeatureExpression ) )
            // InternalDsl.g:3225:1: ( ruleFeatureExpression )
            {
            // InternalDsl.g:3225:1: ( ruleFeatureExpression )
            // InternalDsl.g:3226:2: ruleFeatureExpression
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
    // InternalDsl.g:3235:1: rule__PrimaryFeature__Group_1__2 : rule__PrimaryFeature__Group_1__2__Impl ;
    public final void rule__PrimaryFeature__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3239:1: ( rule__PrimaryFeature__Group_1__2__Impl )
            // InternalDsl.g:3240:2: rule__PrimaryFeature__Group_1__2__Impl
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
    // InternalDsl.g:3246:1: rule__PrimaryFeature__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PrimaryFeature__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3250:1: ( ( ')' ) )
            // InternalDsl.g:3251:1: ( ')' )
            {
            // InternalDsl.g:3251:1: ( ')' )
            // InternalDsl.g:3252:2: ')'
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
    // InternalDsl.g:3262:1: rule__ImplicationConstraint__Group__0 : rule__ImplicationConstraint__Group__0__Impl rule__ImplicationConstraint__Group__1 ;
    public final void rule__ImplicationConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3266:1: ( rule__ImplicationConstraint__Group__0__Impl rule__ImplicationConstraint__Group__1 )
            // InternalDsl.g:3267:2: rule__ImplicationConstraint__Group__0__Impl rule__ImplicationConstraint__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:3274:1: rule__ImplicationConstraint__Group__0__Impl : ( ruleOrConstraint ) ;
    public final void rule__ImplicationConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3278:1: ( ( ruleOrConstraint ) )
            // InternalDsl.g:3279:1: ( ruleOrConstraint )
            {
            // InternalDsl.g:3279:1: ( ruleOrConstraint )
            // InternalDsl.g:3280:2: ruleOrConstraint
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
    // InternalDsl.g:3289:1: rule__ImplicationConstraint__Group__1 : rule__ImplicationConstraint__Group__1__Impl ;
    public final void rule__ImplicationConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3293:1: ( rule__ImplicationConstraint__Group__1__Impl )
            // InternalDsl.g:3294:2: rule__ImplicationConstraint__Group__1__Impl
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
    // InternalDsl.g:3300:1: rule__ImplicationConstraint__Group__1__Impl : ( ( rule__ImplicationConstraint__Group_1__0 )? ) ;
    public final void rule__ImplicationConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3304:1: ( ( ( rule__ImplicationConstraint__Group_1__0 )? ) )
            // InternalDsl.g:3305:1: ( ( rule__ImplicationConstraint__Group_1__0 )? )
            {
            // InternalDsl.g:3305:1: ( ( rule__ImplicationConstraint__Group_1__0 )? )
            // InternalDsl.g:3306:2: ( rule__ImplicationConstraint__Group_1__0 )?
            {
             before(grammarAccess.getImplicationConstraintAccess().getGroup_1()); 
            // InternalDsl.g:3307:2: ( rule__ImplicationConstraint__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==93) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:3307:3: rule__ImplicationConstraint__Group_1__0
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
    // InternalDsl.g:3316:1: rule__ImplicationConstraint__Group_1__0 : rule__ImplicationConstraint__Group_1__0__Impl rule__ImplicationConstraint__Group_1__1 ;
    public final void rule__ImplicationConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3320:1: ( rule__ImplicationConstraint__Group_1__0__Impl rule__ImplicationConstraint__Group_1__1 )
            // InternalDsl.g:3321:2: rule__ImplicationConstraint__Group_1__0__Impl rule__ImplicationConstraint__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDsl.g:3328:1: rule__ImplicationConstraint__Group_1__0__Impl : ( () ) ;
    public final void rule__ImplicationConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3332:1: ( ( () ) )
            // InternalDsl.g:3333:1: ( () )
            {
            // InternalDsl.g:3333:1: ( () )
            // InternalDsl.g:3334:2: ()
            {
             before(grammarAccess.getImplicationConstraintAccess().getImplicationConstraintRuleLeftRuleAction_1_0()); 
            // InternalDsl.g:3335:2: ()
            // InternalDsl.g:3335:3: 
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
    // InternalDsl.g:3343:1: rule__ImplicationConstraint__Group_1__1 : rule__ImplicationConstraint__Group_1__1__Impl rule__ImplicationConstraint__Group_1__2 ;
    public final void rule__ImplicationConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3347:1: ( rule__ImplicationConstraint__Group_1__1__Impl rule__ImplicationConstraint__Group_1__2 )
            // InternalDsl.g:3348:2: rule__ImplicationConstraint__Group_1__1__Impl rule__ImplicationConstraint__Group_1__2
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
    // InternalDsl.g:3355:1: rule__ImplicationConstraint__Group_1__1__Impl : ( '=>' ) ;
    public final void rule__ImplicationConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3359:1: ( ( '=>' ) )
            // InternalDsl.g:3360:1: ( '=>' )
            {
            // InternalDsl.g:3360:1: ( '=>' )
            // InternalDsl.g:3361:2: '=>'
            {
             before(grammarAccess.getImplicationConstraintAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,93,FOLLOW_2); 
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
    // InternalDsl.g:3370:1: rule__ImplicationConstraint__Group_1__2 : rule__ImplicationConstraint__Group_1__2__Impl ;
    public final void rule__ImplicationConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3374:1: ( rule__ImplicationConstraint__Group_1__2__Impl )
            // InternalDsl.g:3375:2: rule__ImplicationConstraint__Group_1__2__Impl
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
    // InternalDsl.g:3381:1: rule__ImplicationConstraint__Group_1__2__Impl : ( ( rule__ImplicationConstraint__RightRuleAssignment_1_2 ) ) ;
    public final void rule__ImplicationConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3385:1: ( ( ( rule__ImplicationConstraint__RightRuleAssignment_1_2 ) ) )
            // InternalDsl.g:3386:1: ( ( rule__ImplicationConstraint__RightRuleAssignment_1_2 ) )
            {
            // InternalDsl.g:3386:1: ( ( rule__ImplicationConstraint__RightRuleAssignment_1_2 ) )
            // InternalDsl.g:3387:2: ( rule__ImplicationConstraint__RightRuleAssignment_1_2 )
            {
             before(grammarAccess.getImplicationConstraintAccess().getRightRuleAssignment_1_2()); 
            // InternalDsl.g:3388:2: ( rule__ImplicationConstraint__RightRuleAssignment_1_2 )
            // InternalDsl.g:3388:3: rule__ImplicationConstraint__RightRuleAssignment_1_2
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
    // InternalDsl.g:3397:1: rule__OrConstraint__Group__0 : rule__OrConstraint__Group__0__Impl rule__OrConstraint__Group__1 ;
    public final void rule__OrConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3401:1: ( rule__OrConstraint__Group__0__Impl rule__OrConstraint__Group__1 )
            // InternalDsl.g:3402:2: rule__OrConstraint__Group__0__Impl rule__OrConstraint__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalDsl.g:3409:1: rule__OrConstraint__Group__0__Impl : ( ruleAndConstraint ) ;
    public final void rule__OrConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3413:1: ( ( ruleAndConstraint ) )
            // InternalDsl.g:3414:1: ( ruleAndConstraint )
            {
            // InternalDsl.g:3414:1: ( ruleAndConstraint )
            // InternalDsl.g:3415:2: ruleAndConstraint
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
    // InternalDsl.g:3424:1: rule__OrConstraint__Group__1 : rule__OrConstraint__Group__1__Impl ;
    public final void rule__OrConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3428:1: ( rule__OrConstraint__Group__1__Impl )
            // InternalDsl.g:3429:2: rule__OrConstraint__Group__1__Impl
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
    // InternalDsl.g:3435:1: rule__OrConstraint__Group__1__Impl : ( ( rule__OrConstraint__Group_1__0 )* ) ;
    public final void rule__OrConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3439:1: ( ( ( rule__OrConstraint__Group_1__0 )* ) )
            // InternalDsl.g:3440:1: ( ( rule__OrConstraint__Group_1__0 )* )
            {
            // InternalDsl.g:3440:1: ( ( rule__OrConstraint__Group_1__0 )* )
            // InternalDsl.g:3441:2: ( rule__OrConstraint__Group_1__0 )*
            {
             before(grammarAccess.getOrConstraintAccess().getGroup_1()); 
            // InternalDsl.g:3442:2: ( rule__OrConstraint__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==90) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:3442:3: rule__OrConstraint__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
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
    // InternalDsl.g:3451:1: rule__OrConstraint__Group_1__0 : rule__OrConstraint__Group_1__0__Impl rule__OrConstraint__Group_1__1 ;
    public final void rule__OrConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3455:1: ( rule__OrConstraint__Group_1__0__Impl rule__OrConstraint__Group_1__1 )
            // InternalDsl.g:3456:2: rule__OrConstraint__Group_1__0__Impl rule__OrConstraint__Group_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalDsl.g:3463:1: rule__OrConstraint__Group_1__0__Impl : ( () ) ;
    public final void rule__OrConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3467:1: ( ( () ) )
            // InternalDsl.g:3468:1: ( () )
            {
            // InternalDsl.g:3468:1: ( () )
            // InternalDsl.g:3469:2: ()
            {
             before(grammarAccess.getOrConstraintAccess().getOrConstraintRuleRulesAction_1_0()); 
            // InternalDsl.g:3470:2: ()
            // InternalDsl.g:3470:3: 
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
    // InternalDsl.g:3478:1: rule__OrConstraint__Group_1__1 : rule__OrConstraint__Group_1__1__Impl rule__OrConstraint__Group_1__2 ;
    public final void rule__OrConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3482:1: ( rule__OrConstraint__Group_1__1__Impl rule__OrConstraint__Group_1__2 )
            // InternalDsl.g:3483:2: rule__OrConstraint__Group_1__1__Impl rule__OrConstraint__Group_1__2
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
    // InternalDsl.g:3490:1: rule__OrConstraint__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__OrConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3494:1: ( ( 'or' ) )
            // InternalDsl.g:3495:1: ( 'or' )
            {
            // InternalDsl.g:3495:1: ( 'or' )
            // InternalDsl.g:3496:2: 'or'
            {
             before(grammarAccess.getOrConstraintAccess().getOrKeyword_1_1()); 
            match(input,90,FOLLOW_2); 
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
    // InternalDsl.g:3505:1: rule__OrConstraint__Group_1__2 : rule__OrConstraint__Group_1__2__Impl ;
    public final void rule__OrConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3509:1: ( rule__OrConstraint__Group_1__2__Impl )
            // InternalDsl.g:3510:2: rule__OrConstraint__Group_1__2__Impl
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
    // InternalDsl.g:3516:1: rule__OrConstraint__Group_1__2__Impl : ( ( rule__OrConstraint__RulesAssignment_1_2 ) ) ;
    public final void rule__OrConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3520:1: ( ( ( rule__OrConstraint__RulesAssignment_1_2 ) ) )
            // InternalDsl.g:3521:1: ( ( rule__OrConstraint__RulesAssignment_1_2 ) )
            {
            // InternalDsl.g:3521:1: ( ( rule__OrConstraint__RulesAssignment_1_2 ) )
            // InternalDsl.g:3522:2: ( rule__OrConstraint__RulesAssignment_1_2 )
            {
             before(grammarAccess.getOrConstraintAccess().getRulesAssignment_1_2()); 
            // InternalDsl.g:3523:2: ( rule__OrConstraint__RulesAssignment_1_2 )
            // InternalDsl.g:3523:3: rule__OrConstraint__RulesAssignment_1_2
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
    // InternalDsl.g:3532:1: rule__AndConstraint__Group__0 : rule__AndConstraint__Group__0__Impl rule__AndConstraint__Group__1 ;
    public final void rule__AndConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3536:1: ( rule__AndConstraint__Group__0__Impl rule__AndConstraint__Group__1 )
            // InternalDsl.g:3537:2: rule__AndConstraint__Group__0__Impl rule__AndConstraint__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalDsl.g:3544:1: rule__AndConstraint__Group__0__Impl : ( ruleNotConstraintExpression ) ;
    public final void rule__AndConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3548:1: ( ( ruleNotConstraintExpression ) )
            // InternalDsl.g:3549:1: ( ruleNotConstraintExpression )
            {
            // InternalDsl.g:3549:1: ( ruleNotConstraintExpression )
            // InternalDsl.g:3550:2: ruleNotConstraintExpression
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
    // InternalDsl.g:3559:1: rule__AndConstraint__Group__1 : rule__AndConstraint__Group__1__Impl ;
    public final void rule__AndConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3563:1: ( rule__AndConstraint__Group__1__Impl )
            // InternalDsl.g:3564:2: rule__AndConstraint__Group__1__Impl
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
    // InternalDsl.g:3570:1: rule__AndConstraint__Group__1__Impl : ( ( rule__AndConstraint__Group_1__0 )* ) ;
    public final void rule__AndConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3574:1: ( ( ( rule__AndConstraint__Group_1__0 )* ) )
            // InternalDsl.g:3575:1: ( ( rule__AndConstraint__Group_1__0 )* )
            {
            // InternalDsl.g:3575:1: ( ( rule__AndConstraint__Group_1__0 )* )
            // InternalDsl.g:3576:2: ( rule__AndConstraint__Group_1__0 )*
            {
             before(grammarAccess.getAndConstraintAccess().getGroup_1()); 
            // InternalDsl.g:3577:2: ( rule__AndConstraint__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==91) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:3577:3: rule__AndConstraint__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
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
    // InternalDsl.g:3586:1: rule__AndConstraint__Group_1__0 : rule__AndConstraint__Group_1__0__Impl rule__AndConstraint__Group_1__1 ;
    public final void rule__AndConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3590:1: ( rule__AndConstraint__Group_1__0__Impl rule__AndConstraint__Group_1__1 )
            // InternalDsl.g:3591:2: rule__AndConstraint__Group_1__0__Impl rule__AndConstraint__Group_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalDsl.g:3598:1: rule__AndConstraint__Group_1__0__Impl : ( () ) ;
    public final void rule__AndConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3602:1: ( ( () ) )
            // InternalDsl.g:3603:1: ( () )
            {
            // InternalDsl.g:3603:1: ( () )
            // InternalDsl.g:3604:2: ()
            {
             before(grammarAccess.getAndConstraintAccess().getAndConstraintRuleRulesAction_1_0()); 
            // InternalDsl.g:3605:2: ()
            // InternalDsl.g:3605:3: 
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
    // InternalDsl.g:3613:1: rule__AndConstraint__Group_1__1 : rule__AndConstraint__Group_1__1__Impl rule__AndConstraint__Group_1__2 ;
    public final void rule__AndConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3617:1: ( rule__AndConstraint__Group_1__1__Impl rule__AndConstraint__Group_1__2 )
            // InternalDsl.g:3618:2: rule__AndConstraint__Group_1__1__Impl rule__AndConstraint__Group_1__2
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
    // InternalDsl.g:3625:1: rule__AndConstraint__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__AndConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3629:1: ( ( 'and' ) )
            // InternalDsl.g:3630:1: ( 'and' )
            {
            // InternalDsl.g:3630:1: ( 'and' )
            // InternalDsl.g:3631:2: 'and'
            {
             before(grammarAccess.getAndConstraintAccess().getAndKeyword_1_1()); 
            match(input,91,FOLLOW_2); 
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
    // InternalDsl.g:3640:1: rule__AndConstraint__Group_1__2 : rule__AndConstraint__Group_1__2__Impl ;
    public final void rule__AndConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3644:1: ( rule__AndConstraint__Group_1__2__Impl )
            // InternalDsl.g:3645:2: rule__AndConstraint__Group_1__2__Impl
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
    // InternalDsl.g:3651:1: rule__AndConstraint__Group_1__2__Impl : ( ( rule__AndConstraint__RulesAssignment_1_2 ) ) ;
    public final void rule__AndConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3655:1: ( ( ( rule__AndConstraint__RulesAssignment_1_2 ) ) )
            // InternalDsl.g:3656:1: ( ( rule__AndConstraint__RulesAssignment_1_2 ) )
            {
            // InternalDsl.g:3656:1: ( ( rule__AndConstraint__RulesAssignment_1_2 ) )
            // InternalDsl.g:3657:2: ( rule__AndConstraint__RulesAssignment_1_2 )
            {
             before(grammarAccess.getAndConstraintAccess().getRulesAssignment_1_2()); 
            // InternalDsl.g:3658:2: ( rule__AndConstraint__RulesAssignment_1_2 )
            // InternalDsl.g:3658:3: rule__AndConstraint__RulesAssignment_1_2
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
    // InternalDsl.g:3667:1: rule__NotConstraintExpression__Group_1__0 : rule__NotConstraintExpression__Group_1__0__Impl rule__NotConstraintExpression__Group_1__1 ;
    public final void rule__NotConstraintExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3671:1: ( rule__NotConstraintExpression__Group_1__0__Impl rule__NotConstraintExpression__Group_1__1 )
            // InternalDsl.g:3672:2: rule__NotConstraintExpression__Group_1__0__Impl rule__NotConstraintExpression__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalDsl.g:3679:1: rule__NotConstraintExpression__Group_1__0__Impl : ( '!' ) ;
    public final void rule__NotConstraintExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3683:1: ( ( '!' ) )
            // InternalDsl.g:3684:1: ( '!' )
            {
            // InternalDsl.g:3684:1: ( '!' )
            // InternalDsl.g:3685:2: '!'
            {
             before(grammarAccess.getNotConstraintExpressionAccess().getExclamationMarkKeyword_1_0()); 
            match(input,92,FOLLOW_2); 
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
    // InternalDsl.g:3694:1: rule__NotConstraintExpression__Group_1__1 : rule__NotConstraintExpression__Group_1__1__Impl rule__NotConstraintExpression__Group_1__2 ;
    public final void rule__NotConstraintExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3698:1: ( rule__NotConstraintExpression__Group_1__1__Impl rule__NotConstraintExpression__Group_1__2 )
            // InternalDsl.g:3699:2: rule__NotConstraintExpression__Group_1__1__Impl rule__NotConstraintExpression__Group_1__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalDsl.g:3706:1: rule__NotConstraintExpression__Group_1__1__Impl : ( () ) ;
    public final void rule__NotConstraintExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3710:1: ( ( () ) )
            // InternalDsl.g:3711:1: ( () )
            {
            // InternalDsl.g:3711:1: ( () )
            // InternalDsl.g:3712:2: ()
            {
             before(grammarAccess.getNotConstraintExpressionAccess().getNotConstraintRuleAction_1_1()); 
            // InternalDsl.g:3713:2: ()
            // InternalDsl.g:3713:3: 
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
    // InternalDsl.g:3721:1: rule__NotConstraintExpression__Group_1__2 : rule__NotConstraintExpression__Group_1__2__Impl ;
    public final void rule__NotConstraintExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3725:1: ( rule__NotConstraintExpression__Group_1__2__Impl )
            // InternalDsl.g:3726:2: rule__NotConstraintExpression__Group_1__2__Impl
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
    // InternalDsl.g:3732:1: rule__NotConstraintExpression__Group_1__2__Impl : ( ( rule__NotConstraintExpression__RuleAssignment_1_2 ) ) ;
    public final void rule__NotConstraintExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3736:1: ( ( ( rule__NotConstraintExpression__RuleAssignment_1_2 ) ) )
            // InternalDsl.g:3737:1: ( ( rule__NotConstraintExpression__RuleAssignment_1_2 ) )
            {
            // InternalDsl.g:3737:1: ( ( rule__NotConstraintExpression__RuleAssignment_1_2 ) )
            // InternalDsl.g:3738:2: ( rule__NotConstraintExpression__RuleAssignment_1_2 )
            {
             before(grammarAccess.getNotConstraintExpressionAccess().getRuleAssignment_1_2()); 
            // InternalDsl.g:3739:2: ( rule__NotConstraintExpression__RuleAssignment_1_2 )
            // InternalDsl.g:3739:3: rule__NotConstraintExpression__RuleAssignment_1_2
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
    // InternalDsl.g:3748:1: rule__PrimaryConstraint__Group_1__0 : rule__PrimaryConstraint__Group_1__0__Impl rule__PrimaryConstraint__Group_1__1 ;
    public final void rule__PrimaryConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3752:1: ( rule__PrimaryConstraint__Group_1__0__Impl rule__PrimaryConstraint__Group_1__1 )
            // InternalDsl.g:3753:2: rule__PrimaryConstraint__Group_1__0__Impl rule__PrimaryConstraint__Group_1__1
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
    // InternalDsl.g:3760:1: rule__PrimaryConstraint__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PrimaryConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3764:1: ( ( '(' ) )
            // InternalDsl.g:3765:1: ( '(' )
            {
            // InternalDsl.g:3765:1: ( '(' )
            // InternalDsl.g:3766:2: '('
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
    // InternalDsl.g:3775:1: rule__PrimaryConstraint__Group_1__1 : rule__PrimaryConstraint__Group_1__1__Impl rule__PrimaryConstraint__Group_1__2 ;
    public final void rule__PrimaryConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3779:1: ( rule__PrimaryConstraint__Group_1__1__Impl rule__PrimaryConstraint__Group_1__2 )
            // InternalDsl.g:3780:2: rule__PrimaryConstraint__Group_1__1__Impl rule__PrimaryConstraint__Group_1__2
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
    // InternalDsl.g:3787:1: rule__PrimaryConstraint__Group_1__1__Impl : ( ruleConstraintExpression ) ;
    public final void rule__PrimaryConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3791:1: ( ( ruleConstraintExpression ) )
            // InternalDsl.g:3792:1: ( ruleConstraintExpression )
            {
            // InternalDsl.g:3792:1: ( ruleConstraintExpression )
            // InternalDsl.g:3793:2: ruleConstraintExpression
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
    // InternalDsl.g:3802:1: rule__PrimaryConstraint__Group_1__2 : rule__PrimaryConstraint__Group_1__2__Impl ;
    public final void rule__PrimaryConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3806:1: ( rule__PrimaryConstraint__Group_1__2__Impl )
            // InternalDsl.g:3807:2: rule__PrimaryConstraint__Group_1__2__Impl
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
    // InternalDsl.g:3813:1: rule__PrimaryConstraint__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PrimaryConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3817:1: ( ( ')' ) )
            // InternalDsl.g:3818:1: ( ')' )
            {
            // InternalDsl.g:3818:1: ( ')' )
            // InternalDsl.g:3819:2: ')'
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
    // InternalDsl.g:3829:1: rule__Model__PoliciesAssignment_0 : ( rulePolicy ) ;
    public final void rule__Model__PoliciesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3833:1: ( ( rulePolicy ) )
            // InternalDsl.g:3834:2: ( rulePolicy )
            {
            // InternalDsl.g:3834:2: ( rulePolicy )
            // InternalDsl.g:3835:3: rulePolicy
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
    // InternalDsl.g:3844:1: rule__Model__PoliciesAssignment_1 : ( rulePolicy ) ;
    public final void rule__Model__PoliciesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3848:1: ( ( rulePolicy ) )
            // InternalDsl.g:3849:2: ( rulePolicy )
            {
            // InternalDsl.g:3849:2: ( rulePolicy )
            // InternalDsl.g:3850:3: rulePolicy
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
    // InternalDsl.g:3859:1: rule__Policy__OverrideAssignment_0 : ( ( 'override' ) ) ;
    public final void rule__Policy__OverrideAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3863:1: ( ( ( 'override' ) ) )
            // InternalDsl.g:3864:2: ( ( 'override' ) )
            {
            // InternalDsl.g:3864:2: ( ( 'override' ) )
            // InternalDsl.g:3865:3: ( 'override' )
            {
             before(grammarAccess.getPolicyAccess().getOverrideOverrideKeyword_0_0()); 
            // InternalDsl.g:3866:3: ( 'override' )
            // InternalDsl.g:3867:4: 'override'
            {
             before(grammarAccess.getPolicyAccess().getOverrideOverrideKeyword_0_0()); 
            match(input,94,FOLLOW_2); 
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
    // InternalDsl.g:3878:1: rule__Policy__ActionAssignment_1 : ( ruleActionEnum ) ;
    public final void rule__Policy__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3882:1: ( ( ruleActionEnum ) )
            // InternalDsl.g:3883:2: ( ruleActionEnum )
            {
            // InternalDsl.g:3883:2: ( ruleActionEnum )
            // InternalDsl.g:3884:3: ruleActionEnum
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
    // InternalDsl.g:3893:1: rule__Policy__ActionTypeAssignment_2 : ( ruleFeatureTypeEnum ) ;
    public final void rule__Policy__ActionTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3897:1: ( ( ruleFeatureTypeEnum ) )
            // InternalDsl.g:3898:2: ( ruleFeatureTypeEnum )
            {
            // InternalDsl.g:3898:2: ( ruleFeatureTypeEnum )
            // InternalDsl.g:3899:3: ruleFeatureTypeEnum
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
    // InternalDsl.g:3908:1: rule__Policy__FeatureRuleAssignment_4 : ( ruleFeatureExpression ) ;
    public final void rule__Policy__FeatureRuleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3912:1: ( ( ruleFeatureExpression ) )
            // InternalDsl.g:3913:2: ( ruleFeatureExpression )
            {
            // InternalDsl.g:3913:2: ( ruleFeatureExpression )
            // InternalDsl.g:3914:3: ruleFeatureExpression
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
    // InternalDsl.g:3923:1: rule__Policy__ConstraintRuleAssignment_7 : ( ruleConstraintExpression ) ;
    public final void rule__Policy__ConstraintRuleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3927:1: ( ( ruleConstraintExpression ) )
            // InternalDsl.g:3928:2: ( ruleConstraintExpression )
            {
            // InternalDsl.g:3928:2: ( ruleConstraintExpression )
            // InternalDsl.g:3929:3: ruleConstraintExpression
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


    // $ANTLR start "rule__ContainsTypeConstrainRule__TypeAssignment_3"
    // InternalDsl.g:3938:1: rule__ContainsTypeConstrainRule__TypeAssignment_3 : ( ruleFeatureTypeEnum ) ;
    public final void rule__ContainsTypeConstrainRule__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3942:1: ( ( ruleFeatureTypeEnum ) )
            // InternalDsl.g:3943:2: ( ruleFeatureTypeEnum )
            {
            // InternalDsl.g:3943:2: ( ruleFeatureTypeEnum )
            // InternalDsl.g:3944:3: ruleFeatureTypeEnum
            {
             before(grammarAccess.getContainsTypeConstrainRuleAccess().getTypeFeatureTypeEnumEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureTypeEnum();

            state._fsp--;

             after(grammarAccess.getContainsTypeConstrainRuleAccess().getTypeFeatureTypeEnumEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__ContainsTypeConstrainRule__TypeAssignment_3"


    // $ANTLR start "rule__IsTargetTypeConstraintRule__TypeAssignment_3"
    // InternalDsl.g:3953:1: rule__IsTargetTypeConstraintRule__TypeAssignment_3 : ( ruleFeatureTypeEnum ) ;
    public final void rule__IsTargetTypeConstraintRule__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3957:1: ( ( ruleFeatureTypeEnum ) )
            // InternalDsl.g:3958:2: ( ruleFeatureTypeEnum )
            {
            // InternalDsl.g:3958:2: ( ruleFeatureTypeEnum )
            // InternalDsl.g:3959:3: ruleFeatureTypeEnum
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


    // $ANTLR start "rule__IsTargetConnectionTypeConstraintRule__TypeAssignment_3"
    // InternalDsl.g:3968:1: rule__IsTargetConnectionTypeConstraintRule__TypeAssignment_3 : ( ruleFeatureTypeEnum ) ;
    public final void rule__IsTargetConnectionTypeConstraintRule__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3972:1: ( ( ruleFeatureTypeEnum ) )
            // InternalDsl.g:3973:2: ( ruleFeatureTypeEnum )
            {
            // InternalDsl.g:3973:2: ( ruleFeatureTypeEnum )
            // InternalDsl.g:3974:3: ruleFeatureTypeEnum
            {
             before(grammarAccess.getIsTargetConnectionTypeConstraintRuleAccess().getTypeFeatureTypeEnumEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureTypeEnum();

            state._fsp--;

             after(grammarAccess.getIsTargetConnectionTypeConstraintRuleAccess().getTypeFeatureTypeEnumEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__IsTargetConnectionTypeConstraintRule__TypeAssignment_3"


    // $ANTLR start "rule__IsSourceTypeConstraintRule__TypeAssignment_3"
    // InternalDsl.g:3983:1: rule__IsSourceTypeConstraintRule__TypeAssignment_3 : ( ruleFeatureTypeEnum ) ;
    public final void rule__IsSourceTypeConstraintRule__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3987:1: ( ( ruleFeatureTypeEnum ) )
            // InternalDsl.g:3988:2: ( ruleFeatureTypeEnum )
            {
            // InternalDsl.g:3988:2: ( ruleFeatureTypeEnum )
            // InternalDsl.g:3989:3: ruleFeatureTypeEnum
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


    // $ANTLR start "rule__InTypeConstraintRule__TypeAssignment_3"
    // InternalDsl.g:3998:1: rule__InTypeConstraintRule__TypeAssignment_3 : ( ruleFeatureTypeEnum ) ;
    public final void rule__InTypeConstraintRule__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4002:1: ( ( ruleFeatureTypeEnum ) )
            // InternalDsl.g:4003:2: ( ruleFeatureTypeEnum )
            {
            // InternalDsl.g:4003:2: ( ruleFeatureTypeEnum )
            // InternalDsl.g:4004:3: ruleFeatureTypeEnum
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
    // InternalDsl.g:4013:1: rule__IsFeature__FeatureNameAssignment_1 : ( ruleFeatureNameEnum ) ;
    public final void rule__IsFeature__FeatureNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4017:1: ( ( ruleFeatureNameEnum ) )
            // InternalDsl.g:4018:2: ( ruleFeatureNameEnum )
            {
            // InternalDsl.g:4018:2: ( ruleFeatureNameEnum )
            // InternalDsl.g:4019:3: ruleFeatureNameEnum
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
    // InternalDsl.g:4028:1: rule__OrFeature__RulesAssignment_1_2 : ( ruleAndFeature ) ;
    public final void rule__OrFeature__RulesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4032:1: ( ( ruleAndFeature ) )
            // InternalDsl.g:4033:2: ( ruleAndFeature )
            {
            // InternalDsl.g:4033:2: ( ruleAndFeature )
            // InternalDsl.g:4034:3: ruleAndFeature
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
    // InternalDsl.g:4043:1: rule__AndFeature__RulesAssignment_1_2 : ( ruleNotFeatureExpression ) ;
    public final void rule__AndFeature__RulesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4047:1: ( ( ruleNotFeatureExpression ) )
            // InternalDsl.g:4048:2: ( ruleNotFeatureExpression )
            {
            // InternalDsl.g:4048:2: ( ruleNotFeatureExpression )
            // InternalDsl.g:4049:3: ruleNotFeatureExpression
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
    // InternalDsl.g:4058:1: rule__NotFeatureExpression__RuleAssignment_1_2 : ( rulePrimaryFeature ) ;
    public final void rule__NotFeatureExpression__RuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4062:1: ( ( rulePrimaryFeature ) )
            // InternalDsl.g:4063:2: ( rulePrimaryFeature )
            {
            // InternalDsl.g:4063:2: ( rulePrimaryFeature )
            // InternalDsl.g:4064:3: rulePrimaryFeature
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
    // InternalDsl.g:4073:1: rule__ImplicationConstraint__RightRuleAssignment_1_2 : ( ruleOrConstraint ) ;
    public final void rule__ImplicationConstraint__RightRuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4077:1: ( ( ruleOrConstraint ) )
            // InternalDsl.g:4078:2: ( ruleOrConstraint )
            {
            // InternalDsl.g:4078:2: ( ruleOrConstraint )
            // InternalDsl.g:4079:3: ruleOrConstraint
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
    // InternalDsl.g:4088:1: rule__OrConstraint__RulesAssignment_1_2 : ( ruleAndConstraint ) ;
    public final void rule__OrConstraint__RulesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4092:1: ( ( ruleAndConstraint ) )
            // InternalDsl.g:4093:2: ( ruleAndConstraint )
            {
            // InternalDsl.g:4093:2: ( ruleAndConstraint )
            // InternalDsl.g:4094:3: ruleAndConstraint
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
    // InternalDsl.g:4103:1: rule__AndConstraint__RulesAssignment_1_2 : ( ruleNotConstraintExpression ) ;
    public final void rule__AndConstraint__RulesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4107:1: ( ( ruleNotConstraintExpression ) )
            // InternalDsl.g:4108:2: ( ruleNotConstraintExpression )
            {
            // InternalDsl.g:4108:2: ( ruleNotConstraintExpression )
            // InternalDsl.g:4109:3: ruleNotConstraintExpression
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
    // InternalDsl.g:4118:1: rule__NotConstraintExpression__RuleAssignment_1_2 : ( rulePrimaryConstraint ) ;
    public final void rule__NotConstraintExpression__RuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4122:1: ( ( rulePrimaryConstraint ) )
            // InternalDsl.g:4123:2: ( rulePrimaryConstraint )
            {
            // InternalDsl.g:4123:2: ( rulePrimaryConstraint )
            // InternalDsl.g:4124:3: rulePrimaryConstraint
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000001FF800L,0x0000000040000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000001FF802L,0x0000000040000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000FFFFE00000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0xFFFFFF0000000000L,0x0000000013003FFFL});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000013FE2000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000003FE0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xFFFFFF0000000000L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0xFFFFFF0000000000L,0x0000000003001FFFL});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xFFFFFF0000000000L,0x0000000003003FFFL});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000003FE2000L});

}