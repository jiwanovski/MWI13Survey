package de.nordakademie.mwi13a.team1.dependency.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.nordakademie.mwi13a.team1.dependency.services.DependencyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDependencyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Survey:'", "'{'", "'}'", "'Part:'", "'Next part (default):'", "'Next parts {'", "'Next part:'", "'Part dependencies {'", "'AND'", "'OR'", "'Question:'", "'Answer:'"
    };
    public static final int RULE_ID=5;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
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


        public InternalDependencyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDependencyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDependencyParser.tokenNames; }
    public String getGrammarFileName() { return "../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g"; }



     	private DependencyGrammarAccess grammarAccess;
     	
        public InternalDependencyParser(TokenStream input, DependencyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SurveyDependencies";	
       	}
       	
       	@Override
       	protected DependencyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSurveyDependencies"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:67:1: entryRuleSurveyDependencies returns [EObject current=null] : iv_ruleSurveyDependencies= ruleSurveyDependencies EOF ;
    public final EObject entryRuleSurveyDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurveyDependencies = null;


        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:68:2: (iv_ruleSurveyDependencies= ruleSurveyDependencies EOF )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:69:2: iv_ruleSurveyDependencies= ruleSurveyDependencies EOF
            {
             newCompositeNode(grammarAccess.getSurveyDependenciesRule()); 
            pushFollow(FOLLOW_ruleSurveyDependencies_in_entryRuleSurveyDependencies75);
            iv_ruleSurveyDependencies=ruleSurveyDependencies();

            state._fsp--;

             current =iv_ruleSurveyDependencies; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSurveyDependencies85); 

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
    // $ANTLR end "entryRuleSurveyDependencies"


    // $ANTLR start "ruleSurveyDependencies"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:76:1: ruleSurveyDependencies returns [EObject current=null] : ( (lv_surveyDependency_0_0= ruleSurveyDependency ) )+ ;
    public final EObject ruleSurveyDependencies() throws RecognitionException {
        EObject current = null;

        EObject lv_surveyDependency_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:79:28: ( ( (lv_surveyDependency_0_0= ruleSurveyDependency ) )+ )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:80:1: ( (lv_surveyDependency_0_0= ruleSurveyDependency ) )+
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:80:1: ( (lv_surveyDependency_0_0= ruleSurveyDependency ) )+
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
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:81:1: (lv_surveyDependency_0_0= ruleSurveyDependency )
            	    {
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:81:1: (lv_surveyDependency_0_0= ruleSurveyDependency )
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:82:3: lv_surveyDependency_0_0= ruleSurveyDependency
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyDependenciesAccess().getSurveyDependencySurveyDependencyParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSurveyDependency_in_ruleSurveyDependencies130);
            	    lv_surveyDependency_0_0=ruleSurveyDependency();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyDependenciesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"surveyDependency",
            	            		lv_surveyDependency_0_0, 
            	            		"SurveyDependency");
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
    // $ANTLR end "ruleSurveyDependencies"


    // $ANTLR start "entryRuleSurveyDependency"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:108:1: entryRuleSurveyDependency returns [EObject current=null] : iv_ruleSurveyDependency= ruleSurveyDependency EOF ;
    public final EObject entryRuleSurveyDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurveyDependency = null;


        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:109:2: (iv_ruleSurveyDependency= ruleSurveyDependency EOF )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:110:2: iv_ruleSurveyDependency= ruleSurveyDependency EOF
            {
             newCompositeNode(grammarAccess.getSurveyDependencyRule()); 
            pushFollow(FOLLOW_ruleSurveyDependency_in_entryRuleSurveyDependency168);
            iv_ruleSurveyDependency=ruleSurveyDependency();

            state._fsp--;

             current =iv_ruleSurveyDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSurveyDependency178); 

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
    // $ANTLR end "entryRuleSurveyDependency"


    // $ANTLR start "ruleSurveyDependency"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:117:1: ruleSurveyDependency returns [EObject current=null] : (otherlv_0= 'Survey:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= '{' ( (lv_part_3_0= ruleSDPart ) )+ otherlv_4= '}' ) ;
    public final EObject ruleSurveyDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_part_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:120:28: ( (otherlv_0= 'Survey:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= '{' ( (lv_part_3_0= ruleSDPart ) )+ otherlv_4= '}' ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:121:1: (otherlv_0= 'Survey:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= '{' ( (lv_part_3_0= ruleSDPart ) )+ otherlv_4= '}' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:121:1: (otherlv_0= 'Survey:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= '{' ( (lv_part_3_0= ruleSDPart ) )+ otherlv_4= '}' )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:121:3: otherlv_0= 'Survey:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= '{' ( (lv_part_3_0= ruleSDPart ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSurveyDependency215); 

                	newLeafNode(otherlv_0, grammarAccess.getSurveyDependencyAccess().getSurveyKeyword_0());
                
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:125:1: ( (otherlv_1= RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:126:1: (otherlv_1= RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:126:1: (otherlv_1= RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:127:3: otherlv_1= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSurveyDependencyRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSurveyDependency235); 

            		newLeafNode(otherlv_1, grammarAccess.getSurveyDependencyAccess().getSurveyQuestionnaireCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSurveyDependency247); 

                	newLeafNode(otherlv_2, grammarAccess.getSurveyDependencyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:142:1: ( (lv_part_3_0= ruleSDPart ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:143:1: (lv_part_3_0= ruleSDPart )
            	    {
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:143:1: (lv_part_3_0= ruleSDPart )
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:144:3: lv_part_3_0= ruleSDPart
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyDependencyAccess().getPartSDPartParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSDPart_in_ruleSurveyDependency268);
            	    lv_part_3_0=ruleSDPart();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyDependencyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"part",
            	            		lv_part_3_0, 
            	            		"SDPart");
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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleSurveyDependency281); 

                	newLeafNode(otherlv_4, grammarAccess.getSurveyDependencyAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleSurveyDependency"


    // $ANTLR start "entryRuleSDPart"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:172:1: entryRuleSDPart returns [EObject current=null] : iv_ruleSDPart= ruleSDPart EOF ;
    public final EObject entryRuleSDPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDPart = null;


        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:173:2: (iv_ruleSDPart= ruleSDPart EOF )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:174:2: iv_ruleSDPart= ruleSDPart EOF
            {
             newCompositeNode(grammarAccess.getSDPartRule()); 
            pushFollow(FOLLOW_ruleSDPart_in_entryRuleSDPart317);
            iv_ruleSDPart=ruleSDPart();

            state._fsp--;

             current =iv_ruleSDPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSDPart327); 

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
    // $ANTLR end "entryRuleSDPart"


    // $ANTLR start "ruleSDPart"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:181:1: ruleSDPart returns [EObject current=null] : (otherlv_0= 'Part:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Next part (default):' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= 'Next parts {' ( (lv_nextParts_6_0= ruleSDNextParts ) )* otherlv_7= '}' )? otherlv_8= '}' ) ;
    public final EObject ruleSDPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_nextParts_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:184:28: ( (otherlv_0= 'Part:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Next part (default):' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= 'Next parts {' ( (lv_nextParts_6_0= ruleSDNextParts ) )* otherlv_7= '}' )? otherlv_8= '}' ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:185:1: (otherlv_0= 'Part:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Next part (default):' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= 'Next parts {' ( (lv_nextParts_6_0= ruleSDNextParts ) )* otherlv_7= '}' )? otherlv_8= '}' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:185:1: (otherlv_0= 'Part:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Next part (default):' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= 'Next parts {' ( (lv_nextParts_6_0= ruleSDNextParts ) )* otherlv_7= '}' )? otherlv_8= '}' )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:185:3: otherlv_0= 'Part:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'Next part (default):' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= 'Next parts {' ( (lv_nextParts_6_0= ruleSDNextParts ) )* otherlv_7= '}' )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleSDPart364); 

                	newLeafNode(otherlv_0, grammarAccess.getSDPartAccess().getPartKeyword_0());
                
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:189:1: ( (otherlv_1= RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:190:1: (otherlv_1= RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:190:1: (otherlv_1= RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:191:3: otherlv_1= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSDPartRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSDPart384); 

            		newLeafNode(otherlv_1, grammarAccess.getSDPartAccess().getPart2PartCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSDPart396); 

                	newLeafNode(otherlv_2, grammarAccess.getSDPartAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSDPart408); 

                	newLeafNode(otherlv_3, grammarAccess.getSDPartAccess().getNextPartDefaultKeyword_3());
                
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:210:1: ( (otherlv_4= RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:211:1: (otherlv_4= RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:211:1: (otherlv_4= RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:212:3: otherlv_4= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSDPartRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSDPart428); 

            		newLeafNode(otherlv_4, grammarAccess.getSDPartAccess().getDefaultNextPartPartCrossReference_4_0()); 
            	

            }


            }

            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:223:2: (otherlv_5= 'Next parts {' ( (lv_nextParts_6_0= ruleSDNextParts ) )* otherlv_7= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:223:4: otherlv_5= 'Next parts {' ( (lv_nextParts_6_0= ruleSDNextParts ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleSDPart441); 

                        	newLeafNode(otherlv_5, grammarAccess.getSDPartAccess().getNextPartsKeyword_5_0());
                        
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:227:1: ( (lv_nextParts_6_0= ruleSDNextParts ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:228:1: (lv_nextParts_6_0= ruleSDNextParts )
                    	    {
                    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:228:1: (lv_nextParts_6_0= ruleSDNextParts )
                    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:229:3: lv_nextParts_6_0= ruleSDNextParts
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSDPartAccess().getNextPartsSDNextPartsParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSDNextParts_in_ruleSDPart462);
                    	    lv_nextParts_6_0=ruleSDNextParts();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSDPartRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nextParts",
                    	            		lv_nextParts_6_0, 
                    	            		"SDNextParts");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleSDPart475); 

                        	newLeafNode(otherlv_7, grammarAccess.getSDPartAccess().getRightCurlyBracketKeyword_5_2());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleSDPart489); 

                	newLeafNode(otherlv_8, grammarAccess.getSDPartAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleSDPart"


    // $ANTLR start "entryRuleSDNextParts"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:261:1: entryRuleSDNextParts returns [EObject current=null] : iv_ruleSDNextParts= ruleSDNextParts EOF ;
    public final EObject entryRuleSDNextParts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDNextParts = null;


        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:262:2: (iv_ruleSDNextParts= ruleSDNextParts EOF )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:263:2: iv_ruleSDNextParts= ruleSDNextParts EOF
            {
             newCompositeNode(grammarAccess.getSDNextPartsRule()); 
            pushFollow(FOLLOW_ruleSDNextParts_in_entryRuleSDNextParts525);
            iv_ruleSDNextParts=ruleSDNextParts();

            state._fsp--;

             current =iv_ruleSDNextParts; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSDNextParts535); 

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
    // $ANTLR end "entryRuleSDNextParts"


    // $ANTLR start "ruleSDNextParts"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:270:1: ruleSDNextParts returns [EObject current=null] : (otherlv_0= 'Next part:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'Part dependencies {' ( (lv_partDependencies_3_0= ruleSDPartDependencies ) ) ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_partDependencies_6_0= ruleSDPartDependencies ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleSDNextParts() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_partDependencies_3_0 = null;

        EObject lv_partDependencies_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:273:28: ( (otherlv_0= 'Next part:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'Part dependencies {' ( (lv_partDependencies_3_0= ruleSDPartDependencies ) ) ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_partDependencies_6_0= ruleSDPartDependencies ) ) )* otherlv_7= '}' ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:274:1: (otherlv_0= 'Next part:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'Part dependencies {' ( (lv_partDependencies_3_0= ruleSDPartDependencies ) ) ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_partDependencies_6_0= ruleSDPartDependencies ) ) )* otherlv_7= '}' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:274:1: (otherlv_0= 'Next part:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'Part dependencies {' ( (lv_partDependencies_3_0= ruleSDPartDependencies ) ) ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_partDependencies_6_0= ruleSDPartDependencies ) ) )* otherlv_7= '}' )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:274:3: otherlv_0= 'Next part:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'Part dependencies {' ( (lv_partDependencies_3_0= ruleSDPartDependencies ) ) ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_partDependencies_6_0= ruleSDPartDependencies ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleSDNextParts572); 

                	newLeafNode(otherlv_0, grammarAccess.getSDNextPartsAccess().getNextPartKeyword_0());
                
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:278:1: ( (otherlv_1= RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:279:1: (otherlv_1= RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:279:1: (otherlv_1= RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:280:3: otherlv_1= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSDNextPartsRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSDNextParts592); 

            		newLeafNode(otherlv_1, grammarAccess.getSDNextPartsAccess().getNextPartPartCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleSDNextParts604); 

                	newLeafNode(otherlv_2, grammarAccess.getSDNextPartsAccess().getPartDependenciesKeyword_2());
                
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:295:1: ( (lv_partDependencies_3_0= ruleSDPartDependencies ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:296:1: (lv_partDependencies_3_0= ruleSDPartDependencies )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:296:1: (lv_partDependencies_3_0= ruleSDPartDependencies )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:297:3: lv_partDependencies_3_0= ruleSDPartDependencies
            {
             
            	        newCompositeNode(grammarAccess.getSDNextPartsAccess().getPartDependenciesSDPartDependenciesParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSDPartDependencies_in_ruleSDNextParts625);
            lv_partDependencies_3_0=ruleSDPartDependencies();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSDNextPartsRule());
            	        }
                   		add(
                   			current, 
                   			"partDependencies",
                    		lv_partDependencies_3_0, 
                    		"SDPartDependencies");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:313:2: ( (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_partDependencies_6_0= ruleSDPartDependencies ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=19 && LA6_0<=20)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:313:3: (otherlv_4= 'AND' | otherlv_5= 'OR' ) ( (lv_partDependencies_6_0= ruleSDPartDependencies ) )
            	    {
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:313:3: (otherlv_4= 'AND' | otherlv_5= 'OR' )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==19) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==20) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:313:5: otherlv_4= 'AND'
            	            {
            	            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleSDNextParts639); 

            	                	newLeafNode(otherlv_4, grammarAccess.getSDNextPartsAccess().getANDKeyword_4_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:318:7: otherlv_5= 'OR'
            	            {
            	            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleSDNextParts657); 

            	                	newLeafNode(otherlv_5, grammarAccess.getSDNextPartsAccess().getORKeyword_4_0_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:322:2: ( (lv_partDependencies_6_0= ruleSDPartDependencies ) )
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:323:1: (lv_partDependencies_6_0= ruleSDPartDependencies )
            	    {
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:323:1: (lv_partDependencies_6_0= ruleSDPartDependencies )
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:324:3: lv_partDependencies_6_0= ruleSDPartDependencies
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSDNextPartsAccess().getPartDependenciesSDPartDependenciesParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSDPartDependencies_in_ruleSDNextParts679);
            	    lv_partDependencies_6_0=ruleSDPartDependencies();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSDNextPartsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"partDependencies",
            	            		lv_partDependencies_6_0, 
            	            		"SDPartDependencies");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleSDNextParts693); 

                	newLeafNode(otherlv_7, grammarAccess.getSDNextPartsAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleSDNextParts"


    // $ANTLR start "entryRuleSDPartDependencies"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:352:1: entryRuleSDPartDependencies returns [EObject current=null] : iv_ruleSDPartDependencies= ruleSDPartDependencies EOF ;
    public final EObject entryRuleSDPartDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDPartDependencies = null;


        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:353:2: (iv_ruleSDPartDependencies= ruleSDPartDependencies EOF )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:354:2: iv_ruleSDPartDependencies= ruleSDPartDependencies EOF
            {
             newCompositeNode(grammarAccess.getSDPartDependenciesRule()); 
            pushFollow(FOLLOW_ruleSDPartDependencies_in_entryRuleSDPartDependencies729);
            iv_ruleSDPartDependencies=ruleSDPartDependencies();

            state._fsp--;

             current =iv_ruleSDPartDependencies; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSDPartDependencies739); 

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
    // $ANTLR end "entryRuleSDPartDependencies"


    // $ANTLR start "ruleSDPartDependencies"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:361:1: ruleSDPartDependencies returns [EObject current=null] : (otherlv_0= 'Question:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'Answer:' ( (otherlv_3= RULE_STRING ) ) ) ;
    public final EObject ruleSDPartDependencies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:364:28: ( (otherlv_0= 'Question:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'Answer:' ( (otherlv_3= RULE_STRING ) ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:365:1: (otherlv_0= 'Question:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'Answer:' ( (otherlv_3= RULE_STRING ) ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:365:1: (otherlv_0= 'Question:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'Answer:' ( (otherlv_3= RULE_STRING ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:365:3: otherlv_0= 'Question:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'Answer:' ( (otherlv_3= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleSDPartDependencies776); 

                	newLeafNode(otherlv_0, grammarAccess.getSDPartDependenciesAccess().getQuestionKeyword_0());
                
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:369:1: ( (otherlv_1= RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:370:1: (otherlv_1= RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:370:1: (otherlv_1= RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:371:3: otherlv_1= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSDPartDependenciesRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSDPartDependencies796); 

            		newLeafNode(otherlv_1, grammarAccess.getSDPartDependenciesAccess().getQuestionQuestionCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleSDPartDependencies808); 

                	newLeafNode(otherlv_2, grammarAccess.getSDPartDependenciesAccess().getAnswerKeyword_2());
                
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:386:1: ( (otherlv_3= RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:387:1: (otherlv_3= RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:387:1: (otherlv_3= RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:388:3: otherlv_3= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSDPartDependenciesRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSDPartDependencies828); 

            		newLeafNode(otherlv_3, grammarAccess.getSDPartDependenciesAccess().getAnswerAnswerCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleSDPartDependencies"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSurveyDependencies_in_entryRuleSurveyDependencies75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurveyDependencies85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSurveyDependency_in_ruleSurveyDependencies130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleSurveyDependency_in_entryRuleSurveyDependency168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurveyDependency178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSurveyDependency215 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSurveyDependency235 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSurveyDependency247 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleSDPart_in_ruleSurveyDependency268 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleSurveyDependency281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDPart_in_entryRuleSDPart317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSDPart327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSDPart364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSDPart384 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSDPart396 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSDPart408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSDPart428 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleSDPart441 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ruleSDNextParts_in_ruleSDPart462 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleSDPart475 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSDPart489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDNextParts_in_entryRuleSDNextParts525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSDNextParts535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSDNextParts572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSDNextParts592 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSDNextParts604 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleSDPartDependencies_in_ruleSDNextParts625 = new BitSet(new long[]{0x0000000000182000L});
    public static final BitSet FOLLOW_19_in_ruleSDNextParts639 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20_in_ruleSDNextParts657 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleSDPartDependencies_in_ruleSDNextParts679 = new BitSet(new long[]{0x0000000000182000L});
    public static final BitSet FOLLOW_13_in_ruleSDNextParts693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDPartDependencies_in_entryRuleSDPartDependencies729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSDPartDependencies739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSDPartDependencies776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSDPartDependencies796 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSDPartDependencies808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSDPartDependencies828 = new BitSet(new long[]{0x0000000000000002L});

}