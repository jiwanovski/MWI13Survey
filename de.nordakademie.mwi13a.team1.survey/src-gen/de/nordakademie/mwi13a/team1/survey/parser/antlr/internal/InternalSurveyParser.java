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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Questionnaire:'", "'{'", "'ID:'", "'}'", "'Part:'", "'Question:'", "'Mandatory:'", "'Type:'", "'Answer:'", "'TextLn'", "'('", "')'", "'TextBl'", "'Matrix'", "'Scale:'", "'|'", "'Questions:'", "'ComboBox'", "'DropDown'", "'Radio'", "'Yes'", "'No'"
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
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:115:1: ruleQuestionnaire returns [EObject current=null] : (otherlv_0= 'Questionnaire:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_part_5_0= rulePart ) )+ otherlv_6= '}' ) ;
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
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:118:28: ( (otherlv_0= 'Questionnaire:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_part_5_0= rulePart ) )+ otherlv_6= '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:119:1: (otherlv_0= 'Questionnaire:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_part_5_0= rulePart ) )+ otherlv_6= '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:119:1: (otherlv_0= 'Questionnaire:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_part_5_0= rulePart ) )+ otherlv_6= '}' )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:119:3: otherlv_0= 'Questionnaire:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_part_5_0= rulePart ) )+ otherlv_6= '}'
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

                	newLeafNode(otherlv_3, grammarAccess.getQuestionnaireAccess().getIDKeyword_3());
                
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
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:206:1: rulePart returns [EObject current=null] : (otherlv_0= 'Part:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_question_5_0= ruleQuestion ) )+ otherlv_6= '}' ) ;
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
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:209:28: ( (otherlv_0= 'Part:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_question_5_0= ruleQuestion ) )+ otherlv_6= '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:210:1: (otherlv_0= 'Part:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_question_5_0= ruleQuestion ) )+ otherlv_6= '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:210:1: (otherlv_0= 'Part:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_question_5_0= ruleQuestion ) )+ otherlv_6= '}' )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:210:3: otherlv_0= 'Part:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'ID:' ( (lv_id_4_0= ruleIdentifier ) ) ( (lv_question_5_0= ruleQuestion ) )+ otherlv_6= '}'
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
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_rulePart443); 

                	newLeafNode(otherlv_3, grammarAccess.getPartAccess().getIDKeyword_3());
                
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

                if ( (LA3_0==16) ) {
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
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:297:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'Question:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'ID:' ( (lv_id_4_0= ruleIdentifier ) ) otherlv_5= 'Mandatory:' ( (lv_mandatory_6_0= ruleMandatory ) ) otherlv_7= 'Type:' ( (lv_type_8_0= ruleType ) ) ( (lv_answer_9_0= ruleAnswer ) )* otherlv_10= '}' ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_mandatory_6_0 = null;

        EObject lv_type_8_0 = null;

        EObject lv_answer_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:300:28: ( (otherlv_0= 'Question:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'ID:' ( (lv_id_4_0= ruleIdentifier ) ) otherlv_5= 'Mandatory:' ( (lv_mandatory_6_0= ruleMandatory ) ) otherlv_7= 'Type:' ( (lv_type_8_0= ruleType ) ) ( (lv_answer_9_0= ruleAnswer ) )* otherlv_10= '}' ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:301:1: (otherlv_0= 'Question:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'ID:' ( (lv_id_4_0= ruleIdentifier ) ) otherlv_5= 'Mandatory:' ( (lv_mandatory_6_0= ruleMandatory ) ) otherlv_7= 'Type:' ( (lv_type_8_0= ruleType ) ) ( (lv_answer_9_0= ruleAnswer ) )* otherlv_10= '}' )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:301:1: (otherlv_0= 'Question:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'ID:' ( (lv_id_4_0= ruleIdentifier ) ) otherlv_5= 'Mandatory:' ( (lv_mandatory_6_0= ruleMandatory ) ) otherlv_7= 'Type:' ( (lv_type_8_0= ruleType ) ) ( (lv_answer_9_0= ruleAnswer ) )* otherlv_10= '}' )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:301:3: otherlv_0= 'Question:' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'ID:' ( (lv_id_4_0= ruleIdentifier ) ) otherlv_5= 'Mandatory:' ( (lv_mandatory_6_0= ruleMandatory ) ) otherlv_7= 'Type:' ( (lv_type_8_0= ruleType ) ) ( (lv_answer_9_0= ruleAnswer ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleQuestion581); 

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
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleQuestion627); 

                	newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getIDKeyword_3());
                
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

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleQuestion660); 

                	newLeafNode(otherlv_5, grammarAccess.getQuestionAccess().getMandatoryKeyword_5());
                
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:353:1: ( (lv_mandatory_6_0= ruleMandatory ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:354:1: (lv_mandatory_6_0= ruleMandatory )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:354:1: (lv_mandatory_6_0= ruleMandatory )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:355:3: lv_mandatory_6_0= ruleMandatory
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getMandatoryMandatoryParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleMandatory_in_ruleQuestion681);
            lv_mandatory_6_0=ruleMandatory();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"mandatory",
                    		lv_mandatory_6_0, 
                    		"Mandatory");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleQuestion693); 

                	newLeafNode(otherlv_7, grammarAccess.getQuestionAccess().getTypeKeyword_7());
                
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:375:1: ( (lv_type_8_0= ruleType ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:376:1: (lv_type_8_0= ruleType )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:376:1: (lv_type_8_0= ruleType )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:377:3: lv_type_8_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getTypeTypeParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleQuestion714);
            lv_type_8_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_8_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:393:2: ( (lv_answer_9_0= ruleAnswer ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:394:1: (lv_answer_9_0= ruleAnswer )
            	    {
            	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:394:1: (lv_answer_9_0= ruleAnswer )
            	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:395:3: lv_answer_9_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getAnswerAnswerParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnswer_in_ruleQuestion735);
            	    lv_answer_9_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answer",
            	            		lv_answer_9_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleQuestion748); 

                	newLeafNode(otherlv_10, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_10());
                

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


    // $ANTLR start "entryRuleAnswer"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:423:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:424:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:425:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FOLLOW_ruleAnswer_in_entryRuleAnswer784);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnswer794); 

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
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:432:1: ruleAnswer returns [EObject current=null] : (otherlv_0= 'ID:' ( (lv_id_1_0= ruleIdentifier ) ) otherlv_2= 'Answer:' ( (lv_name_3_0= ruleIdentifier ) ) ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:435:28: ( (otherlv_0= 'ID:' ( (lv_id_1_0= ruleIdentifier ) ) otherlv_2= 'Answer:' ( (lv_name_3_0= ruleIdentifier ) ) ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:436:1: (otherlv_0= 'ID:' ( (lv_id_1_0= ruleIdentifier ) ) otherlv_2= 'Answer:' ( (lv_name_3_0= ruleIdentifier ) ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:436:1: (otherlv_0= 'ID:' ( (lv_id_1_0= ruleIdentifier ) ) otherlv_2= 'Answer:' ( (lv_name_3_0= ruleIdentifier ) ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:436:3: otherlv_0= 'ID:' ( (lv_id_1_0= ruleIdentifier ) ) otherlv_2= 'Answer:' ( (lv_name_3_0= ruleIdentifier ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleAnswer831); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getIDKeyword_0());
                
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:440:1: ( (lv_id_1_0= ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:441:1: (lv_id_1_0= ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:441:1: (lv_id_1_0= ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:442:3: lv_id_1_0= ruleIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getAnswerAccess().getIdIdentifierParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleIdentifier_in_ruleAnswer852);
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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleAnswer864); 

                	newLeafNode(otherlv_2, grammarAccess.getAnswerAccess().getAnswerKeyword_2());
                
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:462:1: ( (lv_name_3_0= ruleIdentifier ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:463:1: (lv_name_3_0= ruleIdentifier )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:463:1: (lv_name_3_0= ruleIdentifier )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:464:3: lv_name_3_0= ruleIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getAnswerAccess().getNameIdentifierParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleIdentifier_in_ruleAnswer885);
            lv_name_3_0=ruleIdentifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"Identifier");
            	        afterParserOrEnumRuleCall();
            	    

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


    // $ANTLR start "entryRuleTextLn"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:488:1: entryRuleTextLn returns [EObject current=null] : iv_ruleTextLn= ruleTextLn EOF ;
    public final EObject entryRuleTextLn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextLn = null;


        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:489:2: (iv_ruleTextLn= ruleTextLn EOF )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:490:2: iv_ruleTextLn= ruleTextLn EOF
            {
             newCompositeNode(grammarAccess.getTextLnRule()); 
            pushFollow(FOLLOW_ruleTextLn_in_entryRuleTextLn921);
            iv_ruleTextLn=ruleTextLn();

            state._fsp--;

             current =iv_ruleTextLn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextLn931); 

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
    // $ANTLR end "entryRuleTextLn"


    // $ANTLR start "ruleTextLn"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:497:1: ruleTextLn returns [EObject current=null] : (otherlv_0= 'TextLn' otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleTextLn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:500:28: ( (otherlv_0= 'TextLn' otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:501:1: (otherlv_0= 'TextLn' otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:501:1: (otherlv_0= 'TextLn' otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:501:3: otherlv_0= 'TextLn' otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleTextLn968); 

                	newLeafNode(otherlv_0, grammarAccess.getTextLnAccess().getTextLnKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleTextLn980); 

                	newLeafNode(otherlv_1, grammarAccess.getTextLnAccess().getLeftParenthesisKeyword_1());
                
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:509:1: ( (lv_length_2_0= RULE_INT ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:510:1: (lv_length_2_0= RULE_INT )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:510:1: (lv_length_2_0= RULE_INT )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:511:3: lv_length_2_0= RULE_INT
            {
            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTextLn997); 

            			newLeafNode(lv_length_2_0, grammarAccess.getTextLnAccess().getLengthINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextLnRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"length",
                    		lv_length_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleTextLn1014); 

                	newLeafNode(otherlv_3, grammarAccess.getTextLnAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleTextLn"


    // $ANTLR start "entryRuleTextBl"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:539:1: entryRuleTextBl returns [EObject current=null] : iv_ruleTextBl= ruleTextBl EOF ;
    public final EObject entryRuleTextBl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextBl = null;


        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:540:2: (iv_ruleTextBl= ruleTextBl EOF )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:541:2: iv_ruleTextBl= ruleTextBl EOF
            {
             newCompositeNode(grammarAccess.getTextBlRule()); 
            pushFollow(FOLLOW_ruleTextBl_in_entryRuleTextBl1050);
            iv_ruleTextBl=ruleTextBl();

            state._fsp--;

             current =iv_ruleTextBl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextBl1060); 

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
    // $ANTLR end "entryRuleTextBl"


    // $ANTLR start "ruleTextBl"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:548:1: ruleTextBl returns [EObject current=null] : (otherlv_0= 'TextBl' otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleTextBl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:551:28: ( (otherlv_0= 'TextBl' otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:552:1: (otherlv_0= 'TextBl' otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:552:1: (otherlv_0= 'TextBl' otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:552:3: otherlv_0= 'TextBl' otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleTextBl1097); 

                	newLeafNode(otherlv_0, grammarAccess.getTextBlAccess().getTextBlKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleTextBl1109); 

                	newLeafNode(otherlv_1, grammarAccess.getTextBlAccess().getLeftParenthesisKeyword_1());
                
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:560:1: ( (lv_length_2_0= RULE_INT ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:561:1: (lv_length_2_0= RULE_INT )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:561:1: (lv_length_2_0= RULE_INT )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:562:3: lv_length_2_0= RULE_INT
            {
            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTextBl1126); 

            			newLeafNode(lv_length_2_0, grammarAccess.getTextBlAccess().getLengthINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextBlRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"length",
                    		lv_length_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleTextBl1143); 

                	newLeafNode(otherlv_3, grammarAccess.getTextBlAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleTextBl"


    // $ANTLR start "entryRuleMatrix"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:590:1: entryRuleMatrix returns [EObject current=null] : iv_ruleMatrix= ruleMatrix EOF ;
    public final EObject entryRuleMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix = null;


        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:591:2: (iv_ruleMatrix= ruleMatrix EOF )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:592:2: iv_ruleMatrix= ruleMatrix EOF
            {
             newCompositeNode(grammarAccess.getMatrixRule()); 
            pushFollow(FOLLOW_ruleMatrix_in_entryRuleMatrix1179);
            iv_ruleMatrix=ruleMatrix();

            state._fsp--;

             current =iv_ruleMatrix; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatrix1189); 

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
    // $ANTLR end "entryRuleMatrix"


    // $ANTLR start "ruleMatrix"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:599:1: ruleMatrix returns [EObject current=null] : (otherlv_0= 'Matrix' otherlv_1= '(' otherlv_2= 'Scale:' otherlv_3= '(' ruleIdentifier (otherlv_5= '|' ruleIdentifier )* otherlv_7= ')' otherlv_8= 'Questions:' otherlv_9= '(' ( (lv_answer_10_0= ruleAnswer ) ) (otherlv_11= '|' ( (lv_answer_12_0= ruleAnswer ) ) )* otherlv_13= ')' otherlv_14= ')' ) ;
    public final EObject ruleMatrix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_answer_10_0 = null;

        EObject lv_answer_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:602:28: ( (otherlv_0= 'Matrix' otherlv_1= '(' otherlv_2= 'Scale:' otherlv_3= '(' ruleIdentifier (otherlv_5= '|' ruleIdentifier )* otherlv_7= ')' otherlv_8= 'Questions:' otherlv_9= '(' ( (lv_answer_10_0= ruleAnswer ) ) (otherlv_11= '|' ( (lv_answer_12_0= ruleAnswer ) ) )* otherlv_13= ')' otherlv_14= ')' ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:603:1: (otherlv_0= 'Matrix' otherlv_1= '(' otherlv_2= 'Scale:' otherlv_3= '(' ruleIdentifier (otherlv_5= '|' ruleIdentifier )* otherlv_7= ')' otherlv_8= 'Questions:' otherlv_9= '(' ( (lv_answer_10_0= ruleAnswer ) ) (otherlv_11= '|' ( (lv_answer_12_0= ruleAnswer ) ) )* otherlv_13= ')' otherlv_14= ')' )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:603:1: (otherlv_0= 'Matrix' otherlv_1= '(' otherlv_2= 'Scale:' otherlv_3= '(' ruleIdentifier (otherlv_5= '|' ruleIdentifier )* otherlv_7= ')' otherlv_8= 'Questions:' otherlv_9= '(' ( (lv_answer_10_0= ruleAnswer ) ) (otherlv_11= '|' ( (lv_answer_12_0= ruleAnswer ) ) )* otherlv_13= ')' otherlv_14= ')' )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:603:3: otherlv_0= 'Matrix' otherlv_1= '(' otherlv_2= 'Scale:' otherlv_3= '(' ruleIdentifier (otherlv_5= '|' ruleIdentifier )* otherlv_7= ')' otherlv_8= 'Questions:' otherlv_9= '(' ( (lv_answer_10_0= ruleAnswer ) ) (otherlv_11= '|' ( (lv_answer_12_0= ruleAnswer ) ) )* otherlv_13= ')' otherlv_14= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleMatrix1226); 

                	newLeafNode(otherlv_0, grammarAccess.getMatrixAccess().getMatrixKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleMatrix1238); 

                	newLeafNode(otherlv_1, grammarAccess.getMatrixAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleMatrix1250); 

                	newLeafNode(otherlv_2, grammarAccess.getMatrixAccess().getScaleKeyword_2());
                
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleMatrix1262); 

                	newLeafNode(otherlv_3, grammarAccess.getMatrixAccess().getLeftParenthesisKeyword_3());
                
             
                    newCompositeNode(grammarAccess.getMatrixAccess().getIdentifierParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleIdentifier_in_ruleMatrix1278);
            ruleIdentifier();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:627:1: (otherlv_5= '|' ruleIdentifier )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:627:3: otherlv_5= '|' ruleIdentifier
            	    {
            	    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleMatrix1290); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMatrixAccess().getVerticalLineKeyword_5_0());
            	        
            	     
            	            newCompositeNode(grammarAccess.getMatrixAccess().getIdentifierParserRuleCall_5_1()); 
            	        
            	    pushFollow(FOLLOW_ruleIdentifier_in_ruleMatrix1306);
            	    ruleIdentifier();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleMatrix1319); 

                	newLeafNode(otherlv_7, grammarAccess.getMatrixAccess().getRightParenthesisKeyword_6());
                
            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleMatrix1331); 

                	newLeafNode(otherlv_8, grammarAccess.getMatrixAccess().getQuestionsKeyword_7());
                
            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleMatrix1343); 

                	newLeafNode(otherlv_9, grammarAccess.getMatrixAccess().getLeftParenthesisKeyword_8());
                
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:651:1: ( (lv_answer_10_0= ruleAnswer ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:652:1: (lv_answer_10_0= ruleAnswer )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:652:1: (lv_answer_10_0= ruleAnswer )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:653:3: lv_answer_10_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getMatrixAccess().getAnswerAnswerParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleAnswer_in_ruleMatrix1364);
            lv_answer_10_0=ruleAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrixRule());
            	        }
                   		add(
                   			current, 
                   			"answer",
                    		lv_answer_10_0, 
                    		"Answer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:669:2: (otherlv_11= '|' ( (lv_answer_12_0= ruleAnswer ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:669:4: otherlv_11= '|' ( (lv_answer_12_0= ruleAnswer ) )
            	    {
            	    otherlv_11=(Token)match(input,26,FOLLOW_26_in_ruleMatrix1377); 

            	        	newLeafNode(otherlv_11, grammarAccess.getMatrixAccess().getVerticalLineKeyword_10_0());
            	        
            	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:673:1: ( (lv_answer_12_0= ruleAnswer ) )
            	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:674:1: (lv_answer_12_0= ruleAnswer )
            	    {
            	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:674:1: (lv_answer_12_0= ruleAnswer )
            	    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:675:3: lv_answer_12_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMatrixAccess().getAnswerAnswerParserRuleCall_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnswer_in_ruleMatrix1398);
            	    lv_answer_12_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMatrixRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answer",
            	            		lv_answer_12_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_13=(Token)match(input,22,FOLLOW_22_in_ruleMatrix1412); 

                	newLeafNode(otherlv_13, grammarAccess.getMatrixAccess().getRightParenthesisKeyword_11());
                
            otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleMatrix1424); 

                	newLeafNode(otherlv_14, grammarAccess.getMatrixAccess().getRightParenthesisKeyword_12());
                

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
    // $ANTLR end "ruleMatrix"


    // $ANTLR start "entryRuleComboBox"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:707:1: entryRuleComboBox returns [EObject current=null] : iv_ruleComboBox= ruleComboBox EOF ;
    public final EObject entryRuleComboBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComboBox = null;


        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:708:2: (iv_ruleComboBox= ruleComboBox EOF )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:709:2: iv_ruleComboBox= ruleComboBox EOF
            {
             newCompositeNode(grammarAccess.getComboBoxRule()); 
            pushFollow(FOLLOW_ruleComboBox_in_entryRuleComboBox1460);
            iv_ruleComboBox=ruleComboBox();

            state._fsp--;

             current =iv_ruleComboBox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComboBox1470); 

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
    // $ANTLR end "entryRuleComboBox"


    // $ANTLR start "ruleComboBox"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:716:1: ruleComboBox returns [EObject current=null] : ( (lv_name_0_0= 'ComboBox' ) ) ;
    public final EObject ruleComboBox() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:719:28: ( ( (lv_name_0_0= 'ComboBox' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:720:1: ( (lv_name_0_0= 'ComboBox' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:720:1: ( (lv_name_0_0= 'ComboBox' ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:721:1: (lv_name_0_0= 'ComboBox' )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:721:1: (lv_name_0_0= 'ComboBox' )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:722:3: lv_name_0_0= 'ComboBox'
            {
            lv_name_0_0=(Token)match(input,28,FOLLOW_28_in_ruleComboBox1512); 

                    newLeafNode(lv_name_0_0, grammarAccess.getComboBoxAccess().getNameComboBoxKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComboBoxRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "ComboBox");
            	    

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
    // $ANTLR end "ruleComboBox"


    // $ANTLR start "entryRuleDropDown"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:743:1: entryRuleDropDown returns [EObject current=null] : iv_ruleDropDown= ruleDropDown EOF ;
    public final EObject entryRuleDropDown() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropDown = null;


        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:744:2: (iv_ruleDropDown= ruleDropDown EOF )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:745:2: iv_ruleDropDown= ruleDropDown EOF
            {
             newCompositeNode(grammarAccess.getDropDownRule()); 
            pushFollow(FOLLOW_ruleDropDown_in_entryRuleDropDown1560);
            iv_ruleDropDown=ruleDropDown();

            state._fsp--;

             current =iv_ruleDropDown; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropDown1570); 

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
    // $ANTLR end "entryRuleDropDown"


    // $ANTLR start "ruleDropDown"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:752:1: ruleDropDown returns [EObject current=null] : ( (lv_name_0_0= 'DropDown' ) ) ;
    public final EObject ruleDropDown() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:755:28: ( ( (lv_name_0_0= 'DropDown' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:756:1: ( (lv_name_0_0= 'DropDown' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:756:1: ( (lv_name_0_0= 'DropDown' ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:757:1: (lv_name_0_0= 'DropDown' )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:757:1: (lv_name_0_0= 'DropDown' )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:758:3: lv_name_0_0= 'DropDown'
            {
            lv_name_0_0=(Token)match(input,29,FOLLOW_29_in_ruleDropDown1612); 

                    newLeafNode(lv_name_0_0, grammarAccess.getDropDownAccess().getNameDropDownKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDropDownRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "DropDown");
            	    

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
    // $ANTLR end "ruleDropDown"


    // $ANTLR start "entryRuleRadio"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:779:1: entryRuleRadio returns [EObject current=null] : iv_ruleRadio= ruleRadio EOF ;
    public final EObject entryRuleRadio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadio = null;


        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:780:2: (iv_ruleRadio= ruleRadio EOF )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:781:2: iv_ruleRadio= ruleRadio EOF
            {
             newCompositeNode(grammarAccess.getRadioRule()); 
            pushFollow(FOLLOW_ruleRadio_in_entryRuleRadio1660);
            iv_ruleRadio=ruleRadio();

            state._fsp--;

             current =iv_ruleRadio; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRadio1670); 

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
    // $ANTLR end "entryRuleRadio"


    // $ANTLR start "ruleRadio"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:788:1: ruleRadio returns [EObject current=null] : ( (lv_name_0_0= 'Radio' ) ) ;
    public final EObject ruleRadio() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:791:28: ( ( (lv_name_0_0= 'Radio' ) ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:792:1: ( (lv_name_0_0= 'Radio' ) )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:792:1: ( (lv_name_0_0= 'Radio' ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:793:1: (lv_name_0_0= 'Radio' )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:793:1: (lv_name_0_0= 'Radio' )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:794:3: lv_name_0_0= 'Radio'
            {
            lv_name_0_0=(Token)match(input,30,FOLLOW_30_in_ruleRadio1712); 

                    newLeafNode(lv_name_0_0, grammarAccess.getRadioAccess().getNameRadioKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRadioRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Radio");
            	    

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
    // $ANTLR end "ruleRadio"


    // $ANTLR start "entryRuleIdentifier"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:815:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:816:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:817:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier1761);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier1772); 

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
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:824:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:827:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:828:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:828:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case RULE_STRING:
                {
                alt7=2;
                }
                break;
            case RULE_INT:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:828:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdentifier1812); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:836:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIdentifier1838); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getIdentifierAccess().getSTRINGTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:844:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIdentifier1864); 

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


    // $ANTLR start "entryRuleMandatory"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:859:1: entryRuleMandatory returns [String current=null] : iv_ruleMandatory= ruleMandatory EOF ;
    public final String entryRuleMandatory() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMandatory = null;


        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:860:2: (iv_ruleMandatory= ruleMandatory EOF )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:861:2: iv_ruleMandatory= ruleMandatory EOF
            {
             newCompositeNode(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory1910);
            iv_ruleMandatory=ruleMandatory();

            state._fsp--;

             current =iv_ruleMandatory.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory1921); 

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
    // $ANTLR end "entryRuleMandatory"


    // $ANTLR start "ruleMandatory"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:868:1: ruleMandatory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Yes' | kw= 'No' ) ;
    public final AntlrDatatypeRuleToken ruleMandatory() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:871:28: ( (kw= 'Yes' | kw= 'No' ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:872:1: (kw= 'Yes' | kw= 'No' )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:872:1: (kw= 'Yes' | kw= 'No' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            else if ( (LA8_0==32) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:873:2: kw= 'Yes'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleMandatory1959); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMandatoryAccess().getYesKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:880:2: kw= 'No'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleMandatory1978); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMandatoryAccess().getNoKeyword_1()); 
                        

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
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleType"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:893:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:894:2: (iv_ruleType= ruleType EOF )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:895:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2018);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2028); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:902:1: ruleType returns [EObject current=null] : (this_TextLn_0= ruleTextLn | this_ComboBox_1= ruleComboBox | this_DropDown_2= ruleDropDown | this_TextBl_3= ruleTextBl | this_Matrix_4= ruleMatrix | this_Radio_5= ruleRadio ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_TextLn_0 = null;

        EObject this_ComboBox_1 = null;

        EObject this_DropDown_2 = null;

        EObject this_TextBl_3 = null;

        EObject this_Matrix_4 = null;

        EObject this_Radio_5 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:905:28: ( (this_TextLn_0= ruleTextLn | this_ComboBox_1= ruleComboBox | this_DropDown_2= ruleDropDown | this_TextBl_3= ruleTextBl | this_Matrix_4= ruleMatrix | this_Radio_5= ruleRadio ) )
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:906:1: (this_TextLn_0= ruleTextLn | this_ComboBox_1= ruleComboBox | this_DropDown_2= ruleDropDown | this_TextBl_3= ruleTextBl | this_Matrix_4= ruleMatrix | this_Radio_5= ruleRadio )
            {
            // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:906:1: (this_TextLn_0= ruleTextLn | this_ComboBox_1= ruleComboBox | this_DropDown_2= ruleDropDown | this_TextBl_3= ruleTextBl | this_Matrix_4= ruleMatrix | this_Radio_5= ruleRadio )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 28:
                {
                alt9=2;
                }
                break;
            case 29:
                {
                alt9=3;
                }
                break;
            case 23:
                {
                alt9=4;
                }
                break;
            case 24:
                {
                alt9=5;
                }
                break;
            case 30:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:907:5: this_TextLn_0= ruleTextLn
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getTextLnParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTextLn_in_ruleType2075);
                    this_TextLn_0=ruleTextLn();

                    state._fsp--;

                     
                            current = this_TextLn_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:917:5: this_ComboBox_1= ruleComboBox
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getComboBoxParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComboBox_in_ruleType2102);
                    this_ComboBox_1=ruleComboBox();

                    state._fsp--;

                     
                            current = this_ComboBox_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:927:5: this_DropDown_2= ruleDropDown
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDropDownParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDropDown_in_ruleType2129);
                    this_DropDown_2=ruleDropDown();

                    state._fsp--;

                     
                            current = this_DropDown_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:937:5: this_TextBl_3= ruleTextBl
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getTextBlParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTextBl_in_ruleType2156);
                    this_TextBl_3=ruleTextBl();

                    state._fsp--;

                     
                            current = this_TextBl_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:947:5: this_Matrix_4= ruleMatrix
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getMatrixParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleMatrix_in_ruleType2183);
                    this_Matrix_4=ruleMatrix();

                    state._fsp--;

                     
                            current = this_Matrix_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.nordakademie.mwi13a.team1.survey/src-gen/de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.g:957:5: this_Radio_5= ruleRadio
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRadioParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleRadio_in_ruleType2210);
                    this_Radio_5=ruleRadio();

                    state._fsp--;

                     
                            current = this_Radio_5; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleType"

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
    public static final BitSet FOLLOW_12_in_rulePart431 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePart443 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rulePart464 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleQuestion_in_rulePart485 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_rulePart498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleQuestion581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestion598 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQuestion615 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleQuestion627 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleQuestion648 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQuestion660 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_ruleMandatory_in_ruleQuestion681 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQuestion693 = new BitSet(new long[]{0x0000000071900000L});
    public static final BitSet FOLLOW_ruleType_in_ruleQuestion714 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleAnswer_in_ruleQuestion735 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleQuestion748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnswer794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleAnswer831 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleAnswer852 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAnswer864 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleAnswer885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextLn_in_entryRuleTextLn921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextLn931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleTextLn968 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTextLn980 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTextLn997 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTextLn1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextBl_in_entryRuleTextBl1050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextBl1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleTextBl1097 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTextBl1109 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTextBl1126 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTextBl1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_entryRuleMatrix1179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatrix1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleMatrix1226 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMatrix1238 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMatrix1250 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMatrix1262 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleMatrix1278 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_26_in_ruleMatrix1290 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleMatrix1306 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_22_in_ruleMatrix1319 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMatrix1331 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMatrix1343 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleAnswer_in_ruleMatrix1364 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_26_in_ruleMatrix1377 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleAnswer_in_ruleMatrix1398 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_22_in_ruleMatrix1412 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMatrix1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComboBox_in_entryRuleComboBox1460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComboBox1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleComboBox1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropDown_in_entryRuleDropDown1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropDown1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDropDown1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadio_in_entryRuleRadio1660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRadio1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleRadio1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier1761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdentifier1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIdentifier1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIdentifier1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory1910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleMandatory1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleMandatory1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextLn_in_ruleType2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComboBox_in_ruleType2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropDown_in_ruleType2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextBl_in_ruleType2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatrix_in_ruleType2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRadio_in_ruleType2210 = new BitSet(new long[]{0x0000000000000002L});

}