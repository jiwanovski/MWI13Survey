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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Survey:'", "'{'", "'}'", "'Part:'", "'Next parts {'", "'OR'", "'Next part:'", "'Part dependencies'", "'AND'", "'('", "')'", "'Question:'", "'Answer:'", "'Matrix:'", "'|'", "'Matrix Question:'", "'Matrix Scale:'"
    };
    public static final int RULE_ID=5;
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
        	return "DependencyModel";	
       	}
       	
       	@Override
       	protected DependencyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDependencyModel"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:67:1: entryRuleDependencyModel returns [EObject current=null] : iv_ruleDependencyModel= ruleDependencyModel EOF ;
    public final EObject entryRuleDependencyModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyModel = null;


        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:68:2: (iv_ruleDependencyModel= ruleDependencyModel EOF )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:69:2: iv_ruleDependencyModel= ruleDependencyModel EOF
            {
             newCompositeNode(grammarAccess.getDependencyModelRule()); 
            pushFollow(FOLLOW_ruleDependencyModel_in_entryRuleDependencyModel75);
            iv_ruleDependencyModel=ruleDependencyModel();

            state._fsp--;

             current =iv_ruleDependencyModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencyModel85); 

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
    // $ANTLR end "entryRuleDependencyModel"


    // $ANTLR start "ruleDependencyModel"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:76:1: ruleDependencyModel returns [EObject current=null] : ( (lv_elements_0_0= ruleSurveyElements ) )+ ;
    public final EObject ruleDependencyModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:79:28: ( ( (lv_elements_0_0= ruleSurveyElements ) )+ )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:80:1: ( (lv_elements_0_0= ruleSurveyElements ) )+
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:80:1: ( (lv_elements_0_0= ruleSurveyElements ) )+
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
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:81:1: (lv_elements_0_0= ruleSurveyElements )
            	    {
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:81:1: (lv_elements_0_0= ruleSurveyElements )
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:82:3: lv_elements_0_0= ruleSurveyElements
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDependencyModelAccess().getElementsSurveyElementsParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSurveyElements_in_ruleDependencyModel130);
            	    lv_elements_0_0=ruleSurveyElements();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDependencyModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"SurveyElements");
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
    // $ANTLR end "ruleDependencyModel"


    // $ANTLR start "entryRuleSurveyElements"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:106:1: entryRuleSurveyElements returns [EObject current=null] : iv_ruleSurveyElements= ruleSurveyElements EOF ;
    public final EObject entryRuleSurveyElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurveyElements = null;


        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:107:2: (iv_ruleSurveyElements= ruleSurveyElements EOF )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:108:2: iv_ruleSurveyElements= ruleSurveyElements EOF
            {
             newCompositeNode(grammarAccess.getSurveyElementsRule()); 
            pushFollow(FOLLOW_ruleSurveyElements_in_entryRuleSurveyElements166);
            iv_ruleSurveyElements=ruleSurveyElements();

            state._fsp--;

             current =iv_ruleSurveyElements; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSurveyElements176); 

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
    // $ANTLR end "entryRuleSurveyElements"


    // $ANTLR start "ruleSurveyElements"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:115:1: ruleSurveyElements returns [EObject current=null] : (otherlv_0= 'Survey:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= '{' ( (lv_partElements_3_0= rulePartElements ) )+ otherlv_4= '}' ) ;
    public final EObject ruleSurveyElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_partElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:118:28: ( (otherlv_0= 'Survey:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= '{' ( (lv_partElements_3_0= rulePartElements ) )+ otherlv_4= '}' ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:119:1: (otherlv_0= 'Survey:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= '{' ( (lv_partElements_3_0= rulePartElements ) )+ otherlv_4= '}' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:119:1: (otherlv_0= 'Survey:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= '{' ( (lv_partElements_3_0= rulePartElements ) )+ otherlv_4= '}' )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:119:3: otherlv_0= 'Survey:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= '{' ( (lv_partElements_3_0= rulePartElements ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSurveyElements213); 

                	newLeafNode(otherlv_0, grammarAccess.getSurveyElementsAccess().getSurveyKeyword_0());
                
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:123:1: ( (otherlv_1= RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:124:1: (otherlv_1= RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:124:1: (otherlv_1= RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:125:3: otherlv_1= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSurveyElementsRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSurveyElements233); 

            		newLeafNode(otherlv_1, grammarAccess.getSurveyElementsAccess().getNameQuestionnaireCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSurveyElements245); 

                	newLeafNode(otherlv_2, grammarAccess.getSurveyElementsAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:140:1: ( (lv_partElements_3_0= rulePartElements ) )+
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
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:141:1: (lv_partElements_3_0= rulePartElements )
            	    {
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:141:1: (lv_partElements_3_0= rulePartElements )
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:142:3: lv_partElements_3_0= rulePartElements
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyElementsAccess().getPartElementsPartElementsParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePartElements_in_ruleSurveyElements266);
            	    lv_partElements_3_0=rulePartElements();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyElementsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"partElements",
            	            		lv_partElements_3_0, 
            	            		"PartElements");
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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleSurveyElements279); 

                	newLeafNode(otherlv_4, grammarAccess.getSurveyElementsAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleSurveyElements"


    // $ANTLR start "entryRulePartElements"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:170:1: entryRulePartElements returns [EObject current=null] : iv_rulePartElements= rulePartElements EOF ;
    public final EObject entryRulePartElements() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartElements = null;


        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:171:2: (iv_rulePartElements= rulePartElements EOF )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:172:2: iv_rulePartElements= rulePartElements EOF
            {
             newCompositeNode(grammarAccess.getPartElementsRule()); 
            pushFollow(FOLLOW_rulePartElements_in_entryRulePartElements315);
            iv_rulePartElements=rulePartElements();

            state._fsp--;

             current =iv_rulePartElements; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePartElements325); 

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
    // $ANTLR end "entryRulePartElements"


    // $ANTLR start "rulePartElements"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:179:1: rulePartElements returns [EObject current=null] : (otherlv_0= 'Part:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'Next parts {' ( ( (lv_nextParts_3_0= ruleDMNextParts ) ) (otherlv_4= 'OR' ( (lv_nextParts_5_0= ruleDMNextParts ) ) )* ) otherlv_6= '}' )+ ) ;
    public final EObject rulePartElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_nextParts_3_0 = null;

        EObject lv_nextParts_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:182:28: ( (otherlv_0= 'Part:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'Next parts {' ( ( (lv_nextParts_3_0= ruleDMNextParts ) ) (otherlv_4= 'OR' ( (lv_nextParts_5_0= ruleDMNextParts ) ) )* ) otherlv_6= '}' )+ ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:183:1: (otherlv_0= 'Part:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'Next parts {' ( ( (lv_nextParts_3_0= ruleDMNextParts ) ) (otherlv_4= 'OR' ( (lv_nextParts_5_0= ruleDMNextParts ) ) )* ) otherlv_6= '}' )+ )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:183:1: (otherlv_0= 'Part:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'Next parts {' ( ( (lv_nextParts_3_0= ruleDMNextParts ) ) (otherlv_4= 'OR' ( (lv_nextParts_5_0= ruleDMNextParts ) ) )* ) otherlv_6= '}' )+ )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:183:3: otherlv_0= 'Part:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'Next parts {' ( ( (lv_nextParts_3_0= ruleDMNextParts ) ) (otherlv_4= 'OR' ( (lv_nextParts_5_0= ruleDMNextParts ) ) )* ) otherlv_6= '}' )+
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulePartElements362); 

                	newLeafNode(otherlv_0, grammarAccess.getPartElementsAccess().getPartKeyword_0());
                
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:187:1: ( (otherlv_1= RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:188:1: (otherlv_1= RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:188:1: (otherlv_1= RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:189:3: otherlv_1= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPartElementsRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePartElements382); 

            		newLeafNode(otherlv_1, grammarAccess.getPartElementsAccess().getNamePartCrossReference_1_0()); 
            	

            }


            }

            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:200:2: (otherlv_2= 'Next parts {' ( ( (lv_nextParts_3_0= ruleDMNextParts ) ) (otherlv_4= 'OR' ( (lv_nextParts_5_0= ruleDMNextParts ) ) )* ) otherlv_6= '}' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:200:4: otherlv_2= 'Next parts {' ( ( (lv_nextParts_3_0= ruleDMNextParts ) ) (otherlv_4= 'OR' ( (lv_nextParts_5_0= ruleDMNextParts ) ) )* ) otherlv_6= '}'
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePartElements395); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPartElementsAccess().getNextPartsKeyword_2_0());
            	        
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:204:1: ( ( (lv_nextParts_3_0= ruleDMNextParts ) ) (otherlv_4= 'OR' ( (lv_nextParts_5_0= ruleDMNextParts ) ) )* )
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:204:2: ( (lv_nextParts_3_0= ruleDMNextParts ) ) (otherlv_4= 'OR' ( (lv_nextParts_5_0= ruleDMNextParts ) ) )*
            	    {
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:204:2: ( (lv_nextParts_3_0= ruleDMNextParts ) )
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:205:1: (lv_nextParts_3_0= ruleDMNextParts )
            	    {
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:205:1: (lv_nextParts_3_0= ruleDMNextParts )
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:206:3: lv_nextParts_3_0= ruleDMNextParts
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPartElementsAccess().getNextPartsDMNextPartsParserRuleCall_2_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDMNextParts_in_rulePartElements417);
            	    lv_nextParts_3_0=ruleDMNextParts();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPartElementsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nextParts",
            	            		lv_nextParts_3_0, 
            	            		"DMNextParts");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:222:2: (otherlv_4= 'OR' ( (lv_nextParts_5_0= ruleDMNextParts ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==16) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:222:4: otherlv_4= 'OR' ( (lv_nextParts_5_0= ruleDMNextParts ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_rulePartElements430); 

            	    	        	newLeafNode(otherlv_4, grammarAccess.getPartElementsAccess().getORKeyword_2_1_1_0());
            	    	        
            	    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:226:1: ( (lv_nextParts_5_0= ruleDMNextParts ) )
            	    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:227:1: (lv_nextParts_5_0= ruleDMNextParts )
            	    	    {
            	    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:227:1: (lv_nextParts_5_0= ruleDMNextParts )
            	    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:228:3: lv_nextParts_5_0= ruleDMNextParts
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getPartElementsAccess().getNextPartsDMNextPartsParserRuleCall_2_1_1_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDMNextParts_in_rulePartElements451);
            	    	    lv_nextParts_5_0=ruleDMNextParts();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getPartElementsRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"nextParts",
            	    	            		lv_nextParts_5_0, 
            	    	            		"DMNextParts");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }

            	    otherlv_6=(Token)match(input,13,FOLLOW_13_in_rulePartElements466); 

            	        	newLeafNode(otherlv_6, grammarAccess.getPartElementsAccess().getRightCurlyBracketKeyword_2_2());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


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
    // $ANTLR end "rulePartElements"


    // $ANTLR start "entryRuleDMNextParts"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:256:1: entryRuleDMNextParts returns [EObject current=null] : iv_ruleDMNextParts= ruleDMNextParts EOF ;
    public final EObject entryRuleDMNextParts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMNextParts = null;


        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:257:2: (iv_ruleDMNextParts= ruleDMNextParts EOF )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:258:2: iv_ruleDMNextParts= ruleDMNextParts EOF
            {
             newCompositeNode(grammarAccess.getDMNextPartsRule()); 
            pushFollow(FOLLOW_ruleDMNextParts_in_entryRuleDMNextParts504);
            iv_ruleDMNextParts=ruleDMNextParts();

            state._fsp--;

             current =iv_ruleDMNextParts; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDMNextParts514); 

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
    // $ANTLR end "entryRuleDMNextParts"


    // $ANTLR start "ruleDMNextParts"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:265:1: ruleDMNextParts returns [EObject current=null] : (otherlv_0= 'Next part:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'Part dependencies' otherlv_3= '{' ( (lv_expressions_4_0= ruleDependency ) )+ otherlv_5= '}' )? ) ;
    public final EObject ruleDMNextParts() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expressions_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:268:28: ( (otherlv_0= 'Next part:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'Part dependencies' otherlv_3= '{' ( (lv_expressions_4_0= ruleDependency ) )+ otherlv_5= '}' )? ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:269:1: (otherlv_0= 'Next part:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'Part dependencies' otherlv_3= '{' ( (lv_expressions_4_0= ruleDependency ) )+ otherlv_5= '}' )? )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:269:1: (otherlv_0= 'Next part:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'Part dependencies' otherlv_3= '{' ( (lv_expressions_4_0= ruleDependency ) )+ otherlv_5= '}' )? )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:269:3: otherlv_0= 'Next part:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'Part dependencies' otherlv_3= '{' ( (lv_expressions_4_0= ruleDependency ) )+ otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleDMNextParts551); 

                	newLeafNode(otherlv_0, grammarAccess.getDMNextPartsAccess().getNextPartKeyword_0());
                
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:273:1: ( (otherlv_1= RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:274:1: (otherlv_1= RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:274:1: (otherlv_1= RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:275:3: otherlv_1= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDMNextPartsRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDMNextParts571); 

            		newLeafNode(otherlv_1, grammarAccess.getDMNextPartsAccess().getNamePartCrossReference_1_0()); 
            	

            }


            }

            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:286:2: (otherlv_2= 'Part dependencies' otherlv_3= '{' ( (lv_expressions_4_0= ruleDependency ) )+ otherlv_5= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:286:4: otherlv_2= 'Part dependencies' otherlv_3= '{' ( (lv_expressions_4_0= ruleDependency ) )+ otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleDMNextParts584); 

                        	newLeafNode(otherlv_2, grammarAccess.getDMNextPartsAccess().getPartDependenciesKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleDMNextParts596); 

                        	newLeafNode(otherlv_3, grammarAccess.getDMNextPartsAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:294:1: ( (lv_expressions_4_0= ruleDependency ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==20||LA5_0==22||LA5_0==24) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:295:1: (lv_expressions_4_0= ruleDependency )
                    	    {
                    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:295:1: (lv_expressions_4_0= ruleDependency )
                    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:296:3: lv_expressions_4_0= ruleDependency
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDMNextPartsAccess().getExpressionsDependencyParserRuleCall_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDependency_in_ruleDMNextParts617);
                    	    lv_expressions_4_0=ruleDependency();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDMNextPartsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"expressions",
                    	            		lv_expressions_4_0, 
                    	            		"Dependency");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleDMNextParts630); 

                        	newLeafNode(otherlv_5, grammarAccess.getDMNextPartsAccess().getRightCurlyBracketKeyword_2_3());
                        

                    }
                    break;

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
    // $ANTLR end "ruleDMNextParts"


    // $ANTLR start "entryRuleDependency"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:324:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:325:2: (iv_ruleDependency= ruleDependency EOF )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:326:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency668);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency678); 

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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:333:1: ruleDependency returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:336:28: (this_Or_0= ruleOr )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:338:5: this_Or_0= ruleOr
            {
             
                    newCompositeNode(grammarAccess.getDependencyAccess().getOrParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOr_in_ruleDependency724);
            this_Or_0=ruleOr();

            state._fsp--;

             
                    current = this_Or_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleOr"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:354:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:355:2: (iv_ruleOr= ruleOr EOF )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:356:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr758);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr768); 

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:363:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:366:28: ( (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:367:1: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:367:1: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:368:5: this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAnd_in_ruleOr815);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:376:1: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:376:2: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:376:2: ()
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:377:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleOr836); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_1_1());
            	        
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:386:1: ( (lv_right_3_0= ruleAnd ) )
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:387:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:387:1: (lv_right_3_0= ruleAnd )
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:388:3: lv_right_3_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr857);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"And");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:412:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:413:2: (iv_ruleAnd= ruleAnd EOF )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:414:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd895);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd905); 

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:421:1: ruleAnd returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:424:28: ( (this_Primary_0= rulePrimary ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:425:1: (this_Primary_0= rulePrimary ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:425:1: (this_Primary_0= rulePrimary ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:426:5: this_Primary_0= rulePrimary ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleAnd952);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:434:1: ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimary ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:434:2: () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:434:2: ()
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:435:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleAnd973); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_1_1());
            	        
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:444:1: ( (lv_right_3_0= rulePrimary ) )
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:445:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:445:1: (lv_right_3_0= rulePrimary )
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:446:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleAnd994);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Primary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRulePrimary"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:470:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:471:2: (iv_rulePrimary= rulePrimary EOF )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:472:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary1032);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary1042); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:479:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Dependency_1= ruleDependency otherlv_2= ')' ) | this_Atomic_3= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Dependency_1 = null;

        EObject this_Atomic_3 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:482:28: ( ( (otherlv_0= '(' this_Dependency_1= ruleDependency otherlv_2= ')' ) | this_Atomic_3= ruleAtomic ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:483:1: ( (otherlv_0= '(' this_Dependency_1= ruleDependency otherlv_2= ')' ) | this_Atomic_3= ruleAtomic )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:483:1: ( (otherlv_0= '(' this_Dependency_1= ruleDependency otherlv_2= ')' ) | this_Atomic_3= ruleAtomic )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==22||LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:483:2: (otherlv_0= '(' this_Dependency_1= ruleDependency otherlv_2= ')' )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:483:2: (otherlv_0= '(' this_Dependency_1= ruleDependency otherlv_2= ')' )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:483:4: otherlv_0= '(' this_Dependency_1= ruleDependency otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_20_in_rulePrimary1080); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getDependencyParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleDependency_in_rulePrimary1102);
                    this_Dependency_1=ruleDependency();

                    state._fsp--;

                     
                            current = this_Dependency_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_rulePrimary1113); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:502:5: this_Atomic_3= ruleAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrimary1142);
                    this_Atomic_3=ruleAtomic();

                    state._fsp--;

                     
                            current = this_Atomic_3; 
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:518:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:519:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:520:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic1177);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic1187); 

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:527:1: ruleAtomic returns [EObject current=null] : ( ( () otherlv_1= 'Question:' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'Answer:' ( (otherlv_4= RULE_STRING ) ) ) | ( () otherlv_6= 'Matrix:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= '{' ( (lv_dmMatrixQuestion_9_0= ruleDMMatrixQuestion ) ) (otherlv_10= '|' ( (lv_dmMatrixQuestion_11_0= ruleDMMatrixQuestion ) ) )* otherlv_12= '}' ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_dmMatrixQuestion_9_0 = null;

        EObject lv_dmMatrixQuestion_11_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:530:28: ( ( ( () otherlv_1= 'Question:' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'Answer:' ( (otherlv_4= RULE_STRING ) ) ) | ( () otherlv_6= 'Matrix:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= '{' ( (lv_dmMatrixQuestion_9_0= ruleDMMatrixQuestion ) ) (otherlv_10= '|' ( (lv_dmMatrixQuestion_11_0= ruleDMMatrixQuestion ) ) )* otherlv_12= '}' ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:531:1: ( ( () otherlv_1= 'Question:' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'Answer:' ( (otherlv_4= RULE_STRING ) ) ) | ( () otherlv_6= 'Matrix:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= '{' ( (lv_dmMatrixQuestion_9_0= ruleDMMatrixQuestion ) ) (otherlv_10= '|' ( (lv_dmMatrixQuestion_11_0= ruleDMMatrixQuestion ) ) )* otherlv_12= '}' ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:531:1: ( ( () otherlv_1= 'Question:' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'Answer:' ( (otherlv_4= RULE_STRING ) ) ) | ( () otherlv_6= 'Matrix:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= '{' ( (lv_dmMatrixQuestion_9_0= ruleDMMatrixQuestion ) ) (otherlv_10= '|' ( (lv_dmMatrixQuestion_11_0= ruleDMMatrixQuestion ) ) )* otherlv_12= '}' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==24) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:531:2: ( () otherlv_1= 'Question:' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'Answer:' ( (otherlv_4= RULE_STRING ) ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:531:2: ( () otherlv_1= 'Question:' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'Answer:' ( (otherlv_4= RULE_STRING ) ) )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:531:3: () otherlv_1= 'Question:' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'Answer:' ( (otherlv_4= RULE_STRING ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:531:3: ()
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:532:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getDMQuestionAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAtomic1234); 

                        	newLeafNode(otherlv_1, grammarAccess.getAtomicAccess().getQuestionKeyword_0_1());
                        
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:541:1: ( (otherlv_2= RULE_STRING ) )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:542:1: (otherlv_2= RULE_STRING )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:542:1: (otherlv_2= RULE_STRING )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:543:3: otherlv_2= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomic1254); 

                    		newLeafNode(otherlv_2, grammarAccess.getAtomicAccess().getQuestionQuestionCrossReference_0_2_0()); 
                    	

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleAtomic1266); 

                        	newLeafNode(otherlv_3, grammarAccess.getAtomicAccess().getAnswerKeyword_0_3());
                        
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:558:1: ( (otherlv_4= RULE_STRING ) )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:559:1: (otherlv_4= RULE_STRING )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:559:1: (otherlv_4= RULE_STRING )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:560:3: otherlv_4= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomic1286); 

                    		newLeafNode(otherlv_4, grammarAccess.getAtomicAccess().getAnswerAnswerCrossReference_0_4_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:572:6: ( () otherlv_6= 'Matrix:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= '{' ( (lv_dmMatrixQuestion_9_0= ruleDMMatrixQuestion ) ) (otherlv_10= '|' ( (lv_dmMatrixQuestion_11_0= ruleDMMatrixQuestion ) ) )* otherlv_12= '}' )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:572:6: ( () otherlv_6= 'Matrix:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= '{' ( (lv_dmMatrixQuestion_9_0= ruleDMMatrixQuestion ) ) (otherlv_10= '|' ( (lv_dmMatrixQuestion_11_0= ruleDMMatrixQuestion ) ) )* otherlv_12= '}' )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:572:7: () otherlv_6= 'Matrix:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= '{' ( (lv_dmMatrixQuestion_9_0= ruleDMMatrixQuestion ) ) (otherlv_10= '|' ( (lv_dmMatrixQuestion_11_0= ruleDMMatrixQuestion ) ) )* otherlv_12= '}'
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:572:7: ()
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:573:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getDMMatrixAction_1_0(),
                                current);
                        

                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleAtomic1315); 

                        	newLeafNode(otherlv_6, grammarAccess.getAtomicAccess().getMatrixKeyword_1_1());
                        
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:582:1: ( (otherlv_7= RULE_STRING ) )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:583:1: (otherlv_7= RULE_STRING )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:583:1: (otherlv_7= RULE_STRING )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:584:3: otherlv_7= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomic1335); 

                    		newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getMatrixQuestionCrossReference_1_2_0()); 
                    	

                    }


                    }

                    otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleAtomic1347); 

                        	newLeafNode(otherlv_8, grammarAccess.getAtomicAccess().getLeftCurlyBracketKeyword_1_3());
                        
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:599:1: ( (lv_dmMatrixQuestion_9_0= ruleDMMatrixQuestion ) )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:600:1: (lv_dmMatrixQuestion_9_0= ruleDMMatrixQuestion )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:600:1: (lv_dmMatrixQuestion_9_0= ruleDMMatrixQuestion )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:601:3: lv_dmMatrixQuestion_9_0= ruleDMMatrixQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomicAccess().getDmMatrixQuestionDMMatrixQuestionParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDMMatrixQuestion_in_ruleAtomic1368);
                    lv_dmMatrixQuestion_9_0=ruleDMMatrixQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtomicRule());
                    	        }
                           		add(
                           			current, 
                           			"dmMatrixQuestion",
                            		lv_dmMatrixQuestion_9_0, 
                            		"DMMatrixQuestion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:617:2: (otherlv_10= '|' ( (lv_dmMatrixQuestion_11_0= ruleDMMatrixQuestion ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==25) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:617:4: otherlv_10= '|' ( (lv_dmMatrixQuestion_11_0= ruleDMMatrixQuestion ) )
                    	    {
                    	    otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleAtomic1381); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getAtomicAccess().getVerticalLineKeyword_1_5_0());
                    	        
                    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:621:1: ( (lv_dmMatrixQuestion_11_0= ruleDMMatrixQuestion ) )
                    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:622:1: (lv_dmMatrixQuestion_11_0= ruleDMMatrixQuestion )
                    	    {
                    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:622:1: (lv_dmMatrixQuestion_11_0= ruleDMMatrixQuestion )
                    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:623:3: lv_dmMatrixQuestion_11_0= ruleDMMatrixQuestion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAtomicAccess().getDmMatrixQuestionDMMatrixQuestionParserRuleCall_1_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDMMatrixQuestion_in_ruleAtomic1402);
                    	    lv_dmMatrixQuestion_11_0=ruleDMMatrixQuestion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAtomicRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"dmMatrixQuestion",
                    	            		lv_dmMatrixQuestion_11_0, 
                    	            		"DMMatrixQuestion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleAtomic1416); 

                        	newLeafNode(otherlv_12, grammarAccess.getAtomicAccess().getRightCurlyBracketKeyword_1_6());
                        

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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleDMMatrixQuestion"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:651:1: entryRuleDMMatrixQuestion returns [EObject current=null] : iv_ruleDMMatrixQuestion= ruleDMMatrixQuestion EOF ;
    public final EObject entryRuleDMMatrixQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMMatrixQuestion = null;


        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:652:2: (iv_ruleDMMatrixQuestion= ruleDMMatrixQuestion EOF )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:653:2: iv_ruleDMMatrixQuestion= ruleDMMatrixQuestion EOF
            {
             newCompositeNode(grammarAccess.getDMMatrixQuestionRule()); 
            pushFollow(FOLLOW_ruleDMMatrixQuestion_in_entryRuleDMMatrixQuestion1453);
            iv_ruleDMMatrixQuestion=ruleDMMatrixQuestion();

            state._fsp--;

             current =iv_ruleDMMatrixQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDMMatrixQuestion1463); 

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
    // $ANTLR end "entryRuleDMMatrixQuestion"


    // $ANTLR start "ruleDMMatrixQuestion"
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:660:1: ruleDMMatrixQuestion returns [EObject current=null] : (otherlv_0= 'Matrix Question:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'Matrix Scale:' ( (otherlv_3= RULE_STRING ) ) ) ;
    public final EObject ruleDMMatrixQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:663:28: ( (otherlv_0= 'Matrix Question:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'Matrix Scale:' ( (otherlv_3= RULE_STRING ) ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:664:1: (otherlv_0= 'Matrix Question:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'Matrix Scale:' ( (otherlv_3= RULE_STRING ) ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:664:1: (otherlv_0= 'Matrix Question:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'Matrix Scale:' ( (otherlv_3= RULE_STRING ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:664:3: otherlv_0= 'Matrix Question:' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'Matrix Scale:' ( (otherlv_3= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleDMMatrixQuestion1500); 

                	newLeafNode(otherlv_0, grammarAccess.getDMMatrixQuestionAccess().getMatrixQuestionKeyword_0());
                
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:668:1: ( (otherlv_1= RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:669:1: (otherlv_1= RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:669:1: (otherlv_1= RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:670:3: otherlv_1= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDMMatrixQuestionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDMMatrixQuestion1520); 

            		newLeafNode(otherlv_1, grammarAccess.getDMMatrixQuestionAccess().getMatrixQuestionMatrixQuestionCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleDMMatrixQuestion1532); 

                	newLeafNode(otherlv_2, grammarAccess.getDMMatrixQuestionAccess().getMatrixScaleKeyword_2());
                
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:685:1: ( (otherlv_3= RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:686:1: (otherlv_3= RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:686:1: (otherlv_3= RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:687:3: otherlv_3= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDMMatrixQuestionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDMMatrixQuestion1552); 

            		newLeafNode(otherlv_3, grammarAccess.getDMMatrixQuestionAccess().getMatrixScaleAnswerCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleDMMatrixQuestion"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDependencyModel_in_entryRuleDependencyModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencyModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSurveyElements_in_ruleDependencyModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleSurveyElements_in_entryRuleSurveyElements166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurveyElements176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSurveyElements213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSurveyElements233 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSurveyElements245 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rulePartElements_in_ruleSurveyElements266 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleSurveyElements279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartElements_in_entryRulePartElements315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartElements325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePartElements362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePartElements382 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePartElements395 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleDMNextParts_in_rulePartElements417 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_rulePartElements430 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleDMNextParts_in_rulePartElements451 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_rulePartElements466 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleDMNextParts_in_entryRuleDMNextParts504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDMNextParts514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDMNextParts551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDMNextParts571 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleDMNextParts584 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDMNextParts596 = new BitSet(new long[]{0x0000000001500000L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleDMNextParts617 = new BitSet(new long[]{0x0000000001502000L});
    public static final BitSet FOLLOW_13_in_ruleDMNextParts630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleDependency724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr815 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleOr836 = new BitSet(new long[]{0x0000000001500000L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr857 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleAnd952 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleAnd973 = new BitSet(new long[]{0x0000000001500000L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleAnd994 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary1032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePrimary1080 = new BitSet(new long[]{0x0000000001500000L});
    public static final BitSet FOLLOW_ruleDependency_in_rulePrimary1102 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrimary1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrimary1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic1177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAtomic1234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomic1254 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAtomic1266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomic1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAtomic1315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomic1335 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAtomic1347 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleDMMatrixQuestion_in_ruleAtomic1368 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_25_in_ruleAtomic1381 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleDMMatrixQuestion_in_ruleAtomic1402 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_13_in_ruleAtomic1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDMMatrixQuestion_in_entryRuleDMMatrixQuestion1453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDMMatrixQuestion1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDMMatrixQuestion1500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDMMatrixQuestion1520 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDMMatrixQuestion1532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDMMatrixQuestion1552 = new BitSet(new long[]{0x0000000000000002L});

}