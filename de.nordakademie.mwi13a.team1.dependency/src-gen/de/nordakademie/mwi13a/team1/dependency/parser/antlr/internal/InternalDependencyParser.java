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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Survey:'", "'{'", "'}'", "'Part:'", "'Next parts {'", "'Next part:'", "'Part dependencies'", "'OR'", "'AND'", "'('", "')'", "'Question:'", "'Answer:'", "'Matrix Question:'"
    };
    public static final int RULE_ID=5;
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
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:179:1: rulePartElements returns [EObject current=null] : (otherlv_0= 'Part:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'Next parts {' ( (lv_nextParts_3_0= ruleDMNextParts ) )+ otherlv_4= '}' )+ ) ;
    public final EObject rulePartElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_nextParts_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:182:28: ( (otherlv_0= 'Part:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'Next parts {' ( (lv_nextParts_3_0= ruleDMNextParts ) )+ otherlv_4= '}' )+ ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:183:1: (otherlv_0= 'Part:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'Next parts {' ( (lv_nextParts_3_0= ruleDMNextParts ) )+ otherlv_4= '}' )+ )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:183:1: (otherlv_0= 'Part:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'Next parts {' ( (lv_nextParts_3_0= ruleDMNextParts ) )+ otherlv_4= '}' )+ )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:183:3: otherlv_0= 'Part:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'Next parts {' ( (lv_nextParts_3_0= ruleDMNextParts ) )+ otherlv_4= '}' )+
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

            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:200:2: (otherlv_2= 'Next parts {' ( (lv_nextParts_3_0= ruleDMNextParts ) )+ otherlv_4= '}' )+
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
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:200:4: otherlv_2= 'Next parts {' ( (lv_nextParts_3_0= ruleDMNextParts ) )+ otherlv_4= '}'
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePartElements395); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPartElementsAccess().getNextPartsKeyword_2_0());
            	        
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:204:1: ( (lv_nextParts_3_0= ruleDMNextParts ) )+
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
            	    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:205:1: (lv_nextParts_3_0= ruleDMNextParts )
            	    	    {
            	    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:205:1: (lv_nextParts_3_0= ruleDMNextParts )
            	    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:206:3: lv_nextParts_3_0= ruleDMNextParts
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getPartElementsAccess().getNextPartsDMNextPartsParserRuleCall_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDMNextParts_in_rulePartElements416);
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
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);

            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_rulePartElements429); 

            	        	newLeafNode(otherlv_4, grammarAccess.getPartElementsAccess().getRightCurlyBracketKeyword_2_2());
            	        

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
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:234:1: entryRuleDMNextParts returns [EObject current=null] : iv_ruleDMNextParts= ruleDMNextParts EOF ;
    public final EObject entryRuleDMNextParts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMNextParts = null;


        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:235:2: (iv_ruleDMNextParts= ruleDMNextParts EOF )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:236:2: iv_ruleDMNextParts= ruleDMNextParts EOF
            {
             newCompositeNode(grammarAccess.getDMNextPartsRule()); 
            pushFollow(FOLLOW_ruleDMNextParts_in_entryRuleDMNextParts467);
            iv_ruleDMNextParts=ruleDMNextParts();

            state._fsp--;

             current =iv_ruleDMNextParts; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDMNextParts477); 

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
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:243:1: ruleDMNextParts returns [EObject current=null] : (otherlv_0= 'Next part:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'Part dependencies' otherlv_3= '{' ( (lv_expressions_4_0= ruleDependency ) )+ otherlv_5= '}' )? ) ;
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
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:246:28: ( (otherlv_0= 'Next part:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'Part dependencies' otherlv_3= '{' ( (lv_expressions_4_0= ruleDependency ) )+ otherlv_5= '}' )? ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:247:1: (otherlv_0= 'Next part:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'Part dependencies' otherlv_3= '{' ( (lv_expressions_4_0= ruleDependency ) )+ otherlv_5= '}' )? )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:247:1: (otherlv_0= 'Next part:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'Part dependencies' otherlv_3= '{' ( (lv_expressions_4_0= ruleDependency ) )+ otherlv_5= '}' )? )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:247:3: otherlv_0= 'Next part:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'Part dependencies' otherlv_3= '{' ( (lv_expressions_4_0= ruleDependency ) )+ otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleDMNextParts514); 

                	newLeafNode(otherlv_0, grammarAccess.getDMNextPartsAccess().getNextPartKeyword_0());
                
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:251:1: ( (otherlv_1= RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:252:1: (otherlv_1= RULE_STRING )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:252:1: (otherlv_1= RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:253:3: otherlv_1= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDMNextPartsRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDMNextParts534); 

            		newLeafNode(otherlv_1, grammarAccess.getDMNextPartsAccess().getNamePartCrossReference_1_0()); 
            	

            }


            }

            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:264:2: (otherlv_2= 'Part dependencies' otherlv_3= '{' ( (lv_expressions_4_0= ruleDependency ) )+ otherlv_5= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:264:4: otherlv_2= 'Part dependencies' otherlv_3= '{' ( (lv_expressions_4_0= ruleDependency ) )+ otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleDMNextParts547); 

                        	newLeafNode(otherlv_2, grammarAccess.getDMNextPartsAccess().getPartDependenciesKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleDMNextParts559); 

                        	newLeafNode(otherlv_3, grammarAccess.getDMNextPartsAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:272:1: ( (lv_expressions_4_0= ruleDependency ) )+
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
                    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:273:1: (lv_expressions_4_0= ruleDependency )
                    	    {
                    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:273:1: (lv_expressions_4_0= ruleDependency )
                    	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:274:3: lv_expressions_4_0= ruleDependency
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDMNextPartsAccess().getExpressionsDependencyParserRuleCall_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDependency_in_ruleDMNextParts580);
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

                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleDMNextParts593); 

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
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:302:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:303:2: (iv_ruleDependency= ruleDependency EOF )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:304:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency631);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency641); 

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
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:311:1: ruleDependency returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:314:28: (this_Or_0= ruleOr )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:316:5: this_Or_0= ruleOr
            {
             
                    newCompositeNode(grammarAccess.getDependencyAccess().getOrParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOr_in_ruleDependency687);
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
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:332:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:333:2: (iv_ruleOr= ruleOr EOF )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:334:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr721);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr731); 

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
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:341:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:344:28: ( (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:345:1: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:345:1: (this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:346:5: this_And_0= ruleAnd ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAnd_in_ruleOr778);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:354:1: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:354:2: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:354:2: ()
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:355:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleOr799); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_1_1());
            	        
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:364:1: ( (lv_right_3_0= ruleAnd ) )
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:365:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:365:1: (lv_right_3_0= ruleAnd )
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:366:3: lv_right_3_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr820);
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
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:390:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:391:2: (iv_ruleAnd= ruleAnd EOF )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:392:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd858);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd868); 

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
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:399:1: ruleAnd returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:402:28: ( (this_Primary_0= rulePrimary ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:403:1: (this_Primary_0= rulePrimary ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:403:1: (this_Primary_0= rulePrimary ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:404:5: this_Primary_0= rulePrimary ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleAnd915);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:412:1: ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimary ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:412:2: () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:412:2: ()
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:413:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleAnd936); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_1_1());
            	        
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:422:1: ( (lv_right_3_0= rulePrimary ) )
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:423:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:423:1: (lv_right_3_0= rulePrimary )
            	    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:424:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleAnd957);
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
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:448:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:449:2: (iv_rulePrimary= rulePrimary EOF )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:450:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary995);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary1005); 

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
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:457:1: rulePrimary returns [EObject current=null] : ( ( () otherlv_1= '(' ( (lv_dependency_2_0= ruleOr ) ) otherlv_3= ')' ) | this_Atomic_4= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_dependency_2_0 = null;

        EObject this_Atomic_4 = null;


         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:460:28: ( ( ( () otherlv_1= '(' ( (lv_dependency_2_0= ruleOr ) ) otherlv_3= ')' ) | this_Atomic_4= ruleAtomic ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:461:1: ( ( () otherlv_1= '(' ( (lv_dependency_2_0= ruleOr ) ) otherlv_3= ')' ) | this_Atomic_4= ruleAtomic )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:461:1: ( ( () otherlv_1= '(' ( (lv_dependency_2_0= ruleOr ) ) otherlv_3= ')' ) | this_Atomic_4= ruleAtomic )
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
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:461:2: ( () otherlv_1= '(' ( (lv_dependency_2_0= ruleOr ) ) otherlv_3= ')' )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:461:2: ( () otherlv_1= '(' ( (lv_dependency_2_0= ruleOr ) ) otherlv_3= ')' )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:461:3: () otherlv_1= '(' ( (lv_dependency_2_0= ruleOr ) ) otherlv_3= ')'
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:461:3: ()
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:462:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryAccess().getBracketAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_rulePrimary1052); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_1());
                        
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:471:1: ( (lv_dependency_2_0= ruleOr ) )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:472:1: (lv_dependency_2_0= ruleOr )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:472:1: (lv_dependency_2_0= ruleOr )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:473:3: lv_dependency_2_0= ruleOr
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryAccess().getDependencyOrParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOr_in_rulePrimary1073);
                    lv_dependency_2_0=ruleOr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    	        }
                           		set(
                           			current, 
                           			"dependency",
                            		lv_dependency_2_0, 
                            		"Or");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_rulePrimary1085); 

                        	newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:495:5: this_Atomic_4= ruleAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrimary1114);
                    this_Atomic_4=ruleAtomic();

                    state._fsp--;

                     
                            current = this_Atomic_4; 
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
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:511:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:512:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:513:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic1149);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic1159); 

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
    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:520:1: ruleAtomic returns [EObject current=null] : ( ( () otherlv_1= 'Question:' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'Answer:' ( (otherlv_4= RULE_STRING ) ) ) | ( () otherlv_6= 'Matrix Question:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'Answer:' ( (otherlv_9= RULE_STRING ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:523:28: ( ( ( () otherlv_1= 'Question:' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'Answer:' ( (otherlv_4= RULE_STRING ) ) ) | ( () otherlv_6= 'Matrix Question:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'Answer:' ( (otherlv_9= RULE_STRING ) ) ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:524:1: ( ( () otherlv_1= 'Question:' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'Answer:' ( (otherlv_4= RULE_STRING ) ) ) | ( () otherlv_6= 'Matrix Question:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'Answer:' ( (otherlv_9= RULE_STRING ) ) ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:524:1: ( ( () otherlv_1= 'Question:' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'Answer:' ( (otherlv_4= RULE_STRING ) ) ) | ( () otherlv_6= 'Matrix Question:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'Answer:' ( (otherlv_9= RULE_STRING ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:524:2: ( () otherlv_1= 'Question:' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'Answer:' ( (otherlv_4= RULE_STRING ) ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:524:2: ( () otherlv_1= 'Question:' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'Answer:' ( (otherlv_4= RULE_STRING ) ) )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:524:3: () otherlv_1= 'Question:' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'Answer:' ( (otherlv_4= RULE_STRING ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:524:3: ()
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:525:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getDMQuestionAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAtomic1206); 

                        	newLeafNode(otherlv_1, grammarAccess.getAtomicAccess().getQuestionKeyword_0_1());
                        
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:534:1: ( (otherlv_2= RULE_STRING ) )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:535:1: (otherlv_2= RULE_STRING )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:535:1: (otherlv_2= RULE_STRING )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:536:3: otherlv_2= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomic1226); 

                    		newLeafNode(otherlv_2, grammarAccess.getAtomicAccess().getQuestionQuestionCrossReference_0_2_0()); 
                    	

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleAtomic1238); 

                        	newLeafNode(otherlv_3, grammarAccess.getAtomicAccess().getAnswerKeyword_0_3());
                        
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:551:1: ( (otherlv_4= RULE_STRING ) )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:552:1: (otherlv_4= RULE_STRING )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:552:1: (otherlv_4= RULE_STRING )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:553:3: otherlv_4= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomic1258); 

                    		newLeafNode(otherlv_4, grammarAccess.getAtomicAccess().getAnswerAnswerCrossReference_0_4_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:565:6: ( () otherlv_6= 'Matrix Question:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'Answer:' ( (otherlv_9= RULE_STRING ) ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:565:6: ( () otherlv_6= 'Matrix Question:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'Answer:' ( (otherlv_9= RULE_STRING ) ) )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:565:7: () otherlv_6= 'Matrix Question:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'Answer:' ( (otherlv_9= RULE_STRING ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:565:7: ()
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:566:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getDMMatrixQuestionAction_1_0(),
                                current);
                        

                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleAtomic1287); 

                        	newLeafNode(otherlv_6, grammarAccess.getAtomicAccess().getMatrixQuestionKeyword_1_1());
                        
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:575:1: ( (otherlv_7= RULE_STRING ) )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:576:1: (otherlv_7= RULE_STRING )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:576:1: (otherlv_7= RULE_STRING )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:577:3: otherlv_7= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomic1307); 

                    		newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getQuestionMatrixQuestionCrossReference_1_2_0()); 
                    	

                    }


                    }

                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleAtomic1319); 

                        	newLeafNode(otherlv_8, grammarAccess.getAtomicAccess().getAnswerKeyword_1_3());
                        
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:592:1: ( (otherlv_9= RULE_STRING ) )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:593:1: (otherlv_9= RULE_STRING )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:593:1: (otherlv_9= RULE_STRING )
                    // ../de.nordakademie.mwi13a.team1.dependency/src-gen/de/nordakademie/mwi13a/team1/dependency/parser/antlr/internal/InternalDependency.g:594:3: otherlv_9= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomic1339); 

                    		newLeafNode(otherlv_9, grammarAccess.getAtomicAccess().getAnswerAnswerCrossReference_1_4_0()); 
                    	

                    }


                    }


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
    public static final BitSet FOLLOW_15_in_rulePartElements395 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleDMNextParts_in_rulePartElements416 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_rulePartElements429 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleDMNextParts_in_entryRuleDMNextParts467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDMNextParts477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDMNextParts514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDMNextParts534 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleDMNextParts547 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDMNextParts559 = new BitSet(new long[]{0x0000000001500000L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleDMNextParts580 = new BitSet(new long[]{0x0000000001502000L});
    public static final BitSet FOLLOW_13_in_ruleDMNextParts593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleDependency687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr778 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleOr799 = new BitSet(new long[]{0x0000000001500000L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr820 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleAnd915 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleAnd936 = new BitSet(new long[]{0x0000000001500000L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleAnd957 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePrimary1052 = new BitSet(new long[]{0x0000000001500000L});
    public static final BitSet FOLLOW_ruleOr_in_rulePrimary1073 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrimary1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrimary1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAtomic1206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomic1226 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAtomic1238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomic1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAtomic1287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomic1307 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAtomic1319 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomic1339 = new BitSet(new long[]{0x0000000000000002L});

}