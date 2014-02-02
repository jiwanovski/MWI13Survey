package de.nordakademie.mwi13a.team1.survey.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.nordakademie.mwi13a.team1.survey.services.SurveyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSurveyParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Yes'", "'No'", "'Questionnaire:'", "'{'", "'ID:'", "'}'", "'Part:'", "'Question:'", "'Mandatory:'", "'Type:'", "'Answer:'", "'TextLn'", "'('", "')'", "'TextBl'", "'Matrix'", "'Scale:'", "'Questions:'", "'|'", "'ComboBox'", "'DropDown'", "'Radio'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSurveyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSurveyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSurveyParser.tokenNames; }
    public String getGrammarFileName() { return "../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g"; }


     
     	private SurveyGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SurveyGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSurvey"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:60:1: entryRuleSurvey : ruleSurvey EOF ;
    public final void entryRuleSurvey() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:61:1: ( ruleSurvey EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:62:1: ruleSurvey EOF
            {
             before(grammarAccess.getSurveyRule()); 
            pushFollow(FOLLOW_ruleSurvey_in_entryRuleSurvey61);
            ruleSurvey();

            state._fsp--;

             after(grammarAccess.getSurveyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSurvey68); 

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
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:69:1: ruleSurvey : ( ( ( rule__Survey__QuestionnaireAssignment ) ) ( ( rule__Survey__QuestionnaireAssignment )* ) ) ;
    public final void ruleSurvey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:73:2: ( ( ( ( rule__Survey__QuestionnaireAssignment ) ) ( ( rule__Survey__QuestionnaireAssignment )* ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:74:1: ( ( ( rule__Survey__QuestionnaireAssignment ) ) ( ( rule__Survey__QuestionnaireAssignment )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:74:1: ( ( ( rule__Survey__QuestionnaireAssignment ) ) ( ( rule__Survey__QuestionnaireAssignment )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:75:1: ( ( rule__Survey__QuestionnaireAssignment ) ) ( ( rule__Survey__QuestionnaireAssignment )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:75:1: ( ( rule__Survey__QuestionnaireAssignment ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:76:1: ( rule__Survey__QuestionnaireAssignment )
            {
             before(grammarAccess.getSurveyAccess().getQuestionnaireAssignment()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:77:1: ( rule__Survey__QuestionnaireAssignment )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:77:2: rule__Survey__QuestionnaireAssignment
            {
            pushFollow(FOLLOW_rule__Survey__QuestionnaireAssignment_in_ruleSurvey96);
            rule__Survey__QuestionnaireAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getQuestionnaireAssignment()); 

            }

            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:80:1: ( ( rule__Survey__QuestionnaireAssignment )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:81:1: ( rule__Survey__QuestionnaireAssignment )*
            {
             before(grammarAccess.getSurveyAccess().getQuestionnaireAssignment()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:82:1: ( rule__Survey__QuestionnaireAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:82:2: rule__Survey__QuestionnaireAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Survey__QuestionnaireAssignment_in_ruleSurvey108);
            	    rule__Survey__QuestionnaireAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSurveyAccess().getQuestionnaireAssignment()); 

            }


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
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRuleQuestionnaire"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:95:1: entryRuleQuestionnaire : ruleQuestionnaire EOF ;
    public final void entryRuleQuestionnaire() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:96:1: ( ruleQuestionnaire EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:97:1: ruleQuestionnaire EOF
            {
             before(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire138);
            ruleQuestionnaire();

            state._fsp--;

             after(grammarAccess.getQuestionnaireRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionnaire145); 

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
    // $ANTLR end "entryRuleQuestionnaire"


    // $ANTLR start "ruleQuestionnaire"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:104:1: ruleQuestionnaire : ( ( rule__Questionnaire__Group__0 ) ) ;
    public final void ruleQuestionnaire() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:108:2: ( ( ( rule__Questionnaire__Group__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:109:1: ( ( rule__Questionnaire__Group__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:109:1: ( ( rule__Questionnaire__Group__0 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:110:1: ( rule__Questionnaire__Group__0 )
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:111:1: ( rule__Questionnaire__Group__0 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:111:2: rule__Questionnaire__Group__0
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__0_in_ruleQuestionnaire171);
            rule__Questionnaire__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getGroup()); 

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
    // $ANTLR end "ruleQuestionnaire"


    // $ANTLR start "entryRulePart"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:123:1: entryRulePart : rulePart EOF ;
    public final void entryRulePart() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:124:1: ( rulePart EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:125:1: rulePart EOF
            {
             before(grammarAccess.getPartRule()); 
            pushFollow(FOLLOW_rulePart_in_entryRulePart198);
            rulePart();

            state._fsp--;

             after(grammarAccess.getPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePart205); 

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
    // $ANTLR end "entryRulePart"


    // $ANTLR start "rulePart"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:132:1: rulePart : ( ( rule__Part__Group__0 ) ) ;
    public final void rulePart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:136:2: ( ( ( rule__Part__Group__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:137:1: ( ( rule__Part__Group__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:137:1: ( ( rule__Part__Group__0 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:138:1: ( rule__Part__Group__0 )
            {
             before(grammarAccess.getPartAccess().getGroup()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:139:1: ( rule__Part__Group__0 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:139:2: rule__Part__Group__0
            {
            pushFollow(FOLLOW_rule__Part__Group__0_in_rulePart231);
            rule__Part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartAccess().getGroup()); 

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
    // $ANTLR end "rulePart"


    // $ANTLR start "entryRuleQuestion"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:151:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:152:1: ( ruleQuestion EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:153:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion258);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion265); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:160:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:164:2: ( ( ( rule__Question__Group__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:165:1: ( ( rule__Question__Group__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:165:1: ( ( rule__Question__Group__0 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:166:1: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:167:1: ( rule__Question__Group__0 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:167:2: rule__Question__Group__0
            {
            pushFollow(FOLLOW_rule__Question__Group__0_in_ruleQuestion291);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleAnswer"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:179:1: entryRuleAnswer : ruleAnswer EOF ;
    public final void entryRuleAnswer() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:180:1: ( ruleAnswer EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:181:1: ruleAnswer EOF
            {
             before(grammarAccess.getAnswerRule()); 
            pushFollow(FOLLOW_ruleAnswer_in_entryRuleAnswer318);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getAnswerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnswer325); 

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
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:188:1: ruleAnswer : ( ( rule__Answer__Group__0 ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:192:2: ( ( ( rule__Answer__Group__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:193:1: ( ( rule__Answer__Group__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:193:1: ( ( rule__Answer__Group__0 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:194:1: ( rule__Answer__Group__0 )
            {
             before(grammarAccess.getAnswerAccess().getGroup()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:195:1: ( rule__Answer__Group__0 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:195:2: rule__Answer__Group__0
            {
            pushFollow(FOLLOW_rule__Answer__Group__0_in_ruleAnswer351);
            rule__Answer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getGroup()); 

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
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleTextLn"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:207:1: entryRuleTextLn : ruleTextLn EOF ;
    public final void entryRuleTextLn() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:208:1: ( ruleTextLn EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:209:1: ruleTextLn EOF
            {
             before(grammarAccess.getTextLnRule()); 
            pushFollow(FOLLOW_ruleTextLn_in_entryRuleTextLn378);
            ruleTextLn();

            state._fsp--;

             after(grammarAccess.getTextLnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextLn385); 

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
    // $ANTLR end "entryRuleTextLn"


    // $ANTLR start "ruleTextLn"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:216:1: ruleTextLn : ( ( rule__TextLn__Group__0 ) ) ;
    public final void ruleTextLn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:220:2: ( ( ( rule__TextLn__Group__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:221:1: ( ( rule__TextLn__Group__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:221:1: ( ( rule__TextLn__Group__0 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:222:1: ( rule__TextLn__Group__0 )
            {
             before(grammarAccess.getTextLnAccess().getGroup()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:223:1: ( rule__TextLn__Group__0 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:223:2: rule__TextLn__Group__0
            {
            pushFollow(FOLLOW_rule__TextLn__Group__0_in_ruleTextLn411);
            rule__TextLn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextLnAccess().getGroup()); 

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
    // $ANTLR end "ruleTextLn"


    // $ANTLR start "entryRuleTextBl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:235:1: entryRuleTextBl : ruleTextBl EOF ;
    public final void entryRuleTextBl() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:236:1: ( ruleTextBl EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:237:1: ruleTextBl EOF
            {
             before(grammarAccess.getTextBlRule()); 
            pushFollow(FOLLOW_ruleTextBl_in_entryRuleTextBl438);
            ruleTextBl();

            state._fsp--;

             after(grammarAccess.getTextBlRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextBl445); 

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
    // $ANTLR end "entryRuleTextBl"


    // $ANTLR start "ruleTextBl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:244:1: ruleTextBl : ( ( rule__TextBl__Group__0 ) ) ;
    public final void ruleTextBl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:248:2: ( ( ( rule__TextBl__Group__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:249:1: ( ( rule__TextBl__Group__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:249:1: ( ( rule__TextBl__Group__0 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:250:1: ( rule__TextBl__Group__0 )
            {
             before(grammarAccess.getTextBlAccess().getGroup()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:251:1: ( rule__TextBl__Group__0 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:251:2: rule__TextBl__Group__0
            {
            pushFollow(FOLLOW_rule__TextBl__Group__0_in_ruleTextBl471);
            rule__TextBl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextBlAccess().getGroup()); 

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
    // $ANTLR end "ruleTextBl"


    // $ANTLR start "entryRuleMatrix"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:263:1: entryRuleMatrix : ruleMatrix EOF ;
    public final void entryRuleMatrix() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:264:1: ( ruleMatrix EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:265:1: ruleMatrix EOF
            {
             before(grammarAccess.getMatrixRule()); 
            pushFollow(FOLLOW_ruleMatrix_in_entryRuleMatrix498);
            ruleMatrix();

            state._fsp--;

             after(grammarAccess.getMatrixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrix505); 

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
    // $ANTLR end "entryRuleMatrix"


    // $ANTLR start "ruleMatrix"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:272:1: ruleMatrix : ( ( rule__Matrix__Group__0 ) ) ;
    public final void ruleMatrix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:276:2: ( ( ( rule__Matrix__Group__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:277:1: ( ( rule__Matrix__Group__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:277:1: ( ( rule__Matrix__Group__0 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:278:1: ( rule__Matrix__Group__0 )
            {
             before(grammarAccess.getMatrixAccess().getGroup()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:279:1: ( rule__Matrix__Group__0 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:279:2: rule__Matrix__Group__0
            {
            pushFollow(FOLLOW_rule__Matrix__Group__0_in_ruleMatrix531);
            rule__Matrix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatrixAccess().getGroup()); 

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
    // $ANTLR end "ruleMatrix"


    // $ANTLR start "entryRuleComboBox"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:291:1: entryRuleComboBox : ruleComboBox EOF ;
    public final void entryRuleComboBox() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:292:1: ( ruleComboBox EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:293:1: ruleComboBox EOF
            {
             before(grammarAccess.getComboBoxRule()); 
            pushFollow(FOLLOW_ruleComboBox_in_entryRuleComboBox558);
            ruleComboBox();

            state._fsp--;

             after(grammarAccess.getComboBoxRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComboBox565); 

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
    // $ANTLR end "entryRuleComboBox"


    // $ANTLR start "ruleComboBox"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:300:1: ruleComboBox : ( ( rule__ComboBox__NameAssignment ) ) ;
    public final void ruleComboBox() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:304:2: ( ( ( rule__ComboBox__NameAssignment ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:305:1: ( ( rule__ComboBox__NameAssignment ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:305:1: ( ( rule__ComboBox__NameAssignment ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:306:1: ( rule__ComboBox__NameAssignment )
            {
             before(grammarAccess.getComboBoxAccess().getNameAssignment()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:307:1: ( rule__ComboBox__NameAssignment )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:307:2: rule__ComboBox__NameAssignment
            {
            pushFollow(FOLLOW_rule__ComboBox__NameAssignment_in_ruleComboBox591);
            rule__ComboBox__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getComboBoxAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleComboBox"


    // $ANTLR start "entryRuleDropDown"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:319:1: entryRuleDropDown : ruleDropDown EOF ;
    public final void entryRuleDropDown() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:320:1: ( ruleDropDown EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:321:1: ruleDropDown EOF
            {
             before(grammarAccess.getDropDownRule()); 
            pushFollow(FOLLOW_ruleDropDown_in_entryRuleDropDown618);
            ruleDropDown();

            state._fsp--;

             after(grammarAccess.getDropDownRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropDown625); 

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
    // $ANTLR end "entryRuleDropDown"


    // $ANTLR start "ruleDropDown"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:328:1: ruleDropDown : ( ( rule__DropDown__NameAssignment ) ) ;
    public final void ruleDropDown() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:332:2: ( ( ( rule__DropDown__NameAssignment ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:333:1: ( ( rule__DropDown__NameAssignment ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:333:1: ( ( rule__DropDown__NameAssignment ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:334:1: ( rule__DropDown__NameAssignment )
            {
             before(grammarAccess.getDropDownAccess().getNameAssignment()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:335:1: ( rule__DropDown__NameAssignment )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:335:2: rule__DropDown__NameAssignment
            {
            pushFollow(FOLLOW_rule__DropDown__NameAssignment_in_ruleDropDown651);
            rule__DropDown__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDropDownAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleDropDown"


    // $ANTLR start "entryRuleRadio"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:347:1: entryRuleRadio : ruleRadio EOF ;
    public final void entryRuleRadio() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:348:1: ( ruleRadio EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:349:1: ruleRadio EOF
            {
             before(grammarAccess.getRadioRule()); 
            pushFollow(FOLLOW_ruleRadio_in_entryRuleRadio678);
            ruleRadio();

            state._fsp--;

             after(grammarAccess.getRadioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRadio685); 

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
    // $ANTLR end "entryRuleRadio"


    // $ANTLR start "ruleRadio"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:356:1: ruleRadio : ( ( rule__Radio__NameAssignment ) ) ;
    public final void ruleRadio() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:360:2: ( ( ( rule__Radio__NameAssignment ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:361:1: ( ( rule__Radio__NameAssignment ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:361:1: ( ( rule__Radio__NameAssignment ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:362:1: ( rule__Radio__NameAssignment )
            {
             before(grammarAccess.getRadioAccess().getNameAssignment()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:363:1: ( rule__Radio__NameAssignment )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:363:2: rule__Radio__NameAssignment
            {
            pushFollow(FOLLOW_rule__Radio__NameAssignment_in_ruleRadio711);
            rule__Radio__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRadioAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleRadio"


    // $ANTLR start "entryRuleIdentifier"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:375:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:376:1: ( ruleIdentifier EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:377:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier738);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier745); 

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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:384:1: ruleIdentifier : ( ( rule__Identifier__Alternatives ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:388:2: ( ( ( rule__Identifier__Alternatives ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:389:1: ( ( rule__Identifier__Alternatives ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:389:1: ( ( rule__Identifier__Alternatives ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:390:1: ( rule__Identifier__Alternatives )
            {
             before(grammarAccess.getIdentifierAccess().getAlternatives()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:391:1: ( rule__Identifier__Alternatives )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:391:2: rule__Identifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Identifier__Alternatives_in_ruleIdentifier771);
            rule__Identifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getAlternatives()); 

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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleMandatory"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:403:1: entryRuleMandatory : ruleMandatory EOF ;
    public final void entryRuleMandatory() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:404:1: ( ruleMandatory EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:405:1: ruleMandatory EOF
            {
             before(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory798);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getMandatoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory805); 

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
    // $ANTLR end "entryRuleMandatory"


    // $ANTLR start "ruleMandatory"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:412:1: ruleMandatory : ( ( rule__Mandatory__Alternatives ) ) ;
    public final void ruleMandatory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:416:2: ( ( ( rule__Mandatory__Alternatives ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:417:1: ( ( rule__Mandatory__Alternatives ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:417:1: ( ( rule__Mandatory__Alternatives ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:418:1: ( rule__Mandatory__Alternatives )
            {
             before(grammarAccess.getMandatoryAccess().getAlternatives()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:419:1: ( rule__Mandatory__Alternatives )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:419:2: rule__Mandatory__Alternatives
            {
            pushFollow(FOLLOW_rule__Mandatory__Alternatives_in_ruleMandatory831);
            rule__Mandatory__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleType"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:431:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:432:1: ( ruleType EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:433:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType858);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType865); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:440:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:444:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:445:1: ( ( rule__Type__Alternatives ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:445:1: ( ( rule__Type__Alternatives ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:446:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:447:1: ( rule__Type__Alternatives )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:447:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType891);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__Identifier__Alternatives"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:459:1: rule__Identifier__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) );
    public final void rule__Identifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:463:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case RULE_STRING:
                {
                alt2=2;
                }
                break;
            case RULE_INT:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:464:1: ( RULE_ID )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:464:1: ( RULE_ID )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:465:1: RULE_ID
                    {
                     before(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Identifier__Alternatives927); 
                     after(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:470:6: ( RULE_STRING )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:470:6: ( RULE_STRING )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:471:1: RULE_STRING
                    {
                     before(grammarAccess.getIdentifierAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Identifier__Alternatives944); 
                     after(grammarAccess.getIdentifierAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:476:6: ( RULE_INT )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:476:6: ( RULE_INT )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:477:1: RULE_INT
                    {
                     before(grammarAccess.getIdentifierAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Identifier__Alternatives961); 
                     after(grammarAccess.getIdentifierAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Identifier__Alternatives"


    // $ANTLR start "rule__Mandatory__Alternatives"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:487:1: rule__Mandatory__Alternatives : ( ( 'Yes' ) | ( 'No' ) );
    public final void rule__Mandatory__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:491:1: ( ( 'Yes' ) | ( 'No' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:492:1: ( 'Yes' )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:492:1: ( 'Yes' )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:493:1: 'Yes'
                    {
                     before(grammarAccess.getMandatoryAccess().getYesKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Mandatory__Alternatives994); 
                     after(grammarAccess.getMandatoryAccess().getYesKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:500:6: ( 'No' )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:500:6: ( 'No' )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:501:1: 'No'
                    {
                     before(grammarAccess.getMandatoryAccess().getNoKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Mandatory__Alternatives1014); 
                     after(grammarAccess.getMandatoryAccess().getNoKeyword_1()); 

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
    // $ANTLR end "rule__Mandatory__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:513:1: rule__Type__Alternatives : ( ( ruleTextLn ) | ( ruleComboBox ) | ( ruleDropDown ) | ( ruleTextBl ) | ( ruleMatrix ) | ( ruleRadio ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:517:1: ( ( ruleTextLn ) | ( ruleComboBox ) | ( ruleDropDown ) | ( ruleTextBl ) | ( ruleMatrix ) | ( ruleRadio ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 30:
                {
                alt4=2;
                }
                break;
            case 31:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            case 26:
                {
                alt4=5;
                }
                break;
            case 32:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:518:1: ( ruleTextLn )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:518:1: ( ruleTextLn )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:519:1: ruleTextLn
                    {
                     before(grammarAccess.getTypeAccess().getTextLnParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTextLn_in_rule__Type__Alternatives1048);
                    ruleTextLn();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getTextLnParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:524:6: ( ruleComboBox )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:524:6: ( ruleComboBox )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:525:1: ruleComboBox
                    {
                     before(grammarAccess.getTypeAccess().getComboBoxParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleComboBox_in_rule__Type__Alternatives1065);
                    ruleComboBox();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getComboBoxParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:530:6: ( ruleDropDown )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:530:6: ( ruleDropDown )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:531:1: ruleDropDown
                    {
                     before(grammarAccess.getTypeAccess().getDropDownParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDropDown_in_rule__Type__Alternatives1082);
                    ruleDropDown();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDropDownParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:536:6: ( ruleTextBl )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:536:6: ( ruleTextBl )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:537:1: ruleTextBl
                    {
                     before(grammarAccess.getTypeAccess().getTextBlParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleTextBl_in_rule__Type__Alternatives1099);
                    ruleTextBl();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getTextBlParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:542:6: ( ruleMatrix )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:542:6: ( ruleMatrix )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:543:1: ruleMatrix
                    {
                     before(grammarAccess.getTypeAccess().getMatrixParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleMatrix_in_rule__Type__Alternatives1116);
                    ruleMatrix();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getMatrixParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:548:6: ( ruleRadio )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:548:6: ( ruleRadio )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:549:1: ruleRadio
                    {
                     before(grammarAccess.getTypeAccess().getRadioParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleRadio_in_rule__Type__Alternatives1133);
                    ruleRadio();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getRadioParserRuleCall_5()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Questionnaire__Group__0"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:561:1: rule__Questionnaire__Group__0 : rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 ;
    public final void rule__Questionnaire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:565:1: ( rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:566:2: rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__0__Impl_in_rule__Questionnaire__Group__01163);
            rule__Questionnaire__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__1_in_rule__Questionnaire__Group__01166);
            rule__Questionnaire__Group__1();

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
    // $ANTLR end "rule__Questionnaire__Group__0"


    // $ANTLR start "rule__Questionnaire__Group__0__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:573:1: rule__Questionnaire__Group__0__Impl : ( 'Questionnaire:' ) ;
    public final void rule__Questionnaire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:577:1: ( ( 'Questionnaire:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:578:1: ( 'Questionnaire:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:578:1: ( 'Questionnaire:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:579:1: 'Questionnaire:'
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Questionnaire__Group__0__Impl1194); 
             after(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0()); 

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
    // $ANTLR end "rule__Questionnaire__Group__0__Impl"


    // $ANTLR start "rule__Questionnaire__Group__1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:592:1: rule__Questionnaire__Group__1 : rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 ;
    public final void rule__Questionnaire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:596:1: ( rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:597:2: rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__1__Impl_in_rule__Questionnaire__Group__11225);
            rule__Questionnaire__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__2_in_rule__Questionnaire__Group__11228);
            rule__Questionnaire__Group__2();

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
    // $ANTLR end "rule__Questionnaire__Group__1"


    // $ANTLR start "rule__Questionnaire__Group__1__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:604:1: rule__Questionnaire__Group__1__Impl : ( ( rule__Questionnaire__NameAssignment_1 ) ) ;
    public final void rule__Questionnaire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:608:1: ( ( ( rule__Questionnaire__NameAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:609:1: ( ( rule__Questionnaire__NameAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:609:1: ( ( rule__Questionnaire__NameAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:610:1: ( rule__Questionnaire__NameAssignment_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getNameAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:611:1: ( rule__Questionnaire__NameAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:611:2: rule__Questionnaire__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Questionnaire__NameAssignment_1_in_rule__Questionnaire__Group__1__Impl1255);
            rule__Questionnaire__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Questionnaire__Group__1__Impl"


    // $ANTLR start "rule__Questionnaire__Group__2"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:621:1: rule__Questionnaire__Group__2 : rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 ;
    public final void rule__Questionnaire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:625:1: ( rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:626:2: rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__2__Impl_in_rule__Questionnaire__Group__21285);
            rule__Questionnaire__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__3_in_rule__Questionnaire__Group__21288);
            rule__Questionnaire__Group__3();

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
    // $ANTLR end "rule__Questionnaire__Group__2"


    // $ANTLR start "rule__Questionnaire__Group__2__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:633:1: rule__Questionnaire__Group__2__Impl : ( '{' ) ;
    public final void rule__Questionnaire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:637:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:638:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:638:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:639:1: '{'
            {
             before(grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Questionnaire__Group__2__Impl1316); 
             after(grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Questionnaire__Group__2__Impl"


    // $ANTLR start "rule__Questionnaire__Group__3"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:652:1: rule__Questionnaire__Group__3 : rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 ;
    public final void rule__Questionnaire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:656:1: ( rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:657:2: rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__3__Impl_in_rule__Questionnaire__Group__31347);
            rule__Questionnaire__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__4_in_rule__Questionnaire__Group__31350);
            rule__Questionnaire__Group__4();

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
    // $ANTLR end "rule__Questionnaire__Group__3"


    // $ANTLR start "rule__Questionnaire__Group__3__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:664:1: rule__Questionnaire__Group__3__Impl : ( 'ID:' ) ;
    public final void rule__Questionnaire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:668:1: ( ( 'ID:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:669:1: ( 'ID:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:669:1: ( 'ID:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:670:1: 'ID:'
            {
             before(grammarAccess.getQuestionnaireAccess().getIDKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Questionnaire__Group__3__Impl1378); 
             after(grammarAccess.getQuestionnaireAccess().getIDKeyword_3()); 

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
    // $ANTLR end "rule__Questionnaire__Group__3__Impl"


    // $ANTLR start "rule__Questionnaire__Group__4"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:683:1: rule__Questionnaire__Group__4 : rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5 ;
    public final void rule__Questionnaire__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:687:1: ( rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:688:2: rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__4__Impl_in_rule__Questionnaire__Group__41409);
            rule__Questionnaire__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__5_in_rule__Questionnaire__Group__41412);
            rule__Questionnaire__Group__5();

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
    // $ANTLR end "rule__Questionnaire__Group__4"


    // $ANTLR start "rule__Questionnaire__Group__4__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:695:1: rule__Questionnaire__Group__4__Impl : ( ( rule__Questionnaire__IdAssignment_4 ) ) ;
    public final void rule__Questionnaire__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:699:1: ( ( ( rule__Questionnaire__IdAssignment_4 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:700:1: ( ( rule__Questionnaire__IdAssignment_4 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:700:1: ( ( rule__Questionnaire__IdAssignment_4 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:701:1: ( rule__Questionnaire__IdAssignment_4 )
            {
             before(grammarAccess.getQuestionnaireAccess().getIdAssignment_4()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:702:1: ( rule__Questionnaire__IdAssignment_4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:702:2: rule__Questionnaire__IdAssignment_4
            {
            pushFollow(FOLLOW_rule__Questionnaire__IdAssignment_4_in_rule__Questionnaire__Group__4__Impl1439);
            rule__Questionnaire__IdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getIdAssignment_4()); 

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
    // $ANTLR end "rule__Questionnaire__Group__4__Impl"


    // $ANTLR start "rule__Questionnaire__Group__5"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:712:1: rule__Questionnaire__Group__5 : rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6 ;
    public final void rule__Questionnaire__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:716:1: ( rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:717:2: rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__5__Impl_in_rule__Questionnaire__Group__51469);
            rule__Questionnaire__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__6_in_rule__Questionnaire__Group__51472);
            rule__Questionnaire__Group__6();

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
    // $ANTLR end "rule__Questionnaire__Group__5"


    // $ANTLR start "rule__Questionnaire__Group__5__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:724:1: rule__Questionnaire__Group__5__Impl : ( ( ( rule__Questionnaire__PartAssignment_5 ) ) ( ( rule__Questionnaire__PartAssignment_5 )* ) ) ;
    public final void rule__Questionnaire__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:728:1: ( ( ( ( rule__Questionnaire__PartAssignment_5 ) ) ( ( rule__Questionnaire__PartAssignment_5 )* ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:729:1: ( ( ( rule__Questionnaire__PartAssignment_5 ) ) ( ( rule__Questionnaire__PartAssignment_5 )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:729:1: ( ( ( rule__Questionnaire__PartAssignment_5 ) ) ( ( rule__Questionnaire__PartAssignment_5 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:730:1: ( ( rule__Questionnaire__PartAssignment_5 ) ) ( ( rule__Questionnaire__PartAssignment_5 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:730:1: ( ( rule__Questionnaire__PartAssignment_5 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:731:1: ( rule__Questionnaire__PartAssignment_5 )
            {
             before(grammarAccess.getQuestionnaireAccess().getPartAssignment_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:732:1: ( rule__Questionnaire__PartAssignment_5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:732:2: rule__Questionnaire__PartAssignment_5
            {
            pushFollow(FOLLOW_rule__Questionnaire__PartAssignment_5_in_rule__Questionnaire__Group__5__Impl1501);
            rule__Questionnaire__PartAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getPartAssignment_5()); 

            }

            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:735:1: ( ( rule__Questionnaire__PartAssignment_5 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:736:1: ( rule__Questionnaire__PartAssignment_5 )*
            {
             before(grammarAccess.getQuestionnaireAccess().getPartAssignment_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:737:1: ( rule__Questionnaire__PartAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:737:2: rule__Questionnaire__PartAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Questionnaire__PartAssignment_5_in_rule__Questionnaire__Group__5__Impl1513);
            	    rule__Questionnaire__PartAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getQuestionnaireAccess().getPartAssignment_5()); 

            }


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
    // $ANTLR end "rule__Questionnaire__Group__5__Impl"


    // $ANTLR start "rule__Questionnaire__Group__6"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:748:1: rule__Questionnaire__Group__6 : rule__Questionnaire__Group__6__Impl ;
    public final void rule__Questionnaire__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:752:1: ( rule__Questionnaire__Group__6__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:753:2: rule__Questionnaire__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__6__Impl_in_rule__Questionnaire__Group__61546);
            rule__Questionnaire__Group__6__Impl();

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
    // $ANTLR end "rule__Questionnaire__Group__6"


    // $ANTLR start "rule__Questionnaire__Group__6__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:759:1: rule__Questionnaire__Group__6__Impl : ( '}' ) ;
    public final void rule__Questionnaire__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:763:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:764:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:764:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:765:1: '}'
            {
             before(grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_16_in_rule__Questionnaire__Group__6__Impl1574); 
             after(grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Questionnaire__Group__6__Impl"


    // $ANTLR start "rule__Part__Group__0"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:792:1: rule__Part__Group__0 : rule__Part__Group__0__Impl rule__Part__Group__1 ;
    public final void rule__Part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:796:1: ( rule__Part__Group__0__Impl rule__Part__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:797:2: rule__Part__Group__0__Impl rule__Part__Group__1
            {
            pushFollow(FOLLOW_rule__Part__Group__0__Impl_in_rule__Part__Group__01619);
            rule__Part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__1_in_rule__Part__Group__01622);
            rule__Part__Group__1();

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
    // $ANTLR end "rule__Part__Group__0"


    // $ANTLR start "rule__Part__Group__0__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:804:1: rule__Part__Group__0__Impl : ( 'Part:' ) ;
    public final void rule__Part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:808:1: ( ( 'Part:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:809:1: ( 'Part:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:809:1: ( 'Part:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:810:1: 'Part:'
            {
             before(grammarAccess.getPartAccess().getPartKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Part__Group__0__Impl1650); 
             after(grammarAccess.getPartAccess().getPartKeyword_0()); 

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
    // $ANTLR end "rule__Part__Group__0__Impl"


    // $ANTLR start "rule__Part__Group__1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:823:1: rule__Part__Group__1 : rule__Part__Group__1__Impl rule__Part__Group__2 ;
    public final void rule__Part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:827:1: ( rule__Part__Group__1__Impl rule__Part__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:828:2: rule__Part__Group__1__Impl rule__Part__Group__2
            {
            pushFollow(FOLLOW_rule__Part__Group__1__Impl_in_rule__Part__Group__11681);
            rule__Part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__2_in_rule__Part__Group__11684);
            rule__Part__Group__2();

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
    // $ANTLR end "rule__Part__Group__1"


    // $ANTLR start "rule__Part__Group__1__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:835:1: rule__Part__Group__1__Impl : ( ( rule__Part__NameAssignment_1 ) ) ;
    public final void rule__Part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:839:1: ( ( ( rule__Part__NameAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:840:1: ( ( rule__Part__NameAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:840:1: ( ( rule__Part__NameAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:841:1: ( rule__Part__NameAssignment_1 )
            {
             before(grammarAccess.getPartAccess().getNameAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:842:1: ( rule__Part__NameAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:842:2: rule__Part__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Part__NameAssignment_1_in_rule__Part__Group__1__Impl1711);
            rule__Part__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPartAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Part__Group__1__Impl"


    // $ANTLR start "rule__Part__Group__2"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:852:1: rule__Part__Group__2 : rule__Part__Group__2__Impl rule__Part__Group__3 ;
    public final void rule__Part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:856:1: ( rule__Part__Group__2__Impl rule__Part__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:857:2: rule__Part__Group__2__Impl rule__Part__Group__3
            {
            pushFollow(FOLLOW_rule__Part__Group__2__Impl_in_rule__Part__Group__21741);
            rule__Part__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__3_in_rule__Part__Group__21744);
            rule__Part__Group__3();

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
    // $ANTLR end "rule__Part__Group__2"


    // $ANTLR start "rule__Part__Group__2__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:864:1: rule__Part__Group__2__Impl : ( '{' ) ;
    public final void rule__Part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:868:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:869:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:869:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:870:1: '{'
            {
             before(grammarAccess.getPartAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Part__Group__2__Impl1772); 
             after(grammarAccess.getPartAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Part__Group__2__Impl"


    // $ANTLR start "rule__Part__Group__3"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:883:1: rule__Part__Group__3 : rule__Part__Group__3__Impl rule__Part__Group__4 ;
    public final void rule__Part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:887:1: ( rule__Part__Group__3__Impl rule__Part__Group__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:888:2: rule__Part__Group__3__Impl rule__Part__Group__4
            {
            pushFollow(FOLLOW_rule__Part__Group__3__Impl_in_rule__Part__Group__31803);
            rule__Part__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__4_in_rule__Part__Group__31806);
            rule__Part__Group__4();

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
    // $ANTLR end "rule__Part__Group__3"


    // $ANTLR start "rule__Part__Group__3__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:895:1: rule__Part__Group__3__Impl : ( 'ID:' ) ;
    public final void rule__Part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:899:1: ( ( 'ID:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:900:1: ( 'ID:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:900:1: ( 'ID:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:901:1: 'ID:'
            {
             before(grammarAccess.getPartAccess().getIDKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Part__Group__3__Impl1834); 
             after(grammarAccess.getPartAccess().getIDKeyword_3()); 

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
    // $ANTLR end "rule__Part__Group__3__Impl"


    // $ANTLR start "rule__Part__Group__4"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:914:1: rule__Part__Group__4 : rule__Part__Group__4__Impl rule__Part__Group__5 ;
    public final void rule__Part__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:918:1: ( rule__Part__Group__4__Impl rule__Part__Group__5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:919:2: rule__Part__Group__4__Impl rule__Part__Group__5
            {
            pushFollow(FOLLOW_rule__Part__Group__4__Impl_in_rule__Part__Group__41865);
            rule__Part__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__5_in_rule__Part__Group__41868);
            rule__Part__Group__5();

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
    // $ANTLR end "rule__Part__Group__4"


    // $ANTLR start "rule__Part__Group__4__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:926:1: rule__Part__Group__4__Impl : ( ( rule__Part__IdAssignment_4 ) ) ;
    public final void rule__Part__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:930:1: ( ( ( rule__Part__IdAssignment_4 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:931:1: ( ( rule__Part__IdAssignment_4 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:931:1: ( ( rule__Part__IdAssignment_4 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:932:1: ( rule__Part__IdAssignment_4 )
            {
             before(grammarAccess.getPartAccess().getIdAssignment_4()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:933:1: ( rule__Part__IdAssignment_4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:933:2: rule__Part__IdAssignment_4
            {
            pushFollow(FOLLOW_rule__Part__IdAssignment_4_in_rule__Part__Group__4__Impl1895);
            rule__Part__IdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPartAccess().getIdAssignment_4()); 

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
    // $ANTLR end "rule__Part__Group__4__Impl"


    // $ANTLR start "rule__Part__Group__5"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:943:1: rule__Part__Group__5 : rule__Part__Group__5__Impl rule__Part__Group__6 ;
    public final void rule__Part__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:947:1: ( rule__Part__Group__5__Impl rule__Part__Group__6 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:948:2: rule__Part__Group__5__Impl rule__Part__Group__6
            {
            pushFollow(FOLLOW_rule__Part__Group__5__Impl_in_rule__Part__Group__51925);
            rule__Part__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__6_in_rule__Part__Group__51928);
            rule__Part__Group__6();

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
    // $ANTLR end "rule__Part__Group__5"


    // $ANTLR start "rule__Part__Group__5__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:955:1: rule__Part__Group__5__Impl : ( ( ( rule__Part__QuestionAssignment_5 ) ) ( ( rule__Part__QuestionAssignment_5 )* ) ) ;
    public final void rule__Part__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:959:1: ( ( ( ( rule__Part__QuestionAssignment_5 ) ) ( ( rule__Part__QuestionAssignment_5 )* ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:960:1: ( ( ( rule__Part__QuestionAssignment_5 ) ) ( ( rule__Part__QuestionAssignment_5 )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:960:1: ( ( ( rule__Part__QuestionAssignment_5 ) ) ( ( rule__Part__QuestionAssignment_5 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:961:1: ( ( rule__Part__QuestionAssignment_5 ) ) ( ( rule__Part__QuestionAssignment_5 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:961:1: ( ( rule__Part__QuestionAssignment_5 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:962:1: ( rule__Part__QuestionAssignment_5 )
            {
             before(grammarAccess.getPartAccess().getQuestionAssignment_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:963:1: ( rule__Part__QuestionAssignment_5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:963:2: rule__Part__QuestionAssignment_5
            {
            pushFollow(FOLLOW_rule__Part__QuestionAssignment_5_in_rule__Part__Group__5__Impl1957);
            rule__Part__QuestionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPartAccess().getQuestionAssignment_5()); 

            }

            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:966:1: ( ( rule__Part__QuestionAssignment_5 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:967:1: ( rule__Part__QuestionAssignment_5 )*
            {
             before(grammarAccess.getPartAccess().getQuestionAssignment_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:968:1: ( rule__Part__QuestionAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:968:2: rule__Part__QuestionAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Part__QuestionAssignment_5_in_rule__Part__Group__5__Impl1969);
            	    rule__Part__QuestionAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPartAccess().getQuestionAssignment_5()); 

            }


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
    // $ANTLR end "rule__Part__Group__5__Impl"


    // $ANTLR start "rule__Part__Group__6"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:979:1: rule__Part__Group__6 : rule__Part__Group__6__Impl ;
    public final void rule__Part__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:983:1: ( rule__Part__Group__6__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:984:2: rule__Part__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Part__Group__6__Impl_in_rule__Part__Group__62002);
            rule__Part__Group__6__Impl();

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
    // $ANTLR end "rule__Part__Group__6"


    // $ANTLR start "rule__Part__Group__6__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:990:1: rule__Part__Group__6__Impl : ( '}' ) ;
    public final void rule__Part__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:994:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:995:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:995:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:996:1: '}'
            {
             before(grammarAccess.getPartAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_16_in_rule__Part__Group__6__Impl2030); 
             after(grammarAccess.getPartAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Part__Group__6__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1023:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1027:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1028:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__02075);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__1_in_rule__Question__Group__02078);
            rule__Question__Group__1();

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
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1035:1: rule__Question__Group__0__Impl : ( 'Question:' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1039:1: ( ( 'Question:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1040:1: ( 'Question:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1040:1: ( 'Question:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1041:1: 'Question:'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Question__Group__0__Impl2106); 
             after(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 

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
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1054:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1058:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1059:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__12137);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__2_in_rule__Question__Group__12140);
            rule__Question__Group__2();

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
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1066:1: rule__Question__Group__1__Impl : ( ( rule__Question__NameAssignment_1 ) ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1070:1: ( ( ( rule__Question__NameAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1071:1: ( ( rule__Question__NameAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1071:1: ( ( rule__Question__NameAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1072:1: ( rule__Question__NameAssignment_1 )
            {
             before(grammarAccess.getQuestionAccess().getNameAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1073:1: ( rule__Question__NameAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1073:2: rule__Question__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Question__NameAssignment_1_in_rule__Question__Group__1__Impl2167);
            rule__Question__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1083:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1087:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1088:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__22197);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__3_in_rule__Question__Group__22200);
            rule__Question__Group__3();

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
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1095:1: rule__Question__Group__2__Impl : ( '{' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1099:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1100:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1100:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1101:1: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Question__Group__2__Impl2228); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__3"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1114:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1118:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1119:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__32259);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__4_in_rule__Question__Group__32262);
            rule__Question__Group__4();

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
    // $ANTLR end "rule__Question__Group__3"


    // $ANTLR start "rule__Question__Group__3__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1126:1: rule__Question__Group__3__Impl : ( 'ID:' ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1130:1: ( ( 'ID:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1131:1: ( 'ID:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1131:1: ( 'ID:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1132:1: 'ID:'
            {
             before(grammarAccess.getQuestionAccess().getIDKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Question__Group__3__Impl2290); 
             after(grammarAccess.getQuestionAccess().getIDKeyword_3()); 

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
    // $ANTLR end "rule__Question__Group__3__Impl"


    // $ANTLR start "rule__Question__Group__4"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1145:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1149:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1150:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__42321);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__5_in_rule__Question__Group__42324);
            rule__Question__Group__5();

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
    // $ANTLR end "rule__Question__Group__4"


    // $ANTLR start "rule__Question__Group__4__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1157:1: rule__Question__Group__4__Impl : ( ( rule__Question__IdAssignment_4 ) ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1161:1: ( ( ( rule__Question__IdAssignment_4 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1162:1: ( ( rule__Question__IdAssignment_4 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1162:1: ( ( rule__Question__IdAssignment_4 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1163:1: ( rule__Question__IdAssignment_4 )
            {
             before(grammarAccess.getQuestionAccess().getIdAssignment_4()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1164:1: ( rule__Question__IdAssignment_4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1164:2: rule__Question__IdAssignment_4
            {
            pushFollow(FOLLOW_rule__Question__IdAssignment_4_in_rule__Question__Group__4__Impl2351);
            rule__Question__IdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getIdAssignment_4()); 

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
    // $ANTLR end "rule__Question__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__5"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1174:1: rule__Question__Group__5 : rule__Question__Group__5__Impl rule__Question__Group__6 ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1178:1: ( rule__Question__Group__5__Impl rule__Question__Group__6 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1179:2: rule__Question__Group__5__Impl rule__Question__Group__6
            {
            pushFollow(FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__52381);
            rule__Question__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__6_in_rule__Question__Group__52384);
            rule__Question__Group__6();

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
    // $ANTLR end "rule__Question__Group__5"


    // $ANTLR start "rule__Question__Group__5__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1186:1: rule__Question__Group__5__Impl : ( 'Mandatory:' ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1190:1: ( ( 'Mandatory:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1191:1: ( 'Mandatory:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1191:1: ( 'Mandatory:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1192:1: 'Mandatory:'
            {
             before(grammarAccess.getQuestionAccess().getMandatoryKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Question__Group__5__Impl2412); 
             after(grammarAccess.getQuestionAccess().getMandatoryKeyword_5()); 

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
    // $ANTLR end "rule__Question__Group__5__Impl"


    // $ANTLR start "rule__Question__Group__6"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1205:1: rule__Question__Group__6 : rule__Question__Group__6__Impl rule__Question__Group__7 ;
    public final void rule__Question__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1209:1: ( rule__Question__Group__6__Impl rule__Question__Group__7 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1210:2: rule__Question__Group__6__Impl rule__Question__Group__7
            {
            pushFollow(FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__62443);
            rule__Question__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__7_in_rule__Question__Group__62446);
            rule__Question__Group__7();

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
    // $ANTLR end "rule__Question__Group__6"


    // $ANTLR start "rule__Question__Group__6__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1217:1: rule__Question__Group__6__Impl : ( ( rule__Question__MandatoryAssignment_6 ) ) ;
    public final void rule__Question__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1221:1: ( ( ( rule__Question__MandatoryAssignment_6 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1222:1: ( ( rule__Question__MandatoryAssignment_6 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1222:1: ( ( rule__Question__MandatoryAssignment_6 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1223:1: ( rule__Question__MandatoryAssignment_6 )
            {
             before(grammarAccess.getQuestionAccess().getMandatoryAssignment_6()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1224:1: ( rule__Question__MandatoryAssignment_6 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1224:2: rule__Question__MandatoryAssignment_6
            {
            pushFollow(FOLLOW_rule__Question__MandatoryAssignment_6_in_rule__Question__Group__6__Impl2473);
            rule__Question__MandatoryAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getMandatoryAssignment_6()); 

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
    // $ANTLR end "rule__Question__Group__6__Impl"


    // $ANTLR start "rule__Question__Group__7"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1234:1: rule__Question__Group__7 : rule__Question__Group__7__Impl rule__Question__Group__8 ;
    public final void rule__Question__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1238:1: ( rule__Question__Group__7__Impl rule__Question__Group__8 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1239:2: rule__Question__Group__7__Impl rule__Question__Group__8
            {
            pushFollow(FOLLOW_rule__Question__Group__7__Impl_in_rule__Question__Group__72503);
            rule__Question__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__8_in_rule__Question__Group__72506);
            rule__Question__Group__8();

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
    // $ANTLR end "rule__Question__Group__7"


    // $ANTLR start "rule__Question__Group__7__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1246:1: rule__Question__Group__7__Impl : ( 'Type:' ) ;
    public final void rule__Question__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1250:1: ( ( 'Type:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1251:1: ( 'Type:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1251:1: ( 'Type:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1252:1: 'Type:'
            {
             before(grammarAccess.getQuestionAccess().getTypeKeyword_7()); 
            match(input,20,FOLLOW_20_in_rule__Question__Group__7__Impl2534); 
             after(grammarAccess.getQuestionAccess().getTypeKeyword_7()); 

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
    // $ANTLR end "rule__Question__Group__7__Impl"


    // $ANTLR start "rule__Question__Group__8"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1265:1: rule__Question__Group__8 : rule__Question__Group__8__Impl rule__Question__Group__9 ;
    public final void rule__Question__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1269:1: ( rule__Question__Group__8__Impl rule__Question__Group__9 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1270:2: rule__Question__Group__8__Impl rule__Question__Group__9
            {
            pushFollow(FOLLOW_rule__Question__Group__8__Impl_in_rule__Question__Group__82565);
            rule__Question__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__9_in_rule__Question__Group__82568);
            rule__Question__Group__9();

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
    // $ANTLR end "rule__Question__Group__8"


    // $ANTLR start "rule__Question__Group__8__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1277:1: rule__Question__Group__8__Impl : ( ( rule__Question__TypeAssignment_8 ) ) ;
    public final void rule__Question__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1281:1: ( ( ( rule__Question__TypeAssignment_8 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1282:1: ( ( rule__Question__TypeAssignment_8 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1282:1: ( ( rule__Question__TypeAssignment_8 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1283:1: ( rule__Question__TypeAssignment_8 )
            {
             before(grammarAccess.getQuestionAccess().getTypeAssignment_8()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1284:1: ( rule__Question__TypeAssignment_8 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1284:2: rule__Question__TypeAssignment_8
            {
            pushFollow(FOLLOW_rule__Question__TypeAssignment_8_in_rule__Question__Group__8__Impl2595);
            rule__Question__TypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getTypeAssignment_8()); 

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
    // $ANTLR end "rule__Question__Group__8__Impl"


    // $ANTLR start "rule__Question__Group__9"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1294:1: rule__Question__Group__9 : rule__Question__Group__9__Impl rule__Question__Group__10 ;
    public final void rule__Question__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1298:1: ( rule__Question__Group__9__Impl rule__Question__Group__10 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1299:2: rule__Question__Group__9__Impl rule__Question__Group__10
            {
            pushFollow(FOLLOW_rule__Question__Group__9__Impl_in_rule__Question__Group__92625);
            rule__Question__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__10_in_rule__Question__Group__92628);
            rule__Question__Group__10();

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
    // $ANTLR end "rule__Question__Group__9"


    // $ANTLR start "rule__Question__Group__9__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1306:1: rule__Question__Group__9__Impl : ( ( rule__Question__AnswerAssignment_9 )* ) ;
    public final void rule__Question__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1310:1: ( ( ( rule__Question__AnswerAssignment_9 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1311:1: ( ( rule__Question__AnswerAssignment_9 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1311:1: ( ( rule__Question__AnswerAssignment_9 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1312:1: ( rule__Question__AnswerAssignment_9 )*
            {
             before(grammarAccess.getQuestionAccess().getAnswerAssignment_9()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1313:1: ( rule__Question__AnswerAssignment_9 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1313:2: rule__Question__AnswerAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Question__AnswerAssignment_9_in_rule__Question__Group__9__Impl2655);
            	    rule__Question__AnswerAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getAnswerAssignment_9()); 

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
    // $ANTLR end "rule__Question__Group__9__Impl"


    // $ANTLR start "rule__Question__Group__10"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1323:1: rule__Question__Group__10 : rule__Question__Group__10__Impl ;
    public final void rule__Question__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1327:1: ( rule__Question__Group__10__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1328:2: rule__Question__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group__10__Impl_in_rule__Question__Group__102686);
            rule__Question__Group__10__Impl();

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
    // $ANTLR end "rule__Question__Group__10"


    // $ANTLR start "rule__Question__Group__10__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1334:1: rule__Question__Group__10__Impl : ( '}' ) ;
    public final void rule__Question__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1338:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1339:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1339:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1340:1: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_10()); 
            match(input,16,FOLLOW_16_in_rule__Question__Group__10__Impl2714); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Question__Group__10__Impl"


    // $ANTLR start "rule__Answer__Group__0"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1375:1: rule__Answer__Group__0 : rule__Answer__Group__0__Impl rule__Answer__Group__1 ;
    public final void rule__Answer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1379:1: ( rule__Answer__Group__0__Impl rule__Answer__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1380:2: rule__Answer__Group__0__Impl rule__Answer__Group__1
            {
            pushFollow(FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__02767);
            rule__Answer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__02770);
            rule__Answer__Group__1();

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
    // $ANTLR end "rule__Answer__Group__0"


    // $ANTLR start "rule__Answer__Group__0__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1387:1: rule__Answer__Group__0__Impl : ( 'ID:' ) ;
    public final void rule__Answer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1391:1: ( ( 'ID:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1392:1: ( 'ID:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1392:1: ( 'ID:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1393:1: 'ID:'
            {
             before(grammarAccess.getAnswerAccess().getIDKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Answer__Group__0__Impl2798); 
             after(grammarAccess.getAnswerAccess().getIDKeyword_0()); 

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
    // $ANTLR end "rule__Answer__Group__0__Impl"


    // $ANTLR start "rule__Answer__Group__1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1406:1: rule__Answer__Group__1 : rule__Answer__Group__1__Impl rule__Answer__Group__2 ;
    public final void rule__Answer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1410:1: ( rule__Answer__Group__1__Impl rule__Answer__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1411:2: rule__Answer__Group__1__Impl rule__Answer__Group__2
            {
            pushFollow(FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__12829);
            rule__Answer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__12832);
            rule__Answer__Group__2();

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
    // $ANTLR end "rule__Answer__Group__1"


    // $ANTLR start "rule__Answer__Group__1__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1418:1: rule__Answer__Group__1__Impl : ( ( rule__Answer__IdAssignment_1 ) ) ;
    public final void rule__Answer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1422:1: ( ( ( rule__Answer__IdAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1423:1: ( ( rule__Answer__IdAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1423:1: ( ( rule__Answer__IdAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1424:1: ( rule__Answer__IdAssignment_1 )
            {
             before(grammarAccess.getAnswerAccess().getIdAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1425:1: ( rule__Answer__IdAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1425:2: rule__Answer__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__Answer__IdAssignment_1_in_rule__Answer__Group__1__Impl2859);
            rule__Answer__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getIdAssignment_1()); 

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
    // $ANTLR end "rule__Answer__Group__1__Impl"


    // $ANTLR start "rule__Answer__Group__2"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1435:1: rule__Answer__Group__2 : rule__Answer__Group__2__Impl rule__Answer__Group__3 ;
    public final void rule__Answer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1439:1: ( rule__Answer__Group__2__Impl rule__Answer__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1440:2: rule__Answer__Group__2__Impl rule__Answer__Group__3
            {
            pushFollow(FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__22889);
            rule__Answer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__22892);
            rule__Answer__Group__3();

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
    // $ANTLR end "rule__Answer__Group__2"


    // $ANTLR start "rule__Answer__Group__2__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1447:1: rule__Answer__Group__2__Impl : ( 'Answer:' ) ;
    public final void rule__Answer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1451:1: ( ( 'Answer:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1452:1: ( 'Answer:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1452:1: ( 'Answer:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1453:1: 'Answer:'
            {
             before(grammarAccess.getAnswerAccess().getAnswerKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Answer__Group__2__Impl2920); 
             after(grammarAccess.getAnswerAccess().getAnswerKeyword_2()); 

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
    // $ANTLR end "rule__Answer__Group__2__Impl"


    // $ANTLR start "rule__Answer__Group__3"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1466:1: rule__Answer__Group__3 : rule__Answer__Group__3__Impl ;
    public final void rule__Answer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1470:1: ( rule__Answer__Group__3__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1471:2: rule__Answer__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__32951);
            rule__Answer__Group__3__Impl();

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
    // $ANTLR end "rule__Answer__Group__3"


    // $ANTLR start "rule__Answer__Group__3__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1477:1: rule__Answer__Group__3__Impl : ( ( rule__Answer__NameAssignment_3 ) ) ;
    public final void rule__Answer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1481:1: ( ( ( rule__Answer__NameAssignment_3 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1482:1: ( ( rule__Answer__NameAssignment_3 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1482:1: ( ( rule__Answer__NameAssignment_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1483:1: ( rule__Answer__NameAssignment_3 )
            {
             before(grammarAccess.getAnswerAccess().getNameAssignment_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1484:1: ( rule__Answer__NameAssignment_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1484:2: rule__Answer__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Answer__NameAssignment_3_in_rule__Answer__Group__3__Impl2978);
            rule__Answer__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Answer__Group__3__Impl"


    // $ANTLR start "rule__TextLn__Group__0"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1502:1: rule__TextLn__Group__0 : rule__TextLn__Group__0__Impl rule__TextLn__Group__1 ;
    public final void rule__TextLn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1506:1: ( rule__TextLn__Group__0__Impl rule__TextLn__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1507:2: rule__TextLn__Group__0__Impl rule__TextLn__Group__1
            {
            pushFollow(FOLLOW_rule__TextLn__Group__0__Impl_in_rule__TextLn__Group__03016);
            rule__TextLn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextLn__Group__1_in_rule__TextLn__Group__03019);
            rule__TextLn__Group__1();

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
    // $ANTLR end "rule__TextLn__Group__0"


    // $ANTLR start "rule__TextLn__Group__0__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1514:1: rule__TextLn__Group__0__Impl : ( 'TextLn' ) ;
    public final void rule__TextLn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1518:1: ( ( 'TextLn' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1519:1: ( 'TextLn' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1519:1: ( 'TextLn' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1520:1: 'TextLn'
            {
             before(grammarAccess.getTextLnAccess().getTextLnKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__TextLn__Group__0__Impl3047); 
             after(grammarAccess.getTextLnAccess().getTextLnKeyword_0()); 

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
    // $ANTLR end "rule__TextLn__Group__0__Impl"


    // $ANTLR start "rule__TextLn__Group__1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1533:1: rule__TextLn__Group__1 : rule__TextLn__Group__1__Impl rule__TextLn__Group__2 ;
    public final void rule__TextLn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1537:1: ( rule__TextLn__Group__1__Impl rule__TextLn__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1538:2: rule__TextLn__Group__1__Impl rule__TextLn__Group__2
            {
            pushFollow(FOLLOW_rule__TextLn__Group__1__Impl_in_rule__TextLn__Group__13078);
            rule__TextLn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextLn__Group__2_in_rule__TextLn__Group__13081);
            rule__TextLn__Group__2();

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
    // $ANTLR end "rule__TextLn__Group__1"


    // $ANTLR start "rule__TextLn__Group__1__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1545:1: rule__TextLn__Group__1__Impl : ( '(' ) ;
    public final void rule__TextLn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1549:1: ( ( '(' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1550:1: ( '(' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1550:1: ( '(' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1551:1: '('
            {
             before(grammarAccess.getTextLnAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__TextLn__Group__1__Impl3109); 
             after(grammarAccess.getTextLnAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__TextLn__Group__1__Impl"


    // $ANTLR start "rule__TextLn__Group__2"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1564:1: rule__TextLn__Group__2 : rule__TextLn__Group__2__Impl rule__TextLn__Group__3 ;
    public final void rule__TextLn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1568:1: ( rule__TextLn__Group__2__Impl rule__TextLn__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1569:2: rule__TextLn__Group__2__Impl rule__TextLn__Group__3
            {
            pushFollow(FOLLOW_rule__TextLn__Group__2__Impl_in_rule__TextLn__Group__23140);
            rule__TextLn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextLn__Group__3_in_rule__TextLn__Group__23143);
            rule__TextLn__Group__3();

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
    // $ANTLR end "rule__TextLn__Group__2"


    // $ANTLR start "rule__TextLn__Group__2__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1576:1: rule__TextLn__Group__2__Impl : ( ( rule__TextLn__LengthAssignment_2 ) ) ;
    public final void rule__TextLn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1580:1: ( ( ( rule__TextLn__LengthAssignment_2 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1581:1: ( ( rule__TextLn__LengthAssignment_2 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1581:1: ( ( rule__TextLn__LengthAssignment_2 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1582:1: ( rule__TextLn__LengthAssignment_2 )
            {
             before(grammarAccess.getTextLnAccess().getLengthAssignment_2()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1583:1: ( rule__TextLn__LengthAssignment_2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1583:2: rule__TextLn__LengthAssignment_2
            {
            pushFollow(FOLLOW_rule__TextLn__LengthAssignment_2_in_rule__TextLn__Group__2__Impl3170);
            rule__TextLn__LengthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextLnAccess().getLengthAssignment_2()); 

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
    // $ANTLR end "rule__TextLn__Group__2__Impl"


    // $ANTLR start "rule__TextLn__Group__3"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1593:1: rule__TextLn__Group__3 : rule__TextLn__Group__3__Impl ;
    public final void rule__TextLn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1597:1: ( rule__TextLn__Group__3__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1598:2: rule__TextLn__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TextLn__Group__3__Impl_in_rule__TextLn__Group__33200);
            rule__TextLn__Group__3__Impl();

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
    // $ANTLR end "rule__TextLn__Group__3"


    // $ANTLR start "rule__TextLn__Group__3__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1604:1: rule__TextLn__Group__3__Impl : ( ')' ) ;
    public final void rule__TextLn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1608:1: ( ( ')' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1609:1: ( ')' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1609:1: ( ')' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1610:1: ')'
            {
             before(grammarAccess.getTextLnAccess().getRightParenthesisKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__TextLn__Group__3__Impl3228); 
             after(grammarAccess.getTextLnAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__TextLn__Group__3__Impl"


    // $ANTLR start "rule__TextBl__Group__0"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1631:1: rule__TextBl__Group__0 : rule__TextBl__Group__0__Impl rule__TextBl__Group__1 ;
    public final void rule__TextBl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1635:1: ( rule__TextBl__Group__0__Impl rule__TextBl__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1636:2: rule__TextBl__Group__0__Impl rule__TextBl__Group__1
            {
            pushFollow(FOLLOW_rule__TextBl__Group__0__Impl_in_rule__TextBl__Group__03267);
            rule__TextBl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextBl__Group__1_in_rule__TextBl__Group__03270);
            rule__TextBl__Group__1();

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
    // $ANTLR end "rule__TextBl__Group__0"


    // $ANTLR start "rule__TextBl__Group__0__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1643:1: rule__TextBl__Group__0__Impl : ( 'TextBl' ) ;
    public final void rule__TextBl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1647:1: ( ( 'TextBl' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1648:1: ( 'TextBl' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1648:1: ( 'TextBl' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1649:1: 'TextBl'
            {
             before(grammarAccess.getTextBlAccess().getTextBlKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__TextBl__Group__0__Impl3298); 
             after(grammarAccess.getTextBlAccess().getTextBlKeyword_0()); 

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
    // $ANTLR end "rule__TextBl__Group__0__Impl"


    // $ANTLR start "rule__TextBl__Group__1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1662:1: rule__TextBl__Group__1 : rule__TextBl__Group__1__Impl rule__TextBl__Group__2 ;
    public final void rule__TextBl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1666:1: ( rule__TextBl__Group__1__Impl rule__TextBl__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1667:2: rule__TextBl__Group__1__Impl rule__TextBl__Group__2
            {
            pushFollow(FOLLOW_rule__TextBl__Group__1__Impl_in_rule__TextBl__Group__13329);
            rule__TextBl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextBl__Group__2_in_rule__TextBl__Group__13332);
            rule__TextBl__Group__2();

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
    // $ANTLR end "rule__TextBl__Group__1"


    // $ANTLR start "rule__TextBl__Group__1__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1674:1: rule__TextBl__Group__1__Impl : ( '(' ) ;
    public final void rule__TextBl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1678:1: ( ( '(' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1679:1: ( '(' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1679:1: ( '(' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1680:1: '('
            {
             before(grammarAccess.getTextBlAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__TextBl__Group__1__Impl3360); 
             after(grammarAccess.getTextBlAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__TextBl__Group__1__Impl"


    // $ANTLR start "rule__TextBl__Group__2"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1693:1: rule__TextBl__Group__2 : rule__TextBl__Group__2__Impl rule__TextBl__Group__3 ;
    public final void rule__TextBl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1697:1: ( rule__TextBl__Group__2__Impl rule__TextBl__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1698:2: rule__TextBl__Group__2__Impl rule__TextBl__Group__3
            {
            pushFollow(FOLLOW_rule__TextBl__Group__2__Impl_in_rule__TextBl__Group__23391);
            rule__TextBl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextBl__Group__3_in_rule__TextBl__Group__23394);
            rule__TextBl__Group__3();

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
    // $ANTLR end "rule__TextBl__Group__2"


    // $ANTLR start "rule__TextBl__Group__2__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1705:1: rule__TextBl__Group__2__Impl : ( ( rule__TextBl__LengthAssignment_2 ) ) ;
    public final void rule__TextBl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1709:1: ( ( ( rule__TextBl__LengthAssignment_2 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1710:1: ( ( rule__TextBl__LengthAssignment_2 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1710:1: ( ( rule__TextBl__LengthAssignment_2 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1711:1: ( rule__TextBl__LengthAssignment_2 )
            {
             before(grammarAccess.getTextBlAccess().getLengthAssignment_2()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1712:1: ( rule__TextBl__LengthAssignment_2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1712:2: rule__TextBl__LengthAssignment_2
            {
            pushFollow(FOLLOW_rule__TextBl__LengthAssignment_2_in_rule__TextBl__Group__2__Impl3421);
            rule__TextBl__LengthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextBlAccess().getLengthAssignment_2()); 

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
    // $ANTLR end "rule__TextBl__Group__2__Impl"


    // $ANTLR start "rule__TextBl__Group__3"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1722:1: rule__TextBl__Group__3 : rule__TextBl__Group__3__Impl ;
    public final void rule__TextBl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1726:1: ( rule__TextBl__Group__3__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1727:2: rule__TextBl__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TextBl__Group__3__Impl_in_rule__TextBl__Group__33451);
            rule__TextBl__Group__3__Impl();

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
    // $ANTLR end "rule__TextBl__Group__3"


    // $ANTLR start "rule__TextBl__Group__3__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1733:1: rule__TextBl__Group__3__Impl : ( ')' ) ;
    public final void rule__TextBl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1737:1: ( ( ')' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1738:1: ( ')' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1738:1: ( ')' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1739:1: ')'
            {
             before(grammarAccess.getTextBlAccess().getRightParenthesisKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__TextBl__Group__3__Impl3479); 
             after(grammarAccess.getTextBlAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__TextBl__Group__3__Impl"


    // $ANTLR start "rule__Matrix__Group__0"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1760:1: rule__Matrix__Group__0 : rule__Matrix__Group__0__Impl rule__Matrix__Group__1 ;
    public final void rule__Matrix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1764:1: ( rule__Matrix__Group__0__Impl rule__Matrix__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1765:2: rule__Matrix__Group__0__Impl rule__Matrix__Group__1
            {
            pushFollow(FOLLOW_rule__Matrix__Group__0__Impl_in_rule__Matrix__Group__03518);
            rule__Matrix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matrix__Group__1_in_rule__Matrix__Group__03521);
            rule__Matrix__Group__1();

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
    // $ANTLR end "rule__Matrix__Group__0"


    // $ANTLR start "rule__Matrix__Group__0__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1772:1: rule__Matrix__Group__0__Impl : ( 'Matrix' ) ;
    public final void rule__Matrix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1776:1: ( ( 'Matrix' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1777:1: ( 'Matrix' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1777:1: ( 'Matrix' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1778:1: 'Matrix'
            {
             before(grammarAccess.getMatrixAccess().getMatrixKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Matrix__Group__0__Impl3549); 
             after(grammarAccess.getMatrixAccess().getMatrixKeyword_0()); 

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
    // $ANTLR end "rule__Matrix__Group__0__Impl"


    // $ANTLR start "rule__Matrix__Group__1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1791:1: rule__Matrix__Group__1 : rule__Matrix__Group__1__Impl rule__Matrix__Group__2 ;
    public final void rule__Matrix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1795:1: ( rule__Matrix__Group__1__Impl rule__Matrix__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1796:2: rule__Matrix__Group__1__Impl rule__Matrix__Group__2
            {
            pushFollow(FOLLOW_rule__Matrix__Group__1__Impl_in_rule__Matrix__Group__13580);
            rule__Matrix__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matrix__Group__2_in_rule__Matrix__Group__13583);
            rule__Matrix__Group__2();

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
    // $ANTLR end "rule__Matrix__Group__1"


    // $ANTLR start "rule__Matrix__Group__1__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1803:1: rule__Matrix__Group__1__Impl : ( '(' ) ;
    public final void rule__Matrix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1807:1: ( ( '(' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1808:1: ( '(' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1808:1: ( '(' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1809:1: '('
            {
             before(grammarAccess.getMatrixAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Matrix__Group__1__Impl3611); 
             after(grammarAccess.getMatrixAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Matrix__Group__1__Impl"


    // $ANTLR start "rule__Matrix__Group__2"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1822:1: rule__Matrix__Group__2 : rule__Matrix__Group__2__Impl rule__Matrix__Group__3 ;
    public final void rule__Matrix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1826:1: ( rule__Matrix__Group__2__Impl rule__Matrix__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1827:2: rule__Matrix__Group__2__Impl rule__Matrix__Group__3
            {
            pushFollow(FOLLOW_rule__Matrix__Group__2__Impl_in_rule__Matrix__Group__23642);
            rule__Matrix__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matrix__Group__3_in_rule__Matrix__Group__23645);
            rule__Matrix__Group__3();

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
    // $ANTLR end "rule__Matrix__Group__2"


    // $ANTLR start "rule__Matrix__Group__2__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1834:1: rule__Matrix__Group__2__Impl : ( 'Scale:' ) ;
    public final void rule__Matrix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1838:1: ( ( 'Scale:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1839:1: ( 'Scale:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1839:1: ( 'Scale:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1840:1: 'Scale:'
            {
             before(grammarAccess.getMatrixAccess().getScaleKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__Matrix__Group__2__Impl3673); 
             after(grammarAccess.getMatrixAccess().getScaleKeyword_2()); 

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
    // $ANTLR end "rule__Matrix__Group__2__Impl"


    // $ANTLR start "rule__Matrix__Group__3"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1853:1: rule__Matrix__Group__3 : rule__Matrix__Group__3__Impl rule__Matrix__Group__4 ;
    public final void rule__Matrix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1857:1: ( rule__Matrix__Group__3__Impl rule__Matrix__Group__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1858:2: rule__Matrix__Group__3__Impl rule__Matrix__Group__4
            {
            pushFollow(FOLLOW_rule__Matrix__Group__3__Impl_in_rule__Matrix__Group__33704);
            rule__Matrix__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matrix__Group__4_in_rule__Matrix__Group__33707);
            rule__Matrix__Group__4();

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
    // $ANTLR end "rule__Matrix__Group__3"


    // $ANTLR start "rule__Matrix__Group__3__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1865:1: rule__Matrix__Group__3__Impl : ( '(' ) ;
    public final void rule__Matrix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1869:1: ( ( '(' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1870:1: ( '(' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1870:1: ( '(' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1871:1: '('
            {
             before(grammarAccess.getMatrixAccess().getLeftParenthesisKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Matrix__Group__3__Impl3735); 
             after(grammarAccess.getMatrixAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Matrix__Group__3__Impl"


    // $ANTLR start "rule__Matrix__Group__4"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1884:1: rule__Matrix__Group__4 : rule__Matrix__Group__4__Impl rule__Matrix__Group__5 ;
    public final void rule__Matrix__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1888:1: ( rule__Matrix__Group__4__Impl rule__Matrix__Group__5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1889:2: rule__Matrix__Group__4__Impl rule__Matrix__Group__5
            {
            pushFollow(FOLLOW_rule__Matrix__Group__4__Impl_in_rule__Matrix__Group__43766);
            rule__Matrix__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matrix__Group__5_in_rule__Matrix__Group__43769);
            rule__Matrix__Group__5();

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
    // $ANTLR end "rule__Matrix__Group__4"


    // $ANTLR start "rule__Matrix__Group__4__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1896:1: rule__Matrix__Group__4__Impl : ( ruleIdentifier ) ;
    public final void rule__Matrix__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1900:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1901:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1901:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1902:1: ruleIdentifier
            {
             before(grammarAccess.getMatrixAccess().getIdentifierParserRuleCall_4()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Matrix__Group__4__Impl3796);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getMatrixAccess().getIdentifierParserRuleCall_4()); 

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
    // $ANTLR end "rule__Matrix__Group__4__Impl"


    // $ANTLR start "rule__Matrix__Group__5"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1913:1: rule__Matrix__Group__5 : rule__Matrix__Group__5__Impl rule__Matrix__Group__6 ;
    public final void rule__Matrix__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1917:1: ( rule__Matrix__Group__5__Impl rule__Matrix__Group__6 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1918:2: rule__Matrix__Group__5__Impl rule__Matrix__Group__6
            {
            pushFollow(FOLLOW_rule__Matrix__Group__5__Impl_in_rule__Matrix__Group__53825);
            rule__Matrix__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matrix__Group__6_in_rule__Matrix__Group__53828);
            rule__Matrix__Group__6();

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
    // $ANTLR end "rule__Matrix__Group__5"


    // $ANTLR start "rule__Matrix__Group__5__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1925:1: rule__Matrix__Group__5__Impl : ( ( rule__Matrix__Group_5__0 )* ) ;
    public final void rule__Matrix__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1929:1: ( ( ( rule__Matrix__Group_5__0 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1930:1: ( ( rule__Matrix__Group_5__0 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1930:1: ( ( rule__Matrix__Group_5__0 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1931:1: ( rule__Matrix__Group_5__0 )*
            {
             before(grammarAccess.getMatrixAccess().getGroup_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1932:1: ( rule__Matrix__Group_5__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1932:2: rule__Matrix__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Matrix__Group_5__0_in_rule__Matrix__Group__5__Impl3855);
            	    rule__Matrix__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMatrixAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Matrix__Group__5__Impl"


    // $ANTLR start "rule__Matrix__Group__6"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1942:1: rule__Matrix__Group__6 : rule__Matrix__Group__6__Impl rule__Matrix__Group__7 ;
    public final void rule__Matrix__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1946:1: ( rule__Matrix__Group__6__Impl rule__Matrix__Group__7 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1947:2: rule__Matrix__Group__6__Impl rule__Matrix__Group__7
            {
            pushFollow(FOLLOW_rule__Matrix__Group__6__Impl_in_rule__Matrix__Group__63886);
            rule__Matrix__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matrix__Group__7_in_rule__Matrix__Group__63889);
            rule__Matrix__Group__7();

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
    // $ANTLR end "rule__Matrix__Group__6"


    // $ANTLR start "rule__Matrix__Group__6__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1954:1: rule__Matrix__Group__6__Impl : ( ')' ) ;
    public final void rule__Matrix__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1958:1: ( ( ')' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1959:1: ( ')' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1959:1: ( ')' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1960:1: ')'
            {
             before(grammarAccess.getMatrixAccess().getRightParenthesisKeyword_6()); 
            match(input,24,FOLLOW_24_in_rule__Matrix__Group__6__Impl3917); 
             after(grammarAccess.getMatrixAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Matrix__Group__6__Impl"


    // $ANTLR start "rule__Matrix__Group__7"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1973:1: rule__Matrix__Group__7 : rule__Matrix__Group__7__Impl rule__Matrix__Group__8 ;
    public final void rule__Matrix__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1977:1: ( rule__Matrix__Group__7__Impl rule__Matrix__Group__8 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1978:2: rule__Matrix__Group__7__Impl rule__Matrix__Group__8
            {
            pushFollow(FOLLOW_rule__Matrix__Group__7__Impl_in_rule__Matrix__Group__73948);
            rule__Matrix__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matrix__Group__8_in_rule__Matrix__Group__73951);
            rule__Matrix__Group__8();

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
    // $ANTLR end "rule__Matrix__Group__7"


    // $ANTLR start "rule__Matrix__Group__7__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1985:1: rule__Matrix__Group__7__Impl : ( 'Questions:' ) ;
    public final void rule__Matrix__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1989:1: ( ( 'Questions:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1990:1: ( 'Questions:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1990:1: ( 'Questions:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1991:1: 'Questions:'
            {
             before(grammarAccess.getMatrixAccess().getQuestionsKeyword_7()); 
            match(input,28,FOLLOW_28_in_rule__Matrix__Group__7__Impl3979); 
             after(grammarAccess.getMatrixAccess().getQuestionsKeyword_7()); 

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
    // $ANTLR end "rule__Matrix__Group__7__Impl"


    // $ANTLR start "rule__Matrix__Group__8"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2004:1: rule__Matrix__Group__8 : rule__Matrix__Group__8__Impl rule__Matrix__Group__9 ;
    public final void rule__Matrix__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2008:1: ( rule__Matrix__Group__8__Impl rule__Matrix__Group__9 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2009:2: rule__Matrix__Group__8__Impl rule__Matrix__Group__9
            {
            pushFollow(FOLLOW_rule__Matrix__Group__8__Impl_in_rule__Matrix__Group__84010);
            rule__Matrix__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matrix__Group__9_in_rule__Matrix__Group__84013);
            rule__Matrix__Group__9();

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
    // $ANTLR end "rule__Matrix__Group__8"


    // $ANTLR start "rule__Matrix__Group__8__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2016:1: rule__Matrix__Group__8__Impl : ( '(' ) ;
    public final void rule__Matrix__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2020:1: ( ( '(' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2021:1: ( '(' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2021:1: ( '(' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2022:1: '('
            {
             before(grammarAccess.getMatrixAccess().getLeftParenthesisKeyword_8()); 
            match(input,23,FOLLOW_23_in_rule__Matrix__Group__8__Impl4041); 
             after(grammarAccess.getMatrixAccess().getLeftParenthesisKeyword_8()); 

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
    // $ANTLR end "rule__Matrix__Group__8__Impl"


    // $ANTLR start "rule__Matrix__Group__9"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2035:1: rule__Matrix__Group__9 : rule__Matrix__Group__9__Impl rule__Matrix__Group__10 ;
    public final void rule__Matrix__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2039:1: ( rule__Matrix__Group__9__Impl rule__Matrix__Group__10 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2040:2: rule__Matrix__Group__9__Impl rule__Matrix__Group__10
            {
            pushFollow(FOLLOW_rule__Matrix__Group__9__Impl_in_rule__Matrix__Group__94072);
            rule__Matrix__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matrix__Group__10_in_rule__Matrix__Group__94075);
            rule__Matrix__Group__10();

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
    // $ANTLR end "rule__Matrix__Group__9"


    // $ANTLR start "rule__Matrix__Group__9__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2047:1: rule__Matrix__Group__9__Impl : ( ( rule__Matrix__AnswerAssignment_9 ) ) ;
    public final void rule__Matrix__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2051:1: ( ( ( rule__Matrix__AnswerAssignment_9 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2052:1: ( ( rule__Matrix__AnswerAssignment_9 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2052:1: ( ( rule__Matrix__AnswerAssignment_9 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2053:1: ( rule__Matrix__AnswerAssignment_9 )
            {
             before(grammarAccess.getMatrixAccess().getAnswerAssignment_9()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2054:1: ( rule__Matrix__AnswerAssignment_9 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2054:2: rule__Matrix__AnswerAssignment_9
            {
            pushFollow(FOLLOW_rule__Matrix__AnswerAssignment_9_in_rule__Matrix__Group__9__Impl4102);
            rule__Matrix__AnswerAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getMatrixAccess().getAnswerAssignment_9()); 

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
    // $ANTLR end "rule__Matrix__Group__9__Impl"


    // $ANTLR start "rule__Matrix__Group__10"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2064:1: rule__Matrix__Group__10 : rule__Matrix__Group__10__Impl rule__Matrix__Group__11 ;
    public final void rule__Matrix__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2068:1: ( rule__Matrix__Group__10__Impl rule__Matrix__Group__11 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2069:2: rule__Matrix__Group__10__Impl rule__Matrix__Group__11
            {
            pushFollow(FOLLOW_rule__Matrix__Group__10__Impl_in_rule__Matrix__Group__104132);
            rule__Matrix__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matrix__Group__11_in_rule__Matrix__Group__104135);
            rule__Matrix__Group__11();

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
    // $ANTLR end "rule__Matrix__Group__10"


    // $ANTLR start "rule__Matrix__Group__10__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2076:1: rule__Matrix__Group__10__Impl : ( ( rule__Matrix__Group_10__0 )* ) ;
    public final void rule__Matrix__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2080:1: ( ( ( rule__Matrix__Group_10__0 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2081:1: ( ( rule__Matrix__Group_10__0 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2081:1: ( ( rule__Matrix__Group_10__0 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2082:1: ( rule__Matrix__Group_10__0 )*
            {
             before(grammarAccess.getMatrixAccess().getGroup_10()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2083:1: ( rule__Matrix__Group_10__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2083:2: rule__Matrix__Group_10__0
            	    {
            	    pushFollow(FOLLOW_rule__Matrix__Group_10__0_in_rule__Matrix__Group__10__Impl4162);
            	    rule__Matrix__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMatrixAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Matrix__Group__10__Impl"


    // $ANTLR start "rule__Matrix__Group__11"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2093:1: rule__Matrix__Group__11 : rule__Matrix__Group__11__Impl rule__Matrix__Group__12 ;
    public final void rule__Matrix__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2097:1: ( rule__Matrix__Group__11__Impl rule__Matrix__Group__12 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2098:2: rule__Matrix__Group__11__Impl rule__Matrix__Group__12
            {
            pushFollow(FOLLOW_rule__Matrix__Group__11__Impl_in_rule__Matrix__Group__114193);
            rule__Matrix__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matrix__Group__12_in_rule__Matrix__Group__114196);
            rule__Matrix__Group__12();

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
    // $ANTLR end "rule__Matrix__Group__11"


    // $ANTLR start "rule__Matrix__Group__11__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2105:1: rule__Matrix__Group__11__Impl : ( ')' ) ;
    public final void rule__Matrix__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2109:1: ( ( ')' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2110:1: ( ')' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2110:1: ( ')' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2111:1: ')'
            {
             before(grammarAccess.getMatrixAccess().getRightParenthesisKeyword_11()); 
            match(input,24,FOLLOW_24_in_rule__Matrix__Group__11__Impl4224); 
             after(grammarAccess.getMatrixAccess().getRightParenthesisKeyword_11()); 

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
    // $ANTLR end "rule__Matrix__Group__11__Impl"


    // $ANTLR start "rule__Matrix__Group__12"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2124:1: rule__Matrix__Group__12 : rule__Matrix__Group__12__Impl ;
    public final void rule__Matrix__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2128:1: ( rule__Matrix__Group__12__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2129:2: rule__Matrix__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__Matrix__Group__12__Impl_in_rule__Matrix__Group__124255);
            rule__Matrix__Group__12__Impl();

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
    // $ANTLR end "rule__Matrix__Group__12"


    // $ANTLR start "rule__Matrix__Group__12__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2135:1: rule__Matrix__Group__12__Impl : ( ')' ) ;
    public final void rule__Matrix__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2139:1: ( ( ')' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2140:1: ( ')' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2140:1: ( ')' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2141:1: ')'
            {
             before(grammarAccess.getMatrixAccess().getRightParenthesisKeyword_12()); 
            match(input,24,FOLLOW_24_in_rule__Matrix__Group__12__Impl4283); 
             after(grammarAccess.getMatrixAccess().getRightParenthesisKeyword_12()); 

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
    // $ANTLR end "rule__Matrix__Group__12__Impl"


    // $ANTLR start "rule__Matrix__Group_5__0"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2180:1: rule__Matrix__Group_5__0 : rule__Matrix__Group_5__0__Impl rule__Matrix__Group_5__1 ;
    public final void rule__Matrix__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2184:1: ( rule__Matrix__Group_5__0__Impl rule__Matrix__Group_5__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2185:2: rule__Matrix__Group_5__0__Impl rule__Matrix__Group_5__1
            {
            pushFollow(FOLLOW_rule__Matrix__Group_5__0__Impl_in_rule__Matrix__Group_5__04340);
            rule__Matrix__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matrix__Group_5__1_in_rule__Matrix__Group_5__04343);
            rule__Matrix__Group_5__1();

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
    // $ANTLR end "rule__Matrix__Group_5__0"


    // $ANTLR start "rule__Matrix__Group_5__0__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2192:1: rule__Matrix__Group_5__0__Impl : ( '|' ) ;
    public final void rule__Matrix__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2196:1: ( ( '|' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2197:1: ( '|' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2197:1: ( '|' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2198:1: '|'
            {
             before(grammarAccess.getMatrixAccess().getVerticalLineKeyword_5_0()); 
            match(input,29,FOLLOW_29_in_rule__Matrix__Group_5__0__Impl4371); 
             after(grammarAccess.getMatrixAccess().getVerticalLineKeyword_5_0()); 

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
    // $ANTLR end "rule__Matrix__Group_5__0__Impl"


    // $ANTLR start "rule__Matrix__Group_5__1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2211:1: rule__Matrix__Group_5__1 : rule__Matrix__Group_5__1__Impl ;
    public final void rule__Matrix__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2215:1: ( rule__Matrix__Group_5__1__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2216:2: rule__Matrix__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Matrix__Group_5__1__Impl_in_rule__Matrix__Group_5__14402);
            rule__Matrix__Group_5__1__Impl();

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
    // $ANTLR end "rule__Matrix__Group_5__1"


    // $ANTLR start "rule__Matrix__Group_5__1__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2222:1: rule__Matrix__Group_5__1__Impl : ( ruleIdentifier ) ;
    public final void rule__Matrix__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2226:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2227:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2227:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2228:1: ruleIdentifier
            {
             before(grammarAccess.getMatrixAccess().getIdentifierParserRuleCall_5_1()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Matrix__Group_5__1__Impl4429);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getMatrixAccess().getIdentifierParserRuleCall_5_1()); 

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
    // $ANTLR end "rule__Matrix__Group_5__1__Impl"


    // $ANTLR start "rule__Matrix__Group_10__0"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2243:1: rule__Matrix__Group_10__0 : rule__Matrix__Group_10__0__Impl rule__Matrix__Group_10__1 ;
    public final void rule__Matrix__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2247:1: ( rule__Matrix__Group_10__0__Impl rule__Matrix__Group_10__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2248:2: rule__Matrix__Group_10__0__Impl rule__Matrix__Group_10__1
            {
            pushFollow(FOLLOW_rule__Matrix__Group_10__0__Impl_in_rule__Matrix__Group_10__04462);
            rule__Matrix__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Matrix__Group_10__1_in_rule__Matrix__Group_10__04465);
            rule__Matrix__Group_10__1();

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
    // $ANTLR end "rule__Matrix__Group_10__0"


    // $ANTLR start "rule__Matrix__Group_10__0__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2255:1: rule__Matrix__Group_10__0__Impl : ( '|' ) ;
    public final void rule__Matrix__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2259:1: ( ( '|' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2260:1: ( '|' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2260:1: ( '|' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2261:1: '|'
            {
             before(grammarAccess.getMatrixAccess().getVerticalLineKeyword_10_0()); 
            match(input,29,FOLLOW_29_in_rule__Matrix__Group_10__0__Impl4493); 
             after(grammarAccess.getMatrixAccess().getVerticalLineKeyword_10_0()); 

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
    // $ANTLR end "rule__Matrix__Group_10__0__Impl"


    // $ANTLR start "rule__Matrix__Group_10__1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2274:1: rule__Matrix__Group_10__1 : rule__Matrix__Group_10__1__Impl ;
    public final void rule__Matrix__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2278:1: ( rule__Matrix__Group_10__1__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2279:2: rule__Matrix__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__Matrix__Group_10__1__Impl_in_rule__Matrix__Group_10__14524);
            rule__Matrix__Group_10__1__Impl();

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
    // $ANTLR end "rule__Matrix__Group_10__1"


    // $ANTLR start "rule__Matrix__Group_10__1__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2285:1: rule__Matrix__Group_10__1__Impl : ( ( rule__Matrix__AnswerAssignment_10_1 ) ) ;
    public final void rule__Matrix__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2289:1: ( ( ( rule__Matrix__AnswerAssignment_10_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2290:1: ( ( rule__Matrix__AnswerAssignment_10_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2290:1: ( ( rule__Matrix__AnswerAssignment_10_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2291:1: ( rule__Matrix__AnswerAssignment_10_1 )
            {
             before(grammarAccess.getMatrixAccess().getAnswerAssignment_10_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2292:1: ( rule__Matrix__AnswerAssignment_10_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2292:2: rule__Matrix__AnswerAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Matrix__AnswerAssignment_10_1_in_rule__Matrix__Group_10__1__Impl4551);
            rule__Matrix__AnswerAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getMatrixAccess().getAnswerAssignment_10_1()); 

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
    // $ANTLR end "rule__Matrix__Group_10__1__Impl"


    // $ANTLR start "rule__Survey__QuestionnaireAssignment"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2307:1: rule__Survey__QuestionnaireAssignment : ( ruleQuestionnaire ) ;
    public final void rule__Survey__QuestionnaireAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2311:1: ( ( ruleQuestionnaire ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2312:1: ( ruleQuestionnaire )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2312:1: ( ruleQuestionnaire )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2313:1: ruleQuestionnaire
            {
             before(grammarAccess.getSurveyAccess().getQuestionnaireQuestionnaireParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQuestionnaire_in_rule__Survey__QuestionnaireAssignment4590);
            ruleQuestionnaire();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getQuestionnaireQuestionnaireParserRuleCall_0()); 

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
    // $ANTLR end "rule__Survey__QuestionnaireAssignment"


    // $ANTLR start "rule__Questionnaire__NameAssignment_1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2322:1: rule__Questionnaire__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Questionnaire__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2326:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2327:1: ( RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2327:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2328:1: RULE_STRING
            {
             before(grammarAccess.getQuestionnaireAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Questionnaire__NameAssignment_14621); 
             after(grammarAccess.getQuestionnaireAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Questionnaire__NameAssignment_1"


    // $ANTLR start "rule__Questionnaire__IdAssignment_4"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2337:1: rule__Questionnaire__IdAssignment_4 : ( ruleIdentifier ) ;
    public final void rule__Questionnaire__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2341:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2342:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2342:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2343:1: ruleIdentifier
            {
             before(grammarAccess.getQuestionnaireAccess().getIdIdentifierParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Questionnaire__IdAssignment_44652);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getIdIdentifierParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Questionnaire__IdAssignment_4"


    // $ANTLR start "rule__Questionnaire__PartAssignment_5"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2352:1: rule__Questionnaire__PartAssignment_5 : ( rulePart ) ;
    public final void rule__Questionnaire__PartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2356:1: ( ( rulePart ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2357:1: ( rulePart )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2357:1: ( rulePart )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2358:1: rulePart
            {
             before(grammarAccess.getQuestionnaireAccess().getPartPartParserRuleCall_5_0()); 
            pushFollow(FOLLOW_rulePart_in_rule__Questionnaire__PartAssignment_54683);
            rulePart();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getPartPartParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Questionnaire__PartAssignment_5"


    // $ANTLR start "rule__Part__NameAssignment_1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2367:1: rule__Part__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Part__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2371:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2372:1: ( RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2372:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2373:1: RULE_STRING
            {
             before(grammarAccess.getPartAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Part__NameAssignment_14714); 
             after(grammarAccess.getPartAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Part__NameAssignment_1"


    // $ANTLR start "rule__Part__IdAssignment_4"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2382:1: rule__Part__IdAssignment_4 : ( ruleIdentifier ) ;
    public final void rule__Part__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2386:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2387:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2387:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2388:1: ruleIdentifier
            {
             before(grammarAccess.getPartAccess().getIdIdentifierParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Part__IdAssignment_44745);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getPartAccess().getIdIdentifierParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Part__IdAssignment_4"


    // $ANTLR start "rule__Part__QuestionAssignment_5"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2397:1: rule__Part__QuestionAssignment_5 : ( ruleQuestion ) ;
    public final void rule__Part__QuestionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2401:1: ( ( ruleQuestion ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2402:1: ( ruleQuestion )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2402:1: ( ruleQuestion )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2403:1: ruleQuestion
            {
             before(grammarAccess.getPartAccess().getQuestionQuestionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Part__QuestionAssignment_54776);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getPartAccess().getQuestionQuestionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Part__QuestionAssignment_5"


    // $ANTLR start "rule__Question__NameAssignment_1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2412:1: rule__Question__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Question__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2416:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2417:1: ( RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2417:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2418:1: RULE_STRING
            {
             before(grammarAccess.getQuestionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Question__NameAssignment_14807); 
             after(grammarAccess.getQuestionAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Question__NameAssignment_1"


    // $ANTLR start "rule__Question__IdAssignment_4"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2427:1: rule__Question__IdAssignment_4 : ( ruleIdentifier ) ;
    public final void rule__Question__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2431:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2432:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2432:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2433:1: ruleIdentifier
            {
             before(grammarAccess.getQuestionAccess().getIdIdentifierParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Question__IdAssignment_44838);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getIdIdentifierParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Question__IdAssignment_4"


    // $ANTLR start "rule__Question__MandatoryAssignment_6"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2442:1: rule__Question__MandatoryAssignment_6 : ( ruleMandatory ) ;
    public final void rule__Question__MandatoryAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2446:1: ( ( ruleMandatory ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2447:1: ( ruleMandatory )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2447:1: ( ruleMandatory )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2448:1: ruleMandatory
            {
             before(grammarAccess.getQuestionAccess().getMandatoryMandatoryParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleMandatory_in_rule__Question__MandatoryAssignment_64869);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getMandatoryMandatoryParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Question__MandatoryAssignment_6"


    // $ANTLR start "rule__Question__TypeAssignment_8"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2457:1: rule__Question__TypeAssignment_8 : ( ruleType ) ;
    public final void rule__Question__TypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2461:1: ( ( ruleType ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2462:1: ( ruleType )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2462:1: ( ruleType )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2463:1: ruleType
            {
             before(grammarAccess.getQuestionAccess().getTypeTypeParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Question__TypeAssignment_84900);
            ruleType();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getTypeTypeParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Question__TypeAssignment_8"


    // $ANTLR start "rule__Question__AnswerAssignment_9"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2472:1: rule__Question__AnswerAssignment_9 : ( ruleAnswer ) ;
    public final void rule__Question__AnswerAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2476:1: ( ( ruleAnswer ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2477:1: ( ruleAnswer )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2477:1: ( ruleAnswer )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2478:1: ruleAnswer
            {
             before(grammarAccess.getQuestionAccess().getAnswerAnswerParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleAnswer_in_rule__Question__AnswerAssignment_94931);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getAnswerAnswerParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Question__AnswerAssignment_9"


    // $ANTLR start "rule__Answer__IdAssignment_1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2487:1: rule__Answer__IdAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__Answer__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2491:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2492:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2492:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2493:1: ruleIdentifier
            {
             before(grammarAccess.getAnswerAccess().getIdIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Answer__IdAssignment_14962);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getIdIdentifierParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Answer__IdAssignment_1"


    // $ANTLR start "rule__Answer__NameAssignment_3"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2502:1: rule__Answer__NameAssignment_3 : ( ruleIdentifier ) ;
    public final void rule__Answer__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2506:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2507:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2507:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2508:1: ruleIdentifier
            {
             before(grammarAccess.getAnswerAccess().getNameIdentifierParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Answer__NameAssignment_34993);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getNameIdentifierParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Answer__NameAssignment_3"


    // $ANTLR start "rule__TextLn__LengthAssignment_2"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2517:1: rule__TextLn__LengthAssignment_2 : ( RULE_INT ) ;
    public final void rule__TextLn__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2521:1: ( ( RULE_INT ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2522:1: ( RULE_INT )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2522:1: ( RULE_INT )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2523:1: RULE_INT
            {
             before(grammarAccess.getTextLnAccess().getLengthINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TextLn__LengthAssignment_25024); 
             after(grammarAccess.getTextLnAccess().getLengthINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__TextLn__LengthAssignment_2"


    // $ANTLR start "rule__TextBl__LengthAssignment_2"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2532:1: rule__TextBl__LengthAssignment_2 : ( RULE_INT ) ;
    public final void rule__TextBl__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2536:1: ( ( RULE_INT ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2537:1: ( RULE_INT )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2537:1: ( RULE_INT )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2538:1: RULE_INT
            {
             before(grammarAccess.getTextBlAccess().getLengthINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TextBl__LengthAssignment_25055); 
             after(grammarAccess.getTextBlAccess().getLengthINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__TextBl__LengthAssignment_2"


    // $ANTLR start "rule__Matrix__AnswerAssignment_9"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2547:1: rule__Matrix__AnswerAssignment_9 : ( ruleAnswer ) ;
    public final void rule__Matrix__AnswerAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2551:1: ( ( ruleAnswer ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2552:1: ( ruleAnswer )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2552:1: ( ruleAnswer )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2553:1: ruleAnswer
            {
             before(grammarAccess.getMatrixAccess().getAnswerAnswerParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleAnswer_in_rule__Matrix__AnswerAssignment_95086);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getMatrixAccess().getAnswerAnswerParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Matrix__AnswerAssignment_9"


    // $ANTLR start "rule__Matrix__AnswerAssignment_10_1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2562:1: rule__Matrix__AnswerAssignment_10_1 : ( ruleAnswer ) ;
    public final void rule__Matrix__AnswerAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2566:1: ( ( ruleAnswer ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2567:1: ( ruleAnswer )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2567:1: ( ruleAnswer )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2568:1: ruleAnswer
            {
             before(grammarAccess.getMatrixAccess().getAnswerAnswerParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_ruleAnswer_in_rule__Matrix__AnswerAssignment_10_15117);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getMatrixAccess().getAnswerAnswerParserRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__Matrix__AnswerAssignment_10_1"


    // $ANTLR start "rule__ComboBox__NameAssignment"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2577:1: rule__ComboBox__NameAssignment : ( ( 'ComboBox' ) ) ;
    public final void rule__ComboBox__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2581:1: ( ( ( 'ComboBox' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2582:1: ( ( 'ComboBox' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2582:1: ( ( 'ComboBox' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2583:1: ( 'ComboBox' )
            {
             before(grammarAccess.getComboBoxAccess().getNameComboBoxKeyword_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2584:1: ( 'ComboBox' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2585:1: 'ComboBox'
            {
             before(grammarAccess.getComboBoxAccess().getNameComboBoxKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__ComboBox__NameAssignment5153); 
             after(grammarAccess.getComboBoxAccess().getNameComboBoxKeyword_0()); 

            }

             after(grammarAccess.getComboBoxAccess().getNameComboBoxKeyword_0()); 

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
    // $ANTLR end "rule__ComboBox__NameAssignment"


    // $ANTLR start "rule__DropDown__NameAssignment"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2600:1: rule__DropDown__NameAssignment : ( ( 'DropDown' ) ) ;
    public final void rule__DropDown__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2604:1: ( ( ( 'DropDown' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2605:1: ( ( 'DropDown' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2605:1: ( ( 'DropDown' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2606:1: ( 'DropDown' )
            {
             before(grammarAccess.getDropDownAccess().getNameDropDownKeyword_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2607:1: ( 'DropDown' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2608:1: 'DropDown'
            {
             before(grammarAccess.getDropDownAccess().getNameDropDownKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__DropDown__NameAssignment5197); 
             after(grammarAccess.getDropDownAccess().getNameDropDownKeyword_0()); 

            }

             after(grammarAccess.getDropDownAccess().getNameDropDownKeyword_0()); 

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
    // $ANTLR end "rule__DropDown__NameAssignment"


    // $ANTLR start "rule__Radio__NameAssignment"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2623:1: rule__Radio__NameAssignment : ( ( 'Radio' ) ) ;
    public final void rule__Radio__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2627:1: ( ( ( 'Radio' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2628:1: ( ( 'Radio' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2628:1: ( ( 'Radio' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2629:1: ( 'Radio' )
            {
             before(grammarAccess.getRadioAccess().getNameRadioKeyword_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2630:1: ( 'Radio' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2631:1: 'Radio'
            {
             before(grammarAccess.getRadioAccess().getNameRadioKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Radio__NameAssignment5241); 
             after(grammarAccess.getRadioAccess().getNameRadioKeyword_0()); 

            }

             after(grammarAccess.getRadioAccess().getNameRadioKeyword_0()); 

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
    // $ANTLR end "rule__Radio__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurvey68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__QuestionnaireAssignment_in_ruleSurvey96 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Survey__QuestionnaireAssignment_in_ruleSurvey108 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionnaire145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__0_in_ruleQuestionnaire171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__0_in_rulePart231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0_in_ruleQuestion291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnswer325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__0_in_ruleAnswer351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextLn_in_entryRuleTextLn378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextLn385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextLn__Group__0_in_ruleTextLn411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextBl_in_entryRuleTextBl438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextBl445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextBl__Group__0_in_ruleTextBl471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_entryRuleMatrix498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrix505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group__0_in_ruleMatrix531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComboBox_in_entryRuleComboBox558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComboBox565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboBox__NameAssignment_in_ruleComboBox591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropDown_in_entryRuleDropDown618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropDown625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DropDown__NameAssignment_in_ruleDropDown651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadio_in_entryRuleRadio678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRadio685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Radio__NameAssignment_in_ruleRadio711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Alternatives_in_ruleIdentifier771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Alternatives_in_ruleMandatory831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Identifier__Alternatives927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Identifier__Alternatives944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Identifier__Alternatives961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Mandatory__Alternatives994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Mandatory__Alternatives1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextLn_in_rule__Type__Alternatives1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComboBox_in_rule__Type__Alternatives1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropDown_in_rule__Type__Alternatives1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextBl_in_rule__Type__Alternatives1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_rule__Type__Alternatives1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadio_in_rule__Type__Alternatives1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__0__Impl_in_rule__Questionnaire__Group__01163 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__1_in_rule__Questionnaire__Group__01166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Questionnaire__Group__0__Impl1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__1__Impl_in_rule__Questionnaire__Group__11225 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__2_in_rule__Questionnaire__Group__11228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__NameAssignment_1_in_rule__Questionnaire__Group__1__Impl1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__2__Impl_in_rule__Questionnaire__Group__21285 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__3_in_rule__Questionnaire__Group__21288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Questionnaire__Group__2__Impl1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__3__Impl_in_rule__Questionnaire__Group__31347 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__4_in_rule__Questionnaire__Group__31350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Questionnaire__Group__3__Impl1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__4__Impl_in_rule__Questionnaire__Group__41409 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__5_in_rule__Questionnaire__Group__41412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__IdAssignment_4_in_rule__Questionnaire__Group__4__Impl1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__5__Impl_in_rule__Questionnaire__Group__51469 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__6_in_rule__Questionnaire__Group__51472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__PartAssignment_5_in_rule__Questionnaire__Group__5__Impl1501 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Questionnaire__PartAssignment_5_in_rule__Questionnaire__Group__5__Impl1513 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__6__Impl_in_rule__Questionnaire__Group__61546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Questionnaire__Group__6__Impl1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__0__Impl_in_rule__Part__Group__01619 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Part__Group__1_in_rule__Part__Group__01622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Part__Group__0__Impl1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__1__Impl_in_rule__Part__Group__11681 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Part__Group__2_in_rule__Part__Group__11684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__NameAssignment_1_in_rule__Part__Group__1__Impl1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__2__Impl_in_rule__Part__Group__21741 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Part__Group__3_in_rule__Part__Group__21744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Part__Group__2__Impl1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__3__Impl_in_rule__Part__Group__31803 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Part__Group__4_in_rule__Part__Group__31806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Part__Group__3__Impl1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__4__Impl_in_rule__Part__Group__41865 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Part__Group__5_in_rule__Part__Group__41868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__IdAssignment_4_in_rule__Part__Group__4__Impl1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__5__Impl_in_rule__Part__Group__51925 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Part__Group__6_in_rule__Part__Group__51928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__QuestionAssignment_5_in_rule__Part__Group__5__Impl1957 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Part__QuestionAssignment_5_in_rule__Part__Group__5__Impl1969 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Part__Group__6__Impl_in_rule__Part__Group__62002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Part__Group__6__Impl2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__02075 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Question__Group__1_in_rule__Question__Group__02078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Question__Group__0__Impl2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__12137 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Question__Group__2_in_rule__Question__Group__12140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__NameAssignment_1_in_rule__Question__Group__1__Impl2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__22197 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Question__Group__3_in_rule__Question__Group__22200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Question__Group__2__Impl2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__32259 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Question__Group__4_in_rule__Question__Group__32262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Question__Group__3__Impl2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__42321 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Question__Group__5_in_rule__Question__Group__42324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__IdAssignment_4_in_rule__Question__Group__4__Impl2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__52381 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Question__Group__6_in_rule__Question__Group__52384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Question__Group__5__Impl2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__62443 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Question__Group__7_in_rule__Question__Group__62446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__MandatoryAssignment_6_in_rule__Question__Group__6__Impl2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__7__Impl_in_rule__Question__Group__72503 = new BitSet(new long[]{0x00000001C6400000L});
    public static final BitSet FOLLOW_rule__Question__Group__8_in_rule__Question__Group__72506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Question__Group__7__Impl2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__8__Impl_in_rule__Question__Group__82565 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Question__Group__9_in_rule__Question__Group__82568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__TypeAssignment_8_in_rule__Question__Group__8__Impl2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__9__Impl_in_rule__Question__Group__92625 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Question__Group__10_in_rule__Question__Group__92628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__AnswerAssignment_9_in_rule__Question__Group__9__Impl2655 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Question__Group__10__Impl_in_rule__Question__Group__102686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Question__Group__10__Impl2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__02767 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__02770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Answer__Group__0__Impl2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__12829 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__12832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__IdAssignment_1_in_rule__Answer__Group__1__Impl2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__22889 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__22892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Answer__Group__2__Impl2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__32951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__NameAssignment_3_in_rule__Answer__Group__3__Impl2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextLn__Group__0__Impl_in_rule__TextLn__Group__03016 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TextLn__Group__1_in_rule__TextLn__Group__03019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TextLn__Group__0__Impl3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextLn__Group__1__Impl_in_rule__TextLn__Group__13078 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TextLn__Group__2_in_rule__TextLn__Group__13081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TextLn__Group__1__Impl3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextLn__Group__2__Impl_in_rule__TextLn__Group__23140 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TextLn__Group__3_in_rule__TextLn__Group__23143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextLn__LengthAssignment_2_in_rule__TextLn__Group__2__Impl3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextLn__Group__3__Impl_in_rule__TextLn__Group__33200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TextLn__Group__3__Impl3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextBl__Group__0__Impl_in_rule__TextBl__Group__03267 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TextBl__Group__1_in_rule__TextBl__Group__03270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TextBl__Group__0__Impl3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextBl__Group__1__Impl_in_rule__TextBl__Group__13329 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TextBl__Group__2_in_rule__TextBl__Group__13332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TextBl__Group__1__Impl3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextBl__Group__2__Impl_in_rule__TextBl__Group__23391 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TextBl__Group__3_in_rule__TextBl__Group__23394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextBl__LengthAssignment_2_in_rule__TextBl__Group__2__Impl3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextBl__Group__3__Impl_in_rule__TextBl__Group__33451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TextBl__Group__3__Impl3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group__0__Impl_in_rule__Matrix__Group__03518 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Matrix__Group__1_in_rule__Matrix__Group__03521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Matrix__Group__0__Impl3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group__1__Impl_in_rule__Matrix__Group__13580 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Matrix__Group__2_in_rule__Matrix__Group__13583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Matrix__Group__1__Impl3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group__2__Impl_in_rule__Matrix__Group__23642 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Matrix__Group__3_in_rule__Matrix__Group__23645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Matrix__Group__2__Impl3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group__3__Impl_in_rule__Matrix__Group__33704 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Matrix__Group__4_in_rule__Matrix__Group__33707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Matrix__Group__3__Impl3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group__4__Impl_in_rule__Matrix__Group__43766 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_rule__Matrix__Group__5_in_rule__Matrix__Group__43769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Matrix__Group__4__Impl3796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group__5__Impl_in_rule__Matrix__Group__53825 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_rule__Matrix__Group__6_in_rule__Matrix__Group__53828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group_5__0_in_rule__Matrix__Group__5__Impl3855 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group__6__Impl_in_rule__Matrix__Group__63886 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Matrix__Group__7_in_rule__Matrix__Group__63889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Matrix__Group__6__Impl3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group__7__Impl_in_rule__Matrix__Group__73948 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Matrix__Group__8_in_rule__Matrix__Group__73951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Matrix__Group__7__Impl3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group__8__Impl_in_rule__Matrix__Group__84010 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Matrix__Group__9_in_rule__Matrix__Group__84013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Matrix__Group__8__Impl4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group__9__Impl_in_rule__Matrix__Group__94072 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_rule__Matrix__Group__10_in_rule__Matrix__Group__94075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__AnswerAssignment_9_in_rule__Matrix__Group__9__Impl4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group__10__Impl_in_rule__Matrix__Group__104132 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_rule__Matrix__Group__11_in_rule__Matrix__Group__104135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group_10__0_in_rule__Matrix__Group__10__Impl4162 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group__11__Impl_in_rule__Matrix__Group__114193 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Matrix__Group__12_in_rule__Matrix__Group__114196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Matrix__Group__11__Impl4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group__12__Impl_in_rule__Matrix__Group__124255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Matrix__Group__12__Impl4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group_5__0__Impl_in_rule__Matrix__Group_5__04340 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Matrix__Group_5__1_in_rule__Matrix__Group_5__04343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Matrix__Group_5__0__Impl4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group_5__1__Impl_in_rule__Matrix__Group_5__14402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Matrix__Group_5__1__Impl4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group_10__0__Impl_in_rule__Matrix__Group_10__04462 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Matrix__Group_10__1_in_rule__Matrix__Group_10__04465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Matrix__Group_10__0__Impl4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__Group_10__1__Impl_in_rule__Matrix__Group_10__14524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Matrix__AnswerAssignment_10_1_in_rule__Matrix__Group_10__1__Impl4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_rule__Survey__QuestionnaireAssignment4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Questionnaire__NameAssignment_14621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Questionnaire__IdAssignment_44652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_rule__Questionnaire__PartAssignment_54683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Part__NameAssignment_14714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Part__IdAssignment_44745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Part__QuestionAssignment_54776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Question__NameAssignment_14807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Question__IdAssignment_44838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_rule__Question__MandatoryAssignment_64869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Question__TypeAssignment_84900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_rule__Question__AnswerAssignment_94931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Answer__IdAssignment_14962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Answer__NameAssignment_34993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TextLn__LengthAssignment_25024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TextBl__LengthAssignment_25055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_rule__Matrix__AnswerAssignment_95086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_rule__Matrix__AnswerAssignment_10_15117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ComboBox__NameAssignment5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DropDown__NameAssignment5197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Radio__NameAssignment5241 = new BitSet(new long[]{0x0000000000000002L});

}