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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AND'", "'OR'", "'Survey:'", "'{'", "'}'", "'Part:'", "'Next part (default):'", "'Next parts {'", "'Next part:'", "'Part dependencies {'", "'Question:'", "'Answer:'"
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




    // $ANTLR start "entryRuleSurveyDependencies"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:60:1: entryRuleSurveyDependencies : ruleSurveyDependencies EOF ;
    public final void entryRuleSurveyDependencies() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:61:1: ( ruleSurveyDependencies EOF )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:62:1: ruleSurveyDependencies EOF
            {
             before(grammarAccess.getSurveyDependenciesRule()); 
            pushFollow(FOLLOW_ruleSurveyDependencies_in_entryRuleSurveyDependencies61);
            ruleSurveyDependencies();

            state._fsp--;

             after(grammarAccess.getSurveyDependenciesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSurveyDependencies68); 

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
    // $ANTLR end "entryRuleSurveyDependencies"


    // $ANTLR start "ruleSurveyDependencies"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:69:1: ruleSurveyDependencies : ( ( ( rule__SurveyDependencies__SurveyDependencyAssignment ) ) ( ( rule__SurveyDependencies__SurveyDependencyAssignment )* ) ) ;
    public final void ruleSurveyDependencies() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:73:2: ( ( ( ( rule__SurveyDependencies__SurveyDependencyAssignment ) ) ( ( rule__SurveyDependencies__SurveyDependencyAssignment )* ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:74:1: ( ( ( rule__SurveyDependencies__SurveyDependencyAssignment ) ) ( ( rule__SurveyDependencies__SurveyDependencyAssignment )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:74:1: ( ( ( rule__SurveyDependencies__SurveyDependencyAssignment ) ) ( ( rule__SurveyDependencies__SurveyDependencyAssignment )* ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:75:1: ( ( rule__SurveyDependencies__SurveyDependencyAssignment ) ) ( ( rule__SurveyDependencies__SurveyDependencyAssignment )* )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:75:1: ( ( rule__SurveyDependencies__SurveyDependencyAssignment ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:76:1: ( rule__SurveyDependencies__SurveyDependencyAssignment )
            {
             before(grammarAccess.getSurveyDependenciesAccess().getSurveyDependencyAssignment()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:77:1: ( rule__SurveyDependencies__SurveyDependencyAssignment )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:77:2: rule__SurveyDependencies__SurveyDependencyAssignment
            {
            pushFollow(FOLLOW_rule__SurveyDependencies__SurveyDependencyAssignment_in_ruleSurveyDependencies96);
            rule__SurveyDependencies__SurveyDependencyAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSurveyDependenciesAccess().getSurveyDependencyAssignment()); 

            }

            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:80:1: ( ( rule__SurveyDependencies__SurveyDependencyAssignment )* )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:81:1: ( rule__SurveyDependencies__SurveyDependencyAssignment )*
            {
             before(grammarAccess.getSurveyDependenciesAccess().getSurveyDependencyAssignment()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:82:1: ( rule__SurveyDependencies__SurveyDependencyAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:82:2: rule__SurveyDependencies__SurveyDependencyAssignment
            	    {
            	    pushFollow(FOLLOW_rule__SurveyDependencies__SurveyDependencyAssignment_in_ruleSurveyDependencies108);
            	    rule__SurveyDependencies__SurveyDependencyAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSurveyDependenciesAccess().getSurveyDependencyAssignment()); 

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
    // $ANTLR end "ruleSurveyDependencies"


    // $ANTLR start "entryRuleSurveyDependency"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:97:1: entryRuleSurveyDependency : ruleSurveyDependency EOF ;
    public final void entryRuleSurveyDependency() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:98:1: ( ruleSurveyDependency EOF )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:99:1: ruleSurveyDependency EOF
            {
             before(grammarAccess.getSurveyDependencyRule()); 
            pushFollow(FOLLOW_ruleSurveyDependency_in_entryRuleSurveyDependency140);
            ruleSurveyDependency();

            state._fsp--;

             after(grammarAccess.getSurveyDependencyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSurveyDependency147); 

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
    // $ANTLR end "entryRuleSurveyDependency"


    // $ANTLR start "ruleSurveyDependency"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:106:1: ruleSurveyDependency : ( ( rule__SurveyDependency__Group__0 ) ) ;
    public final void ruleSurveyDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:110:2: ( ( ( rule__SurveyDependency__Group__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:111:1: ( ( rule__SurveyDependency__Group__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:111:1: ( ( rule__SurveyDependency__Group__0 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:112:1: ( rule__SurveyDependency__Group__0 )
            {
             before(grammarAccess.getSurveyDependencyAccess().getGroup()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:113:1: ( rule__SurveyDependency__Group__0 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:113:2: rule__SurveyDependency__Group__0
            {
            pushFollow(FOLLOW_rule__SurveyDependency__Group__0_in_ruleSurveyDependency173);
            rule__SurveyDependency__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSurveyDependencyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSurveyDependency"


    // $ANTLR start "entryRuleSDPart"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:125:1: entryRuleSDPart : ruleSDPart EOF ;
    public final void entryRuleSDPart() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:126:1: ( ruleSDPart EOF )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:127:1: ruleSDPart EOF
            {
             before(grammarAccess.getSDPartRule()); 
            pushFollow(FOLLOW_ruleSDPart_in_entryRuleSDPart200);
            ruleSDPart();

            state._fsp--;

             after(grammarAccess.getSDPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSDPart207); 

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
    // $ANTLR end "entryRuleSDPart"


    // $ANTLR start "ruleSDPart"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:134:1: ruleSDPart : ( ( rule__SDPart__Group__0 ) ) ;
    public final void ruleSDPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:138:2: ( ( ( rule__SDPart__Group__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:139:1: ( ( rule__SDPart__Group__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:139:1: ( ( rule__SDPart__Group__0 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:140:1: ( rule__SDPart__Group__0 )
            {
             before(grammarAccess.getSDPartAccess().getGroup()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:141:1: ( rule__SDPart__Group__0 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:141:2: rule__SDPart__Group__0
            {
            pushFollow(FOLLOW_rule__SDPart__Group__0_in_ruleSDPart233);
            rule__SDPart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSDPartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSDPart"


    // $ANTLR start "entryRuleSDNextParts"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:153:1: entryRuleSDNextParts : ruleSDNextParts EOF ;
    public final void entryRuleSDNextParts() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:154:1: ( ruleSDNextParts EOF )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:155:1: ruleSDNextParts EOF
            {
             before(grammarAccess.getSDNextPartsRule()); 
            pushFollow(FOLLOW_ruleSDNextParts_in_entryRuleSDNextParts260);
            ruleSDNextParts();

            state._fsp--;

             after(grammarAccess.getSDNextPartsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSDNextParts267); 

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
    // $ANTLR end "entryRuleSDNextParts"


    // $ANTLR start "ruleSDNextParts"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:162:1: ruleSDNextParts : ( ( rule__SDNextParts__Group__0 ) ) ;
    public final void ruleSDNextParts() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:166:2: ( ( ( rule__SDNextParts__Group__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:167:1: ( ( rule__SDNextParts__Group__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:167:1: ( ( rule__SDNextParts__Group__0 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:168:1: ( rule__SDNextParts__Group__0 )
            {
             before(grammarAccess.getSDNextPartsAccess().getGroup()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:169:1: ( rule__SDNextParts__Group__0 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:169:2: rule__SDNextParts__Group__0
            {
            pushFollow(FOLLOW_rule__SDNextParts__Group__0_in_ruleSDNextParts293);
            rule__SDNextParts__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSDNextPartsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSDNextParts"


    // $ANTLR start "entryRuleSDPartDependencies"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:181:1: entryRuleSDPartDependencies : ruleSDPartDependencies EOF ;
    public final void entryRuleSDPartDependencies() throws RecognitionException {
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:182:1: ( ruleSDPartDependencies EOF )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:183:1: ruleSDPartDependencies EOF
            {
             before(grammarAccess.getSDPartDependenciesRule()); 
            pushFollow(FOLLOW_ruleSDPartDependencies_in_entryRuleSDPartDependencies320);
            ruleSDPartDependencies();

            state._fsp--;

             after(grammarAccess.getSDPartDependenciesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSDPartDependencies327); 

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
    // $ANTLR end "entryRuleSDPartDependencies"


    // $ANTLR start "ruleSDPartDependencies"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:190:1: ruleSDPartDependencies : ( ( rule__SDPartDependencies__Group__0 ) ) ;
    public final void ruleSDPartDependencies() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:194:2: ( ( ( rule__SDPartDependencies__Group__0 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:195:1: ( ( rule__SDPartDependencies__Group__0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:195:1: ( ( rule__SDPartDependencies__Group__0 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:196:1: ( rule__SDPartDependencies__Group__0 )
            {
             before(grammarAccess.getSDPartDependenciesAccess().getGroup()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:197:1: ( rule__SDPartDependencies__Group__0 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:197:2: rule__SDPartDependencies__Group__0
            {
            pushFollow(FOLLOW_rule__SDPartDependencies__Group__0_in_ruleSDPartDependencies353);
            rule__SDPartDependencies__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSDPartDependenciesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSDPartDependencies"


    // $ANTLR start "rule__SDNextParts__Alternatives_4_0"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:209:1: rule__SDNextParts__Alternatives_4_0 : ( ( 'AND' ) | ( 'OR' ) );
    public final void rule__SDNextParts__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:213:1: ( ( 'AND' ) | ( 'OR' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:214:1: ( 'AND' )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:214:1: ( 'AND' )
                    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:215:1: 'AND'
                    {
                     before(grammarAccess.getSDNextPartsAccess().getANDKeyword_4_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__SDNextParts__Alternatives_4_0390); 
                     after(grammarAccess.getSDNextPartsAccess().getANDKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:222:6: ( 'OR' )
                    {
                    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:222:6: ( 'OR' )
                    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:223:1: 'OR'
                    {
                     before(grammarAccess.getSDNextPartsAccess().getORKeyword_4_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__SDNextParts__Alternatives_4_0410); 
                     after(grammarAccess.getSDNextPartsAccess().getORKeyword_4_0_1()); 

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
    // $ANTLR end "rule__SDNextParts__Alternatives_4_0"


    // $ANTLR start "rule__SurveyDependency__Group__0"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:239:1: rule__SurveyDependency__Group__0 : rule__SurveyDependency__Group__0__Impl rule__SurveyDependency__Group__1 ;
    public final void rule__SurveyDependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:243:1: ( rule__SurveyDependency__Group__0__Impl rule__SurveyDependency__Group__1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:244:2: rule__SurveyDependency__Group__0__Impl rule__SurveyDependency__Group__1
            {
            pushFollow(FOLLOW_rule__SurveyDependency__Group__0__Impl_in_rule__SurveyDependency__Group__0444);
            rule__SurveyDependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyDependency__Group__1_in_rule__SurveyDependency__Group__0447);
            rule__SurveyDependency__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyDependency__Group__0"


    // $ANTLR start "rule__SurveyDependency__Group__0__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:251:1: rule__SurveyDependency__Group__0__Impl : ( 'Survey:' ) ;
    public final void rule__SurveyDependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:255:1: ( ( 'Survey:' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:256:1: ( 'Survey:' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:256:1: ( 'Survey:' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:257:1: 'Survey:'
            {
             before(grammarAccess.getSurveyDependencyAccess().getSurveyKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__SurveyDependency__Group__0__Impl475); 
             after(grammarAccess.getSurveyDependencyAccess().getSurveyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyDependency__Group__0__Impl"


    // $ANTLR start "rule__SurveyDependency__Group__1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:270:1: rule__SurveyDependency__Group__1 : rule__SurveyDependency__Group__1__Impl rule__SurveyDependency__Group__2 ;
    public final void rule__SurveyDependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:274:1: ( rule__SurveyDependency__Group__1__Impl rule__SurveyDependency__Group__2 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:275:2: rule__SurveyDependency__Group__1__Impl rule__SurveyDependency__Group__2
            {
            pushFollow(FOLLOW_rule__SurveyDependency__Group__1__Impl_in_rule__SurveyDependency__Group__1506);
            rule__SurveyDependency__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyDependency__Group__2_in_rule__SurveyDependency__Group__1509);
            rule__SurveyDependency__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyDependency__Group__1"


    // $ANTLR start "rule__SurveyDependency__Group__1__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:282:1: rule__SurveyDependency__Group__1__Impl : ( ( rule__SurveyDependency__SurveyAssignment_1 ) ) ;
    public final void rule__SurveyDependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:286:1: ( ( ( rule__SurveyDependency__SurveyAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:287:1: ( ( rule__SurveyDependency__SurveyAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:287:1: ( ( rule__SurveyDependency__SurveyAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:288:1: ( rule__SurveyDependency__SurveyAssignment_1 )
            {
             before(grammarAccess.getSurveyDependencyAccess().getSurveyAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:289:1: ( rule__SurveyDependency__SurveyAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:289:2: rule__SurveyDependency__SurveyAssignment_1
            {
            pushFollow(FOLLOW_rule__SurveyDependency__SurveyAssignment_1_in_rule__SurveyDependency__Group__1__Impl536);
            rule__SurveyDependency__SurveyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyDependencyAccess().getSurveyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyDependency__Group__1__Impl"


    // $ANTLR start "rule__SurveyDependency__Group__2"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:299:1: rule__SurveyDependency__Group__2 : rule__SurveyDependency__Group__2__Impl rule__SurveyDependency__Group__3 ;
    public final void rule__SurveyDependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:303:1: ( rule__SurveyDependency__Group__2__Impl rule__SurveyDependency__Group__3 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:304:2: rule__SurveyDependency__Group__2__Impl rule__SurveyDependency__Group__3
            {
            pushFollow(FOLLOW_rule__SurveyDependency__Group__2__Impl_in_rule__SurveyDependency__Group__2566);
            rule__SurveyDependency__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyDependency__Group__3_in_rule__SurveyDependency__Group__2569);
            rule__SurveyDependency__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyDependency__Group__2"


    // $ANTLR start "rule__SurveyDependency__Group__2__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:311:1: rule__SurveyDependency__Group__2__Impl : ( '{' ) ;
    public final void rule__SurveyDependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:315:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:316:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:316:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:317:1: '{'
            {
             before(grammarAccess.getSurveyDependencyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__SurveyDependency__Group__2__Impl597); 
             after(grammarAccess.getSurveyDependencyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyDependency__Group__2__Impl"


    // $ANTLR start "rule__SurveyDependency__Group__3"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:330:1: rule__SurveyDependency__Group__3 : rule__SurveyDependency__Group__3__Impl rule__SurveyDependency__Group__4 ;
    public final void rule__SurveyDependency__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:334:1: ( rule__SurveyDependency__Group__3__Impl rule__SurveyDependency__Group__4 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:335:2: rule__SurveyDependency__Group__3__Impl rule__SurveyDependency__Group__4
            {
            pushFollow(FOLLOW_rule__SurveyDependency__Group__3__Impl_in_rule__SurveyDependency__Group__3628);
            rule__SurveyDependency__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SurveyDependency__Group__4_in_rule__SurveyDependency__Group__3631);
            rule__SurveyDependency__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyDependency__Group__3"


    // $ANTLR start "rule__SurveyDependency__Group__3__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:342:1: rule__SurveyDependency__Group__3__Impl : ( ( ( rule__SurveyDependency__PartAssignment_3 ) ) ( ( rule__SurveyDependency__PartAssignment_3 )* ) ) ;
    public final void rule__SurveyDependency__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:346:1: ( ( ( ( rule__SurveyDependency__PartAssignment_3 ) ) ( ( rule__SurveyDependency__PartAssignment_3 )* ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:347:1: ( ( ( rule__SurveyDependency__PartAssignment_3 ) ) ( ( rule__SurveyDependency__PartAssignment_3 )* ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:347:1: ( ( ( rule__SurveyDependency__PartAssignment_3 ) ) ( ( rule__SurveyDependency__PartAssignment_3 )* ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:348:1: ( ( rule__SurveyDependency__PartAssignment_3 ) ) ( ( rule__SurveyDependency__PartAssignment_3 )* )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:348:1: ( ( rule__SurveyDependency__PartAssignment_3 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:349:1: ( rule__SurveyDependency__PartAssignment_3 )
            {
             before(grammarAccess.getSurveyDependencyAccess().getPartAssignment_3()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:350:1: ( rule__SurveyDependency__PartAssignment_3 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:350:2: rule__SurveyDependency__PartAssignment_3
            {
            pushFollow(FOLLOW_rule__SurveyDependency__PartAssignment_3_in_rule__SurveyDependency__Group__3__Impl660);
            rule__SurveyDependency__PartAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSurveyDependencyAccess().getPartAssignment_3()); 

            }

            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:353:1: ( ( rule__SurveyDependency__PartAssignment_3 )* )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:354:1: ( rule__SurveyDependency__PartAssignment_3 )*
            {
             before(grammarAccess.getSurveyDependencyAccess().getPartAssignment_3()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:355:1: ( rule__SurveyDependency__PartAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:355:2: rule__SurveyDependency__PartAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SurveyDependency__PartAssignment_3_in_rule__SurveyDependency__Group__3__Impl672);
            	    rule__SurveyDependency__PartAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSurveyDependencyAccess().getPartAssignment_3()); 

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
    // $ANTLR end "rule__SurveyDependency__Group__3__Impl"


    // $ANTLR start "rule__SurveyDependency__Group__4"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:366:1: rule__SurveyDependency__Group__4 : rule__SurveyDependency__Group__4__Impl ;
    public final void rule__SurveyDependency__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:370:1: ( rule__SurveyDependency__Group__4__Impl )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:371:2: rule__SurveyDependency__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SurveyDependency__Group__4__Impl_in_rule__SurveyDependency__Group__4705);
            rule__SurveyDependency__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyDependency__Group__4"


    // $ANTLR start "rule__SurveyDependency__Group__4__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:377:1: rule__SurveyDependency__Group__4__Impl : ( '}' ) ;
    public final void rule__SurveyDependency__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:381:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:382:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:382:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:383:1: '}'
            {
             before(grammarAccess.getSurveyDependencyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__SurveyDependency__Group__4__Impl733); 
             after(grammarAccess.getSurveyDependencyAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyDependency__Group__4__Impl"


    // $ANTLR start "rule__SDPart__Group__0"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:406:1: rule__SDPart__Group__0 : rule__SDPart__Group__0__Impl rule__SDPart__Group__1 ;
    public final void rule__SDPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:410:1: ( rule__SDPart__Group__0__Impl rule__SDPart__Group__1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:411:2: rule__SDPart__Group__0__Impl rule__SDPart__Group__1
            {
            pushFollow(FOLLOW_rule__SDPart__Group__0__Impl_in_rule__SDPart__Group__0774);
            rule__SDPart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDPart__Group__1_in_rule__SDPart__Group__0777);
            rule__SDPart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__Group__0"


    // $ANTLR start "rule__SDPart__Group__0__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:418:1: rule__SDPart__Group__0__Impl : ( 'Part:' ) ;
    public final void rule__SDPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:422:1: ( ( 'Part:' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:423:1: ( 'Part:' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:423:1: ( 'Part:' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:424:1: 'Part:'
            {
             before(grammarAccess.getSDPartAccess().getPartKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__SDPart__Group__0__Impl805); 
             after(grammarAccess.getSDPartAccess().getPartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__Group__0__Impl"


    // $ANTLR start "rule__SDPart__Group__1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:437:1: rule__SDPart__Group__1 : rule__SDPart__Group__1__Impl rule__SDPart__Group__2 ;
    public final void rule__SDPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:441:1: ( rule__SDPart__Group__1__Impl rule__SDPart__Group__2 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:442:2: rule__SDPart__Group__1__Impl rule__SDPart__Group__2
            {
            pushFollow(FOLLOW_rule__SDPart__Group__1__Impl_in_rule__SDPart__Group__1836);
            rule__SDPart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDPart__Group__2_in_rule__SDPart__Group__1839);
            rule__SDPart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__Group__1"


    // $ANTLR start "rule__SDPart__Group__1__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:449:1: rule__SDPart__Group__1__Impl : ( ( rule__SDPart__Part2Assignment_1 ) ) ;
    public final void rule__SDPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:453:1: ( ( ( rule__SDPart__Part2Assignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:454:1: ( ( rule__SDPart__Part2Assignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:454:1: ( ( rule__SDPart__Part2Assignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:455:1: ( rule__SDPart__Part2Assignment_1 )
            {
             before(grammarAccess.getSDPartAccess().getPart2Assignment_1()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:456:1: ( rule__SDPart__Part2Assignment_1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:456:2: rule__SDPart__Part2Assignment_1
            {
            pushFollow(FOLLOW_rule__SDPart__Part2Assignment_1_in_rule__SDPart__Group__1__Impl866);
            rule__SDPart__Part2Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSDPartAccess().getPart2Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__Group__1__Impl"


    // $ANTLR start "rule__SDPart__Group__2"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:466:1: rule__SDPart__Group__2 : rule__SDPart__Group__2__Impl rule__SDPart__Group__3 ;
    public final void rule__SDPart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:470:1: ( rule__SDPart__Group__2__Impl rule__SDPart__Group__3 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:471:2: rule__SDPart__Group__2__Impl rule__SDPart__Group__3
            {
            pushFollow(FOLLOW_rule__SDPart__Group__2__Impl_in_rule__SDPart__Group__2896);
            rule__SDPart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDPart__Group__3_in_rule__SDPart__Group__2899);
            rule__SDPart__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__Group__2"


    // $ANTLR start "rule__SDPart__Group__2__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:478:1: rule__SDPart__Group__2__Impl : ( '{' ) ;
    public final void rule__SDPart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:482:1: ( ( '{' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:483:1: ( '{' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:483:1: ( '{' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:484:1: '{'
            {
             before(grammarAccess.getSDPartAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__SDPart__Group__2__Impl927); 
             after(grammarAccess.getSDPartAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__Group__2__Impl"


    // $ANTLR start "rule__SDPart__Group__3"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:497:1: rule__SDPart__Group__3 : rule__SDPart__Group__3__Impl rule__SDPart__Group__4 ;
    public final void rule__SDPart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:501:1: ( rule__SDPart__Group__3__Impl rule__SDPart__Group__4 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:502:2: rule__SDPart__Group__3__Impl rule__SDPart__Group__4
            {
            pushFollow(FOLLOW_rule__SDPart__Group__3__Impl_in_rule__SDPart__Group__3958);
            rule__SDPart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDPart__Group__4_in_rule__SDPart__Group__3961);
            rule__SDPart__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__Group__3"


    // $ANTLR start "rule__SDPart__Group__3__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:509:1: rule__SDPart__Group__3__Impl : ( 'Next part (default):' ) ;
    public final void rule__SDPart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:513:1: ( ( 'Next part (default):' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:514:1: ( 'Next part (default):' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:514:1: ( 'Next part (default):' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:515:1: 'Next part (default):'
            {
             before(grammarAccess.getSDPartAccess().getNextPartDefaultKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__SDPart__Group__3__Impl989); 
             after(grammarAccess.getSDPartAccess().getNextPartDefaultKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__Group__3__Impl"


    // $ANTLR start "rule__SDPart__Group__4"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:528:1: rule__SDPart__Group__4 : rule__SDPart__Group__4__Impl rule__SDPart__Group__5 ;
    public final void rule__SDPart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:532:1: ( rule__SDPart__Group__4__Impl rule__SDPart__Group__5 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:533:2: rule__SDPart__Group__4__Impl rule__SDPart__Group__5
            {
            pushFollow(FOLLOW_rule__SDPart__Group__4__Impl_in_rule__SDPart__Group__41020);
            rule__SDPart__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDPart__Group__5_in_rule__SDPart__Group__41023);
            rule__SDPart__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__Group__4"


    // $ANTLR start "rule__SDPart__Group__4__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:540:1: rule__SDPart__Group__4__Impl : ( ( rule__SDPart__DefaultNextPartAssignment_4 ) ) ;
    public final void rule__SDPart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:544:1: ( ( ( rule__SDPart__DefaultNextPartAssignment_4 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:545:1: ( ( rule__SDPart__DefaultNextPartAssignment_4 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:545:1: ( ( rule__SDPart__DefaultNextPartAssignment_4 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:546:1: ( rule__SDPart__DefaultNextPartAssignment_4 )
            {
             before(grammarAccess.getSDPartAccess().getDefaultNextPartAssignment_4()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:547:1: ( rule__SDPart__DefaultNextPartAssignment_4 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:547:2: rule__SDPart__DefaultNextPartAssignment_4
            {
            pushFollow(FOLLOW_rule__SDPart__DefaultNextPartAssignment_4_in_rule__SDPart__Group__4__Impl1050);
            rule__SDPart__DefaultNextPartAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSDPartAccess().getDefaultNextPartAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__Group__4__Impl"


    // $ANTLR start "rule__SDPart__Group__5"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:557:1: rule__SDPart__Group__5 : rule__SDPart__Group__5__Impl rule__SDPart__Group__6 ;
    public final void rule__SDPart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:561:1: ( rule__SDPart__Group__5__Impl rule__SDPart__Group__6 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:562:2: rule__SDPart__Group__5__Impl rule__SDPart__Group__6
            {
            pushFollow(FOLLOW_rule__SDPart__Group__5__Impl_in_rule__SDPart__Group__51080);
            rule__SDPart__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDPart__Group__6_in_rule__SDPart__Group__51083);
            rule__SDPart__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__Group__5"


    // $ANTLR start "rule__SDPart__Group__5__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:569:1: rule__SDPart__Group__5__Impl : ( ( rule__SDPart__Group_5__0 )? ) ;
    public final void rule__SDPart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:573:1: ( ( ( rule__SDPart__Group_5__0 )? ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:574:1: ( ( rule__SDPart__Group_5__0 )? )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:574:1: ( ( rule__SDPart__Group_5__0 )? )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:575:1: ( rule__SDPart__Group_5__0 )?
            {
             before(grammarAccess.getSDPartAccess().getGroup_5()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:576:1: ( rule__SDPart__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:576:2: rule__SDPart__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__SDPart__Group_5__0_in_rule__SDPart__Group__5__Impl1110);
                    rule__SDPart__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSDPartAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__Group__5__Impl"


    // $ANTLR start "rule__SDPart__Group__6"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:586:1: rule__SDPart__Group__6 : rule__SDPart__Group__6__Impl ;
    public final void rule__SDPart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:590:1: ( rule__SDPart__Group__6__Impl )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:591:2: rule__SDPart__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__SDPart__Group__6__Impl_in_rule__SDPart__Group__61141);
            rule__SDPart__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__Group__6"


    // $ANTLR start "rule__SDPart__Group__6__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:597:1: rule__SDPart__Group__6__Impl : ( '}' ) ;
    public final void rule__SDPart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:601:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:602:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:602:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:603:1: '}'
            {
             before(grammarAccess.getSDPartAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_15_in_rule__SDPart__Group__6__Impl1169); 
             after(grammarAccess.getSDPartAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__Group__6__Impl"


    // $ANTLR start "rule__SDPart__Group_5__0"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:630:1: rule__SDPart__Group_5__0 : rule__SDPart__Group_5__0__Impl rule__SDPart__Group_5__1 ;
    public final void rule__SDPart__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:634:1: ( rule__SDPart__Group_5__0__Impl rule__SDPart__Group_5__1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:635:2: rule__SDPart__Group_5__0__Impl rule__SDPart__Group_5__1
            {
            pushFollow(FOLLOW_rule__SDPart__Group_5__0__Impl_in_rule__SDPart__Group_5__01214);
            rule__SDPart__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDPart__Group_5__1_in_rule__SDPart__Group_5__01217);
            rule__SDPart__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__Group_5__0"


    // $ANTLR start "rule__SDPart__Group_5__0__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:642:1: rule__SDPart__Group_5__0__Impl : ( 'Next parts {' ) ;
    public final void rule__SDPart__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:646:1: ( ( 'Next parts {' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:647:1: ( 'Next parts {' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:647:1: ( 'Next parts {' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:648:1: 'Next parts {'
            {
             before(grammarAccess.getSDPartAccess().getNextPartsKeyword_5_0()); 
            match(input,18,FOLLOW_18_in_rule__SDPart__Group_5__0__Impl1245); 
             after(grammarAccess.getSDPartAccess().getNextPartsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__Group_5__0__Impl"


    // $ANTLR start "rule__SDPart__Group_5__1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:661:1: rule__SDPart__Group_5__1 : rule__SDPart__Group_5__1__Impl rule__SDPart__Group_5__2 ;
    public final void rule__SDPart__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:665:1: ( rule__SDPart__Group_5__1__Impl rule__SDPart__Group_5__2 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:666:2: rule__SDPart__Group_5__1__Impl rule__SDPart__Group_5__2
            {
            pushFollow(FOLLOW_rule__SDPart__Group_5__1__Impl_in_rule__SDPart__Group_5__11276);
            rule__SDPart__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDPart__Group_5__2_in_rule__SDPart__Group_5__11279);
            rule__SDPart__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__Group_5__1"


    // $ANTLR start "rule__SDPart__Group_5__1__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:673:1: rule__SDPart__Group_5__1__Impl : ( ( rule__SDPart__NextPartsAssignment_5_1 )* ) ;
    public final void rule__SDPart__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:677:1: ( ( ( rule__SDPart__NextPartsAssignment_5_1 )* ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:678:1: ( ( rule__SDPart__NextPartsAssignment_5_1 )* )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:678:1: ( ( rule__SDPart__NextPartsAssignment_5_1 )* )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:679:1: ( rule__SDPart__NextPartsAssignment_5_1 )*
            {
             before(grammarAccess.getSDPartAccess().getNextPartsAssignment_5_1()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:680:1: ( rule__SDPart__NextPartsAssignment_5_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:680:2: rule__SDPart__NextPartsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__SDPart__NextPartsAssignment_5_1_in_rule__SDPart__Group_5__1__Impl1306);
            	    rule__SDPart__NextPartsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSDPartAccess().getNextPartsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__Group_5__1__Impl"


    // $ANTLR start "rule__SDPart__Group_5__2"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:690:1: rule__SDPart__Group_5__2 : rule__SDPart__Group_5__2__Impl ;
    public final void rule__SDPart__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:694:1: ( rule__SDPart__Group_5__2__Impl )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:695:2: rule__SDPart__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__SDPart__Group_5__2__Impl_in_rule__SDPart__Group_5__21337);
            rule__SDPart__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__Group_5__2"


    // $ANTLR start "rule__SDPart__Group_5__2__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:701:1: rule__SDPart__Group_5__2__Impl : ( '}' ) ;
    public final void rule__SDPart__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:705:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:706:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:706:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:707:1: '}'
            {
             before(grammarAccess.getSDPartAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,15,FOLLOW_15_in_rule__SDPart__Group_5__2__Impl1365); 
             after(grammarAccess.getSDPartAccess().getRightCurlyBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__Group_5__2__Impl"


    // $ANTLR start "rule__SDNextParts__Group__0"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:726:1: rule__SDNextParts__Group__0 : rule__SDNextParts__Group__0__Impl rule__SDNextParts__Group__1 ;
    public final void rule__SDNextParts__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:730:1: ( rule__SDNextParts__Group__0__Impl rule__SDNextParts__Group__1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:731:2: rule__SDNextParts__Group__0__Impl rule__SDNextParts__Group__1
            {
            pushFollow(FOLLOW_rule__SDNextParts__Group__0__Impl_in_rule__SDNextParts__Group__01402);
            rule__SDNextParts__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDNextParts__Group__1_in_rule__SDNextParts__Group__01405);
            rule__SDNextParts__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDNextParts__Group__0"


    // $ANTLR start "rule__SDNextParts__Group__0__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:738:1: rule__SDNextParts__Group__0__Impl : ( 'Next part:' ) ;
    public final void rule__SDNextParts__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:742:1: ( ( 'Next part:' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:743:1: ( 'Next part:' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:743:1: ( 'Next part:' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:744:1: 'Next part:'
            {
             before(grammarAccess.getSDNextPartsAccess().getNextPartKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__SDNextParts__Group__0__Impl1433); 
             after(grammarAccess.getSDNextPartsAccess().getNextPartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDNextParts__Group__0__Impl"


    // $ANTLR start "rule__SDNextParts__Group__1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:757:1: rule__SDNextParts__Group__1 : rule__SDNextParts__Group__1__Impl rule__SDNextParts__Group__2 ;
    public final void rule__SDNextParts__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:761:1: ( rule__SDNextParts__Group__1__Impl rule__SDNextParts__Group__2 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:762:2: rule__SDNextParts__Group__1__Impl rule__SDNextParts__Group__2
            {
            pushFollow(FOLLOW_rule__SDNextParts__Group__1__Impl_in_rule__SDNextParts__Group__11464);
            rule__SDNextParts__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDNextParts__Group__2_in_rule__SDNextParts__Group__11467);
            rule__SDNextParts__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDNextParts__Group__1"


    // $ANTLR start "rule__SDNextParts__Group__1__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:769:1: rule__SDNextParts__Group__1__Impl : ( ( rule__SDNextParts__NextPartAssignment_1 ) ) ;
    public final void rule__SDNextParts__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:773:1: ( ( ( rule__SDNextParts__NextPartAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:774:1: ( ( rule__SDNextParts__NextPartAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:774:1: ( ( rule__SDNextParts__NextPartAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:775:1: ( rule__SDNextParts__NextPartAssignment_1 )
            {
             before(grammarAccess.getSDNextPartsAccess().getNextPartAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:776:1: ( rule__SDNextParts__NextPartAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:776:2: rule__SDNextParts__NextPartAssignment_1
            {
            pushFollow(FOLLOW_rule__SDNextParts__NextPartAssignment_1_in_rule__SDNextParts__Group__1__Impl1494);
            rule__SDNextParts__NextPartAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSDNextPartsAccess().getNextPartAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDNextParts__Group__1__Impl"


    // $ANTLR start "rule__SDNextParts__Group__2"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:786:1: rule__SDNextParts__Group__2 : rule__SDNextParts__Group__2__Impl rule__SDNextParts__Group__3 ;
    public final void rule__SDNextParts__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:790:1: ( rule__SDNextParts__Group__2__Impl rule__SDNextParts__Group__3 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:791:2: rule__SDNextParts__Group__2__Impl rule__SDNextParts__Group__3
            {
            pushFollow(FOLLOW_rule__SDNextParts__Group__2__Impl_in_rule__SDNextParts__Group__21524);
            rule__SDNextParts__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDNextParts__Group__3_in_rule__SDNextParts__Group__21527);
            rule__SDNextParts__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDNextParts__Group__2"


    // $ANTLR start "rule__SDNextParts__Group__2__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:798:1: rule__SDNextParts__Group__2__Impl : ( 'Part dependencies {' ) ;
    public final void rule__SDNextParts__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:802:1: ( ( 'Part dependencies {' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:803:1: ( 'Part dependencies {' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:803:1: ( 'Part dependencies {' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:804:1: 'Part dependencies {'
            {
             before(grammarAccess.getSDNextPartsAccess().getPartDependenciesKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__SDNextParts__Group__2__Impl1555); 
             after(grammarAccess.getSDNextPartsAccess().getPartDependenciesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDNextParts__Group__2__Impl"


    // $ANTLR start "rule__SDNextParts__Group__3"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:817:1: rule__SDNextParts__Group__3 : rule__SDNextParts__Group__3__Impl rule__SDNextParts__Group__4 ;
    public final void rule__SDNextParts__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:821:1: ( rule__SDNextParts__Group__3__Impl rule__SDNextParts__Group__4 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:822:2: rule__SDNextParts__Group__3__Impl rule__SDNextParts__Group__4
            {
            pushFollow(FOLLOW_rule__SDNextParts__Group__3__Impl_in_rule__SDNextParts__Group__31586);
            rule__SDNextParts__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDNextParts__Group__4_in_rule__SDNextParts__Group__31589);
            rule__SDNextParts__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDNextParts__Group__3"


    // $ANTLR start "rule__SDNextParts__Group__3__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:829:1: rule__SDNextParts__Group__3__Impl : ( ( rule__SDNextParts__PartDependenciesAssignment_3 ) ) ;
    public final void rule__SDNextParts__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:833:1: ( ( ( rule__SDNextParts__PartDependenciesAssignment_3 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:834:1: ( ( rule__SDNextParts__PartDependenciesAssignment_3 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:834:1: ( ( rule__SDNextParts__PartDependenciesAssignment_3 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:835:1: ( rule__SDNextParts__PartDependenciesAssignment_3 )
            {
             before(grammarAccess.getSDNextPartsAccess().getPartDependenciesAssignment_3()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:836:1: ( rule__SDNextParts__PartDependenciesAssignment_3 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:836:2: rule__SDNextParts__PartDependenciesAssignment_3
            {
            pushFollow(FOLLOW_rule__SDNextParts__PartDependenciesAssignment_3_in_rule__SDNextParts__Group__3__Impl1616);
            rule__SDNextParts__PartDependenciesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSDNextPartsAccess().getPartDependenciesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDNextParts__Group__3__Impl"


    // $ANTLR start "rule__SDNextParts__Group__4"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:846:1: rule__SDNextParts__Group__4 : rule__SDNextParts__Group__4__Impl rule__SDNextParts__Group__5 ;
    public final void rule__SDNextParts__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:850:1: ( rule__SDNextParts__Group__4__Impl rule__SDNextParts__Group__5 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:851:2: rule__SDNextParts__Group__4__Impl rule__SDNextParts__Group__5
            {
            pushFollow(FOLLOW_rule__SDNextParts__Group__4__Impl_in_rule__SDNextParts__Group__41646);
            rule__SDNextParts__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDNextParts__Group__5_in_rule__SDNextParts__Group__41649);
            rule__SDNextParts__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDNextParts__Group__4"


    // $ANTLR start "rule__SDNextParts__Group__4__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:858:1: rule__SDNextParts__Group__4__Impl : ( ( rule__SDNextParts__Group_4__0 )* ) ;
    public final void rule__SDNextParts__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:862:1: ( ( ( rule__SDNextParts__Group_4__0 )* ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:863:1: ( ( rule__SDNextParts__Group_4__0 )* )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:863:1: ( ( rule__SDNextParts__Group_4__0 )* )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:864:1: ( rule__SDNextParts__Group_4__0 )*
            {
             before(grammarAccess.getSDNextPartsAccess().getGroup_4()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:865:1: ( rule__SDNextParts__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=11 && LA6_0<=12)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:865:2: rule__SDNextParts__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__SDNextParts__Group_4__0_in_rule__SDNextParts__Group__4__Impl1676);
            	    rule__SDNextParts__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSDNextPartsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDNextParts__Group__4__Impl"


    // $ANTLR start "rule__SDNextParts__Group__5"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:875:1: rule__SDNextParts__Group__5 : rule__SDNextParts__Group__5__Impl ;
    public final void rule__SDNextParts__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:879:1: ( rule__SDNextParts__Group__5__Impl )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:880:2: rule__SDNextParts__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SDNextParts__Group__5__Impl_in_rule__SDNextParts__Group__51707);
            rule__SDNextParts__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDNextParts__Group__5"


    // $ANTLR start "rule__SDNextParts__Group__5__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:886:1: rule__SDNextParts__Group__5__Impl : ( '}' ) ;
    public final void rule__SDNextParts__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:890:1: ( ( '}' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:891:1: ( '}' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:891:1: ( '}' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:892:1: '}'
            {
             before(grammarAccess.getSDNextPartsAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__SDNextParts__Group__5__Impl1735); 
             after(grammarAccess.getSDNextPartsAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDNextParts__Group__5__Impl"


    // $ANTLR start "rule__SDNextParts__Group_4__0"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:917:1: rule__SDNextParts__Group_4__0 : rule__SDNextParts__Group_4__0__Impl rule__SDNextParts__Group_4__1 ;
    public final void rule__SDNextParts__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:921:1: ( rule__SDNextParts__Group_4__0__Impl rule__SDNextParts__Group_4__1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:922:2: rule__SDNextParts__Group_4__0__Impl rule__SDNextParts__Group_4__1
            {
            pushFollow(FOLLOW_rule__SDNextParts__Group_4__0__Impl_in_rule__SDNextParts__Group_4__01778);
            rule__SDNextParts__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDNextParts__Group_4__1_in_rule__SDNextParts__Group_4__01781);
            rule__SDNextParts__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDNextParts__Group_4__0"


    // $ANTLR start "rule__SDNextParts__Group_4__0__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:929:1: rule__SDNextParts__Group_4__0__Impl : ( ( rule__SDNextParts__Alternatives_4_0 ) ) ;
    public final void rule__SDNextParts__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:933:1: ( ( ( rule__SDNextParts__Alternatives_4_0 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:934:1: ( ( rule__SDNextParts__Alternatives_4_0 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:934:1: ( ( rule__SDNextParts__Alternatives_4_0 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:935:1: ( rule__SDNextParts__Alternatives_4_0 )
            {
             before(grammarAccess.getSDNextPartsAccess().getAlternatives_4_0()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:936:1: ( rule__SDNextParts__Alternatives_4_0 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:936:2: rule__SDNextParts__Alternatives_4_0
            {
            pushFollow(FOLLOW_rule__SDNextParts__Alternatives_4_0_in_rule__SDNextParts__Group_4__0__Impl1808);
            rule__SDNextParts__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getSDNextPartsAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDNextParts__Group_4__0__Impl"


    // $ANTLR start "rule__SDNextParts__Group_4__1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:946:1: rule__SDNextParts__Group_4__1 : rule__SDNextParts__Group_4__1__Impl ;
    public final void rule__SDNextParts__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:950:1: ( rule__SDNextParts__Group_4__1__Impl )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:951:2: rule__SDNextParts__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SDNextParts__Group_4__1__Impl_in_rule__SDNextParts__Group_4__11838);
            rule__SDNextParts__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDNextParts__Group_4__1"


    // $ANTLR start "rule__SDNextParts__Group_4__1__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:957:1: rule__SDNextParts__Group_4__1__Impl : ( ( rule__SDNextParts__PartDependenciesAssignment_4_1 ) ) ;
    public final void rule__SDNextParts__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:961:1: ( ( ( rule__SDNextParts__PartDependenciesAssignment_4_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:962:1: ( ( rule__SDNextParts__PartDependenciesAssignment_4_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:962:1: ( ( rule__SDNextParts__PartDependenciesAssignment_4_1 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:963:1: ( rule__SDNextParts__PartDependenciesAssignment_4_1 )
            {
             before(grammarAccess.getSDNextPartsAccess().getPartDependenciesAssignment_4_1()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:964:1: ( rule__SDNextParts__PartDependenciesAssignment_4_1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:964:2: rule__SDNextParts__PartDependenciesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SDNextParts__PartDependenciesAssignment_4_1_in_rule__SDNextParts__Group_4__1__Impl1865);
            rule__SDNextParts__PartDependenciesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSDNextPartsAccess().getPartDependenciesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDNextParts__Group_4__1__Impl"


    // $ANTLR start "rule__SDPartDependencies__Group__0"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:978:1: rule__SDPartDependencies__Group__0 : rule__SDPartDependencies__Group__0__Impl rule__SDPartDependencies__Group__1 ;
    public final void rule__SDPartDependencies__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:982:1: ( rule__SDPartDependencies__Group__0__Impl rule__SDPartDependencies__Group__1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:983:2: rule__SDPartDependencies__Group__0__Impl rule__SDPartDependencies__Group__1
            {
            pushFollow(FOLLOW_rule__SDPartDependencies__Group__0__Impl_in_rule__SDPartDependencies__Group__01899);
            rule__SDPartDependencies__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDPartDependencies__Group__1_in_rule__SDPartDependencies__Group__01902);
            rule__SDPartDependencies__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPartDependencies__Group__0"


    // $ANTLR start "rule__SDPartDependencies__Group__0__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:990:1: rule__SDPartDependencies__Group__0__Impl : ( 'Question:' ) ;
    public final void rule__SDPartDependencies__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:994:1: ( ( 'Question:' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:995:1: ( 'Question:' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:995:1: ( 'Question:' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:996:1: 'Question:'
            {
             before(grammarAccess.getSDPartDependenciesAccess().getQuestionKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__SDPartDependencies__Group__0__Impl1930); 
             after(grammarAccess.getSDPartDependenciesAccess().getQuestionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPartDependencies__Group__0__Impl"


    // $ANTLR start "rule__SDPartDependencies__Group__1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1009:1: rule__SDPartDependencies__Group__1 : rule__SDPartDependencies__Group__1__Impl rule__SDPartDependencies__Group__2 ;
    public final void rule__SDPartDependencies__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1013:1: ( rule__SDPartDependencies__Group__1__Impl rule__SDPartDependencies__Group__2 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1014:2: rule__SDPartDependencies__Group__1__Impl rule__SDPartDependencies__Group__2
            {
            pushFollow(FOLLOW_rule__SDPartDependencies__Group__1__Impl_in_rule__SDPartDependencies__Group__11961);
            rule__SDPartDependencies__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDPartDependencies__Group__2_in_rule__SDPartDependencies__Group__11964);
            rule__SDPartDependencies__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPartDependencies__Group__1"


    // $ANTLR start "rule__SDPartDependencies__Group__1__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1021:1: rule__SDPartDependencies__Group__1__Impl : ( ( rule__SDPartDependencies__QuestionAssignment_1 ) ) ;
    public final void rule__SDPartDependencies__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1025:1: ( ( ( rule__SDPartDependencies__QuestionAssignment_1 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1026:1: ( ( rule__SDPartDependencies__QuestionAssignment_1 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1026:1: ( ( rule__SDPartDependencies__QuestionAssignment_1 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1027:1: ( rule__SDPartDependencies__QuestionAssignment_1 )
            {
             before(grammarAccess.getSDPartDependenciesAccess().getQuestionAssignment_1()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1028:1: ( rule__SDPartDependencies__QuestionAssignment_1 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1028:2: rule__SDPartDependencies__QuestionAssignment_1
            {
            pushFollow(FOLLOW_rule__SDPartDependencies__QuestionAssignment_1_in_rule__SDPartDependencies__Group__1__Impl1991);
            rule__SDPartDependencies__QuestionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSDPartDependenciesAccess().getQuestionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPartDependencies__Group__1__Impl"


    // $ANTLR start "rule__SDPartDependencies__Group__2"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1038:1: rule__SDPartDependencies__Group__2 : rule__SDPartDependencies__Group__2__Impl rule__SDPartDependencies__Group__3 ;
    public final void rule__SDPartDependencies__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1042:1: ( rule__SDPartDependencies__Group__2__Impl rule__SDPartDependencies__Group__3 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1043:2: rule__SDPartDependencies__Group__2__Impl rule__SDPartDependencies__Group__3
            {
            pushFollow(FOLLOW_rule__SDPartDependencies__Group__2__Impl_in_rule__SDPartDependencies__Group__22021);
            rule__SDPartDependencies__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDPartDependencies__Group__3_in_rule__SDPartDependencies__Group__22024);
            rule__SDPartDependencies__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPartDependencies__Group__2"


    // $ANTLR start "rule__SDPartDependencies__Group__2__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1050:1: rule__SDPartDependencies__Group__2__Impl : ( 'Answer:' ) ;
    public final void rule__SDPartDependencies__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1054:1: ( ( 'Answer:' ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1055:1: ( 'Answer:' )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1055:1: ( 'Answer:' )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1056:1: 'Answer:'
            {
             before(grammarAccess.getSDPartDependenciesAccess().getAnswerKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__SDPartDependencies__Group__2__Impl2052); 
             after(grammarAccess.getSDPartDependenciesAccess().getAnswerKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPartDependencies__Group__2__Impl"


    // $ANTLR start "rule__SDPartDependencies__Group__3"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1069:1: rule__SDPartDependencies__Group__3 : rule__SDPartDependencies__Group__3__Impl ;
    public final void rule__SDPartDependencies__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1073:1: ( rule__SDPartDependencies__Group__3__Impl )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1074:2: rule__SDPartDependencies__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SDPartDependencies__Group__3__Impl_in_rule__SDPartDependencies__Group__32083);
            rule__SDPartDependencies__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPartDependencies__Group__3"


    // $ANTLR start "rule__SDPartDependencies__Group__3__Impl"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1080:1: rule__SDPartDependencies__Group__3__Impl : ( ( rule__SDPartDependencies__AnswerAssignment_3 ) ) ;
    public final void rule__SDPartDependencies__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1084:1: ( ( ( rule__SDPartDependencies__AnswerAssignment_3 ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1085:1: ( ( rule__SDPartDependencies__AnswerAssignment_3 ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1085:1: ( ( rule__SDPartDependencies__AnswerAssignment_3 ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1086:1: ( rule__SDPartDependencies__AnswerAssignment_3 )
            {
             before(grammarAccess.getSDPartDependenciesAccess().getAnswerAssignment_3()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1087:1: ( rule__SDPartDependencies__AnswerAssignment_3 )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1087:2: rule__SDPartDependencies__AnswerAssignment_3
            {
            pushFollow(FOLLOW_rule__SDPartDependencies__AnswerAssignment_3_in_rule__SDPartDependencies__Group__3__Impl2110);
            rule__SDPartDependencies__AnswerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSDPartDependenciesAccess().getAnswerAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPartDependencies__Group__3__Impl"


    // $ANTLR start "rule__SurveyDependencies__SurveyDependencyAssignment"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1106:1: rule__SurveyDependencies__SurveyDependencyAssignment : ( ruleSurveyDependency ) ;
    public final void rule__SurveyDependencies__SurveyDependencyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1110:1: ( ( ruleSurveyDependency ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1111:1: ( ruleSurveyDependency )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1111:1: ( ruleSurveyDependency )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1112:1: ruleSurveyDependency
            {
             before(grammarAccess.getSurveyDependenciesAccess().getSurveyDependencySurveyDependencyParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSurveyDependency_in_rule__SurveyDependencies__SurveyDependencyAssignment2153);
            ruleSurveyDependency();

            state._fsp--;

             after(grammarAccess.getSurveyDependenciesAccess().getSurveyDependencySurveyDependencyParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyDependencies__SurveyDependencyAssignment"


    // $ANTLR start "rule__SurveyDependency__SurveyAssignment_1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1121:1: rule__SurveyDependency__SurveyAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__SurveyDependency__SurveyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1125:1: ( ( ( RULE_STRING ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1126:1: ( ( RULE_STRING ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1126:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1127:1: ( RULE_STRING )
            {
             before(grammarAccess.getSurveyDependencyAccess().getSurveyQuestionnaireCrossReference_1_0()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1128:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1129:1: RULE_STRING
            {
             before(grammarAccess.getSurveyDependencyAccess().getSurveyQuestionnaireSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SurveyDependency__SurveyAssignment_12188); 
             after(grammarAccess.getSurveyDependencyAccess().getSurveyQuestionnaireSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSurveyDependencyAccess().getSurveyQuestionnaireCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyDependency__SurveyAssignment_1"


    // $ANTLR start "rule__SurveyDependency__PartAssignment_3"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1140:1: rule__SurveyDependency__PartAssignment_3 : ( ruleSDPart ) ;
    public final void rule__SurveyDependency__PartAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1144:1: ( ( ruleSDPart ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1145:1: ( ruleSDPart )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1145:1: ( ruleSDPart )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1146:1: ruleSDPart
            {
             before(grammarAccess.getSurveyDependencyAccess().getPartSDPartParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSDPart_in_rule__SurveyDependency__PartAssignment_32223);
            ruleSDPart();

            state._fsp--;

             after(grammarAccess.getSurveyDependencyAccess().getPartSDPartParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurveyDependency__PartAssignment_3"


    // $ANTLR start "rule__SDPart__Part2Assignment_1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1155:1: rule__SDPart__Part2Assignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__SDPart__Part2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1159:1: ( ( ( RULE_STRING ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1160:1: ( ( RULE_STRING ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1160:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1161:1: ( RULE_STRING )
            {
             before(grammarAccess.getSDPartAccess().getPart2PartCrossReference_1_0()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1162:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1163:1: RULE_STRING
            {
             before(grammarAccess.getSDPartAccess().getPart2PartSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SDPart__Part2Assignment_12258); 
             after(grammarAccess.getSDPartAccess().getPart2PartSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSDPartAccess().getPart2PartCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__Part2Assignment_1"


    // $ANTLR start "rule__SDPart__DefaultNextPartAssignment_4"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1174:1: rule__SDPart__DefaultNextPartAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__SDPart__DefaultNextPartAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1178:1: ( ( ( RULE_STRING ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1179:1: ( ( RULE_STRING ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1179:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1180:1: ( RULE_STRING )
            {
             before(grammarAccess.getSDPartAccess().getDefaultNextPartPartCrossReference_4_0()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1181:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1182:1: RULE_STRING
            {
             before(grammarAccess.getSDPartAccess().getDefaultNextPartPartSTRINGTerminalRuleCall_4_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SDPart__DefaultNextPartAssignment_42297); 
             after(grammarAccess.getSDPartAccess().getDefaultNextPartPartSTRINGTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSDPartAccess().getDefaultNextPartPartCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__DefaultNextPartAssignment_4"


    // $ANTLR start "rule__SDPart__NextPartsAssignment_5_1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1193:1: rule__SDPart__NextPartsAssignment_5_1 : ( ruleSDNextParts ) ;
    public final void rule__SDPart__NextPartsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1197:1: ( ( ruleSDNextParts ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1198:1: ( ruleSDNextParts )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1198:1: ( ruleSDNextParts )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1199:1: ruleSDNextParts
            {
             before(grammarAccess.getSDPartAccess().getNextPartsSDNextPartsParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleSDNextParts_in_rule__SDPart__NextPartsAssignment_5_12332);
            ruleSDNextParts();

            state._fsp--;

             after(grammarAccess.getSDPartAccess().getNextPartsSDNextPartsParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPart__NextPartsAssignment_5_1"


    // $ANTLR start "rule__SDNextParts__NextPartAssignment_1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1208:1: rule__SDNextParts__NextPartAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__SDNextParts__NextPartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1212:1: ( ( ( RULE_STRING ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1213:1: ( ( RULE_STRING ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1213:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1214:1: ( RULE_STRING )
            {
             before(grammarAccess.getSDNextPartsAccess().getNextPartPartCrossReference_1_0()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1215:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1216:1: RULE_STRING
            {
             before(grammarAccess.getSDNextPartsAccess().getNextPartPartSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SDNextParts__NextPartAssignment_12367); 
             after(grammarAccess.getSDNextPartsAccess().getNextPartPartSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSDNextPartsAccess().getNextPartPartCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDNextParts__NextPartAssignment_1"


    // $ANTLR start "rule__SDNextParts__PartDependenciesAssignment_3"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1227:1: rule__SDNextParts__PartDependenciesAssignment_3 : ( ruleSDPartDependencies ) ;
    public final void rule__SDNextParts__PartDependenciesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1231:1: ( ( ruleSDPartDependencies ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1232:1: ( ruleSDPartDependencies )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1232:1: ( ruleSDPartDependencies )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1233:1: ruleSDPartDependencies
            {
             before(grammarAccess.getSDNextPartsAccess().getPartDependenciesSDPartDependenciesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSDPartDependencies_in_rule__SDNextParts__PartDependenciesAssignment_32402);
            ruleSDPartDependencies();

            state._fsp--;

             after(grammarAccess.getSDNextPartsAccess().getPartDependenciesSDPartDependenciesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDNextParts__PartDependenciesAssignment_3"


    // $ANTLR start "rule__SDNextParts__PartDependenciesAssignment_4_1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1242:1: rule__SDNextParts__PartDependenciesAssignment_4_1 : ( ruleSDPartDependencies ) ;
    public final void rule__SDNextParts__PartDependenciesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1246:1: ( ( ruleSDPartDependencies ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1247:1: ( ruleSDPartDependencies )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1247:1: ( ruleSDPartDependencies )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1248:1: ruleSDPartDependencies
            {
             before(grammarAccess.getSDNextPartsAccess().getPartDependenciesSDPartDependenciesParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSDPartDependencies_in_rule__SDNextParts__PartDependenciesAssignment_4_12433);
            ruleSDPartDependencies();

            state._fsp--;

             after(grammarAccess.getSDNextPartsAccess().getPartDependenciesSDPartDependenciesParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDNextParts__PartDependenciesAssignment_4_1"


    // $ANTLR start "rule__SDPartDependencies__QuestionAssignment_1"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1257:1: rule__SDPartDependencies__QuestionAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__SDPartDependencies__QuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1261:1: ( ( ( RULE_STRING ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1262:1: ( ( RULE_STRING ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1262:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1263:1: ( RULE_STRING )
            {
             before(grammarAccess.getSDPartDependenciesAccess().getQuestionQuestionCrossReference_1_0()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1264:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1265:1: RULE_STRING
            {
             before(grammarAccess.getSDPartDependenciesAccess().getQuestionQuestionSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SDPartDependencies__QuestionAssignment_12468); 
             after(grammarAccess.getSDPartDependenciesAccess().getQuestionQuestionSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSDPartDependenciesAccess().getQuestionQuestionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPartDependencies__QuestionAssignment_1"


    // $ANTLR start "rule__SDPartDependencies__AnswerAssignment_3"
    // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1276:1: rule__SDPartDependencies__AnswerAssignment_3 : ( ( RULE_STRING ) ) ;
    public final void rule__SDPartDependencies__AnswerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1280:1: ( ( ( RULE_STRING ) ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1281:1: ( ( RULE_STRING ) )
            {
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1281:1: ( ( RULE_STRING ) )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1282:1: ( RULE_STRING )
            {
             before(grammarAccess.getSDPartDependenciesAccess().getAnswerAnswerCrossReference_3_0()); 
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1283:1: ( RULE_STRING )
            // ../de.nordakademie.mwi13a.team1.dependency.ui/src-gen/de/nordakademie/mwi13a/team1/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1284:1: RULE_STRING
            {
             before(grammarAccess.getSDPartDependenciesAccess().getAnswerAnswerSTRINGTerminalRuleCall_3_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SDPartDependencies__AnswerAssignment_32507); 
             after(grammarAccess.getSDPartDependenciesAccess().getAnswerAnswerSTRINGTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSDPartDependenciesAccess().getAnswerAnswerCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDPartDependencies__AnswerAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSurveyDependencies_in_entryRuleSurveyDependencies61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurveyDependencies68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyDependencies__SurveyDependencyAssignment_in_ruleSurveyDependencies96 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__SurveyDependencies__SurveyDependencyAssignment_in_ruleSurveyDependencies108 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleSurveyDependency_in_entryRuleSurveyDependency140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurveyDependency147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyDependency__Group__0_in_ruleSurveyDependency173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDPart_in_entryRuleSDPart200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSDPart207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDPart__Group__0_in_ruleSDPart233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDNextParts_in_entryRuleSDNextParts260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSDNextParts267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDNextParts__Group__0_in_ruleSDNextParts293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDPartDependencies_in_entryRuleSDPartDependencies320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSDPartDependencies327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDPartDependencies__Group__0_in_ruleSDPartDependencies353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SDNextParts__Alternatives_4_0390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SDNextParts__Alternatives_4_0410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyDependency__Group__0__Impl_in_rule__SurveyDependency__Group__0444 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SurveyDependency__Group__1_in_rule__SurveyDependency__Group__0447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SurveyDependency__Group__0__Impl475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyDependency__Group__1__Impl_in_rule__SurveyDependency__Group__1506 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SurveyDependency__Group__2_in_rule__SurveyDependency__Group__1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyDependency__SurveyAssignment_1_in_rule__SurveyDependency__Group__1__Impl536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyDependency__Group__2__Impl_in_rule__SurveyDependency__Group__2566 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SurveyDependency__Group__3_in_rule__SurveyDependency__Group__2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SurveyDependency__Group__2__Impl597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyDependency__Group__3__Impl_in_rule__SurveyDependency__Group__3628 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__SurveyDependency__Group__4_in_rule__SurveyDependency__Group__3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SurveyDependency__PartAssignment_3_in_rule__SurveyDependency__Group__3__Impl660 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__SurveyDependency__PartAssignment_3_in_rule__SurveyDependency__Group__3__Impl672 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__SurveyDependency__Group__4__Impl_in_rule__SurveyDependency__Group__4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SurveyDependency__Group__4__Impl733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDPart__Group__0__Impl_in_rule__SDPart__Group__0774 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SDPart__Group__1_in_rule__SDPart__Group__0777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SDPart__Group__0__Impl805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDPart__Group__1__Impl_in_rule__SDPart__Group__1836 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SDPart__Group__2_in_rule__SDPart__Group__1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDPart__Part2Assignment_1_in_rule__SDPart__Group__1__Impl866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDPart__Group__2__Impl_in_rule__SDPart__Group__2896 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SDPart__Group__3_in_rule__SDPart__Group__2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SDPart__Group__2__Impl927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDPart__Group__3__Impl_in_rule__SDPart__Group__3958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SDPart__Group__4_in_rule__SDPart__Group__3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SDPart__Group__3__Impl989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDPart__Group__4__Impl_in_rule__SDPart__Group__41020 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_rule__SDPart__Group__5_in_rule__SDPart__Group__41023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDPart__DefaultNextPartAssignment_4_in_rule__SDPart__Group__4__Impl1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDPart__Group__5__Impl_in_rule__SDPart__Group__51080 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_rule__SDPart__Group__6_in_rule__SDPart__Group__51083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDPart__Group_5__0_in_rule__SDPart__Group__5__Impl1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDPart__Group__6__Impl_in_rule__SDPart__Group__61141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SDPart__Group__6__Impl1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDPart__Group_5__0__Impl_in_rule__SDPart__Group_5__01214 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_rule__SDPart__Group_5__1_in_rule__SDPart__Group_5__01217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SDPart__Group_5__0__Impl1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDPart__Group_5__1__Impl_in_rule__SDPart__Group_5__11276 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_rule__SDPart__Group_5__2_in_rule__SDPart__Group_5__11279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDPart__NextPartsAssignment_5_1_in_rule__SDPart__Group_5__1__Impl1306 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__SDPart__Group_5__2__Impl_in_rule__SDPart__Group_5__21337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SDPart__Group_5__2__Impl1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDNextParts__Group__0__Impl_in_rule__SDNextParts__Group__01402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SDNextParts__Group__1_in_rule__SDNextParts__Group__01405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SDNextParts__Group__0__Impl1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDNextParts__Group__1__Impl_in_rule__SDNextParts__Group__11464 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SDNextParts__Group__2_in_rule__SDNextParts__Group__11467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDNextParts__NextPartAssignment_1_in_rule__SDNextParts__Group__1__Impl1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDNextParts__Group__2__Impl_in_rule__SDNextParts__Group__21524 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__SDNextParts__Group__3_in_rule__SDNextParts__Group__21527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SDNextParts__Group__2__Impl1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDNextParts__Group__3__Impl_in_rule__SDNextParts__Group__31586 = new BitSet(new long[]{0x0000000000009800L});
    public static final BitSet FOLLOW_rule__SDNextParts__Group__4_in_rule__SDNextParts__Group__31589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDNextParts__PartDependenciesAssignment_3_in_rule__SDNextParts__Group__3__Impl1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDNextParts__Group__4__Impl_in_rule__SDNextParts__Group__41646 = new BitSet(new long[]{0x0000000000009800L});
    public static final BitSet FOLLOW_rule__SDNextParts__Group__5_in_rule__SDNextParts__Group__41649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDNextParts__Group_4__0_in_rule__SDNextParts__Group__4__Impl1676 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__SDNextParts__Group__5__Impl_in_rule__SDNextParts__Group__51707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SDNextParts__Group__5__Impl1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDNextParts__Group_4__0__Impl_in_rule__SDNextParts__Group_4__01778 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__SDNextParts__Group_4__1_in_rule__SDNextParts__Group_4__01781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDNextParts__Alternatives_4_0_in_rule__SDNextParts__Group_4__0__Impl1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDNextParts__Group_4__1__Impl_in_rule__SDNextParts__Group_4__11838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDNextParts__PartDependenciesAssignment_4_1_in_rule__SDNextParts__Group_4__1__Impl1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDPartDependencies__Group__0__Impl_in_rule__SDPartDependencies__Group__01899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SDPartDependencies__Group__1_in_rule__SDPartDependencies__Group__01902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SDPartDependencies__Group__0__Impl1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDPartDependencies__Group__1__Impl_in_rule__SDPartDependencies__Group__11961 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SDPartDependencies__Group__2_in_rule__SDPartDependencies__Group__11964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDPartDependencies__QuestionAssignment_1_in_rule__SDPartDependencies__Group__1__Impl1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDPartDependencies__Group__2__Impl_in_rule__SDPartDependencies__Group__22021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SDPartDependencies__Group__3_in_rule__SDPartDependencies__Group__22024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SDPartDependencies__Group__2__Impl2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDPartDependencies__Group__3__Impl_in_rule__SDPartDependencies__Group__32083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDPartDependencies__AnswerAssignment_3_in_rule__SDPartDependencies__Group__3__Impl2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSurveyDependency_in_rule__SurveyDependencies__SurveyDependencyAssignment2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SurveyDependency__SurveyAssignment_12188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDPart_in_rule__SurveyDependency__PartAssignment_32223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SDPart__Part2Assignment_12258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SDPart__DefaultNextPartAssignment_42297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDNextParts_in_rule__SDPart__NextPartsAssignment_5_12332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SDNextParts__NextPartAssignment_12367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDPartDependencies_in_rule__SDNextParts__PartDependenciesAssignment_32402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDPartDependencies_in_rule__SDNextParts__PartDependenciesAssignment_4_12433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SDPartDependencies__QuestionAssignment_12468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SDPartDependencies__AnswerAssignment_32507 = new BitSet(new long[]{0x0000000000000002L});

}