package de.nordakademie.mwi13a.team1.dependency.ui.contentassist.antlr.internal; 

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
import de.nordakademie.mwi13a.team1.dependency.services.DependencyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDependencyParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Survey:'", "'{'", "'}'", "'Part:'", "'Next parts {'", "'OR'", "'Next part:'", "'Part dependencies'", "'AND'", "'('", "')'", "'Question:'", "'Answer:'"
    };
    public static final int RULE_ID=5;
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
    public String getGrammarFileName() { return "../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g"; }


     
     	private DependencyGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DependencyGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDependencyModel"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:60:1: entryRuleDependencyModel : ruleDependencyModel EOF ;
    public final void entryRuleDependencyModel() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:61:1: ( ruleDependencyModel EOF )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:62:1: ruleDependencyModel EOF
            {
             before(grammarAccess.getDependencyModelRule()); 
            pushFollow(FOLLOW_ruleDependencyModel_in_entryRuleDependencyModel61);
            ruleDependencyModel();

            state._fsp--;

             after(grammarAccess.getDependencyModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencyModel68); 

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
    // $ANTLR end "entryRuleDependencyModel"


    // $ANTLR start "ruleDependencyModel"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:69:1: ruleDependencyModel : ( ( ( rule__DependencyModel__ElementsAssignment ) ) ( ( rule__DependencyModel__ElementsAssignment )* ) ) ;
    public final void ruleDependencyModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:73:2: ( ( ( ( rule__DependencyModel__ElementsAssignment ) ) ( ( rule__DependencyModel__ElementsAssignment )* ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:74:1: ( ( ( rule__DependencyModel__ElementsAssignment ) ) ( ( rule__DependencyModel__ElementsAssignment )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:74:1: ( ( ( rule__DependencyModel__ElementsAssignment ) ) ( ( rule__DependencyModel__ElementsAssignment )* ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:75:1: ( ( rule__DependencyModel__ElementsAssignment ) ) ( ( rule__DependencyModel__ElementsAssignment )* )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:75:1: ( ( rule__DependencyModel__ElementsAssignment ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:76:1: ( rule__DependencyModel__ElementsAssignment )
            {
             before(grammarAccess.getDependencyModelAccess().getElementsAssignment()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:77:1: ( rule__DependencyModel__ElementsAssignment )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:77:2: rule__DependencyModel__ElementsAssignment
            {
            pushFollow(FOLLOW_rule__DependencyModel__ElementsAssignment_in_ruleDependencyModel96);
            rule__DependencyModel__ElementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDependencyModelAccess().getElementsAssignment()); 

            }

            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:80:1: ( ( rule__DependencyModel__ElementsAssignment )* )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:81:1: ( rule__DependencyModel__ElementsAssignment )*
            {
             before(grammarAccess.getDependencyModelAccess().getElementsAssignment()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:82:1: ( rule__DependencyModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:82:2: rule__DependencyModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__DependencyModel__ElementsAssignment_in_ruleDependencyModel108);
            	    rule__DependencyModel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDependencyModelAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleDependencyModel"


    // $ANTLR start "entryRuleSurveyElements"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:95:1: entryRuleSurveyElements : ruleSurveyElements EOF ;
    public final void entryRuleSurveyElements() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:96:1: ( ruleSurveyElements EOF )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:97:1: ruleSurveyElements EOF
            {
             before(grammarAccess.getSurveyElementsRule()); 
            pushFollow(FOLLOW_ruleSurveyElements_in_entryRuleSurveyElements138);
            ruleSurveyElements();

            state._fsp--;

             after(grammarAccess.getSurveyElementsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSurveyElements145); 

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
    // $ANTLR end "entryRuleSurveyElements"


    // $ANTLR start "ruleSurveyElements"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:104:1: ruleSurveyElements : ( ( rule__SurveyElements__Group__0 ) ) ;
    public final void ruleSurveyElements() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:108:2: ( ( ( rule__SurveyElements__Group__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:109:1: ( ( rule__SurveyElements__Group__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:109:1: ( ( rule__SurveyElements__Group__0 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:110:1: ( rule__SurveyElements__Group__0 )
            {
             before(grammarAccess.getSurveyElementsAccess().getGroup()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:111:1: ( rule__SurveyElements__Group__0 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:111:2: rule__SurveyElements__Group__0
            {
            pushFollow(FOLLOW_rule__SurveyElements__Group__0_in_ruleSurveyElements171);
            rule__SurveyElements__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSurveyElementsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSurveyElements"


    // $ANTLR start "entryRulePartElements"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:123:1: entryRulePartElements : rulePartElements EOF ;
    public final void entryRulePartElements() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:124:1: ( rulePartElements EOF )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:125:1: rulePartElements EOF
            {
             before(grammarAccess.getPartElementsRule()); 
            pushFollow(FOLLOW_rulePartElements_in_entryRulePartElements198);
            rulePartElements();

            state._fsp--;

             after(grammarAccess.getPartElementsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePartElements205); 

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
    // $ANTLR end "entryRulePartElements"


    // $ANTLR start "rulePartElements"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:132:1: rulePartElements : ( ( rule__PartElements__Group__0 ) ) ;
    public final void rulePartElements() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:136:2: ( ( ( rule__PartElements__Group__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:137:1: ( ( rule__PartElements__Group__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:137:1: ( ( rule__PartElements__Group__0 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:138:1: ( rule__PartElements__Group__0 )
            {
             before(grammarAccess.getPartElementsAccess().getGroup()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:139:1: ( rule__PartElements__Group__0 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:139:2: rule__PartElements__Group__0
            {
            pushFollow(FOLLOW_rule__PartElements__Group__0_in_rulePartElements231);
            rule__PartElements__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartElementsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePartElements"


    // $ANTLR start "entryRuleDMNextParts"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:151:1: entryRuleDMNextParts : ruleDMNextParts EOF ;
    public final void entryRuleDMNextParts() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:152:1: ( ruleDMNextParts EOF )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:153:1: ruleDMNextParts EOF
            {
             before(grammarAccess.getDMNextPartsRule()); 
            pushFollow(FOLLOW_ruleDMNextParts_in_entryRuleDMNextParts258);
            ruleDMNextParts();

            state._fsp--;

             after(grammarAccess.getDMNextPartsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDMNextParts265); 

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
    // $ANTLR end "entryRuleDMNextParts"


    // $ANTLR start "ruleDMNextParts"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:160:1: ruleDMNextParts : ( ( rule__DMNextParts__Group__0 ) ) ;
    public final void ruleDMNextParts() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:164:2: ( ( ( rule__DMNextParts__Group__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:165:1: ( ( rule__DMNextParts__Group__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:165:1: ( ( rule__DMNextParts__Group__0 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:166:1: ( rule__DMNextParts__Group__0 )
            {
             before(grammarAccess.getDMNextPartsAccess().getGroup()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:167:1: ( rule__DMNextParts__Group__0 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:167:2: rule__DMNextParts__Group__0
            {
            pushFollow(FOLLOW_rule__DMNextParts__Group__0_in_ruleDMNextParts291);
            rule__DMNextParts__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDMNextPartsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDMNextParts"


    // $ANTLR start "entryRuleDependency"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:179:1: entryRuleDependency : ruleDependency EOF ;
    public final void entryRuleDependency() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:180:1: ( ruleDependency EOF )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:181:1: ruleDependency EOF
            {
             before(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency318);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getDependencyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency325); 

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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:188:1: ruleDependency : ( ruleOr ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:192:2: ( ( ruleOr ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:193:1: ( ruleOr )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:193:1: ( ruleOr )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:194:1: ruleOr
            {
             before(grammarAccess.getDependencyAccess().getOrParserRuleCall()); 
            pushFollow(FOLLOW_ruleOr_in_ruleDependency351);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getDependencyAccess().getOrParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleOr"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:207:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:208:1: ( ruleOr EOF )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:209:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr377);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr384); 

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:216:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:220:2: ( ( ( rule__Or__Group__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:221:1: ( ( rule__Or__Group__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:221:1: ( ( rule__Or__Group__0 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:222:1: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:223:1: ( rule__Or__Group__0 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:223:2: rule__Or__Group__0
            {
            pushFollow(FOLLOW_rule__Or__Group__0_in_ruleOr410);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:235:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:236:1: ( ruleAnd EOF )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:237:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd437);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd444); 

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:244:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:248:2: ( ( ( rule__And__Group__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:249:1: ( ( rule__And__Group__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:249:1: ( ( rule__And__Group__0 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:250:1: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:251:1: ( rule__And__Group__0 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:251:2: rule__And__Group__0
            {
            pushFollow(FOLLOW_rule__And__Group__0_in_ruleAnd470);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRulePrimary"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:263:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:264:1: ( rulePrimary EOF )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:265:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary497);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary504); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:272:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:276:2: ( ( ( rule__Primary__Alternatives ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:277:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:277:1: ( ( rule__Primary__Alternatives ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:278:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:279:1: ( rule__Primary__Alternatives )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:279:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary530);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:291:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:292:1: ( ruleAtomic EOF )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:293:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic557);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic564); 

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:300:1: ruleAtomic : ( ( rule__Atomic__Group__0 ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:304:2: ( ( ( rule__Atomic__Group__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:305:1: ( ( rule__Atomic__Group__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:305:1: ( ( rule__Atomic__Group__0 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:306:1: ( rule__Atomic__Group__0 )
            {
             before(grammarAccess.getAtomicAccess().getGroup()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:307:1: ( rule__Atomic__Group__0 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:307:2: rule__Atomic__Group__0
            {
            pushFollow(FOLLOW_rule__Atomic__Group__0_in_ruleAtomic590);
            rule__Atomic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "rule__Primary__Alternatives"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:319:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:323:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleAtomic ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:324:1: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:324:1: ( ( rule__Primary__Group_0__0 ) )
                    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:325:1: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:326:1: ( rule__Primary__Group_0__0 )
                    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:326:2: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_0__0_in_rule__Primary__Alternatives626);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:330:6: ( ruleAtomic )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:330:6: ( ruleAtomic )
                    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:331:1: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAtomic_in_rule__Primary__Alternatives644);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_1()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__SurveyElements__Group__0"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:343:1: rule__SurveyElements__Group__0 : rule__SurveyElements__Group__0__Impl rule__SurveyElements__Group__1 ;
    public final void rule__SurveyElements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:347:1: ( rule__SurveyElements__Group__0__Impl rule__SurveyElements__Group__1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:348:2: rule__SurveyElements__Group__0__Impl rule__SurveyElements__Group__1
            {
            pushFollow(FOLLOW_rule__SurveyElements__Group__0__Impl_in_rule__SurveyElements__Group__0674);
            rule__SurveyElements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyElements__Group__1_in_rule__SurveyElements__Group__0677);
            rule__SurveyElements__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyElements__Group__0"


    // $ANTLR start "rule__SurveyElements__Group__0__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:355:1: rule__SurveyElements__Group__0__Impl : ( 'Survey:' ) ;
    public final void rule__SurveyElements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:359:1: ( ( 'Survey:' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:360:1: ( 'Survey:' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:360:1: ( 'Survey:' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:361:1: 'Survey:'
            {
             before(grammarAccess.getSurveyElementsAccess().getSurveyKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__SurveyElements__Group__0__Impl705); 
             after(grammarAccess.getSurveyElementsAccess().getSurveyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyElements__Group__0__Impl"


    // $ANTLR start "rule__SurveyElements__Group__1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:374:1: rule__SurveyElements__Group__1 : rule__SurveyElements__Group__1__Impl rule__SurveyElements__Group__2 ;
    public final void rule__SurveyElements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:378:1: ( rule__SurveyElements__Group__1__Impl rule__SurveyElements__Group__2 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:379:2: rule__SurveyElements__Group__1__Impl rule__SurveyElements__Group__2
            {
            pushFollow(FOLLOW_rule__SurveyElements__Group__1__Impl_in_rule__SurveyElements__Group__1736);
            rule__SurveyElements__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyElements__Group__2_in_rule__SurveyElements__Group__1739);
            rule__SurveyElements__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyElements__Group__1"


    // $ANTLR start "rule__SurveyElements__Group__1__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:386:1: rule__SurveyElements__Group__1__Impl : ( ( rule__SurveyElements__NameAssignment_1 ) ) ;
    public final void rule__SurveyElements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:390:1: ( ( ( rule__SurveyElements__NameAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:391:1: ( ( rule__SurveyElements__NameAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:391:1: ( ( rule__SurveyElements__NameAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:392:1: ( rule__SurveyElements__NameAssignment_1 )
            {
             before(grammarAccess.getSurveyElementsAccess().getNameAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:393:1: ( rule__SurveyElements__NameAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:393:2: rule__SurveyElements__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SurveyElements__NameAssignment_1_in_rule__SurveyElements__Group__1__Impl766);
            rule__SurveyElements__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyElementsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyElements__Group__1__Impl"


    // $ANTLR start "rule__SurveyElements__Group__2"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:403:1: rule__SurveyElements__Group__2 : rule__SurveyElements__Group__2__Impl rule__SurveyElements__Group__3 ;
    public final void rule__SurveyElements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:407:1: ( rule__SurveyElements__Group__2__Impl rule__SurveyElements__Group__3 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:408:2: rule__SurveyElements__Group__2__Impl rule__SurveyElements__Group__3
            {
            pushFollow(FOLLOW_rule__SurveyElements__Group__2__Impl_in_rule__SurveyElements__Group__2796);
            rule__SurveyElements__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyElements__Group__3_in_rule__SurveyElements__Group__2799);
            rule__SurveyElements__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyElements__Group__2"


    // $ANTLR start "rule__SurveyElements__Group__2__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:415:1: rule__SurveyElements__Group__2__Impl : ( '{' ) ;
    public final void rule__SurveyElements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:419:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:420:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:420:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:421:1: '{'
            {
             before(grammarAccess.getSurveyElementsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__SurveyElements__Group__2__Impl827); 
             after(grammarAccess.getSurveyElementsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyElements__Group__2__Impl"


    // $ANTLR start "rule__SurveyElements__Group__3"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:434:1: rule__SurveyElements__Group__3 : rule__SurveyElements__Group__3__Impl rule__SurveyElements__Group__4 ;
    public final void rule__SurveyElements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:438:1: ( rule__SurveyElements__Group__3__Impl rule__SurveyElements__Group__4 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:439:2: rule__SurveyElements__Group__3__Impl rule__SurveyElements__Group__4
            {
            pushFollow(FOLLOW_rule__SurveyElements__Group__3__Impl_in_rule__SurveyElements__Group__3858);
            rule__SurveyElements__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyElements__Group__4_in_rule__SurveyElements__Group__3861);
            rule__SurveyElements__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyElements__Group__3"


    // $ANTLR start "rule__SurveyElements__Group__3__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:446:1: rule__SurveyElements__Group__3__Impl : ( ( ( rule__SurveyElements__PartElementsAssignment_3 ) ) ( ( rule__SurveyElements__PartElementsAssignment_3 )* ) ) ;
    public final void rule__SurveyElements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:450:1: ( ( ( ( rule__SurveyElements__PartElementsAssignment_3 ) ) ( ( rule__SurveyElements__PartElementsAssignment_3 )* ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:451:1: ( ( ( rule__SurveyElements__PartElementsAssignment_3 ) ) ( ( rule__SurveyElements__PartElementsAssignment_3 )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:451:1: ( ( ( rule__SurveyElements__PartElementsAssignment_3 ) ) ( ( rule__SurveyElements__PartElementsAssignment_3 )* ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:452:1: ( ( rule__SurveyElements__PartElementsAssignment_3 ) ) ( ( rule__SurveyElements__PartElementsAssignment_3 )* )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:452:1: ( ( rule__SurveyElements__PartElementsAssignment_3 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:453:1: ( rule__SurveyElements__PartElementsAssignment_3 )
            {
             before(grammarAccess.getSurveyElementsAccess().getPartElementsAssignment_3()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:454:1: ( rule__SurveyElements__PartElementsAssignment_3 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:454:2: rule__SurveyElements__PartElementsAssignment_3
            {
            pushFollow(FOLLOW_rule__SurveyElements__PartElementsAssignment_3_in_rule__SurveyElements__Group__3__Impl890);
            rule__SurveyElements__PartElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSurveyElementsAccess().getPartElementsAssignment_3()); 

            }

            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:457:1: ( ( rule__SurveyElements__PartElementsAssignment_3 )* )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:458:1: ( rule__SurveyElements__PartElementsAssignment_3 )*
            {
             before(grammarAccess.getSurveyElementsAccess().getPartElementsAssignment_3()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:459:1: ( rule__SurveyElements__PartElementsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:459:2: rule__SurveyElements__PartElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SurveyElements__PartElementsAssignment_3_in_rule__SurveyElements__Group__3__Impl902);
            	    rule__SurveyElements__PartElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSurveyElementsAccess().getPartElementsAssignment_3()); 

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
    // $ANTLR end "rule__SurveyElements__Group__3__Impl"


    // $ANTLR start "rule__SurveyElements__Group__4"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:470:1: rule__SurveyElements__Group__4 : rule__SurveyElements__Group__4__Impl ;
    public final void rule__SurveyElements__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:474:1: ( rule__SurveyElements__Group__4__Impl )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:475:2: rule__SurveyElements__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SurveyElements__Group__4__Impl_in_rule__SurveyElements__Group__4935);
            rule__SurveyElements__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyElements__Group__4"


    // $ANTLR start "rule__SurveyElements__Group__4__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:481:1: rule__SurveyElements__Group__4__Impl : ( '}' ) ;
    public final void rule__SurveyElements__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:485:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:486:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:486:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:487:1: '}'
            {
             before(grammarAccess.getSurveyElementsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__SurveyElements__Group__4__Impl963); 
             after(grammarAccess.getSurveyElementsAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyElements__Group__4__Impl"


    // $ANTLR start "rule__PartElements__Group__0"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:510:1: rule__PartElements__Group__0 : rule__PartElements__Group__0__Impl rule__PartElements__Group__1 ;
    public final void rule__PartElements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:514:1: ( rule__PartElements__Group__0__Impl rule__PartElements__Group__1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:515:2: rule__PartElements__Group__0__Impl rule__PartElements__Group__1
            {
            pushFollow(FOLLOW_rule__PartElements__Group__0__Impl_in_rule__PartElements__Group__01004);
            rule__PartElements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PartElements__Group__1_in_rule__PartElements__Group__01007);
            rule__PartElements__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__Group__0"


    // $ANTLR start "rule__PartElements__Group__0__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:522:1: rule__PartElements__Group__0__Impl : ( 'Part:' ) ;
    public final void rule__PartElements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:526:1: ( ( 'Part:' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:527:1: ( 'Part:' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:527:1: ( 'Part:' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:528:1: 'Part:'
            {
             before(grammarAccess.getPartElementsAccess().getPartKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__PartElements__Group__0__Impl1035); 
             after(grammarAccess.getPartElementsAccess().getPartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__Group__0__Impl"


    // $ANTLR start "rule__PartElements__Group__1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:541:1: rule__PartElements__Group__1 : rule__PartElements__Group__1__Impl rule__PartElements__Group__2 ;
    public final void rule__PartElements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:545:1: ( rule__PartElements__Group__1__Impl rule__PartElements__Group__2 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:546:2: rule__PartElements__Group__1__Impl rule__PartElements__Group__2
            {
            pushFollow(FOLLOW_rule__PartElements__Group__1__Impl_in_rule__PartElements__Group__11066);
            rule__PartElements__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PartElements__Group__2_in_rule__PartElements__Group__11069);
            rule__PartElements__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__Group__1"


    // $ANTLR start "rule__PartElements__Group__1__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:553:1: rule__PartElements__Group__1__Impl : ( ( rule__PartElements__NameAssignment_1 ) ) ;
    public final void rule__PartElements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:557:1: ( ( ( rule__PartElements__NameAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:558:1: ( ( rule__PartElements__NameAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:558:1: ( ( rule__PartElements__NameAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:559:1: ( rule__PartElements__NameAssignment_1 )
            {
             before(grammarAccess.getPartElementsAccess().getNameAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:560:1: ( rule__PartElements__NameAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:560:2: rule__PartElements__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PartElements__NameAssignment_1_in_rule__PartElements__Group__1__Impl1096);
            rule__PartElements__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPartElementsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__Group__1__Impl"


    // $ANTLR start "rule__PartElements__Group__2"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:570:1: rule__PartElements__Group__2 : rule__PartElements__Group__2__Impl ;
    public final void rule__PartElements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:574:1: ( rule__PartElements__Group__2__Impl )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:575:2: rule__PartElements__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PartElements__Group__2__Impl_in_rule__PartElements__Group__21126);
            rule__PartElements__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__Group__2"


    // $ANTLR start "rule__PartElements__Group__2__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:581:1: rule__PartElements__Group__2__Impl : ( ( ( rule__PartElements__Group_2__0 ) ) ( ( rule__PartElements__Group_2__0 )* ) ) ;
    public final void rule__PartElements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:585:1: ( ( ( ( rule__PartElements__Group_2__0 ) ) ( ( rule__PartElements__Group_2__0 )* ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:586:1: ( ( ( rule__PartElements__Group_2__0 ) ) ( ( rule__PartElements__Group_2__0 )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:586:1: ( ( ( rule__PartElements__Group_2__0 ) ) ( ( rule__PartElements__Group_2__0 )* ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:587:1: ( ( rule__PartElements__Group_2__0 ) ) ( ( rule__PartElements__Group_2__0 )* )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:587:1: ( ( rule__PartElements__Group_2__0 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:588:1: ( rule__PartElements__Group_2__0 )
            {
             before(grammarAccess.getPartElementsAccess().getGroup_2()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:589:1: ( rule__PartElements__Group_2__0 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:589:2: rule__PartElements__Group_2__0
            {
            pushFollow(FOLLOW_rule__PartElements__Group_2__0_in_rule__PartElements__Group__2__Impl1155);
            rule__PartElements__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPartElementsAccess().getGroup_2()); 

            }

            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:592:1: ( ( rule__PartElements__Group_2__0 )* )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:593:1: ( rule__PartElements__Group_2__0 )*
            {
             before(grammarAccess.getPartElementsAccess().getGroup_2()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:594:1: ( rule__PartElements__Group_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:594:2: rule__PartElements__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__PartElements__Group_2__0_in_rule__PartElements__Group__2__Impl1167);
            	    rule__PartElements__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPartElementsAccess().getGroup_2()); 

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
    // $ANTLR end "rule__PartElements__Group__2__Impl"


    // $ANTLR start "rule__PartElements__Group_2__0"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:611:1: rule__PartElements__Group_2__0 : rule__PartElements__Group_2__0__Impl rule__PartElements__Group_2__1 ;
    public final void rule__PartElements__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:615:1: ( rule__PartElements__Group_2__0__Impl rule__PartElements__Group_2__1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:616:2: rule__PartElements__Group_2__0__Impl rule__PartElements__Group_2__1
            {
            pushFollow(FOLLOW_rule__PartElements__Group_2__0__Impl_in_rule__PartElements__Group_2__01206);
            rule__PartElements__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PartElements__Group_2__1_in_rule__PartElements__Group_2__01209);
            rule__PartElements__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__Group_2__0"


    // $ANTLR start "rule__PartElements__Group_2__0__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:623:1: rule__PartElements__Group_2__0__Impl : ( 'Next parts {' ) ;
    public final void rule__PartElements__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:627:1: ( ( 'Next parts {' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:628:1: ( 'Next parts {' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:628:1: ( 'Next parts {' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:629:1: 'Next parts {'
            {
             before(grammarAccess.getPartElementsAccess().getNextPartsKeyword_2_0()); 
            match(input,15,FOLLOW_15_in_rule__PartElements__Group_2__0__Impl1237); 
             after(grammarAccess.getPartElementsAccess().getNextPartsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__Group_2__0__Impl"


    // $ANTLR start "rule__PartElements__Group_2__1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:642:1: rule__PartElements__Group_2__1 : rule__PartElements__Group_2__1__Impl rule__PartElements__Group_2__2 ;
    public final void rule__PartElements__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:646:1: ( rule__PartElements__Group_2__1__Impl rule__PartElements__Group_2__2 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:647:2: rule__PartElements__Group_2__1__Impl rule__PartElements__Group_2__2
            {
            pushFollow(FOLLOW_rule__PartElements__Group_2__1__Impl_in_rule__PartElements__Group_2__11268);
            rule__PartElements__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PartElements__Group_2__2_in_rule__PartElements__Group_2__11271);
            rule__PartElements__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__Group_2__1"


    // $ANTLR start "rule__PartElements__Group_2__1__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:654:1: rule__PartElements__Group_2__1__Impl : ( ( rule__PartElements__Group_2_1__0 ) ) ;
    public final void rule__PartElements__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:658:1: ( ( ( rule__PartElements__Group_2_1__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:659:1: ( ( rule__PartElements__Group_2_1__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:659:1: ( ( rule__PartElements__Group_2_1__0 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:660:1: ( rule__PartElements__Group_2_1__0 )
            {
             before(grammarAccess.getPartElementsAccess().getGroup_2_1()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:661:1: ( rule__PartElements__Group_2_1__0 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:661:2: rule__PartElements__Group_2_1__0
            {
            pushFollow(FOLLOW_rule__PartElements__Group_2_1__0_in_rule__PartElements__Group_2__1__Impl1298);
            rule__PartElements__Group_2_1__0();

            state._fsp--;


            }

             after(grammarAccess.getPartElementsAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__Group_2__1__Impl"


    // $ANTLR start "rule__PartElements__Group_2__2"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:671:1: rule__PartElements__Group_2__2 : rule__PartElements__Group_2__2__Impl ;
    public final void rule__PartElements__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:675:1: ( rule__PartElements__Group_2__2__Impl )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:676:2: rule__PartElements__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__PartElements__Group_2__2__Impl_in_rule__PartElements__Group_2__21328);
            rule__PartElements__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__Group_2__2"


    // $ANTLR start "rule__PartElements__Group_2__2__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:682:1: rule__PartElements__Group_2__2__Impl : ( '}' ) ;
    public final void rule__PartElements__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:686:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:687:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:687:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:688:1: '}'
            {
             before(grammarAccess.getPartElementsAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,13,FOLLOW_13_in_rule__PartElements__Group_2__2__Impl1356); 
             after(grammarAccess.getPartElementsAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__Group_2__2__Impl"


    // $ANTLR start "rule__PartElements__Group_2_1__0"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:707:1: rule__PartElements__Group_2_1__0 : rule__PartElements__Group_2_1__0__Impl rule__PartElements__Group_2_1__1 ;
    public final void rule__PartElements__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:711:1: ( rule__PartElements__Group_2_1__0__Impl rule__PartElements__Group_2_1__1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:712:2: rule__PartElements__Group_2_1__0__Impl rule__PartElements__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__PartElements__Group_2_1__0__Impl_in_rule__PartElements__Group_2_1__01393);
            rule__PartElements__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PartElements__Group_2_1__1_in_rule__PartElements__Group_2_1__01396);
            rule__PartElements__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__Group_2_1__0"


    // $ANTLR start "rule__PartElements__Group_2_1__0__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:719:1: rule__PartElements__Group_2_1__0__Impl : ( ( rule__PartElements__NextPartsAssignment_2_1_0 ) ) ;
    public final void rule__PartElements__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:723:1: ( ( ( rule__PartElements__NextPartsAssignment_2_1_0 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:724:1: ( ( rule__PartElements__NextPartsAssignment_2_1_0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:724:1: ( ( rule__PartElements__NextPartsAssignment_2_1_0 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:725:1: ( rule__PartElements__NextPartsAssignment_2_1_0 )
            {
             before(grammarAccess.getPartElementsAccess().getNextPartsAssignment_2_1_0()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:726:1: ( rule__PartElements__NextPartsAssignment_2_1_0 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:726:2: rule__PartElements__NextPartsAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__PartElements__NextPartsAssignment_2_1_0_in_rule__PartElements__Group_2_1__0__Impl1423);
            rule__PartElements__NextPartsAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPartElementsAccess().getNextPartsAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__Group_2_1__0__Impl"


    // $ANTLR start "rule__PartElements__Group_2_1__1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:736:1: rule__PartElements__Group_2_1__1 : rule__PartElements__Group_2_1__1__Impl ;
    public final void rule__PartElements__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:740:1: ( rule__PartElements__Group_2_1__1__Impl )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:741:2: rule__PartElements__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PartElements__Group_2_1__1__Impl_in_rule__PartElements__Group_2_1__11453);
            rule__PartElements__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__Group_2_1__1"


    // $ANTLR start "rule__PartElements__Group_2_1__1__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:747:1: rule__PartElements__Group_2_1__1__Impl : ( ( rule__PartElements__Group_2_1_1__0 )* ) ;
    public final void rule__PartElements__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:751:1: ( ( ( rule__PartElements__Group_2_1_1__0 )* ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:752:1: ( ( rule__PartElements__Group_2_1_1__0 )* )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:752:1: ( ( rule__PartElements__Group_2_1_1__0 )* )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:753:1: ( rule__PartElements__Group_2_1_1__0 )*
            {
             before(grammarAccess.getPartElementsAccess().getGroup_2_1_1()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:754:1: ( rule__PartElements__Group_2_1_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:754:2: rule__PartElements__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PartElements__Group_2_1_1__0_in_rule__PartElements__Group_2_1__1__Impl1480);
            	    rule__PartElements__Group_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPartElementsAccess().getGroup_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__Group_2_1__1__Impl"


    // $ANTLR start "rule__PartElements__Group_2_1_1__0"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:768:1: rule__PartElements__Group_2_1_1__0 : rule__PartElements__Group_2_1_1__0__Impl rule__PartElements__Group_2_1_1__1 ;
    public final void rule__PartElements__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:772:1: ( rule__PartElements__Group_2_1_1__0__Impl rule__PartElements__Group_2_1_1__1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:773:2: rule__PartElements__Group_2_1_1__0__Impl rule__PartElements__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__PartElements__Group_2_1_1__0__Impl_in_rule__PartElements__Group_2_1_1__01515);
            rule__PartElements__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PartElements__Group_2_1_1__1_in_rule__PartElements__Group_2_1_1__01518);
            rule__PartElements__Group_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__Group_2_1_1__0"


    // $ANTLR start "rule__PartElements__Group_2_1_1__0__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:780:1: rule__PartElements__Group_2_1_1__0__Impl : ( 'OR' ) ;
    public final void rule__PartElements__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:784:1: ( ( 'OR' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:785:1: ( 'OR' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:785:1: ( 'OR' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:786:1: 'OR'
            {
             before(grammarAccess.getPartElementsAccess().getORKeyword_2_1_1_0()); 
            match(input,16,FOLLOW_16_in_rule__PartElements__Group_2_1_1__0__Impl1546); 
             after(grammarAccess.getPartElementsAccess().getORKeyword_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__PartElements__Group_2_1_1__1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:799:1: rule__PartElements__Group_2_1_1__1 : rule__PartElements__Group_2_1_1__1__Impl ;
    public final void rule__PartElements__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:803:1: ( rule__PartElements__Group_2_1_1__1__Impl )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:804:2: rule__PartElements__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PartElements__Group_2_1_1__1__Impl_in_rule__PartElements__Group_2_1_1__11577);
            rule__PartElements__Group_2_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__Group_2_1_1__1"


    // $ANTLR start "rule__PartElements__Group_2_1_1__1__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:810:1: rule__PartElements__Group_2_1_1__1__Impl : ( ( rule__PartElements__NextPartsAssignment_2_1_1_1 ) ) ;
    public final void rule__PartElements__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:814:1: ( ( ( rule__PartElements__NextPartsAssignment_2_1_1_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:815:1: ( ( rule__PartElements__NextPartsAssignment_2_1_1_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:815:1: ( ( rule__PartElements__NextPartsAssignment_2_1_1_1 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:816:1: ( rule__PartElements__NextPartsAssignment_2_1_1_1 )
            {
             before(grammarAccess.getPartElementsAccess().getNextPartsAssignment_2_1_1_1()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:817:1: ( rule__PartElements__NextPartsAssignment_2_1_1_1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:817:2: rule__PartElements__NextPartsAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__PartElements__NextPartsAssignment_2_1_1_1_in_rule__PartElements__Group_2_1_1__1__Impl1604);
            rule__PartElements__NextPartsAssignment_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPartElementsAccess().getNextPartsAssignment_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__DMNextParts__Group__0"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:831:1: rule__DMNextParts__Group__0 : rule__DMNextParts__Group__0__Impl rule__DMNextParts__Group__1 ;
    public final void rule__DMNextParts__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:835:1: ( rule__DMNextParts__Group__0__Impl rule__DMNextParts__Group__1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:836:2: rule__DMNextParts__Group__0__Impl rule__DMNextParts__Group__1
            {
            pushFollow(FOLLOW_rule__DMNextParts__Group__0__Impl_in_rule__DMNextParts__Group__01638);
            rule__DMNextParts__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DMNextParts__Group__1_in_rule__DMNextParts__Group__01641);
            rule__DMNextParts__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMNextParts__Group__0"


    // $ANTLR start "rule__DMNextParts__Group__0__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:843:1: rule__DMNextParts__Group__0__Impl : ( 'Next part:' ) ;
    public final void rule__DMNextParts__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:847:1: ( ( 'Next part:' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:848:1: ( 'Next part:' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:848:1: ( 'Next part:' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:849:1: 'Next part:'
            {
             before(grammarAccess.getDMNextPartsAccess().getNextPartKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__DMNextParts__Group__0__Impl1669); 
             after(grammarAccess.getDMNextPartsAccess().getNextPartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMNextParts__Group__0__Impl"


    // $ANTLR start "rule__DMNextParts__Group__1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:862:1: rule__DMNextParts__Group__1 : rule__DMNextParts__Group__1__Impl rule__DMNextParts__Group__2 ;
    public final void rule__DMNextParts__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:866:1: ( rule__DMNextParts__Group__1__Impl rule__DMNextParts__Group__2 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:867:2: rule__DMNextParts__Group__1__Impl rule__DMNextParts__Group__2
            {
            pushFollow(FOLLOW_rule__DMNextParts__Group__1__Impl_in_rule__DMNextParts__Group__11700);
            rule__DMNextParts__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DMNextParts__Group__2_in_rule__DMNextParts__Group__11703);
            rule__DMNextParts__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMNextParts__Group__1"


    // $ANTLR start "rule__DMNextParts__Group__1__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:874:1: rule__DMNextParts__Group__1__Impl : ( ( rule__DMNextParts__NameAssignment_1 ) ) ;
    public final void rule__DMNextParts__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:878:1: ( ( ( rule__DMNextParts__NameAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:879:1: ( ( rule__DMNextParts__NameAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:879:1: ( ( rule__DMNextParts__NameAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:880:1: ( rule__DMNextParts__NameAssignment_1 )
            {
             before(grammarAccess.getDMNextPartsAccess().getNameAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:881:1: ( rule__DMNextParts__NameAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:881:2: rule__DMNextParts__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DMNextParts__NameAssignment_1_in_rule__DMNextParts__Group__1__Impl1730);
            rule__DMNextParts__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDMNextPartsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMNextParts__Group__1__Impl"


    // $ANTLR start "rule__DMNextParts__Group__2"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:891:1: rule__DMNextParts__Group__2 : rule__DMNextParts__Group__2__Impl ;
    public final void rule__DMNextParts__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:895:1: ( rule__DMNextParts__Group__2__Impl )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:896:2: rule__DMNextParts__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DMNextParts__Group__2__Impl_in_rule__DMNextParts__Group__21760);
            rule__DMNextParts__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMNextParts__Group__2"


    // $ANTLR start "rule__DMNextParts__Group__2__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:902:1: rule__DMNextParts__Group__2__Impl : ( ( rule__DMNextParts__Group_2__0 )? ) ;
    public final void rule__DMNextParts__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:906:1: ( ( ( rule__DMNextParts__Group_2__0 )? ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:907:1: ( ( rule__DMNextParts__Group_2__0 )? )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:907:1: ( ( rule__DMNextParts__Group_2__0 )? )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:908:1: ( rule__DMNextParts__Group_2__0 )?
            {
             before(grammarAccess.getDMNextPartsAccess().getGroup_2()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:909:1: ( rule__DMNextParts__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:909:2: rule__DMNextParts__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DMNextParts__Group_2__0_in_rule__DMNextParts__Group__2__Impl1787);
                    rule__DMNextParts__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDMNextPartsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMNextParts__Group__2__Impl"


    // $ANTLR start "rule__DMNextParts__Group_2__0"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:925:1: rule__DMNextParts__Group_2__0 : rule__DMNextParts__Group_2__0__Impl rule__DMNextParts__Group_2__1 ;
    public final void rule__DMNextParts__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:929:1: ( rule__DMNextParts__Group_2__0__Impl rule__DMNextParts__Group_2__1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:930:2: rule__DMNextParts__Group_2__0__Impl rule__DMNextParts__Group_2__1
            {
            pushFollow(FOLLOW_rule__DMNextParts__Group_2__0__Impl_in_rule__DMNextParts__Group_2__01824);
            rule__DMNextParts__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DMNextParts__Group_2__1_in_rule__DMNextParts__Group_2__01827);
            rule__DMNextParts__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMNextParts__Group_2__0"


    // $ANTLR start "rule__DMNextParts__Group_2__0__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:937:1: rule__DMNextParts__Group_2__0__Impl : ( 'Part dependencies' ) ;
    public final void rule__DMNextParts__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:941:1: ( ( 'Part dependencies' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:942:1: ( 'Part dependencies' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:942:1: ( 'Part dependencies' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:943:1: 'Part dependencies'
            {
             before(grammarAccess.getDMNextPartsAccess().getPartDependenciesKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__DMNextParts__Group_2__0__Impl1855); 
             after(grammarAccess.getDMNextPartsAccess().getPartDependenciesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMNextParts__Group_2__0__Impl"


    // $ANTLR start "rule__DMNextParts__Group_2__1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:956:1: rule__DMNextParts__Group_2__1 : rule__DMNextParts__Group_2__1__Impl rule__DMNextParts__Group_2__2 ;
    public final void rule__DMNextParts__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:960:1: ( rule__DMNextParts__Group_2__1__Impl rule__DMNextParts__Group_2__2 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:961:2: rule__DMNextParts__Group_2__1__Impl rule__DMNextParts__Group_2__2
            {
            pushFollow(FOLLOW_rule__DMNextParts__Group_2__1__Impl_in_rule__DMNextParts__Group_2__11886);
            rule__DMNextParts__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DMNextParts__Group_2__2_in_rule__DMNextParts__Group_2__11889);
            rule__DMNextParts__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMNextParts__Group_2__1"


    // $ANTLR start "rule__DMNextParts__Group_2__1__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:968:1: rule__DMNextParts__Group_2__1__Impl : ( '{' ) ;
    public final void rule__DMNextParts__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:972:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:973:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:973:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:974:1: '{'
            {
             before(grammarAccess.getDMNextPartsAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,12,FOLLOW_12_in_rule__DMNextParts__Group_2__1__Impl1917); 
             after(grammarAccess.getDMNextPartsAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMNextParts__Group_2__1__Impl"


    // $ANTLR start "rule__DMNextParts__Group_2__2"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:987:1: rule__DMNextParts__Group_2__2 : rule__DMNextParts__Group_2__2__Impl rule__DMNextParts__Group_2__3 ;
    public final void rule__DMNextParts__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:991:1: ( rule__DMNextParts__Group_2__2__Impl rule__DMNextParts__Group_2__3 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:992:2: rule__DMNextParts__Group_2__2__Impl rule__DMNextParts__Group_2__3
            {
            pushFollow(FOLLOW_rule__DMNextParts__Group_2__2__Impl_in_rule__DMNextParts__Group_2__21948);
            rule__DMNextParts__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DMNextParts__Group_2__3_in_rule__DMNextParts__Group_2__21951);
            rule__DMNextParts__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMNextParts__Group_2__2"


    // $ANTLR start "rule__DMNextParts__Group_2__2__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:999:1: rule__DMNextParts__Group_2__2__Impl : ( ( ( rule__DMNextParts__ExpressionsAssignment_2_2 ) ) ( ( rule__DMNextParts__ExpressionsAssignment_2_2 )* ) ) ;
    public final void rule__DMNextParts__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1003:1: ( ( ( ( rule__DMNextParts__ExpressionsAssignment_2_2 ) ) ( ( rule__DMNextParts__ExpressionsAssignment_2_2 )* ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1004:1: ( ( ( rule__DMNextParts__ExpressionsAssignment_2_2 ) ) ( ( rule__DMNextParts__ExpressionsAssignment_2_2 )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1004:1: ( ( ( rule__DMNextParts__ExpressionsAssignment_2_2 ) ) ( ( rule__DMNextParts__ExpressionsAssignment_2_2 )* ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1005:1: ( ( rule__DMNextParts__ExpressionsAssignment_2_2 ) ) ( ( rule__DMNextParts__ExpressionsAssignment_2_2 )* )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1005:1: ( ( rule__DMNextParts__ExpressionsAssignment_2_2 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1006:1: ( rule__DMNextParts__ExpressionsAssignment_2_2 )
            {
             before(grammarAccess.getDMNextPartsAccess().getExpressionsAssignment_2_2()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1007:1: ( rule__DMNextParts__ExpressionsAssignment_2_2 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1007:2: rule__DMNextParts__ExpressionsAssignment_2_2
            {
            pushFollow(FOLLOW_rule__DMNextParts__ExpressionsAssignment_2_2_in_rule__DMNextParts__Group_2__2__Impl1980);
            rule__DMNextParts__ExpressionsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDMNextPartsAccess().getExpressionsAssignment_2_2()); 

            }

            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1010:1: ( ( rule__DMNextParts__ExpressionsAssignment_2_2 )* )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1011:1: ( rule__DMNextParts__ExpressionsAssignment_2_2 )*
            {
             before(grammarAccess.getDMNextPartsAccess().getExpressionsAssignment_2_2()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1012:1: ( rule__DMNextParts__ExpressionsAssignment_2_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20||LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1012:2: rule__DMNextParts__ExpressionsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_rule__DMNextParts__ExpressionsAssignment_2_2_in_rule__DMNextParts__Group_2__2__Impl1992);
            	    rule__DMNextParts__ExpressionsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDMNextPartsAccess().getExpressionsAssignment_2_2()); 

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
    // $ANTLR end "rule__DMNextParts__Group_2__2__Impl"


    // $ANTLR start "rule__DMNextParts__Group_2__3"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1023:1: rule__DMNextParts__Group_2__3 : rule__DMNextParts__Group_2__3__Impl ;
    public final void rule__DMNextParts__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1027:1: ( rule__DMNextParts__Group_2__3__Impl )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1028:2: rule__DMNextParts__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__DMNextParts__Group_2__3__Impl_in_rule__DMNextParts__Group_2__32025);
            rule__DMNextParts__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMNextParts__Group_2__3"


    // $ANTLR start "rule__DMNextParts__Group_2__3__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1034:1: rule__DMNextParts__Group_2__3__Impl : ( '}' ) ;
    public final void rule__DMNextParts__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1038:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1039:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1039:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1040:1: '}'
            {
             before(grammarAccess.getDMNextPartsAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,13,FOLLOW_13_in_rule__DMNextParts__Group_2__3__Impl2053); 
             after(grammarAccess.getDMNextPartsAccess().getRightCurlyBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMNextParts__Group_2__3__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1061:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1065:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1066:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__02092);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__02095);
            rule__Or__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1073:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1077:1: ( ( ruleAnd ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1078:1: ( ruleAnd )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1078:1: ( ruleAnd )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1079:1: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl2122);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1090:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1094:1: ( rule__Or__Group__1__Impl )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1095:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__12151);
            rule__Or__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1101:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1105:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1106:1: ( ( rule__Or__Group_1__0 )* )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1106:1: ( ( rule__Or__Group_1__0 )* )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1107:1: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1108:1: ( rule__Or__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1108:2: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl2178);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1122:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1126:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1127:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__02213);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__02216);
            rule__Or__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1134:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1138:1: ( ( () ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1139:1: ( () )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1139:1: ( () )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1140:1: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1141:1: ()
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1143:1: 
            {
            }

             after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1153:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1157:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1158:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__12274);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__12277);
            rule__Or__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1165:1: rule__Or__Group_1__1__Impl : ( 'OR' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1169:1: ( ( 'OR' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1170:1: ( 'OR' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1170:1: ( 'OR' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1171:1: 'OR'
            {
             before(grammarAccess.getOrAccess().getORKeyword_1_1()); 
            match(input,16,FOLLOW_16_in_rule__Or__Group_1__1__Impl2305); 
             after(grammarAccess.getOrAccess().getORKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1184:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1188:1: ( rule__Or__Group_1__2__Impl )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1189:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__22336);
            rule__Or__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1195:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1199:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1200:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1200:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1201:1: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1202:1: ( rule__Or__RightAssignment_1_2 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1202:2: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Or__RightAssignment_1_2_in_rule__Or__Group_1__2__Impl2363);
            rule__Or__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1218:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1222:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1223:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__02399);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__02402);
            rule__And__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1230:1: rule__And__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1234:1: ( ( rulePrimary ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1235:1: ( rulePrimary )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1235:1: ( rulePrimary )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1236:1: rulePrimary
            {
             before(grammarAccess.getAndAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__And__Group__0__Impl2429);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getAndAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1247:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1251:1: ( rule__And__Group__1__Impl )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1252:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__12458);
            rule__And__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1258:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1262:1: ( ( ( rule__And__Group_1__0 )* ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1263:1: ( ( rule__And__Group_1__0 )* )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1263:1: ( ( rule__And__Group_1__0 )* )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1264:1: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1265:1: ( rule__And__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1265:2: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl2485);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1279:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1283:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1284:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__02520);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__02523);
            rule__And__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1291:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1295:1: ( ( () ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1296:1: ( () )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1296:1: ( () )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1297:1: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1298:1: ()
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1300:1: 
            {
            }

             after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1310:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1314:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1315:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__12581);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__12584);
            rule__And__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1322:1: rule__And__Group_1__1__Impl : ( 'AND' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1326:1: ( ( 'AND' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1327:1: ( 'AND' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1327:1: ( 'AND' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1328:1: 'AND'
            {
             before(grammarAccess.getAndAccess().getANDKeyword_1_1()); 
            match(input,19,FOLLOW_19_in_rule__And__Group_1__1__Impl2612); 
             after(grammarAccess.getAndAccess().getANDKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1341:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1345:1: ( rule__And__Group_1__2__Impl )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1346:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__22643);
            rule__And__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1352:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1356:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1357:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1357:1: ( ( rule__And__RightAssignment_1_2 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1358:1: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1359:1: ( rule__And__RightAssignment_1_2 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1359:2: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__And__RightAssignment_1_2_in_rule__And__Group_1__2__Impl2670);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1375:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1379:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1380:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__02706);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__02709);
            rule__Primary__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1387:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1391:1: ( ( '(' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1392:1: ( '(' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1392:1: ( '(' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1393:1: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,20,FOLLOW_20_in_rule__Primary__Group_0__0__Impl2737); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1406:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1410:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1411:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__12768);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__12771);
            rule__Primary__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1418:1: rule__Primary__Group_0__1__Impl : ( ruleDependency ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1422:1: ( ( ruleDependency ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1423:1: ( ruleDependency )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1423:1: ( ruleDependency )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1424:1: ruleDependency
            {
             before(grammarAccess.getPrimaryAccess().getDependencyParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleDependency_in_rule__Primary__Group_0__1__Impl2798);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getDependencyParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1435:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1439:1: ( rule__Primary__Group_0__2__Impl )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1440:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__22827);
            rule__Primary__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1446:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1450:1: ( ( ')' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1451:1: ( ')' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1451:1: ( ')' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1452:1: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,21,FOLLOW_21_in_rule__Primary__Group_0__2__Impl2855); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Atomic__Group__0"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1471:1: rule__Atomic__Group__0 : rule__Atomic__Group__0__Impl rule__Atomic__Group__1 ;
    public final void rule__Atomic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1475:1: ( rule__Atomic__Group__0__Impl rule__Atomic__Group__1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1476:2: rule__Atomic__Group__0__Impl rule__Atomic__Group__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group__0__Impl_in_rule__Atomic__Group__02892);
            rule__Atomic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group__1_in_rule__Atomic__Group__02895);
            rule__Atomic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group__0"


    // $ANTLR start "rule__Atomic__Group__0__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1483:1: rule__Atomic__Group__0__Impl : ( () ) ;
    public final void rule__Atomic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1487:1: ( ( () ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1488:1: ( () )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1488:1: ( () )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1489:1: ()
            {
             before(grammarAccess.getAtomicAccess().getDMQuestionAction_0()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1490:1: ()
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1492:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getDMQuestionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group__0__Impl"


    // $ANTLR start "rule__Atomic__Group__1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1502:1: rule__Atomic__Group__1 : rule__Atomic__Group__1__Impl rule__Atomic__Group__2 ;
    public final void rule__Atomic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1506:1: ( rule__Atomic__Group__1__Impl rule__Atomic__Group__2 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1507:2: rule__Atomic__Group__1__Impl rule__Atomic__Group__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group__1__Impl_in_rule__Atomic__Group__12953);
            rule__Atomic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group__2_in_rule__Atomic__Group__12956);
            rule__Atomic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group__1"


    // $ANTLR start "rule__Atomic__Group__1__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1514:1: rule__Atomic__Group__1__Impl : ( 'Question:' ) ;
    public final void rule__Atomic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1518:1: ( ( 'Question:' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1519:1: ( 'Question:' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1519:1: ( 'Question:' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1520:1: 'Question:'
            {
             before(grammarAccess.getAtomicAccess().getQuestionKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Atomic__Group__1__Impl2984); 
             after(grammarAccess.getAtomicAccess().getQuestionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group__1__Impl"


    // $ANTLR start "rule__Atomic__Group__2"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1533:1: rule__Atomic__Group__2 : rule__Atomic__Group__2__Impl rule__Atomic__Group__3 ;
    public final void rule__Atomic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1537:1: ( rule__Atomic__Group__2__Impl rule__Atomic__Group__3 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1538:2: rule__Atomic__Group__2__Impl rule__Atomic__Group__3
            {
            pushFollow(FOLLOW_rule__Atomic__Group__2__Impl_in_rule__Atomic__Group__23015);
            rule__Atomic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group__3_in_rule__Atomic__Group__23018);
            rule__Atomic__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group__2"


    // $ANTLR start "rule__Atomic__Group__2__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1545:1: rule__Atomic__Group__2__Impl : ( ( rule__Atomic__QuestionAssignment_2 ) ) ;
    public final void rule__Atomic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1549:1: ( ( ( rule__Atomic__QuestionAssignment_2 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1550:1: ( ( rule__Atomic__QuestionAssignment_2 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1550:1: ( ( rule__Atomic__QuestionAssignment_2 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1551:1: ( rule__Atomic__QuestionAssignment_2 )
            {
             before(grammarAccess.getAtomicAccess().getQuestionAssignment_2()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1552:1: ( rule__Atomic__QuestionAssignment_2 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1552:2: rule__Atomic__QuestionAssignment_2
            {
            pushFollow(FOLLOW_rule__Atomic__QuestionAssignment_2_in_rule__Atomic__Group__2__Impl3045);
            rule__Atomic__QuestionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getQuestionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group__2__Impl"


    // $ANTLR start "rule__Atomic__Group__3"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1562:1: rule__Atomic__Group__3 : rule__Atomic__Group__3__Impl rule__Atomic__Group__4 ;
    public final void rule__Atomic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1566:1: ( rule__Atomic__Group__3__Impl rule__Atomic__Group__4 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1567:2: rule__Atomic__Group__3__Impl rule__Atomic__Group__4
            {
            pushFollow(FOLLOW_rule__Atomic__Group__3__Impl_in_rule__Atomic__Group__33075);
            rule__Atomic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group__4_in_rule__Atomic__Group__33078);
            rule__Atomic__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group__3"


    // $ANTLR start "rule__Atomic__Group__3__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1574:1: rule__Atomic__Group__3__Impl : ( 'Answer:' ) ;
    public final void rule__Atomic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1578:1: ( ( 'Answer:' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1579:1: ( 'Answer:' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1579:1: ( 'Answer:' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1580:1: 'Answer:'
            {
             before(grammarAccess.getAtomicAccess().getAnswerKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Atomic__Group__3__Impl3106); 
             after(grammarAccess.getAtomicAccess().getAnswerKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group__3__Impl"


    // $ANTLR start "rule__Atomic__Group__4"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1593:1: rule__Atomic__Group__4 : rule__Atomic__Group__4__Impl ;
    public final void rule__Atomic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1597:1: ( rule__Atomic__Group__4__Impl )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1598:2: rule__Atomic__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group__4__Impl_in_rule__Atomic__Group__43137);
            rule__Atomic__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group__4"


    // $ANTLR start "rule__Atomic__Group__4__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1604:1: rule__Atomic__Group__4__Impl : ( ( rule__Atomic__AnswerAssignment_4 ) ) ;
    public final void rule__Atomic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1608:1: ( ( ( rule__Atomic__AnswerAssignment_4 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1609:1: ( ( rule__Atomic__AnswerAssignment_4 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1609:1: ( ( rule__Atomic__AnswerAssignment_4 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1610:1: ( rule__Atomic__AnswerAssignment_4 )
            {
             before(grammarAccess.getAtomicAccess().getAnswerAssignment_4()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1611:1: ( rule__Atomic__AnswerAssignment_4 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1611:2: rule__Atomic__AnswerAssignment_4
            {
            pushFollow(FOLLOW_rule__Atomic__AnswerAssignment_4_in_rule__Atomic__Group__4__Impl3164);
            rule__Atomic__AnswerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAnswerAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group__4__Impl"


    // $ANTLR start "rule__DependencyModel__ElementsAssignment"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1632:1: rule__DependencyModel__ElementsAssignment : ( ruleSurveyElements ) ;
    public final void rule__DependencyModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1636:1: ( ( ruleSurveyElements ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1637:1: ( ruleSurveyElements )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1637:1: ( ruleSurveyElements )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1638:1: ruleSurveyElements
            {
             before(grammarAccess.getDependencyModelAccess().getElementsSurveyElementsParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSurveyElements_in_rule__DependencyModel__ElementsAssignment3209);
            ruleSurveyElements();

            state._fsp--;

             after(grammarAccess.getDependencyModelAccess().getElementsSurveyElementsParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyModel__ElementsAssignment"


    // $ANTLR start "rule__SurveyElements__NameAssignment_1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1647:1: rule__SurveyElements__NameAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__SurveyElements__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1651:1: ( ( ( RULE_STRING ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1652:1: ( ( RULE_STRING ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1652:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1653:1: ( RULE_STRING )
            {
             before(grammarAccess.getSurveyElementsAccess().getNameQuestionnaireCrossReference_1_0()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1654:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1655:1: RULE_STRING
            {
             before(grammarAccess.getSurveyElementsAccess().getNameQuestionnaireSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SurveyElements__NameAssignment_13244); 
             after(grammarAccess.getSurveyElementsAccess().getNameQuestionnaireSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSurveyElementsAccess().getNameQuestionnaireCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyElements__NameAssignment_1"


    // $ANTLR start "rule__SurveyElements__PartElementsAssignment_3"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1666:1: rule__SurveyElements__PartElementsAssignment_3 : ( rulePartElements ) ;
    public final void rule__SurveyElements__PartElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1670:1: ( ( rulePartElements ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1671:1: ( rulePartElements )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1671:1: ( rulePartElements )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1672:1: rulePartElements
            {
             before(grammarAccess.getSurveyElementsAccess().getPartElementsPartElementsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePartElements_in_rule__SurveyElements__PartElementsAssignment_33279);
            rulePartElements();

            state._fsp--;

             after(grammarAccess.getSurveyElementsAccess().getPartElementsPartElementsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyElements__PartElementsAssignment_3"


    // $ANTLR start "rule__PartElements__NameAssignment_1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1681:1: rule__PartElements__NameAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__PartElements__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1685:1: ( ( ( RULE_STRING ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1686:1: ( ( RULE_STRING ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1686:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1687:1: ( RULE_STRING )
            {
             before(grammarAccess.getPartElementsAccess().getNamePartCrossReference_1_0()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1688:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1689:1: RULE_STRING
            {
             before(grammarAccess.getPartElementsAccess().getNamePartSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PartElements__NameAssignment_13314); 
             after(grammarAccess.getPartElementsAccess().getNamePartSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPartElementsAccess().getNamePartCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__NameAssignment_1"


    // $ANTLR start "rule__PartElements__NextPartsAssignment_2_1_0"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1700:1: rule__PartElements__NextPartsAssignment_2_1_0 : ( ruleDMNextParts ) ;
    public final void rule__PartElements__NextPartsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1704:1: ( ( ruleDMNextParts ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1705:1: ( ruleDMNextParts )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1705:1: ( ruleDMNextParts )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1706:1: ruleDMNextParts
            {
             before(grammarAccess.getPartElementsAccess().getNextPartsDMNextPartsParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleDMNextParts_in_rule__PartElements__NextPartsAssignment_2_1_03349);
            ruleDMNextParts();

            state._fsp--;

             after(grammarAccess.getPartElementsAccess().getNextPartsDMNextPartsParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__NextPartsAssignment_2_1_0"


    // $ANTLR start "rule__PartElements__NextPartsAssignment_2_1_1_1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1715:1: rule__PartElements__NextPartsAssignment_2_1_1_1 : ( ruleDMNextParts ) ;
    public final void rule__PartElements__NextPartsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1719:1: ( ( ruleDMNextParts ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1720:1: ( ruleDMNextParts )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1720:1: ( ruleDMNextParts )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1721:1: ruleDMNextParts
            {
             before(grammarAccess.getPartElementsAccess().getNextPartsDMNextPartsParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleDMNextParts_in_rule__PartElements__NextPartsAssignment_2_1_1_13380);
            ruleDMNextParts();

            state._fsp--;

             after(grammarAccess.getPartElementsAccess().getNextPartsDMNextPartsParserRuleCall_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartElements__NextPartsAssignment_2_1_1_1"


    // $ANTLR start "rule__DMNextParts__NameAssignment_1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1730:1: rule__DMNextParts__NameAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__DMNextParts__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1734:1: ( ( ( RULE_STRING ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1735:1: ( ( RULE_STRING ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1735:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1736:1: ( RULE_STRING )
            {
             before(grammarAccess.getDMNextPartsAccess().getNamePartCrossReference_1_0()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1737:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1738:1: RULE_STRING
            {
             before(grammarAccess.getDMNextPartsAccess().getNamePartSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DMNextParts__NameAssignment_13415); 
             after(grammarAccess.getDMNextPartsAccess().getNamePartSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDMNextPartsAccess().getNamePartCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMNextParts__NameAssignment_1"


    // $ANTLR start "rule__DMNextParts__ExpressionsAssignment_2_2"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1749:1: rule__DMNextParts__ExpressionsAssignment_2_2 : ( ruleDependency ) ;
    public final void rule__DMNextParts__ExpressionsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1753:1: ( ( ruleDependency ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1754:1: ( ruleDependency )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1754:1: ( ruleDependency )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1755:1: ruleDependency
            {
             before(grammarAccess.getDMNextPartsAccess().getExpressionsDependencyParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleDependency_in_rule__DMNextParts__ExpressionsAssignment_2_23450);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getDMNextPartsAccess().getExpressionsDependencyParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMNextParts__ExpressionsAssignment_2_2"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1764:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1768:1: ( ( ruleAnd ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1769:1: ( ruleAnd )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1769:1: ( ruleAnd )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1770:1: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_23481);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1779:1: rule__And__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1783:1: ( ( rulePrimary ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1784:1: ( rulePrimary )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1784:1: ( rulePrimary )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1785:1: rulePrimary
            {
             before(grammarAccess.getAndAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__And__RightAssignment_1_23512);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Atomic__QuestionAssignment_2"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1794:1: rule__Atomic__QuestionAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__Atomic__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1798:1: ( ( ( RULE_STRING ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1799:1: ( ( RULE_STRING ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1799:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1800:1: ( RULE_STRING )
            {
             before(grammarAccess.getAtomicAccess().getQuestionQuestionCrossReference_2_0()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1801:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1802:1: RULE_STRING
            {
             before(grammarAccess.getAtomicAccess().getQuestionQuestionSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Atomic__QuestionAssignment_23547); 
             after(grammarAccess.getAtomicAccess().getQuestionQuestionSTRINGTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getQuestionQuestionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__QuestionAssignment_2"


    // $ANTLR start "rule__Atomic__AnswerAssignment_4"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1813:1: rule__Atomic__AnswerAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__Atomic__AnswerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1817:1: ( ( ( RULE_STRING ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1818:1: ( ( RULE_STRING ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1818:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1819:1: ( RULE_STRING )
            {
             before(grammarAccess.getAtomicAccess().getAnswerAnswerCrossReference_4_0()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1820:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1821:1: RULE_STRING
            {
             before(grammarAccess.getAtomicAccess().getAnswerAnswerSTRINGTerminalRuleCall_4_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Atomic__AnswerAssignment_43586); 
             after(grammarAccess.getAtomicAccess().getAnswerAnswerSTRINGTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getAnswerAnswerCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__AnswerAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDependencyModel_in_entryRuleDependencyModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencyModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependencyModel__ElementsAssignment_in_ruleDependencyModel96 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__DependencyModel__ElementsAssignment_in_ruleDependencyModel108 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleSurveyElements_in_entryRuleSurveyElements138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurveyElements145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyElements__Group__0_in_ruleSurveyElements171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartElements_in_entryRulePartElements198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartElements205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartElements__Group__0_in_rulePartElements231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDMNextParts_in_entryRuleDMNextParts258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDMNextParts265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DMNextParts__Group__0_in_ruleDMNextParts291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleDependency351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0_in_ruleOr410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0_in_ruleAnd470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__0_in_ruleAtomic590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__0_in_rule__Primary__Alternatives626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__Primary__Alternatives644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyElements__Group__0__Impl_in_rule__SurveyElements__Group__0674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SurveyElements__Group__1_in_rule__SurveyElements__Group__0677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SurveyElements__Group__0__Impl705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyElements__Group__1__Impl_in_rule__SurveyElements__Group__1736 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SurveyElements__Group__2_in_rule__SurveyElements__Group__1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyElements__NameAssignment_1_in_rule__SurveyElements__Group__1__Impl766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyElements__Group__2__Impl_in_rule__SurveyElements__Group__2796 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SurveyElements__Group__3_in_rule__SurveyElements__Group__2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SurveyElements__Group__2__Impl827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyElements__Group__3__Impl_in_rule__SurveyElements__Group__3858 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SurveyElements__Group__4_in_rule__SurveyElements__Group__3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyElements__PartElementsAssignment_3_in_rule__SurveyElements__Group__3__Impl890 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__SurveyElements__PartElementsAssignment_3_in_rule__SurveyElements__Group__3__Impl902 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__SurveyElements__Group__4__Impl_in_rule__SurveyElements__Group__4935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SurveyElements__Group__4__Impl963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartElements__Group__0__Impl_in_rule__PartElements__Group__01004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PartElements__Group__1_in_rule__PartElements__Group__01007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PartElements__Group__0__Impl1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartElements__Group__1__Impl_in_rule__PartElements__Group__11066 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__PartElements__Group__2_in_rule__PartElements__Group__11069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartElements__NameAssignment_1_in_rule__PartElements__Group__1__Impl1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartElements__Group__2__Impl_in_rule__PartElements__Group__21126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartElements__Group_2__0_in_rule__PartElements__Group__2__Impl1155 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__PartElements__Group_2__0_in_rule__PartElements__Group__2__Impl1167 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__PartElements__Group_2__0__Impl_in_rule__PartElements__Group_2__01206 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PartElements__Group_2__1_in_rule__PartElements__Group_2__01209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PartElements__Group_2__0__Impl1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartElements__Group_2__1__Impl_in_rule__PartElements__Group_2__11268 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__PartElements__Group_2__2_in_rule__PartElements__Group_2__11271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartElements__Group_2_1__0_in_rule__PartElements__Group_2__1__Impl1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartElements__Group_2__2__Impl_in_rule__PartElements__Group_2__21328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PartElements__Group_2__2__Impl1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartElements__Group_2_1__0__Impl_in_rule__PartElements__Group_2_1__01393 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__PartElements__Group_2_1__1_in_rule__PartElements__Group_2_1__01396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartElements__NextPartsAssignment_2_1_0_in_rule__PartElements__Group_2_1__0__Impl1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartElements__Group_2_1__1__Impl_in_rule__PartElements__Group_2_1__11453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartElements__Group_2_1_1__0_in_rule__PartElements__Group_2_1__1__Impl1480 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__PartElements__Group_2_1_1__0__Impl_in_rule__PartElements__Group_2_1_1__01515 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PartElements__Group_2_1_1__1_in_rule__PartElements__Group_2_1_1__01518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PartElements__Group_2_1_1__0__Impl1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartElements__Group_2_1_1__1__Impl_in_rule__PartElements__Group_2_1_1__11577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartElements__NextPartsAssignment_2_1_1_1_in_rule__PartElements__Group_2_1_1__1__Impl1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DMNextParts__Group__0__Impl_in_rule__DMNextParts__Group__01638 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DMNextParts__Group__1_in_rule__DMNextParts__Group__01641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DMNextParts__Group__0__Impl1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DMNextParts__Group__1__Impl_in_rule__DMNextParts__Group__11700 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__DMNextParts__Group__2_in_rule__DMNextParts__Group__11703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DMNextParts__NameAssignment_1_in_rule__DMNextParts__Group__1__Impl1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DMNextParts__Group__2__Impl_in_rule__DMNextParts__Group__21760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DMNextParts__Group_2__0_in_rule__DMNextParts__Group__2__Impl1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DMNextParts__Group_2__0__Impl_in_rule__DMNextParts__Group_2__01824 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__DMNextParts__Group_2__1_in_rule__DMNextParts__Group_2__01827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DMNextParts__Group_2__0__Impl1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DMNextParts__Group_2__1__Impl_in_rule__DMNextParts__Group_2__11886 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__DMNextParts__Group_2__2_in_rule__DMNextParts__Group_2__11889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DMNextParts__Group_2__1__Impl1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DMNextParts__Group_2__2__Impl_in_rule__DMNextParts__Group_2__21948 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__DMNextParts__Group_2__3_in_rule__DMNextParts__Group_2__21951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DMNextParts__ExpressionsAssignment_2_2_in_rule__DMNextParts__Group_2__2__Impl1980 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_rule__DMNextParts__ExpressionsAssignment_2_2_in_rule__DMNextParts__Group_2__2__Impl1992 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_rule__DMNextParts__Group_2__3__Impl_in_rule__DMNextParts__Group_2__32025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DMNextParts__Group_2__3__Impl2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__02092 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__02095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__12151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl2178 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__02213 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__02216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__12274 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__12277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Or__Group_1__1__Impl2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__22336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__RightAssignment_1_2_in_rule__Or__Group_1__2__Impl2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__02399 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__02402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__And__Group__0__Impl2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__12458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl2485 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__02520 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__02523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__12581 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__12584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__And__Group_1__1__Impl2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__22643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__RightAssignment_1_2_in_rule__And__Group_1__2__Impl2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__02706 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__02709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Primary__Group_0__0__Impl2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__12768 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__12771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_rule__Primary__Group_0__1__Impl2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__22827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Primary__Group_0__2__Impl2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__0__Impl_in_rule__Atomic__Group__02892 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__Atomic__Group__1_in_rule__Atomic__Group__02895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__1__Impl_in_rule__Atomic__Group__12953 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Atomic__Group__2_in_rule__Atomic__Group__12956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Atomic__Group__1__Impl2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__2__Impl_in_rule__Atomic__Group__23015 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Atomic__Group__3_in_rule__Atomic__Group__23018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__QuestionAssignment_2_in_rule__Atomic__Group__2__Impl3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__3__Impl_in_rule__Atomic__Group__33075 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Atomic__Group__4_in_rule__Atomic__Group__33078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Atomic__Group__3__Impl3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group__4__Impl_in_rule__Atomic__Group__43137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__AnswerAssignment_4_in_rule__Atomic__Group__4__Impl3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSurveyElements_in_rule__DependencyModel__ElementsAssignment3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SurveyElements__NameAssignment_13244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartElements_in_rule__SurveyElements__PartElementsAssignment_33279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PartElements__NameAssignment_13314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDMNextParts_in_rule__PartElements__NextPartsAssignment_2_1_03349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDMNextParts_in_rule__PartElements__NextPartsAssignment_2_1_1_13380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DMNextParts__NameAssignment_13415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_rule__DMNextParts__ExpressionsAssignment_2_23450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_23481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__And__RightAssignment_1_23512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Atomic__QuestionAssignment_23547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Atomic__AnswerAssignment_43586 = new BitSet(new long[]{0x0000000000000002L});

}