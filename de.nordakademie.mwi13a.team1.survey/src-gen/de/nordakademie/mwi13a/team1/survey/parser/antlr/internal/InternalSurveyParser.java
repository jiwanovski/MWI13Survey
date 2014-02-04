package de.nordakademie.mwi13a.team1.survey.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.nordakademie.mwi13a.team1.survey.services.SurveyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSurveyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Questionnaire:'", "'{'", "'Questionnaire-ID:'", "'}'", "'Part:'", "'Part-ID:'", "'Question:'", "'Question-ID:'", "'Mandatory Field'", "'Type:'", "'Answer-ID:'", "'Answer:'", "'TextLine'", "'('", "')'", "'TextBlock'", "'Matrix'", "'Scale:'", "'|'", "'Questions:'", "'ComboBox'", "'DropDown'", "'Radio'"
    };
    public static final int RULE_ID=6;
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
    public static final int RULE_STRING=4;
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
    public static final int RULE_INT=5;
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
    public String getGrammarFileName() { return "../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g"; }



     	private SurveyGrammarAccess grammarAccess;
     	
        public InternalSurveyParser(TokenStream input, SurveyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Survey";	
       	}
       	
       	@Override
       	protected SurveyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSurvey"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:67:1: entryRuleSurvey returns [EObject current=null] : iv_ruleSurvey= ruleSurvey EOF ;
    public final EObject entryRuleSurvey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurvey = null;


        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:68:2: (iv_ruleSurvey= ruleSurvey EOF )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:69:2: iv_ruleSurvey= ruleSurvey EOF
            {
             newCompositeNode(grammarAccess.getSurveyRule()); 
            pushFollow(FOLLOW_ruleSurvey_in_entryRuleSurvey75);
            iv_ruleSurvey=ruleSurvey();

            state._fsp--;

             current =iv_ruleSurvey; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSurvey85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:76:1: ruleSurvey returns [EObject current=null] : ( (lv_questionnaire_0_0= ruleQuestionnaire ) )+ ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        EObject lv_questionnaire_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:79:28: ( ( (lv_questionnaire_0_0= ruleQuestionnaire ) )+ )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:80:1: ( (lv_questionnaire_0_0= ruleQuestionnaire ) )+
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:80:1: ( (lv_questionnaire_0_0= ruleQuestionnaire ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:81:1: (lv_questionnaire_0_0= ruleQuestionnaire )
            	    {
            	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:81:1: (lv_questionnaire_0_0= ruleQuestionnaire )
            	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:82:3: lv_questionnaire_0_0= ruleQuestionnaire
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionnaireQuestionnaireParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestionnaire_in_ruleSurvey130);
            	    lv_questionnaire_0_0=ruleQuestionnaire();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questionnaire",
            	            		lv_questionnaire_0_0, 
            	            		"Questionnaire");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRuleQuestionnaire"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:106:1: entryRuleQuestionnaire returns [EObject current=null] : iv_ruleQuestionnaire= ruleQuestionnaire EOF ;
    public final EObject entryRuleQuestionnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionnaire = null;


        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:107:2: (iv_ruleQuestionnaire= ruleQuestionnaire EOF )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:108:2: iv_ruleQuestionnaire= ruleQuestionnaire EOF
            {
             newCompositeNode(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire166);
            iv_ruleQuestionnaire=ruleQuestionnaire();

            state._fsp--;

             current =iv_ruleQuestionnaire; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionnaire176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestionnaire"


    // $ANTLR start "ruleQuestionnaire"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:115:1: ruleQuestionnaire returns [EObject current=null] : (otherlv_0= 'Questionnaire:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Questionnaire-ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_part_5_0= rulePart ) )+ otherlv_6= '}' ) ;
    public final EObject ruleQuestionnaire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_part_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:118:28: ( (otherlv_0= 'Questionnaire:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Questionnaire-ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_part_5_0= rulePart ) )+ otherlv_6= '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:119:1: (otherlv_0= 'Questionnaire:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Questionnaire-ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_part_5_0= rulePart ) )+ otherlv_6= '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:119:1: (otherlv_0= 'Questionnaire:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Questionnaire-ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_part_5_0= rulePart ) )+ otherlv_6= '}' )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:119:3: otherlv_0= 'Questionnaire:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Questionnaire-ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_part_5_0= rulePart ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleQuestionnaire213); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0());
                
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:123:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:124:1: (lv_name_1_0= RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:124:1: (lv_name_1_0= RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:125:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestionnaire230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQuestionnaireAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionnaireRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleQuestionnaire247); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleQuestionnaire259); 

                	newLeafNode(otherlv_3, grammarAccess.getQuestionnaireAccess().getQuestionnaireIDKeyword_3());
                
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:149:1: ( (lv_id_4_0= ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:150:1: (lv_id_4_0= ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:150:1: (lv_id_4_0= ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:151:3: lv_id_4_0= ruleIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getIdIdentifierParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleIdentifier_in_ruleQuestionnaire280);
            lv_id_4_0=ruleIdentifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_4_0, 
                    		"Identifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:167:2: ( (lv_part_5_0= rulePart ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:168:1: (lv_part_5_0= rulePart )
            	    {
            	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:168:1: (lv_part_5_0= rulePart )
            	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:169:3: lv_part_5_0= rulePart
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getPartPartParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePart_in_ruleQuestionnaire301);
            	    lv_part_5_0=rulePart();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"part",
            	            		lv_part_5_0, 
            	            		"Part");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleQuestionnaire314); 

                	newLeafNode(otherlv_6, grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestionnaire"


    // $ANTLR start "entryRulePart"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:197:1: entryRulePart returns [EObject current=null] : iv_rulePart= rulePart EOF ;
    public final EObject entryRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePart = null;


        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:198:2: (iv_rulePart= rulePart EOF )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:199:2: iv_rulePart= rulePart EOF
            {
             newCompositeNode(grammarAccess.getPartRule()); 
            pushFollow(FOLLOW_rulePart_in_entryRulePart350);
            iv_rulePart=rulePart();

            state._fsp--;

             current =iv_rulePart; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePart360); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePart"


    // $ANTLR start "rulePart"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:206:1: rulePart returns [EObject current=null] : (otherlv_0= 'Part:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Part-ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_question_5_0= ruleQuestion ) )+ otherlv_6= '}' ) ;
    public final EObject rulePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_question_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:209:28: ( (otherlv_0= 'Part:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Part-ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_question_5_0= ruleQuestion ) )+ otherlv_6= '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:210:1: (otherlv_0= 'Part:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Part-ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_question_5_0= ruleQuestion ) )+ otherlv_6= '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:210:1: (otherlv_0= 'Part:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Part-ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_question_5_0= ruleQuestion ) )+ otherlv_6= '}' )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:210:3: otherlv_0= 'Part:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Part-ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_question_5_0= ruleQuestion ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_rulePart397); 

                	newLeafNode(otherlv_0, grammarAccess.getPartAccess().getPartKeyword_0());
                
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:214:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:215:1: (lv_name_1_0= RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:215:1: (lv_name_1_0= RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:216:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePart414); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPartAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePart431); 

                	newLeafNode(otherlv_2, grammarAccess.getPartAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,16,FOLLOW_16_in_rulePart443); 

                	newLeafNode(otherlv_3, grammarAccess.getPartAccess().getPartIDKeyword_3());
                
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:240:1: ( (lv_id_4_0= ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:241:1: (lv_id_4_0= ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:241:1: (lv_id_4_0= ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:242:3: lv_id_4_0= ruleIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getPartAccess().getIdIdentifierParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleIdentifier_in_rulePart464);
            lv_id_4_0=ruleIdentifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPartRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_4_0, 
                    		"Identifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:258:2: ( (lv_question_5_0= ruleQuestion ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:259:1: (lv_question_5_0= ruleQuestion )
            	    {
            	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:259:1: (lv_question_5_0= ruleQuestion )
            	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:260:3: lv_question_5_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPartAccess().getQuestionQuestionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestion_in_rulePart485);
            	    lv_question_5_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPartRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"question",
            	            		lv_question_5_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_rulePart498); 

                	newLeafNode(otherlv_6, grammarAccess.getPartAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePart"


    // $ANTLR start "entryRuleQuestion"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:288:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:289:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:290:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion534);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion544); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:297:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'Question:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Question-ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_mandatory_5_0= 'Mandatory Field' ) )? otherlv_6= 'Type:' ( (lv_questionType_7_0= ruleSurveyTerminalTypes ) ) otherlv_8= '}' ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_mandatory_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_questionType_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:300:28: ( (otherlv_0= 'Question:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Question-ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_mandatory_5_0= 'Mandatory Field' ) )? otherlv_6= 'Type:' ( (lv_questionType_7_0= ruleSurveyTerminalTypes ) ) otherlv_8= '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:301:1: (otherlv_0= 'Question:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Question-ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_mandatory_5_0= 'Mandatory Field' ) )? otherlv_6= 'Type:' ( (lv_questionType_7_0= ruleSurveyTerminalTypes ) ) otherlv_8= '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:301:1: (otherlv_0= 'Question:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Question-ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_mandatory_5_0= 'Mandatory Field' ) )? otherlv_6= 'Type:' ( (lv_questionType_7_0= ruleSurveyTerminalTypes ) ) otherlv_8= '}' )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:301:3: otherlv_0= 'Question:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Question-ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_mandatory_5_0= 'Mandatory Field' ) )? otherlv_6= 'Type:' ( (lv_questionType_7_0= ruleSurveyTerminalTypes ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleQuestion581); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
                
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:305:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:306:1: (lv_name_1_0= RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:306:1: (lv_name_1_0= RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:307:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestion598); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQuestionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleQuestion615); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleQuestion627); 

                	newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getQuestionIDKeyword_3());
                
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:331:1: ( (lv_id_4_0= ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:332:1: (lv_id_4_0= ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:332:1: (lv_id_4_0= ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:333:3: lv_id_4_0= ruleIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getIdIdentifierParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleIdentifier_in_ruleQuestion648);
            lv_id_4_0=ruleIdentifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_4_0, 
                    		"Identifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:349:2: ( (lv_mandatory_5_0= 'Mandatory Field' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:350:1: (lv_mandatory_5_0= 'Mandatory Field' )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:350:1: (lv_mandatory_5_0= 'Mandatory Field' )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:351:3: lv_mandatory_5_0= 'Mandatory Field'
                    {
                    lv_mandatory_5_0=(Token)match(input,19,FOLLOW_19_in_ruleQuestion666); 

                            newLeafNode(lv_mandatory_5_0, grammarAccess.getQuestionAccess().getMandatoryMandatoryFieldKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "mandatory", true, "Mandatory Field");
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleQuestion692); 

                	newLeafNode(otherlv_6, grammarAccess.getQuestionAccess().getTypeKeyword_6());
                
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:368:1: ( (lv_questionType_7_0= ruleSurveyTerminalTypes ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:369:1: (lv_questionType_7_0= ruleSurveyTerminalTypes )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:369:1: (lv_questionType_7_0= ruleSurveyTerminalTypes )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:370:3: lv_questionType_7_0= ruleSurveyTerminalTypes
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getQuestionTypeSurveyTerminalTypesParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleSurveyTerminalTypes_in_ruleQuestion713);
            lv_questionType_7_0=ruleSurveyTerminalTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"questionType",
                    		lv_questionType_7_0, 
                    		"SurveyTerminalTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleQuestion725); 

                	newLeafNode(otherlv_8, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleMatrixQuestion"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:398:1: entryRuleMatrixQuestion returns [EObject current=null] : iv_ruleMatrixQuestion= ruleMatrixQuestion EOF ;
    public final EObject entryRuleMatrixQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrixQuestion = null;


        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:399:2: (iv_ruleMatrixQuestion= ruleMatrixQuestion EOF )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:400:2: iv_ruleMatrixQuestion= ruleMatrixQuestion EOF
            {
             newCompositeNode(grammarAccess.getMatrixQuestionRule()); 
            pushFollow(FOLLOW_ruleMatrixQuestion_in_entryRuleMatrixQuestion761);
            iv_ruleMatrixQuestion=ruleMatrixQuestion();

            state._fsp--;

             current =iv_ruleMatrixQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrixQuestion771); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatrixQuestion"


    // $ANTLR start "ruleMatrixQuestion"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:407:1: ruleMatrixQuestion returns [EObject current=null] : (otherlv_0= 'Question-ID:' ( (lv_id_1_0= ruleIdentifier ) ) otherlv_2= 'Question:' ( (lv_name_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleMatrixQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:410:28: ( (otherlv_0= 'Question-ID:' ( (lv_id_1_0= ruleIdentifier ) ) otherlv_2= 'Question:' ( (lv_name_3_0= RULE_STRING ) ) ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:411:1: (otherlv_0= 'Question-ID:' ( (lv_id_1_0= ruleIdentifier ) ) otherlv_2= 'Question:' ( (lv_name_3_0= RULE_STRING ) ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:411:1: (otherlv_0= 'Question-ID:' ( (lv_id_1_0= ruleIdentifier ) ) otherlv_2= 'Question:' ( (lv_name_3_0= RULE_STRING ) ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:411:3: otherlv_0= 'Question-ID:' ( (lv_id_1_0= ruleIdentifier ) ) otherlv_2= 'Question:' ( (lv_name_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleMatrixQuestion808); 

                	newLeafNode(otherlv_0, grammarAccess.getMatrixQuestionAccess().getQuestionIDKeyword_0());
                
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:415:1: ( (lv_id_1_0= ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:416:1: (lv_id_1_0= ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:416:1: (lv_id_1_0= ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:417:3: lv_id_1_0= ruleIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getMatrixQuestionAccess().getIdIdentifierParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleIdentifier_in_ruleMatrixQuestion829);
            lv_id_1_0=ruleIdentifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrixQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"Identifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleMatrixQuestion841); 

                	newLeafNode(otherlv_2, grammarAccess.getMatrixQuestionAccess().getQuestionKeyword_2());
                
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:437:1: ( (lv_name_3_0= RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:438:1: (lv_name_3_0= RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:438:1: (lv_name_3_0= RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:439:3: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMatrixQuestion858); 

            			newLeafNode(lv_name_3_0, grammarAccess.getMatrixQuestionAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMatrixQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatrixQuestion"


    // $ANTLR start "entryRuleAnswer"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:465:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:466:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:467:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FOLLOW_ruleAnswer_in_entryRuleAnswer901);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnswer911); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:474:1: ruleAnswer returns [EObject current=null] : (otherlv_0= 'Answer-ID:' ( (lv_id_1_0= ruleIdentifier ) ) otherlv_2= 'Answer:' ( (lv_name_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:477:28: ( (otherlv_0= 'Answer-ID:' ( (lv_id_1_0= ruleIdentifier ) ) otherlv_2= 'Answer:' ( (lv_name_3_0= RULE_STRING ) ) ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:478:1: (otherlv_0= 'Answer-ID:' ( (lv_id_1_0= ruleIdentifier ) ) otherlv_2= 'Answer:' ( (lv_name_3_0= RULE_STRING ) ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:478:1: (otherlv_0= 'Answer-ID:' ( (lv_id_1_0= ruleIdentifier ) ) otherlv_2= 'Answer:' ( (lv_name_3_0= RULE_STRING ) ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:478:3: otherlv_0= 'Answer-ID:' ( (lv_id_1_0= ruleIdentifier ) ) otherlv_2= 'Answer:' ( (lv_name_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleAnswer948); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getAnswerIDKeyword_0());
                
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:482:1: ( (lv_id_1_0= ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:483:1: (lv_id_1_0= ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:483:1: (lv_id_1_0= ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:484:3: lv_id_1_0= ruleIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getAnswerAccess().getIdIdentifierParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleIdentifier_in_ruleAnswer969);
            lv_id_1_0=ruleIdentifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"Identifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleAnswer981); 

                	newLeafNode(otherlv_2, grammarAccess.getAnswerAccess().getAnswerKeyword_2());
                
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:504:1: ( (lv_name_3_0= RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:505:1: (lv_name_3_0= RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:505:1: (lv_name_3_0= RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:506:3: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnswer998); 

            			newLeafNode(lv_name_3_0, grammarAccess.getAnswerAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleSurveyTerminalTypes"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:530:1: entryRuleSurveyTerminalTypes returns [EObject current=null] : iv_ruleSurveyTerminalTypes= ruleSurveyTerminalTypes EOF ;
    public final EObject entryRuleSurveyTerminalTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurveyTerminalTypes = null;


        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:531:2: (iv_ruleSurveyTerminalTypes= ruleSurveyTerminalTypes EOF )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:532:2: iv_ruleSurveyTerminalTypes= ruleSurveyTerminalTypes EOF
            {
             newCompositeNode(grammarAccess.getSurveyTerminalTypesRule()); 
            pushFollow(FOLLOW_ruleSurveyTerminalTypes_in_entryRuleSurveyTerminalTypes1039);
            iv_ruleSurveyTerminalTypes=ruleSurveyTerminalTypes();

            state._fsp--;

             current =iv_ruleSurveyTerminalTypes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSurveyTerminalTypes1049); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSurveyTerminalTypes"


    // $ANTLR start "ruleSurveyTerminalTypes"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:539:1: ruleSurveyTerminalTypes returns [EObject current=null] : ( ( () ( (lv_name_1_0= 'TextLine' ) ) otherlv_2= '(' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= ')' ) | ( () ( (lv_name_6_0= 'TextBlock' ) ) otherlv_7= '(' ( (lv_length_8_0= RULE_INT ) ) otherlv_9= ')' ) | ( () ( (lv_name_11_0= 'Matrix' ) ) otherlv_12= '{' otherlv_13= 'Scale:' otherlv_14= '(' ( (lv_answer_15_0= ruleAnswer ) ) (otherlv_16= '|' ( (lv_answer_17_0= ruleAnswer ) ) )* otherlv_18= ')' otherlv_19= 'Questions:' otherlv_20= '(' ( (lv_matrixQuestion_21_0= ruleMatrixQuestion ) ) (otherlv_22= '|' ( (lv_matrixQuestion_23_0= ruleMatrixQuestion ) ) )* otherlv_24= ')' otherlv_25= '}' ) | ( () ( (lv_name_27_0= 'ComboBox' ) ) otherlv_28= '{' ( (lv_answer_29_0= ruleAnswer ) )+ otherlv_30= '}' ) | ( () ( (lv_name_32_0= 'DropDown' ) ) otherlv_33= '{' ( (lv_answer_34_0= ruleAnswer ) )+ otherlv_35= '}' ) | ( () ( (lv_name_37_0= 'Radio' ) ) otherlv_38= '{' ( (lv_answer_39_0= ruleAnswer ) )+ otherlv_40= '}' ) ) ;
    public final EObject ruleSurveyTerminalTypes() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_length_3_0=null;
        Token otherlv_4=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token lv_length_8_0=null;
        Token otherlv_9=null;
        Token lv_name_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_name_27_0=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token lv_name_32_0=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token lv_name_37_0=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        EObject lv_answer_15_0 = null;

        EObject lv_answer_17_0 = null;

        EObject lv_matrixQuestion_21_0 = null;

        EObject lv_matrixQuestion_23_0 = null;

        EObject lv_answer_29_0 = null;

        EObject lv_answer_34_0 = null;

        EObject lv_answer_39_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:542:28: ( ( ( () ( (lv_name_1_0= 'TextLine' ) ) otherlv_2= '(' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= ')' ) | ( () ( (lv_name_6_0= 'TextBlock' ) ) otherlv_7= '(' ( (lv_length_8_0= RULE_INT ) ) otherlv_9= ')' ) | ( () ( (lv_name_11_0= 'Matrix' ) ) otherlv_12= '{' otherlv_13= 'Scale:' otherlv_14= '(' ( (lv_answer_15_0= ruleAnswer ) ) (otherlv_16= '|' ( (lv_answer_17_0= ruleAnswer ) ) )* otherlv_18= ')' otherlv_19= 'Questions:' otherlv_20= '(' ( (lv_matrixQuestion_21_0= ruleMatrixQuestion ) ) (otherlv_22= '|' ( (lv_matrixQuestion_23_0= ruleMatrixQuestion ) ) )* otherlv_24= ')' otherlv_25= '}' ) | ( () ( (lv_name_27_0= 'ComboBox' ) ) otherlv_28= '{' ( (lv_answer_29_0= ruleAnswer ) )+ otherlv_30= '}' ) | ( () ( (lv_name_32_0= 'DropDown' ) ) otherlv_33= '{' ( (lv_answer_34_0= ruleAnswer ) )+ otherlv_35= '}' ) | ( () ( (lv_name_37_0= 'Radio' ) ) otherlv_38= '{' ( (lv_answer_39_0= ruleAnswer ) )+ otherlv_40= '}' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:543:1: ( ( () ( (lv_name_1_0= 'TextLine' ) ) otherlv_2= '(' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= ')' ) | ( () ( (lv_name_6_0= 'TextBlock' ) ) otherlv_7= '(' ( (lv_length_8_0= RULE_INT ) ) otherlv_9= ')' ) | ( () ( (lv_name_11_0= 'Matrix' ) ) otherlv_12= '{' otherlv_13= 'Scale:' otherlv_14= '(' ( (lv_answer_15_0= ruleAnswer ) ) (otherlv_16= '|' ( (lv_answer_17_0= ruleAnswer ) ) )* otherlv_18= ')' otherlv_19= 'Questions:' otherlv_20= '(' ( (lv_matrixQuestion_21_0= ruleMatrixQuestion ) ) (otherlv_22= '|' ( (lv_matrixQuestion_23_0= ruleMatrixQuestion ) ) )* otherlv_24= ')' otherlv_25= '}' ) | ( () ( (lv_name_27_0= 'ComboBox' ) ) otherlv_28= '{' ( (lv_answer_29_0= ruleAnswer ) )+ otherlv_30= '}' ) | ( () ( (lv_name_32_0= 'DropDown' ) ) otherlv_33= '{' ( (lv_answer_34_0= ruleAnswer ) )+ otherlv_35= '}' ) | ( () ( (lv_name_37_0= 'Radio' ) ) otherlv_38= '{' ( (lv_answer_39_0= ruleAnswer ) )+ otherlv_40= '}' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:543:1: ( ( () ( (lv_name_1_0= 'TextLine' ) ) otherlv_2= '(' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= ')' ) | ( () ( (lv_name_6_0= 'TextBlock' ) ) otherlv_7= '(' ( (lv_length_8_0= RULE_INT ) ) otherlv_9= ')' ) | ( () ( (lv_name_11_0= 'Matrix' ) ) otherlv_12= '{' otherlv_13= 'Scale:' otherlv_14= '(' ( (lv_answer_15_0= ruleAnswer ) ) (otherlv_16= '|' ( (lv_answer_17_0= ruleAnswer ) ) )* otherlv_18= ')' otherlv_19= 'Questions:' otherlv_20= '(' ( (lv_matrixQuestion_21_0= ruleMatrixQuestion ) ) (otherlv_22= '|' ( (lv_matrixQuestion_23_0= ruleMatrixQuestion ) ) )* otherlv_24= ')' otherlv_25= '}' ) | ( () ( (lv_name_27_0= 'ComboBox' ) ) otherlv_28= '{' ( (lv_answer_29_0= ruleAnswer ) )+ otherlv_30= '}' ) | ( () ( (lv_name_32_0= 'DropDown' ) ) otherlv_33= '{' ( (lv_answer_34_0= ruleAnswer ) )+ otherlv_35= '}' ) | ( () ( (lv_name_37_0= 'Radio' ) ) otherlv_38= '{' ( (lv_answer_39_0= ruleAnswer ) )+ otherlv_40= '}' ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt10=1;
                }
                break;
            case 26:
                {
                alt10=2;
                }
                break;
            case 27:
                {
                alt10=3;
                }
                break;
            case 31:
                {
                alt10=4;
                }
                break;
            case 32:
                {
                alt10=5;
                }
                break;
            case 33:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:543:2: ( () ( (lv_name_1_0= 'TextLine' ) ) otherlv_2= '(' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= ')' )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:543:2: ( () ( (lv_name_1_0= 'TextLine' ) ) otherlv_2= '(' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= ')' )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:543:3: () ( (lv_name_1_0= 'TextLine' ) ) otherlv_2= '(' ( (lv_length_3_0= RULE_INT ) ) otherlv_4= ')'
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:543:3: ()
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:544:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSurveyTerminalTypesAccess().getTextLineAction_0_0(),
                                current);
                        

                    }

                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:549:2: ( (lv_name_1_0= 'TextLine' ) )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:550:1: (lv_name_1_0= 'TextLine' )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:550:1: (lv_name_1_0= 'TextLine' )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:551:3: lv_name_1_0= 'TextLine'
                    {
                    lv_name_1_0=(Token)match(input,23,FOLLOW_23_in_ruleSurveyTerminalTypes1102); 

                            newLeafNode(lv_name_1_0, grammarAccess.getSurveyTerminalTypesAccess().getNameTextLineKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSurveyTerminalTypesRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_1_0, "TextLine");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleSurveyTerminalTypes1127); 

                        	newLeafNode(otherlv_2, grammarAccess.getSurveyTerminalTypesAccess().getLeftParenthesisKeyword_0_2());
                        
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:568:1: ( (lv_length_3_0= RULE_INT ) )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:569:1: (lv_length_3_0= RULE_INT )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:569:1: (lv_length_3_0= RULE_INT )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:570:3: lv_length_3_0= RULE_INT
                    {
                    lv_length_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSurveyTerminalTypes1144); 

                    			newLeafNode(lv_length_3_0, grammarAccess.getSurveyTerminalTypesAccess().getLengthINTTerminalRuleCall_0_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSurveyTerminalTypesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"length",
                            		lv_length_3_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleSurveyTerminalTypes1161); 

                        	newLeafNode(otherlv_4, grammarAccess.getSurveyTerminalTypesAccess().getRightParenthesisKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:591:6: ( () ( (lv_name_6_0= 'TextBlock' ) ) otherlv_7= '(' ( (lv_length_8_0= RULE_INT ) ) otherlv_9= ')' )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:591:6: ( () ( (lv_name_6_0= 'TextBlock' ) ) otherlv_7= '(' ( (lv_length_8_0= RULE_INT ) ) otherlv_9= ')' )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:591:7: () ( (lv_name_6_0= 'TextBlock' ) ) otherlv_7= '(' ( (lv_length_8_0= RULE_INT ) ) otherlv_9= ')'
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:591:7: ()
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:592:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSurveyTerminalTypesAccess().getTextBlockAction_1_0(),
                                current);
                        

                    }

                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:597:2: ( (lv_name_6_0= 'TextBlock' ) )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:598:1: (lv_name_6_0= 'TextBlock' )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:598:1: (lv_name_6_0= 'TextBlock' )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:599:3: lv_name_6_0= 'TextBlock'
                    {
                    lv_name_6_0=(Token)match(input,26,FOLLOW_26_in_ruleSurveyTerminalTypes1196); 

                            newLeafNode(lv_name_6_0, grammarAccess.getSurveyTerminalTypesAccess().getNameTextBlockKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSurveyTerminalTypesRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_6_0, "TextBlock");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleSurveyTerminalTypes1221); 

                        	newLeafNode(otherlv_7, grammarAccess.getSurveyTerminalTypesAccess().getLeftParenthesisKeyword_1_2());
                        
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:616:1: ( (lv_length_8_0= RULE_INT ) )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:617:1: (lv_length_8_0= RULE_INT )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:617:1: (lv_length_8_0= RULE_INT )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:618:3: lv_length_8_0= RULE_INT
                    {
                    lv_length_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSurveyTerminalTypes1238); 

                    			newLeafNode(lv_length_8_0, grammarAccess.getSurveyTerminalTypesAccess().getLengthINTTerminalRuleCall_1_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSurveyTerminalTypesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"length",
                            		lv_length_8_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleSurveyTerminalTypes1255); 

                        	newLeafNode(otherlv_9, grammarAccess.getSurveyTerminalTypesAccess().getRightParenthesisKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:639:6: ( () ( (lv_name_11_0= 'Matrix' ) ) otherlv_12= '{' otherlv_13= 'Scale:' otherlv_14= '(' ( (lv_answer_15_0= ruleAnswer ) ) (otherlv_16= '|' ( (lv_answer_17_0= ruleAnswer ) ) )* otherlv_18= ')' otherlv_19= 'Questions:' otherlv_20= '(' ( (lv_matrixQuestion_21_0= ruleMatrixQuestion ) ) (otherlv_22= '|' ( (lv_matrixQuestion_23_0= ruleMatrixQuestion ) ) )* otherlv_24= ')' otherlv_25= '}' )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:639:6: ( () ( (lv_name_11_0= 'Matrix' ) ) otherlv_12= '{' otherlv_13= 'Scale:' otherlv_14= '(' ( (lv_answer_15_0= ruleAnswer ) ) (otherlv_16= '|' ( (lv_answer_17_0= ruleAnswer ) ) )* otherlv_18= ')' otherlv_19= 'Questions:' otherlv_20= '(' ( (lv_matrixQuestion_21_0= ruleMatrixQuestion ) ) (otherlv_22= '|' ( (lv_matrixQuestion_23_0= ruleMatrixQuestion ) ) )* otherlv_24= ')' otherlv_25= '}' )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:639:7: () ( (lv_name_11_0= 'Matrix' ) ) otherlv_12= '{' otherlv_13= 'Scale:' otherlv_14= '(' ( (lv_answer_15_0= ruleAnswer ) ) (otherlv_16= '|' ( (lv_answer_17_0= ruleAnswer ) ) )* otherlv_18= ')' otherlv_19= 'Questions:' otherlv_20= '(' ( (lv_matrixQuestion_21_0= ruleMatrixQuestion ) ) (otherlv_22= '|' ( (lv_matrixQuestion_23_0= ruleMatrixQuestion ) ) )* otherlv_24= ')' otherlv_25= '}'
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:639:7: ()
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:640:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSurveyTerminalTypesAccess().getMatrixAction_2_0(),
                                current);
                        

                    }

                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:645:2: ( (lv_name_11_0= 'Matrix' ) )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:646:1: (lv_name_11_0= 'Matrix' )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:646:1: (lv_name_11_0= 'Matrix' )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:647:3: lv_name_11_0= 'Matrix'
                    {
                    lv_name_11_0=(Token)match(input,27,FOLLOW_27_in_ruleSurveyTerminalTypes1290); 

                            newLeafNode(lv_name_11_0, grammarAccess.getSurveyTerminalTypesAccess().getNameMatrixKeyword_2_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSurveyTerminalTypesRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_11_0, "Matrix");
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,12,FOLLOW_12_in_ruleSurveyTerminalTypes1315); 

                        	newLeafNode(otherlv_12, grammarAccess.getSurveyTerminalTypesAccess().getLeftCurlyBracketKeyword_2_2());
                        
                    otherlv_13=(Token)match(input,28,FOLLOW_28_in_ruleSurveyTerminalTypes1327); 

                        	newLeafNode(otherlv_13, grammarAccess.getSurveyTerminalTypesAccess().getScaleKeyword_2_3());
                        
                    otherlv_14=(Token)match(input,24,FOLLOW_24_in_ruleSurveyTerminalTypes1339); 

                        	newLeafNode(otherlv_14, grammarAccess.getSurveyTerminalTypesAccess().getLeftParenthesisKeyword_2_4());
                        
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:672:1: ( (lv_answer_15_0= ruleAnswer ) )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:673:1: (lv_answer_15_0= ruleAnswer )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:673:1: (lv_answer_15_0= ruleAnswer )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:674:3: lv_answer_15_0= ruleAnswer
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_2_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnswer_in_ruleSurveyTerminalTypes1360);
                    lv_answer_15_0=ruleAnswer();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSurveyTerminalTypesRule());
                    	        }
                           		add(
                           			current, 
                           			"answer",
                            		lv_answer_15_0, 
                            		"Answer");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:690:2: (otherlv_16= '|' ( (lv_answer_17_0= ruleAnswer ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==29) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:690:4: otherlv_16= '|' ( (lv_answer_17_0= ruleAnswer ) )
                    	    {
                    	    otherlv_16=(Token)match(input,29,FOLLOW_29_in_ruleSurveyTerminalTypes1373); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getSurveyTerminalTypesAccess().getVerticalLineKeyword_2_6_0());
                    	        
                    	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:694:1: ( (lv_answer_17_0= ruleAnswer ) )
                    	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:695:1: (lv_answer_17_0= ruleAnswer )
                    	    {
                    	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:695:1: (lv_answer_17_0= ruleAnswer )
                    	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:696:3: lv_answer_17_0= ruleAnswer
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_2_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnswer_in_ruleSurveyTerminalTypes1394);
                    	    lv_answer_17_0=ruleAnswer();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSurveyTerminalTypesRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"answer",
                    	            		lv_answer_17_0, 
                    	            		"Answer");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,25,FOLLOW_25_in_ruleSurveyTerminalTypes1408); 

                        	newLeafNode(otherlv_18, grammarAccess.getSurveyTerminalTypesAccess().getRightParenthesisKeyword_2_7());
                        
                    otherlv_19=(Token)match(input,30,FOLLOW_30_in_ruleSurveyTerminalTypes1420); 

                        	newLeafNode(otherlv_19, grammarAccess.getSurveyTerminalTypesAccess().getQuestionsKeyword_2_8());
                        
                    otherlv_20=(Token)match(input,24,FOLLOW_24_in_ruleSurveyTerminalTypes1432); 

                        	newLeafNode(otherlv_20, grammarAccess.getSurveyTerminalTypesAccess().getLeftParenthesisKeyword_2_9());
                        
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:724:1: ( (lv_matrixQuestion_21_0= ruleMatrixQuestion ) )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:725:1: (lv_matrixQuestion_21_0= ruleMatrixQuestion )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:725:1: (lv_matrixQuestion_21_0= ruleMatrixQuestion )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:726:3: lv_matrixQuestion_21_0= ruleMatrixQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getSurveyTerminalTypesAccess().getMatrixQuestionMatrixQuestionParserRuleCall_2_10_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMatrixQuestion_in_ruleSurveyTerminalTypes1453);
                    lv_matrixQuestion_21_0=ruleMatrixQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSurveyTerminalTypesRule());
                    	        }
                           		add(
                           			current, 
                           			"matrixQuestion",
                            		lv_matrixQuestion_21_0, 
                            		"MatrixQuestion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:742:2: (otherlv_22= '|' ( (lv_matrixQuestion_23_0= ruleMatrixQuestion ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==29) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:742:4: otherlv_22= '|' ( (lv_matrixQuestion_23_0= ruleMatrixQuestion ) )
                    	    {
                    	    otherlv_22=(Token)match(input,29,FOLLOW_29_in_ruleSurveyTerminalTypes1466); 

                    	        	newLeafNode(otherlv_22, grammarAccess.getSurveyTerminalTypesAccess().getVerticalLineKeyword_2_11_0());
                    	        
                    	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:746:1: ( (lv_matrixQuestion_23_0= ruleMatrixQuestion ) )
                    	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:747:1: (lv_matrixQuestion_23_0= ruleMatrixQuestion )
                    	    {
                    	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:747:1: (lv_matrixQuestion_23_0= ruleMatrixQuestion )
                    	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:748:3: lv_matrixQuestion_23_0= ruleMatrixQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyTerminalTypesAccess().getMatrixQuestionMatrixQuestionParserRuleCall_2_11_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMatrixQuestion_in_ruleSurveyTerminalTypes1487);
                    	    lv_matrixQuestion_23_0=ruleMatrixQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSurveyTerminalTypesRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"matrixQuestion",
                    	            		lv_matrixQuestion_23_0, 
                    	            		"MatrixQuestion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,25,FOLLOW_25_in_ruleSurveyTerminalTypes1501); 

                        	newLeafNode(otherlv_24, grammarAccess.getSurveyTerminalTypesAccess().getRightParenthesisKeyword_2_12());
                        
                    otherlv_25=(Token)match(input,14,FOLLOW_14_in_ruleSurveyTerminalTypes1513); 

                        	newLeafNode(otherlv_25, grammarAccess.getSurveyTerminalTypesAccess().getRightCurlyBracketKeyword_2_13());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:773:6: ( () ( (lv_name_27_0= 'ComboBox' ) ) otherlv_28= '{' ( (lv_answer_29_0= ruleAnswer ) )+ otherlv_30= '}' )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:773:6: ( () ( (lv_name_27_0= 'ComboBox' ) ) otherlv_28= '{' ( (lv_answer_29_0= ruleAnswer ) )+ otherlv_30= '}' )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:773:7: () ( (lv_name_27_0= 'ComboBox' ) ) otherlv_28= '{' ( (lv_answer_29_0= ruleAnswer ) )+ otherlv_30= '}'
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:773:7: ()
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:774:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSurveyTerminalTypesAccess().getComboBoxAction_3_0(),
                                current);
                        

                    }

                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:779:2: ( (lv_name_27_0= 'ComboBox' ) )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:780:1: (lv_name_27_0= 'ComboBox' )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:780:1: (lv_name_27_0= 'ComboBox' )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:781:3: lv_name_27_0= 'ComboBox'
                    {
                    lv_name_27_0=(Token)match(input,31,FOLLOW_31_in_ruleSurveyTerminalTypes1548); 

                            newLeafNode(lv_name_27_0, grammarAccess.getSurveyTerminalTypesAccess().getNameComboBoxKeyword_3_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSurveyTerminalTypesRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_27_0, "ComboBox");
                    	    

                    }


                    }

                    otherlv_28=(Token)match(input,12,FOLLOW_12_in_ruleSurveyTerminalTypes1573); 

                        	newLeafNode(otherlv_28, grammarAccess.getSurveyTerminalTypesAccess().getLeftCurlyBracketKeyword_3_2());
                        
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:798:1: ( (lv_answer_29_0= ruleAnswer ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==21) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:799:1: (lv_answer_29_0= ruleAnswer )
                    	    {
                    	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:799:1: (lv_answer_29_0= ruleAnswer )
                    	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:800:3: lv_answer_29_0= ruleAnswer
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_3_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnswer_in_ruleSurveyTerminalTypes1594);
                    	    lv_answer_29_0=ruleAnswer();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSurveyTerminalTypesRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"answer",
                    	            		lv_answer_29_0, 
                    	            		"Answer");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    otherlv_30=(Token)match(input,14,FOLLOW_14_in_ruleSurveyTerminalTypes1607); 

                        	newLeafNode(otherlv_30, grammarAccess.getSurveyTerminalTypesAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:821:6: ( () ( (lv_name_32_0= 'DropDown' ) ) otherlv_33= '{' ( (lv_answer_34_0= ruleAnswer ) )+ otherlv_35= '}' )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:821:6: ( () ( (lv_name_32_0= 'DropDown' ) ) otherlv_33= '{' ( (lv_answer_34_0= ruleAnswer ) )+ otherlv_35= '}' )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:821:7: () ( (lv_name_32_0= 'DropDown' ) ) otherlv_33= '{' ( (lv_answer_34_0= ruleAnswer ) )+ otherlv_35= '}'
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:821:7: ()
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:822:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSurveyTerminalTypesAccess().getDropDownAction_4_0(),
                                current);
                        

                    }

                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:827:2: ( (lv_name_32_0= 'DropDown' ) )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:828:1: (lv_name_32_0= 'DropDown' )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:828:1: (lv_name_32_0= 'DropDown' )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:829:3: lv_name_32_0= 'DropDown'
                    {
                    lv_name_32_0=(Token)match(input,32,FOLLOW_32_in_ruleSurveyTerminalTypes1642); 

                            newLeafNode(lv_name_32_0, grammarAccess.getSurveyTerminalTypesAccess().getNameDropDownKeyword_4_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSurveyTerminalTypesRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_32_0, "DropDown");
                    	    

                    }


                    }

                    otherlv_33=(Token)match(input,12,FOLLOW_12_in_ruleSurveyTerminalTypes1667); 

                        	newLeafNode(otherlv_33, grammarAccess.getSurveyTerminalTypesAccess().getLeftCurlyBracketKeyword_4_2());
                        
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:846:1: ( (lv_answer_34_0= ruleAnswer ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==21) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:847:1: (lv_answer_34_0= ruleAnswer )
                    	    {
                    	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:847:1: (lv_answer_34_0= ruleAnswer )
                    	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:848:3: lv_answer_34_0= ruleAnswer
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_4_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnswer_in_ruleSurveyTerminalTypes1688);
                    	    lv_answer_34_0=ruleAnswer();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSurveyTerminalTypesRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"answer",
                    	            		lv_answer_34_0, 
                    	            		"Answer");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    otherlv_35=(Token)match(input,14,FOLLOW_14_in_ruleSurveyTerminalTypes1701); 

                        	newLeafNode(otherlv_35, grammarAccess.getSurveyTerminalTypesAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:869:6: ( () ( (lv_name_37_0= 'Radio' ) ) otherlv_38= '{' ( (lv_answer_39_0= ruleAnswer ) )+ otherlv_40= '}' )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:869:6: ( () ( (lv_name_37_0= 'Radio' ) ) otherlv_38= '{' ( (lv_answer_39_0= ruleAnswer ) )+ otherlv_40= '}' )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:869:7: () ( (lv_name_37_0= 'Radio' ) ) otherlv_38= '{' ( (lv_answer_39_0= ruleAnswer ) )+ otherlv_40= '}'
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:869:7: ()
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:870:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSurveyTerminalTypesAccess().getRadioAction_5_0(),
                                current);
                        

                    }

                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:875:2: ( (lv_name_37_0= 'Radio' ) )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:876:1: (lv_name_37_0= 'Radio' )
                    {
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:876:1: (lv_name_37_0= 'Radio' )
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:877:3: lv_name_37_0= 'Radio'
                    {
                    lv_name_37_0=(Token)match(input,33,FOLLOW_33_in_ruleSurveyTerminalTypes1736); 

                            newLeafNode(lv_name_37_0, grammarAccess.getSurveyTerminalTypesAccess().getNameRadioKeyword_5_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSurveyTerminalTypesRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_37_0, "Radio");
                    	    

                    }


                    }

                    otherlv_38=(Token)match(input,12,FOLLOW_12_in_ruleSurveyTerminalTypes1761); 

                        	newLeafNode(otherlv_38, grammarAccess.getSurveyTerminalTypesAccess().getLeftCurlyBracketKeyword_5_2());
                        
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:894:1: ( (lv_answer_39_0= ruleAnswer ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==21) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:895:1: (lv_answer_39_0= ruleAnswer )
                    	    {
                    	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:895:1: (lv_answer_39_0= ruleAnswer )
                    	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:896:3: lv_answer_39_0= ruleAnswer
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAnswerParserRuleCall_5_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnswer_in_ruleSurveyTerminalTypes1782);
                    	    lv_answer_39_0=ruleAnswer();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSurveyTerminalTypesRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"answer",
                    	            		lv_answer_39_0, 
                    	            		"Answer");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    otherlv_40=(Token)match(input,14,FOLLOW_14_in_ruleSurveyTerminalTypes1795); 

                        	newLeafNode(otherlv_40, grammarAccess.getSurveyTerminalTypesAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSurveyTerminalTypes"


    // $ANTLR start "entryRuleIdentifier"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:924:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:925:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:926:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier1833);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier1844); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:933:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:936:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:937:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:937:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case RULE_STRING:
                {
                alt11=2;
                }
                break;
            case RULE_INT:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:937:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdentifier1884); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:945:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIdentifier1910); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getIdentifierAccess().getSTRINGTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:953:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIdentifier1936); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getIdentifierAccess().getINTTerminalRuleCall_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentifier"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurvey85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_ruleSurvey130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionnaire176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleQuestionnaire213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestionnaire230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQuestionnaire247 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleQuestionnaire259 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleQuestionnaire280 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rulePart_in_ruleQuestionnaire301 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleQuestionnaire314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePart397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePart414 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePart431 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePart443 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rulePart464 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleQuestion_in_rulePart485 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_rulePart498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleQuestion581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestion598 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQuestion615 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQuestion627 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleQuestion648 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleQuestion666 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleQuestion692 = new BitSet(new long[]{0x000000038C800000L});
    public static final BitSet FOLLOW_ruleSurveyTerminalTypes_in_ruleQuestion713 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQuestion725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrixQuestion_in_entryRuleMatrixQuestion761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrixQuestion771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMatrixQuestion808 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleMatrixQuestion829 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMatrixQuestion841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMatrixQuestion858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnswer911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAnswer948 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleAnswer969 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAnswer981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnswer998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSurveyTerminalTypes_in_entryRuleSurveyTerminalTypes1039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurveyTerminalTypes1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSurveyTerminalTypes1102 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSurveyTerminalTypes1127 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSurveyTerminalTypes1144 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSurveyTerminalTypes1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSurveyTerminalTypes1196 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSurveyTerminalTypes1221 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSurveyTerminalTypes1238 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSurveyTerminalTypes1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSurveyTerminalTypes1290 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSurveyTerminalTypes1315 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSurveyTerminalTypes1327 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSurveyTerminalTypes1339 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleAnswer_in_ruleSurveyTerminalTypes1360 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_29_in_ruleSurveyTerminalTypes1373 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleAnswer_in_ruleSurveyTerminalTypes1394 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_25_in_ruleSurveyTerminalTypes1408 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSurveyTerminalTypes1420 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSurveyTerminalTypes1432 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleMatrixQuestion_in_ruleSurveyTerminalTypes1453 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_29_in_ruleSurveyTerminalTypes1466 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleMatrixQuestion_in_ruleSurveyTerminalTypes1487 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_25_in_ruleSurveyTerminalTypes1501 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSurveyTerminalTypes1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleSurveyTerminalTypes1548 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSurveyTerminalTypes1573 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleAnswer_in_ruleSurveyTerminalTypes1594 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14_in_ruleSurveyTerminalTypes1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSurveyTerminalTypes1642 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSurveyTerminalTypes1667 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleAnswer_in_ruleSurveyTerminalTypes1688 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14_in_ruleSurveyTerminalTypes1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSurveyTerminalTypes1736 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSurveyTerminalTypes1761 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleAnswer_in_ruleSurveyTerminalTypes1782 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14_in_ruleSurveyTerminalTypes1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier1833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdentifier1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIdentifier1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIdentifier1936 = new BitSet(new long[]{0x0000000000000002L});

}