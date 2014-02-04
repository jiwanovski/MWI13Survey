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


    // $ANTLR start "entryRuleMatrixScale"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:207:1: entryRuleMatrixScale : ruleMatrixScale EOF ;
    public final void entryRuleMatrixScale() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:208:1: ( ruleMatrixScale EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:209:1: ruleMatrixScale EOF
            {
             before(grammarAccess.getMatrixScaleRule()); 
            pushFollow(FOLLOW_ruleMatrixScale_in_entryRuleMatrixScale378);
            ruleMatrixScale();

            state._fsp--;

             after(grammarAccess.getMatrixScaleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrixScale385); 

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
    // $ANTLR end "entryRuleMatrixScale"


    // $ANTLR start "ruleMatrixScale"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:216:1: ruleMatrixScale : ( ( rule__MatrixScale__NameAssignment ) ) ;
    public final void ruleMatrixScale() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:220:2: ( ( ( rule__MatrixScale__NameAssignment ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:221:1: ( ( rule__MatrixScale__NameAssignment ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:221:1: ( ( rule__MatrixScale__NameAssignment ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:222:1: ( rule__MatrixScale__NameAssignment )
            {
             before(grammarAccess.getMatrixScaleAccess().getNameAssignment()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:223:1: ( rule__MatrixScale__NameAssignment )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:223:2: rule__MatrixScale__NameAssignment
            {
            pushFollow(FOLLOW_rule__MatrixScale__NameAssignment_in_ruleMatrixScale411);
            rule__MatrixScale__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMatrixScaleAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatrixScale"


    // $ANTLR start "entryRuleAnswer"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:235:1: entryRuleAnswer : ruleAnswer EOF ;
    public final void entryRuleAnswer() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:236:1: ( ruleAnswer EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:237:1: ruleAnswer EOF
            {
             before(grammarAccess.getAnswerRule()); 
            pushFollow(FOLLOW_ruleAnswer_in_entryRuleAnswer438);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getAnswerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnswer445); 

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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:244:1: ruleAnswer : ( ( rule__Answer__Group__0 ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:248:2: ( ( ( rule__Answer__Group__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:249:1: ( ( rule__Answer__Group__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:249:1: ( ( rule__Answer__Group__0 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:250:1: ( rule__Answer__Group__0 )
            {
             before(grammarAccess.getAnswerAccess().getGroup()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:251:1: ( rule__Answer__Group__0 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:251:2: rule__Answer__Group__0
            {
            pushFollow(FOLLOW_rule__Answer__Group__0_in_ruleAnswer471);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:263:1: entryRuleSurveyTerminalTypes : ruleSurveyTerminalTypes EOF ;
    public final void entryRuleSurveyTerminalTypes() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:264:1: ( ruleSurveyTerminalTypes EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:265:1: ruleSurveyTerminalTypes EOF
            {
             before(grammarAccess.getSurveyTerminalTypesRule()); 
            pushFollow(FOLLOW_ruleSurveyTerminalTypes_in_entryRuleSurveyTerminalTypes498);
            ruleSurveyTerminalTypes();

            state._fsp--;

             after(grammarAccess.getSurveyTerminalTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSurveyTerminalTypes505); 

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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:272:1: ruleSurveyTerminalTypes : ( ( rule__SurveyTerminalTypes__Alternatives ) ) ;
    public final void ruleSurveyTerminalTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:276:2: ( ( ( rule__SurveyTerminalTypes__Alternatives ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:277:1: ( ( rule__SurveyTerminalTypes__Alternatives ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:277:1: ( ( rule__SurveyTerminalTypes__Alternatives ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:278:1: ( rule__SurveyTerminalTypes__Alternatives )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAlternatives()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:279:1: ( rule__SurveyTerminalTypes__Alternatives )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:279:2: rule__SurveyTerminalTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Alternatives_in_ruleSurveyTerminalTypes531);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:291:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:292:1: ( ruleIdentifier EOF )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:293:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier558);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier565); 

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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:300:1: ruleIdentifier : ( ( rule__Identifier__Alternatives ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:304:2: ( ( ( rule__Identifier__Alternatives ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:305:1: ( ( rule__Identifier__Alternatives ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:305:1: ( ( rule__Identifier__Alternatives ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:306:1: ( rule__Identifier__Alternatives )
            {
             before(grammarAccess.getIdentifierAccess().getAlternatives()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:307:1: ( rule__Identifier__Alternatives )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:307:2: rule__Identifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Identifier__Alternatives_in_ruleIdentifier591);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:319:1: rule__SurveyTerminalTypes__Alternatives : ( ( ( rule__SurveyTerminalTypes__Group_0__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_1__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_2__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_3__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_4__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_5__0 ) ) );
    public final void rule__SurveyTerminalTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:323:1: ( ( ( rule__SurveyTerminalTypes__Group_0__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_1__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_2__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_3__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_4__0 ) ) | ( ( rule__SurveyTerminalTypes__Group_5__0 ) ) )
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
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:324:1: ( ( rule__SurveyTerminalTypes__Group_0__0 ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:324:1: ( ( rule__SurveyTerminalTypes__Group_0__0 ) )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:325:1: ( rule__SurveyTerminalTypes__Group_0__0 )
                    {
                     before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_0()); 
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:326:1: ( rule__SurveyTerminalTypes__Group_0__0 )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:326:2: rule__SurveyTerminalTypes__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__0_in_rule__SurveyTerminalTypes__Alternatives627);
                    rule__SurveyTerminalTypes__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyTerminalTypesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:330:6: ( ( rule__SurveyTerminalTypes__Group_1__0 ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:330:6: ( ( rule__SurveyTerminalTypes__Group_1__0 ) )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:331:1: ( rule__SurveyTerminalTypes__Group_1__0 )
                    {
                     before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_1()); 
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:332:1: ( rule__SurveyTerminalTypes__Group_1__0 )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:332:2: rule__SurveyTerminalTypes__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__0_in_rule__SurveyTerminalTypes__Alternatives645);
                    rule__SurveyTerminalTypes__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyTerminalTypesAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:336:6: ( ( rule__SurveyTerminalTypes__Group_2__0 ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:336:6: ( ( rule__SurveyTerminalTypes__Group_2__0 ) )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:337:1: ( rule__SurveyTerminalTypes__Group_2__0 )
                    {
                     before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_2()); 
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:338:1: ( rule__SurveyTerminalTypes__Group_2__0 )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:338:2: rule__SurveyTerminalTypes__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__0_in_rule__SurveyTerminalTypes__Alternatives663);
                    rule__SurveyTerminalTypes__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyTerminalTypesAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:342:6: ( ( rule__SurveyTerminalTypes__Group_3__0 ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:342:6: ( ( rule__SurveyTerminalTypes__Group_3__0 ) )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:343:1: ( rule__SurveyTerminalTypes__Group_3__0 )
                    {
                     before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_3()); 
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:344:1: ( rule__SurveyTerminalTypes__Group_3__0 )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:344:2: rule__SurveyTerminalTypes__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__0_in_rule__SurveyTerminalTypes__Alternatives681);
                    rule__SurveyTerminalTypes__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyTerminalTypesAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:348:6: ( ( rule__SurveyTerminalTypes__Group_4__0 ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:348:6: ( ( rule__SurveyTerminalTypes__Group_4__0 ) )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:349:1: ( rule__SurveyTerminalTypes__Group_4__0 )
                    {
                     before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_4()); 
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:350:1: ( rule__SurveyTerminalTypes__Group_4__0 )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:350:2: rule__SurveyTerminalTypes__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__0_in_rule__SurveyTerminalTypes__Alternatives699);
                    rule__SurveyTerminalTypes__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyTerminalTypesAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:354:6: ( ( rule__SurveyTerminalTypes__Group_5__0 ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:354:6: ( ( rule__SurveyTerminalTypes__Group_5__0 ) )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:355:1: ( rule__SurveyTerminalTypes__Group_5__0 )
                    {
                     before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_5()); 
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:356:1: ( rule__SurveyTerminalTypes__Group_5__0 )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:356:2: rule__SurveyTerminalTypes__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__0_in_rule__SurveyTerminalTypes__Alternatives717);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:365:1: rule__Identifier__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) );
    public final void rule__Identifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:369:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) )
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
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:370:1: ( RULE_ID )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:370:1: ( RULE_ID )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:371:1: RULE_ID
                    {
                     before(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Identifier__Alternatives750); 
                     after(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:376:6: ( RULE_STRING )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:376:6: ( RULE_STRING )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:377:1: RULE_STRING
                    {
                     before(grammarAccess.getIdentifierAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Identifier__Alternatives767); 
                     after(grammarAccess.getIdentifierAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:382:6: ( RULE_INT )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:382:6: ( RULE_INT )
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:383:1: RULE_INT
                    {
                     before(grammarAccess.getIdentifierAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Identifier__Alternatives784); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:395:1: rule__Questionnaire__Group__0 : rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 ;
    public final void rule__Questionnaire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:399:1: ( rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:400:2: rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__0__Impl_in_rule__Questionnaire__Group__0814);
            rule__Questionnaire__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__1_in_rule__Questionnaire__Group__0817);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:407:1: rule__Questionnaire__Group__0__Impl : ( 'Questionnaire:' ) ;
    public final void rule__Questionnaire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:411:1: ( ( 'Questionnaire:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:412:1: ( 'Questionnaire:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:412:1: ( 'Questionnaire:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:413:1: 'Questionnaire:'
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Questionnaire__Group__0__Impl845); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:426:1: rule__Questionnaire__Group__1 : rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 ;
    public final void rule__Questionnaire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:430:1: ( rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:431:2: rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__1__Impl_in_rule__Questionnaire__Group__1876);
            rule__Questionnaire__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__2_in_rule__Questionnaire__Group__1879);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:438:1: rule__Questionnaire__Group__1__Impl : ( ( rule__Questionnaire__NameAssignment_1 ) ) ;
    public final void rule__Questionnaire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:442:1: ( ( ( rule__Questionnaire__NameAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:443:1: ( ( rule__Questionnaire__NameAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:443:1: ( ( rule__Questionnaire__NameAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:444:1: ( rule__Questionnaire__NameAssignment_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getNameAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:445:1: ( rule__Questionnaire__NameAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:445:2: rule__Questionnaire__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Questionnaire__NameAssignment_1_in_rule__Questionnaire__Group__1__Impl906);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:455:1: rule__Questionnaire__Group__2 : rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 ;
    public final void rule__Questionnaire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:459:1: ( rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:460:2: rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__2__Impl_in_rule__Questionnaire__Group__2936);
            rule__Questionnaire__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__3_in_rule__Questionnaire__Group__2939);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:467:1: rule__Questionnaire__Group__2__Impl : ( '{' ) ;
    public final void rule__Questionnaire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:471:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:472:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:472:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:473:1: '{'
            {
             before(grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Questionnaire__Group__2__Impl967); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:486:1: rule__Questionnaire__Group__3 : rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 ;
    public final void rule__Questionnaire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:490:1: ( rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:491:2: rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__3__Impl_in_rule__Questionnaire__Group__3998);
            rule__Questionnaire__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__4_in_rule__Questionnaire__Group__31001);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:498:1: rule__Questionnaire__Group__3__Impl : ( 'Questionnaire-ID:' ) ;
    public final void rule__Questionnaire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:502:1: ( ( 'Questionnaire-ID:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:503:1: ( 'Questionnaire-ID:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:503:1: ( 'Questionnaire-ID:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:504:1: 'Questionnaire-ID:'
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionnaireIDKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Questionnaire__Group__3__Impl1029); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:517:1: rule__Questionnaire__Group__4 : rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5 ;
    public final void rule__Questionnaire__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:521:1: ( rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:522:2: rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__4__Impl_in_rule__Questionnaire__Group__41060);
            rule__Questionnaire__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__5_in_rule__Questionnaire__Group__41063);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:529:1: rule__Questionnaire__Group__4__Impl : ( ( rule__Questionnaire__IdAssignment_4 ) ) ;
    public final void rule__Questionnaire__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:533:1: ( ( ( rule__Questionnaire__IdAssignment_4 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:534:1: ( ( rule__Questionnaire__IdAssignment_4 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:534:1: ( ( rule__Questionnaire__IdAssignment_4 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:535:1: ( rule__Questionnaire__IdAssignment_4 )
            {
             before(grammarAccess.getQuestionnaireAccess().getIdAssignment_4()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:536:1: ( rule__Questionnaire__IdAssignment_4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:536:2: rule__Questionnaire__IdAssignment_4
            {
            pushFollow(FOLLOW_rule__Questionnaire__IdAssignment_4_in_rule__Questionnaire__Group__4__Impl1090);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:546:1: rule__Questionnaire__Group__5 : rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6 ;
    public final void rule__Questionnaire__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:550:1: ( rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:551:2: rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__5__Impl_in_rule__Questionnaire__Group__51120);
            rule__Questionnaire__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__6_in_rule__Questionnaire__Group__51123);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:558:1: rule__Questionnaire__Group__5__Impl : ( ( ( rule__Questionnaire__PartAssignment_5 ) ) ( ( rule__Questionnaire__PartAssignment_5 )* ) ) ;
    public final void rule__Questionnaire__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:562:1: ( ( ( ( rule__Questionnaire__PartAssignment_5 ) ) ( ( rule__Questionnaire__PartAssignment_5 )* ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:563:1: ( ( ( rule__Questionnaire__PartAssignment_5 ) ) ( ( rule__Questionnaire__PartAssignment_5 )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:563:1: ( ( ( rule__Questionnaire__PartAssignment_5 ) ) ( ( rule__Questionnaire__PartAssignment_5 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:564:1: ( ( rule__Questionnaire__PartAssignment_5 ) ) ( ( rule__Questionnaire__PartAssignment_5 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:564:1: ( ( rule__Questionnaire__PartAssignment_5 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:565:1: ( rule__Questionnaire__PartAssignment_5 )
            {
             before(grammarAccess.getQuestionnaireAccess().getPartAssignment_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:566:1: ( rule__Questionnaire__PartAssignment_5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:566:2: rule__Questionnaire__PartAssignment_5
            {
            pushFollow(FOLLOW_rule__Questionnaire__PartAssignment_5_in_rule__Questionnaire__Group__5__Impl1152);
            rule__Questionnaire__PartAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getPartAssignment_5()); 

            }

            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:569:1: ( ( rule__Questionnaire__PartAssignment_5 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:570:1: ( rule__Questionnaire__PartAssignment_5 )*
            {
             before(grammarAccess.getQuestionnaireAccess().getPartAssignment_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:571:1: ( rule__Questionnaire__PartAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:571:2: rule__Questionnaire__PartAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Questionnaire__PartAssignment_5_in_rule__Questionnaire__Group__5__Impl1164);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:582:1: rule__Questionnaire__Group__6 : rule__Questionnaire__Group__6__Impl ;
    public final void rule__Questionnaire__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:586:1: ( rule__Questionnaire__Group__6__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:587:2: rule__Questionnaire__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__6__Impl_in_rule__Questionnaire__Group__61197);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:593:1: rule__Questionnaire__Group__6__Impl : ( '}' ) ;
    public final void rule__Questionnaire__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:597:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:598:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:598:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:599:1: '}'
            {
             before(grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Questionnaire__Group__6__Impl1225); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:626:1: rule__Part__Group__0 : rule__Part__Group__0__Impl rule__Part__Group__1 ;
    public final void rule__Part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:630:1: ( rule__Part__Group__0__Impl rule__Part__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:631:2: rule__Part__Group__0__Impl rule__Part__Group__1
            {
            pushFollow(FOLLOW_rule__Part__Group__0__Impl_in_rule__Part__Group__01270);
            rule__Part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__1_in_rule__Part__Group__01273);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:638:1: rule__Part__Group__0__Impl : ( 'Part:' ) ;
    public final void rule__Part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:642:1: ( ( 'Part:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:643:1: ( 'Part:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:643:1: ( 'Part:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:644:1: 'Part:'
            {
             before(grammarAccess.getPartAccess().getPartKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Part__Group__0__Impl1301); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:657:1: rule__Part__Group__1 : rule__Part__Group__1__Impl rule__Part__Group__2 ;
    public final void rule__Part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:661:1: ( rule__Part__Group__1__Impl rule__Part__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:662:2: rule__Part__Group__1__Impl rule__Part__Group__2
            {
            pushFollow(FOLLOW_rule__Part__Group__1__Impl_in_rule__Part__Group__11332);
            rule__Part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__2_in_rule__Part__Group__11335);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:669:1: rule__Part__Group__1__Impl : ( ( rule__Part__NameAssignment_1 ) ) ;
    public final void rule__Part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:673:1: ( ( ( rule__Part__NameAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:674:1: ( ( rule__Part__NameAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:674:1: ( ( rule__Part__NameAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:675:1: ( rule__Part__NameAssignment_1 )
            {
             before(grammarAccess.getPartAccess().getNameAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:676:1: ( rule__Part__NameAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:676:2: rule__Part__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Part__NameAssignment_1_in_rule__Part__Group__1__Impl1362);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:686:1: rule__Part__Group__2 : rule__Part__Group__2__Impl rule__Part__Group__3 ;
    public final void rule__Part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:690:1: ( rule__Part__Group__2__Impl rule__Part__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:691:2: rule__Part__Group__2__Impl rule__Part__Group__3
            {
            pushFollow(FOLLOW_rule__Part__Group__2__Impl_in_rule__Part__Group__21392);
            rule__Part__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__3_in_rule__Part__Group__21395);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:698:1: rule__Part__Group__2__Impl : ( '{' ) ;
    public final void rule__Part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:702:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:703:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:703:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:704:1: '{'
            {
             before(grammarAccess.getPartAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Part__Group__2__Impl1423); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:717:1: rule__Part__Group__3 : rule__Part__Group__3__Impl rule__Part__Group__4 ;
    public final void rule__Part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:721:1: ( rule__Part__Group__3__Impl rule__Part__Group__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:722:2: rule__Part__Group__3__Impl rule__Part__Group__4
            {
            pushFollow(FOLLOW_rule__Part__Group__3__Impl_in_rule__Part__Group__31454);
            rule__Part__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__4_in_rule__Part__Group__31457);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:729:1: rule__Part__Group__3__Impl : ( 'Part-ID:' ) ;
    public final void rule__Part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:733:1: ( ( 'Part-ID:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:734:1: ( 'Part-ID:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:734:1: ( 'Part-ID:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:735:1: 'Part-ID:'
            {
             before(grammarAccess.getPartAccess().getPartIDKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Part__Group__3__Impl1485); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:748:1: rule__Part__Group__4 : rule__Part__Group__4__Impl rule__Part__Group__5 ;
    public final void rule__Part__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:752:1: ( rule__Part__Group__4__Impl rule__Part__Group__5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:753:2: rule__Part__Group__4__Impl rule__Part__Group__5
            {
            pushFollow(FOLLOW_rule__Part__Group__4__Impl_in_rule__Part__Group__41516);
            rule__Part__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__5_in_rule__Part__Group__41519);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:760:1: rule__Part__Group__4__Impl : ( ( rule__Part__IdAssignment_4 ) ) ;
    public final void rule__Part__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:764:1: ( ( ( rule__Part__IdAssignment_4 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:765:1: ( ( rule__Part__IdAssignment_4 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:765:1: ( ( rule__Part__IdAssignment_4 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:766:1: ( rule__Part__IdAssignment_4 )
            {
             before(grammarAccess.getPartAccess().getIdAssignment_4()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:767:1: ( rule__Part__IdAssignment_4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:767:2: rule__Part__IdAssignment_4
            {
            pushFollow(FOLLOW_rule__Part__IdAssignment_4_in_rule__Part__Group__4__Impl1546);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:777:1: rule__Part__Group__5 : rule__Part__Group__5__Impl rule__Part__Group__6 ;
    public final void rule__Part__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:781:1: ( rule__Part__Group__5__Impl rule__Part__Group__6 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:782:2: rule__Part__Group__5__Impl rule__Part__Group__6
            {
            pushFollow(FOLLOW_rule__Part__Group__5__Impl_in_rule__Part__Group__51576);
            rule__Part__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__6_in_rule__Part__Group__51579);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:789:1: rule__Part__Group__5__Impl : ( ( ( rule__Part__QuestionAssignment_5 ) ) ( ( rule__Part__QuestionAssignment_5 )* ) ) ;
    public final void rule__Part__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:793:1: ( ( ( ( rule__Part__QuestionAssignment_5 ) ) ( ( rule__Part__QuestionAssignment_5 )* ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:794:1: ( ( ( rule__Part__QuestionAssignment_5 ) ) ( ( rule__Part__QuestionAssignment_5 )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:794:1: ( ( ( rule__Part__QuestionAssignment_5 ) ) ( ( rule__Part__QuestionAssignment_5 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:795:1: ( ( rule__Part__QuestionAssignment_5 ) ) ( ( rule__Part__QuestionAssignment_5 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:795:1: ( ( rule__Part__QuestionAssignment_5 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:796:1: ( rule__Part__QuestionAssignment_5 )
            {
             before(grammarAccess.getPartAccess().getQuestionAssignment_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:797:1: ( rule__Part__QuestionAssignment_5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:797:2: rule__Part__QuestionAssignment_5
            {
            pushFollow(FOLLOW_rule__Part__QuestionAssignment_5_in_rule__Part__Group__5__Impl1608);
            rule__Part__QuestionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPartAccess().getQuestionAssignment_5()); 

            }

            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:800:1: ( ( rule__Part__QuestionAssignment_5 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:801:1: ( rule__Part__QuestionAssignment_5 )*
            {
             before(grammarAccess.getPartAccess().getQuestionAssignment_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:802:1: ( rule__Part__QuestionAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:802:2: rule__Part__QuestionAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Part__QuestionAssignment_5_in_rule__Part__Group__5__Impl1620);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:813:1: rule__Part__Group__6 : rule__Part__Group__6__Impl ;
    public final void rule__Part__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:817:1: ( rule__Part__Group__6__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:818:2: rule__Part__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Part__Group__6__Impl_in_rule__Part__Group__61653);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:824:1: rule__Part__Group__6__Impl : ( '}' ) ;
    public final void rule__Part__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:828:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:829:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:829:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:830:1: '}'
            {
             before(grammarAccess.getPartAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Part__Group__6__Impl1681); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:857:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:861:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:862:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__01726);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__1_in_rule__Question__Group__01729);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:869:1: rule__Question__Group__0__Impl : ( 'Question:' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:873:1: ( ( 'Question:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:874:1: ( 'Question:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:874:1: ( 'Question:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:875:1: 'Question:'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Question__Group__0__Impl1757); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:888:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:892:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:893:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__11788);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__2_in_rule__Question__Group__11791);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:900:1: rule__Question__Group__1__Impl : ( ( rule__Question__NameAssignment_1 ) ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:904:1: ( ( ( rule__Question__NameAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:905:1: ( ( rule__Question__NameAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:905:1: ( ( rule__Question__NameAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:906:1: ( rule__Question__NameAssignment_1 )
            {
             before(grammarAccess.getQuestionAccess().getNameAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:907:1: ( rule__Question__NameAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:907:2: rule__Question__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Question__NameAssignment_1_in_rule__Question__Group__1__Impl1818);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:917:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:921:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:922:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__21848);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__3_in_rule__Question__Group__21851);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:929:1: rule__Question__Group__2__Impl : ( '{' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:933:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:934:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:934:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:935:1: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Question__Group__2__Impl1879); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:948:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:952:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:953:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__31910);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__4_in_rule__Question__Group__31913);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:960:1: rule__Question__Group__3__Impl : ( 'Question-ID:' ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:964:1: ( ( 'Question-ID:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:965:1: ( 'Question-ID:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:965:1: ( 'Question-ID:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:966:1: 'Question-ID:'
            {
             before(grammarAccess.getQuestionAccess().getQuestionIDKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Question__Group__3__Impl1941); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:979:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:983:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:984:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41972);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41975);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:991:1: rule__Question__Group__4__Impl : ( ( rule__Question__IdAssignment_4 ) ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:995:1: ( ( ( rule__Question__IdAssignment_4 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:996:1: ( ( rule__Question__IdAssignment_4 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:996:1: ( ( rule__Question__IdAssignment_4 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:997:1: ( rule__Question__IdAssignment_4 )
            {
             before(grammarAccess.getQuestionAccess().getIdAssignment_4()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:998:1: ( rule__Question__IdAssignment_4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:998:2: rule__Question__IdAssignment_4
            {
            pushFollow(FOLLOW_rule__Question__IdAssignment_4_in_rule__Question__Group__4__Impl2002);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1008:1: rule__Question__Group__5 : rule__Question__Group__5__Impl rule__Question__Group__6 ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1012:1: ( rule__Question__Group__5__Impl rule__Question__Group__6 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1013:2: rule__Question__Group__5__Impl rule__Question__Group__6
            {
            pushFollow(FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__52032);
            rule__Question__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__6_in_rule__Question__Group__52035);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1020:1: rule__Question__Group__5__Impl : ( ( rule__Question__MandatoryAssignment_5 )? ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1024:1: ( ( ( rule__Question__MandatoryAssignment_5 )? ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1025:1: ( ( rule__Question__MandatoryAssignment_5 )? )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1025:1: ( ( rule__Question__MandatoryAssignment_5 )? )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1026:1: ( rule__Question__MandatoryAssignment_5 )?
            {
             before(grammarAccess.getQuestionAccess().getMandatoryAssignment_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1027:1: ( rule__Question__MandatoryAssignment_5 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1027:2: rule__Question__MandatoryAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Question__MandatoryAssignment_5_in_rule__Question__Group__5__Impl2062);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1037:1: rule__Question__Group__6 : rule__Question__Group__6__Impl rule__Question__Group__7 ;
    public final void rule__Question__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1041:1: ( rule__Question__Group__6__Impl rule__Question__Group__7 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1042:2: rule__Question__Group__6__Impl rule__Question__Group__7
            {
            pushFollow(FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__62093);
            rule__Question__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__7_in_rule__Question__Group__62096);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1049:1: rule__Question__Group__6__Impl : ( 'Type:' ) ;
    public final void rule__Question__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1053:1: ( ( 'Type:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1054:1: ( 'Type:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1054:1: ( 'Type:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1055:1: 'Type:'
            {
             before(grammarAccess.getQuestionAccess().getTypeKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Question__Group__6__Impl2124); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1068:1: rule__Question__Group__7 : rule__Question__Group__7__Impl rule__Question__Group__8 ;
    public final void rule__Question__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1072:1: ( rule__Question__Group__7__Impl rule__Question__Group__8 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1073:2: rule__Question__Group__7__Impl rule__Question__Group__8
            {
            pushFollow(FOLLOW_rule__Question__Group__7__Impl_in_rule__Question__Group__72155);
            rule__Question__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__8_in_rule__Question__Group__72158);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1080:1: rule__Question__Group__7__Impl : ( ( rule__Question__QuestionTypeAssignment_7 ) ) ;
    public final void rule__Question__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1084:1: ( ( ( rule__Question__QuestionTypeAssignment_7 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1085:1: ( ( rule__Question__QuestionTypeAssignment_7 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1085:1: ( ( rule__Question__QuestionTypeAssignment_7 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1086:1: ( rule__Question__QuestionTypeAssignment_7 )
            {
             before(grammarAccess.getQuestionAccess().getQuestionTypeAssignment_7()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1087:1: ( rule__Question__QuestionTypeAssignment_7 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1087:2: rule__Question__QuestionTypeAssignment_7
            {
            pushFollow(FOLLOW_rule__Question__QuestionTypeAssignment_7_in_rule__Question__Group__7__Impl2185);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1097:1: rule__Question__Group__8 : rule__Question__Group__8__Impl ;
    public final void rule__Question__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1101:1: ( rule__Question__Group__8__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1102:2: rule__Question__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group__8__Impl_in_rule__Question__Group__82215);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1108:1: rule__Question__Group__8__Impl : ( '}' ) ;
    public final void rule__Question__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1112:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1113:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1113:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1114:1: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_14_in_rule__Question__Group__8__Impl2243); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1145:1: rule__MatrixQuestion__Group__0 : rule__MatrixQuestion__Group__0__Impl rule__MatrixQuestion__Group__1 ;
    public final void rule__MatrixQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1149:1: ( rule__MatrixQuestion__Group__0__Impl rule__MatrixQuestion__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1150:2: rule__MatrixQuestion__Group__0__Impl rule__MatrixQuestion__Group__1
            {
            pushFollow(FOLLOW_rule__MatrixQuestion__Group__0__Impl_in_rule__MatrixQuestion__Group__02292);
            rule__MatrixQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatrixQuestion__Group__1_in_rule__MatrixQuestion__Group__02295);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1157:1: rule__MatrixQuestion__Group__0__Impl : ( 'Question-ID:' ) ;
    public final void rule__MatrixQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1161:1: ( ( 'Question-ID:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1162:1: ( 'Question-ID:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1162:1: ( 'Question-ID:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1163:1: 'Question-ID:'
            {
             before(grammarAccess.getMatrixQuestionAccess().getQuestionIDKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__MatrixQuestion__Group__0__Impl2323); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1176:1: rule__MatrixQuestion__Group__1 : rule__MatrixQuestion__Group__1__Impl rule__MatrixQuestion__Group__2 ;
    public final void rule__MatrixQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1180:1: ( rule__MatrixQuestion__Group__1__Impl rule__MatrixQuestion__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1181:2: rule__MatrixQuestion__Group__1__Impl rule__MatrixQuestion__Group__2
            {
            pushFollow(FOLLOW_rule__MatrixQuestion__Group__1__Impl_in_rule__MatrixQuestion__Group__12354);
            rule__MatrixQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatrixQuestion__Group__2_in_rule__MatrixQuestion__Group__12357);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1188:1: rule__MatrixQuestion__Group__1__Impl : ( ( rule__MatrixQuestion__IdAssignment_1 ) ) ;
    public final void rule__MatrixQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1192:1: ( ( ( rule__MatrixQuestion__IdAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1193:1: ( ( rule__MatrixQuestion__IdAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1193:1: ( ( rule__MatrixQuestion__IdAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1194:1: ( rule__MatrixQuestion__IdAssignment_1 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getIdAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1195:1: ( rule__MatrixQuestion__IdAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1195:2: rule__MatrixQuestion__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__MatrixQuestion__IdAssignment_1_in_rule__MatrixQuestion__Group__1__Impl2384);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1205:1: rule__MatrixQuestion__Group__2 : rule__MatrixQuestion__Group__2__Impl rule__MatrixQuestion__Group__3 ;
    public final void rule__MatrixQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1209:1: ( rule__MatrixQuestion__Group__2__Impl rule__MatrixQuestion__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1210:2: rule__MatrixQuestion__Group__2__Impl rule__MatrixQuestion__Group__3
            {
            pushFollow(FOLLOW_rule__MatrixQuestion__Group__2__Impl_in_rule__MatrixQuestion__Group__22414);
            rule__MatrixQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MatrixQuestion__Group__3_in_rule__MatrixQuestion__Group__22417);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1217:1: rule__MatrixQuestion__Group__2__Impl : ( 'Question:' ) ;
    public final void rule__MatrixQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1221:1: ( ( 'Question:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1222:1: ( 'Question:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1222:1: ( 'Question:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1223:1: 'Question:'
            {
             before(grammarAccess.getMatrixQuestionAccess().getQuestionKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__MatrixQuestion__Group__2__Impl2445); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1236:1: rule__MatrixQuestion__Group__3 : rule__MatrixQuestion__Group__3__Impl ;
    public final void rule__MatrixQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1240:1: ( rule__MatrixQuestion__Group__3__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1241:2: rule__MatrixQuestion__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MatrixQuestion__Group__3__Impl_in_rule__MatrixQuestion__Group__32476);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1247:1: rule__MatrixQuestion__Group__3__Impl : ( ( rule__MatrixQuestion__NameAssignment_3 ) ) ;
    public final void rule__MatrixQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1251:1: ( ( ( rule__MatrixQuestion__NameAssignment_3 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1252:1: ( ( rule__MatrixQuestion__NameAssignment_3 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1252:1: ( ( rule__MatrixQuestion__NameAssignment_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1253:1: ( rule__MatrixQuestion__NameAssignment_3 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getNameAssignment_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1254:1: ( rule__MatrixQuestion__NameAssignment_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1254:2: rule__MatrixQuestion__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__MatrixQuestion__NameAssignment_3_in_rule__MatrixQuestion__Group__3__Impl2503);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1272:1: rule__Answer__Group__0 : rule__Answer__Group__0__Impl rule__Answer__Group__1 ;
    public final void rule__Answer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1276:1: ( rule__Answer__Group__0__Impl rule__Answer__Group__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1277:2: rule__Answer__Group__0__Impl rule__Answer__Group__1
            {
            pushFollow(FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__02541);
            rule__Answer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__02544);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1284:1: rule__Answer__Group__0__Impl : ( 'Answer-ID:' ) ;
    public final void rule__Answer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1288:1: ( ( 'Answer-ID:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1289:1: ( 'Answer-ID:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1289:1: ( 'Answer-ID:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1290:1: 'Answer-ID:'
            {
             before(grammarAccess.getAnswerAccess().getAnswerIDKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Answer__Group__0__Impl2572); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1303:1: rule__Answer__Group__1 : rule__Answer__Group__1__Impl rule__Answer__Group__2 ;
    public final void rule__Answer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1307:1: ( rule__Answer__Group__1__Impl rule__Answer__Group__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1308:2: rule__Answer__Group__1__Impl rule__Answer__Group__2
            {
            pushFollow(FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__12603);
            rule__Answer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__12606);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1315:1: rule__Answer__Group__1__Impl : ( ( rule__Answer__IdAssignment_1 ) ) ;
    public final void rule__Answer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1319:1: ( ( ( rule__Answer__IdAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1320:1: ( ( rule__Answer__IdAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1320:1: ( ( rule__Answer__IdAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1321:1: ( rule__Answer__IdAssignment_1 )
            {
             before(grammarAccess.getAnswerAccess().getIdAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1322:1: ( rule__Answer__IdAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1322:2: rule__Answer__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__Answer__IdAssignment_1_in_rule__Answer__Group__1__Impl2633);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1332:1: rule__Answer__Group__2 : rule__Answer__Group__2__Impl rule__Answer__Group__3 ;
    public final void rule__Answer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1336:1: ( rule__Answer__Group__2__Impl rule__Answer__Group__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1337:2: rule__Answer__Group__2__Impl rule__Answer__Group__3
            {
            pushFollow(FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__22663);
            rule__Answer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__22666);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1344:1: rule__Answer__Group__2__Impl : ( 'Answer:' ) ;
    public final void rule__Answer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1348:1: ( ( 'Answer:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1349:1: ( 'Answer:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1349:1: ( 'Answer:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1350:1: 'Answer:'
            {
             before(grammarAccess.getAnswerAccess().getAnswerKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Answer__Group__2__Impl2694); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1363:1: rule__Answer__Group__3 : rule__Answer__Group__3__Impl ;
    public final void rule__Answer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1367:1: ( rule__Answer__Group__3__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1368:2: rule__Answer__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__32725);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1374:1: rule__Answer__Group__3__Impl : ( ( rule__Answer__NameAssignment_3 ) ) ;
    public final void rule__Answer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1378:1: ( ( ( rule__Answer__NameAssignment_3 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1379:1: ( ( rule__Answer__NameAssignment_3 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1379:1: ( ( rule__Answer__NameAssignment_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1380:1: ( rule__Answer__NameAssignment_3 )
            {
             before(grammarAccess.getAnswerAccess().getNameAssignment_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1381:1: ( rule__Answer__NameAssignment_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1381:2: rule__Answer__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Answer__NameAssignment_3_in_rule__Answer__Group__3__Impl2752);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1399:1: rule__SurveyTerminalTypes__Group_0__0 : rule__SurveyTerminalTypes__Group_0__0__Impl rule__SurveyTerminalTypes__Group_0__1 ;
    public final void rule__SurveyTerminalTypes__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1403:1: ( rule__SurveyTerminalTypes__Group_0__0__Impl rule__SurveyTerminalTypes__Group_0__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1404:2: rule__SurveyTerminalTypes__Group_0__0__Impl rule__SurveyTerminalTypes__Group_0__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__0__Impl_in_rule__SurveyTerminalTypes__Group_0__02790);
            rule__SurveyTerminalTypes__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__1_in_rule__SurveyTerminalTypes__Group_0__02793);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1411:1: rule__SurveyTerminalTypes__Group_0__0__Impl : ( () ) ;
    public final void rule__SurveyTerminalTypes__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1415:1: ( ( () ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1416:1: ( () )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1416:1: ( () )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1417:1: ()
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getTextLineAction_0_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1418:1: ()
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1420:1: 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1430:1: rule__SurveyTerminalTypes__Group_0__1 : rule__SurveyTerminalTypes__Group_0__1__Impl rule__SurveyTerminalTypes__Group_0__2 ;
    public final void rule__SurveyTerminalTypes__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1434:1: ( rule__SurveyTerminalTypes__Group_0__1__Impl rule__SurveyTerminalTypes__Group_0__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1435:2: rule__SurveyTerminalTypes__Group_0__1__Impl rule__SurveyTerminalTypes__Group_0__2
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__1__Impl_in_rule__SurveyTerminalTypes__Group_0__12851);
            rule__SurveyTerminalTypes__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__2_in_rule__SurveyTerminalTypes__Group_0__12854);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1442:1: rule__SurveyTerminalTypes__Group_0__1__Impl : ( ( rule__SurveyTerminalTypes__NameAssignment_0_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1446:1: ( ( ( rule__SurveyTerminalTypes__NameAssignment_0_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1447:1: ( ( rule__SurveyTerminalTypes__NameAssignment_0_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1447:1: ( ( rule__SurveyTerminalTypes__NameAssignment_0_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1448:1: ( rule__SurveyTerminalTypes__NameAssignment_0_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_0_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1449:1: ( rule__SurveyTerminalTypes__NameAssignment_0_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1449:2: rule__SurveyTerminalTypes__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__NameAssignment_0_1_in_rule__SurveyTerminalTypes__Group_0__1__Impl2881);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1459:1: rule__SurveyTerminalTypes__Group_0__2 : rule__SurveyTerminalTypes__Group_0__2__Impl rule__SurveyTerminalTypes__Group_0__3 ;
    public final void rule__SurveyTerminalTypes__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1463:1: ( rule__SurveyTerminalTypes__Group_0__2__Impl rule__SurveyTerminalTypes__Group_0__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1464:2: rule__SurveyTerminalTypes__Group_0__2__Impl rule__SurveyTerminalTypes__Group_0__3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__2__Impl_in_rule__SurveyTerminalTypes__Group_0__22911);
            rule__SurveyTerminalTypes__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__3_in_rule__SurveyTerminalTypes__Group_0__22914);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1471:1: rule__SurveyTerminalTypes__Group_0__2__Impl : ( '(' ) ;
    public final void rule__SurveyTerminalTypes__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1475:1: ( ( '(' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1476:1: ( '(' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1476:1: ( '(' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1477:1: '('
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftParenthesisKeyword_0_2()); 
            match(input,22,FOLLOW_22_in_rule__SurveyTerminalTypes__Group_0__2__Impl2942); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1490:1: rule__SurveyTerminalTypes__Group_0__3 : rule__SurveyTerminalTypes__Group_0__3__Impl rule__SurveyTerminalTypes__Group_0__4 ;
    public final void rule__SurveyTerminalTypes__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1494:1: ( rule__SurveyTerminalTypes__Group_0__3__Impl rule__SurveyTerminalTypes__Group_0__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1495:2: rule__SurveyTerminalTypes__Group_0__3__Impl rule__SurveyTerminalTypes__Group_0__4
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__3__Impl_in_rule__SurveyTerminalTypes__Group_0__32973);
            rule__SurveyTerminalTypes__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__4_in_rule__SurveyTerminalTypes__Group_0__32976);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1502:1: rule__SurveyTerminalTypes__Group_0__3__Impl : ( ( rule__SurveyTerminalTypes__LengthAssignment_0_3 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1506:1: ( ( ( rule__SurveyTerminalTypes__LengthAssignment_0_3 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1507:1: ( ( rule__SurveyTerminalTypes__LengthAssignment_0_3 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1507:1: ( ( rule__SurveyTerminalTypes__LengthAssignment_0_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1508:1: ( rule__SurveyTerminalTypes__LengthAssignment_0_3 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLengthAssignment_0_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1509:1: ( rule__SurveyTerminalTypes__LengthAssignment_0_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1509:2: rule__SurveyTerminalTypes__LengthAssignment_0_3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__LengthAssignment_0_3_in_rule__SurveyTerminalTypes__Group_0__3__Impl3003);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1519:1: rule__SurveyTerminalTypes__Group_0__4 : rule__SurveyTerminalTypes__Group_0__4__Impl ;
    public final void rule__SurveyTerminalTypes__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1523:1: ( rule__SurveyTerminalTypes__Group_0__4__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1524:2: rule__SurveyTerminalTypes__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_0__4__Impl_in_rule__SurveyTerminalTypes__Group_0__43033);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1530:1: rule__SurveyTerminalTypes__Group_0__4__Impl : ( ')' ) ;
    public final void rule__SurveyTerminalTypes__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1534:1: ( ( ')' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1535:1: ( ')' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1535:1: ( ')' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1536:1: ')'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightParenthesisKeyword_0_4()); 
            match(input,23,FOLLOW_23_in_rule__SurveyTerminalTypes__Group_0__4__Impl3061); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1559:1: rule__SurveyTerminalTypes__Group_1__0 : rule__SurveyTerminalTypes__Group_1__0__Impl rule__SurveyTerminalTypes__Group_1__1 ;
    public final void rule__SurveyTerminalTypes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1563:1: ( rule__SurveyTerminalTypes__Group_1__0__Impl rule__SurveyTerminalTypes__Group_1__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1564:2: rule__SurveyTerminalTypes__Group_1__0__Impl rule__SurveyTerminalTypes__Group_1__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__0__Impl_in_rule__SurveyTerminalTypes__Group_1__03102);
            rule__SurveyTerminalTypes__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__1_in_rule__SurveyTerminalTypes__Group_1__03105);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1571:1: rule__SurveyTerminalTypes__Group_1__0__Impl : ( () ) ;
    public final void rule__SurveyTerminalTypes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1575:1: ( ( () ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1576:1: ( () )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1576:1: ( () )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1577:1: ()
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getTextBlockAction_1_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1578:1: ()
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1580:1: 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1590:1: rule__SurveyTerminalTypes__Group_1__1 : rule__SurveyTerminalTypes__Group_1__1__Impl rule__SurveyTerminalTypes__Group_1__2 ;
    public final void rule__SurveyTerminalTypes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1594:1: ( rule__SurveyTerminalTypes__Group_1__1__Impl rule__SurveyTerminalTypes__Group_1__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1595:2: rule__SurveyTerminalTypes__Group_1__1__Impl rule__SurveyTerminalTypes__Group_1__2
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__1__Impl_in_rule__SurveyTerminalTypes__Group_1__13163);
            rule__SurveyTerminalTypes__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__2_in_rule__SurveyTerminalTypes__Group_1__13166);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1602:1: rule__SurveyTerminalTypes__Group_1__1__Impl : ( ( rule__SurveyTerminalTypes__NameAssignment_1_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1606:1: ( ( ( rule__SurveyTerminalTypes__NameAssignment_1_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1607:1: ( ( rule__SurveyTerminalTypes__NameAssignment_1_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1607:1: ( ( rule__SurveyTerminalTypes__NameAssignment_1_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1608:1: ( rule__SurveyTerminalTypes__NameAssignment_1_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_1_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1609:1: ( rule__SurveyTerminalTypes__NameAssignment_1_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1609:2: rule__SurveyTerminalTypes__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__NameAssignment_1_1_in_rule__SurveyTerminalTypes__Group_1__1__Impl3193);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1619:1: rule__SurveyTerminalTypes__Group_1__2 : rule__SurveyTerminalTypes__Group_1__2__Impl rule__SurveyTerminalTypes__Group_1__3 ;
    public final void rule__SurveyTerminalTypes__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1623:1: ( rule__SurveyTerminalTypes__Group_1__2__Impl rule__SurveyTerminalTypes__Group_1__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1624:2: rule__SurveyTerminalTypes__Group_1__2__Impl rule__SurveyTerminalTypes__Group_1__3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__2__Impl_in_rule__SurveyTerminalTypes__Group_1__23223);
            rule__SurveyTerminalTypes__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__3_in_rule__SurveyTerminalTypes__Group_1__23226);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1631:1: rule__SurveyTerminalTypes__Group_1__2__Impl : ( '(' ) ;
    public final void rule__SurveyTerminalTypes__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1635:1: ( ( '(' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1636:1: ( '(' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1636:1: ( '(' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1637:1: '('
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftParenthesisKeyword_1_2()); 
            match(input,22,FOLLOW_22_in_rule__SurveyTerminalTypes__Group_1__2__Impl3254); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1650:1: rule__SurveyTerminalTypes__Group_1__3 : rule__SurveyTerminalTypes__Group_1__3__Impl rule__SurveyTerminalTypes__Group_1__4 ;
    public final void rule__SurveyTerminalTypes__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1654:1: ( rule__SurveyTerminalTypes__Group_1__3__Impl rule__SurveyTerminalTypes__Group_1__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1655:2: rule__SurveyTerminalTypes__Group_1__3__Impl rule__SurveyTerminalTypes__Group_1__4
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__3__Impl_in_rule__SurveyTerminalTypes__Group_1__33285);
            rule__SurveyTerminalTypes__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__4_in_rule__SurveyTerminalTypes__Group_1__33288);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1662:1: rule__SurveyTerminalTypes__Group_1__3__Impl : ( ( rule__SurveyTerminalTypes__LengthAssignment_1_3 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1666:1: ( ( ( rule__SurveyTerminalTypes__LengthAssignment_1_3 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1667:1: ( ( rule__SurveyTerminalTypes__LengthAssignment_1_3 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1667:1: ( ( rule__SurveyTerminalTypes__LengthAssignment_1_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1668:1: ( rule__SurveyTerminalTypes__LengthAssignment_1_3 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLengthAssignment_1_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1669:1: ( rule__SurveyTerminalTypes__LengthAssignment_1_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1669:2: rule__SurveyTerminalTypes__LengthAssignment_1_3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__LengthAssignment_1_3_in_rule__SurveyTerminalTypes__Group_1__3__Impl3315);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1679:1: rule__SurveyTerminalTypes__Group_1__4 : rule__SurveyTerminalTypes__Group_1__4__Impl ;
    public final void rule__SurveyTerminalTypes__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1683:1: ( rule__SurveyTerminalTypes__Group_1__4__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1684:2: rule__SurveyTerminalTypes__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_1__4__Impl_in_rule__SurveyTerminalTypes__Group_1__43345);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1690:1: rule__SurveyTerminalTypes__Group_1__4__Impl : ( ')' ) ;
    public final void rule__SurveyTerminalTypes__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1694:1: ( ( ')' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1695:1: ( ')' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1695:1: ( ')' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1696:1: ')'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightParenthesisKeyword_1_4()); 
            match(input,23,FOLLOW_23_in_rule__SurveyTerminalTypes__Group_1__4__Impl3373); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1719:1: rule__SurveyTerminalTypes__Group_2__0 : rule__SurveyTerminalTypes__Group_2__0__Impl rule__SurveyTerminalTypes__Group_2__1 ;
    public final void rule__SurveyTerminalTypes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1723:1: ( rule__SurveyTerminalTypes__Group_2__0__Impl rule__SurveyTerminalTypes__Group_2__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1724:2: rule__SurveyTerminalTypes__Group_2__0__Impl rule__SurveyTerminalTypes__Group_2__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__0__Impl_in_rule__SurveyTerminalTypes__Group_2__03414);
            rule__SurveyTerminalTypes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__1_in_rule__SurveyTerminalTypes__Group_2__03417);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1731:1: rule__SurveyTerminalTypes__Group_2__0__Impl : ( () ) ;
    public final void rule__SurveyTerminalTypes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1735:1: ( ( () ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1736:1: ( () )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1736:1: ( () )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1737:1: ()
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getMatrixAction_2_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1738:1: ()
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1740:1: 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1750:1: rule__SurveyTerminalTypes__Group_2__1 : rule__SurveyTerminalTypes__Group_2__1__Impl rule__SurveyTerminalTypes__Group_2__2 ;
    public final void rule__SurveyTerminalTypes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1754:1: ( rule__SurveyTerminalTypes__Group_2__1__Impl rule__SurveyTerminalTypes__Group_2__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1755:2: rule__SurveyTerminalTypes__Group_2__1__Impl rule__SurveyTerminalTypes__Group_2__2
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__1__Impl_in_rule__SurveyTerminalTypes__Group_2__13475);
            rule__SurveyTerminalTypes__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__2_in_rule__SurveyTerminalTypes__Group_2__13478);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1762:1: rule__SurveyTerminalTypes__Group_2__1__Impl : ( ( rule__SurveyTerminalTypes__NameAssignment_2_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1766:1: ( ( ( rule__SurveyTerminalTypes__NameAssignment_2_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1767:1: ( ( rule__SurveyTerminalTypes__NameAssignment_2_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1767:1: ( ( rule__SurveyTerminalTypes__NameAssignment_2_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1768:1: ( rule__SurveyTerminalTypes__NameAssignment_2_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_2_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1769:1: ( rule__SurveyTerminalTypes__NameAssignment_2_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1769:2: rule__SurveyTerminalTypes__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__NameAssignment_2_1_in_rule__SurveyTerminalTypes__Group_2__1__Impl3505);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1779:1: rule__SurveyTerminalTypes__Group_2__2 : rule__SurveyTerminalTypes__Group_2__2__Impl rule__SurveyTerminalTypes__Group_2__3 ;
    public final void rule__SurveyTerminalTypes__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1783:1: ( rule__SurveyTerminalTypes__Group_2__2__Impl rule__SurveyTerminalTypes__Group_2__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1784:2: rule__SurveyTerminalTypes__Group_2__2__Impl rule__SurveyTerminalTypes__Group_2__3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__2__Impl_in_rule__SurveyTerminalTypes__Group_2__23535);
            rule__SurveyTerminalTypes__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__3_in_rule__SurveyTerminalTypes__Group_2__23538);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1791:1: rule__SurveyTerminalTypes__Group_2__2__Impl : ( '{' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1795:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1796:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1796:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1797:1: '{'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftCurlyBracketKeyword_2_2()); 
            match(input,12,FOLLOW_12_in_rule__SurveyTerminalTypes__Group_2__2__Impl3566); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1810:1: rule__SurveyTerminalTypes__Group_2__3 : rule__SurveyTerminalTypes__Group_2__3__Impl rule__SurveyTerminalTypes__Group_2__4 ;
    public final void rule__SurveyTerminalTypes__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1814:1: ( rule__SurveyTerminalTypes__Group_2__3__Impl rule__SurveyTerminalTypes__Group_2__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1815:2: rule__SurveyTerminalTypes__Group_2__3__Impl rule__SurveyTerminalTypes__Group_2__4
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__3__Impl_in_rule__SurveyTerminalTypes__Group_2__33597);
            rule__SurveyTerminalTypes__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__4_in_rule__SurveyTerminalTypes__Group_2__33600);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1822:1: rule__SurveyTerminalTypes__Group_2__3__Impl : ( 'Scale:' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1826:1: ( ( 'Scale:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1827:1: ( 'Scale:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1827:1: ( 'Scale:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1828:1: 'Scale:'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getScaleKeyword_2_3()); 
            match(input,24,FOLLOW_24_in_rule__SurveyTerminalTypes__Group_2__3__Impl3628); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1841:1: rule__SurveyTerminalTypes__Group_2__4 : rule__SurveyTerminalTypes__Group_2__4__Impl rule__SurveyTerminalTypes__Group_2__5 ;
    public final void rule__SurveyTerminalTypes__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1845:1: ( rule__SurveyTerminalTypes__Group_2__4__Impl rule__SurveyTerminalTypes__Group_2__5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1846:2: rule__SurveyTerminalTypes__Group_2__4__Impl rule__SurveyTerminalTypes__Group_2__5
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__4__Impl_in_rule__SurveyTerminalTypes__Group_2__43659);
            rule__SurveyTerminalTypes__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__5_in_rule__SurveyTerminalTypes__Group_2__43662);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1853:1: rule__SurveyTerminalTypes__Group_2__4__Impl : ( '(' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1857:1: ( ( '(' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1858:1: ( '(' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1858:1: ( '(' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1859:1: '('
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftParenthesisKeyword_2_4()); 
            match(input,22,FOLLOW_22_in_rule__SurveyTerminalTypes__Group_2__4__Impl3690); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1872:1: rule__SurveyTerminalTypes__Group_2__5 : rule__SurveyTerminalTypes__Group_2__5__Impl rule__SurveyTerminalTypes__Group_2__6 ;
    public final void rule__SurveyTerminalTypes__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1876:1: ( rule__SurveyTerminalTypes__Group_2__5__Impl rule__SurveyTerminalTypes__Group_2__6 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1877:2: rule__SurveyTerminalTypes__Group_2__5__Impl rule__SurveyTerminalTypes__Group_2__6
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__5__Impl_in_rule__SurveyTerminalTypes__Group_2__53721);
            rule__SurveyTerminalTypes__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__6_in_rule__SurveyTerminalTypes__Group_2__53724);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1884:1: rule__SurveyTerminalTypes__Group_2__5__Impl : ( ( rule__SurveyTerminalTypes__MatrixScaleAssignment_2_5 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1888:1: ( ( ( rule__SurveyTerminalTypes__MatrixScaleAssignment_2_5 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1889:1: ( ( rule__SurveyTerminalTypes__MatrixScaleAssignment_2_5 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1889:1: ( ( rule__SurveyTerminalTypes__MatrixScaleAssignment_2_5 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1890:1: ( rule__SurveyTerminalTypes__MatrixScaleAssignment_2_5 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getMatrixScaleAssignment_2_5()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1891:1: ( rule__SurveyTerminalTypes__MatrixScaleAssignment_2_5 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1891:2: rule__SurveyTerminalTypes__MatrixScaleAssignment_2_5
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__MatrixScaleAssignment_2_5_in_rule__SurveyTerminalTypes__Group_2__5__Impl3751);
            rule__SurveyTerminalTypes__MatrixScaleAssignment_2_5();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getMatrixScaleAssignment_2_5()); 

            }


            }

        }
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1901:1: rule__SurveyTerminalTypes__Group_2__6 : rule__SurveyTerminalTypes__Group_2__6__Impl rule__SurveyTerminalTypes__Group_2__7 ;
    public final void rule__SurveyTerminalTypes__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1905:1: ( rule__SurveyTerminalTypes__Group_2__6__Impl rule__SurveyTerminalTypes__Group_2__7 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1906:2: rule__SurveyTerminalTypes__Group_2__6__Impl rule__SurveyTerminalTypes__Group_2__7
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__6__Impl_in_rule__SurveyTerminalTypes__Group_2__63781);
            rule__SurveyTerminalTypes__Group_2__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__7_in_rule__SurveyTerminalTypes__Group_2__63784);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1913:1: rule__SurveyTerminalTypes__Group_2__6__Impl : ( ( rule__SurveyTerminalTypes__Group_2_6__0 )* ) ;
    public final void rule__SurveyTerminalTypes__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1917:1: ( ( ( rule__SurveyTerminalTypes__Group_2_6__0 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1918:1: ( ( rule__SurveyTerminalTypes__Group_2_6__0 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1918:1: ( ( rule__SurveyTerminalTypes__Group_2_6__0 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1919:1: ( rule__SurveyTerminalTypes__Group_2_6__0 )*
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_2_6()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1920:1: ( rule__SurveyTerminalTypes__Group_2_6__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1920:2: rule__SurveyTerminalTypes__Group_2_6__0
            	    {
            	    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_6__0_in_rule__SurveyTerminalTypes__Group_2__6__Impl3811);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1930:1: rule__SurveyTerminalTypes__Group_2__7 : rule__SurveyTerminalTypes__Group_2__7__Impl rule__SurveyTerminalTypes__Group_2__8 ;
    public final void rule__SurveyTerminalTypes__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1934:1: ( rule__SurveyTerminalTypes__Group_2__7__Impl rule__SurveyTerminalTypes__Group_2__8 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1935:2: rule__SurveyTerminalTypes__Group_2__7__Impl rule__SurveyTerminalTypes__Group_2__8
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__7__Impl_in_rule__SurveyTerminalTypes__Group_2__73842);
            rule__SurveyTerminalTypes__Group_2__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__8_in_rule__SurveyTerminalTypes__Group_2__73845);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1942:1: rule__SurveyTerminalTypes__Group_2__7__Impl : ( ')' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1946:1: ( ( ')' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1947:1: ( ')' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1947:1: ( ')' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1948:1: ')'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightParenthesisKeyword_2_7()); 
            match(input,23,FOLLOW_23_in_rule__SurveyTerminalTypes__Group_2__7__Impl3873); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1961:1: rule__SurveyTerminalTypes__Group_2__8 : rule__SurveyTerminalTypes__Group_2__8__Impl rule__SurveyTerminalTypes__Group_2__9 ;
    public final void rule__SurveyTerminalTypes__Group_2__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1965:1: ( rule__SurveyTerminalTypes__Group_2__8__Impl rule__SurveyTerminalTypes__Group_2__9 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1966:2: rule__SurveyTerminalTypes__Group_2__8__Impl rule__SurveyTerminalTypes__Group_2__9
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__8__Impl_in_rule__SurveyTerminalTypes__Group_2__83904);
            rule__SurveyTerminalTypes__Group_2__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__9_in_rule__SurveyTerminalTypes__Group_2__83907);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1973:1: rule__SurveyTerminalTypes__Group_2__8__Impl : ( 'Questions:' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1977:1: ( ( 'Questions:' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1978:1: ( 'Questions:' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1978:1: ( 'Questions:' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1979:1: 'Questions:'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getQuestionsKeyword_2_8()); 
            match(input,25,FOLLOW_25_in_rule__SurveyTerminalTypes__Group_2__8__Impl3935); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1992:1: rule__SurveyTerminalTypes__Group_2__9 : rule__SurveyTerminalTypes__Group_2__9__Impl rule__SurveyTerminalTypes__Group_2__10 ;
    public final void rule__SurveyTerminalTypes__Group_2__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1996:1: ( rule__SurveyTerminalTypes__Group_2__9__Impl rule__SurveyTerminalTypes__Group_2__10 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1997:2: rule__SurveyTerminalTypes__Group_2__9__Impl rule__SurveyTerminalTypes__Group_2__10
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__9__Impl_in_rule__SurveyTerminalTypes__Group_2__93966);
            rule__SurveyTerminalTypes__Group_2__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__10_in_rule__SurveyTerminalTypes__Group_2__93969);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2004:1: rule__SurveyTerminalTypes__Group_2__9__Impl : ( '(' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2008:1: ( ( '(' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2009:1: ( '(' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2009:1: ( '(' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2010:1: '('
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftParenthesisKeyword_2_9()); 
            match(input,22,FOLLOW_22_in_rule__SurveyTerminalTypes__Group_2__9__Impl3997); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2023:1: rule__SurveyTerminalTypes__Group_2__10 : rule__SurveyTerminalTypes__Group_2__10__Impl rule__SurveyTerminalTypes__Group_2__11 ;
    public final void rule__SurveyTerminalTypes__Group_2__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2027:1: ( rule__SurveyTerminalTypes__Group_2__10__Impl rule__SurveyTerminalTypes__Group_2__11 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2028:2: rule__SurveyTerminalTypes__Group_2__10__Impl rule__SurveyTerminalTypes__Group_2__11
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__10__Impl_in_rule__SurveyTerminalTypes__Group_2__104028);
            rule__SurveyTerminalTypes__Group_2__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__11_in_rule__SurveyTerminalTypes__Group_2__104031);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2035:1: rule__SurveyTerminalTypes__Group_2__10__Impl : ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_2__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2039:1: ( ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2040:1: ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2040:1: ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2041:1: ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getMatrixQuestionAssignment_2_10()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2042:1: ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2042:2: rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10_in_rule__SurveyTerminalTypes__Group_2__10__Impl4058);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2052:1: rule__SurveyTerminalTypes__Group_2__11 : rule__SurveyTerminalTypes__Group_2__11__Impl rule__SurveyTerminalTypes__Group_2__12 ;
    public final void rule__SurveyTerminalTypes__Group_2__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2056:1: ( rule__SurveyTerminalTypes__Group_2__11__Impl rule__SurveyTerminalTypes__Group_2__12 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2057:2: rule__SurveyTerminalTypes__Group_2__11__Impl rule__SurveyTerminalTypes__Group_2__12
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__11__Impl_in_rule__SurveyTerminalTypes__Group_2__114088);
            rule__SurveyTerminalTypes__Group_2__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__12_in_rule__SurveyTerminalTypes__Group_2__114091);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2064:1: rule__SurveyTerminalTypes__Group_2__11__Impl : ( ( rule__SurveyTerminalTypes__Group_2_11__0 )* ) ;
    public final void rule__SurveyTerminalTypes__Group_2__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2068:1: ( ( ( rule__SurveyTerminalTypes__Group_2_11__0 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2069:1: ( ( rule__SurveyTerminalTypes__Group_2_11__0 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2069:1: ( ( rule__SurveyTerminalTypes__Group_2_11__0 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2070:1: ( rule__SurveyTerminalTypes__Group_2_11__0 )*
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getGroup_2_11()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2071:1: ( rule__SurveyTerminalTypes__Group_2_11__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2071:2: rule__SurveyTerminalTypes__Group_2_11__0
            	    {
            	    pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_11__0_in_rule__SurveyTerminalTypes__Group_2__11__Impl4118);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2081:1: rule__SurveyTerminalTypes__Group_2__12 : rule__SurveyTerminalTypes__Group_2__12__Impl rule__SurveyTerminalTypes__Group_2__13 ;
    public final void rule__SurveyTerminalTypes__Group_2__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2085:1: ( rule__SurveyTerminalTypes__Group_2__12__Impl rule__SurveyTerminalTypes__Group_2__13 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2086:2: rule__SurveyTerminalTypes__Group_2__12__Impl rule__SurveyTerminalTypes__Group_2__13
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__12__Impl_in_rule__SurveyTerminalTypes__Group_2__124149);
            rule__SurveyTerminalTypes__Group_2__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__13_in_rule__SurveyTerminalTypes__Group_2__124152);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2093:1: rule__SurveyTerminalTypes__Group_2__12__Impl : ( ')' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2097:1: ( ( ')' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2098:1: ( ')' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2098:1: ( ')' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2099:1: ')'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightParenthesisKeyword_2_12()); 
            match(input,23,FOLLOW_23_in_rule__SurveyTerminalTypes__Group_2__12__Impl4180); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2112:1: rule__SurveyTerminalTypes__Group_2__13 : rule__SurveyTerminalTypes__Group_2__13__Impl ;
    public final void rule__SurveyTerminalTypes__Group_2__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2116:1: ( rule__SurveyTerminalTypes__Group_2__13__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2117:2: rule__SurveyTerminalTypes__Group_2__13__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2__13__Impl_in_rule__SurveyTerminalTypes__Group_2__134211);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2123:1: rule__SurveyTerminalTypes__Group_2__13__Impl : ( '}' ) ;
    public final void rule__SurveyTerminalTypes__Group_2__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2127:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2128:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2128:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2129:1: '}'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightCurlyBracketKeyword_2_13()); 
            match(input,14,FOLLOW_14_in_rule__SurveyTerminalTypes__Group_2__13__Impl4239); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2170:1: rule__SurveyTerminalTypes__Group_2_6__0 : rule__SurveyTerminalTypes__Group_2_6__0__Impl rule__SurveyTerminalTypes__Group_2_6__1 ;
    public final void rule__SurveyTerminalTypes__Group_2_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2174:1: ( rule__SurveyTerminalTypes__Group_2_6__0__Impl rule__SurveyTerminalTypes__Group_2_6__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2175:2: rule__SurveyTerminalTypes__Group_2_6__0__Impl rule__SurveyTerminalTypes__Group_2_6__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_6__0__Impl_in_rule__SurveyTerminalTypes__Group_2_6__04298);
            rule__SurveyTerminalTypes__Group_2_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_6__1_in_rule__SurveyTerminalTypes__Group_2_6__04301);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2182:1: rule__SurveyTerminalTypes__Group_2_6__0__Impl : ( '|' ) ;
    public final void rule__SurveyTerminalTypes__Group_2_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2186:1: ( ( '|' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2187:1: ( '|' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2187:1: ( '|' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2188:1: '|'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getVerticalLineKeyword_2_6_0()); 
            match(input,26,FOLLOW_26_in_rule__SurveyTerminalTypes__Group_2_6__0__Impl4329); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2201:1: rule__SurveyTerminalTypes__Group_2_6__1 : rule__SurveyTerminalTypes__Group_2_6__1__Impl ;
    public final void rule__SurveyTerminalTypes__Group_2_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2205:1: ( rule__SurveyTerminalTypes__Group_2_6__1__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2206:2: rule__SurveyTerminalTypes__Group_2_6__1__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_6__1__Impl_in_rule__SurveyTerminalTypes__Group_2_6__14360);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2212:1: rule__SurveyTerminalTypes__Group_2_6__1__Impl : ( ( rule__SurveyTerminalTypes__MatrixScaleAssignment_2_6_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_2_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2216:1: ( ( ( rule__SurveyTerminalTypes__MatrixScaleAssignment_2_6_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2217:1: ( ( rule__SurveyTerminalTypes__MatrixScaleAssignment_2_6_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2217:1: ( ( rule__SurveyTerminalTypes__MatrixScaleAssignment_2_6_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2218:1: ( rule__SurveyTerminalTypes__MatrixScaleAssignment_2_6_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getMatrixScaleAssignment_2_6_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2219:1: ( rule__SurveyTerminalTypes__MatrixScaleAssignment_2_6_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2219:2: rule__SurveyTerminalTypes__MatrixScaleAssignment_2_6_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__MatrixScaleAssignment_2_6_1_in_rule__SurveyTerminalTypes__Group_2_6__1__Impl4387);
            rule__SurveyTerminalTypes__MatrixScaleAssignment_2_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getMatrixScaleAssignment_2_6_1()); 

            }


            }

        }
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2233:1: rule__SurveyTerminalTypes__Group_2_11__0 : rule__SurveyTerminalTypes__Group_2_11__0__Impl rule__SurveyTerminalTypes__Group_2_11__1 ;
    public final void rule__SurveyTerminalTypes__Group_2_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2237:1: ( rule__SurveyTerminalTypes__Group_2_11__0__Impl rule__SurveyTerminalTypes__Group_2_11__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2238:2: rule__SurveyTerminalTypes__Group_2_11__0__Impl rule__SurveyTerminalTypes__Group_2_11__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_11__0__Impl_in_rule__SurveyTerminalTypes__Group_2_11__04421);
            rule__SurveyTerminalTypes__Group_2_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_11__1_in_rule__SurveyTerminalTypes__Group_2_11__04424);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2245:1: rule__SurveyTerminalTypes__Group_2_11__0__Impl : ( '|' ) ;
    public final void rule__SurveyTerminalTypes__Group_2_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2249:1: ( ( '|' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2250:1: ( '|' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2250:1: ( '|' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2251:1: '|'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getVerticalLineKeyword_2_11_0()); 
            match(input,26,FOLLOW_26_in_rule__SurveyTerminalTypes__Group_2_11__0__Impl4452); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2264:1: rule__SurveyTerminalTypes__Group_2_11__1 : rule__SurveyTerminalTypes__Group_2_11__1__Impl ;
    public final void rule__SurveyTerminalTypes__Group_2_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2268:1: ( rule__SurveyTerminalTypes__Group_2_11__1__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2269:2: rule__SurveyTerminalTypes__Group_2_11__1__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_2_11__1__Impl_in_rule__SurveyTerminalTypes__Group_2_11__14483);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2275:1: rule__SurveyTerminalTypes__Group_2_11__1__Impl : ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_2_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2279:1: ( ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2280:1: ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2280:1: ( ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2281:1: ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getMatrixQuestionAssignment_2_11_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2282:1: ( rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2282:2: rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1_in_rule__SurveyTerminalTypes__Group_2_11__1__Impl4510);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2296:1: rule__SurveyTerminalTypes__Group_3__0 : rule__SurveyTerminalTypes__Group_3__0__Impl rule__SurveyTerminalTypes__Group_3__1 ;
    public final void rule__SurveyTerminalTypes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2300:1: ( rule__SurveyTerminalTypes__Group_3__0__Impl rule__SurveyTerminalTypes__Group_3__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2301:2: rule__SurveyTerminalTypes__Group_3__0__Impl rule__SurveyTerminalTypes__Group_3__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__0__Impl_in_rule__SurveyTerminalTypes__Group_3__04544);
            rule__SurveyTerminalTypes__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__1_in_rule__SurveyTerminalTypes__Group_3__04547);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2308:1: rule__SurveyTerminalTypes__Group_3__0__Impl : ( () ) ;
    public final void rule__SurveyTerminalTypes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2312:1: ( ( () ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2313:1: ( () )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2313:1: ( () )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2314:1: ()
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getComboBoxAction_3_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2315:1: ()
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2317:1: 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2327:1: rule__SurveyTerminalTypes__Group_3__1 : rule__SurveyTerminalTypes__Group_3__1__Impl rule__SurveyTerminalTypes__Group_3__2 ;
    public final void rule__SurveyTerminalTypes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2331:1: ( rule__SurveyTerminalTypes__Group_3__1__Impl rule__SurveyTerminalTypes__Group_3__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2332:2: rule__SurveyTerminalTypes__Group_3__1__Impl rule__SurveyTerminalTypes__Group_3__2
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__1__Impl_in_rule__SurveyTerminalTypes__Group_3__14605);
            rule__SurveyTerminalTypes__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__2_in_rule__SurveyTerminalTypes__Group_3__14608);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2339:1: rule__SurveyTerminalTypes__Group_3__1__Impl : ( ( rule__SurveyTerminalTypes__NameAssignment_3_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2343:1: ( ( ( rule__SurveyTerminalTypes__NameAssignment_3_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2344:1: ( ( rule__SurveyTerminalTypes__NameAssignment_3_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2344:1: ( ( rule__SurveyTerminalTypes__NameAssignment_3_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2345:1: ( rule__SurveyTerminalTypes__NameAssignment_3_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_3_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2346:1: ( rule__SurveyTerminalTypes__NameAssignment_3_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2346:2: rule__SurveyTerminalTypes__NameAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__NameAssignment_3_1_in_rule__SurveyTerminalTypes__Group_3__1__Impl4635);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2356:1: rule__SurveyTerminalTypes__Group_3__2 : rule__SurveyTerminalTypes__Group_3__2__Impl rule__SurveyTerminalTypes__Group_3__3 ;
    public final void rule__SurveyTerminalTypes__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2360:1: ( rule__SurveyTerminalTypes__Group_3__2__Impl rule__SurveyTerminalTypes__Group_3__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2361:2: rule__SurveyTerminalTypes__Group_3__2__Impl rule__SurveyTerminalTypes__Group_3__3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__2__Impl_in_rule__SurveyTerminalTypes__Group_3__24665);
            rule__SurveyTerminalTypes__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__3_in_rule__SurveyTerminalTypes__Group_3__24668);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2368:1: rule__SurveyTerminalTypes__Group_3__2__Impl : ( '{' ) ;
    public final void rule__SurveyTerminalTypes__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2372:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2373:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2373:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2374:1: '{'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftCurlyBracketKeyword_3_2()); 
            match(input,12,FOLLOW_12_in_rule__SurveyTerminalTypes__Group_3__2__Impl4696); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2387:1: rule__SurveyTerminalTypes__Group_3__3 : rule__SurveyTerminalTypes__Group_3__3__Impl rule__SurveyTerminalTypes__Group_3__4 ;
    public final void rule__SurveyTerminalTypes__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2391:1: ( rule__SurveyTerminalTypes__Group_3__3__Impl rule__SurveyTerminalTypes__Group_3__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2392:2: rule__SurveyTerminalTypes__Group_3__3__Impl rule__SurveyTerminalTypes__Group_3__4
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__3__Impl_in_rule__SurveyTerminalTypes__Group_3__34727);
            rule__SurveyTerminalTypes__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__4_in_rule__SurveyTerminalTypes__Group_3__34730);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2399:1: rule__SurveyTerminalTypes__Group_3__3__Impl : ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )* ) ) ;
    public final void rule__SurveyTerminalTypes__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2403:1: ( ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )* ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2404:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2404:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2405:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2405:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2406:1: ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_3_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2407:1: ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2407:2: rule__SurveyTerminalTypes__AnswerAssignment_3_3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_3_3_in_rule__SurveyTerminalTypes__Group_3__3__Impl4759);
            rule__SurveyTerminalTypes__AnswerAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_3_3()); 

            }

            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2410:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2411:1: ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )*
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_3_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2412:1: ( rule__SurveyTerminalTypes__AnswerAssignment_3_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2412:2: rule__SurveyTerminalTypes__AnswerAssignment_3_3
            	    {
            	    pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_3_3_in_rule__SurveyTerminalTypes__Group_3__3__Impl4771);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2423:1: rule__SurveyTerminalTypes__Group_3__4 : rule__SurveyTerminalTypes__Group_3__4__Impl ;
    public final void rule__SurveyTerminalTypes__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2427:1: ( rule__SurveyTerminalTypes__Group_3__4__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2428:2: rule__SurveyTerminalTypes__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_3__4__Impl_in_rule__SurveyTerminalTypes__Group_3__44804);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2434:1: rule__SurveyTerminalTypes__Group_3__4__Impl : ( '}' ) ;
    public final void rule__SurveyTerminalTypes__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2438:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2439:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2439:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2440:1: '}'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,14,FOLLOW_14_in_rule__SurveyTerminalTypes__Group_3__4__Impl4832); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2463:1: rule__SurveyTerminalTypes__Group_4__0 : rule__SurveyTerminalTypes__Group_4__0__Impl rule__SurveyTerminalTypes__Group_4__1 ;
    public final void rule__SurveyTerminalTypes__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2467:1: ( rule__SurveyTerminalTypes__Group_4__0__Impl rule__SurveyTerminalTypes__Group_4__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2468:2: rule__SurveyTerminalTypes__Group_4__0__Impl rule__SurveyTerminalTypes__Group_4__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__0__Impl_in_rule__SurveyTerminalTypes__Group_4__04873);
            rule__SurveyTerminalTypes__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__1_in_rule__SurveyTerminalTypes__Group_4__04876);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2475:1: rule__SurveyTerminalTypes__Group_4__0__Impl : ( () ) ;
    public final void rule__SurveyTerminalTypes__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2479:1: ( ( () ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2480:1: ( () )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2480:1: ( () )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2481:1: ()
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getDropDownAction_4_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2482:1: ()
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2484:1: 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2494:1: rule__SurveyTerminalTypes__Group_4__1 : rule__SurveyTerminalTypes__Group_4__1__Impl rule__SurveyTerminalTypes__Group_4__2 ;
    public final void rule__SurveyTerminalTypes__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2498:1: ( rule__SurveyTerminalTypes__Group_4__1__Impl rule__SurveyTerminalTypes__Group_4__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2499:2: rule__SurveyTerminalTypes__Group_4__1__Impl rule__SurveyTerminalTypes__Group_4__2
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__1__Impl_in_rule__SurveyTerminalTypes__Group_4__14934);
            rule__SurveyTerminalTypes__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__2_in_rule__SurveyTerminalTypes__Group_4__14937);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2506:1: rule__SurveyTerminalTypes__Group_4__1__Impl : ( ( rule__SurveyTerminalTypes__NameAssignment_4_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2510:1: ( ( ( rule__SurveyTerminalTypes__NameAssignment_4_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2511:1: ( ( rule__SurveyTerminalTypes__NameAssignment_4_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2511:1: ( ( rule__SurveyTerminalTypes__NameAssignment_4_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2512:1: ( rule__SurveyTerminalTypes__NameAssignment_4_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_4_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2513:1: ( rule__SurveyTerminalTypes__NameAssignment_4_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2513:2: rule__SurveyTerminalTypes__NameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__NameAssignment_4_1_in_rule__SurveyTerminalTypes__Group_4__1__Impl4964);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2523:1: rule__SurveyTerminalTypes__Group_4__2 : rule__SurveyTerminalTypes__Group_4__2__Impl rule__SurveyTerminalTypes__Group_4__3 ;
    public final void rule__SurveyTerminalTypes__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2527:1: ( rule__SurveyTerminalTypes__Group_4__2__Impl rule__SurveyTerminalTypes__Group_4__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2528:2: rule__SurveyTerminalTypes__Group_4__2__Impl rule__SurveyTerminalTypes__Group_4__3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__2__Impl_in_rule__SurveyTerminalTypes__Group_4__24994);
            rule__SurveyTerminalTypes__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__3_in_rule__SurveyTerminalTypes__Group_4__24997);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2535:1: rule__SurveyTerminalTypes__Group_4__2__Impl : ( '{' ) ;
    public final void rule__SurveyTerminalTypes__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2539:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2540:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2540:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2541:1: '{'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftCurlyBracketKeyword_4_2()); 
            match(input,12,FOLLOW_12_in_rule__SurveyTerminalTypes__Group_4__2__Impl5025); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2554:1: rule__SurveyTerminalTypes__Group_4__3 : rule__SurveyTerminalTypes__Group_4__3__Impl rule__SurveyTerminalTypes__Group_4__4 ;
    public final void rule__SurveyTerminalTypes__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2558:1: ( rule__SurveyTerminalTypes__Group_4__3__Impl rule__SurveyTerminalTypes__Group_4__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2559:2: rule__SurveyTerminalTypes__Group_4__3__Impl rule__SurveyTerminalTypes__Group_4__4
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__3__Impl_in_rule__SurveyTerminalTypes__Group_4__35056);
            rule__SurveyTerminalTypes__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__4_in_rule__SurveyTerminalTypes__Group_4__35059);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2566:1: rule__SurveyTerminalTypes__Group_4__3__Impl : ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )* ) ) ;
    public final void rule__SurveyTerminalTypes__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2570:1: ( ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )* ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2571:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2571:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2572:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2572:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2573:1: ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_4_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2574:1: ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2574:2: rule__SurveyTerminalTypes__AnswerAssignment_4_3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_4_3_in_rule__SurveyTerminalTypes__Group_4__3__Impl5088);
            rule__SurveyTerminalTypes__AnswerAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_4_3()); 

            }

            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2577:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2578:1: ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )*
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_4_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2579:1: ( rule__SurveyTerminalTypes__AnswerAssignment_4_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2579:2: rule__SurveyTerminalTypes__AnswerAssignment_4_3
            	    {
            	    pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_4_3_in_rule__SurveyTerminalTypes__Group_4__3__Impl5100);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2590:1: rule__SurveyTerminalTypes__Group_4__4 : rule__SurveyTerminalTypes__Group_4__4__Impl ;
    public final void rule__SurveyTerminalTypes__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2594:1: ( rule__SurveyTerminalTypes__Group_4__4__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2595:2: rule__SurveyTerminalTypes__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_4__4__Impl_in_rule__SurveyTerminalTypes__Group_4__45133);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2601:1: rule__SurveyTerminalTypes__Group_4__4__Impl : ( '}' ) ;
    public final void rule__SurveyTerminalTypes__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2605:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2606:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2606:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2607:1: '}'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,14,FOLLOW_14_in_rule__SurveyTerminalTypes__Group_4__4__Impl5161); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2630:1: rule__SurveyTerminalTypes__Group_5__0 : rule__SurveyTerminalTypes__Group_5__0__Impl rule__SurveyTerminalTypes__Group_5__1 ;
    public final void rule__SurveyTerminalTypes__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2634:1: ( rule__SurveyTerminalTypes__Group_5__0__Impl rule__SurveyTerminalTypes__Group_5__1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2635:2: rule__SurveyTerminalTypes__Group_5__0__Impl rule__SurveyTerminalTypes__Group_5__1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__0__Impl_in_rule__SurveyTerminalTypes__Group_5__05202);
            rule__SurveyTerminalTypes__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__1_in_rule__SurveyTerminalTypes__Group_5__05205);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2642:1: rule__SurveyTerminalTypes__Group_5__0__Impl : ( () ) ;
    public final void rule__SurveyTerminalTypes__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2646:1: ( ( () ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2647:1: ( () )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2647:1: ( () )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2648:1: ()
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRadioAction_5_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2649:1: ()
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2651:1: 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2661:1: rule__SurveyTerminalTypes__Group_5__1 : rule__SurveyTerminalTypes__Group_5__1__Impl rule__SurveyTerminalTypes__Group_5__2 ;
    public final void rule__SurveyTerminalTypes__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2665:1: ( rule__SurveyTerminalTypes__Group_5__1__Impl rule__SurveyTerminalTypes__Group_5__2 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2666:2: rule__SurveyTerminalTypes__Group_5__1__Impl rule__SurveyTerminalTypes__Group_5__2
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__1__Impl_in_rule__SurveyTerminalTypes__Group_5__15263);
            rule__SurveyTerminalTypes__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__2_in_rule__SurveyTerminalTypes__Group_5__15266);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2673:1: rule__SurveyTerminalTypes__Group_5__1__Impl : ( ( rule__SurveyTerminalTypes__NameAssignment_5_1 ) ) ;
    public final void rule__SurveyTerminalTypes__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2677:1: ( ( ( rule__SurveyTerminalTypes__NameAssignment_5_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2678:1: ( ( rule__SurveyTerminalTypes__NameAssignment_5_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2678:1: ( ( rule__SurveyTerminalTypes__NameAssignment_5_1 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2679:1: ( rule__SurveyTerminalTypes__NameAssignment_5_1 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_5_1()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2680:1: ( rule__SurveyTerminalTypes__NameAssignment_5_1 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2680:2: rule__SurveyTerminalTypes__NameAssignment_5_1
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__NameAssignment_5_1_in_rule__SurveyTerminalTypes__Group_5__1__Impl5293);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2690:1: rule__SurveyTerminalTypes__Group_5__2 : rule__SurveyTerminalTypes__Group_5__2__Impl rule__SurveyTerminalTypes__Group_5__3 ;
    public final void rule__SurveyTerminalTypes__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2694:1: ( rule__SurveyTerminalTypes__Group_5__2__Impl rule__SurveyTerminalTypes__Group_5__3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2695:2: rule__SurveyTerminalTypes__Group_5__2__Impl rule__SurveyTerminalTypes__Group_5__3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__2__Impl_in_rule__SurveyTerminalTypes__Group_5__25323);
            rule__SurveyTerminalTypes__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__3_in_rule__SurveyTerminalTypes__Group_5__25326);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2702:1: rule__SurveyTerminalTypes__Group_5__2__Impl : ( '{' ) ;
    public final void rule__SurveyTerminalTypes__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2706:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2707:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2707:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2708:1: '{'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLeftCurlyBracketKeyword_5_2()); 
            match(input,12,FOLLOW_12_in_rule__SurveyTerminalTypes__Group_5__2__Impl5354); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2721:1: rule__SurveyTerminalTypes__Group_5__3 : rule__SurveyTerminalTypes__Group_5__3__Impl rule__SurveyTerminalTypes__Group_5__4 ;
    public final void rule__SurveyTerminalTypes__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2725:1: ( rule__SurveyTerminalTypes__Group_5__3__Impl rule__SurveyTerminalTypes__Group_5__4 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2726:2: rule__SurveyTerminalTypes__Group_5__3__Impl rule__SurveyTerminalTypes__Group_5__4
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__3__Impl_in_rule__SurveyTerminalTypes__Group_5__35385);
            rule__SurveyTerminalTypes__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__4_in_rule__SurveyTerminalTypes__Group_5__35388);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2733:1: rule__SurveyTerminalTypes__Group_5__3__Impl : ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )* ) ) ;
    public final void rule__SurveyTerminalTypes__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2737:1: ( ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )* ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2738:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2738:1: ( ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )* ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2739:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 ) ) ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )* )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2739:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2740:1: ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_5_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2741:1: ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2741:2: rule__SurveyTerminalTypes__AnswerAssignment_5_3
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_5_3_in_rule__SurveyTerminalTypes__Group_5__3__Impl5417);
            rule__SurveyTerminalTypes__AnswerAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_5_3()); 

            }

            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2744:1: ( ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )* )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2745:1: ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )*
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_5_3()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2746:1: ( rule__SurveyTerminalTypes__AnswerAssignment_5_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2746:2: rule__SurveyTerminalTypes__AnswerAssignment_5_3
            	    {
            	    pushFollow(FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_5_3_in_rule__SurveyTerminalTypes__Group_5__3__Impl5429);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2757:1: rule__SurveyTerminalTypes__Group_5__4 : rule__SurveyTerminalTypes__Group_5__4__Impl ;
    public final void rule__SurveyTerminalTypes__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2761:1: ( rule__SurveyTerminalTypes__Group_5__4__Impl )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2762:2: rule__SurveyTerminalTypes__Group_5__4__Impl
            {
            pushFollow(FOLLOW_rule__SurveyTerminalTypes__Group_5__4__Impl_in_rule__SurveyTerminalTypes__Group_5__45462);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2768:1: rule__SurveyTerminalTypes__Group_5__4__Impl : ( '}' ) ;
    public final void rule__SurveyTerminalTypes__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2772:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2773:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2773:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2774:1: '}'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,14,FOLLOW_14_in_rule__SurveyTerminalTypes__Group_5__4__Impl5490); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2798:1: rule__Survey__QuestionnaireAssignment : ( ruleQuestionnaire ) ;
    public final void rule__Survey__QuestionnaireAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2802:1: ( ( ruleQuestionnaire ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2803:1: ( ruleQuestionnaire )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2803:1: ( ruleQuestionnaire )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2804:1: ruleQuestionnaire
            {
             before(grammarAccess.getSurveyAccess().getQuestionnaireQuestionnaireParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQuestionnaire_in_rule__Survey__QuestionnaireAssignment5536);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2813:1: rule__Questionnaire__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Questionnaire__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2817:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2818:1: ( RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2818:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2819:1: RULE_STRING
            {
             before(grammarAccess.getQuestionnaireAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Questionnaire__NameAssignment_15567); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2828:1: rule__Questionnaire__IdAssignment_4 : ( ruleIdentifier ) ;
    public final void rule__Questionnaire__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2832:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2833:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2833:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2834:1: ruleIdentifier
            {
             before(grammarAccess.getQuestionnaireAccess().getIdIdentifierParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Questionnaire__IdAssignment_45598);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2843:1: rule__Questionnaire__PartAssignment_5 : ( rulePart ) ;
    public final void rule__Questionnaire__PartAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2847:1: ( ( rulePart ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2848:1: ( rulePart )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2848:1: ( rulePart )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2849:1: rulePart
            {
             before(grammarAccess.getQuestionnaireAccess().getPartPartParserRuleCall_5_0()); 
            pushFollow(FOLLOW_rulePart_in_rule__Questionnaire__PartAssignment_55629);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2858:1: rule__Part__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Part__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2862:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2863:1: ( RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2863:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2864:1: RULE_STRING
            {
             before(grammarAccess.getPartAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Part__NameAssignment_15660); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2873:1: rule__Part__IdAssignment_4 : ( ruleIdentifier ) ;
    public final void rule__Part__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2877:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2878:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2878:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2879:1: ruleIdentifier
            {
             before(grammarAccess.getPartAccess().getIdIdentifierParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Part__IdAssignment_45691);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2888:1: rule__Part__QuestionAssignment_5 : ( ruleQuestion ) ;
    public final void rule__Part__QuestionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2892:1: ( ( ruleQuestion ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2893:1: ( ruleQuestion )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2893:1: ( ruleQuestion )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2894:1: ruleQuestion
            {
             before(grammarAccess.getPartAccess().getQuestionQuestionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Part__QuestionAssignment_55722);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2903:1: rule__Question__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Question__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2907:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2908:1: ( RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2908:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2909:1: RULE_STRING
            {
             before(grammarAccess.getQuestionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Question__NameAssignment_15753); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2918:1: rule__Question__IdAssignment_4 : ( ruleIdentifier ) ;
    public final void rule__Question__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2922:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2923:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2923:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2924:1: ruleIdentifier
            {
             before(grammarAccess.getQuestionAccess().getIdIdentifierParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Question__IdAssignment_45784);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2933:1: rule__Question__MandatoryAssignment_5 : ( ( 'Mandatory Field' ) ) ;
    public final void rule__Question__MandatoryAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2937:1: ( ( ( 'Mandatory Field' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2938:1: ( ( 'Mandatory Field' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2938:1: ( ( 'Mandatory Field' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2939:1: ( 'Mandatory Field' )
            {
             before(grammarAccess.getQuestionAccess().getMandatoryMandatoryFieldKeyword_5_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2940:1: ( 'Mandatory Field' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2941:1: 'Mandatory Field'
            {
             before(grammarAccess.getQuestionAccess().getMandatoryMandatoryFieldKeyword_5_0()); 
            match(input,27,FOLLOW_27_in_rule__Question__MandatoryAssignment_55820); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2956:1: rule__Question__QuestionTypeAssignment_7 : ( ruleSurveyTerminalTypes ) ;
    public final void rule__Question__QuestionTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2960:1: ( ( ruleSurveyTerminalTypes ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2961:1: ( ruleSurveyTerminalTypes )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2961:1: ( ruleSurveyTerminalTypes )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2962:1: ruleSurveyTerminalTypes
            {
             before(grammarAccess.getQuestionAccess().getQuestionTypeSurveyTerminalTypesParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleSurveyTerminalTypes_in_rule__Question__QuestionTypeAssignment_75859);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2971:1: rule__MatrixQuestion__IdAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__MatrixQuestion__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2975:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2976:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2976:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2977:1: ruleIdentifier
            {
             before(grammarAccess.getMatrixQuestionAccess().getIdIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__MatrixQuestion__IdAssignment_15890);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2986:1: rule__MatrixQuestion__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__MatrixQuestion__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2990:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2991:1: ( RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2991:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2992:1: RULE_STRING
            {
             before(grammarAccess.getMatrixQuestionAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MatrixQuestion__NameAssignment_35921); 
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


    // $ANTLR start "rule__MatrixScale__NameAssignment"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3001:1: rule__MatrixScale__NameAssignment : ( ruleIdentifier ) ;
    public final void rule__MatrixScale__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3005:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3006:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3006:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3007:1: ruleIdentifier
            {
             before(grammarAccess.getMatrixScaleAccess().getNameIdentifierParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__MatrixScale__NameAssignment5952);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getMatrixScaleAccess().getNameIdentifierParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixScale__NameAssignment"


    // $ANTLR start "rule__Answer__IdAssignment_1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3016:1: rule__Answer__IdAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__Answer__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3020:1: ( ( ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3021:1: ( ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3021:1: ( ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3022:1: ruleIdentifier
            {
             before(grammarAccess.getAnswerAccess().getIdIdentifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Answer__IdAssignment_15983);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3031:1: rule__Answer__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Answer__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3035:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3036:1: ( RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3036:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3037:1: RULE_STRING
            {
             before(grammarAccess.getAnswerAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Answer__NameAssignment_36014); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3046:1: rule__SurveyTerminalTypes__NameAssignment_0_1 : ( ( 'TextLine' ) ) ;
    public final void rule__SurveyTerminalTypes__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3050:1: ( ( ( 'TextLine' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3051:1: ( ( 'TextLine' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3051:1: ( ( 'TextLine' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3052:1: ( 'TextLine' )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameTextLineKeyword_0_1_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3053:1: ( 'TextLine' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3054:1: 'TextLine'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameTextLineKeyword_0_1_0()); 
            match(input,28,FOLLOW_28_in_rule__SurveyTerminalTypes__NameAssignment_0_16050); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3069:1: rule__SurveyTerminalTypes__LengthAssignment_0_3 : ( RULE_INT ) ;
    public final void rule__SurveyTerminalTypes__LengthAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3073:1: ( ( RULE_INT ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3074:1: ( RULE_INT )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3074:1: ( RULE_INT )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3075:1: RULE_INT
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLengthINTTerminalRuleCall_0_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SurveyTerminalTypes__LengthAssignment_0_36089); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3084:1: rule__SurveyTerminalTypes__NameAssignment_1_1 : ( ( 'TextBlock' ) ) ;
    public final void rule__SurveyTerminalTypes__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3088:1: ( ( ( 'TextBlock' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3089:1: ( ( 'TextBlock' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3089:1: ( ( 'TextBlock' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3090:1: ( 'TextBlock' )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameTextBlockKeyword_1_1_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3091:1: ( 'TextBlock' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3092:1: 'TextBlock'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameTextBlockKeyword_1_1_0()); 
            match(input,29,FOLLOW_29_in_rule__SurveyTerminalTypes__NameAssignment_1_16125); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3107:1: rule__SurveyTerminalTypes__LengthAssignment_1_3 : ( RULE_INT ) ;
    public final void rule__SurveyTerminalTypes__LengthAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3111:1: ( ( RULE_INT ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3112:1: ( RULE_INT )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3112:1: ( RULE_INT )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3113:1: RULE_INT
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getLengthINTTerminalRuleCall_1_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SurveyTerminalTypes__LengthAssignment_1_36164); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3122:1: rule__SurveyTerminalTypes__NameAssignment_2_1 : ( ( 'Matrix' ) ) ;
    public final void rule__SurveyTerminalTypes__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3126:1: ( ( ( 'Matrix' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3127:1: ( ( 'Matrix' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3127:1: ( ( 'Matrix' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3128:1: ( 'Matrix' )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameMatrixKeyword_2_1_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3129:1: ( 'Matrix' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3130:1: 'Matrix'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameMatrixKeyword_2_1_0()); 
            match(input,30,FOLLOW_30_in_rule__SurveyTerminalTypes__NameAssignment_2_16200); 
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


    // $ANTLR start "rule__SurveyTerminalTypes__MatrixScaleAssignment_2_5"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3145:1: rule__SurveyTerminalTypes__MatrixScaleAssignment_2_5 : ( ruleMatrixScale ) ;
    public final void rule__SurveyTerminalTypes__MatrixScaleAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3149:1: ( ( ruleMatrixScale ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3150:1: ( ruleMatrixScale )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3150:1: ( ruleMatrixScale )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3151:1: ruleMatrixScale
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getMatrixScaleMatrixScaleParserRuleCall_2_5_0()); 
            pushFollow(FOLLOW_ruleMatrixScale_in_rule__SurveyTerminalTypes__MatrixScaleAssignment_2_56239);
            ruleMatrixScale();

            state._fsp--;

             after(grammarAccess.getSurveyTerminalTypesAccess().getMatrixScaleMatrixScaleParserRuleCall_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__MatrixScaleAssignment_2_5"


    // $ANTLR start "rule__SurveyTerminalTypes__MatrixScaleAssignment_2_6_1"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3160:1: rule__SurveyTerminalTypes__MatrixScaleAssignment_2_6_1 : ( ruleMatrixScale ) ;
    public final void rule__SurveyTerminalTypes__MatrixScaleAssignment_2_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3164:1: ( ( ruleMatrixScale ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3165:1: ( ruleMatrixScale )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3165:1: ( ruleMatrixScale )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3166:1: ruleMatrixScale
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getMatrixScaleMatrixScaleParserRuleCall_2_6_1_0()); 
            pushFollow(FOLLOW_ruleMatrixScale_in_rule__SurveyTerminalTypes__MatrixScaleAssignment_2_6_16270);
            ruleMatrixScale();

            state._fsp--;

             after(grammarAccess.getSurveyTerminalTypesAccess().getMatrixScaleMatrixScaleParserRuleCall_2_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyTerminalTypes__MatrixScaleAssignment_2_6_1"


    // $ANTLR start "rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10"
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3175:1: rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10 : ( ruleMatrixQuestion ) ;
    public final void rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3179:1: ( ( ruleMatrixQuestion ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3180:1: ( ruleMatrixQuestion )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3180:1: ( ruleMatrixQuestion )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3181:1: ruleMatrixQuestion
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getMatrixQuestionMatrixQuestionParserRuleCall_2_10_0()); 
            pushFollow(FOLLOW_ruleMatrixQuestion_in_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_106301);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3190:1: rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1 : ( ruleMatrixQuestion ) ;
    public final void rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3194:1: ( ( ruleMatrixQuestion ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3195:1: ( ruleMatrixQuestion )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3195:1: ( ruleMatrixQuestion )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3196:1: ruleMatrixQuestion
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getMatrixQuestionMatrixQuestionParserRuleCall_2_11_1_0()); 
            pushFollow(FOLLOW_ruleMatrixQuestion_in_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_16332);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3205:1: rule__SurveyTerminalTypes__NameAssignment_3_1 : ( ( 'ComboBox' ) ) ;
    public final void rule__SurveyTerminalTypes__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3209:1: ( ( ( 'ComboBox' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3210:1: ( ( 'ComboBox' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3210:1: ( ( 'ComboBox' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3211:1: ( 'ComboBox' )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameComboBoxKeyword_3_1_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3212:1: ( 'ComboBox' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3213:1: 'ComboBox'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameComboBoxKeyword_3_1_0()); 
            match(input,31,FOLLOW_31_in_rule__SurveyTerminalTypes__NameAssignment_3_16368); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3228:1: rule__SurveyTerminalTypes__AnswerAssignment_3_3 : ( ruleAnswer ) ;
    public final void rule__SurveyTerminalTypes__AnswerAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3232:1: ( ( ruleAnswer ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3233:1: ( ruleAnswer )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3233:1: ( ruleAnswer )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3234:1: ruleAnswer
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_3_36407);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3243:1: rule__SurveyTerminalTypes__NameAssignment_4_1 : ( ( 'DropDown' ) ) ;
    public final void rule__SurveyTerminalTypes__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3247:1: ( ( ( 'DropDown' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3248:1: ( ( 'DropDown' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3248:1: ( ( 'DropDown' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3249:1: ( 'DropDown' )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameDropDownKeyword_4_1_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3250:1: ( 'DropDown' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3251:1: 'DropDown'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameDropDownKeyword_4_1_0()); 
            match(input,32,FOLLOW_32_in_rule__SurveyTerminalTypes__NameAssignment_4_16443); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3266:1: rule__SurveyTerminalTypes__AnswerAssignment_4_3 : ( ruleAnswer ) ;
    public final void rule__SurveyTerminalTypes__AnswerAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3270:1: ( ( ruleAnswer ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3271:1: ( ruleAnswer )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3271:1: ( ruleAnswer )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3272:1: ruleAnswer
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_4_36482);
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3281:1: rule__SurveyTerminalTypes__NameAssignment_5_1 : ( ( 'Radio' ) ) ;
    public final void rule__SurveyTerminalTypes__NameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3285:1: ( ( ( 'Radio' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3286:1: ( ( 'Radio' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3286:1: ( ( 'Radio' ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3287:1: ( 'Radio' )
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameRadioKeyword_5_1_0()); 
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3288:1: ( 'Radio' )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3289:1: 'Radio'
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getNameRadioKeyword_5_1_0()); 
            match(input,33,FOLLOW_33_in_rule__SurveyTerminalTypes__NameAssignment_5_16518); 
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
    // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3304:1: rule__SurveyTerminalTypes__AnswerAssignment_5_3 : ( ruleAnswer ) ;
    public final void rule__SurveyTerminalTypes__AnswerAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3308:1: ( ( ruleAnswer ) )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3309:1: ( ruleAnswer )
            {
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3309:1: ( ruleAnswer )
            // ../de.nordakademie.mwi13a.team1.survey.ui/src-gen/de/nordakademie/mwi13a/team1/survey/ui/contentassist/antlr/internal/InternalSurvey.g:3310:1: ruleAnswer
            {
             before(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_5_36557);
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
    public static final BitSet FOLLOW_ruleMatrixScale_in_entryRuleMatrixScale378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrixScale385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixScale__NameAssignment_in_ruleMatrixScale411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnswer445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__0_in_ruleAnswer471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSurveyTerminalTypes_in_entryRuleSurveyTerminalTypes498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurveyTerminalTypes505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Alternatives_in_ruleSurveyTerminalTypes531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Alternatives_in_ruleIdentifier591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__0_in_rule__SurveyTerminalTypes__Alternatives627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__0_in_rule__SurveyTerminalTypes__Alternatives645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__0_in_rule__SurveyTerminalTypes__Alternatives663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__0_in_rule__SurveyTerminalTypes__Alternatives681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__0_in_rule__SurveyTerminalTypes__Alternatives699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__0_in_rule__SurveyTerminalTypes__Alternatives717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Identifier__Alternatives750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Identifier__Alternatives767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Identifier__Alternatives784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__0__Impl_in_rule__Questionnaire__Group__0814 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__1_in_rule__Questionnaire__Group__0817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Questionnaire__Group__0__Impl845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__1__Impl_in_rule__Questionnaire__Group__1876 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__2_in_rule__Questionnaire__Group__1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__NameAssignment_1_in_rule__Questionnaire__Group__1__Impl906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__2__Impl_in_rule__Questionnaire__Group__2936 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__3_in_rule__Questionnaire__Group__2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Questionnaire__Group__2__Impl967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__3__Impl_in_rule__Questionnaire__Group__3998 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__4_in_rule__Questionnaire__Group__31001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Questionnaire__Group__3__Impl1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__4__Impl_in_rule__Questionnaire__Group__41060 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__5_in_rule__Questionnaire__Group__41063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__IdAssignment_4_in_rule__Questionnaire__Group__4__Impl1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__5__Impl_in_rule__Questionnaire__Group__51120 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__6_in_rule__Questionnaire__Group__51123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__PartAssignment_5_in_rule__Questionnaire__Group__5__Impl1152 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Questionnaire__PartAssignment_5_in_rule__Questionnaire__Group__5__Impl1164 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__6__Impl_in_rule__Questionnaire__Group__61197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Questionnaire__Group__6__Impl1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__0__Impl_in_rule__Part__Group__01270 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Part__Group__1_in_rule__Part__Group__01273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Part__Group__0__Impl1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__1__Impl_in_rule__Part__Group__11332 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Part__Group__2_in_rule__Part__Group__11335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__NameAssignment_1_in_rule__Part__Group__1__Impl1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__2__Impl_in_rule__Part__Group__21392 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Part__Group__3_in_rule__Part__Group__21395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Part__Group__2__Impl1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__3__Impl_in_rule__Part__Group__31454 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Part__Group__4_in_rule__Part__Group__31457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Part__Group__3__Impl1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__4__Impl_in_rule__Part__Group__41516 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Part__Group__5_in_rule__Part__Group__41519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__IdAssignment_4_in_rule__Part__Group__4__Impl1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__5__Impl_in_rule__Part__Group__51576 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Part__Group__6_in_rule__Part__Group__51579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__QuestionAssignment_5_in_rule__Part__Group__5__Impl1608 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Part__QuestionAssignment_5_in_rule__Part__Group__5__Impl1620 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Part__Group__6__Impl_in_rule__Part__Group__61653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Part__Group__6__Impl1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__01726 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Question__Group__1_in_rule__Question__Group__01729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Question__Group__0__Impl1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__11788 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Question__Group__2_in_rule__Question__Group__11791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__NameAssignment_1_in_rule__Question__Group__1__Impl1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__21848 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Question__Group__3_in_rule__Question__Group__21851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Question__Group__2__Impl1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__31910 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Question__Group__4_in_rule__Question__Group__31913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Question__Group__3__Impl1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__41972 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_rule__Question__Group__5_in_rule__Question__Group__41975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__IdAssignment_4_in_rule__Question__Group__4__Impl2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__52032 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_rule__Question__Group__6_in_rule__Question__Group__52035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__MandatoryAssignment_5_in_rule__Question__Group__5__Impl2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__62093 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_rule__Question__Group__7_in_rule__Question__Group__62096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Question__Group__6__Impl2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__7__Impl_in_rule__Question__Group__72155 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Question__Group__8_in_rule__Question__Group__72158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__QuestionTypeAssignment_7_in_rule__Question__Group__7__Impl2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__8__Impl_in_rule__Question__Group__82215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Question__Group__8__Impl2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__0__Impl_in_rule__MatrixQuestion__Group__02292 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__1_in_rule__MatrixQuestion__Group__02295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MatrixQuestion__Group__0__Impl2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__1__Impl_in_rule__MatrixQuestion__Group__12354 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__2_in_rule__MatrixQuestion__Group__12357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__IdAssignment_1_in_rule__MatrixQuestion__Group__1__Impl2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__2__Impl_in_rule__MatrixQuestion__Group__22414 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__3_in_rule__MatrixQuestion__Group__22417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MatrixQuestion__Group__2__Impl2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__Group__3__Impl_in_rule__MatrixQuestion__Group__32476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MatrixQuestion__NameAssignment_3_in_rule__MatrixQuestion__Group__3__Impl2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__02541 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__02544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Answer__Group__0__Impl2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__12603 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__12606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__IdAssignment_1_in_rule__Answer__Group__1__Impl2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__22663 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Answer__Group__3_in_rule__Answer__Group__22666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Answer__Group__2__Impl2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__3__Impl_in_rule__Answer__Group__32725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__NameAssignment_3_in_rule__Answer__Group__3__Impl2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__0__Impl_in_rule__SurveyTerminalTypes__Group_0__02790 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__1_in_rule__SurveyTerminalTypes__Group_0__02793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__1__Impl_in_rule__SurveyTerminalTypes__Group_0__12851 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__2_in_rule__SurveyTerminalTypes__Group_0__12854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__NameAssignment_0_1_in_rule__SurveyTerminalTypes__Group_0__1__Impl2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__2__Impl_in_rule__SurveyTerminalTypes__Group_0__22911 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__3_in_rule__SurveyTerminalTypes__Group_0__22914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SurveyTerminalTypes__Group_0__2__Impl2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__3__Impl_in_rule__SurveyTerminalTypes__Group_0__32973 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__4_in_rule__SurveyTerminalTypes__Group_0__32976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__LengthAssignment_0_3_in_rule__SurveyTerminalTypes__Group_0__3__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_0__4__Impl_in_rule__SurveyTerminalTypes__Group_0__43033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SurveyTerminalTypes__Group_0__4__Impl3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__0__Impl_in_rule__SurveyTerminalTypes__Group_1__03102 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__1_in_rule__SurveyTerminalTypes__Group_1__03105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__1__Impl_in_rule__SurveyTerminalTypes__Group_1__13163 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__2_in_rule__SurveyTerminalTypes__Group_1__13166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__NameAssignment_1_1_in_rule__SurveyTerminalTypes__Group_1__1__Impl3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__2__Impl_in_rule__SurveyTerminalTypes__Group_1__23223 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__3_in_rule__SurveyTerminalTypes__Group_1__23226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SurveyTerminalTypes__Group_1__2__Impl3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__3__Impl_in_rule__SurveyTerminalTypes__Group_1__33285 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__4_in_rule__SurveyTerminalTypes__Group_1__33288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__LengthAssignment_1_3_in_rule__SurveyTerminalTypes__Group_1__3__Impl3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_1__4__Impl_in_rule__SurveyTerminalTypes__Group_1__43345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SurveyTerminalTypes__Group_1__4__Impl3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__0__Impl_in_rule__SurveyTerminalTypes__Group_2__03414 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__1_in_rule__SurveyTerminalTypes__Group_2__03417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__1__Impl_in_rule__SurveyTerminalTypes__Group_2__13475 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__2_in_rule__SurveyTerminalTypes__Group_2__13478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__NameAssignment_2_1_in_rule__SurveyTerminalTypes__Group_2__1__Impl3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__2__Impl_in_rule__SurveyTerminalTypes__Group_2__23535 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__3_in_rule__SurveyTerminalTypes__Group_2__23538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SurveyTerminalTypes__Group_2__2__Impl3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__3__Impl_in_rule__SurveyTerminalTypes__Group_2__33597 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__4_in_rule__SurveyTerminalTypes__Group_2__33600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SurveyTerminalTypes__Group_2__3__Impl3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__4__Impl_in_rule__SurveyTerminalTypes__Group_2__43659 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__5_in_rule__SurveyTerminalTypes__Group_2__43662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SurveyTerminalTypes__Group_2__4__Impl3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__5__Impl_in_rule__SurveyTerminalTypes__Group_2__53721 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__6_in_rule__SurveyTerminalTypes__Group_2__53724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__MatrixScaleAssignment_2_5_in_rule__SurveyTerminalTypes__Group_2__5__Impl3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__6__Impl_in_rule__SurveyTerminalTypes__Group_2__63781 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__7_in_rule__SurveyTerminalTypes__Group_2__63784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_6__0_in_rule__SurveyTerminalTypes__Group_2__6__Impl3811 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__7__Impl_in_rule__SurveyTerminalTypes__Group_2__73842 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__8_in_rule__SurveyTerminalTypes__Group_2__73845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SurveyTerminalTypes__Group_2__7__Impl3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__8__Impl_in_rule__SurveyTerminalTypes__Group_2__83904 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__9_in_rule__SurveyTerminalTypes__Group_2__83907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SurveyTerminalTypes__Group_2__8__Impl3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__9__Impl_in_rule__SurveyTerminalTypes__Group_2__93966 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__10_in_rule__SurveyTerminalTypes__Group_2__93969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SurveyTerminalTypes__Group_2__9__Impl3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__10__Impl_in_rule__SurveyTerminalTypes__Group_2__104028 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__11_in_rule__SurveyTerminalTypes__Group_2__104031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10_in_rule__SurveyTerminalTypes__Group_2__10__Impl4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__11__Impl_in_rule__SurveyTerminalTypes__Group_2__114088 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__12_in_rule__SurveyTerminalTypes__Group_2__114091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_11__0_in_rule__SurveyTerminalTypes__Group_2__11__Impl4118 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__12__Impl_in_rule__SurveyTerminalTypes__Group_2__124149 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__13_in_rule__SurveyTerminalTypes__Group_2__124152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SurveyTerminalTypes__Group_2__12__Impl4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2__13__Impl_in_rule__SurveyTerminalTypes__Group_2__134211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SurveyTerminalTypes__Group_2__13__Impl4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_6__0__Impl_in_rule__SurveyTerminalTypes__Group_2_6__04298 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_6__1_in_rule__SurveyTerminalTypes__Group_2_6__04301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SurveyTerminalTypes__Group_2_6__0__Impl4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_6__1__Impl_in_rule__SurveyTerminalTypes__Group_2_6__14360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__MatrixScaleAssignment_2_6_1_in_rule__SurveyTerminalTypes__Group_2_6__1__Impl4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_11__0__Impl_in_rule__SurveyTerminalTypes__Group_2_11__04421 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_11__1_in_rule__SurveyTerminalTypes__Group_2_11__04424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SurveyTerminalTypes__Group_2_11__0__Impl4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_2_11__1__Impl_in_rule__SurveyTerminalTypes__Group_2_11__14483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1_in_rule__SurveyTerminalTypes__Group_2_11__1__Impl4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__0__Impl_in_rule__SurveyTerminalTypes__Group_3__04544 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__1_in_rule__SurveyTerminalTypes__Group_3__04547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__1__Impl_in_rule__SurveyTerminalTypes__Group_3__14605 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__2_in_rule__SurveyTerminalTypes__Group_3__14608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__NameAssignment_3_1_in_rule__SurveyTerminalTypes__Group_3__1__Impl4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__2__Impl_in_rule__SurveyTerminalTypes__Group_3__24665 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__3_in_rule__SurveyTerminalTypes__Group_3__24668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SurveyTerminalTypes__Group_3__2__Impl4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__3__Impl_in_rule__SurveyTerminalTypes__Group_3__34727 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__4_in_rule__SurveyTerminalTypes__Group_3__34730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_3_3_in_rule__SurveyTerminalTypes__Group_3__3__Impl4759 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_3_3_in_rule__SurveyTerminalTypes__Group_3__3__Impl4771 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_3__4__Impl_in_rule__SurveyTerminalTypes__Group_3__44804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SurveyTerminalTypes__Group_3__4__Impl4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__0__Impl_in_rule__SurveyTerminalTypes__Group_4__04873 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__1_in_rule__SurveyTerminalTypes__Group_4__04876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__1__Impl_in_rule__SurveyTerminalTypes__Group_4__14934 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__2_in_rule__SurveyTerminalTypes__Group_4__14937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__NameAssignment_4_1_in_rule__SurveyTerminalTypes__Group_4__1__Impl4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__2__Impl_in_rule__SurveyTerminalTypes__Group_4__24994 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__3_in_rule__SurveyTerminalTypes__Group_4__24997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SurveyTerminalTypes__Group_4__2__Impl5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__3__Impl_in_rule__SurveyTerminalTypes__Group_4__35056 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__4_in_rule__SurveyTerminalTypes__Group_4__35059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_4_3_in_rule__SurveyTerminalTypes__Group_4__3__Impl5088 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_4_3_in_rule__SurveyTerminalTypes__Group_4__3__Impl5100 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_4__4__Impl_in_rule__SurveyTerminalTypes__Group_4__45133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SurveyTerminalTypes__Group_4__4__Impl5161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__0__Impl_in_rule__SurveyTerminalTypes__Group_5__05202 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__1_in_rule__SurveyTerminalTypes__Group_5__05205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__1__Impl_in_rule__SurveyTerminalTypes__Group_5__15263 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__2_in_rule__SurveyTerminalTypes__Group_5__15266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__NameAssignment_5_1_in_rule__SurveyTerminalTypes__Group_5__1__Impl5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__2__Impl_in_rule__SurveyTerminalTypes__Group_5__25323 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__3_in_rule__SurveyTerminalTypes__Group_5__25326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SurveyTerminalTypes__Group_5__2__Impl5354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__3__Impl_in_rule__SurveyTerminalTypes__Group_5__35385 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__4_in_rule__SurveyTerminalTypes__Group_5__35388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_5_3_in_rule__SurveyTerminalTypes__Group_5__3__Impl5417 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__AnswerAssignment_5_3_in_rule__SurveyTerminalTypes__Group_5__3__Impl5429 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SurveyTerminalTypes__Group_5__4__Impl_in_rule__SurveyTerminalTypes__Group_5__45462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SurveyTerminalTypes__Group_5__4__Impl5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_rule__Survey__QuestionnaireAssignment5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Questionnaire__NameAssignment_15567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Questionnaire__IdAssignment_45598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_rule__Questionnaire__PartAssignment_55629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Part__NameAssignment_15660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Part__IdAssignment_45691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Part__QuestionAssignment_55722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Question__NameAssignment_15753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Question__IdAssignment_45784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Question__MandatoryAssignment_55820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSurveyTerminalTypes_in_rule__Question__QuestionTypeAssignment_75859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__MatrixQuestion__IdAssignment_15890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MatrixQuestion__NameAssignment_35921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__MatrixScale__NameAssignment5952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Answer__IdAssignment_15983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Answer__NameAssignment_36014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SurveyTerminalTypes__NameAssignment_0_16050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SurveyTerminalTypes__LengthAssignment_0_36089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SurveyTerminalTypes__NameAssignment_1_16125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SurveyTerminalTypes__LengthAssignment_1_36164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SurveyTerminalTypes__NameAssignment_2_16200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixScale_in_rule__SurveyTerminalTypes__MatrixScaleAssignment_2_56239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixScale_in_rule__SurveyTerminalTypes__MatrixScaleAssignment_2_6_16270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixQuestion_in_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_106301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixQuestion_in_rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_16332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SurveyTerminalTypes__NameAssignment_3_16368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_3_36407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SurveyTerminalTypes__NameAssignment_4_16443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_4_36482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SurveyTerminalTypes__NameAssignment_5_16518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_rule__SurveyTerminalTypes__AnswerAssignment_5_36557 = new BitSet(new long[]{0x0000000000000002L});

}