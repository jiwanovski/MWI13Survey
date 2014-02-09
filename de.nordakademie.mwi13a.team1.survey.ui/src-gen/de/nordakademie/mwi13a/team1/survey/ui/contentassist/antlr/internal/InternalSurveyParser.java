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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Questionnaire:'", "'{'", "'Questionnaire-ID:'", "'}'", "'Part:'", "'Part-ID:'", "'Question:'", "'Question-ID:'", "'Type:'", "'Answer-ID:'", "'Answer:'", "'('", "')'", "'Scale:'", "'Questions:'", "'|'", "'Mandatory Field'", "'TextLine'", "'TextBlock'", "'Matrix'", "'CheckBox'", "'DropDown'", "'Radio'"
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
    public static final int T__33=33;
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

                if ( (LA1_0==11) ) {
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


    // $ANTLR start "entryRuleMatrixQuestion"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:179:1: entryRuleMatrixQuestion : ruleMatrixQuestion EOF ;
    public final void entryRuleMatrixQuestion() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:180:1: ( ruleMatrixQuestion EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:181:1: ruleMatrixQuestion EOF
            {
             before(grammarAccess.getMatrixQuestionRule()); 
            pushFollow(FOLLOW_ruleMatrixQuestion_in_entryRuleMatrixQuestion318);
            ruleMatrixQuestion();

            state._fsp--;

             after(grammarAccess.getMatrixQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrixQuestion325); 

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
    // $ANTLR end "entryRuleMatrixQuestion"


    // $ANTLR start "ruleMatrixQuestion"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:188:1: ruleMatrixQuestion : ( ( rule__MatrixQuestion__Group__0 ) ) ;
    public final void ruleMatrixQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:192:2: ( ( ( rule__MatrixQuestion__Group__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:193:1: ( ( rule__MatrixQuestion__Group__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:193:1: ( ( rule__MatrixQuestion__Group__0 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:194:1: ( rule__MatrixQuestion__Group__0 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getGroup()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:195:1: ( rule__MatrixQuestion__Group__0 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:195:2: rule__MatrixQuestion__Group__0
            {
            pushFollow(FOLLOW_rule__MatrixQuestion__Group__0_in_ruleMatrixQuestion351);
            rule__MatrixQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatrixQuestion"


    // $ANTLR start "entryRuleAnswer"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:209:1: entryRuleAnswer : ruleAnswer EOF ;
    public final void entryRuleAnswer() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:210:1: ( ruleAnswer EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:211:1: ruleAnswer EOF
            {
             before(grammarAccess.getAnswerRule()); 
            pushFollow(FOLLOW_ruleAnswer_in_entryRuleAnswer380);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getAnswerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnswer387); 

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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:218:1: ruleAnswer : ( ( rule__Answer__Group__0 ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:222:2: ( ( ( rule__Answer__Group__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:223:1: ( ( rule__Answer__Group__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:223:1: ( ( rule__Answer__Group__0 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:224:1: ( rule__Answer__Group__0 )
            {
             before(grammarAccess.getAnswerAccess().getGroup()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:225:1: ( rule__Answer__Group__0 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:225:2: rule__Answer__Group__0
            {
            pushFollow(FOLLOW_rule__Answer__Group__0_in_ruleAnswer413);
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


    // $ANTLR start "entryRuleSurveyTerminalTypes"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:237:1: entryRuleSurveyTerminalTypes : ruleSurveyTerminalTypes EOF ;
    public final void entryRuleSurveyTerminalTypes() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:238:1: ( ruleSurveyTerminalTypes EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:239:1: ruleSurveyTerminalTypes EOF
            {
             before(grammarAccess.getSurveyTerminalTypesRule()); 
            pushFollow(FOLLOW_ruleSurveyTerminalTypes_in_entryRuleSurveyTerminalTypes440);
            ruleSurveyTerminalTypes();

            state._fsp--;

             after(grammarAccess.getSurveyTerminalTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSurveyTerminalTypes447); 

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
    // $ANTLR end "entryRuleSurveyTerminalTypes"


    // $ANTLR start "ruleSurveyTerminalTypes"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:246:1: ruleSurveyTerminalTypes : ( ( rule__SurveyTerminalTypes__Alternatives ) ) ;
    public final void ruleSurveyTerminalTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:250:2: ( ( ( rule__SurveyTerminalTypes__Alternatives ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:251:1: ( ( rule__SurveyTerminalTypes__Alternatives ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:251:1: ( ( rule__SurveyTerminalTypes__Alternatives ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:252:1: ( rule__SurveyTerminalTypes__Alternatives )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAlternatives()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:253:1: ( rule__SurveyTerminalTypes__Alternatives )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:253:2: rule__SurveyTerminalTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Alternatives_in_ruleSurveyTerminalTypes473);
            rule__SurveyTerminalTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSurveyTerminalTypes"


    // $ANTLR start "entryRuleIdentifier"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:265:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:266:1: ( ruleIdentifier EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:267:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier500);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier507); 

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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:274:1: ruleIdentifier : ( ( rule__Identifier__Alternatives ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:278:2: ( ( ( rule__Identifier__Alternatives ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:279:1: ( ( rule__Identifier__Alternatives ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:279:1: ( ( rule__Identifier__Alternatives ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:280:1: ( rule__Identifier__Alternatives )
            {
             before(grammarAccess.getIdentifierAccess().getAlternatives()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:281:1: ( rule__Identifier__Alternatives )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:281:2: rule__Identifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Identifier__Alternatives_in_ruleIdentifier533);
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


    // $ANTLR start "rule__SurveyTerminalTypes__Alternatives"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:293:1: rule__SurveyTerminalTypes__Alternatives : ( ( ( rule__SurveyTerminalTypes__Group_0__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_1__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_2__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_3__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_4__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_5__0 ) ) );
    public final void rule__SurveyTerminalTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:297:1: ( ( ( rule__SurveyTerminalTypes__Group_0__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_1__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_2__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_3__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_4__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_5__0 ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt2=1;
                }
                break;
            case 29:
                {
                alt2=2;
                }
                break;
            case 30:
                {
                alt2=3;
                }
                break;
            case 31:
                {
                alt2=4;
                }
                break;
            case 32:
                {
                alt2=5;
                }
                break;
            case 33:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:298:1: ( ( rule__SurveyTerminalTypes__Group_0__0 ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:298:1: ( ( rule__SurveyTerminalTypes__Group_0__0 ) )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:299:1: ( rule__SurveyTerminalTypes__Group_0__0 )
                    {
                     before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_0()); 
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:300:1: ( rule__SurveyTerminalTypes__Group_0__0 )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:300:2: rule__SurveyTerminalTypes__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__0_in_rule__SurveyTerminalTypes__Alternatives569);
                    rule__SurveyTerminalTypes__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyTerminalTypesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:304:6: ( ( rule__SurveyTerminalTypes__Group_1__0 ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:304:6: ( ( rule__SurveyTerminalTypes__Group_1__0 ) )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:305:1: ( rule__SurveyTerminalTypes__Group_1__0 )
                    {
                     before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_1()); 
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:306:1: ( rule__SurveyTerminalTypes__Group_1__0 )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:306:2: rule__SurveyTerminalTypes__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__0_in_rule__SurveyTerminalTypes__Alternatives587);
                    rule__SurveyTerminalTypes__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyTerminalTypesAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:310:6: ( ( rule__SurveyTerminalTypes__Group_2__0 ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:310:6: ( ( rule__SurveyTerminalTypes__Group_2__0 ) )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:311:1: ( rule__SurveyTerminalTypes__Group_2__0 )
                    {
                     before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_2()); 
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:312:1: ( rule__SurveyTerminalTypes__Group_2__0 )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:312:2: rule__SurveyTerminalTypes__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__0_in_rule__SurveyTerminalTypes__Alternatives605);
                    rule__SurveyTerminalTypes__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyTerminalTypesAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:316:6: ( ( rule__SurveyTerminalTypes__Group_3__0 ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:316:6: ( ( rule__SurveyTerminalTypes__Group_3__0 ) )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:317:1: ( rule__SurveyTerminalTypes__Group_3__0 )
                    {
                     before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_3()); 
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:318:1: ( rule__SurveyTerminalTypes__Group_3__0 )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:318:2: rule__SurveyTerminalTypes__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__0_in_rule__SurveyTerminalTypes__Alternatives623);
                    rule__SurveyTerminalTypes__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyTerminalTypesAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:322:6: ( ( rule__SurveyTerminalTypes__Group_4__0 ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:322:6: ( ( rule__SurveyTerminalTypes__Group_4__0 ) )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:323:1: ( rule__SurveyTerminalTypes__Group_4__0 )
                    {
                     before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_4()); 
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:324:1: ( rule__SurveyTerminalTypes__Group_4__0 )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:324:2: rule__SurveyTerminalTypes__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__0_in_rule__SurveyTerminalTypes__Alternatives641);
                    rule__SurveyTerminalTypes__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyTerminalTypesAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:328:6: ( ( rule__SurveyTerminalTypes__Group_5__0 ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:328:6: ( ( rule__SurveyTerminalTypes__Group_5__0 ) )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:329:1: ( rule__SurveyTerminalTypes__Group_5__0 )
                    {
                     before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_5()); 
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:330:1: ( rule__SurveyTerminalTypes__Group_5__0 )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:330:2: rule__SurveyTerminalTypes__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__0_in_rule__SurveyTerminalTypes__Alternatives659);
                    rule__SurveyTerminalTypes__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyTerminalTypesAccess().getGroup_5()); 

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
    // $ANTLR end "rule__SurveyTerminalTypes__Alternatives"


    // $ANTLR start "rule__Identifier__Alternatives"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:339:1: rule__Identifier__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) );
    public final void rule__Identifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:343:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case RULE_INT:
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
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:344:1: ( RULE_ID )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:344:1: ( RULE_ID )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:345:1: RULE_ID
                    {
                     before(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Identifier__Alternatives692); 
                     after(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:350:6: ( RULE_STRING )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:350:6: ( RULE_STRING )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:351:1: RULE_STRING
                    {
                     before(grammarAccess.getIdentifierAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Identifier__Alternatives709); 
                     after(grammarAccess.getIdentifierAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:356:6: ( RULE_INT )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:356:6: ( RULE_INT )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:357:1: RULE_INT
                    {
                     before(grammarAccess.getIdentifierAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Identifier__Alternatives726); 
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


    // $ANTLR start "rule__Questionnaire__Group__0"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:369:1: rule__Questionnaire__Group__0 : rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 ;
    public final void rule__Questionnaire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:373:1: ( rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:374:2: rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__0__Impl_in_rule__Questionnaire__Group__0756);
            rule__Questionnaire__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__1_in_rule__Questionnaire__Group__0759);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:381:1: rule__Questionnaire__Group__0__Impl : ( 'Questionnaire:' ) ;
    public final void rule__Questionnaire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:385:1: ( ( 'Questionnaire:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:386:1: ( 'Questionnaire:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:386:1: ( 'Questionnaire:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:387:1: 'Questionnaire:'
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Questionnaire__Group__0__Impl787); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:400:1: rule__Questionnaire__Group__1 : rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 ;
    public final void rule__Questionnaire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:404:1: ( rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:405:2: rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__1__Impl_in_rule__Questionnaire__Group__1818);
            rule__Questionnaire__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__2_in_rule__Questionnaire__Group__1821);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:412:1: rule__Questionnaire__Group__1__Impl : ( ( rule__Questionnaire__NameAssignment_1 ) ) ;
    public final void rule__Questionnaire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:416:1: ( ( ( rule__Questionnaire__NameAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:417:1: ( ( rule__Questionnaire__NameAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:417:1: ( ( rule__Questionnaire__NameAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:418:1: ( rule__Questionnaire__NameAssignment_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getNameAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:419:1: ( rule__Questionnaire__NameAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:419:2: rule__Questionnaire__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Questionnaire__NameAssignment_1_in_rule__Questionnaire__Group__1__Impl848);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:429:1: rule__Questionnaire__Group__2 : rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 ;
    public final void rule__Questionnaire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:433:1: ( rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:434:2: rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__2__Impl_in_rule__Questionnaire__Group__2878);
            rule__Questionnaire__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__3_in_rule__Questionnaire__Group__2881);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:441:1: rule__Questionnaire__Group__2__Impl : ( '{' ) ;
    public final void rule__Questionnaire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:445:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:446:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:446:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:447:1: '{'
            {
             before(grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Questionnaire__Group__2__Impl909); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:460:1: rule__Questionnaire__Group__3 : rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 ;
    public final void rule__Questionnaire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:464:1: ( rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:465:2: rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__3__Impl_in_rule__Questionnaire__Group__3940);
            rule__Questionnaire__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__4_in_rule__Questionnaire__Group__3943);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:472:1: rule__Questionnaire__Group__3__Impl : ( 'Questionnaire-ID:' ) ;
    public final void rule__Questionnaire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:476:1: ( ( 'Questionnaire-ID:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:477:1: ( 'Questionnaire-ID:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:477:1: ( 'Questionnaire-ID:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:478:1: 'Questionnaire-ID:'
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionnaireIDKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Questionnaire__Group__3__Impl971); 
             after(grammarAccess.getQuestionnaireAccess().getQuestionnaireIDKeyword_3()); 

            }


            }

        }
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:491:1: rule__Questionnaire__Group__4 : rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5 ;
    public final void rule__Questionnaire__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:495:1: ( rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:496:2: rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__4__Impl_in_rule__Questionnaire__Group__41002);
            rule__Questionnaire__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__5_in_rule__Questionnaire__Group__41005);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:503:1: rule__Questionnaire__Group__4__Impl : ( ( rule__Questionnaire__IdAssignment_4 ) ) ;
    public final void rule__Questionnaire__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:507:1: ( ( ( rule__Questionnaire__IdAssignment_4 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:508:1: ( ( rule__Questionnaire__IdAssignment_4 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:508:1: ( ( rule__Questionnaire__IdAssignment_4 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:509:1: ( rule__Questionnaire__IdAssignment_4 )
            {
             before(grammarAccess.getQuestionnaireAccess().getIdAssignment_4()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:510:1: ( rule__Questionnaire__IdAssignment_4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:510:2: rule__Questionnaire__IdAssignment_4
            {
            pushFollow(FOLLOW_rule__Questionnaire__IdAssignment_4_in_rule__Questionnaire__Group__4__Impl1032);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:520:1: rule__Questionnaire__Group__5 : rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6 ;
    public final void rule__Questionnaire__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:524:1: ( rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:525:2: rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__5__Impl_in_rule__Questionnaire__Group__51062);
            rule__Questionnaire__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__6_in_rule__Questionnaire__Group__51065);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:532:1: rule__Questionnaire__Group__5__Impl : ( ( ( rule__Questionnaire__PartAssignment_5 ) ) ( ( rule__Questionnaire__PartAssignment_5 )* ) ) ;
    public final void rule__Questionnaire__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:536:1: ( ( ( ( rule__Questionnaire__PartAssignment_5 ) ) ( ( rule__Questionnaire__PartAssignment_5 )* ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:537:1: ( ( ( rule__Questionnaire__PartAssignment_5 ) ) ( ( rule__Questionnaire__PartAssignment_5 )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:537:1: ( ( ( rule__Questionnaire__PartAssignment_5 ) ) ( ( rule__Questionnaire__PartAssignment_5 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:538:1: ( ( rule__Questionnaire__PartAssignment_5 ) ) ( ( rule__Questionnaire__PartAssignment_5 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:538:1: ( ( rule__Questionnaire__PartAssignment_5 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:539:1: ( rule__Questionnaire__PartAssignment_5 )
            {
             before(grammarAccess.getQuestionnaireAccess().getPartAssignment_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:540:1: ( rule__Questionnaire__PartAssignment_5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:540:2: rule__Questionnaire__PartAssignment_5
            {
            pushFollow(FOLLOW_rule__Questionnaire__PartAssignment_5_in_rule__Questionnaire__Group__5__Impl1094);
            rule__Questionnaire__PartAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getPartAssignment_5()); 

            }

            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:543:1: ( ( rule__Questionnaire__PartAssignment_5 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:544:1: ( rule__Questionnaire__PartAssignment_5 )*
            {
             before(grammarAccess.getQuestionnaireAccess().getPartAssignment_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:545:1: ( rule__Questionnaire__PartAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:545:2: rule__Questionnaire__PartAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Questionnaire__PartAssignment_5_in_rule__Questionnaire__Group__5__Impl1106);
            	    rule__Questionnaire__PartAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:556:1: rule__Questionnaire__Group__6 : rule__Questionnaire__Group__6__Impl ;
    public final void rule__Questionnaire__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:560:1: ( rule__Questionnaire__Group__6__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:561:2: rule__Questionnaire__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__6__Impl_in_rule__Questionnaire__Group__61139);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:567:1: rule__Questionnaire__Group__6__Impl : ( '}' ) ;
    public final void rule__Questionnaire__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:571:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:572:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:572:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:573:1: '}'
            {
             before(grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Questionnaire__Group__6__Impl1167); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:600:1: rule__Part__Group__0 : rule__Part__Group__0__Impl rule__Part__Group__1 ;
    public final void rule__Part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:604:1: ( rule__Part__Group__0__Impl rule__Part__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:605:2: rule__Part__Group__0__Impl rule__Part__Group__1
            {
            pushFollow(FOLLOW_rule__Part__Group__0__Impl_in_rule__Part__Group__01212);
            rule__Part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__1_in_rule__Part__Group__01215);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:612:1: rule__Part__Group__0__Impl : ( 'Part:' ) ;
    public final void rule__Part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:616:1: ( ( 'Part:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:617:1: ( 'Part:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:617:1: ( 'Part:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:618:1: 'Part:'
            {
             before(grammarAccess.getPartAccess().getPartKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Part__Group__0__Impl1243); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:631:1: rule__Part__Group__1 : rule__Part__Group__1__Impl rule__Part__Group__2 ;
    public final void rule__Part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:635:1: ( rule__Part__Group__1__Impl rule__Part__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:636:2: rule__Part__Group__1__Impl rule__Part__Group__2
            {
            pushFollow(FOLLOW_rule__Part__Group__1__Impl_in_rule__Part__Group__11274);
            rule__Part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__2_in_rule__Part__Group__11277);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:643:1: rule__Part__Group__1__Impl : ( ( rule__Part__NameAssignment_1 ) ) ;
    public final void rule__Part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:647:1: ( ( ( rule__Part__NameAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:648:1: ( ( rule__Part__NameAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:648:1: ( ( rule__Part__NameAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:649:1: ( rule__Part__NameAssignment_1 )
            {
             before(grammarAccess.getPartAccess().getNameAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:650:1: ( rule__Part__NameAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:650:2: rule__Part__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Part__NameAssignment_1_in_rule__Part__Group__1__Impl1304);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:660:1: rule__Part__Group__2 : rule__Part__Group__2__Impl rule__Part__Group__3 ;
    public final void rule__Part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:664:1: ( rule__Part__Group__2__Impl rule__Part__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:665:2: rule__Part__Group__2__Impl rule__Part__Group__3
            {
            pushFollow(FOLLOW_rule__Part__Group__2__Impl_in_rule__Part__Group__21334);
            rule__Part__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__3_in_rule__Part__Group__21337);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:672:1: rule__Part__Group__2__Impl : ( '{' ) ;
    public final void rule__Part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:676:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:677:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:677:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:678:1: '{'
            {
             before(grammarAccess.getPartAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Part__Group__2__Impl1365); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:691:1: rule__Part__Group__3 : rule__Part__Group__3__Impl rule__Part__Group__4 ;
    public final void rule__Part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:695:1: ( rule__Part__Group__3__Impl rule__Part__Group__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:696:2: rule__Part__Group__3__Impl rule__Part__Group__4
            {
            pushFollow(FOLLOW_rule__Part__Group__3__Impl_in_rule__Part__Group__31396);
            rule__Part__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__4_in_rule__Part__Group__31399);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:703:1: rule__Part__Group__3__Impl : ( 'Part-ID:' ) ;
    public final void rule__Part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:707:1: ( ( 'Part-ID:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:708:1: ( 'Part-ID:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:708:1: ( 'Part-ID:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:709:1: 'Part-ID:'
            {
             before(grammarAccess.getPartAccess().getPartIDKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Part__Group__3__Impl1427); 
             after(grammarAccess.getPartAccess().getPartIDKeyword_3()); 

            }


            }

        }
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:722:1: rule__Part__Group__4 : rule__Part__Group__4__Impl rule__Part__Group__5 ;
    public final void rule__Part__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:726:1: ( rule__Part__Group__4__Impl rule__Part__Group__5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:727:2: rule__Part__Group__4__Impl rule__Part__Group__5
            {
            pushFollow(FOLLOW_rule__Part__Group__4__Impl_in_rule__Part__Group__41458);
            rule__Part__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__5_in_rule__Part__Group__41461);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:734:1: rule__Part__Group__4__Impl : ( ( rule__Part__IdAssignment_4 ) ) ;
    public final void rule__Part__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:738:1: ( ( ( rule__Part__IdAssignment_4 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:739:1: ( ( rule__Part__IdAssignment_4 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:739:1: ( ( rule__Part__IdAssignment_4 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:740:1: ( rule__Part__IdAssignment_4 )
            {
             before(grammarAccess.getPartAccess().getIdAssignment_4()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:741:1: ( rule__Part__IdAssignment_4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:741:2: rule__Part__IdAssignment_4
            {
            pushFollow(FOLLOW_rule__Part__IdAssignment_4_in_rule__Part__Group__4__Impl1488);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:751:1: rule__Part__Group__5 : rule__Part__Group__5__Impl rule__Part__Group__6 ;
    public final void rule__Part__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:755:1: ( rule__Part__Group__5__Impl rule__Part__Group__6 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:756:2: rule__Part__Group__5__Impl rule__Part__Group__6
            {
            pushFollow(FOLLOW_rule__Part__Group__5__Impl_in_rule__Part__Group__51518);
            rule__Part__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__6_in_rule__Part__Group__51521);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:763:1: rule__Part__Group__5__Impl : ( ( ( rule__Part__QuestionAssignment_5 ) ) ( ( rule__Part__QuestionAssignment_5 )* ) ) ;
    public final void rule__Part__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:767:1: ( ( ( ( rule__Part__QuestionAssignment_5 ) ) ( ( rule__Part__QuestionAssignment_5 )* ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:768:1: ( ( ( rule__Part__QuestionAssignment_5 ) ) ( ( rule__Part__QuestionAssignment_5 )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:768:1: ( ( ( rule__Part__QuestionAssignment_5 ) ) ( ( rule__Part__QuestionAssignment_5 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:769:1: ( ( rule__Part__QuestionAssignment_5 ) ) ( ( rule__Part__QuestionAssignment_5 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:769:1: ( ( rule__Part__QuestionAssignment_5 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:770:1: ( rule__Part__QuestionAssignment_5 )
            {
             before(grammarAccess.getPartAccess().getQuestionAssignment_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:771:1: ( rule__Part__QuestionAssignment_5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:771:2: rule__Part__QuestionAssignment_5
            {
            pushFollow(FOLLOW_rule__Part__QuestionAssignment_5_in_rule__Part__Group__5__Impl1550);
            rule__Part__QuestionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPartAccess().getQuestionAssignment_5()); 

            }

            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:774:1: ( ( rule__Part__QuestionAssignment_5 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:775:1: ( rule__Part__QuestionAssignment_5 )*
            {
             before(grammarAccess.getPartAccess().getQuestionAssignment_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:776:1: ( rule__Part__QuestionAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:776:2: rule__Part__QuestionAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Part__QuestionAssignment_5_in_rule__Part__Group__5__Impl1562);
            	    rule__Part__QuestionAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:787:1: rule__Part__Group__6 : rule__Part__Group__6__Impl ;
    public final void rule__Part__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:791:1: ( rule__Part__Group__6__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:792:2: rule__Part__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Part__Group__6__Impl_in_rule__Part__Group__61595);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:798:1: rule__Part__Group__6__Impl : ( '}' ) ;
    public final void rule__Part__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:802:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:803:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:803:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:804:1: '}'
            {
             before(grammarAccess.getPartAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Part__Group__6__Impl1623); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:831:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:835:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:836:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__01668);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__1_in_rule__Question__Group__01671);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:843:1: rule__Question__Group__0__Impl : ( 'Question:' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:847:1: ( ( 'Question:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:848:1: ( 'Question:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:848:1: ( 'Question:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:849:1: 'Question:'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Question__Group__0__Impl1699); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:862:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:866:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:867:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__11730);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__2_in_rule__Question__Group__11733);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:874:1: rule__Question__Group__1__Impl : ( ( rule__Question__NameAssignment_1 ) ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:878:1: ( ( ( rule__Question__NameAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:879:1: ( ( rule__Question__NameAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:879:1: ( ( rule__Question__NameAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:880:1: ( rule__Question__NameAssignment_1 )
            {
             before(grammarAccess.getQuestionAccess().getNameAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:881:1: ( rule__Question__NameAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:881:2: rule__Question__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Question__NameAssignment_1_in_rule__Question__Group__1__Impl1760);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:891:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:895:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:896:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__21790);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__3_in_rule__Question__Group__21793);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:903:1: rule__Question__Group__2__Impl : ( '{' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:907:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:908:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:908:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:909:1: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Question__Group__2__Impl1821); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:922:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:926:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:927:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__31852);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__4_in_rule__Question__Group__31855);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:934:1: rule__Question__Group__3__Impl : ( 'Question-ID:' ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:938:1: ( ( 'Question-ID:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:939:1: ( 'Question-ID:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:939:1: ( 'Question-ID:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:940:1: 'Question-ID:'
            {
             before(grammarAccess.getQuestionAccess().getQuestionIDKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Question__Group__3__Impl1883); 
             after(grammarAccess.getQuestionAccess().getQuestionIDKeyword_3()); 

            }


            }

        }
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:953:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:957:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:958:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41914);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41917);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:965:1: rule__Question__Group__4__Impl : ( ( rule__Question__IdAssignment_4 ) ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:969:1: ( ( ( rule__Question__IdAssignment_4 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:970:1: ( ( rule__Question__IdAssignment_4 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:970:1: ( ( rule__Question__IdAssignment_4 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:971:1: ( rule__Question__IdAssignment_4 )
            {
             before(grammarAccess.getQuestionAccess().getIdAssignment_4()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:972:1: ( rule__Question__IdAssignment_4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:972:2: rule__Question__IdAssignment_4
            {
            pushFollow(FOLLOW_rule__Question__IdAssignment_4_in_rule__Question__Group__4__Impl1944);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:982:1: rule__Question__Group__5 : rule__Question__Group__5__Impl rule__Question__Group__6 ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:986:1: ( rule__Question__Group__5__Impl rule__Question__Group__6 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:987:2: rule__Question__Group__5__Impl rule__Question__Group__6
            {
            pushFollow(FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__51974);
            rule__Question__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__6_in_rule__Question__Group__51977);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:994:1: rule__Question__Group__5__Impl : ( ( rule__Question__MandatoryAssignment_5 )? ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:998:1: ( ( ( rule__Question__MandatoryAssignment_5 )? ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:999:1: ( ( rule__Question__MandatoryAssignment_5 )? )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:999:1: ( ( rule__Question__MandatoryAssignment_5 )? )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1000:1: ( rule__Question__MandatoryAssignment_5 )?
            {
             before(grammarAccess.getQuestionAccess().getMandatoryAssignment_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1001:1: ( rule__Question__MandatoryAssignment_5 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1001:2: rule__Question__MandatoryAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Question__MandatoryAssignment_5_in_rule__Question__Group__5__Impl2004);
                    rule__Question__MandatoryAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getMandatoryAssignment_5()); 

            }


            }

        }
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1011:1: rule__Question__Group__6 : rule__Question__Group__6__Impl rule__Question__Group__7 ;
    public final void rule__Question__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1015:1: ( rule__Question__Group__6__Impl rule__Question__Group__7 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1016:2: rule__Question__Group__6__Impl rule__Question__Group__7
            {
            pushFollow(FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__62035);
            rule__Question__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__7_in_rule__Question__Group__62038);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1023:1: rule__Question__Group__6__Impl : ( 'Type:' ) ;
    public final void rule__Question__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1027:1: ( ( 'Type:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1028:1: ( 'Type:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1028:1: ( 'Type:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1029:1: 'Type:'
            {
             before(grammarAccess.getQuestionAccess().getTypeKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Question__Group__6__Impl2066); 
             after(grammarAccess.getQuestionAccess().getTypeKeyword_6()); 

            }


            }

        }
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1042:1: rule__Question__Group__7 : rule__Question__Group__7__Impl rule__Question__Group__8 ;
    public final void rule__Question__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1046:1: ( rule__Question__Group__7__Impl rule__Question__Group__8 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1047:2: rule__Question__Group__7__Impl rule__Question__Group__8
            {
            pushFollow(FOLLOW_rule__Question__Group__7__Impl_in_rule__Question__Group__72097);
            rule__Question__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__8_in_rule__Question__Group__72100);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1054:1: rule__Question__Group__7__Impl : ( ( rule__Question__QuestionTypeAssignment_7 ) ) ;
    public final void rule__Question__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1058:1: ( ( ( rule__Question__QuestionTypeAssignment_7 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1059:1: ( ( rule__Question__QuestionTypeAssignment_7 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1059:1: ( ( rule__Question__QuestionTypeAssignment_7 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1060:1: ( rule__Question__QuestionTypeAssignment_7 )
            {
             before(grammarAccess.getQuestionAccess().getQuestionTypeAssignment_7()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1061:1: ( rule__Question__QuestionTypeAssignment_7 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1061:2: rule__Question__QuestionTypeAssignment_7
            {
            pushFollow(FOLLOW_rule__Question__QuestionTypeAssignment_7_in_rule__Question__Group__7__Impl2127);
            rule__Question__QuestionTypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getQuestionTypeAssignment_7()); 

            }


            }

        }
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1071:1: rule__Question__Group__8 : rule__Question__Group__8__Impl ;
    public final void rule__Question__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1075:1: ( rule__Question__Group__8__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1076:2: rule__Question__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group__8__Impl_in_rule__Question__Group__82157);
            rule__Question__Group__8__Impl();

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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1082:1: rule__Question__Group__8__Impl : ( '}' ) ;
    public final void rule__Question__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1086:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1087:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1087:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1088:1: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_14_in_rule__Question__Group__8__Impl2185); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__MatrixQuestion__Group__0"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1119:1: rule__MatrixQuestion__Group__0 : rule__MatrixQuestion__Group__0__Impl rule__MatrixQuestion__Group__1 ;
    public final void rule__MatrixQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1123:1: ( rule__MatrixQuestion__Group__0__Impl rule__MatrixQuestion__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1124:2: rule__MatrixQuestion__Group__0__Impl rule__MatrixQuestion__Group__1
            {
            pushFollow(FOLLOW_rule__MatrixQuestion__Group__0__Impl_in_rule__MatrixQuestion__Group__02234);
            rule__MatrixQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatrixQuestion__Group__1_in_rule__MatrixQuestion__Group__02237);
            rule__MatrixQuestion__Group__1();

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
    // $ANTLR end "rule__MatrixQuestion__Group__0"


    // $ANTLR start "rule__MatrixQuestion__Group__0__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1131:1: rule__MatrixQuestion__Group__0__Impl : ( 'Question-ID:' ) ;
    public final void rule__MatrixQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1135:1: ( ( 'Question-ID:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1136:1: ( 'Question-ID:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1136:1: ( 'Question-ID:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1137:1: 'Question-ID:'
            {
             before(grammarAccess.getMatrixQuestionAccess().getQuestionIDKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__MatrixQuestion__Group__0__Impl2265); 
             after(grammarAccess.getMatrixQuestionAccess().getQuestionIDKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group__0__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group__1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1150:1: rule__MatrixQuestion__Group__1 : rule__MatrixQuestion__Group__1__Impl rule__MatrixQuestion__Group__2 ;
    public final void rule__MatrixQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1154:1: ( rule__MatrixQuestion__Group__1__Impl rule__MatrixQuestion__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1155:2: rule__MatrixQuestion__Group__1__Impl rule__MatrixQuestion__Group__2
            {
            pushFollow(FOLLOW_rule__MatrixQuestion__Group__1__Impl_in_rule__MatrixQuestion__Group__12296);
            rule__MatrixQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatrixQuestion__Group__2_in_rule__MatrixQuestion__Group__12299);
            rule__MatrixQuestion__Group__2();

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
    // $ANTLR end "rule__MatrixQuestion__Group__1"


    // $ANTLR start "rule__MatrixQuestion__Group__1__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1162:1: rule__MatrixQuestion__Group__1__Impl : ( ( rule__MatrixQuestion__IdAssignment_1 ) ) ;
    public final void rule__MatrixQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1166:1: ( ( ( rule__MatrixQuestion__IdAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1167:1: ( ( rule__MatrixQuestion__IdAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1167:1: ( ( rule__MatrixQuestion__IdAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1168:1: ( rule__MatrixQuestion__IdAssignment_1 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getIdAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1169:1: ( rule__MatrixQuestion__IdAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1169:2: rule__MatrixQuestion__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__MatrixQuestion__IdAssignment_1_in_rule__MatrixQuestion__Group__1__Impl2326);
            rule__MatrixQuestion__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group__1__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group__2"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1179:1: rule__MatrixQuestion__Group__2 : rule__MatrixQuestion__Group__2__Impl rule__MatrixQuestion__Group__3 ;
    public final void rule__MatrixQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1183:1: ( rule__MatrixQuestion__Group__2__Impl rule__MatrixQuestion__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1184:2: rule__MatrixQuestion__Group__2__Impl rule__MatrixQuestion__Group__3
            {
            pushFollow(FOLLOW_rule__MatrixQuestion__Group__2__Impl_in_rule__MatrixQuestion__Group__22356);
            rule__MatrixQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatrixQuestion__Group__3_in_rule__MatrixQuestion__Group__22359);
            rule__MatrixQuestion__Group__3();

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
    // $ANTLR end "rule__MatrixQuestion__Group__2"


    // $ANTLR start "rule__MatrixQuestion__Group__2__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1191:1: rule__MatrixQuestion__Group__2__Impl : ( 'Question:' ) ;
    public final void rule__MatrixQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1195:1: ( ( 'Question:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1196:1: ( 'Question:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1196:1: ( 'Question:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1197:1: 'Question:'
            {
             before(grammarAccess.getMatrixQuestionAccess().getQuestionKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__MatrixQuestion__Group__2__Impl2387); 
             after(grammarAccess.getMatrixQuestionAccess().getQuestionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group__2__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group__3"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1210:1: rule__MatrixQuestion__Group__3 : rule__MatrixQuestion__Group__3__Impl ;
    public final void rule__MatrixQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1214:1: ( rule__MatrixQuestion__Group__3__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1215:2: rule__MatrixQuestion__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MatrixQuestion__Group__3__Impl_in_rule__MatrixQuestion__Group__32418);
            rule__MatrixQuestion__Group__3__Impl();

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
    // $ANTLR end "rule__MatrixQuestion__Group__3"


    // $ANTLR start "rule__MatrixQuestion__Group__3__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1221:1: rule__MatrixQuestion__Group__3__Impl : ( ( rule__MatrixQuestion__NameAssignment_3 ) ) ;
    public final void rule__MatrixQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1225:1: ( ( ( rule__MatrixQuestion__NameAssignment_3 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1226:1: ( ( rule__MatrixQuestion__NameAssignment_3 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1226:1: ( ( rule__MatrixQuestion__NameAssignment_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1227:1: ( rule__MatrixQuestion__NameAssignment_3 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getNameAssignment_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1228:1: ( rule__MatrixQuestion__NameAssignment_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1228:2: rule__MatrixQuestion__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__MatrixQuestion__NameAssignment_3_in_rule__MatrixQuestion__Group__3__Impl2445);
            rule__MatrixQuestion__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group__3__Impl"


    // $ANTLR start "rule__Answer__Group__0"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1246:1: rule__Answer__Group__0 : rule__Answer__Group__0__Impl rule__Answer__Group__1 ;
    public final void rule__Answer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1250:1: ( rule__Answer__Group__0__Impl rule__Answer__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1251:2: rule__Answer__Group__0__Impl rule__Answer__Group__1
            {
            pushFollow(FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__02483);
            rule__Answer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__02486);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1258:1: rule__Answer__Group__0__Impl : ( 'Answer-ID:' ) ;
    public final void rule__Answer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1262:1: ( ( 'Answer-ID:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1263:1: ( 'Answer-ID:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1263:1: ( 'Answer-ID:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1264:1: 'Answer-ID:'
            {
             before(grammarAccess.getAnswerAccess().getAnswerIDKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Answer__Group__0__Impl2514); 
             after(grammarAccess.getAnswerAccess().getAnswerIDKeyword_0()); 

            }


            }

        }
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1277:1: rule__Answer__Group__1 : rule__Answer__Group__1__Impl rule__Answer__Group__2 ;
    public final void rule__Answer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1281:1: ( rule__Answer__Group__1__Impl rule__Answer__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1282:2: rule__Answer__Group__1__Impl rule__Answer__Group__2
            {
            pushFollow(FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__12545);
            rule__Answer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__12548);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1289:1: rule__Answer__Group__1__Impl : ( ( rule__Answer__IdAssignment_1 ) ) ;
    public final void rule__Answer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1293:1: ( ( ( rule__Answer__IdAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1294:1: ( ( rule__Answer__IdAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1294:1: ( ( rule__Answer__IdAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1295:1: ( rule__Answer__IdAssignment_1 )
            {
             before(grammarAccess.getAnswerAccess().getIdAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1296:1: ( rule__Answer__IdAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1296:2: rule__Answer__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__Answer__IdAssignment_1_in_rule__Answer__Group__1__Impl2575);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1306:1: rule__Answer__Group__2 : rule__Answer__Group__2__Impl rule__Answer__Group__3 ;
    public final void rule__Answer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1310:1: ( rule__Answer__Group__2__Impl rule__Answer__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1311:2: rule__Answer__Group__2__Impl rule__Answer__Group__3
            {
            pushFollow(FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__22605);
            rule__Answer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__22608);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1318:1: rule__Answer__Group__2__Impl : ( 'Answer:' ) ;
    public final void rule__Answer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1322:1: ( ( 'Answer:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1323:1: ( 'Answer:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1323:1: ( 'Answer:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1324:1: 'Answer:'
            {
             before(grammarAccess.getAnswerAccess().getAnswerKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Answer__Group__2__Impl2636); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1337:1: rule__Answer__Group__3 : rule__Answer__Group__3__Impl ;
    public final void rule__Answer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1341:1: ( rule__Answer__Group__3__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1342:2: rule__Answer__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__32667);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1348:1: rule__Answer__Group__3__Impl : ( ( rule__Answer__NameAssignment_3 ) ) ;
    public final void rule__Answer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1352:1: ( ( ( rule__Answer__NameAssignment_3 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1353:1: ( ( rule__Answer__NameAssignment_3 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1353:1: ( ( rule__Answer__NameAssignment_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1354:1: ( rule__Answer__NameAssignment_3 )
            {
             before(grammarAccess.getAnswerAccess().getNameAssignment_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1355:1: ( rule__Answer__NameAssignment_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1355:2: rule__Answer__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Answer__NameAssignment_3_in_rule__Answer__Group__3__Impl2694);
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


    // $ANTLR start "rule__SurveyTerminalTypes__Group_0__0"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1373:1: rule__SurveyTerminalTypes__Group_0__0 : rule__SurveyTerminalTypes__Group_0__0__Impl rule__SurveyTerminalTypes__Group_0__1 ;
    public final void rule__SurveyTerminalTypes__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1377:1: ( rule__SurveyTerminalTypes__Group_0__0__Impl rule__SurveyTerminalTypes__Group_0__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1378:2: rule__SurveyTerminalTypes__Group_0__0__Impl rule__SurveyTerminalTypes__Group_0__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__0__Impl_in_rule__SurveyTerminalTypes__Group_0__02732);
            rule__SurveyTerminalTypes__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__1_in_rule__SurveyTerminalTypes__Group_0__02735);
            rule__SurveyTerminalTypes__Group_0__1();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_0__0"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_0__0__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1385:1: rule__SurveyTerminalTypes__Group_0__0__Impl : ( () ) ;
    public final void rule__SurveyTerminalTypes__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1389:1: ( ( () ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1390:1: ( () )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1390:1: ( () )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1391:1: ()
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getTextLineAction_0_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1392:1: ()
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1394:1: 
            {
            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getTextLineAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_0__0__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_0__1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1404:1: rule__SurveyTerminalTypes__Group_0__1 : rule__SurveyTerminalTypes__Group_0__1__Impl rule__SurveyTerminalTypes__Group_0__2 ;
    public final void rule__SurveyTerminalTypes__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1408:1: ( rule__SurveyTerminalTypes__Group_0__1__Impl rule__SurveyTerminalTypes__Group_0__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1409:2: rule__SurveyTerminalTypes__Group_0__1__Impl rule__SurveyTerminalTypes__Group_0__2
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__1__Impl_in_rule__SurveyTerminalTypes__Group_0__12793);
            rule__SurveyTerminalTypes__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__2_in_rule__SurveyTerminalTypes__Group_0__12796);
            rule__SurveyTerminalTypes__Group_0__2();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_0__1"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_0__1__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1416:1: rule__SurveyTerminalTypes__Group_0__1__Impl : ( ( rule__SurveyTerminalTypes__NameAssignment_0_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1420:1: ( ( ( rule__SurveyTerminalTypes__NameAssignment_0_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1421:1: ( ( rule__SurveyTerminalTypes__NameAssignment_0_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1421:1: ( ( rule__SurveyTerminalTypes__NameAssignment_0_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1422:1: ( rule__SurveyTerminalTypes__NameAssignment_0_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_0_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1423:1: ( rule__SurveyTerminalTypes__NameAssignment_0_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1423:2: rule__SurveyTerminalTypes__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__NameAssignment_0_1_in_rule__SurveyTerminalTypes__Group_0__1__Impl2823);
            rule__SurveyTerminalTypes__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_0__1__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_0__2"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1433:1: rule__SurveyTerminalTypes__Group_0__2 : rule__SurveyTerminalTypes__Group_0__2__Impl rule__SurveyTerminalTypes__Group_0__3 ;
    public final void rule__SurveyTerminalTypes__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1437:1: ( rule__SurveyTerminalTypes__Group_0__2__Impl rule__SurveyTerminalTypes__Group_0__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1438:2: rule__SurveyTerminalTypes__Group_0__2__Impl rule__SurveyTerminalTypes__Group_0__3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__2__Impl_in_rule__SurveyTerminalTypes__Group_0__22853);
            rule__SurveyTerminalTypes__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__3_in_rule__SurveyTerminalTypes__Group_0__22856);
            rule__SurveyTerminalTypes__Group_0__3();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_0__2"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_0__2__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1445:1: rule__SurveyTerminalTypes__Group_0__2__Impl : ( '(' ) ;
    public final void rule__SurveyTerminalTypes__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1449:1: ( ( '(' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1450:1: ( '(' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1450:1: ( '(' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1451:1: '('
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftParenthesisKeyword_0_2()); 
            match(input,22,FOLLOW_22_in_rule__SurveyTerminalTypes__Group_0__2__Impl2884); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getLeftParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_0__2__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_0__3"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1464:1: rule__SurveyTerminalTypes__Group_0__3 : rule__SurveyTerminalTypes__Group_0__3__Impl rule__SurveyTerminalTypes__Group_0__4 ;
    public final void rule__SurveyTerminalTypes__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1468:1: ( rule__SurveyTerminalTypes__Group_0__3__Impl rule__SurveyTerminalTypes__Group_0__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1469:2: rule__SurveyTerminalTypes__Group_0__3__Impl rule__SurveyTerminalTypes__Group_0__4
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__3__Impl_in_rule__SurveyTerminalTypes__Group_0__32915);
            rule__SurveyTerminalTypes__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__4_in_rule__SurveyTerminalTypes__Group_0__32918);
            rule__SurveyTerminalTypes__Group_0__4();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_0__3"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_0__3__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1476:1: rule__SurveyTerminalTypes__Group_0__3__Impl : ( ( rule__SurveyTerminalTypes__LengthAssignment_0_3 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1480:1: ( ( ( rule__SurveyTerminalTypes__LengthAssignment_0_3 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1481:1: ( ( rule__SurveyTerminalTypes__LengthAssignment_0_3 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1481:1: ( ( rule__SurveyTerminalTypes__LengthAssignment_0_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1482:1: ( rule__SurveyTerminalTypes__LengthAssignment_0_3 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLengthAssignment_0_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1483:1: ( rule__SurveyTerminalTypes__LengthAssignment_0_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1483:2: rule__SurveyTerminalTypes__LengthAssignment_0_3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__LengthAssignment_0_3_in_rule__SurveyTerminalTypes__Group_0__3__Impl2945);
            rule__SurveyTerminalTypes__LengthAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getLengthAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_0__3__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_0__4"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1493:1: rule__SurveyTerminalTypes__Group_0__4 : rule__SurveyTerminalTypes__Group_0__4__Impl ;
    public final void rule__SurveyTerminalTypes__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1497:1: ( rule__SurveyTerminalTypes__Group_0__4__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1498:2: rule__SurveyTerminalTypes__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__4__Impl_in_rule__SurveyTerminalTypes__Group_0__42975);
            rule__SurveyTerminalTypes__Group_0__4__Impl();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_0__4"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_0__4__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1504:1: rule__SurveyTerminalTypes__Group_0__4__Impl : ( ')' ) ;
    public final void rule__SurveyTerminalTypes__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1508:1: ( ( ')' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1509:1: ( ')' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1509:1: ( ')' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1510:1: ')'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightParenthesisKeyword_0_4()); 
            match(input,23,FOLLOW_23_in_rule__SurveyTerminalTypes__Group_0__4__Impl3003); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getRightParenthesisKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_0__4__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_1__0"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1533:1: rule__SurveyTerminalTypes__Group_1__0 : rule__SurveyTerminalTypes__Group_1__0__Impl rule__SurveyTerminalTypes__Group_1__1 ;
    public final void rule__SurveyTerminalTypes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1537:1: ( rule__SurveyTerminalTypes__Group_1__0__Impl rule__SurveyTerminalTypes__Group_1__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1538:2: rule__SurveyTerminalTypes__Group_1__0__Impl rule__SurveyTerminalTypes__Group_1__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__0__Impl_in_rule__SurveyTerminalTypes__Group_1__03044);
            rule__SurveyTerminalTypes__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__1_in_rule__SurveyTerminalTypes__Group_1__03047);
            rule__SurveyTerminalTypes__Group_1__1();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_1__0"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_1__0__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1545:1: rule__SurveyTerminalTypes__Group_1__0__Impl : ( () ) ;
    public final void rule__SurveyTerminalTypes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1549:1: ( ( () ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1550:1: ( () )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1550:1: ( () )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1551:1: ()
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getTextBlockAction_1_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1552:1: ()
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1554:1: 
            {
            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getTextBlockAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_1__0__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_1__1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1564:1: rule__SurveyTerminalTypes__Group_1__1 : rule__SurveyTerminalTypes__Group_1__1__Impl rule__SurveyTerminalTypes__Group_1__2 ;
    public final void rule__SurveyTerminalTypes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1568:1: ( rule__SurveyTerminalTypes__Group_1__1__Impl rule__SurveyTerminalTypes__Group_1__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1569:2: rule__SurveyTerminalTypes__Group_1__1__Impl rule__SurveyTerminalTypes__Group_1__2
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__1__Impl_in_rule__SurveyTerminalTypes__Group_1__13105);
            rule__SurveyTerminalTypes__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__2_in_rule__SurveyTerminalTypes__Group_1__13108);
            rule__SurveyTerminalTypes__Group_1__2();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_1__1"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_1__1__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1576:1: rule__SurveyTerminalTypes__Group_1__1__Impl : ( ( rule__SurveyTerminalTypes__NameAssignment_1_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1580:1: ( ( ( rule__SurveyTerminalTypes__NameAssignment_1_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1581:1: ( ( rule__SurveyTerminalTypes__NameAssignment_1_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1581:1: ( ( rule__SurveyTerminalTypes__NameAssignment_1_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1582:1: ( rule__SurveyTerminalTypes__NameAssignment_1_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_1_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1583:1: ( rule__SurveyTerminalTypes__NameAssignment_1_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1583:2: rule__SurveyTerminalTypes__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__NameAssignment_1_1_in_rule__SurveyTerminalTypes__Group_1__1__Impl3135);
            rule__SurveyTerminalTypes__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_1__1__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_1__2"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1593:1: rule__SurveyTerminalTypes__Group_1__2 : rule__SurveyTerminalTypes__Group_1__2__Impl rule__SurveyTerminalTypes__Group_1__3 ;
    public final void rule__SurveyTerminalTypes__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1597:1: ( rule__SurveyTerminalTypes__Group_1__2__Impl rule__SurveyTerminalTypes__Group_1__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1598:2: rule__SurveyTerminalTypes__Group_1__2__Impl rule__SurveyTerminalTypes__Group_1__3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__2__Impl_in_rule__SurveyTerminalTypes__Group_1__23165);
            rule__SurveyTerminalTypes__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__3_in_rule__SurveyTerminalTypes__Group_1__23168);
            rule__SurveyTerminalTypes__Group_1__3();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_1__2"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_1__2__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1605:1: rule__SurveyTerminalTypes__Group_1__2__Impl : ( '(' ) ;
    public final void rule__SurveyTerminalTypes__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1609:1: ( ( '(' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1610:1: ( '(' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1610:1: ( '(' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1611:1: '('
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftParenthesisKeyword_1_2()); 
            match(input,22,FOLLOW_22_in_rule__SurveyTerminalTypes__Group_1__2__Impl3196); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getLeftParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_1__2__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_1__3"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1624:1: rule__SurveyTerminalTypes__Group_1__3 : rule__SurveyTerminalTypes__Group_1__3__Impl rule__SurveyTerminalTypes__Group_1__4 ;
    public final void rule__SurveyTerminalTypes__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1628:1: ( rule__SurveyTerminalTypes__Group_1__3__Impl rule__SurveyTerminalTypes__Group_1__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1629:2: rule__SurveyTerminalTypes__Group_1__3__Impl rule__SurveyTerminalTypes__Group_1__4
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__3__Impl_in_rule__SurveyTerminalTypes__Group_1__33227);
            rule__SurveyTerminalTypes__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__4_in_rule__SurveyTerminalTypes__Group_1__33230);
            rule__SurveyTerminalTypes__Group_1__4();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_1__3"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_1__3__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1636:1: rule__SurveyTerminalTypes__Group_1__3__Impl : ( ( rule__SurveyTerminalTypes__LengthAssignment_1_3 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1640:1: ( ( ( rule__SurveyTerminalTypes__LengthAssignment_1_3 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1641:1: ( ( rule__SurveyTerminalTypes__LengthAssignment_1_3 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1641:1: ( ( rule__SurveyTerminalTypes__LengthAssignment_1_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1642:1: ( rule__SurveyTerminalTypes__LengthAssignment_1_3 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLengthAssignment_1_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1643:1: ( rule__SurveyTerminalTypes__LengthAssignment_1_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1643:2: rule__SurveyTerminalTypes__LengthAssignment_1_3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__LengthAssignment_1_3_in_rule__SurveyTerminalTypes__Group_1__3__Impl3257);
            rule__SurveyTerminalTypes__LengthAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getLengthAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_1__3__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_1__4"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1653:1: rule__SurveyTerminalTypes__Group_1__4 : rule__SurveyTerminalTypes__Group_1__4__Impl ;
    public final void rule__SurveyTerminalTypes__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1657:1: ( rule__SurveyTerminalTypes__Group_1__4__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1658:2: rule__SurveyTerminalTypes__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__4__Impl_in_rule__SurveyTerminalTypes__Group_1__43287);
            rule__SurveyTerminalTypes__Group_1__4__Impl();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_1__4"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_1__4__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1664:1: rule__SurveyTerminalTypes__Group_1__4__Impl : ( ')' ) ;
    public final void rule__SurveyTerminalTypes__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1668:1: ( ( ')' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1669:1: ( ')' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1669:1: ( ')' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1670:1: ')'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightParenthesisKeyword_1_4()); 
            match(input,23,FOLLOW_23_in_rule__SurveyTerminalTypes__Group_1__4__Impl3315); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getRightParenthesisKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_1__4__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__0"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1693:1: rule__SurveyTerminalTypes__Group_2__0 : rule__SurveyTerminalTypes__Group_2__0__Impl rule__SurveyTerminalTypes__Group_2__1 ;
    public final void rule__SurveyTerminalTypes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1697:1: ( rule__SurveyTerminalTypes__Group_2__0__Impl rule__SurveyTerminalTypes__Group_2__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1698:2: rule__SurveyTerminalTypes__Group_2__0__Impl rule__SurveyTerminalTypes__Group_2__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__0__Impl_in_rule__SurveyTerminalTypes__Group_2__03356);
            rule__SurveyTerminalTypes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__1_in_rule__SurveyTerminalTypes__Group_2__03359);
            rule__SurveyTerminalTypes__Group_2__1();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__0"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__0__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1705:1: rule__SurveyTerminalTypes__Group_2__0__Impl : ( () ) ;
    public final void rule__SurveyTerminalTypes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1709:1: ( ( () ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1710:1: ( () )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1710:1: ( () )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1711:1: ()
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getMatrixAction_2_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1712:1: ()
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1714:1: 
            {
            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getMatrixAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__0__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1724:1: rule__SurveyTerminalTypes__Group_2__1 : rule__SurveyTerminalTypes__Group_2__1__Impl rule__SurveyTerminalTypes__Group_2__2 ;
    public final void rule__SurveyTerminalTypes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1728:1: ( rule__SurveyTerminalTypes__Group_2__1__Impl rule__SurveyTerminalTypes__Group_2__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1729:2: rule__SurveyTerminalTypes__Group_2__1__Impl rule__SurveyTerminalTypes__Group_2__2
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__1__Impl_in_rule__SurveyTerminalTypes__Group_2__13417);
            rule__SurveyTerminalTypes__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__2_in_rule__SurveyTerminalTypes__Group_2__13420);
            rule__SurveyTerminalTypes__Group_2__2();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__1"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__1__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1736:1: rule__SurveyTerminalTypes__Group_2__1__Impl : ( ( rule__SurveyTerminalTypes__NameAssignment_2_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1740:1: ( ( ( rule__SurveyTerminalTypes__NameAssignment_2_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1741:1: ( ( rule__SurveyTerminalTypes__NameAssignment_2_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1741:1: ( ( rule__SurveyTerminalTypes__NameAssignment_2_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1742:1: ( rule__SurveyTerminalTypes__NameAssignment_2_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_2_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1743:1: ( rule__SurveyTerminalTypes__NameAssignment_2_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1743:2: rule__SurveyTerminalTypes__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__NameAssignment_2_1_in_rule__SurveyTerminalTypes__Group_2__1__Impl3447);
            rule__SurveyTerminalTypes__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__1__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__2"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1753:1: rule__SurveyTerminalTypes__Group_2__2 : rule__SurveyTerminalTypes__Group_2__2__Impl rule__SurveyTerminalTypes__Group_2__3 ;
    public final void rule__SurveyTerminalTypes__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1757:1: ( rule__SurveyTerminalTypes__Group_2__2__Impl rule__SurveyTerminalTypes__Group_2__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1758:2: rule__SurveyTerminalTypes__Group_2__2__Impl rule__SurveyTerminalTypes__Group_2__3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__2__Impl_in_rule__SurveyTerminalTypes__Group_2__23477);
            rule__SurveyTerminalTypes__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__3_in_rule__SurveyTerminalTypes__Group_2__23480);
            rule__SurveyTerminalTypes__Group_2__3();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__2"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__2__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1765:1: rule__SurveyTerminalTypes__Group_2__2__Impl : ( '{' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1769:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1770:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1770:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1771:1: '{'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftCurlyBracketKeyword_2_2()); 
            match(input,12,FOLLOW_12_in_rule__SurveyTerminalTypes__Group_2__2__Impl3508); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getLeftCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__2__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__3"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1784:1: rule__SurveyTerminalTypes__Group_2__3 : rule__SurveyTerminalTypes__Group_2__3__Impl rule__SurveyTerminalTypes__Group_2__4 ;
    public final void rule__SurveyTerminalTypes__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1788:1: ( rule__SurveyTerminalTypes__Group_2__3__Impl rule__SurveyTerminalTypes__Group_2__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1789:2: rule__SurveyTerminalTypes__Group_2__3__Impl rule__SurveyTerminalTypes__Group_2__4
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__3__Impl_in_rule__SurveyTerminalTypes__Group_2__33539);
            rule__SurveyTerminalTypes__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__4_in_rule__SurveyTerminalTypes__Group_2__33542);
            rule__SurveyTerminalTypes__Group_2__4();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__3"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__3__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1796:1: rule__SurveyTerminalTypes__Group_2__3__Impl : ( 'Scale:' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1800:1: ( ( 'Scale:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1801:1: ( 'Scale:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1801:1: ( 'Scale:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1802:1: 'Scale:'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getScaleKeyword_2_3()); 
            match(input,24,FOLLOW_24_in_rule__SurveyTerminalTypes__Group_2__3__Impl3570); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getScaleKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__3__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__4"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1815:1: rule__SurveyTerminalTypes__Group_2__4 : rule__SurveyTerminalTypes__Group_2__4__Impl rule__SurveyTerminalTypes__Group_2__5 ;
    public final void rule__SurveyTerminalTypes__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1819:1: ( rule__SurveyTerminalTypes__Group_2__4__Impl rule__SurveyTerminalTypes__Group_2__5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1820:2: rule__SurveyTerminalTypes__Group_2__4__Impl rule__SurveyTerminalTypes__Group_2__5
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__4__Impl_in_rule__SurveyTerminalTypes__Group_2__43601);
            rule__SurveyTerminalTypes__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__5_in_rule__SurveyTerminalTypes__Group_2__43604);
            rule__SurveyTerminalTypes__Group_2__5();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__4"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__4__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1827:1: rule__SurveyTerminalTypes__Group_2__4__Impl : ( '(' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1831:1: ( ( '(' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1832:1: ( '(' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1832:1: ( '(' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1833:1: '('
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftParenthesisKeyword_2_4()); 
            match(input,22,FOLLOW_22_in_rule__SurveyTerminalTypes__Group_2__4__Impl3632); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getLeftParenthesisKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__4__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__5"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1846:1: rule__SurveyTerminalTypes__Group_2__5 : rule__SurveyTerminalTypes__Group_2__5__Impl rule__SurveyTerminalTypes__Group_2__6 ;
    public final void rule__SurveyTerminalTypes__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1850:1: ( rule__SurveyTerminalTypes__Group_2__5__Impl rule__SurveyTerminalTypes__Group_2__6 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1851:2: rule__SurveyTerminalTypes__Group_2__5__Impl rule__SurveyTerminalTypes__Group_2__6
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__5__Impl_in_rule__SurveyTerminalTypes__Group_2__53663);
            rule__SurveyTerminalTypes__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__6_in_rule__SurveyTerminalTypes__Group_2__53666);
            rule__SurveyTerminalTypes__Group_2__6();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__5"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__5__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1858:1: rule__SurveyTerminalTypes__Group_2__5__Impl : ( ( rule__SurveyTerminalTypes__AnswerAssignment_2_5 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1862:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_2_5 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1863:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_2_5 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1863:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_2_5 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1864:1: ( rule__SurveyTerminalTypes__AnswerAssignment_2_5 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_2_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1865:1: ( rule__SurveyTerminalTypes__AnswerAssignment_2_5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1865:2: rule__SurveyTerminalTypes__AnswerAssignment_2_5
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_2_5_in_rule__SurveyTerminalTypes__Group_2__5__Impl3693);
            rule__SurveyTerminalTypes__AnswerAssignment_2_5();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__5__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__6"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1875:1: rule__SurveyTerminalTypes__Group_2__6 : rule__SurveyTerminalTypes__Group_2__6__Impl rule__SurveyTerminalTypes__Group_2__7 ;
    public final void rule__SurveyTerminalTypes__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1879:1: ( rule__SurveyTerminalTypes__Group_2__6__Impl rule__SurveyTerminalTypes__Group_2__7 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1880:2: rule__SurveyTerminalTypes__Group_2__6__Impl rule__SurveyTerminalTypes__Group_2__7
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__6__Impl_in_rule__SurveyTerminalTypes__Group_2__63723);
            rule__SurveyTerminalTypes__Group_2__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__7_in_rule__SurveyTerminalTypes__Group_2__63726);
            rule__SurveyTerminalTypes__Group_2__7();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__6"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__6__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1887:1: rule__SurveyTerminalTypes__Group_2__6__Impl : ( ( rule__SurveyTerminalTypes__Group_2_6__0 )* ) ;
    public final void rule__SurveyTerminalTypes__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1891:1: ( ( ( rule__SurveyTerminalTypes__Group_2_6__0 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1892:1: ( ( rule__SurveyTerminalTypes__Group_2_6__0 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1892:1: ( ( rule__SurveyTerminalTypes__Group_2_6__0 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1893:1: ( rule__SurveyTerminalTypes__Group_2_6__0 )*
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_2_6()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1894:1: ( rule__SurveyTerminalTypes__Group_2_6__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1894:2: rule__SurveyTerminalTypes__Group_2_6__0
            	    {
            	    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_6__0_in_rule__SurveyTerminalTypes__Group_2__6__Impl3753);
            	    rule__SurveyTerminalTypes__Group_2_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSurveyTerminalTypesAccess().getGroup_2_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__6__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__7"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1904:1: rule__SurveyTerminalTypes__Group_2__7 : rule__SurveyTerminalTypes__Group_2__7__Impl rule__SurveyTerminalTypes__Group_2__8 ;
    public final void rule__SurveyTerminalTypes__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1908:1: ( rule__SurveyTerminalTypes__Group_2__7__Impl rule__SurveyTerminalTypes__Group_2__8 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1909:2: rule__SurveyTerminalTypes__Group_2__7__Impl rule__SurveyTerminalTypes__Group_2__8
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__7__Impl_in_rule__SurveyTerminalTypes__Group_2__73784);
            rule__SurveyTerminalTypes__Group_2__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__8_in_rule__SurveyTerminalTypes__Group_2__73787);
            rule__SurveyTerminalTypes__Group_2__8();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__7"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__7__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1916:1: rule__SurveyTerminalTypes__Group_2__7__Impl : ( ')' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1920:1: ( ( ')' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1921:1: ( ')' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1921:1: ( ')' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1922:1: ')'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightParenthesisKeyword_2_7()); 
            match(input,23,FOLLOW_23_in_rule__SurveyTerminalTypes__Group_2__7__Impl3815); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getRightParenthesisKeyword_2_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__7__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__8"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1935:1: rule__SurveyTerminalTypes__Group_2__8 : rule__SurveyTerminalTypes__Group_2__8__Impl rule__SurveyTerminalTypes__Group_2__9 ;
    public final void rule__SurveyTerminalTypes__Group_2__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1939:1: ( rule__SurveyTerminalTypes__Group_2__8__Impl rule__SurveyTerminalTypes__Group_2__9 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1940:2: rule__SurveyTerminalTypes__Group_2__8__Impl rule__SurveyTerminalTypes__Group_2__9
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__8__Impl_in_rule__SurveyTerminalTypes__Group_2__83846);
            rule__SurveyTerminalTypes__Group_2__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__9_in_rule__SurveyTerminalTypes__Group_2__83849);
            rule__SurveyTerminalTypes__Group_2__9();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__8"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__8__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1947:1: rule__SurveyTerminalTypes__Group_2__8__Impl : ( 'Questions:' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1951:1: ( ( 'Questions:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1952:1: ( 'Questions:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1952:1: ( 'Questions:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1953:1: 'Questions:'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getQuestionsKeyword_2_8()); 
            match(input,25,FOLLOW_25_in_rule__SurveyTerminalTypes__Group_2__8__Impl3877); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getQuestionsKeyword_2_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__8__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__9"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1966:1: rule__SurveyTerminalTypes__Group_2__9 : rule__SurveyTerminalTypes__Group_2__9__Impl rule__SurveyTerminalTypes__Group_2__10 ;
    public final void rule__SurveyTerminalTypes__Group_2__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1970:1: ( rule__SurveyTerminalTypes__Group_2__9__Impl rule__SurveyTerminalTypes__Group_2__10 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1971:2: rule__SurveyTerminalTypes__Group_2__9__Impl rule__SurveyTerminalTypes__Group_2__10
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__9__Impl_in_rule__SurveyTerminalTypes__Group_2__93908);
            rule__SurveyTerminalTypes__Group_2__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__10_in_rule__SurveyTerminalTypes__Group_2__93911);
            rule__SurveyTerminalTypes__Group_2__10();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__9"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__9__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1978:1: rule__SurveyTerminalTypes__Group_2__9__Impl : ( '(' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1982:1: ( ( '(' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1983:1: ( '(' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1983:1: ( '(' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1984:1: '('
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftParenthesisKeyword_2_9()); 
            match(input,22,FOLLOW_22_in_rule__SurveyTerminalTypes__Group_2__9__Impl3939); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getLeftParenthesisKeyword_2_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__9__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__10"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1997:1: rule__SurveyTerminalTypes__Group_2__10 : rule__SurveyTerminalTypes__Group_2__10__Impl rule__SurveyTerminalTypes__Group_2__11 ;
    public final void rule__SurveyTerminalTypes__Group_2__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2001:1: ( rule__SurveyTerminalTypes__Group_2__10__Impl rule__SurveyTerminalTypes__Group_2__11 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2002:2: rule__SurveyTerminalTypes__Group_2__10__Impl rule__SurveyTerminalTypes__Group_2__11
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__10__Impl_in_rule__SurveyTerminalTypes__Group_2__103970);
            rule__SurveyTerminalTypes__Group_2__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__11_in_rule__SurveyTerminalTypes__Group_2__103973);
            rule__SurveyTerminalTypes__Group_2__11();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__10"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__10__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2009:1: rule__SurveyTerminalTypes__Group_2__10__Impl : ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_2__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2013:1: ( ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2014:1: ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2014:1: ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2015:1: ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getMatrixQuestionAssignment_2_10()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2016:1: ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2016:2: rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10_in_rule__SurveyTerminalTypes__Group_2__10__Impl4000);
            rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getMatrixQuestionAssignment_2_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__10__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__11"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2026:1: rule__SurveyTerminalTypes__Group_2__11 : rule__SurveyTerminalTypes__Group_2__11__Impl rule__SurveyTerminalTypes__Group_2__12 ;
    public final void rule__SurveyTerminalTypes__Group_2__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2030:1: ( rule__SurveyTerminalTypes__Group_2__11__Impl rule__SurveyTerminalTypes__Group_2__12 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2031:2: rule__SurveyTerminalTypes__Group_2__11__Impl rule__SurveyTerminalTypes__Group_2__12
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__11__Impl_in_rule__SurveyTerminalTypes__Group_2__114030);
            rule__SurveyTerminalTypes__Group_2__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__12_in_rule__SurveyTerminalTypes__Group_2__114033);
            rule__SurveyTerminalTypes__Group_2__12();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__11"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__11__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2038:1: rule__SurveyTerminalTypes__Group_2__11__Impl : ( ( rule__SurveyTerminalTypes__Group_2_11__0 )* ) ;
    public final void rule__SurveyTerminalTypes__Group_2__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2042:1: ( ( ( rule__SurveyTerminalTypes__Group_2_11__0 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2043:1: ( ( rule__SurveyTerminalTypes__Group_2_11__0 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2043:1: ( ( rule__SurveyTerminalTypes__Group_2_11__0 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2044:1: ( rule__SurveyTerminalTypes__Group_2_11__0 )*
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_2_11()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2045:1: ( rule__SurveyTerminalTypes__Group_2_11__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2045:2: rule__SurveyTerminalTypes__Group_2_11__0
            	    {
            	    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_11__0_in_rule__SurveyTerminalTypes__Group_2__11__Impl4060);
            	    rule__SurveyTerminalTypes__Group_2_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSurveyTerminalTypesAccess().getGroup_2_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__11__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__12"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2055:1: rule__SurveyTerminalTypes__Group_2__12 : rule__SurveyTerminalTypes__Group_2__12__Impl rule__SurveyTerminalTypes__Group_2__13 ;
    public final void rule__SurveyTerminalTypes__Group_2__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2059:1: ( rule__SurveyTerminalTypes__Group_2__12__Impl rule__SurveyTerminalTypes__Group_2__13 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2060:2: rule__SurveyTerminalTypes__Group_2__12__Impl rule__SurveyTerminalTypes__Group_2__13
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__12__Impl_in_rule__SurveyTerminalTypes__Group_2__124091);
            rule__SurveyTerminalTypes__Group_2__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__13_in_rule__SurveyTerminalTypes__Group_2__124094);
            rule__SurveyTerminalTypes__Group_2__13();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__12"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__12__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2067:1: rule__SurveyTerminalTypes__Group_2__12__Impl : ( ')' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2071:1: ( ( ')' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2072:1: ( ')' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2072:1: ( ')' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2073:1: ')'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightParenthesisKeyword_2_12()); 
            match(input,23,FOLLOW_23_in_rule__SurveyTerminalTypes__Group_2__12__Impl4122); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getRightParenthesisKeyword_2_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__12__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__13"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2086:1: rule__SurveyTerminalTypes__Group_2__13 : rule__SurveyTerminalTypes__Group_2__13__Impl ;
    public final void rule__SurveyTerminalTypes__Group_2__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2090:1: ( rule__SurveyTerminalTypes__Group_2__13__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2091:2: rule__SurveyTerminalTypes__Group_2__13__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__13__Impl_in_rule__SurveyTerminalTypes__Group_2__134153);
            rule__SurveyTerminalTypes__Group_2__13__Impl();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__13"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2__13__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2097:1: rule__SurveyTerminalTypes__Group_2__13__Impl : ( '}' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2101:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2102:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2102:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2103:1: '}'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightCurlyBracketKeyword_2_13()); 
            match(input,14,FOLLOW_14_in_rule__SurveyTerminalTypes__Group_2__13__Impl4181); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getRightCurlyBracketKeyword_2_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2__13__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2_6__0"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2144:1: rule__SurveyTerminalTypes__Group_2_6__0 : rule__SurveyTerminalTypes__Group_2_6__0__Impl rule__SurveyTerminalTypes__Group_2_6__1 ;
    public final void rule__SurveyTerminalTypes__Group_2_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2148:1: ( rule__SurveyTerminalTypes__Group_2_6__0__Impl rule__SurveyTerminalTypes__Group_2_6__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2149:2: rule__SurveyTerminalTypes__Group_2_6__0__Impl rule__SurveyTerminalTypes__Group_2_6__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_6__0__Impl_in_rule__SurveyTerminalTypes__Group_2_6__04240);
            rule__SurveyTerminalTypes__Group_2_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_6__1_in_rule__SurveyTerminalTypes__Group_2_6__04243);
            rule__SurveyTerminalTypes__Group_2_6__1();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2_6__0"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2_6__0__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2156:1: rule__SurveyTerminalTypes__Group_2_6__0__Impl : ( '|' ) ;
    public final void rule__SurveyTerminalTypes__Group_2_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2160:1: ( ( '|' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2161:1: ( '|' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2161:1: ( '|' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2162:1: '|'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getVerticalLineKeyword_2_6_0()); 
            match(input,26,FOLLOW_26_in_rule__SurveyTerminalTypes__Group_2_6__0__Impl4271); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getVerticalLineKeyword_2_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2_6__0__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2_6__1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2175:1: rule__SurveyTerminalTypes__Group_2_6__1 : rule__SurveyTerminalTypes__Group_2_6__1__Impl ;
    public final void rule__SurveyTerminalTypes__Group_2_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2179:1: ( rule__SurveyTerminalTypes__Group_2_6__1__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2180:2: rule__SurveyTerminalTypes__Group_2_6__1__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_6__1__Impl_in_rule__SurveyTerminalTypes__Group_2_6__14302);
            rule__SurveyTerminalTypes__Group_2_6__1__Impl();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2_6__1"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2_6__1__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2186:1: rule__SurveyTerminalTypes__Group_2_6__1__Impl : ( ( rule__SurveyTerminalTypes__AnswerAssignment_2_6_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_2_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2190:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_2_6_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2191:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_2_6_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2191:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_2_6_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2192:1: ( rule__SurveyTerminalTypes__AnswerAssignment_2_6_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_2_6_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2193:1: ( rule__SurveyTerminalTypes__AnswerAssignment_2_6_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2193:2: rule__SurveyTerminalTypes__AnswerAssignment_2_6_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_2_6_1_in_rule__SurveyTerminalTypes__Group_2_6__1__Impl4329);
            rule__SurveyTerminalTypes__AnswerAssignment_2_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_2_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2_6__1__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2_11__0"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2207:1: rule__SurveyTerminalTypes__Group_2_11__0 : rule__SurveyTerminalTypes__Group_2_11__0__Impl rule__SurveyTerminalTypes__Group_2_11__1 ;
    public final void rule__SurveyTerminalTypes__Group_2_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2211:1: ( rule__SurveyTerminalTypes__Group_2_11__0__Impl rule__SurveyTerminalTypes__Group_2_11__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2212:2: rule__SurveyTerminalTypes__Group_2_11__0__Impl rule__SurveyTerminalTypes__Group_2_11__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_11__0__Impl_in_rule__SurveyTerminalTypes__Group_2_11__04363);
            rule__SurveyTerminalTypes__Group_2_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_11__1_in_rule__SurveyTerminalTypes__Group_2_11__04366);
            rule__SurveyTerminalTypes__Group_2_11__1();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2_11__0"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2_11__0__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2219:1: rule__SurveyTerminalTypes__Group_2_11__0__Impl : ( '|' ) ;
    public final void rule__SurveyTerminalTypes__Group_2_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2223:1: ( ( '|' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2224:1: ( '|' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2224:1: ( '|' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2225:1: '|'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getVerticalLineKeyword_2_11_0()); 
            match(input,26,FOLLOW_26_in_rule__SurveyTerminalTypes__Group_2_11__0__Impl4394); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getVerticalLineKeyword_2_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2_11__0__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2_11__1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2238:1: rule__SurveyTerminalTypes__Group_2_11__1 : rule__SurveyTerminalTypes__Group_2_11__1__Impl ;
    public final void rule__SurveyTerminalTypes__Group_2_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2242:1: ( rule__SurveyTerminalTypes__Group_2_11__1__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2243:2: rule__SurveyTerminalTypes__Group_2_11__1__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_11__1__Impl_in_rule__SurveyTerminalTypes__Group_2_11__14425);
            rule__SurveyTerminalTypes__Group_2_11__1__Impl();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2_11__1"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_2_11__1__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2249:1: rule__SurveyTerminalTypes__Group_2_11__1__Impl : ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_2_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2253:1: ( ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2254:1: ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2254:1: ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2255:1: ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getMatrixQuestionAssignment_2_11_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2256:1: ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2256:2: rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1_in_rule__SurveyTerminalTypes__Group_2_11__1__Impl4452);
            rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getMatrixQuestionAssignment_2_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_2_11__1__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_3__0"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2270:1: rule__SurveyTerminalTypes__Group_3__0 : rule__SurveyTerminalTypes__Group_3__0__Impl rule__SurveyTerminalTypes__Group_3__1 ;
    public final void rule__SurveyTerminalTypes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2274:1: ( rule__SurveyTerminalTypes__Group_3__0__Impl rule__SurveyTerminalTypes__Group_3__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2275:2: rule__SurveyTerminalTypes__Group_3__0__Impl rule__SurveyTerminalTypes__Group_3__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__0__Impl_in_rule__SurveyTerminalTypes__Group_3__04486);
            rule__SurveyTerminalTypes__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__1_in_rule__SurveyTerminalTypes__Group_3__04489);
            rule__SurveyTerminalTypes__Group_3__1();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_3__0"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_3__0__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2282:1: rule__SurveyTerminalTypes__Group_3__0__Impl : ( () ) ;
    public final void rule__SurveyTerminalTypes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2286:1: ( ( () ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2287:1: ( () )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2287:1: ( () )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2288:1: ()
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getCheckBoxAction_3_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2289:1: ()
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2291:1: 
            {
            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getCheckBoxAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_3__0__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_3__1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2301:1: rule__SurveyTerminalTypes__Group_3__1 : rule__SurveyTerminalTypes__Group_3__1__Impl rule__SurveyTerminalTypes__Group_3__2 ;
    public final void rule__SurveyTerminalTypes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2305:1: ( rule__SurveyTerminalTypes__Group_3__1__Impl rule__SurveyTerminalTypes__Group_3__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2306:2: rule__SurveyTerminalTypes__Group_3__1__Impl rule__SurveyTerminalTypes__Group_3__2
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__1__Impl_in_rule__SurveyTerminalTypes__Group_3__14547);
            rule__SurveyTerminalTypes__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__2_in_rule__SurveyTerminalTypes__Group_3__14550);
            rule__SurveyTerminalTypes__Group_3__2();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_3__1"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_3__1__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2313:1: rule__SurveyTerminalTypes__Group_3__1__Impl : ( ( rule__SurveyTerminalTypes__NameAssignment_3_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2317:1: ( ( ( rule__SurveyTerminalTypes__NameAssignment_3_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2318:1: ( ( rule__SurveyTerminalTypes__NameAssignment_3_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2318:1: ( ( rule__SurveyTerminalTypes__NameAssignment_3_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2319:1: ( rule__SurveyTerminalTypes__NameAssignment_3_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_3_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2320:1: ( rule__SurveyTerminalTypes__NameAssignment_3_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2320:2: rule__SurveyTerminalTypes__NameAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__NameAssignment_3_1_in_rule__SurveyTerminalTypes__Group_3__1__Impl4577);
            rule__SurveyTerminalTypes__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_3__1__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_3__2"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2330:1: rule__SurveyTerminalTypes__Group_3__2 : rule__SurveyTerminalTypes__Group_3__2__Impl rule__SurveyTerminalTypes__Group_3__3 ;
    public final void rule__SurveyTerminalTypes__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2334:1: ( rule__SurveyTerminalTypes__Group_3__2__Impl rule__SurveyTerminalTypes__Group_3__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2335:2: rule__SurveyTerminalTypes__Group_3__2__Impl rule__SurveyTerminalTypes__Group_3__3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__2__Impl_in_rule__SurveyTerminalTypes__Group_3__24607);
            rule__SurveyTerminalTypes__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__3_in_rule__SurveyTerminalTypes__Group_3__24610);
            rule__SurveyTerminalTypes__Group_3__3();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_3__2"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_3__2__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2342:1: rule__SurveyTerminalTypes__Group_3__2__Impl : ( '{' ) ;
    public final void rule__SurveyTerminalTypes__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2346:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2347:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2347:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2348:1: '{'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftCurlyBracketKeyword_3_2()); 
            match(input,12,FOLLOW_12_in_rule__SurveyTerminalTypes__Group_3__2__Impl4638); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getLeftCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_3__2__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_3__3"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2361:1: rule__SurveyTerminalTypes__Group_3__3 : rule__SurveyTerminalTypes__Group_3__3__Impl rule__SurveyTerminalTypes__Group_3__4 ;
    public final void rule__SurveyTerminalTypes__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2365:1: ( rule__SurveyTerminalTypes__Group_3__3__Impl rule__SurveyTerminalTypes__Group_3__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2366:2: rule__SurveyTerminalTypes__Group_3__3__Impl rule__SurveyTerminalTypes__Group_3__4
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__3__Impl_in_rule__SurveyTerminalTypes__Group_3__34669);
            rule__SurveyTerminalTypes__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__4_in_rule__SurveyTerminalTypes__Group_3__34672);
            rule__SurveyTerminalTypes__Group_3__4();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_3__3"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_3__3__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2373:1: rule__SurveyTerminalTypes__Group_3__3__Impl : ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )* ) ) ;
    public final void rule__SurveyTerminalTypes__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2377:1: ( ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )* ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2378:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2378:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2379:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2379:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2380:1: ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_3_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2381:1: ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2381:2: rule__SurveyTerminalTypes__AnswerAssignment_3_3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_3_3_in_rule__SurveyTerminalTypes__Group_3__3__Impl4701);
            rule__SurveyTerminalTypes__AnswerAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_3_3()); 

            }

            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2384:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2385:1: ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )*
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_3_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2386:1: ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2386:2: rule__SurveyTerminalTypes__AnswerAssignment_3_3
            	    {
            	    pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_3_3_in_rule__SurveyTerminalTypes__Group_3__3__Impl4713);
            	    rule__SurveyTerminalTypes__AnswerAssignment_3_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_3_3()); 

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_3__3__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_3__4"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2397:1: rule__SurveyTerminalTypes__Group_3__4 : rule__SurveyTerminalTypes__Group_3__4__Impl ;
    public final void rule__SurveyTerminalTypes__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2401:1: ( rule__SurveyTerminalTypes__Group_3__4__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2402:2: rule__SurveyTerminalTypes__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__4__Impl_in_rule__SurveyTerminalTypes__Group_3__44746);
            rule__SurveyTerminalTypes__Group_3__4__Impl();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_3__4"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_3__4__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2408:1: rule__SurveyTerminalTypes__Group_3__4__Impl : ( '}' ) ;
    public final void rule__SurveyTerminalTypes__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2412:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2413:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2413:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2414:1: '}'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,14,FOLLOW_14_in_rule__SurveyTerminalTypes__Group_3__4__Impl4774); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_3__4__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_4__0"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2437:1: rule__SurveyTerminalTypes__Group_4__0 : rule__SurveyTerminalTypes__Group_4__0__Impl rule__SurveyTerminalTypes__Group_4__1 ;
    public final void rule__SurveyTerminalTypes__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2441:1: ( rule__SurveyTerminalTypes__Group_4__0__Impl rule__SurveyTerminalTypes__Group_4__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2442:2: rule__SurveyTerminalTypes__Group_4__0__Impl rule__SurveyTerminalTypes__Group_4__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__0__Impl_in_rule__SurveyTerminalTypes__Group_4__04815);
            rule__SurveyTerminalTypes__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__1_in_rule__SurveyTerminalTypes__Group_4__04818);
            rule__SurveyTerminalTypes__Group_4__1();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_4__0"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_4__0__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2449:1: rule__SurveyTerminalTypes__Group_4__0__Impl : ( () ) ;
    public final void rule__SurveyTerminalTypes__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2453:1: ( ( () ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2454:1: ( () )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2454:1: ( () )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2455:1: ()
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getDropDownAction_4_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2456:1: ()
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2458:1: 
            {
            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getDropDownAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_4__0__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_4__1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2468:1: rule__SurveyTerminalTypes__Group_4__1 : rule__SurveyTerminalTypes__Group_4__1__Impl rule__SurveyTerminalTypes__Group_4__2 ;
    public final void rule__SurveyTerminalTypes__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2472:1: ( rule__SurveyTerminalTypes__Group_4__1__Impl rule__SurveyTerminalTypes__Group_4__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2473:2: rule__SurveyTerminalTypes__Group_4__1__Impl rule__SurveyTerminalTypes__Group_4__2
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__1__Impl_in_rule__SurveyTerminalTypes__Group_4__14876);
            rule__SurveyTerminalTypes__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__2_in_rule__SurveyTerminalTypes__Group_4__14879);
            rule__SurveyTerminalTypes__Group_4__2();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_4__1"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_4__1__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2480:1: rule__SurveyTerminalTypes__Group_4__1__Impl : ( ( rule__SurveyTerminalTypes__NameAssignment_4_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2484:1: ( ( ( rule__SurveyTerminalTypes__NameAssignment_4_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2485:1: ( ( rule__SurveyTerminalTypes__NameAssignment_4_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2485:1: ( ( rule__SurveyTerminalTypes__NameAssignment_4_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2486:1: ( rule__SurveyTerminalTypes__NameAssignment_4_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_4_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2487:1: ( rule__SurveyTerminalTypes__NameAssignment_4_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2487:2: rule__SurveyTerminalTypes__NameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__NameAssignment_4_1_in_rule__SurveyTerminalTypes__Group_4__1__Impl4906);
            rule__SurveyTerminalTypes__NameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_4__1__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_4__2"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2497:1: rule__SurveyTerminalTypes__Group_4__2 : rule__SurveyTerminalTypes__Group_4__2__Impl rule__SurveyTerminalTypes__Group_4__3 ;
    public final void rule__SurveyTerminalTypes__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2501:1: ( rule__SurveyTerminalTypes__Group_4__2__Impl rule__SurveyTerminalTypes__Group_4__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2502:2: rule__SurveyTerminalTypes__Group_4__2__Impl rule__SurveyTerminalTypes__Group_4__3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__2__Impl_in_rule__SurveyTerminalTypes__Group_4__24936);
            rule__SurveyTerminalTypes__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__3_in_rule__SurveyTerminalTypes__Group_4__24939);
            rule__SurveyTerminalTypes__Group_4__3();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_4__2"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_4__2__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2509:1: rule__SurveyTerminalTypes__Group_4__2__Impl : ( '{' ) ;
    public final void rule__SurveyTerminalTypes__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2513:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2514:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2514:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2515:1: '{'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftCurlyBracketKeyword_4_2()); 
            match(input,12,FOLLOW_12_in_rule__SurveyTerminalTypes__Group_4__2__Impl4967); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getLeftCurlyBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_4__2__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_4__3"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2528:1: rule__SurveyTerminalTypes__Group_4__3 : rule__SurveyTerminalTypes__Group_4__3__Impl rule__SurveyTerminalTypes__Group_4__4 ;
    public final void rule__SurveyTerminalTypes__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2532:1: ( rule__SurveyTerminalTypes__Group_4__3__Impl rule__SurveyTerminalTypes__Group_4__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2533:2: rule__SurveyTerminalTypes__Group_4__3__Impl rule__SurveyTerminalTypes__Group_4__4
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__3__Impl_in_rule__SurveyTerminalTypes__Group_4__34998);
            rule__SurveyTerminalTypes__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__4_in_rule__SurveyTerminalTypes__Group_4__35001);
            rule__SurveyTerminalTypes__Group_4__4();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_4__3"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_4__3__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2540:1: rule__SurveyTerminalTypes__Group_4__3__Impl : ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )* ) ) ;
    public final void rule__SurveyTerminalTypes__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2544:1: ( ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )* ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2545:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2545:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2546:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2546:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2547:1: ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_4_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2548:1: ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2548:2: rule__SurveyTerminalTypes__AnswerAssignment_4_3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_4_3_in_rule__SurveyTerminalTypes__Group_4__3__Impl5030);
            rule__SurveyTerminalTypes__AnswerAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_4_3()); 

            }

            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2551:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2552:1: ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )*
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_4_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2553:1: ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2553:2: rule__SurveyTerminalTypes__AnswerAssignment_4_3
            	    {
            	    pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_4_3_in_rule__SurveyTerminalTypes__Group_4__3__Impl5042);
            	    rule__SurveyTerminalTypes__AnswerAssignment_4_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_4_3()); 

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_4__3__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_4__4"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2564:1: rule__SurveyTerminalTypes__Group_4__4 : rule__SurveyTerminalTypes__Group_4__4__Impl ;
    public final void rule__SurveyTerminalTypes__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2568:1: ( rule__SurveyTerminalTypes__Group_4__4__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2569:2: rule__SurveyTerminalTypes__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__4__Impl_in_rule__SurveyTerminalTypes__Group_4__45075);
            rule__SurveyTerminalTypes__Group_4__4__Impl();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_4__4"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_4__4__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2575:1: rule__SurveyTerminalTypes__Group_4__4__Impl : ( '}' ) ;
    public final void rule__SurveyTerminalTypes__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2579:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2580:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2580:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2581:1: '}'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,14,FOLLOW_14_in_rule__SurveyTerminalTypes__Group_4__4__Impl5103); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_4__4__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_5__0"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2604:1: rule__SurveyTerminalTypes__Group_5__0 : rule__SurveyTerminalTypes__Group_5__0__Impl rule__SurveyTerminalTypes__Group_5__1 ;
    public final void rule__SurveyTerminalTypes__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2608:1: ( rule__SurveyTerminalTypes__Group_5__0__Impl rule__SurveyTerminalTypes__Group_5__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2609:2: rule__SurveyTerminalTypes__Group_5__0__Impl rule__SurveyTerminalTypes__Group_5__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__0__Impl_in_rule__SurveyTerminalTypes__Group_5__05144);
            rule__SurveyTerminalTypes__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__1_in_rule__SurveyTerminalTypes__Group_5__05147);
            rule__SurveyTerminalTypes__Group_5__1();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_5__0"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_5__0__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2616:1: rule__SurveyTerminalTypes__Group_5__0__Impl : ( () ) ;
    public final void rule__SurveyTerminalTypes__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2620:1: ( ( () ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2621:1: ( () )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2621:1: ( () )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2622:1: ()
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRadioAction_5_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2623:1: ()
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2625:1: 
            {
            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getRadioAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_5__0__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_5__1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2635:1: rule__SurveyTerminalTypes__Group_5__1 : rule__SurveyTerminalTypes__Group_5__1__Impl rule__SurveyTerminalTypes__Group_5__2 ;
    public final void rule__SurveyTerminalTypes__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2639:1: ( rule__SurveyTerminalTypes__Group_5__1__Impl rule__SurveyTerminalTypes__Group_5__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2640:2: rule__SurveyTerminalTypes__Group_5__1__Impl rule__SurveyTerminalTypes__Group_5__2
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__1__Impl_in_rule__SurveyTerminalTypes__Group_5__15205);
            rule__SurveyTerminalTypes__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__2_in_rule__SurveyTerminalTypes__Group_5__15208);
            rule__SurveyTerminalTypes__Group_5__2();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_5__1"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_5__1__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2647:1: rule__SurveyTerminalTypes__Group_5__1__Impl : ( ( rule__SurveyTerminalTypes__NameAssignment_5_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2651:1: ( ( ( rule__SurveyTerminalTypes__NameAssignment_5_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2652:1: ( ( rule__SurveyTerminalTypes__NameAssignment_5_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2652:1: ( ( rule__SurveyTerminalTypes__NameAssignment_5_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2653:1: ( rule__SurveyTerminalTypes__NameAssignment_5_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_5_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2654:1: ( rule__SurveyTerminalTypes__NameAssignment_5_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2654:2: rule__SurveyTerminalTypes__NameAssignment_5_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__NameAssignment_5_1_in_rule__SurveyTerminalTypes__Group_5__1__Impl5235);
            rule__SurveyTerminalTypes__NameAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_5__1__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_5__2"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2664:1: rule__SurveyTerminalTypes__Group_5__2 : rule__SurveyTerminalTypes__Group_5__2__Impl rule__SurveyTerminalTypes__Group_5__3 ;
    public final void rule__SurveyTerminalTypes__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2668:1: ( rule__SurveyTerminalTypes__Group_5__2__Impl rule__SurveyTerminalTypes__Group_5__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2669:2: rule__SurveyTerminalTypes__Group_5__2__Impl rule__SurveyTerminalTypes__Group_5__3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__2__Impl_in_rule__SurveyTerminalTypes__Group_5__25265);
            rule__SurveyTerminalTypes__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__3_in_rule__SurveyTerminalTypes__Group_5__25268);
            rule__SurveyTerminalTypes__Group_5__3();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_5__2"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_5__2__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2676:1: rule__SurveyTerminalTypes__Group_5__2__Impl : ( '{' ) ;
    public final void rule__SurveyTerminalTypes__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2680:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2681:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2681:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2682:1: '{'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftCurlyBracketKeyword_5_2()); 
            match(input,12,FOLLOW_12_in_rule__SurveyTerminalTypes__Group_5__2__Impl5296); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getLeftCurlyBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_5__2__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_5__3"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2695:1: rule__SurveyTerminalTypes__Group_5__3 : rule__SurveyTerminalTypes__Group_5__3__Impl rule__SurveyTerminalTypes__Group_5__4 ;
    public final void rule__SurveyTerminalTypes__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2699:1: ( rule__SurveyTerminalTypes__Group_5__3__Impl rule__SurveyTerminalTypes__Group_5__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2700:2: rule__SurveyTerminalTypes__Group_5__3__Impl rule__SurveyTerminalTypes__Group_5__4
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__3__Impl_in_rule__SurveyTerminalTypes__Group_5__35327);
            rule__SurveyTerminalTypes__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__4_in_rule__SurveyTerminalTypes__Group_5__35330);
            rule__SurveyTerminalTypes__Group_5__4();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_5__3"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_5__3__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2707:1: rule__SurveyTerminalTypes__Group_5__3__Impl : ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )* ) ) ;
    public final void rule__SurveyTerminalTypes__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2711:1: ( ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )* ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2712:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2712:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2713:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2713:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2714:1: ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_5_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2715:1: ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2715:2: rule__SurveyTerminalTypes__AnswerAssignment_5_3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_5_3_in_rule__SurveyTerminalTypes__Group_5__3__Impl5359);
            rule__SurveyTerminalTypes__AnswerAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_5_3()); 

            }

            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2718:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2719:1: ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )*
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_5_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2720:1: ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2720:2: rule__SurveyTerminalTypes__AnswerAssignment_5_3
            	    {
            	    pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_5_3_in_rule__SurveyTerminalTypes__Group_5__3__Impl5371);
            	    rule__SurveyTerminalTypes__AnswerAssignment_5_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_5_3()); 

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_5__3__Impl"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_5__4"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2731:1: rule__SurveyTerminalTypes__Group_5__4 : rule__SurveyTerminalTypes__Group_5__4__Impl ;
    public final void rule__SurveyTerminalTypes__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2735:1: ( rule__SurveyTerminalTypes__Group_5__4__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2736:2: rule__SurveyTerminalTypes__Group_5__4__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__4__Impl_in_rule__SurveyTerminalTypes__Group_5__45404);
            rule__SurveyTerminalTypes__Group_5__4__Impl();

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
    // $ANTLR end "rule__SurveyTerminalTypes__Group_5__4"


    // $ANTLR start "rule__SurveyTerminalTypes__Group_5__4__Impl"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2742:1: rule__SurveyTerminalTypes__Group_5__4__Impl : ( '}' ) ;
    public final void rule__SurveyTerminalTypes__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2746:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2747:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2747:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2748:1: '}'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,14,FOLLOW_14_in_rule__SurveyTerminalTypes__Group_5__4__Impl5432); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__Group_5__4__Impl"


    // $ANTLR start "rule__Survey__QuestionnaireAssignment"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2772:1: rule__Survey__QuestionnaireAssignment : ( ruleQuestionnaire ) ;
    public final void rule__Survey__QuestionnaireAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2776:1: ( ( ruleQuestionnaire ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2777:1: ( ruleQuestionnaire )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2777:1: ( ruleQuestionnaire )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2778:1: ruleQuestionnaire
            {
             before(grammarAccess.getSurveyAccess().getQuestionnaireQuestionnaireParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQuestionnaire_in_rule__Survey__QuestionnaireAssignment5478);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2787:1: rule__Questionnaire__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Questionnaire__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2791:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2792:1: ( RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2792:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2793:1: RULE_STRING
            {
             before(grammarAccess.getQuestionnaireAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Questionnaire__NameAssignment_15509); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2802:1: rule__Questionnaire__IdAssignment_4 : ( ruleIdentifier ) ;
    public final void rule__Questionnaire__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2806:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2807:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2807:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2808:1: ruleIdentifier
            {
             before(grammarAccess.getQuestionnaireAccess().getIdIdentifierParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Questionnaire__IdAssignment_45540);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2817:1: rule__Questionnaire__PartAssignment_5 : ( rulePart ) ;
    public final void rule__Questionnaire__PartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2821:1: ( ( rulePart ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2822:1: ( rulePart )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2822:1: ( rulePart )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2823:1: rulePart
            {
             before(grammarAccess.getQuestionnaireAccess().getPartPartParserRuleCall_5_0()); 
            pushFollow(FOLLOW_rulePart_in_rule__Questionnaire__PartAssignment_55571);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2832:1: rule__Part__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Part__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2836:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2837:1: ( RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2837:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2838:1: RULE_STRING
            {
             before(grammarAccess.getPartAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Part__NameAssignment_15602); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2847:1: rule__Part__IdAssignment_4 : ( ruleIdentifier ) ;
    public final void rule__Part__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2851:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2852:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2852:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2853:1: ruleIdentifier
            {
             before(grammarAccess.getPartAccess().getIdIdentifierParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Part__IdAssignment_45633);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2862:1: rule__Part__QuestionAssignment_5 : ( ruleQuestion ) ;
    public final void rule__Part__QuestionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2866:1: ( ( ruleQuestion ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2867:1: ( ruleQuestion )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2867:1: ( ruleQuestion )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2868:1: ruleQuestion
            {
             before(grammarAccess.getPartAccess().getQuestionQuestionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Part__QuestionAssignment_55664);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2877:1: rule__Question__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Question__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2881:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2882:1: ( RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2882:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2883:1: RULE_STRING
            {
             before(grammarAccess.getQuestionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Question__NameAssignment_15695); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2892:1: rule__Question__IdAssignment_4 : ( ruleIdentifier ) ;
    public final void rule__Question__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2896:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2897:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2897:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2898:1: ruleIdentifier
            {
             before(grammarAccess.getQuestionAccess().getIdIdentifierParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Question__IdAssignment_45726);
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


    // $ANTLR start "rule__Question__MandatoryAssignment_5"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2907:1: rule__Question__MandatoryAssignment_5 : ( ( 'Mandatory Field' ) ) ;
    public final void rule__Question__MandatoryAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2911:1: ( ( ( 'Mandatory Field' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2912:1: ( ( 'Mandatory Field' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2912:1: ( ( 'Mandatory Field' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2913:1: ( 'Mandatory Field' )
            {
             before(grammarAccess.getQuestionAccess().getMandatoryMandatoryFieldKeyword_5_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2914:1: ( 'Mandatory Field' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2915:1: 'Mandatory Field'
            {
             before(grammarAccess.getQuestionAccess().getMandatoryMandatoryFieldKeyword_5_0()); 
            match(input,27,FOLLOW_27_in_rule__Question__MandatoryAssignment_55762); 
             after(grammarAccess.getQuestionAccess().getMandatoryMandatoryFieldKeyword_5_0()); 

            }

             after(grammarAccess.getQuestionAccess().getMandatoryMandatoryFieldKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__MandatoryAssignment_5"


    // $ANTLR start "rule__Question__QuestionTypeAssignment_7"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2930:1: rule__Question__QuestionTypeAssignment_7 : ( ruleSurveyTerminalTypes ) ;
    public final void rule__Question__QuestionTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2934:1: ( ( ruleSurveyTerminalTypes ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2935:1: ( ruleSurveyTerminalTypes )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2935:1: ( ruleSurveyTerminalTypes )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2936:1: ruleSurveyTerminalTypes
            {
             before(grammarAccess.getQuestionAccess().getQuestionTypeSurveyTerminalTypesParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleSurveyTerminalTypes_in_rule__Question__QuestionTypeAssignment_75801);
            ruleSurveyTerminalTypes();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getQuestionTypeSurveyTerminalTypesParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__QuestionTypeAssignment_7"


    // $ANTLR start "rule__MatrixQuestion__IdAssignment_1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2945:1: rule__MatrixQuestion__IdAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__MatrixQuestion__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2949:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2950:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2950:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2951:1: ruleIdentifier
            {
             before(grammarAccess.getMatrixQuestionAccess().getIdIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__MatrixQuestion__IdAssignment_15832);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getMatrixQuestionAccess().getIdIdentifierParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__IdAssignment_1"


    // $ANTLR start "rule__MatrixQuestion__NameAssignment_3"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2960:1: rule__MatrixQuestion__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__MatrixQuestion__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2964:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2965:1: ( RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2965:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2966:1: RULE_STRING
            {
             before(grammarAccess.getMatrixQuestionAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MatrixQuestion__NameAssignment_35863); 
             after(grammarAccess.getMatrixQuestionAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__NameAssignment_3"


    // $ANTLR start "rule__Answer__IdAssignment_1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2976:1: rule__Answer__IdAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__Answer__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2980:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2981:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2981:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2982:1: ruleIdentifier
            {
             before(grammarAccess.getAnswerAccess().getIdIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Answer__IdAssignment_15895);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2991:1: rule__Answer__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Answer__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2995:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2996:1: ( RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2996:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2997:1: RULE_STRING
            {
             before(grammarAccess.getAnswerAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Answer__NameAssignment_35926); 
             after(grammarAccess.getAnswerAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SurveyTerminalTypes__NameAssignment_0_1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3006:1: rule__SurveyTerminalTypes__NameAssignment_0_1 : ( ( 'TextLine' ) ) ;
    public final void rule__SurveyTerminalTypes__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3010:1: ( ( ( 'TextLine' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3011:1: ( ( 'TextLine' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3011:1: ( ( 'TextLine' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3012:1: ( 'TextLine' )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameTextLineKeyword_0_1_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3013:1: ( 'TextLine' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3014:1: 'TextLine'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameTextLineKeyword_0_1_0()); 
            match(input,28,FOLLOW_28_in_rule__SurveyTerminalTypes__NameAssignment_0_15962); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getNameTextLineKeyword_0_1_0()); 

            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getNameTextLineKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__NameAssignment_0_1"


    // $ANTLR start "rule__SurveyTerminalTypes__LengthAssignment_0_3"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3029:1: rule__SurveyTerminalTypes__LengthAssignment_0_3 : ( RULE_INT ) ;
    public final void rule__SurveyTerminalTypes__LengthAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3033:1: ( ( RULE_INT ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3034:1: ( RULE_INT )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3034:1: ( RULE_INT )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3035:1: RULE_INT
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLengthINTTerminalRuleCall_0_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SurveyTerminalTypes__LengthAssignment_0_36001); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getLengthINTTerminalRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__LengthAssignment_0_3"


    // $ANTLR start "rule__SurveyTerminalTypes__NameAssignment_1_1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3044:1: rule__SurveyTerminalTypes__NameAssignment_1_1 : ( ( 'TextBlock' ) ) ;
    public final void rule__SurveyTerminalTypes__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3048:1: ( ( ( 'TextBlock' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3049:1: ( ( 'TextBlock' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3049:1: ( ( 'TextBlock' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3050:1: ( 'TextBlock' )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameTextBlockKeyword_1_1_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3051:1: ( 'TextBlock' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3052:1: 'TextBlock'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameTextBlockKeyword_1_1_0()); 
            match(input,29,FOLLOW_29_in_rule__SurveyTerminalTypes__NameAssignment_1_16037); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getNameTextBlockKeyword_1_1_0()); 

            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getNameTextBlockKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__NameAssignment_1_1"


    // $ANTLR start "rule__SurveyTerminalTypes__LengthAssignment_1_3"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3067:1: rule__SurveyTerminalTypes__LengthAssignment_1_3 : ( RULE_INT ) ;
    public final void rule__SurveyTerminalTypes__LengthAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3071:1: ( ( RULE_INT ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3072:1: ( RULE_INT )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3072:1: ( RULE_INT )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3073:1: RULE_INT
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLengthINTTerminalRuleCall_1_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SurveyTerminalTypes__LengthAssignment_1_36076); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getLengthINTTerminalRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__LengthAssignment_1_3"


    // $ANTLR start "rule__SurveyTerminalTypes__NameAssignment_2_1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3082:1: rule__SurveyTerminalTypes__NameAssignment_2_1 : ( ( 'Matrix' ) ) ;
    public final void rule__SurveyTerminalTypes__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3086:1: ( ( ( 'Matrix' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3087:1: ( ( 'Matrix' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3087:1: ( ( 'Matrix' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3088:1: ( 'Matrix' )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameMatrixKeyword_2_1_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3089:1: ( 'Matrix' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3090:1: 'Matrix'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameMatrixKeyword_2_1_0()); 
            match(input,30,FOLLOW_30_in_rule__SurveyTerminalTypes__NameAssignment_2_16112); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getNameMatrixKeyword_2_1_0()); 

            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getNameMatrixKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__NameAssignment_2_1"


    // $ANTLR start "rule__SurveyTerminalTypes__AnswerAssignment_2_5"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3105:1: rule__SurveyTerminalTypes__AnswerAssignment_2_5 : ( ruleAnswer ) ;
    public final void rule__SurveyTerminalTypes__AnswerAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3109:1: ( ( ruleAnswer ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3110:1: ( ruleAnswer )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3110:1: ( ruleAnswer )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3111:1: ruleAnswer
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_2_5_0()); 
            pushFollow(FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_2_56151);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__AnswerAssignment_2_5"


    // $ANTLR start "rule__SurveyTerminalTypes__AnswerAssignment_2_6_1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3120:1: rule__SurveyTerminalTypes__AnswerAssignment_2_6_1 : ( ruleAnswer ) ;
    public final void rule__SurveyTerminalTypes__AnswerAssignment_2_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3124:1: ( ( ruleAnswer ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3125:1: ( ruleAnswer )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3125:1: ( ruleAnswer )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3126:1: ruleAnswer
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_2_6_1_0()); 
            pushFollow(FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_2_6_16182);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_2_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__AnswerAssignment_2_6_1"


    // $ANTLR start "rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3135:1: rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10 : ( ruleMatrixQuestion ) ;
    public final void rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3139:1: ( ( ruleMatrixQuestion ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3140:1: ( ruleMatrixQuestion )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3140:1: ( ruleMatrixQuestion )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3141:1: ruleMatrixQuestion
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getMatrixQuestionMatrixQuestionParserRuleCall_2_10_0()); 
            pushFollow(FOLLOW_ruleMatrixQuestion_in_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_106213);
            ruleMatrixQuestion();

            state._fsp--;

             after(grammarAccess.getSurveyTerminalTypesAccess().getMatrixQuestionMatrixQuestionParserRuleCall_2_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10"


    // $ANTLR start "rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3150:1: rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1 : ( ruleMatrixQuestion ) ;
    public final void rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3154:1: ( ( ruleMatrixQuestion ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3155:1: ( ruleMatrixQuestion )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3155:1: ( ruleMatrixQuestion )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3156:1: ruleMatrixQuestion
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getMatrixQuestionMatrixQuestionParserRuleCall_2_11_1_0()); 
            pushFollow(FOLLOW_ruleMatrixQuestion_in_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_16244);
            ruleMatrixQuestion();

            state._fsp--;

             after(grammarAccess.getSurveyTerminalTypesAccess().getMatrixQuestionMatrixQuestionParserRuleCall_2_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1"


    // $ANTLR start "rule__SurveyTerminalTypes__NameAssignment_3_1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3165:1: rule__SurveyTerminalTypes__NameAssignment_3_1 : ( ( 'CheckBox' ) ) ;
    public final void rule__SurveyTerminalTypes__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3169:1: ( ( ( 'CheckBox' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3170:1: ( ( 'CheckBox' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3170:1: ( ( 'CheckBox' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3171:1: ( 'CheckBox' )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameCheckBoxKeyword_3_1_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3172:1: ( 'CheckBox' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3173:1: 'CheckBox'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameCheckBoxKeyword_3_1_0()); 
            match(input,31,FOLLOW_31_in_rule__SurveyTerminalTypes__NameAssignment_3_16280); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getNameCheckBoxKeyword_3_1_0()); 

            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getNameCheckBoxKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__NameAssignment_3_1"


    // $ANTLR start "rule__SurveyTerminalTypes__AnswerAssignment_3_3"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3188:1: rule__SurveyTerminalTypes__AnswerAssignment_3_3 : ( ruleAnswer ) ;
    public final void rule__SurveyTerminalTypes__AnswerAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3192:1: ( ( ruleAnswer ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3193:1: ( ruleAnswer )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3193:1: ( ruleAnswer )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3194:1: ruleAnswer
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_3_36319);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__AnswerAssignment_3_3"


    // $ANTLR start "rule__SurveyTerminalTypes__NameAssignment_4_1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3203:1: rule__SurveyTerminalTypes__NameAssignment_4_1 : ( ( 'DropDown' ) ) ;
    public final void rule__SurveyTerminalTypes__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3207:1: ( ( ( 'DropDown' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3208:1: ( ( 'DropDown' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3208:1: ( ( 'DropDown' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3209:1: ( 'DropDown' )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameDropDownKeyword_4_1_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3210:1: ( 'DropDown' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3211:1: 'DropDown'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameDropDownKeyword_4_1_0()); 
            match(input,32,FOLLOW_32_in_rule__SurveyTerminalTypes__NameAssignment_4_16355); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getNameDropDownKeyword_4_1_0()); 

            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getNameDropDownKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__NameAssignment_4_1"


    // $ANTLR start "rule__SurveyTerminalTypes__AnswerAssignment_4_3"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3226:1: rule__SurveyTerminalTypes__AnswerAssignment_4_3 : ( ruleAnswer ) ;
    public final void rule__SurveyTerminalTypes__AnswerAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3230:1: ( ( ruleAnswer ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3231:1: ( ruleAnswer )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3231:1: ( ruleAnswer )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3232:1: ruleAnswer
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_4_36394);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__AnswerAssignment_4_3"


    // $ANTLR start "rule__SurveyTerminalTypes__NameAssignment_5_1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3241:1: rule__SurveyTerminalTypes__NameAssignment_5_1 : ( ( 'Radio' ) ) ;
    public final void rule__SurveyTerminalTypes__NameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3245:1: ( ( ( 'Radio' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3246:1: ( ( 'Radio' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3246:1: ( ( 'Radio' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3247:1: ( 'Radio' )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameRadioKeyword_5_1_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3248:1: ( 'Radio' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3249:1: 'Radio'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameRadioKeyword_5_1_0()); 
            match(input,33,FOLLOW_33_in_rule__SurveyTerminalTypes__NameAssignment_5_16430); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getNameRadioKeyword_5_1_0()); 

            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getNameRadioKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__NameAssignment_5_1"


    // $ANTLR start "rule__SurveyTerminalTypes__AnswerAssignment_5_3"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3264:1: rule__SurveyTerminalTypes__AnswerAssignment_5_3 : ( ruleAnswer ) ;
    public final void rule__SurveyTerminalTypes__AnswerAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3268:1: ( ( ruleAnswer ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3269:1: ( ruleAnswer )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3269:1: ( ruleAnswer )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3270:1: ruleAnswer
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_5_36469);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__AnswerAssignment_5_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurvey68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__QuestionnaireAssignment_in_ruleSurvey96 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Survey__QuestionnaireAssignment_in_ruleSurvey108 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionnaire145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__0_in_ruleQuestionnaire171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__0_in_rulePart231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0_in_ruleQuestion291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixQuestion_in_entryRuleMatrixQuestion318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrixQuestion325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__0_in_ruleMatrixQuestion351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnswer387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__0_in_ruleAnswer413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSurveyTerminalTypes_in_entryRuleSurveyTerminalTypes440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurveyTerminalTypes447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Alternatives_in_ruleSurveyTerminalTypes473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Alternatives_in_ruleIdentifier533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__0_in_rule__SurveyTerminalTypes__Alternatives569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__0_in_rule__SurveyTerminalTypes__Alternatives587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__0_in_rule__SurveyTerminalTypes__Alternatives605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__0_in_rule__SurveyTerminalTypes__Alternatives623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__0_in_rule__SurveyTerminalTypes__Alternatives641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__0_in_rule__SurveyTerminalTypes__Alternatives659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Identifier__Alternatives692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Identifier__Alternatives709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Identifier__Alternatives726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__0__Impl_in_rule__Questionnaire__Group__0756 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__1_in_rule__Questionnaire__Group__0759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Questionnaire__Group__0__Impl787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__1__Impl_in_rule__Questionnaire__Group__1818 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__2_in_rule__Questionnaire__Group__1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__NameAssignment_1_in_rule__Questionnaire__Group__1__Impl848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__2__Impl_in_rule__Questionnaire__Group__2878 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__3_in_rule__Questionnaire__Group__2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Questionnaire__Group__2__Impl909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__3__Impl_in_rule__Questionnaire__Group__3940 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__4_in_rule__Questionnaire__Group__3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Questionnaire__Group__3__Impl971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__4__Impl_in_rule__Questionnaire__Group__41002 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__5_in_rule__Questionnaire__Group__41005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__IdAssignment_4_in_rule__Questionnaire__Group__4__Impl1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__5__Impl_in_rule__Questionnaire__Group__51062 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__6_in_rule__Questionnaire__Group__51065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__PartAssignment_5_in_rule__Questionnaire__Group__5__Impl1094 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Questionnaire__PartAssignment_5_in_rule__Questionnaire__Group__5__Impl1106 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__6__Impl_in_rule__Questionnaire__Group__61139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Questionnaire__Group__6__Impl1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__0__Impl_in_rule__Part__Group__01212 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Part__Group__1_in_rule__Part__Group__01215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Part__Group__0__Impl1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__1__Impl_in_rule__Part__Group__11274 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Part__Group__2_in_rule__Part__Group__11277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__NameAssignment_1_in_rule__Part__Group__1__Impl1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__2__Impl_in_rule__Part__Group__21334 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Part__Group__3_in_rule__Part__Group__21337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Part__Group__2__Impl1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__3__Impl_in_rule__Part__Group__31396 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Part__Group__4_in_rule__Part__Group__31399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Part__Group__3__Impl1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__4__Impl_in_rule__Part__Group__41458 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Part__Group__5_in_rule__Part__Group__41461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__IdAssignment_4_in_rule__Part__Group__4__Impl1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__5__Impl_in_rule__Part__Group__51518 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Part__Group__6_in_rule__Part__Group__51521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__QuestionAssignment_5_in_rule__Part__Group__5__Impl1550 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Part__QuestionAssignment_5_in_rule__Part__Group__5__Impl1562 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Part__Group__6__Impl_in_rule__Part__Group__61595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Part__Group__6__Impl1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__01668 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Question__Group__1_in_rule__Question__Group__01671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Question__Group__0__Impl1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__11730 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Question__Group__2_in_rule__Question__Group__11733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__NameAssignment_1_in_rule__Question__Group__1__Impl1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__21790 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Question__Group__3_in_rule__Question__Group__21793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Question__Group__2__Impl1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__31852 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Question__Group__4_in_rule__Question__Group__31855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Question__Group__3__Impl1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41914 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__IdAssignment_4_in_rule__Question__Group__4__Impl1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__51974 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_rule__Question__Group__6_in_rule__Question__Group__51977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__MandatoryAssignment_5_in_rule__Question__Group__5__Impl2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__62035 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_rule__Question__Group__7_in_rule__Question__Group__62038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Question__Group__6__Impl2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__7__Impl_in_rule__Question__Group__72097 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Question__Group__8_in_rule__Question__Group__72100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__QuestionTypeAssignment_7_in_rule__Question__Group__7__Impl2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__8__Impl_in_rule__Question__Group__82157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Question__Group__8__Impl2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__0__Impl_in_rule__MatrixQuestion__Group__02234 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__1_in_rule__MatrixQuestion__Group__02237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MatrixQuestion__Group__0__Impl2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__1__Impl_in_rule__MatrixQuestion__Group__12296 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__2_in_rule__MatrixQuestion__Group__12299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__IdAssignment_1_in_rule__MatrixQuestion__Group__1__Impl2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__2__Impl_in_rule__MatrixQuestion__Group__22356 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__3_in_rule__MatrixQuestion__Group__22359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MatrixQuestion__Group__2__Impl2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__3__Impl_in_rule__MatrixQuestion__Group__32418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__NameAssignment_3_in_rule__MatrixQuestion__Group__3__Impl2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__02483 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__02486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Answer__Group__0__Impl2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__12545 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__12548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__IdAssignment_1_in_rule__Answer__Group__1__Impl2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__22605 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__22608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Answer__Group__2__Impl2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__32667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__NameAssignment_3_in_rule__Answer__Group__3__Impl2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__0__Impl_in_rule__SurveyTerminalTypes__Group_0__02732 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__1_in_rule__SurveyTerminalTypes__Group_0__02735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__1__Impl_in_rule__SurveyTerminalTypes__Group_0__12793 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__2_in_rule__SurveyTerminalTypes__Group_0__12796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__NameAssignment_0_1_in_rule__SurveyTerminalTypes__Group_0__1__Impl2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__2__Impl_in_rule__SurveyTerminalTypes__Group_0__22853 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__3_in_rule__SurveyTerminalTypes__Group_0__22856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SurveyTerminalTypes__Group_0__2__Impl2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__3__Impl_in_rule__SurveyTerminalTypes__Group_0__32915 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__4_in_rule__SurveyTerminalTypes__Group_0__32918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__LengthAssignment_0_3_in_rule__SurveyTerminalTypes__Group_0__3__Impl2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__4__Impl_in_rule__SurveyTerminalTypes__Group_0__42975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SurveyTerminalTypes__Group_0__4__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__0__Impl_in_rule__SurveyTerminalTypes__Group_1__03044 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__1_in_rule__SurveyTerminalTypes__Group_1__03047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__1__Impl_in_rule__SurveyTerminalTypes__Group_1__13105 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__2_in_rule__SurveyTerminalTypes__Group_1__13108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__NameAssignment_1_1_in_rule__SurveyTerminalTypes__Group_1__1__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__2__Impl_in_rule__SurveyTerminalTypes__Group_1__23165 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__3_in_rule__SurveyTerminalTypes__Group_1__23168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SurveyTerminalTypes__Group_1__2__Impl3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__3__Impl_in_rule__SurveyTerminalTypes__Group_1__33227 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__4_in_rule__SurveyTerminalTypes__Group_1__33230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__LengthAssignment_1_3_in_rule__SurveyTerminalTypes__Group_1__3__Impl3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__4__Impl_in_rule__SurveyTerminalTypes__Group_1__43287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SurveyTerminalTypes__Group_1__4__Impl3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__0__Impl_in_rule__SurveyTerminalTypes__Group_2__03356 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__1_in_rule__SurveyTerminalTypes__Group_2__03359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__1__Impl_in_rule__SurveyTerminalTypes__Group_2__13417 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__2_in_rule__SurveyTerminalTypes__Group_2__13420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__NameAssignment_2_1_in_rule__SurveyTerminalTypes__Group_2__1__Impl3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__2__Impl_in_rule__SurveyTerminalTypes__Group_2__23477 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__3_in_rule__SurveyTerminalTypes__Group_2__23480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SurveyTerminalTypes__Group_2__2__Impl3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__3__Impl_in_rule__SurveyTerminalTypes__Group_2__33539 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__4_in_rule__SurveyTerminalTypes__Group_2__33542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SurveyTerminalTypes__Group_2__3__Impl3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__4__Impl_in_rule__SurveyTerminalTypes__Group_2__43601 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__5_in_rule__SurveyTerminalTypes__Group_2__43604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SurveyTerminalTypes__Group_2__4__Impl3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__5__Impl_in_rule__SurveyTerminalTypes__Group_2__53663 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__6_in_rule__SurveyTerminalTypes__Group_2__53666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_2_5_in_rule__SurveyTerminalTypes__Group_2__5__Impl3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__6__Impl_in_rule__SurveyTerminalTypes__Group_2__63723 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__7_in_rule__SurveyTerminalTypes__Group_2__63726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_6__0_in_rule__SurveyTerminalTypes__Group_2__6__Impl3753 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__7__Impl_in_rule__SurveyTerminalTypes__Group_2__73784 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__8_in_rule__SurveyTerminalTypes__Group_2__73787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SurveyTerminalTypes__Group_2__7__Impl3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__8__Impl_in_rule__SurveyTerminalTypes__Group_2__83846 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__9_in_rule__SurveyTerminalTypes__Group_2__83849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SurveyTerminalTypes__Group_2__8__Impl3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__9__Impl_in_rule__SurveyTerminalTypes__Group_2__93908 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__10_in_rule__SurveyTerminalTypes__Group_2__93911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SurveyTerminalTypes__Group_2__9__Impl3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__10__Impl_in_rule__SurveyTerminalTypes__Group_2__103970 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__11_in_rule__SurveyTerminalTypes__Group_2__103973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10_in_rule__SurveyTerminalTypes__Group_2__10__Impl4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__11__Impl_in_rule__SurveyTerminalTypes__Group_2__114030 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__12_in_rule__SurveyTerminalTypes__Group_2__114033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_11__0_in_rule__SurveyTerminalTypes__Group_2__11__Impl4060 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__12__Impl_in_rule__SurveyTerminalTypes__Group_2__124091 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__13_in_rule__SurveyTerminalTypes__Group_2__124094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SurveyTerminalTypes__Group_2__12__Impl4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__13__Impl_in_rule__SurveyTerminalTypes__Group_2__134153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SurveyTerminalTypes__Group_2__13__Impl4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_6__0__Impl_in_rule__SurveyTerminalTypes__Group_2_6__04240 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_6__1_in_rule__SurveyTerminalTypes__Group_2_6__04243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SurveyTerminalTypes__Group_2_6__0__Impl4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_6__1__Impl_in_rule__SurveyTerminalTypes__Group_2_6__14302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_2_6_1_in_rule__SurveyTerminalTypes__Group_2_6__1__Impl4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_11__0__Impl_in_rule__SurveyTerminalTypes__Group_2_11__04363 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_11__1_in_rule__SurveyTerminalTypes__Group_2_11__04366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SurveyTerminalTypes__Group_2_11__0__Impl4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_11__1__Impl_in_rule__SurveyTerminalTypes__Group_2_11__14425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1_in_rule__SurveyTerminalTypes__Group_2_11__1__Impl4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__0__Impl_in_rule__SurveyTerminalTypes__Group_3__04486 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__1_in_rule__SurveyTerminalTypes__Group_3__04489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__1__Impl_in_rule__SurveyTerminalTypes__Group_3__14547 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__2_in_rule__SurveyTerminalTypes__Group_3__14550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__NameAssignment_3_1_in_rule__SurveyTerminalTypes__Group_3__1__Impl4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__2__Impl_in_rule__SurveyTerminalTypes__Group_3__24607 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__3_in_rule__SurveyTerminalTypes__Group_3__24610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SurveyTerminalTypes__Group_3__2__Impl4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__3__Impl_in_rule__SurveyTerminalTypes__Group_3__34669 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__4_in_rule__SurveyTerminalTypes__Group_3__34672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_3_3_in_rule__SurveyTerminalTypes__Group_3__3__Impl4701 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_3_3_in_rule__SurveyTerminalTypes__Group_3__3__Impl4713 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__4__Impl_in_rule__SurveyTerminalTypes__Group_3__44746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SurveyTerminalTypes__Group_3__4__Impl4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__0__Impl_in_rule__SurveyTerminalTypes__Group_4__04815 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__1_in_rule__SurveyTerminalTypes__Group_4__04818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__1__Impl_in_rule__SurveyTerminalTypes__Group_4__14876 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__2_in_rule__SurveyTerminalTypes__Group_4__14879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__NameAssignment_4_1_in_rule__SurveyTerminalTypes__Group_4__1__Impl4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__2__Impl_in_rule__SurveyTerminalTypes__Group_4__24936 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__3_in_rule__SurveyTerminalTypes__Group_4__24939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SurveyTerminalTypes__Group_4__2__Impl4967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__3__Impl_in_rule__SurveyTerminalTypes__Group_4__34998 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__4_in_rule__SurveyTerminalTypes__Group_4__35001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_4_3_in_rule__SurveyTerminalTypes__Group_4__3__Impl5030 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_4_3_in_rule__SurveyTerminalTypes__Group_4__3__Impl5042 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__4__Impl_in_rule__SurveyTerminalTypes__Group_4__45075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SurveyTerminalTypes__Group_4__4__Impl5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__0__Impl_in_rule__SurveyTerminalTypes__Group_5__05144 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__1_in_rule__SurveyTerminalTypes__Group_5__05147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__1__Impl_in_rule__SurveyTerminalTypes__Group_5__15205 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__2_in_rule__SurveyTerminalTypes__Group_5__15208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__NameAssignment_5_1_in_rule__SurveyTerminalTypes__Group_5__1__Impl5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__2__Impl_in_rule__SurveyTerminalTypes__Group_5__25265 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__3_in_rule__SurveyTerminalTypes__Group_5__25268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SurveyTerminalTypes__Group_5__2__Impl5296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__3__Impl_in_rule__SurveyTerminalTypes__Group_5__35327 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__4_in_rule__SurveyTerminalTypes__Group_5__35330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_5_3_in_rule__SurveyTerminalTypes__Group_5__3__Impl5359 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_5_3_in_rule__SurveyTerminalTypes__Group_5__3__Impl5371 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__4__Impl_in_rule__SurveyTerminalTypes__Group_5__45404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SurveyTerminalTypes__Group_5__4__Impl5432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_rule__Survey__QuestionnaireAssignment5478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Questionnaire__NameAssignment_15509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Questionnaire__IdAssignment_45540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_rule__Questionnaire__PartAssignment_55571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Part__NameAssignment_15602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Part__IdAssignment_45633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Part__QuestionAssignment_55664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Question__NameAssignment_15695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Question__IdAssignment_45726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Question__MandatoryAssignment_55762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSurveyTerminalTypes_in_rule__Question__QuestionTypeAssignment_75801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__MatrixQuestion__IdAssignment_15832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MatrixQuestion__NameAssignment_35863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Answer__IdAssignment_15895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Answer__NameAssignment_35926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SurveyTerminalTypes__NameAssignment_0_15962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SurveyTerminalTypes__LengthAssignment_0_36001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SurveyTerminalTypes__NameAssignment_1_16037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SurveyTerminalTypes__LengthAssignment_1_36076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SurveyTerminalTypes__NameAssignment_2_16112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_2_56151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_2_6_16182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixQuestion_in_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_106213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixQuestion_in_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_16244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SurveyTerminalTypes__NameAssignment_3_16280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_3_36319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SurveyTerminalTypes__NameAssignment_4_16355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_4_36394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SurveyTerminalTypes__NameAssignment_5_16430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_5_36469 = new BitSet(new long[]{0x0000000000000002L});

}