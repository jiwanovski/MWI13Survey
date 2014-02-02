/*
* generated by Xtext
*/
grammar InternalDependency;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package de.nordakademie.mwi13a.team1.dependency.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleDependencyModel
entryRuleDependencyModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDependencyModelRule()); }
	 iv_ruleDependencyModel=ruleDependencyModel 
	 { $current=$iv_ruleDependencyModel.current; } 
	 EOF 
;

// Rule DependencyModel
ruleDependencyModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getDependencyModelAccess().getElementsSurveyElementsParserRuleCall_0()); 
	    }
		lv_elements_0_0=ruleSurveyElements		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDependencyModelRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_0_0, 
        		"SurveyElements");
	        afterParserOrEnumRuleCall();
	    }

)
)+
;





// Entry rule entryRuleSurveyElements
entryRuleSurveyElements returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSurveyElementsRule()); }
	 iv_ruleSurveyElements=ruleSurveyElements 
	 { $current=$iv_ruleSurveyElements.current; } 
	 EOF 
;

// Rule SurveyElements
ruleSurveyElements returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Survey:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSurveyElementsAccess().getSurveyKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getSurveyElementsRule());
	        }
        }
	otherlv_1=RULE_STRING
	{
		newLeafNode(otherlv_1, grammarAccess.getSurveyElementsAccess().getNameQuestionnaireCrossReference_1_0()); 
	}

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSurveyElementsAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSurveyElementsAccess().getPartElementsPartElementsParserRuleCall_3_0()); 
	    }
		lv_partElements_3_0=rulePartElements		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSurveyElementsRule());
	        }
       		add(
       			$current, 
       			"partElements",
        		lv_partElements_3_0, 
        		"PartElements");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getSurveyElementsAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRulePartElements
entryRulePartElements returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPartElementsRule()); }
	 iv_rulePartElements=rulePartElements 
	 { $current=$iv_rulePartElements.current; } 
	 EOF 
;

// Rule PartElements
rulePartElements returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Part:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPartElementsAccess().getPartKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPartElementsRule());
	        }
        }
	otherlv_1=RULE_STRING
	{
		newLeafNode(otherlv_1, grammarAccess.getPartElementsAccess().getNamePartCrossReference_1_0()); 
	}

)
)(	otherlv_2='Next parts {' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPartElementsAccess().getNextPartsKeyword_2_0());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getPartElementsAccess().getNextPartsDMNextPartsParserRuleCall_2_1_0_0()); 
	    }
		lv_nextParts_3_0=ruleDMNextParts		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPartElementsRule());
	        }
       		add(
       			$current, 
       			"nextParts",
        		lv_nextParts_3_0, 
        		"DMNextParts");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4='OR' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPartElementsAccess().getORKeyword_2_1_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPartElementsAccess().getNextPartsDMNextPartsParserRuleCall_2_1_1_1_0()); 
	    }
		lv_nextParts_5_0=ruleDMNextParts		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPartElementsRule());
	        }
       		add(
       			$current, 
       			"nextParts",
        		lv_nextParts_5_0, 
        		"DMNextParts");
	        afterParserOrEnumRuleCall();
	    }

)
))*)	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getPartElementsAccess().getRightCurlyBracketKeyword_2_2());
    }
)+)
;





// Entry rule entryRuleDMNextParts
entryRuleDMNextParts returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDMNextPartsRule()); }
	 iv_ruleDMNextParts=ruleDMNextParts 
	 { $current=$iv_ruleDMNextParts.current; } 
	 EOF 
;

// Rule DMNextParts
ruleDMNextParts returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Next part:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDMNextPartsAccess().getNextPartKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDMNextPartsRule());
	        }
        }
	otherlv_1=RULE_STRING
	{
		newLeafNode(otherlv_1, grammarAccess.getDMNextPartsAccess().getNamePartCrossReference_1_0()); 
	}

)
)(	otherlv_2='Part dependencies' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDMNextPartsAccess().getPartDependenciesKeyword_2_0());
    }
	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getDMNextPartsAccess().getLeftCurlyBracketKeyword_2_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDMNextPartsAccess().getExpressionsDependencyParserRuleCall_2_2_0()); 
	    }
		lv_expressions_4_0=ruleDependency		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDMNextPartsRule());
	        }
       		add(
       			$current, 
       			"expressions",
        		lv_expressions_4_0, 
        		"Dependency");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getDMNextPartsAccess().getRightCurlyBracketKeyword_2_3());
    }
)?)
;





// Entry rule entryRuleDependency
entryRuleDependency returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDependencyRule()); }
	 iv_ruleDependency=ruleDependency 
	 { $current=$iv_ruleDependency.current; } 
	 EOF 
;

// Rule Dependency
ruleDependency returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getDependencyAccess().getOrParserRuleCall()); 
    }
    this_Or_0=ruleOr
    { 
        $current = $this_Or_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleOr
entryRuleOr returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOrRule()); }
	 iv_ruleOr=ruleOr 
	 { $current=$iv_ruleOr.current; } 
	 EOF 
;

// Rule Or
ruleOr returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
    }
    this_And_0=ruleAnd
    { 
        $current = $this_And_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            $current);
    }
)	otherlv_2='OR' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleAnd		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOrRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"And");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleAnd
entryRuleAnd returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAndRule()); }
	 iv_ruleAnd=ruleAnd 
	 { $current=$iv_ruleAnd.current; } 
	 EOF 
;

// Rule And
ruleAnd returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAndAccess().getPrimaryParserRuleCall_0()); 
    }
    this_Primary_0=rulePrimary
    { 
        $current = $this_Primary_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            $current);
    }
)	otherlv_2='AND' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAndAccess().getRightPrimaryParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=rulePrimary		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAndRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"Primary");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	 iv_rulePrimary=rulePrimary 
	 { $current=$iv_rulePrimary.current; } 
	 EOF 
;

// Rule Primary
rulePrimary returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
    }

    { 
        newCompositeNode(grammarAccess.getPrimaryAccess().getDependencyParserRuleCall_0_1()); 
    }
    this_Dependency_1=ruleDependency
    { 
        $current = $this_Dependency_1.current; 
        afterParserOrEnumRuleCall();
    }
	otherlv_2=')' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
    }
)
    |
    { 
        newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_1()); 
    }
    this_Atomic_3=ruleAtomic
    { 
        $current = $this_Atomic_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleAtomic
entryRuleAtomic returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtomicRule()); }
	 iv_ruleAtomic=ruleAtomic 
	 { $current=$iv_ruleAtomic.current; } 
	 EOF 
;

// Rule Atomic
ruleAtomic returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAtomicAccess().getDMQuestionAction_0(),
            $current);
    }
)	otherlv_1='Question:' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAtomicAccess().getQuestionKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicRule());
	        }
        }
	otherlv_2=RULE_STRING
	{
		newLeafNode(otherlv_2, grammarAccess.getAtomicAccess().getQuestionQuestionCrossReference_2_0()); 
	}

)
)	otherlv_3='Answer:' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAtomicAccess().getAnswerKeyword_3());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicRule());
	        }
        }
	otherlv_4=RULE_STRING
	{
		newLeafNode(otherlv_4, grammarAccess.getAtomicAccess().getAnswerAnswerCrossReference_4_0()); 
	}

)
))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


