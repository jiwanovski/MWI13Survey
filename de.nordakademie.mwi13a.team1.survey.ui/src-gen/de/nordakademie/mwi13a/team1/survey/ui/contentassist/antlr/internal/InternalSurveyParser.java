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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Questionnaire:'", "'{'", "'Questionnaire-ID:'", "'}'", "'Part:'", "'Part-ID:'", "'Question:'", "'Question-ID:'", "'Type:'", "'Answer-ID:'", "'Answer:'", "'('", "')'", "'Scale:'", "'Questions:'", "'|'", "'Mandatory Field'", "'TextLine'", "'TextBlock'", "'Matrix'", "'ComboBox'", "'DropDown'", "'Radio'"
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:207:1: entryRuleAnswer : ruleAnswer EOF ;
    public final void entryRuleAnswer() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:208:1: ( ruleAnswer EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:209:1: ruleAnswer EOF
            {
             before(grammarAccess.getAnswerRule()); 
            pushFollow(FOLLOW_ruleAnswer_in_entryRuleAnswer378);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getAnswerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnswer385); 

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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:216:1: ruleAnswer : ( ( rule__Answer__Group__0 ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:220:2: ( ( ( rule__Answer__Group__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:221:1: ( ( rule__Answer__Group__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:221:1: ( ( rule__Answer__Group__0 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:222:1: ( rule__Answer__Group__0 )
            {
             before(grammarAccess.getAnswerAccess().getGroup()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:223:1: ( rule__Answer__Group__0 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:223:2: rule__Answer__Group__0
            {
            pushFollow(FOLLOW_rule__Answer__Group__0_in_ruleAnswer411);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:235:1: entryRuleSurveyTerminalTypes : ruleSurveyTerminalTypes EOF ;
    public final void entryRuleSurveyTerminalTypes() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:236:1: ( ruleSurveyTerminalTypes EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:237:1: ruleSurveyTerminalTypes EOF
            {
             before(grammarAccess.getSurveyTerminalTypesRule()); 
            pushFollow(FOLLOW_ruleSurveyTerminalTypes_in_entryRuleSurveyTerminalTypes438);
            ruleSurveyTerminalTypes();

            state._fsp--;

             after(grammarAccess.getSurveyTerminalTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSurveyTerminalTypes445); 

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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:244:1: ruleSurveyTerminalTypes : ( ( rule__SurveyTerminalTypes__Alternatives ) ) ;
    public final void ruleSurveyTerminalTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:248:2: ( ( ( rule__SurveyTerminalTypes__Alternatives ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:249:1: ( ( rule__SurveyTerminalTypes__Alternatives ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:249:1: ( ( rule__SurveyTerminalTypes__Alternatives ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:250:1: ( rule__SurveyTerminalTypes__Alternatives )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAlternatives()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:251:1: ( rule__SurveyTerminalTypes__Alternatives )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:251:2: rule__SurveyTerminalTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Alternatives_in_ruleSurveyTerminalTypes471);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:263:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:264:1: ( ruleIdentifier EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:265:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier498);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier505); 

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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:272:1: ruleIdentifier : ( ( rule__Identifier__Alternatives ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:276:2: ( ( ( rule__Identifier__Alternatives ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:277:1: ( ( rule__Identifier__Alternatives ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:277:1: ( ( rule__Identifier__Alternatives ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:278:1: ( rule__Identifier__Alternatives )
            {
             before(grammarAccess.getIdentifierAccess().getAlternatives()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:279:1: ( rule__Identifier__Alternatives )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:279:2: rule__Identifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Identifier__Alternatives_in_ruleIdentifier531);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:291:1: rule__SurveyTerminalTypes__Alternatives : ( ( ( rule__SurveyTerminalTypes__Group_0__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_1__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_2__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_3__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_4__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_5__0 ) ) );
    public final void rule__SurveyTerminalTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:295:1: ( ( ( rule__SurveyTerminalTypes__Group_0__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_1__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_2__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_3__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_4__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_5__0 ) ) )
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
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:296:1: ( ( rule__SurveyTerminalTypes__Group_0__0 ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:296:1: ( ( rule__SurveyTerminalTypes__Group_0__0 ) )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:297:1: ( rule__SurveyTerminalTypes__Group_0__0 )
                    {
                     before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_0()); 
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:298:1: ( rule__SurveyTerminalTypes__Group_0__0 )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:298:2: rule__SurveyTerminalTypes__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__0_in_rule__SurveyTerminalTypes__Alternatives567);
                    rule__SurveyTerminalTypes__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyTerminalTypesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:302:6: ( ( rule__SurveyTerminalTypes__Group_1__0 ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:302:6: ( ( rule__SurveyTerminalTypes__Group_1__0 ) )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:303:1: ( rule__SurveyTerminalTypes__Group_1__0 )
                    {
                     before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_1()); 
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:304:1: ( rule__SurveyTerminalTypes__Group_1__0 )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:304:2: rule__SurveyTerminalTypes__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__0_in_rule__SurveyTerminalTypes__Alternatives585);
                    rule__SurveyTerminalTypes__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyTerminalTypesAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:308:6: ( ( rule__SurveyTerminalTypes__Group_2__0 ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:308:6: ( ( rule__SurveyTerminalTypes__Group_2__0 ) )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:309:1: ( rule__SurveyTerminalTypes__Group_2__0 )
                    {
                     before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_2()); 
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:310:1: ( rule__SurveyTerminalTypes__Group_2__0 )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:310:2: rule__SurveyTerminalTypes__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__0_in_rule__SurveyTerminalTypes__Alternatives603);
                    rule__SurveyTerminalTypes__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyTerminalTypesAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:314:6: ( ( rule__SurveyTerminalTypes__Group_3__0 ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:314:6: ( ( rule__SurveyTerminalTypes__Group_3__0 ) )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:315:1: ( rule__SurveyTerminalTypes__Group_3__0 )
                    {
                     before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_3()); 
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:316:1: ( rule__SurveyTerminalTypes__Group_3__0 )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:316:2: rule__SurveyTerminalTypes__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__0_in_rule__SurveyTerminalTypes__Alternatives621);
                    rule__SurveyTerminalTypes__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyTerminalTypesAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:320:6: ( ( rule__SurveyTerminalTypes__Group_4__0 ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:320:6: ( ( rule__SurveyTerminalTypes__Group_4__0 ) )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:321:1: ( rule__SurveyTerminalTypes__Group_4__0 )
                    {
                     before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_4()); 
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:322:1: ( rule__SurveyTerminalTypes__Group_4__0 )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:322:2: rule__SurveyTerminalTypes__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__0_in_rule__SurveyTerminalTypes__Alternatives639);
                    rule__SurveyTerminalTypes__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyTerminalTypesAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:326:6: ( ( rule__SurveyTerminalTypes__Group_5__0 ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:326:6: ( ( rule__SurveyTerminalTypes__Group_5__0 ) )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:327:1: ( rule__SurveyTerminalTypes__Group_5__0 )
                    {
                     before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_5()); 
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:328:1: ( rule__SurveyTerminalTypes__Group_5__0 )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:328:2: rule__SurveyTerminalTypes__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__0_in_rule__SurveyTerminalTypes__Alternatives657);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:337:1: rule__Identifier__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) );
    public final void rule__Identifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:341:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) )
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
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:342:1: ( RULE_ID )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:342:1: ( RULE_ID )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:343:1: RULE_ID
                    {
                     before(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Identifier__Alternatives690); 
                     after(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:348:6: ( RULE_STRING )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:348:6: ( RULE_STRING )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:349:1: RULE_STRING
                    {
                     before(grammarAccess.getIdentifierAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Identifier__Alternatives707); 
                     after(grammarAccess.getIdentifierAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:354:6: ( RULE_INT )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:354:6: ( RULE_INT )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:355:1: RULE_INT
                    {
                     before(grammarAccess.getIdentifierAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Identifier__Alternatives724); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:367:1: rule__Questionnaire__Group__0 : rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 ;
    public final void rule__Questionnaire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:371:1: ( rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:372:2: rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__0__Impl_in_rule__Questionnaire__Group__0754);
            rule__Questionnaire__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__1_in_rule__Questionnaire__Group__0757);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:379:1: rule__Questionnaire__Group__0__Impl : ( 'Questionnaire:' ) ;
    public final void rule__Questionnaire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:383:1: ( ( 'Questionnaire:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:384:1: ( 'Questionnaire:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:384:1: ( 'Questionnaire:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:385:1: 'Questionnaire:'
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Questionnaire__Group__0__Impl785); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:398:1: rule__Questionnaire__Group__1 : rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 ;
    public final void rule__Questionnaire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:402:1: ( rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:403:2: rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__1__Impl_in_rule__Questionnaire__Group__1816);
            rule__Questionnaire__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__2_in_rule__Questionnaire__Group__1819);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:410:1: rule__Questionnaire__Group__1__Impl : ( ( rule__Questionnaire__NameAssignment_1 ) ) ;
    public final void rule__Questionnaire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:414:1: ( ( ( rule__Questionnaire__NameAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:415:1: ( ( rule__Questionnaire__NameAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:415:1: ( ( rule__Questionnaire__NameAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:416:1: ( rule__Questionnaire__NameAssignment_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getNameAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:417:1: ( rule__Questionnaire__NameAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:417:2: rule__Questionnaire__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Questionnaire__NameAssignment_1_in_rule__Questionnaire__Group__1__Impl846);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:427:1: rule__Questionnaire__Group__2 : rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 ;
    public final void rule__Questionnaire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:431:1: ( rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:432:2: rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__2__Impl_in_rule__Questionnaire__Group__2876);
            rule__Questionnaire__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__3_in_rule__Questionnaire__Group__2879);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:439:1: rule__Questionnaire__Group__2__Impl : ( '{' ) ;
    public final void rule__Questionnaire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:443:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:444:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:444:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:445:1: '{'
            {
             before(grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Questionnaire__Group__2__Impl907); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:458:1: rule__Questionnaire__Group__3 : rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 ;
    public final void rule__Questionnaire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:462:1: ( rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:463:2: rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__3__Impl_in_rule__Questionnaire__Group__3938);
            rule__Questionnaire__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__4_in_rule__Questionnaire__Group__3941);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:470:1: rule__Questionnaire__Group__3__Impl : ( 'Questionnaire-ID:' ) ;
    public final void rule__Questionnaire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:474:1: ( ( 'Questionnaire-ID:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:475:1: ( 'Questionnaire-ID:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:475:1: ( 'Questionnaire-ID:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:476:1: 'Questionnaire-ID:'
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionnaireIDKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Questionnaire__Group__3__Impl969); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:489:1: rule__Questionnaire__Group__4 : rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5 ;
    public final void rule__Questionnaire__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:493:1: ( rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:494:2: rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__4__Impl_in_rule__Questionnaire__Group__41000);
            rule__Questionnaire__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__5_in_rule__Questionnaire__Group__41003);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:501:1: rule__Questionnaire__Group__4__Impl : ( ( rule__Questionnaire__IdAssignment_4 ) ) ;
    public final void rule__Questionnaire__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:505:1: ( ( ( rule__Questionnaire__IdAssignment_4 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:506:1: ( ( rule__Questionnaire__IdAssignment_4 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:506:1: ( ( rule__Questionnaire__IdAssignment_4 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:507:1: ( rule__Questionnaire__IdAssignment_4 )
            {
             before(grammarAccess.getQuestionnaireAccess().getIdAssignment_4()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:508:1: ( rule__Questionnaire__IdAssignment_4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:508:2: rule__Questionnaire__IdAssignment_4
            {
            pushFollow(FOLLOW_rule__Questionnaire__IdAssignment_4_in_rule__Questionnaire__Group__4__Impl1030);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:518:1: rule__Questionnaire__Group__5 : rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6 ;
    public final void rule__Questionnaire__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:522:1: ( rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:523:2: rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__5__Impl_in_rule__Questionnaire__Group__51060);
            rule__Questionnaire__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__6_in_rule__Questionnaire__Group__51063);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:530:1: rule__Questionnaire__Group__5__Impl : ( ( ( rule__Questionnaire__PartAssignment_5 ) ) ( ( rule__Questionnaire__PartAssignment_5 )* ) ) ;
    public final void rule__Questionnaire__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:534:1: ( ( ( ( rule__Questionnaire__PartAssignment_5 ) ) ( ( rule__Questionnaire__PartAssignment_5 )* ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:535:1: ( ( ( rule__Questionnaire__PartAssignment_5 ) ) ( ( rule__Questionnaire__PartAssignment_5 )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:535:1: ( ( ( rule__Questionnaire__PartAssignment_5 ) ) ( ( rule__Questionnaire__PartAssignment_5 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:536:1: ( ( rule__Questionnaire__PartAssignment_5 ) ) ( ( rule__Questionnaire__PartAssignment_5 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:536:1: ( ( rule__Questionnaire__PartAssignment_5 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:537:1: ( rule__Questionnaire__PartAssignment_5 )
            {
             before(grammarAccess.getQuestionnaireAccess().getPartAssignment_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:538:1: ( rule__Questionnaire__PartAssignment_5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:538:2: rule__Questionnaire__PartAssignment_5
            {
            pushFollow(FOLLOW_rule__Questionnaire__PartAssignment_5_in_rule__Questionnaire__Group__5__Impl1092);
            rule__Questionnaire__PartAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getPartAssignment_5()); 

            }

            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:541:1: ( ( rule__Questionnaire__PartAssignment_5 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:542:1: ( rule__Questionnaire__PartAssignment_5 )*
            {
             before(grammarAccess.getQuestionnaireAccess().getPartAssignment_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:543:1: ( rule__Questionnaire__PartAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:543:2: rule__Questionnaire__PartAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Questionnaire__PartAssignment_5_in_rule__Questionnaire__Group__5__Impl1104);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:554:1: rule__Questionnaire__Group__6 : rule__Questionnaire__Group__6__Impl ;
    public final void rule__Questionnaire__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:558:1: ( rule__Questionnaire__Group__6__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:559:2: rule__Questionnaire__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__6__Impl_in_rule__Questionnaire__Group__61137);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:565:1: rule__Questionnaire__Group__6__Impl : ( '}' ) ;
    public final void rule__Questionnaire__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:569:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:570:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:570:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:571:1: '}'
            {
             before(grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Questionnaire__Group__6__Impl1165); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:598:1: rule__Part__Group__0 : rule__Part__Group__0__Impl rule__Part__Group__1 ;
    public final void rule__Part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:602:1: ( rule__Part__Group__0__Impl rule__Part__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:603:2: rule__Part__Group__0__Impl rule__Part__Group__1
            {
            pushFollow(FOLLOW_rule__Part__Group__0__Impl_in_rule__Part__Group__01210);
            rule__Part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__1_in_rule__Part__Group__01213);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:610:1: rule__Part__Group__0__Impl : ( 'Part:' ) ;
    public final void rule__Part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:614:1: ( ( 'Part:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:615:1: ( 'Part:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:615:1: ( 'Part:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:616:1: 'Part:'
            {
             before(grammarAccess.getPartAccess().getPartKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Part__Group__0__Impl1241); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:629:1: rule__Part__Group__1 : rule__Part__Group__1__Impl rule__Part__Group__2 ;
    public final void rule__Part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:633:1: ( rule__Part__Group__1__Impl rule__Part__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:634:2: rule__Part__Group__1__Impl rule__Part__Group__2
            {
            pushFollow(FOLLOW_rule__Part__Group__1__Impl_in_rule__Part__Group__11272);
            rule__Part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__2_in_rule__Part__Group__11275);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:641:1: rule__Part__Group__1__Impl : ( ( rule__Part__NameAssignment_1 ) ) ;
    public final void rule__Part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:645:1: ( ( ( rule__Part__NameAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:646:1: ( ( rule__Part__NameAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:646:1: ( ( rule__Part__NameAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:647:1: ( rule__Part__NameAssignment_1 )
            {
             before(grammarAccess.getPartAccess().getNameAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:648:1: ( rule__Part__NameAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:648:2: rule__Part__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Part__NameAssignment_1_in_rule__Part__Group__1__Impl1302);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:658:1: rule__Part__Group__2 : rule__Part__Group__2__Impl rule__Part__Group__3 ;
    public final void rule__Part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:662:1: ( rule__Part__Group__2__Impl rule__Part__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:663:2: rule__Part__Group__2__Impl rule__Part__Group__3
            {
            pushFollow(FOLLOW_rule__Part__Group__2__Impl_in_rule__Part__Group__21332);
            rule__Part__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__3_in_rule__Part__Group__21335);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:670:1: rule__Part__Group__2__Impl : ( '{' ) ;
    public final void rule__Part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:674:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:675:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:675:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:676:1: '{'
            {
             before(grammarAccess.getPartAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Part__Group__2__Impl1363); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:689:1: rule__Part__Group__3 : rule__Part__Group__3__Impl rule__Part__Group__4 ;
    public final void rule__Part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:693:1: ( rule__Part__Group__3__Impl rule__Part__Group__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:694:2: rule__Part__Group__3__Impl rule__Part__Group__4
            {
            pushFollow(FOLLOW_rule__Part__Group__3__Impl_in_rule__Part__Group__31394);
            rule__Part__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__4_in_rule__Part__Group__31397);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:701:1: rule__Part__Group__3__Impl : ( 'Part-ID:' ) ;
    public final void rule__Part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:705:1: ( ( 'Part-ID:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:706:1: ( 'Part-ID:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:706:1: ( 'Part-ID:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:707:1: 'Part-ID:'
            {
             before(grammarAccess.getPartAccess().getPartIDKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Part__Group__3__Impl1425); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:720:1: rule__Part__Group__4 : rule__Part__Group__4__Impl rule__Part__Group__5 ;
    public final void rule__Part__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:724:1: ( rule__Part__Group__4__Impl rule__Part__Group__5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:725:2: rule__Part__Group__4__Impl rule__Part__Group__5
            {
            pushFollow(FOLLOW_rule__Part__Group__4__Impl_in_rule__Part__Group__41456);
            rule__Part__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__5_in_rule__Part__Group__41459);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:732:1: rule__Part__Group__4__Impl : ( ( rule__Part__IdAssignment_4 ) ) ;
    public final void rule__Part__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:736:1: ( ( ( rule__Part__IdAssignment_4 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:737:1: ( ( rule__Part__IdAssignment_4 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:737:1: ( ( rule__Part__IdAssignment_4 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:738:1: ( rule__Part__IdAssignment_4 )
            {
             before(grammarAccess.getPartAccess().getIdAssignment_4()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:739:1: ( rule__Part__IdAssignment_4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:739:2: rule__Part__IdAssignment_4
            {
            pushFollow(FOLLOW_rule__Part__IdAssignment_4_in_rule__Part__Group__4__Impl1486);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:749:1: rule__Part__Group__5 : rule__Part__Group__5__Impl rule__Part__Group__6 ;
    public final void rule__Part__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:753:1: ( rule__Part__Group__5__Impl rule__Part__Group__6 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:754:2: rule__Part__Group__5__Impl rule__Part__Group__6
            {
            pushFollow(FOLLOW_rule__Part__Group__5__Impl_in_rule__Part__Group__51516);
            rule__Part__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__6_in_rule__Part__Group__51519);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:761:1: rule__Part__Group__5__Impl : ( ( ( rule__Part__QuestionAssignment_5 ) ) ( ( rule__Part__QuestionAssignment_5 )* ) ) ;
    public final void rule__Part__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:765:1: ( ( ( ( rule__Part__QuestionAssignment_5 ) ) ( ( rule__Part__QuestionAssignment_5 )* ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:766:1: ( ( ( rule__Part__QuestionAssignment_5 ) ) ( ( rule__Part__QuestionAssignment_5 )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:766:1: ( ( ( rule__Part__QuestionAssignment_5 ) ) ( ( rule__Part__QuestionAssignment_5 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:767:1: ( ( rule__Part__QuestionAssignment_5 ) ) ( ( rule__Part__QuestionAssignment_5 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:767:1: ( ( rule__Part__QuestionAssignment_5 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:768:1: ( rule__Part__QuestionAssignment_5 )
            {
             before(grammarAccess.getPartAccess().getQuestionAssignment_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:769:1: ( rule__Part__QuestionAssignment_5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:769:2: rule__Part__QuestionAssignment_5
            {
            pushFollow(FOLLOW_rule__Part__QuestionAssignment_5_in_rule__Part__Group__5__Impl1548);
            rule__Part__QuestionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPartAccess().getQuestionAssignment_5()); 

            }

            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:772:1: ( ( rule__Part__QuestionAssignment_5 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:773:1: ( rule__Part__QuestionAssignment_5 )*
            {
             before(grammarAccess.getPartAccess().getQuestionAssignment_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:774:1: ( rule__Part__QuestionAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:774:2: rule__Part__QuestionAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Part__QuestionAssignment_5_in_rule__Part__Group__5__Impl1560);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:785:1: rule__Part__Group__6 : rule__Part__Group__6__Impl ;
    public final void rule__Part__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:789:1: ( rule__Part__Group__6__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:790:2: rule__Part__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Part__Group__6__Impl_in_rule__Part__Group__61593);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:796:1: rule__Part__Group__6__Impl : ( '}' ) ;
    public final void rule__Part__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:800:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:801:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:801:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:802:1: '}'
            {
             before(grammarAccess.getPartAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Part__Group__6__Impl1621); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:829:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:833:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:834:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__01666);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__1_in_rule__Question__Group__01669);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:841:1: rule__Question__Group__0__Impl : ( 'Question:' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:845:1: ( ( 'Question:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:846:1: ( 'Question:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:846:1: ( 'Question:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:847:1: 'Question:'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Question__Group__0__Impl1697); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:860:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:864:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:865:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__11728);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__2_in_rule__Question__Group__11731);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:872:1: rule__Question__Group__1__Impl : ( ( rule__Question__NameAssignment_1 ) ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:876:1: ( ( ( rule__Question__NameAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:877:1: ( ( rule__Question__NameAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:877:1: ( ( rule__Question__NameAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:878:1: ( rule__Question__NameAssignment_1 )
            {
             before(grammarAccess.getQuestionAccess().getNameAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:879:1: ( rule__Question__NameAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:879:2: rule__Question__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Question__NameAssignment_1_in_rule__Question__Group__1__Impl1758);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:889:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:893:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:894:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__21788);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__3_in_rule__Question__Group__21791);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:901:1: rule__Question__Group__2__Impl : ( '{' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:905:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:906:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:906:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:907:1: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Question__Group__2__Impl1819); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:920:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:924:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:925:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__31850);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__4_in_rule__Question__Group__31853);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:932:1: rule__Question__Group__3__Impl : ( 'Question-ID:' ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:936:1: ( ( 'Question-ID:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:937:1: ( 'Question-ID:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:937:1: ( 'Question-ID:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:938:1: 'Question-ID:'
            {
             before(grammarAccess.getQuestionAccess().getQuestionIDKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Question__Group__3__Impl1881); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:951:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:955:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:956:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41912);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41915);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:963:1: rule__Question__Group__4__Impl : ( ( rule__Question__IdAssignment_4 ) ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:967:1: ( ( ( rule__Question__IdAssignment_4 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:968:1: ( ( rule__Question__IdAssignment_4 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:968:1: ( ( rule__Question__IdAssignment_4 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:969:1: ( rule__Question__IdAssignment_4 )
            {
             before(grammarAccess.getQuestionAccess().getIdAssignment_4()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:970:1: ( rule__Question__IdAssignment_4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:970:2: rule__Question__IdAssignment_4
            {
            pushFollow(FOLLOW_rule__Question__IdAssignment_4_in_rule__Question__Group__4__Impl1942);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:980:1: rule__Question__Group__5 : rule__Question__Group__5__Impl rule__Question__Group__6 ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:984:1: ( rule__Question__Group__5__Impl rule__Question__Group__6 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:985:2: rule__Question__Group__5__Impl rule__Question__Group__6
            {
            pushFollow(FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__51972);
            rule__Question__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__6_in_rule__Question__Group__51975);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:992:1: rule__Question__Group__5__Impl : ( ( rule__Question__MandatoryAssignment_5 )? ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:996:1: ( ( ( rule__Question__MandatoryAssignment_5 )? ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:997:1: ( ( rule__Question__MandatoryAssignment_5 )? )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:997:1: ( ( rule__Question__MandatoryAssignment_5 )? )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:998:1: ( rule__Question__MandatoryAssignment_5 )?
            {
             before(grammarAccess.getQuestionAccess().getMandatoryAssignment_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:999:1: ( rule__Question__MandatoryAssignment_5 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:999:2: rule__Question__MandatoryAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Question__MandatoryAssignment_5_in_rule__Question__Group__5__Impl2002);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1009:1: rule__Question__Group__6 : rule__Question__Group__6__Impl rule__Question__Group__7 ;
    public final void rule__Question__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1013:1: ( rule__Question__Group__6__Impl rule__Question__Group__7 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1014:2: rule__Question__Group__6__Impl rule__Question__Group__7
            {
            pushFollow(FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__62033);
            rule__Question__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__7_in_rule__Question__Group__62036);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1021:1: rule__Question__Group__6__Impl : ( 'Type:' ) ;
    public final void rule__Question__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1025:1: ( ( 'Type:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1026:1: ( 'Type:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1026:1: ( 'Type:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1027:1: 'Type:'
            {
             before(grammarAccess.getQuestionAccess().getTypeKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Question__Group__6__Impl2064); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1040:1: rule__Question__Group__7 : rule__Question__Group__7__Impl rule__Question__Group__8 ;
    public final void rule__Question__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1044:1: ( rule__Question__Group__7__Impl rule__Question__Group__8 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1045:2: rule__Question__Group__7__Impl rule__Question__Group__8
            {
            pushFollow(FOLLOW_rule__Question__Group__7__Impl_in_rule__Question__Group__72095);
            rule__Question__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__8_in_rule__Question__Group__72098);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1052:1: rule__Question__Group__7__Impl : ( ( rule__Question__QuestionTypeAssignment_7 ) ) ;
    public final void rule__Question__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1056:1: ( ( ( rule__Question__QuestionTypeAssignment_7 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1057:1: ( ( rule__Question__QuestionTypeAssignment_7 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1057:1: ( ( rule__Question__QuestionTypeAssignment_7 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1058:1: ( rule__Question__QuestionTypeAssignment_7 )
            {
             before(grammarAccess.getQuestionAccess().getQuestionTypeAssignment_7()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1059:1: ( rule__Question__QuestionTypeAssignment_7 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1059:2: rule__Question__QuestionTypeAssignment_7
            {
            pushFollow(FOLLOW_rule__Question__QuestionTypeAssignment_7_in_rule__Question__Group__7__Impl2125);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1069:1: rule__Question__Group__8 : rule__Question__Group__8__Impl ;
    public final void rule__Question__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1073:1: ( rule__Question__Group__8__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1074:2: rule__Question__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group__8__Impl_in_rule__Question__Group__82155);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1080:1: rule__Question__Group__8__Impl : ( '}' ) ;
    public final void rule__Question__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1084:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1085:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1085:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1086:1: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_14_in_rule__Question__Group__8__Impl2183); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1117:1: rule__MatrixQuestion__Group__0 : rule__MatrixQuestion__Group__0__Impl rule__MatrixQuestion__Group__1 ;
    public final void rule__MatrixQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1121:1: ( rule__MatrixQuestion__Group__0__Impl rule__MatrixQuestion__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1122:2: rule__MatrixQuestion__Group__0__Impl rule__MatrixQuestion__Group__1
            {
            pushFollow(FOLLOW_rule__MatrixQuestion__Group__0__Impl_in_rule__MatrixQuestion__Group__02232);
            rule__MatrixQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatrixQuestion__Group__1_in_rule__MatrixQuestion__Group__02235);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1129:1: rule__MatrixQuestion__Group__0__Impl : ( 'Question-ID:' ) ;
    public final void rule__MatrixQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1133:1: ( ( 'Question-ID:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1134:1: ( 'Question-ID:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1134:1: ( 'Question-ID:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1135:1: 'Question-ID:'
            {
             before(grammarAccess.getMatrixQuestionAccess().getQuestionIDKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__MatrixQuestion__Group__0__Impl2263); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1148:1: rule__MatrixQuestion__Group__1 : rule__MatrixQuestion__Group__1__Impl rule__MatrixQuestion__Group__2 ;
    public final void rule__MatrixQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1152:1: ( rule__MatrixQuestion__Group__1__Impl rule__MatrixQuestion__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1153:2: rule__MatrixQuestion__Group__1__Impl rule__MatrixQuestion__Group__2
            {
            pushFollow(FOLLOW_rule__MatrixQuestion__Group__1__Impl_in_rule__MatrixQuestion__Group__12294);
            rule__MatrixQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatrixQuestion__Group__2_in_rule__MatrixQuestion__Group__12297);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1160:1: rule__MatrixQuestion__Group__1__Impl : ( ( rule__MatrixQuestion__IdAssignment_1 ) ) ;
    public final void rule__MatrixQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1164:1: ( ( ( rule__MatrixQuestion__IdAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1165:1: ( ( rule__MatrixQuestion__IdAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1165:1: ( ( rule__MatrixQuestion__IdAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1166:1: ( rule__MatrixQuestion__IdAssignment_1 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getIdAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1167:1: ( rule__MatrixQuestion__IdAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1167:2: rule__MatrixQuestion__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__MatrixQuestion__IdAssignment_1_in_rule__MatrixQuestion__Group__1__Impl2324);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1177:1: rule__MatrixQuestion__Group__2 : rule__MatrixQuestion__Group__2__Impl rule__MatrixQuestion__Group__3 ;
    public final void rule__MatrixQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1181:1: ( rule__MatrixQuestion__Group__2__Impl rule__MatrixQuestion__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1182:2: rule__MatrixQuestion__Group__2__Impl rule__MatrixQuestion__Group__3
            {
            pushFollow(FOLLOW_rule__MatrixQuestion__Group__2__Impl_in_rule__MatrixQuestion__Group__22354);
            rule__MatrixQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatrixQuestion__Group__3_in_rule__MatrixQuestion__Group__22357);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1189:1: rule__MatrixQuestion__Group__2__Impl : ( 'Question:' ) ;
    public final void rule__MatrixQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1193:1: ( ( 'Question:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1194:1: ( 'Question:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1194:1: ( 'Question:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1195:1: 'Question:'
            {
             before(grammarAccess.getMatrixQuestionAccess().getQuestionKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__MatrixQuestion__Group__2__Impl2385); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1208:1: rule__MatrixQuestion__Group__3 : rule__MatrixQuestion__Group__3__Impl ;
    public final void rule__MatrixQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1212:1: ( rule__MatrixQuestion__Group__3__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1213:2: rule__MatrixQuestion__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MatrixQuestion__Group__3__Impl_in_rule__MatrixQuestion__Group__32416);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1219:1: rule__MatrixQuestion__Group__3__Impl : ( ( rule__MatrixQuestion__NameAssignment_3 ) ) ;
    public final void rule__MatrixQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1223:1: ( ( ( rule__MatrixQuestion__NameAssignment_3 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1224:1: ( ( rule__MatrixQuestion__NameAssignment_3 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1224:1: ( ( rule__MatrixQuestion__NameAssignment_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1225:1: ( rule__MatrixQuestion__NameAssignment_3 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getNameAssignment_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1226:1: ( rule__MatrixQuestion__NameAssignment_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1226:2: rule__MatrixQuestion__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__MatrixQuestion__NameAssignment_3_in_rule__MatrixQuestion__Group__3__Impl2443);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1244:1: rule__Answer__Group__0 : rule__Answer__Group__0__Impl rule__Answer__Group__1 ;
    public final void rule__Answer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1248:1: ( rule__Answer__Group__0__Impl rule__Answer__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1249:2: rule__Answer__Group__0__Impl rule__Answer__Group__1
            {
            pushFollow(FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__02481);
            rule__Answer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__02484);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1256:1: rule__Answer__Group__0__Impl : ( 'Answer-ID:' ) ;
    public final void rule__Answer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1260:1: ( ( 'Answer-ID:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1261:1: ( 'Answer-ID:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1261:1: ( 'Answer-ID:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1262:1: 'Answer-ID:'
            {
             before(grammarAccess.getAnswerAccess().getAnswerIDKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Answer__Group__0__Impl2512); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1275:1: rule__Answer__Group__1 : rule__Answer__Group__1__Impl rule__Answer__Group__2 ;
    public final void rule__Answer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1279:1: ( rule__Answer__Group__1__Impl rule__Answer__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1280:2: rule__Answer__Group__1__Impl rule__Answer__Group__2
            {
            pushFollow(FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__12543);
            rule__Answer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__12546);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1287:1: rule__Answer__Group__1__Impl : ( ( rule__Answer__IdAssignment_1 ) ) ;
    public final void rule__Answer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1291:1: ( ( ( rule__Answer__IdAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1292:1: ( ( rule__Answer__IdAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1292:1: ( ( rule__Answer__IdAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1293:1: ( rule__Answer__IdAssignment_1 )
            {
             before(grammarAccess.getAnswerAccess().getIdAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1294:1: ( rule__Answer__IdAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1294:2: rule__Answer__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__Answer__IdAssignment_1_in_rule__Answer__Group__1__Impl2573);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1304:1: rule__Answer__Group__2 : rule__Answer__Group__2__Impl rule__Answer__Group__3 ;
    public final void rule__Answer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1308:1: ( rule__Answer__Group__2__Impl rule__Answer__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1309:2: rule__Answer__Group__2__Impl rule__Answer__Group__3
            {
            pushFollow(FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__22603);
            rule__Answer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__22606);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1316:1: rule__Answer__Group__2__Impl : ( 'Answer:' ) ;
    public final void rule__Answer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1320:1: ( ( 'Answer:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1321:1: ( 'Answer:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1321:1: ( 'Answer:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1322:1: 'Answer:'
            {
             before(grammarAccess.getAnswerAccess().getAnswerKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Answer__Group__2__Impl2634); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1335:1: rule__Answer__Group__3 : rule__Answer__Group__3__Impl ;
    public final void rule__Answer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1339:1: ( rule__Answer__Group__3__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1340:2: rule__Answer__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__32665);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1346:1: rule__Answer__Group__3__Impl : ( ( rule__Answer__NameAssignment_3 ) ) ;
    public final void rule__Answer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1350:1: ( ( ( rule__Answer__NameAssignment_3 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1351:1: ( ( rule__Answer__NameAssignment_3 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1351:1: ( ( rule__Answer__NameAssignment_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1352:1: ( rule__Answer__NameAssignment_3 )
            {
             before(grammarAccess.getAnswerAccess().getNameAssignment_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1353:1: ( rule__Answer__NameAssignment_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1353:2: rule__Answer__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Answer__NameAssignment_3_in_rule__Answer__Group__3__Impl2692);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1371:1: rule__SurveyTerminalTypes__Group_0__0 : rule__SurveyTerminalTypes__Group_0__0__Impl rule__SurveyTerminalTypes__Group_0__1 ;
    public final void rule__SurveyTerminalTypes__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1375:1: ( rule__SurveyTerminalTypes__Group_0__0__Impl rule__SurveyTerminalTypes__Group_0__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1376:2: rule__SurveyTerminalTypes__Group_0__0__Impl rule__SurveyTerminalTypes__Group_0__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__0__Impl_in_rule__SurveyTerminalTypes__Group_0__02730);
            rule__SurveyTerminalTypes__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__1_in_rule__SurveyTerminalTypes__Group_0__02733);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1383:1: rule__SurveyTerminalTypes__Group_0__0__Impl : ( () ) ;
    public final void rule__SurveyTerminalTypes__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1387:1: ( ( () ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1388:1: ( () )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1388:1: ( () )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1389:1: ()
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getTextLineAction_0_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1390:1: ()
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1392:1: 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1402:1: rule__SurveyTerminalTypes__Group_0__1 : rule__SurveyTerminalTypes__Group_0__1__Impl rule__SurveyTerminalTypes__Group_0__2 ;
    public final void rule__SurveyTerminalTypes__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1406:1: ( rule__SurveyTerminalTypes__Group_0__1__Impl rule__SurveyTerminalTypes__Group_0__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1407:2: rule__SurveyTerminalTypes__Group_0__1__Impl rule__SurveyTerminalTypes__Group_0__2
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__1__Impl_in_rule__SurveyTerminalTypes__Group_0__12791);
            rule__SurveyTerminalTypes__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__2_in_rule__SurveyTerminalTypes__Group_0__12794);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1414:1: rule__SurveyTerminalTypes__Group_0__1__Impl : ( ( rule__SurveyTerminalTypes__NameAssignment_0_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1418:1: ( ( ( rule__SurveyTerminalTypes__NameAssignment_0_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1419:1: ( ( rule__SurveyTerminalTypes__NameAssignment_0_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1419:1: ( ( rule__SurveyTerminalTypes__NameAssignment_0_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1420:1: ( rule__SurveyTerminalTypes__NameAssignment_0_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_0_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1421:1: ( rule__SurveyTerminalTypes__NameAssignment_0_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1421:2: rule__SurveyTerminalTypes__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__NameAssignment_0_1_in_rule__SurveyTerminalTypes__Group_0__1__Impl2821);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1431:1: rule__SurveyTerminalTypes__Group_0__2 : rule__SurveyTerminalTypes__Group_0__2__Impl rule__SurveyTerminalTypes__Group_0__3 ;
    public final void rule__SurveyTerminalTypes__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1435:1: ( rule__SurveyTerminalTypes__Group_0__2__Impl rule__SurveyTerminalTypes__Group_0__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1436:2: rule__SurveyTerminalTypes__Group_0__2__Impl rule__SurveyTerminalTypes__Group_0__3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__2__Impl_in_rule__SurveyTerminalTypes__Group_0__22851);
            rule__SurveyTerminalTypes__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__3_in_rule__SurveyTerminalTypes__Group_0__22854);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1443:1: rule__SurveyTerminalTypes__Group_0__2__Impl : ( '(' ) ;
    public final void rule__SurveyTerminalTypes__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1447:1: ( ( '(' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1448:1: ( '(' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1448:1: ( '(' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1449:1: '('
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftParenthesisKeyword_0_2()); 
            match(input,22,FOLLOW_22_in_rule__SurveyTerminalTypes__Group_0__2__Impl2882); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1462:1: rule__SurveyTerminalTypes__Group_0__3 : rule__SurveyTerminalTypes__Group_0__3__Impl rule__SurveyTerminalTypes__Group_0__4 ;
    public final void rule__SurveyTerminalTypes__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1466:1: ( rule__SurveyTerminalTypes__Group_0__3__Impl rule__SurveyTerminalTypes__Group_0__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1467:2: rule__SurveyTerminalTypes__Group_0__3__Impl rule__SurveyTerminalTypes__Group_0__4
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__3__Impl_in_rule__SurveyTerminalTypes__Group_0__32913);
            rule__SurveyTerminalTypes__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__4_in_rule__SurveyTerminalTypes__Group_0__32916);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1474:1: rule__SurveyTerminalTypes__Group_0__3__Impl : ( ( rule__SurveyTerminalTypes__LengthAssignment_0_3 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1478:1: ( ( ( rule__SurveyTerminalTypes__LengthAssignment_0_3 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1479:1: ( ( rule__SurveyTerminalTypes__LengthAssignment_0_3 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1479:1: ( ( rule__SurveyTerminalTypes__LengthAssignment_0_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1480:1: ( rule__SurveyTerminalTypes__LengthAssignment_0_3 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLengthAssignment_0_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1481:1: ( rule__SurveyTerminalTypes__LengthAssignment_0_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1481:2: rule__SurveyTerminalTypes__LengthAssignment_0_3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__LengthAssignment_0_3_in_rule__SurveyTerminalTypes__Group_0__3__Impl2943);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1491:1: rule__SurveyTerminalTypes__Group_0__4 : rule__SurveyTerminalTypes__Group_0__4__Impl ;
    public final void rule__SurveyTerminalTypes__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1495:1: ( rule__SurveyTerminalTypes__Group_0__4__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1496:2: rule__SurveyTerminalTypes__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__4__Impl_in_rule__SurveyTerminalTypes__Group_0__42973);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1502:1: rule__SurveyTerminalTypes__Group_0__4__Impl : ( ')' ) ;
    public final void rule__SurveyTerminalTypes__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1506:1: ( ( ')' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1507:1: ( ')' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1507:1: ( ')' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1508:1: ')'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightParenthesisKeyword_0_4()); 
            match(input,23,FOLLOW_23_in_rule__SurveyTerminalTypes__Group_0__4__Impl3001); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1531:1: rule__SurveyTerminalTypes__Group_1__0 : rule__SurveyTerminalTypes__Group_1__0__Impl rule__SurveyTerminalTypes__Group_1__1 ;
    public final void rule__SurveyTerminalTypes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1535:1: ( rule__SurveyTerminalTypes__Group_1__0__Impl rule__SurveyTerminalTypes__Group_1__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1536:2: rule__SurveyTerminalTypes__Group_1__0__Impl rule__SurveyTerminalTypes__Group_1__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__0__Impl_in_rule__SurveyTerminalTypes__Group_1__03042);
            rule__SurveyTerminalTypes__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__1_in_rule__SurveyTerminalTypes__Group_1__03045);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1543:1: rule__SurveyTerminalTypes__Group_1__0__Impl : ( () ) ;
    public final void rule__SurveyTerminalTypes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1547:1: ( ( () ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1548:1: ( () )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1548:1: ( () )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1549:1: ()
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getTextBlockAction_1_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1550:1: ()
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1552:1: 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1562:1: rule__SurveyTerminalTypes__Group_1__1 : rule__SurveyTerminalTypes__Group_1__1__Impl rule__SurveyTerminalTypes__Group_1__2 ;
    public final void rule__SurveyTerminalTypes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1566:1: ( rule__SurveyTerminalTypes__Group_1__1__Impl rule__SurveyTerminalTypes__Group_1__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1567:2: rule__SurveyTerminalTypes__Group_1__1__Impl rule__SurveyTerminalTypes__Group_1__2
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__1__Impl_in_rule__SurveyTerminalTypes__Group_1__13103);
            rule__SurveyTerminalTypes__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__2_in_rule__SurveyTerminalTypes__Group_1__13106);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1574:1: rule__SurveyTerminalTypes__Group_1__1__Impl : ( ( rule__SurveyTerminalTypes__NameAssignment_1_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1578:1: ( ( ( rule__SurveyTerminalTypes__NameAssignment_1_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1579:1: ( ( rule__SurveyTerminalTypes__NameAssignment_1_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1579:1: ( ( rule__SurveyTerminalTypes__NameAssignment_1_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1580:1: ( rule__SurveyTerminalTypes__NameAssignment_1_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_1_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1581:1: ( rule__SurveyTerminalTypes__NameAssignment_1_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1581:2: rule__SurveyTerminalTypes__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__NameAssignment_1_1_in_rule__SurveyTerminalTypes__Group_1__1__Impl3133);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1591:1: rule__SurveyTerminalTypes__Group_1__2 : rule__SurveyTerminalTypes__Group_1__2__Impl rule__SurveyTerminalTypes__Group_1__3 ;
    public final void rule__SurveyTerminalTypes__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1595:1: ( rule__SurveyTerminalTypes__Group_1__2__Impl rule__SurveyTerminalTypes__Group_1__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1596:2: rule__SurveyTerminalTypes__Group_1__2__Impl rule__SurveyTerminalTypes__Group_1__3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__2__Impl_in_rule__SurveyTerminalTypes__Group_1__23163);
            rule__SurveyTerminalTypes__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__3_in_rule__SurveyTerminalTypes__Group_1__23166);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1603:1: rule__SurveyTerminalTypes__Group_1__2__Impl : ( '(' ) ;
    public final void rule__SurveyTerminalTypes__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1607:1: ( ( '(' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1608:1: ( '(' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1608:1: ( '(' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1609:1: '('
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftParenthesisKeyword_1_2()); 
            match(input,22,FOLLOW_22_in_rule__SurveyTerminalTypes__Group_1__2__Impl3194); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1622:1: rule__SurveyTerminalTypes__Group_1__3 : rule__SurveyTerminalTypes__Group_1__3__Impl rule__SurveyTerminalTypes__Group_1__4 ;
    public final void rule__SurveyTerminalTypes__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1626:1: ( rule__SurveyTerminalTypes__Group_1__3__Impl rule__SurveyTerminalTypes__Group_1__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1627:2: rule__SurveyTerminalTypes__Group_1__3__Impl rule__SurveyTerminalTypes__Group_1__4
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__3__Impl_in_rule__SurveyTerminalTypes__Group_1__33225);
            rule__SurveyTerminalTypes__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__4_in_rule__SurveyTerminalTypes__Group_1__33228);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1634:1: rule__SurveyTerminalTypes__Group_1__3__Impl : ( ( rule__SurveyTerminalTypes__LengthAssignment_1_3 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1638:1: ( ( ( rule__SurveyTerminalTypes__LengthAssignment_1_3 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1639:1: ( ( rule__SurveyTerminalTypes__LengthAssignment_1_3 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1639:1: ( ( rule__SurveyTerminalTypes__LengthAssignment_1_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1640:1: ( rule__SurveyTerminalTypes__LengthAssignment_1_3 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLengthAssignment_1_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1641:1: ( rule__SurveyTerminalTypes__LengthAssignment_1_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1641:2: rule__SurveyTerminalTypes__LengthAssignment_1_3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__LengthAssignment_1_3_in_rule__SurveyTerminalTypes__Group_1__3__Impl3255);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1651:1: rule__SurveyTerminalTypes__Group_1__4 : rule__SurveyTerminalTypes__Group_1__4__Impl ;
    public final void rule__SurveyTerminalTypes__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1655:1: ( rule__SurveyTerminalTypes__Group_1__4__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1656:2: rule__SurveyTerminalTypes__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__4__Impl_in_rule__SurveyTerminalTypes__Group_1__43285);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1662:1: rule__SurveyTerminalTypes__Group_1__4__Impl : ( ')' ) ;
    public final void rule__SurveyTerminalTypes__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1666:1: ( ( ')' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1667:1: ( ')' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1667:1: ( ')' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1668:1: ')'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightParenthesisKeyword_1_4()); 
            match(input,23,FOLLOW_23_in_rule__SurveyTerminalTypes__Group_1__4__Impl3313); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1691:1: rule__SurveyTerminalTypes__Group_2__0 : rule__SurveyTerminalTypes__Group_2__0__Impl rule__SurveyTerminalTypes__Group_2__1 ;
    public final void rule__SurveyTerminalTypes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1695:1: ( rule__SurveyTerminalTypes__Group_2__0__Impl rule__SurveyTerminalTypes__Group_2__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1696:2: rule__SurveyTerminalTypes__Group_2__0__Impl rule__SurveyTerminalTypes__Group_2__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__0__Impl_in_rule__SurveyTerminalTypes__Group_2__03354);
            rule__SurveyTerminalTypes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__1_in_rule__SurveyTerminalTypes__Group_2__03357);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1703:1: rule__SurveyTerminalTypes__Group_2__0__Impl : ( () ) ;
    public final void rule__SurveyTerminalTypes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1707:1: ( ( () ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1708:1: ( () )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1708:1: ( () )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1709:1: ()
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getMatrixAction_2_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1710:1: ()
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1712:1: 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1722:1: rule__SurveyTerminalTypes__Group_2__1 : rule__SurveyTerminalTypes__Group_2__1__Impl rule__SurveyTerminalTypes__Group_2__2 ;
    public final void rule__SurveyTerminalTypes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1726:1: ( rule__SurveyTerminalTypes__Group_2__1__Impl rule__SurveyTerminalTypes__Group_2__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1727:2: rule__SurveyTerminalTypes__Group_2__1__Impl rule__SurveyTerminalTypes__Group_2__2
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__1__Impl_in_rule__SurveyTerminalTypes__Group_2__13415);
            rule__SurveyTerminalTypes__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__2_in_rule__SurveyTerminalTypes__Group_2__13418);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1734:1: rule__SurveyTerminalTypes__Group_2__1__Impl : ( ( rule__SurveyTerminalTypes__NameAssignment_2_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1738:1: ( ( ( rule__SurveyTerminalTypes__NameAssignment_2_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1739:1: ( ( rule__SurveyTerminalTypes__NameAssignment_2_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1739:1: ( ( rule__SurveyTerminalTypes__NameAssignment_2_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1740:1: ( rule__SurveyTerminalTypes__NameAssignment_2_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_2_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1741:1: ( rule__SurveyTerminalTypes__NameAssignment_2_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1741:2: rule__SurveyTerminalTypes__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__NameAssignment_2_1_in_rule__SurveyTerminalTypes__Group_2__1__Impl3445);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1751:1: rule__SurveyTerminalTypes__Group_2__2 : rule__SurveyTerminalTypes__Group_2__2__Impl rule__SurveyTerminalTypes__Group_2__3 ;
    public final void rule__SurveyTerminalTypes__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1755:1: ( rule__SurveyTerminalTypes__Group_2__2__Impl rule__SurveyTerminalTypes__Group_2__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1756:2: rule__SurveyTerminalTypes__Group_2__2__Impl rule__SurveyTerminalTypes__Group_2__3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__2__Impl_in_rule__SurveyTerminalTypes__Group_2__23475);
            rule__SurveyTerminalTypes__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__3_in_rule__SurveyTerminalTypes__Group_2__23478);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1763:1: rule__SurveyTerminalTypes__Group_2__2__Impl : ( '{' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1767:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1768:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1768:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1769:1: '{'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftCurlyBracketKeyword_2_2()); 
            match(input,12,FOLLOW_12_in_rule__SurveyTerminalTypes__Group_2__2__Impl3506); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1782:1: rule__SurveyTerminalTypes__Group_2__3 : rule__SurveyTerminalTypes__Group_2__3__Impl rule__SurveyTerminalTypes__Group_2__4 ;
    public final void rule__SurveyTerminalTypes__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1786:1: ( rule__SurveyTerminalTypes__Group_2__3__Impl rule__SurveyTerminalTypes__Group_2__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1787:2: rule__SurveyTerminalTypes__Group_2__3__Impl rule__SurveyTerminalTypes__Group_2__4
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__3__Impl_in_rule__SurveyTerminalTypes__Group_2__33537);
            rule__SurveyTerminalTypes__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__4_in_rule__SurveyTerminalTypes__Group_2__33540);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1794:1: rule__SurveyTerminalTypes__Group_2__3__Impl : ( 'Scale:' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1798:1: ( ( 'Scale:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1799:1: ( 'Scale:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1799:1: ( 'Scale:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1800:1: 'Scale:'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getScaleKeyword_2_3()); 
            match(input,24,FOLLOW_24_in_rule__SurveyTerminalTypes__Group_2__3__Impl3568); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1813:1: rule__SurveyTerminalTypes__Group_2__4 : rule__SurveyTerminalTypes__Group_2__4__Impl rule__SurveyTerminalTypes__Group_2__5 ;
    public final void rule__SurveyTerminalTypes__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1817:1: ( rule__SurveyTerminalTypes__Group_2__4__Impl rule__SurveyTerminalTypes__Group_2__5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1818:2: rule__SurveyTerminalTypes__Group_2__4__Impl rule__SurveyTerminalTypes__Group_2__5
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__4__Impl_in_rule__SurveyTerminalTypes__Group_2__43599);
            rule__SurveyTerminalTypes__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__5_in_rule__SurveyTerminalTypes__Group_2__43602);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1825:1: rule__SurveyTerminalTypes__Group_2__4__Impl : ( '(' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1829:1: ( ( '(' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1830:1: ( '(' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1830:1: ( '(' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1831:1: '('
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftParenthesisKeyword_2_4()); 
            match(input,22,FOLLOW_22_in_rule__SurveyTerminalTypes__Group_2__4__Impl3630); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1844:1: rule__SurveyTerminalTypes__Group_2__5 : rule__SurveyTerminalTypes__Group_2__5__Impl rule__SurveyTerminalTypes__Group_2__6 ;
    public final void rule__SurveyTerminalTypes__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1848:1: ( rule__SurveyTerminalTypes__Group_2__5__Impl rule__SurveyTerminalTypes__Group_2__6 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1849:2: rule__SurveyTerminalTypes__Group_2__5__Impl rule__SurveyTerminalTypes__Group_2__6
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__5__Impl_in_rule__SurveyTerminalTypes__Group_2__53661);
            rule__SurveyTerminalTypes__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__6_in_rule__SurveyTerminalTypes__Group_2__53664);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1856:1: rule__SurveyTerminalTypes__Group_2__5__Impl : ( ( rule__SurveyTerminalTypes__AnswerAssignment_2_5 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1860:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_2_5 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1861:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_2_5 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1861:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_2_5 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1862:1: ( rule__SurveyTerminalTypes__AnswerAssignment_2_5 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_2_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1863:1: ( rule__SurveyTerminalTypes__AnswerAssignment_2_5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1863:2: rule__SurveyTerminalTypes__AnswerAssignment_2_5
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_2_5_in_rule__SurveyTerminalTypes__Group_2__5__Impl3691);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1873:1: rule__SurveyTerminalTypes__Group_2__6 : rule__SurveyTerminalTypes__Group_2__6__Impl rule__SurveyTerminalTypes__Group_2__7 ;
    public final void rule__SurveyTerminalTypes__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1877:1: ( rule__SurveyTerminalTypes__Group_2__6__Impl rule__SurveyTerminalTypes__Group_2__7 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1878:2: rule__SurveyTerminalTypes__Group_2__6__Impl rule__SurveyTerminalTypes__Group_2__7
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__6__Impl_in_rule__SurveyTerminalTypes__Group_2__63721);
            rule__SurveyTerminalTypes__Group_2__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__7_in_rule__SurveyTerminalTypes__Group_2__63724);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1885:1: rule__SurveyTerminalTypes__Group_2__6__Impl : ( ( rule__SurveyTerminalTypes__Group_2_6__0 )* ) ;
    public final void rule__SurveyTerminalTypes__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1889:1: ( ( ( rule__SurveyTerminalTypes__Group_2_6__0 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1890:1: ( ( rule__SurveyTerminalTypes__Group_2_6__0 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1890:1: ( ( rule__SurveyTerminalTypes__Group_2_6__0 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1891:1: ( rule__SurveyTerminalTypes__Group_2_6__0 )*
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_2_6()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1892:1: ( rule__SurveyTerminalTypes__Group_2_6__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1892:2: rule__SurveyTerminalTypes__Group_2_6__0
            	    {
            	    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_6__0_in_rule__SurveyTerminalTypes__Group_2__6__Impl3751);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1902:1: rule__SurveyTerminalTypes__Group_2__7 : rule__SurveyTerminalTypes__Group_2__7__Impl rule__SurveyTerminalTypes__Group_2__8 ;
    public final void rule__SurveyTerminalTypes__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1906:1: ( rule__SurveyTerminalTypes__Group_2__7__Impl rule__SurveyTerminalTypes__Group_2__8 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1907:2: rule__SurveyTerminalTypes__Group_2__7__Impl rule__SurveyTerminalTypes__Group_2__8
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__7__Impl_in_rule__SurveyTerminalTypes__Group_2__73782);
            rule__SurveyTerminalTypes__Group_2__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__8_in_rule__SurveyTerminalTypes__Group_2__73785);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1914:1: rule__SurveyTerminalTypes__Group_2__7__Impl : ( ')' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1918:1: ( ( ')' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1919:1: ( ')' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1919:1: ( ')' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1920:1: ')'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightParenthesisKeyword_2_7()); 
            match(input,23,FOLLOW_23_in_rule__SurveyTerminalTypes__Group_2__7__Impl3813); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1933:1: rule__SurveyTerminalTypes__Group_2__8 : rule__SurveyTerminalTypes__Group_2__8__Impl rule__SurveyTerminalTypes__Group_2__9 ;
    public final void rule__SurveyTerminalTypes__Group_2__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1937:1: ( rule__SurveyTerminalTypes__Group_2__8__Impl rule__SurveyTerminalTypes__Group_2__9 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1938:2: rule__SurveyTerminalTypes__Group_2__8__Impl rule__SurveyTerminalTypes__Group_2__9
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__8__Impl_in_rule__SurveyTerminalTypes__Group_2__83844);
            rule__SurveyTerminalTypes__Group_2__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__9_in_rule__SurveyTerminalTypes__Group_2__83847);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1945:1: rule__SurveyTerminalTypes__Group_2__8__Impl : ( 'Questions:' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1949:1: ( ( 'Questions:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1950:1: ( 'Questions:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1950:1: ( 'Questions:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1951:1: 'Questions:'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getQuestionsKeyword_2_8()); 
            match(input,25,FOLLOW_25_in_rule__SurveyTerminalTypes__Group_2__8__Impl3875); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1964:1: rule__SurveyTerminalTypes__Group_2__9 : rule__SurveyTerminalTypes__Group_2__9__Impl rule__SurveyTerminalTypes__Group_2__10 ;
    public final void rule__SurveyTerminalTypes__Group_2__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1968:1: ( rule__SurveyTerminalTypes__Group_2__9__Impl rule__SurveyTerminalTypes__Group_2__10 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1969:2: rule__SurveyTerminalTypes__Group_2__9__Impl rule__SurveyTerminalTypes__Group_2__10
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__9__Impl_in_rule__SurveyTerminalTypes__Group_2__93906);
            rule__SurveyTerminalTypes__Group_2__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__10_in_rule__SurveyTerminalTypes__Group_2__93909);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1976:1: rule__SurveyTerminalTypes__Group_2__9__Impl : ( '(' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1980:1: ( ( '(' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1981:1: ( '(' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1981:1: ( '(' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1982:1: '('
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftParenthesisKeyword_2_9()); 
            match(input,22,FOLLOW_22_in_rule__SurveyTerminalTypes__Group_2__9__Impl3937); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1995:1: rule__SurveyTerminalTypes__Group_2__10 : rule__SurveyTerminalTypes__Group_2__10__Impl rule__SurveyTerminalTypes__Group_2__11 ;
    public final void rule__SurveyTerminalTypes__Group_2__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1999:1: ( rule__SurveyTerminalTypes__Group_2__10__Impl rule__SurveyTerminalTypes__Group_2__11 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2000:2: rule__SurveyTerminalTypes__Group_2__10__Impl rule__SurveyTerminalTypes__Group_2__11
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__10__Impl_in_rule__SurveyTerminalTypes__Group_2__103968);
            rule__SurveyTerminalTypes__Group_2__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__11_in_rule__SurveyTerminalTypes__Group_2__103971);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2007:1: rule__SurveyTerminalTypes__Group_2__10__Impl : ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_2__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2011:1: ( ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2012:1: ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2012:1: ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2013:1: ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getMatrixQuestionAssignment_2_10()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2014:1: ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2014:2: rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10_in_rule__SurveyTerminalTypes__Group_2__10__Impl3998);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2024:1: rule__SurveyTerminalTypes__Group_2__11 : rule__SurveyTerminalTypes__Group_2__11__Impl rule__SurveyTerminalTypes__Group_2__12 ;
    public final void rule__SurveyTerminalTypes__Group_2__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2028:1: ( rule__SurveyTerminalTypes__Group_2__11__Impl rule__SurveyTerminalTypes__Group_2__12 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2029:2: rule__SurveyTerminalTypes__Group_2__11__Impl rule__SurveyTerminalTypes__Group_2__12
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__11__Impl_in_rule__SurveyTerminalTypes__Group_2__114028);
            rule__SurveyTerminalTypes__Group_2__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__12_in_rule__SurveyTerminalTypes__Group_2__114031);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2036:1: rule__SurveyTerminalTypes__Group_2__11__Impl : ( ( rule__SurveyTerminalTypes__Group_2_11__0 )* ) ;
    public final void rule__SurveyTerminalTypes__Group_2__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2040:1: ( ( ( rule__SurveyTerminalTypes__Group_2_11__0 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2041:1: ( ( rule__SurveyTerminalTypes__Group_2_11__0 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2041:1: ( ( rule__SurveyTerminalTypes__Group_2_11__0 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2042:1: ( rule__SurveyTerminalTypes__Group_2_11__0 )*
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_2_11()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2043:1: ( rule__SurveyTerminalTypes__Group_2_11__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2043:2: rule__SurveyTerminalTypes__Group_2_11__0
            	    {
            	    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_11__0_in_rule__SurveyTerminalTypes__Group_2__11__Impl4058);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2053:1: rule__SurveyTerminalTypes__Group_2__12 : rule__SurveyTerminalTypes__Group_2__12__Impl rule__SurveyTerminalTypes__Group_2__13 ;
    public final void rule__SurveyTerminalTypes__Group_2__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2057:1: ( rule__SurveyTerminalTypes__Group_2__12__Impl rule__SurveyTerminalTypes__Group_2__13 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2058:2: rule__SurveyTerminalTypes__Group_2__12__Impl rule__SurveyTerminalTypes__Group_2__13
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__12__Impl_in_rule__SurveyTerminalTypes__Group_2__124089);
            rule__SurveyTerminalTypes__Group_2__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__13_in_rule__SurveyTerminalTypes__Group_2__124092);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2065:1: rule__SurveyTerminalTypes__Group_2__12__Impl : ( ')' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2069:1: ( ( ')' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2070:1: ( ')' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2070:1: ( ')' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2071:1: ')'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightParenthesisKeyword_2_12()); 
            match(input,23,FOLLOW_23_in_rule__SurveyTerminalTypes__Group_2__12__Impl4120); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2084:1: rule__SurveyTerminalTypes__Group_2__13 : rule__SurveyTerminalTypes__Group_2__13__Impl ;
    public final void rule__SurveyTerminalTypes__Group_2__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2088:1: ( rule__SurveyTerminalTypes__Group_2__13__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2089:2: rule__SurveyTerminalTypes__Group_2__13__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__13__Impl_in_rule__SurveyTerminalTypes__Group_2__134151);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2095:1: rule__SurveyTerminalTypes__Group_2__13__Impl : ( '}' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2099:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2100:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2100:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2101:1: '}'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightCurlyBracketKeyword_2_13()); 
            match(input,14,FOLLOW_14_in_rule__SurveyTerminalTypes__Group_2__13__Impl4179); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2142:1: rule__SurveyTerminalTypes__Group_2_6__0 : rule__SurveyTerminalTypes__Group_2_6__0__Impl rule__SurveyTerminalTypes__Group_2_6__1 ;
    public final void rule__SurveyTerminalTypes__Group_2_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2146:1: ( rule__SurveyTerminalTypes__Group_2_6__0__Impl rule__SurveyTerminalTypes__Group_2_6__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2147:2: rule__SurveyTerminalTypes__Group_2_6__0__Impl rule__SurveyTerminalTypes__Group_2_6__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_6__0__Impl_in_rule__SurveyTerminalTypes__Group_2_6__04238);
            rule__SurveyTerminalTypes__Group_2_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_6__1_in_rule__SurveyTerminalTypes__Group_2_6__04241);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2154:1: rule__SurveyTerminalTypes__Group_2_6__0__Impl : ( '|' ) ;
    public final void rule__SurveyTerminalTypes__Group_2_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2158:1: ( ( '|' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2159:1: ( '|' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2159:1: ( '|' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2160:1: '|'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getVerticalLineKeyword_2_6_0()); 
            match(input,26,FOLLOW_26_in_rule__SurveyTerminalTypes__Group_2_6__0__Impl4269); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2173:1: rule__SurveyTerminalTypes__Group_2_6__1 : rule__SurveyTerminalTypes__Group_2_6__1__Impl ;
    public final void rule__SurveyTerminalTypes__Group_2_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2177:1: ( rule__SurveyTerminalTypes__Group_2_6__1__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2178:2: rule__SurveyTerminalTypes__Group_2_6__1__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_6__1__Impl_in_rule__SurveyTerminalTypes__Group_2_6__14300);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2184:1: rule__SurveyTerminalTypes__Group_2_6__1__Impl : ( ( rule__SurveyTerminalTypes__AnswerAssignment_2_6_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_2_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2188:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_2_6_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2189:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_2_6_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2189:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_2_6_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2190:1: ( rule__SurveyTerminalTypes__AnswerAssignment_2_6_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_2_6_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2191:1: ( rule__SurveyTerminalTypes__AnswerAssignment_2_6_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2191:2: rule__SurveyTerminalTypes__AnswerAssignment_2_6_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_2_6_1_in_rule__SurveyTerminalTypes__Group_2_6__1__Impl4327);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2205:1: rule__SurveyTerminalTypes__Group_2_11__0 : rule__SurveyTerminalTypes__Group_2_11__0__Impl rule__SurveyTerminalTypes__Group_2_11__1 ;
    public final void rule__SurveyTerminalTypes__Group_2_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2209:1: ( rule__SurveyTerminalTypes__Group_2_11__0__Impl rule__SurveyTerminalTypes__Group_2_11__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2210:2: rule__SurveyTerminalTypes__Group_2_11__0__Impl rule__SurveyTerminalTypes__Group_2_11__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_11__0__Impl_in_rule__SurveyTerminalTypes__Group_2_11__04361);
            rule__SurveyTerminalTypes__Group_2_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_11__1_in_rule__SurveyTerminalTypes__Group_2_11__04364);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2217:1: rule__SurveyTerminalTypes__Group_2_11__0__Impl : ( '|' ) ;
    public final void rule__SurveyTerminalTypes__Group_2_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2221:1: ( ( '|' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2222:1: ( '|' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2222:1: ( '|' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2223:1: '|'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getVerticalLineKeyword_2_11_0()); 
            match(input,26,FOLLOW_26_in_rule__SurveyTerminalTypes__Group_2_11__0__Impl4392); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2236:1: rule__SurveyTerminalTypes__Group_2_11__1 : rule__SurveyTerminalTypes__Group_2_11__1__Impl ;
    public final void rule__SurveyTerminalTypes__Group_2_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2240:1: ( rule__SurveyTerminalTypes__Group_2_11__1__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2241:2: rule__SurveyTerminalTypes__Group_2_11__1__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_11__1__Impl_in_rule__SurveyTerminalTypes__Group_2_11__14423);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2247:1: rule__SurveyTerminalTypes__Group_2_11__1__Impl : ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_2_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2251:1: ( ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2252:1: ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2252:1: ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2253:1: ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getMatrixQuestionAssignment_2_11_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2254:1: ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2254:2: rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1_in_rule__SurveyTerminalTypes__Group_2_11__1__Impl4450);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2268:1: rule__SurveyTerminalTypes__Group_3__0 : rule__SurveyTerminalTypes__Group_3__0__Impl rule__SurveyTerminalTypes__Group_3__1 ;
    public final void rule__SurveyTerminalTypes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2272:1: ( rule__SurveyTerminalTypes__Group_3__0__Impl rule__SurveyTerminalTypes__Group_3__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2273:2: rule__SurveyTerminalTypes__Group_3__0__Impl rule__SurveyTerminalTypes__Group_3__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__0__Impl_in_rule__SurveyTerminalTypes__Group_3__04484);
            rule__SurveyTerminalTypes__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__1_in_rule__SurveyTerminalTypes__Group_3__04487);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2280:1: rule__SurveyTerminalTypes__Group_3__0__Impl : ( () ) ;
    public final void rule__SurveyTerminalTypes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2284:1: ( ( () ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2285:1: ( () )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2285:1: ( () )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2286:1: ()
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getComboBoxAction_3_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2287:1: ()
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2289:1: 
            {
            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getComboBoxAction_3_0()); 

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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2299:1: rule__SurveyTerminalTypes__Group_3__1 : rule__SurveyTerminalTypes__Group_3__1__Impl rule__SurveyTerminalTypes__Group_3__2 ;
    public final void rule__SurveyTerminalTypes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2303:1: ( rule__SurveyTerminalTypes__Group_3__1__Impl rule__SurveyTerminalTypes__Group_3__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2304:2: rule__SurveyTerminalTypes__Group_3__1__Impl rule__SurveyTerminalTypes__Group_3__2
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__1__Impl_in_rule__SurveyTerminalTypes__Group_3__14545);
            rule__SurveyTerminalTypes__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__2_in_rule__SurveyTerminalTypes__Group_3__14548);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2311:1: rule__SurveyTerminalTypes__Group_3__1__Impl : ( ( rule__SurveyTerminalTypes__NameAssignment_3_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2315:1: ( ( ( rule__SurveyTerminalTypes__NameAssignment_3_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2316:1: ( ( rule__SurveyTerminalTypes__NameAssignment_3_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2316:1: ( ( rule__SurveyTerminalTypes__NameAssignment_3_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2317:1: ( rule__SurveyTerminalTypes__NameAssignment_3_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_3_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2318:1: ( rule__SurveyTerminalTypes__NameAssignment_3_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2318:2: rule__SurveyTerminalTypes__NameAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__NameAssignment_3_1_in_rule__SurveyTerminalTypes__Group_3__1__Impl4575);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2328:1: rule__SurveyTerminalTypes__Group_3__2 : rule__SurveyTerminalTypes__Group_3__2__Impl rule__SurveyTerminalTypes__Group_3__3 ;
    public final void rule__SurveyTerminalTypes__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2332:1: ( rule__SurveyTerminalTypes__Group_3__2__Impl rule__SurveyTerminalTypes__Group_3__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2333:2: rule__SurveyTerminalTypes__Group_3__2__Impl rule__SurveyTerminalTypes__Group_3__3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__2__Impl_in_rule__SurveyTerminalTypes__Group_3__24605);
            rule__SurveyTerminalTypes__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__3_in_rule__SurveyTerminalTypes__Group_3__24608);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2340:1: rule__SurveyTerminalTypes__Group_3__2__Impl : ( '{' ) ;
    public final void rule__SurveyTerminalTypes__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2344:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2345:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2345:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2346:1: '{'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftCurlyBracketKeyword_3_2()); 
            match(input,12,FOLLOW_12_in_rule__SurveyTerminalTypes__Group_3__2__Impl4636); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2359:1: rule__SurveyTerminalTypes__Group_3__3 : rule__SurveyTerminalTypes__Group_3__3__Impl rule__SurveyTerminalTypes__Group_3__4 ;
    public final void rule__SurveyTerminalTypes__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2363:1: ( rule__SurveyTerminalTypes__Group_3__3__Impl rule__SurveyTerminalTypes__Group_3__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2364:2: rule__SurveyTerminalTypes__Group_3__3__Impl rule__SurveyTerminalTypes__Group_3__4
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__3__Impl_in_rule__SurveyTerminalTypes__Group_3__34667);
            rule__SurveyTerminalTypes__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__4_in_rule__SurveyTerminalTypes__Group_3__34670);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2371:1: rule__SurveyTerminalTypes__Group_3__3__Impl : ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )* ) ) ;
    public final void rule__SurveyTerminalTypes__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2375:1: ( ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )* ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2376:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2376:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2377:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2377:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2378:1: ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_3_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2379:1: ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2379:2: rule__SurveyTerminalTypes__AnswerAssignment_3_3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_3_3_in_rule__SurveyTerminalTypes__Group_3__3__Impl4699);
            rule__SurveyTerminalTypes__AnswerAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_3_3()); 

            }

            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2382:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2383:1: ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )*
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_3_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2384:1: ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2384:2: rule__SurveyTerminalTypes__AnswerAssignment_3_3
            	    {
            	    pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_3_3_in_rule__SurveyTerminalTypes__Group_3__3__Impl4711);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2395:1: rule__SurveyTerminalTypes__Group_3__4 : rule__SurveyTerminalTypes__Group_3__4__Impl ;
    public final void rule__SurveyTerminalTypes__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2399:1: ( rule__SurveyTerminalTypes__Group_3__4__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2400:2: rule__SurveyTerminalTypes__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__4__Impl_in_rule__SurveyTerminalTypes__Group_3__44744);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2406:1: rule__SurveyTerminalTypes__Group_3__4__Impl : ( '}' ) ;
    public final void rule__SurveyTerminalTypes__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2410:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2411:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2411:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2412:1: '}'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,14,FOLLOW_14_in_rule__SurveyTerminalTypes__Group_3__4__Impl4772); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2435:1: rule__SurveyTerminalTypes__Group_4__0 : rule__SurveyTerminalTypes__Group_4__0__Impl rule__SurveyTerminalTypes__Group_4__1 ;
    public final void rule__SurveyTerminalTypes__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2439:1: ( rule__SurveyTerminalTypes__Group_4__0__Impl rule__SurveyTerminalTypes__Group_4__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2440:2: rule__SurveyTerminalTypes__Group_4__0__Impl rule__SurveyTerminalTypes__Group_4__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__0__Impl_in_rule__SurveyTerminalTypes__Group_4__04813);
            rule__SurveyTerminalTypes__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__1_in_rule__SurveyTerminalTypes__Group_4__04816);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2447:1: rule__SurveyTerminalTypes__Group_4__0__Impl : ( () ) ;
    public final void rule__SurveyTerminalTypes__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2451:1: ( ( () ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2452:1: ( () )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2452:1: ( () )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2453:1: ()
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getDropDownAction_4_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2454:1: ()
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2456:1: 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2466:1: rule__SurveyTerminalTypes__Group_4__1 : rule__SurveyTerminalTypes__Group_4__1__Impl rule__SurveyTerminalTypes__Group_4__2 ;
    public final void rule__SurveyTerminalTypes__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2470:1: ( rule__SurveyTerminalTypes__Group_4__1__Impl rule__SurveyTerminalTypes__Group_4__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2471:2: rule__SurveyTerminalTypes__Group_4__1__Impl rule__SurveyTerminalTypes__Group_4__2
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__1__Impl_in_rule__SurveyTerminalTypes__Group_4__14874);
            rule__SurveyTerminalTypes__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__2_in_rule__SurveyTerminalTypes__Group_4__14877);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2478:1: rule__SurveyTerminalTypes__Group_4__1__Impl : ( ( rule__SurveyTerminalTypes__NameAssignment_4_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2482:1: ( ( ( rule__SurveyTerminalTypes__NameAssignment_4_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2483:1: ( ( rule__SurveyTerminalTypes__NameAssignment_4_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2483:1: ( ( rule__SurveyTerminalTypes__NameAssignment_4_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2484:1: ( rule__SurveyTerminalTypes__NameAssignment_4_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_4_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2485:1: ( rule__SurveyTerminalTypes__NameAssignment_4_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2485:2: rule__SurveyTerminalTypes__NameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__NameAssignment_4_1_in_rule__SurveyTerminalTypes__Group_4__1__Impl4904);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2495:1: rule__SurveyTerminalTypes__Group_4__2 : rule__SurveyTerminalTypes__Group_4__2__Impl rule__SurveyTerminalTypes__Group_4__3 ;
    public final void rule__SurveyTerminalTypes__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2499:1: ( rule__SurveyTerminalTypes__Group_4__2__Impl rule__SurveyTerminalTypes__Group_4__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2500:2: rule__SurveyTerminalTypes__Group_4__2__Impl rule__SurveyTerminalTypes__Group_4__3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__2__Impl_in_rule__SurveyTerminalTypes__Group_4__24934);
            rule__SurveyTerminalTypes__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__3_in_rule__SurveyTerminalTypes__Group_4__24937);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2507:1: rule__SurveyTerminalTypes__Group_4__2__Impl : ( '{' ) ;
    public final void rule__SurveyTerminalTypes__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2511:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2512:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2512:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2513:1: '{'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftCurlyBracketKeyword_4_2()); 
            match(input,12,FOLLOW_12_in_rule__SurveyTerminalTypes__Group_4__2__Impl4965); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2526:1: rule__SurveyTerminalTypes__Group_4__3 : rule__SurveyTerminalTypes__Group_4__3__Impl rule__SurveyTerminalTypes__Group_4__4 ;
    public final void rule__SurveyTerminalTypes__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2530:1: ( rule__SurveyTerminalTypes__Group_4__3__Impl rule__SurveyTerminalTypes__Group_4__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2531:2: rule__SurveyTerminalTypes__Group_4__3__Impl rule__SurveyTerminalTypes__Group_4__4
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__3__Impl_in_rule__SurveyTerminalTypes__Group_4__34996);
            rule__SurveyTerminalTypes__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__4_in_rule__SurveyTerminalTypes__Group_4__34999);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2538:1: rule__SurveyTerminalTypes__Group_4__3__Impl : ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )* ) ) ;
    public final void rule__SurveyTerminalTypes__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2542:1: ( ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )* ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2543:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2543:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2544:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2544:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2545:1: ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_4_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2546:1: ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2546:2: rule__SurveyTerminalTypes__AnswerAssignment_4_3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_4_3_in_rule__SurveyTerminalTypes__Group_4__3__Impl5028);
            rule__SurveyTerminalTypes__AnswerAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_4_3()); 

            }

            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2549:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2550:1: ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )*
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_4_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2551:1: ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2551:2: rule__SurveyTerminalTypes__AnswerAssignment_4_3
            	    {
            	    pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_4_3_in_rule__SurveyTerminalTypes__Group_4__3__Impl5040);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2562:1: rule__SurveyTerminalTypes__Group_4__4 : rule__SurveyTerminalTypes__Group_4__4__Impl ;
    public final void rule__SurveyTerminalTypes__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2566:1: ( rule__SurveyTerminalTypes__Group_4__4__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2567:2: rule__SurveyTerminalTypes__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__4__Impl_in_rule__SurveyTerminalTypes__Group_4__45073);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2573:1: rule__SurveyTerminalTypes__Group_4__4__Impl : ( '}' ) ;
    public final void rule__SurveyTerminalTypes__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2577:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2578:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2578:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2579:1: '}'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,14,FOLLOW_14_in_rule__SurveyTerminalTypes__Group_4__4__Impl5101); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2602:1: rule__SurveyTerminalTypes__Group_5__0 : rule__SurveyTerminalTypes__Group_5__0__Impl rule__SurveyTerminalTypes__Group_5__1 ;
    public final void rule__SurveyTerminalTypes__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2606:1: ( rule__SurveyTerminalTypes__Group_5__0__Impl rule__SurveyTerminalTypes__Group_5__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2607:2: rule__SurveyTerminalTypes__Group_5__0__Impl rule__SurveyTerminalTypes__Group_5__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__0__Impl_in_rule__SurveyTerminalTypes__Group_5__05142);
            rule__SurveyTerminalTypes__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__1_in_rule__SurveyTerminalTypes__Group_5__05145);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2614:1: rule__SurveyTerminalTypes__Group_5__0__Impl : ( () ) ;
    public final void rule__SurveyTerminalTypes__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2618:1: ( ( () ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2619:1: ( () )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2619:1: ( () )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2620:1: ()
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRadioAction_5_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2621:1: ()
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2623:1: 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2633:1: rule__SurveyTerminalTypes__Group_5__1 : rule__SurveyTerminalTypes__Group_5__1__Impl rule__SurveyTerminalTypes__Group_5__2 ;
    public final void rule__SurveyTerminalTypes__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2637:1: ( rule__SurveyTerminalTypes__Group_5__1__Impl rule__SurveyTerminalTypes__Group_5__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2638:2: rule__SurveyTerminalTypes__Group_5__1__Impl rule__SurveyTerminalTypes__Group_5__2
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__1__Impl_in_rule__SurveyTerminalTypes__Group_5__15203);
            rule__SurveyTerminalTypes__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__2_in_rule__SurveyTerminalTypes__Group_5__15206);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2645:1: rule__SurveyTerminalTypes__Group_5__1__Impl : ( ( rule__SurveyTerminalTypes__NameAssignment_5_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2649:1: ( ( ( rule__SurveyTerminalTypes__NameAssignment_5_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2650:1: ( ( rule__SurveyTerminalTypes__NameAssignment_5_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2650:1: ( ( rule__SurveyTerminalTypes__NameAssignment_5_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2651:1: ( rule__SurveyTerminalTypes__NameAssignment_5_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_5_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2652:1: ( rule__SurveyTerminalTypes__NameAssignment_5_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2652:2: rule__SurveyTerminalTypes__NameAssignment_5_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__NameAssignment_5_1_in_rule__SurveyTerminalTypes__Group_5__1__Impl5233);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2662:1: rule__SurveyTerminalTypes__Group_5__2 : rule__SurveyTerminalTypes__Group_5__2__Impl rule__SurveyTerminalTypes__Group_5__3 ;
    public final void rule__SurveyTerminalTypes__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2666:1: ( rule__SurveyTerminalTypes__Group_5__2__Impl rule__SurveyTerminalTypes__Group_5__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2667:2: rule__SurveyTerminalTypes__Group_5__2__Impl rule__SurveyTerminalTypes__Group_5__3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__2__Impl_in_rule__SurveyTerminalTypes__Group_5__25263);
            rule__SurveyTerminalTypes__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__3_in_rule__SurveyTerminalTypes__Group_5__25266);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2674:1: rule__SurveyTerminalTypes__Group_5__2__Impl : ( '{' ) ;
    public final void rule__SurveyTerminalTypes__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2678:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2679:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2679:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2680:1: '{'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftCurlyBracketKeyword_5_2()); 
            match(input,12,FOLLOW_12_in_rule__SurveyTerminalTypes__Group_5__2__Impl5294); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2693:1: rule__SurveyTerminalTypes__Group_5__3 : rule__SurveyTerminalTypes__Group_5__3__Impl rule__SurveyTerminalTypes__Group_5__4 ;
    public final void rule__SurveyTerminalTypes__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2697:1: ( rule__SurveyTerminalTypes__Group_5__3__Impl rule__SurveyTerminalTypes__Group_5__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2698:2: rule__SurveyTerminalTypes__Group_5__3__Impl rule__SurveyTerminalTypes__Group_5__4
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__3__Impl_in_rule__SurveyTerminalTypes__Group_5__35325);
            rule__SurveyTerminalTypes__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__4_in_rule__SurveyTerminalTypes__Group_5__35328);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2705:1: rule__SurveyTerminalTypes__Group_5__3__Impl : ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )* ) ) ;
    public final void rule__SurveyTerminalTypes__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2709:1: ( ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )* ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2710:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2710:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2711:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2711:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2712:1: ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_5_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2713:1: ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2713:2: rule__SurveyTerminalTypes__AnswerAssignment_5_3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_5_3_in_rule__SurveyTerminalTypes__Group_5__3__Impl5357);
            rule__SurveyTerminalTypes__AnswerAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_5_3()); 

            }

            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2716:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2717:1: ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )*
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_5_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2718:1: ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2718:2: rule__SurveyTerminalTypes__AnswerAssignment_5_3
            	    {
            	    pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_5_3_in_rule__SurveyTerminalTypes__Group_5__3__Impl5369);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2729:1: rule__SurveyTerminalTypes__Group_5__4 : rule__SurveyTerminalTypes__Group_5__4__Impl ;
    public final void rule__SurveyTerminalTypes__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2733:1: ( rule__SurveyTerminalTypes__Group_5__4__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2734:2: rule__SurveyTerminalTypes__Group_5__4__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__4__Impl_in_rule__SurveyTerminalTypes__Group_5__45402);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2740:1: rule__SurveyTerminalTypes__Group_5__4__Impl : ( '}' ) ;
    public final void rule__SurveyTerminalTypes__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2744:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2745:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2745:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2746:1: '}'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,14,FOLLOW_14_in_rule__SurveyTerminalTypes__Group_5__4__Impl5430); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2770:1: rule__Survey__QuestionnaireAssignment : ( ruleQuestionnaire ) ;
    public final void rule__Survey__QuestionnaireAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2774:1: ( ( ruleQuestionnaire ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2775:1: ( ruleQuestionnaire )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2775:1: ( ruleQuestionnaire )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2776:1: ruleQuestionnaire
            {
             before(grammarAccess.getSurveyAccess().getQuestionnaireQuestionnaireParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQuestionnaire_in_rule__Survey__QuestionnaireAssignment5476);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2785:1: rule__Questionnaire__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Questionnaire__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2789:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2790:1: ( RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2790:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2791:1: RULE_STRING
            {
             before(grammarAccess.getQuestionnaireAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Questionnaire__NameAssignment_15507); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2800:1: rule__Questionnaire__IdAssignment_4 : ( ruleIdentifier ) ;
    public final void rule__Questionnaire__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2804:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2805:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2805:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2806:1: ruleIdentifier
            {
             before(grammarAccess.getQuestionnaireAccess().getIdIdentifierParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Questionnaire__IdAssignment_45538);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2815:1: rule__Questionnaire__PartAssignment_5 : ( rulePart ) ;
    public final void rule__Questionnaire__PartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2819:1: ( ( rulePart ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2820:1: ( rulePart )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2820:1: ( rulePart )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2821:1: rulePart
            {
             before(grammarAccess.getQuestionnaireAccess().getPartPartParserRuleCall_5_0()); 
            pushFollow(FOLLOW_rulePart_in_rule__Questionnaire__PartAssignment_55569);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2830:1: rule__Part__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Part__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2834:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2835:1: ( RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2835:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2836:1: RULE_STRING
            {
             before(grammarAccess.getPartAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Part__NameAssignment_15600); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2845:1: rule__Part__IdAssignment_4 : ( ruleIdentifier ) ;
    public final void rule__Part__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2849:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2850:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2850:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2851:1: ruleIdentifier
            {
             before(grammarAccess.getPartAccess().getIdIdentifierParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Part__IdAssignment_45631);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2860:1: rule__Part__QuestionAssignment_5 : ( ruleQuestion ) ;
    public final void rule__Part__QuestionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2864:1: ( ( ruleQuestion ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2865:1: ( ruleQuestion )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2865:1: ( ruleQuestion )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2866:1: ruleQuestion
            {
             before(grammarAccess.getPartAccess().getQuestionQuestionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Part__QuestionAssignment_55662);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2875:1: rule__Question__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Question__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2879:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2880:1: ( RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2880:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2881:1: RULE_STRING
            {
             before(grammarAccess.getQuestionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Question__NameAssignment_15693); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2890:1: rule__Question__IdAssignment_4 : ( ruleIdentifier ) ;
    public final void rule__Question__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2894:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2895:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2895:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2896:1: ruleIdentifier
            {
             before(grammarAccess.getQuestionAccess().getIdIdentifierParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Question__IdAssignment_45724);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2905:1: rule__Question__MandatoryAssignment_5 : ( ( 'Mandatory Field' ) ) ;
    public final void rule__Question__MandatoryAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2909:1: ( ( ( 'Mandatory Field' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2910:1: ( ( 'Mandatory Field' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2910:1: ( ( 'Mandatory Field' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2911:1: ( 'Mandatory Field' )
            {
             before(grammarAccess.getQuestionAccess().getMandatoryMandatoryFieldKeyword_5_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2912:1: ( 'Mandatory Field' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2913:1: 'Mandatory Field'
            {
             before(grammarAccess.getQuestionAccess().getMandatoryMandatoryFieldKeyword_5_0()); 
            match(input,27,FOLLOW_27_in_rule__Question__MandatoryAssignment_55760); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2928:1: rule__Question__QuestionTypeAssignment_7 : ( ruleSurveyTerminalTypes ) ;
    public final void rule__Question__QuestionTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2932:1: ( ( ruleSurveyTerminalTypes ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2933:1: ( ruleSurveyTerminalTypes )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2933:1: ( ruleSurveyTerminalTypes )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2934:1: ruleSurveyTerminalTypes
            {
             before(grammarAccess.getQuestionAccess().getQuestionTypeSurveyTerminalTypesParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleSurveyTerminalTypes_in_rule__Question__QuestionTypeAssignment_75799);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2943:1: rule__MatrixQuestion__IdAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__MatrixQuestion__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2947:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2948:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2948:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2949:1: ruleIdentifier
            {
             before(grammarAccess.getMatrixQuestionAccess().getIdIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__MatrixQuestion__IdAssignment_15830);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2958:1: rule__MatrixQuestion__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__MatrixQuestion__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2962:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2963:1: ( RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2963:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2964:1: RULE_STRING
            {
             before(grammarAccess.getMatrixQuestionAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MatrixQuestion__NameAssignment_35861); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2973:1: rule__Answer__IdAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__Answer__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2977:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2978:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2978:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2979:1: ruleIdentifier
            {
             before(grammarAccess.getAnswerAccess().getIdIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Answer__IdAssignment_15892);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2988:1: rule__Answer__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Answer__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2992:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2993:1: ( RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2993:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2994:1: RULE_STRING
            {
             before(grammarAccess.getAnswerAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Answer__NameAssignment_35923); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3003:1: rule__SurveyTerminalTypes__NameAssignment_0_1 : ( ( 'TextLine' ) ) ;
    public final void rule__SurveyTerminalTypes__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3007:1: ( ( ( 'TextLine' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3008:1: ( ( 'TextLine' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3008:1: ( ( 'TextLine' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3009:1: ( 'TextLine' )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameTextLineKeyword_0_1_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3010:1: ( 'TextLine' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3011:1: 'TextLine'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameTextLineKeyword_0_1_0()); 
            match(input,28,FOLLOW_28_in_rule__SurveyTerminalTypes__NameAssignment_0_15959); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3026:1: rule__SurveyTerminalTypes__LengthAssignment_0_3 : ( RULE_INT ) ;
    public final void rule__SurveyTerminalTypes__LengthAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3030:1: ( ( RULE_INT ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3031:1: ( RULE_INT )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3031:1: ( RULE_INT )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3032:1: RULE_INT
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLengthINTTerminalRuleCall_0_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SurveyTerminalTypes__LengthAssignment_0_35998); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3041:1: rule__SurveyTerminalTypes__NameAssignment_1_1 : ( ( 'TextBlock' ) ) ;
    public final void rule__SurveyTerminalTypes__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3045:1: ( ( ( 'TextBlock' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3046:1: ( ( 'TextBlock' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3046:1: ( ( 'TextBlock' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3047:1: ( 'TextBlock' )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameTextBlockKeyword_1_1_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3048:1: ( 'TextBlock' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3049:1: 'TextBlock'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameTextBlockKeyword_1_1_0()); 
            match(input,29,FOLLOW_29_in_rule__SurveyTerminalTypes__NameAssignment_1_16034); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3064:1: rule__SurveyTerminalTypes__LengthAssignment_1_3 : ( RULE_INT ) ;
    public final void rule__SurveyTerminalTypes__LengthAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3068:1: ( ( RULE_INT ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3069:1: ( RULE_INT )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3069:1: ( RULE_INT )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3070:1: RULE_INT
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLengthINTTerminalRuleCall_1_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SurveyTerminalTypes__LengthAssignment_1_36073); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3079:1: rule__SurveyTerminalTypes__NameAssignment_2_1 : ( ( 'Matrix' ) ) ;
    public final void rule__SurveyTerminalTypes__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3083:1: ( ( ( 'Matrix' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3084:1: ( ( 'Matrix' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3084:1: ( ( 'Matrix' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3085:1: ( 'Matrix' )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameMatrixKeyword_2_1_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3086:1: ( 'Matrix' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3087:1: 'Matrix'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameMatrixKeyword_2_1_0()); 
            match(input,30,FOLLOW_30_in_rule__SurveyTerminalTypes__NameAssignment_2_16109); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3102:1: rule__SurveyTerminalTypes__AnswerAssignment_2_5 : ( ruleAnswer ) ;
    public final void rule__SurveyTerminalTypes__AnswerAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3106:1: ( ( ruleAnswer ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3107:1: ( ruleAnswer )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3107:1: ( ruleAnswer )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3108:1: ruleAnswer
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_2_5_0()); 
            pushFollow(FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_2_56148);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3117:1: rule__SurveyTerminalTypes__AnswerAssignment_2_6_1 : ( ruleAnswer ) ;
    public final void rule__SurveyTerminalTypes__AnswerAssignment_2_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3121:1: ( ( ruleAnswer ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3122:1: ( ruleAnswer )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3122:1: ( ruleAnswer )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3123:1: ruleAnswer
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_2_6_1_0()); 
            pushFollow(FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_2_6_16179);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3132:1: rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10 : ( ruleMatrixQuestion ) ;
    public final void rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3136:1: ( ( ruleMatrixQuestion ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3137:1: ( ruleMatrixQuestion )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3137:1: ( ruleMatrixQuestion )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3138:1: ruleMatrixQuestion
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getMatrixQuestionMatrixQuestionParserRuleCall_2_10_0()); 
            pushFollow(FOLLOW_ruleMatrixQuestion_in_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_106210);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3147:1: rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1 : ( ruleMatrixQuestion ) ;
    public final void rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3151:1: ( ( ruleMatrixQuestion ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3152:1: ( ruleMatrixQuestion )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3152:1: ( ruleMatrixQuestion )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3153:1: ruleMatrixQuestion
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getMatrixQuestionMatrixQuestionParserRuleCall_2_11_1_0()); 
            pushFollow(FOLLOW_ruleMatrixQuestion_in_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_16241);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3162:1: rule__SurveyTerminalTypes__NameAssignment_3_1 : ( ( 'ComboBox' ) ) ;
    public final void rule__SurveyTerminalTypes__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3166:1: ( ( ( 'ComboBox' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3167:1: ( ( 'ComboBox' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3167:1: ( ( 'ComboBox' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3168:1: ( 'ComboBox' )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameComboBoxKeyword_3_1_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3169:1: ( 'ComboBox' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3170:1: 'ComboBox'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameComboBoxKeyword_3_1_0()); 
            match(input,31,FOLLOW_31_in_rule__SurveyTerminalTypes__NameAssignment_3_16277); 
             after(grammarAccess.getSurveyTerminalTypesAccess().getNameComboBoxKeyword_3_1_0()); 

            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getNameComboBoxKeyword_3_1_0()); 

            }


            }

        }
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3185:1: rule__SurveyTerminalTypes__AnswerAssignment_3_3 : ( ruleAnswer ) ;
    public final void rule__SurveyTerminalTypes__AnswerAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3189:1: ( ( ruleAnswer ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3190:1: ( ruleAnswer )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3190:1: ( ruleAnswer )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3191:1: ruleAnswer
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_3_36316);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3200:1: rule__SurveyTerminalTypes__NameAssignment_4_1 : ( ( 'DropDown' ) ) ;
    public final void rule__SurveyTerminalTypes__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3204:1: ( ( ( 'DropDown' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3205:1: ( ( 'DropDown' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3205:1: ( ( 'DropDown' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3206:1: ( 'DropDown' )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameDropDownKeyword_4_1_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3207:1: ( 'DropDown' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3208:1: 'DropDown'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameDropDownKeyword_4_1_0()); 
            match(input,32,FOLLOW_32_in_rule__SurveyTerminalTypes__NameAssignment_4_16352); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3223:1: rule__SurveyTerminalTypes__AnswerAssignment_4_3 : ( ruleAnswer ) ;
    public final void rule__SurveyTerminalTypes__AnswerAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3227:1: ( ( ruleAnswer ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3228:1: ( ruleAnswer )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3228:1: ( ruleAnswer )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3229:1: ruleAnswer
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_4_36391);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3238:1: rule__SurveyTerminalTypes__NameAssignment_5_1 : ( ( 'Radio' ) ) ;
    public final void rule__SurveyTerminalTypes__NameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3242:1: ( ( ( 'Radio' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3243:1: ( ( 'Radio' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3243:1: ( ( 'Radio' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3244:1: ( 'Radio' )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameRadioKeyword_5_1_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3245:1: ( 'Radio' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3246:1: 'Radio'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameRadioKeyword_5_1_0()); 
            match(input,33,FOLLOW_33_in_rule__SurveyTerminalTypes__NameAssignment_5_16427); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3261:1: rule__SurveyTerminalTypes__AnswerAssignment_5_3 : ( ruleAnswer ) ;
    public final void rule__SurveyTerminalTypes__AnswerAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3265:1: ( ( ruleAnswer ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3266:1: ( ruleAnswer )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3266:1: ( ruleAnswer )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3267:1: ruleAnswer
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_5_36466);
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
    public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnswer385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__0_in_ruleAnswer411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSurveyTerminalTypes_in_entryRuleSurveyTerminalTypes438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurveyTerminalTypes445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Alternatives_in_ruleSurveyTerminalTypes471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Alternatives_in_ruleIdentifier531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__0_in_rule__SurveyTerminalTypes__Alternatives567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__0_in_rule__SurveyTerminalTypes__Alternatives585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__0_in_rule__SurveyTerminalTypes__Alternatives603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__0_in_rule__SurveyTerminalTypes__Alternatives621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__0_in_rule__SurveyTerminalTypes__Alternatives639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__0_in_rule__SurveyTerminalTypes__Alternatives657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Identifier__Alternatives690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Identifier__Alternatives707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Identifier__Alternatives724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__0__Impl_in_rule__Questionnaire__Group__0754 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__1_in_rule__Questionnaire__Group__0757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Questionnaire__Group__0__Impl785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__1__Impl_in_rule__Questionnaire__Group__1816 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__2_in_rule__Questionnaire__Group__1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__NameAssignment_1_in_rule__Questionnaire__Group__1__Impl846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__2__Impl_in_rule__Questionnaire__Group__2876 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__3_in_rule__Questionnaire__Group__2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Questionnaire__Group__2__Impl907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__3__Impl_in_rule__Questionnaire__Group__3938 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__4_in_rule__Questionnaire__Group__3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Questionnaire__Group__3__Impl969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__4__Impl_in_rule__Questionnaire__Group__41000 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__5_in_rule__Questionnaire__Group__41003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__IdAssignment_4_in_rule__Questionnaire__Group__4__Impl1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__5__Impl_in_rule__Questionnaire__Group__51060 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__6_in_rule__Questionnaire__Group__51063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__PartAssignment_5_in_rule__Questionnaire__Group__5__Impl1092 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Questionnaire__PartAssignment_5_in_rule__Questionnaire__Group__5__Impl1104 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__6__Impl_in_rule__Questionnaire__Group__61137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Questionnaire__Group__6__Impl1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__0__Impl_in_rule__Part__Group__01210 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Part__Group__1_in_rule__Part__Group__01213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Part__Group__0__Impl1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__1__Impl_in_rule__Part__Group__11272 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Part__Group__2_in_rule__Part__Group__11275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__NameAssignment_1_in_rule__Part__Group__1__Impl1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__2__Impl_in_rule__Part__Group__21332 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Part__Group__3_in_rule__Part__Group__21335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Part__Group__2__Impl1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__3__Impl_in_rule__Part__Group__31394 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Part__Group__4_in_rule__Part__Group__31397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Part__Group__3__Impl1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__4__Impl_in_rule__Part__Group__41456 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Part__Group__5_in_rule__Part__Group__41459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__IdAssignment_4_in_rule__Part__Group__4__Impl1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__5__Impl_in_rule__Part__Group__51516 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Part__Group__6_in_rule__Part__Group__51519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__QuestionAssignment_5_in_rule__Part__Group__5__Impl1548 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Part__QuestionAssignment_5_in_rule__Part__Group__5__Impl1560 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Part__Group__6__Impl_in_rule__Part__Group__61593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Part__Group__6__Impl1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__01666 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Question__Group__1_in_rule__Question__Group__01669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Question__Group__0__Impl1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__11728 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Question__Group__2_in_rule__Question__Group__11731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__NameAssignment_1_in_rule__Question__Group__1__Impl1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__21788 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Question__Group__3_in_rule__Question__Group__21791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Question__Group__2__Impl1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__31850 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Question__Group__4_in_rule__Question__Group__31853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Question__Group__3__Impl1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41912 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__IdAssignment_4_in_rule__Question__Group__4__Impl1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__51972 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_rule__Question__Group__6_in_rule__Question__Group__51975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__MandatoryAssignment_5_in_rule__Question__Group__5__Impl2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__62033 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_rule__Question__Group__7_in_rule__Question__Group__62036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Question__Group__6__Impl2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__7__Impl_in_rule__Question__Group__72095 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Question__Group__8_in_rule__Question__Group__72098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__QuestionTypeAssignment_7_in_rule__Question__Group__7__Impl2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__8__Impl_in_rule__Question__Group__82155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Question__Group__8__Impl2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__0__Impl_in_rule__MatrixQuestion__Group__02232 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__1_in_rule__MatrixQuestion__Group__02235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MatrixQuestion__Group__0__Impl2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__1__Impl_in_rule__MatrixQuestion__Group__12294 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__2_in_rule__MatrixQuestion__Group__12297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__IdAssignment_1_in_rule__MatrixQuestion__Group__1__Impl2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__2__Impl_in_rule__MatrixQuestion__Group__22354 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__3_in_rule__MatrixQuestion__Group__22357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MatrixQuestion__Group__2__Impl2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__3__Impl_in_rule__MatrixQuestion__Group__32416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__NameAssignment_3_in_rule__MatrixQuestion__Group__3__Impl2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__02481 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__02484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Answer__Group__0__Impl2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__12543 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__12546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__IdAssignment_1_in_rule__Answer__Group__1__Impl2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__22603 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__22606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Answer__Group__2__Impl2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__32665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__NameAssignment_3_in_rule__Answer__Group__3__Impl2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__0__Impl_in_rule__SurveyTerminalTypes__Group_0__02730 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__1_in_rule__SurveyTerminalTypes__Group_0__02733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__1__Impl_in_rule__SurveyTerminalTypes__Group_0__12791 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__2_in_rule__SurveyTerminalTypes__Group_0__12794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__NameAssignment_0_1_in_rule__SurveyTerminalTypes__Group_0__1__Impl2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__2__Impl_in_rule__SurveyTerminalTypes__Group_0__22851 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__3_in_rule__SurveyTerminalTypes__Group_0__22854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SurveyTerminalTypes__Group_0__2__Impl2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__3__Impl_in_rule__SurveyTerminalTypes__Group_0__32913 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__4_in_rule__SurveyTerminalTypes__Group_0__32916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__LengthAssignment_0_3_in_rule__SurveyTerminalTypes__Group_0__3__Impl2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__4__Impl_in_rule__SurveyTerminalTypes__Group_0__42973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SurveyTerminalTypes__Group_0__4__Impl3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__0__Impl_in_rule__SurveyTerminalTypes__Group_1__03042 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__1_in_rule__SurveyTerminalTypes__Group_1__03045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__1__Impl_in_rule__SurveyTerminalTypes__Group_1__13103 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__2_in_rule__SurveyTerminalTypes__Group_1__13106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__NameAssignment_1_1_in_rule__SurveyTerminalTypes__Group_1__1__Impl3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__2__Impl_in_rule__SurveyTerminalTypes__Group_1__23163 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__3_in_rule__SurveyTerminalTypes__Group_1__23166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SurveyTerminalTypes__Group_1__2__Impl3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__3__Impl_in_rule__SurveyTerminalTypes__Group_1__33225 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__4_in_rule__SurveyTerminalTypes__Group_1__33228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__LengthAssignment_1_3_in_rule__SurveyTerminalTypes__Group_1__3__Impl3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__4__Impl_in_rule__SurveyTerminalTypes__Group_1__43285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SurveyTerminalTypes__Group_1__4__Impl3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__0__Impl_in_rule__SurveyTerminalTypes__Group_2__03354 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__1_in_rule__SurveyTerminalTypes__Group_2__03357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__1__Impl_in_rule__SurveyTerminalTypes__Group_2__13415 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__2_in_rule__SurveyTerminalTypes__Group_2__13418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__NameAssignment_2_1_in_rule__SurveyTerminalTypes__Group_2__1__Impl3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__2__Impl_in_rule__SurveyTerminalTypes__Group_2__23475 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__3_in_rule__SurveyTerminalTypes__Group_2__23478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SurveyTerminalTypes__Group_2__2__Impl3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__3__Impl_in_rule__SurveyTerminalTypes__Group_2__33537 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__4_in_rule__SurveyTerminalTypes__Group_2__33540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SurveyTerminalTypes__Group_2__3__Impl3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__4__Impl_in_rule__SurveyTerminalTypes__Group_2__43599 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__5_in_rule__SurveyTerminalTypes__Group_2__43602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SurveyTerminalTypes__Group_2__4__Impl3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__5__Impl_in_rule__SurveyTerminalTypes__Group_2__53661 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__6_in_rule__SurveyTerminalTypes__Group_2__53664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_2_5_in_rule__SurveyTerminalTypes__Group_2__5__Impl3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__6__Impl_in_rule__SurveyTerminalTypes__Group_2__63721 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__7_in_rule__SurveyTerminalTypes__Group_2__63724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_6__0_in_rule__SurveyTerminalTypes__Group_2__6__Impl3751 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__7__Impl_in_rule__SurveyTerminalTypes__Group_2__73782 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__8_in_rule__SurveyTerminalTypes__Group_2__73785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SurveyTerminalTypes__Group_2__7__Impl3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__8__Impl_in_rule__SurveyTerminalTypes__Group_2__83844 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__9_in_rule__SurveyTerminalTypes__Group_2__83847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SurveyTerminalTypes__Group_2__8__Impl3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__9__Impl_in_rule__SurveyTerminalTypes__Group_2__93906 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__10_in_rule__SurveyTerminalTypes__Group_2__93909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SurveyTerminalTypes__Group_2__9__Impl3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__10__Impl_in_rule__SurveyTerminalTypes__Group_2__103968 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__11_in_rule__SurveyTerminalTypes__Group_2__103971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10_in_rule__SurveyTerminalTypes__Group_2__10__Impl3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__11__Impl_in_rule__SurveyTerminalTypes__Group_2__114028 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__12_in_rule__SurveyTerminalTypes__Group_2__114031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_11__0_in_rule__SurveyTerminalTypes__Group_2__11__Impl4058 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__12__Impl_in_rule__SurveyTerminalTypes__Group_2__124089 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__13_in_rule__SurveyTerminalTypes__Group_2__124092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SurveyTerminalTypes__Group_2__12__Impl4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__13__Impl_in_rule__SurveyTerminalTypes__Group_2__134151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SurveyTerminalTypes__Group_2__13__Impl4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_6__0__Impl_in_rule__SurveyTerminalTypes__Group_2_6__04238 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_6__1_in_rule__SurveyTerminalTypes__Group_2_6__04241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SurveyTerminalTypes__Group_2_6__0__Impl4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_6__1__Impl_in_rule__SurveyTerminalTypes__Group_2_6__14300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_2_6_1_in_rule__SurveyTerminalTypes__Group_2_6__1__Impl4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_11__0__Impl_in_rule__SurveyTerminalTypes__Group_2_11__04361 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_11__1_in_rule__SurveyTerminalTypes__Group_2_11__04364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SurveyTerminalTypes__Group_2_11__0__Impl4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_11__1__Impl_in_rule__SurveyTerminalTypes__Group_2_11__14423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1_in_rule__SurveyTerminalTypes__Group_2_11__1__Impl4450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__0__Impl_in_rule__SurveyTerminalTypes__Group_3__04484 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__1_in_rule__SurveyTerminalTypes__Group_3__04487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__1__Impl_in_rule__SurveyTerminalTypes__Group_3__14545 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__2_in_rule__SurveyTerminalTypes__Group_3__14548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__NameAssignment_3_1_in_rule__SurveyTerminalTypes__Group_3__1__Impl4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__2__Impl_in_rule__SurveyTerminalTypes__Group_3__24605 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__3_in_rule__SurveyTerminalTypes__Group_3__24608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SurveyTerminalTypes__Group_3__2__Impl4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__3__Impl_in_rule__SurveyTerminalTypes__Group_3__34667 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__4_in_rule__SurveyTerminalTypes__Group_3__34670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_3_3_in_rule__SurveyTerminalTypes__Group_3__3__Impl4699 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_3_3_in_rule__SurveyTerminalTypes__Group_3__3__Impl4711 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__4__Impl_in_rule__SurveyTerminalTypes__Group_3__44744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SurveyTerminalTypes__Group_3__4__Impl4772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__0__Impl_in_rule__SurveyTerminalTypes__Group_4__04813 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__1_in_rule__SurveyTerminalTypes__Group_4__04816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__1__Impl_in_rule__SurveyTerminalTypes__Group_4__14874 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__2_in_rule__SurveyTerminalTypes__Group_4__14877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__NameAssignment_4_1_in_rule__SurveyTerminalTypes__Group_4__1__Impl4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__2__Impl_in_rule__SurveyTerminalTypes__Group_4__24934 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__3_in_rule__SurveyTerminalTypes__Group_4__24937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SurveyTerminalTypes__Group_4__2__Impl4965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__3__Impl_in_rule__SurveyTerminalTypes__Group_4__34996 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__4_in_rule__SurveyTerminalTypes__Group_4__34999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_4_3_in_rule__SurveyTerminalTypes__Group_4__3__Impl5028 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_4_3_in_rule__SurveyTerminalTypes__Group_4__3__Impl5040 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__4__Impl_in_rule__SurveyTerminalTypes__Group_4__45073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SurveyTerminalTypes__Group_4__4__Impl5101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__0__Impl_in_rule__SurveyTerminalTypes__Group_5__05142 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__1_in_rule__SurveyTerminalTypes__Group_5__05145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__1__Impl_in_rule__SurveyTerminalTypes__Group_5__15203 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__2_in_rule__SurveyTerminalTypes__Group_5__15206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__NameAssignment_5_1_in_rule__SurveyTerminalTypes__Group_5__1__Impl5233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__2__Impl_in_rule__SurveyTerminalTypes__Group_5__25263 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__3_in_rule__SurveyTerminalTypes__Group_5__25266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SurveyTerminalTypes__Group_5__2__Impl5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__3__Impl_in_rule__SurveyTerminalTypes__Group_5__35325 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__4_in_rule__SurveyTerminalTypes__Group_5__35328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_5_3_in_rule__SurveyTerminalTypes__Group_5__3__Impl5357 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_5_3_in_rule__SurveyTerminalTypes__Group_5__3__Impl5369 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__4__Impl_in_rule__SurveyTerminalTypes__Group_5__45402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SurveyTerminalTypes__Group_5__4__Impl5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_rule__Survey__QuestionnaireAssignment5476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Questionnaire__NameAssignment_15507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Questionnaire__IdAssignment_45538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_rule__Questionnaire__PartAssignment_55569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Part__NameAssignment_15600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Part__IdAssignment_45631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Part__QuestionAssignment_55662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Question__NameAssignment_15693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Question__IdAssignment_45724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Question__MandatoryAssignment_55760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSurveyTerminalTypes_in_rule__Question__QuestionTypeAssignment_75799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__MatrixQuestion__IdAssignment_15830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MatrixQuestion__NameAssignment_35861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Answer__IdAssignment_15892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Answer__NameAssignment_35923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SurveyTerminalTypes__NameAssignment_0_15959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SurveyTerminalTypes__LengthAssignment_0_35998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SurveyTerminalTypes__NameAssignment_1_16034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SurveyTerminalTypes__LengthAssignment_1_36073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SurveyTerminalTypes__NameAssignment_2_16109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_2_56148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_2_6_16179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixQuestion_in_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_106210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixQuestion_in_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_16241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SurveyTerminalTypes__NameAssignment_3_16277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_3_36316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SurveyTerminalTypes__NameAssignment_4_16352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_4_36391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SurveyTerminalTypes__NameAssignment_5_16427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_5_36466 = new BitSet(new long[]{0x0000000000000002L});

}