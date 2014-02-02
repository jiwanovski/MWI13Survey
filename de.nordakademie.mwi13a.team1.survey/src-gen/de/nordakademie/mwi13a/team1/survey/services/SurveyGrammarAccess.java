/*
* generated by Xtext
*/
package de.nordakademie.mwi13a.team1.survey.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SurveyGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class SurveyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Survey");
		private final Assignment cQuestionnaireAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cQuestionnaireQuestionnaireParserRuleCall_0 = (RuleCall)cQuestionnaireAssignment.eContents().get(0);
		
		/// *Root element Survey* / Survey:
		//	questionnaire+=Questionnaire+;
		public ParserRule getRule() { return rule; }

		//questionnaire+=Questionnaire+
		public Assignment getQuestionnaireAssignment() { return cQuestionnaireAssignment; }

		//Questionnaire
		public RuleCall getQuestionnaireQuestionnaireParserRuleCall_0() { return cQuestionnaireQuestionnaireParserRuleCall_0; }
	}

	public class QuestionnaireElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Questionnaire");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuestionnaireKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cQuestionnaireIDKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdIdentifierParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Assignment cPartAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cPartPartParserRuleCall_5_0 = (RuleCall)cPartAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		/// *A Questionnaire must contain at least 1 Part* / Questionnaire:
		//	"Questionnaire:" name=STRING "{" "Questionnaire-ID:" id=Identifier part+=Part+ "}";
		public ParserRule getRule() { return rule; }

		//"Questionnaire:" name=STRING "{" "Questionnaire-ID:" id=Identifier part+=Part+ "}"
		public Group getGroup() { return cGroup; }

		//"Questionnaire:"
		public Keyword getQuestionnaireKeyword_0() { return cQuestionnaireKeyword_0; }

		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"Questionnaire-ID:"
		public Keyword getQuestionnaireIDKeyword_3() { return cQuestionnaireIDKeyword_3; }

		//id=Identifier
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }

		//Identifier
		public RuleCall getIdIdentifierParserRuleCall_4_0() { return cIdIdentifierParserRuleCall_4_0; }

		//part+=Part+
		public Assignment getPartAssignment_5() { return cPartAssignment_5; }

		//Part
		public RuleCall getPartPartParserRuleCall_5_0() { return cPartPartParserRuleCall_5_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class PartElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Part");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPartKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cPartIDKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdIdentifierParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Assignment cQuestionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cQuestionQuestionParserRuleCall_5_0 = (RuleCall)cQuestionAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		/// *A Part must contain at least 1 Question* / Part:
		//	"Part:" name=STRING "{" "Part-ID:" id=Identifier question+=Question+ "}";
		public ParserRule getRule() { return rule; }

		//"Part:" name=STRING "{" "Part-ID:" id=Identifier question+=Question+ "}"
		public Group getGroup() { return cGroup; }

		//"Part:"
		public Keyword getPartKeyword_0() { return cPartKeyword_0; }

		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"Part-ID:"
		public Keyword getPartIDKeyword_3() { return cPartIDKeyword_3; }

		//id=Identifier
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }

		//Identifier
		public RuleCall getIdIdentifierParserRuleCall_4_0() { return cIdIdentifierParserRuleCall_4_0; }

		//question+=Question+
		public Assignment getQuestionAssignment_5() { return cQuestionAssignment_5; }

		//Question
		public RuleCall getQuestionQuestionParserRuleCall_5_0() { return cQuestionQuestionParserRuleCall_5_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class QuestionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Question");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuestionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cQuestionIDKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdIdentifierParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Assignment cMandatoryAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final Keyword cMandatoryMandatoryFieldKeyword_5_0 = (Keyword)cMandatoryAssignment_5.eContents().get(0);
		private final Keyword cTypeKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cQuestionTypeAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cQuestionTypeSurveyTerminalTypesParserRuleCall_7_0 = (RuleCall)cQuestionTypeAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		/// *For each Question will be defined a type and wether it's a mandatory field or not* / Question:
		//	"Question:" name=STRING "{" "Question-ID:" id=Identifier mandatory?="Mandatory Field"? "Type:" questionType= //(dropdown+=DropDown | combobox=ComboBoxT | radio+=Radio | matrix+=Matrix | textln+=TextLn | textbl+=TextBl)
		//	SurveyTerminalTypes / *For each Question can be defined an arbitraty number of Answers. 
		//		 *The Question Types TextLn and TextBl don't require any answers because there's an STRING expected by default.* / "}";
		public ParserRule getRule() { return rule; }

		//"Question:" name=STRING "{" "Question-ID:" id=Identifier mandatory?="Mandatory Field"? "Type:" questionType= //(dropdown+=DropDown | combobox=ComboBoxT | radio+=Radio | matrix+=Matrix | textln+=TextLn | textbl+=TextBl)
		//SurveyTerminalTypes / *For each Question can be defined an arbitraty number of Answers. 
		//		 *The Question Types TextLn and TextBl don't require any answers because there's an STRING expected by default.* / "}"
		public Group getGroup() { return cGroup; }

		//"Question:"
		public Keyword getQuestionKeyword_0() { return cQuestionKeyword_0; }

		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"Question-ID:"
		public Keyword getQuestionIDKeyword_3() { return cQuestionIDKeyword_3; }

		//id=Identifier
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }

		//Identifier
		public RuleCall getIdIdentifierParserRuleCall_4_0() { return cIdIdentifierParserRuleCall_4_0; }

		//mandatory?="Mandatory Field"?
		public Assignment getMandatoryAssignment_5() { return cMandatoryAssignment_5; }

		//"Mandatory Field"
		public Keyword getMandatoryMandatoryFieldKeyword_5_0() { return cMandatoryMandatoryFieldKeyword_5_0; }

		//"Type:"
		public Keyword getTypeKeyword_6() { return cTypeKeyword_6; }

		//questionType= //(dropdown+=DropDown | combobox=ComboBoxT | radio+=Radio | matrix+=Matrix | textln+=TextLn | textbl+=TextBl)
		//SurveyTerminalTypes
		public Assignment getQuestionTypeAssignment_7() { return cQuestionTypeAssignment_7; }

		////(dropdown+=DropDown | combobox=ComboBoxT | radio+=Radio | matrix+=Matrix | textln+=TextLn | textbl+=TextBl)
		//SurveyTerminalTypes
		public RuleCall getQuestionTypeSurveyTerminalTypesParserRuleCall_7_0() { return cQuestionTypeSurveyTerminalTypesParserRuleCall_7_0; }

		/// *For each Question can be defined an arbitraty number of Answers. 
		//		 *The Question Types TextLn and TextBl don't require any answers because there's an STRING expected by default.* / "}"
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}

	public class MatrixQuestionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MatrixQuestion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuestionIDKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdIdentifierParserRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		private final Keyword cQuestionKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameSTRINGTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		
		//MatrixQuestion:
		//	"Question-ID:" id=Identifier "Question:" name=STRING;
		public ParserRule getRule() { return rule; }

		//"Question-ID:" id=Identifier "Question:" name=STRING
		public Group getGroup() { return cGroup; }

		//"Question-ID:"
		public Keyword getQuestionIDKeyword_0() { return cQuestionIDKeyword_0; }

		//id=Identifier
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }

		//Identifier
		public RuleCall getIdIdentifierParserRuleCall_1_0() { return cIdIdentifierParserRuleCall_1_0; }

		//"Question:"
		public Keyword getQuestionKeyword_2() { return cQuestionKeyword_2; }

		//name=STRING
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_3_0() { return cNameSTRINGTerminalRuleCall_3_0; }
	}

	public class AnswerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Answer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAnswerIDKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdIdentifierParserRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		private final Keyword cAnswerKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameSTRINGTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		
		//Answer:
		//	"Answer-ID:" id=Identifier "Answer:" name=STRING;
		public ParserRule getRule() { return rule; }

		//"Answer-ID:" id=Identifier "Answer:" name=STRING
		public Group getGroup() { return cGroup; }

		//"Answer-ID:"
		public Keyword getAnswerIDKeyword_0() { return cAnswerIDKeyword_0; }

		//id=Identifier
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }

		//Identifier
		public RuleCall getIdIdentifierParserRuleCall_1_0() { return cIdIdentifierParserRuleCall_1_0; }

		//"Answer:"
		public Keyword getAnswerKeyword_2() { return cAnswerKeyword_2; }

		//name=STRING
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_3_0() { return cNameSTRINGTerminalRuleCall_3_0; }
	}

	public class SurveyTerminalTypesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SurveyTerminalTypes");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cTextLineAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cNameAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final Keyword cNameTextLineKeyword_0_1_0 = (Keyword)cNameAssignment_0_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Assignment cLengthAssignment_0_3 = (Assignment)cGroup_0.eContents().get(3);
		private final RuleCall cLengthINTTerminalRuleCall_0_3_0 = (RuleCall)cLengthAssignment_0_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_4 = (Keyword)cGroup_0.eContents().get(4);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cTextBlockAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Keyword cNameTextBlockKeyword_1_1_0 = (Keyword)cNameAssignment_1_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cLengthAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cLengthINTTerminalRuleCall_1_3_0 = (RuleCall)cLengthAssignment_1_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_4 = (Keyword)cGroup_1.eContents().get(4);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cMatrixAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Assignment cNameAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final Keyword cNameMatrixKeyword_2_1_0 = (Keyword)cNameAssignment_2_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Keyword cScaleKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_2_4 = (Keyword)cGroup_2.eContents().get(4);
		private final RuleCall cIdentifierParserRuleCall_2_5 = (RuleCall)cGroup_2.eContents().get(5);
		private final Group cGroup_2_6 = (Group)cGroup_2.eContents().get(6);
		private final Keyword cVerticalLineKeyword_2_6_0 = (Keyword)cGroup_2_6.eContents().get(0);
		private final RuleCall cIdentifierParserRuleCall_2_6_1 = (RuleCall)cGroup_2_6.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2_7 = (Keyword)cGroup_2.eContents().get(7);
		private final Keyword cQuestionsKeyword_2_8 = (Keyword)cGroup_2.eContents().get(8);
		private final Keyword cLeftParenthesisKeyword_2_9 = (Keyword)cGroup_2.eContents().get(9);
		private final Assignment cMatrixQuestionAssignment_2_10 = (Assignment)cGroup_2.eContents().get(10);
		private final RuleCall cMatrixQuestionMatrixQuestionParserRuleCall_2_10_0 = (RuleCall)cMatrixQuestionAssignment_2_10.eContents().get(0);
		private final Group cGroup_2_11 = (Group)cGroup_2.eContents().get(11);
		private final Keyword cVerticalLineKeyword_2_11_0 = (Keyword)cGroup_2_11.eContents().get(0);
		private final Assignment cMatrixQuestionAssignment_2_11_1 = (Assignment)cGroup_2_11.eContents().get(1);
		private final RuleCall cMatrixQuestionMatrixQuestionParserRuleCall_2_11_1_0 = (RuleCall)cMatrixQuestionAssignment_2_11_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_12 = (Keyword)cGroup_2.eContents().get(12);
		private final Keyword cRightCurlyBracketKeyword_2_13 = (Keyword)cGroup_2.eContents().get(13);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cComboBoxAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Assignment cNameAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final Keyword cNameComboBoxKeyword_3_1_0 = (Keyword)cNameAssignment_3_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Assignment cAnswerAssignment_3_3 = (Assignment)cGroup_3.eContents().get(3);
		private final RuleCall cAnswerAnswerParserRuleCall_3_3_0 = (RuleCall)cAnswerAssignment_3_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_4 = (Keyword)cGroup_3.eContents().get(4);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Action cDropDownAction_4_0 = (Action)cGroup_4.eContents().get(0);
		private final Assignment cNameAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final Keyword cNameDropDownKeyword_4_1_0 = (Keyword)cNameAssignment_4_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Assignment cAnswerAssignment_4_3 = (Assignment)cGroup_4.eContents().get(3);
		private final RuleCall cAnswerAnswerParserRuleCall_4_3_0 = (RuleCall)cAnswerAssignment_4_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Action cRadioAction_5_0 = (Action)cGroup_5.eContents().get(0);
		private final Assignment cNameAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final Keyword cNameRadioKeyword_5_1_0 = (Keyword)cNameAssignment_5_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_2 = (Keyword)cGroup_5.eContents().get(2);
		private final Assignment cAnswerAssignment_5_3 = (Assignment)cGroup_5.eContents().get(3);
		private final RuleCall cAnswerAnswerParserRuleCall_5_3_0 = (RuleCall)cAnswerAssignment_5_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		
		//SurveyTerminalTypes:
		//	{TextLine} name="TextLine" "(" length=INT ")" | {TextBlock} name="TextBlock" "(" length=INT ")" | {Matrix}
		//	name="Matrix" "{" "Scale:" "(" Identifier ("|" Identifier)* ")" "Questions:" "(" matrixQuestion+=MatrixQuestion ("|"
		//	matrixQuestion+=MatrixQuestion)* ")" "}" | {ComboBox} name="ComboBox" "{" answer+=Answer+ "}" | {DropDown}
		//	name="DropDown" "{" answer+=Answer+ "}" | {Radio} name="Radio" "{" answer+=Answer+ "}";
		public ParserRule getRule() { return rule; }

		//{TextLine} name="TextLine" "(" length=INT ")" | {TextBlock} name="TextBlock" "(" length=INT ")" | {Matrix} name="Matrix"
		//"{" "Scale:" "(" Identifier ("|" Identifier)* ")" "Questions:" "(" matrixQuestion+=MatrixQuestion ("|"
		//matrixQuestion+=MatrixQuestion)* ")" "}" | {ComboBox} name="ComboBox" "{" answer+=Answer+ "}" | {DropDown}
		//name="DropDown" "{" answer+=Answer+ "}" | {Radio} name="Radio" "{" answer+=Answer+ "}"
		public Alternatives getAlternatives() { return cAlternatives; }

		//{TextLine} name="TextLine" "(" length=INT ")"
		public Group getGroup_0() { return cGroup_0; }

		//{TextLine}
		public Action getTextLineAction_0_0() { return cTextLineAction_0_0; }

		//name="TextLine"
		public Assignment getNameAssignment_0_1() { return cNameAssignment_0_1; }

		//"TextLine"
		public Keyword getNameTextLineKeyword_0_1_0() { return cNameTextLineKeyword_0_1_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_0_2() { return cLeftParenthesisKeyword_0_2; }

		//length=INT
		public Assignment getLengthAssignment_0_3() { return cLengthAssignment_0_3; }

		//INT
		public RuleCall getLengthINTTerminalRuleCall_0_3_0() { return cLengthINTTerminalRuleCall_0_3_0; }

		//")"
		public Keyword getRightParenthesisKeyword_0_4() { return cRightParenthesisKeyword_0_4; }

		//{TextBlock} name="TextBlock" "(" length=INT ")"
		public Group getGroup_1() { return cGroup_1; }

		//{TextBlock}
		public Action getTextBlockAction_1_0() { return cTextBlockAction_1_0; }

		//name="TextBlock"
		public Assignment getNameAssignment_1_1() { return cNameAssignment_1_1; }

		//"TextBlock"
		public Keyword getNameTextBlockKeyword_1_1_0() { return cNameTextBlockKeyword_1_1_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1_2() { return cLeftParenthesisKeyword_1_2; }

		//length=INT
		public Assignment getLengthAssignment_1_3() { return cLengthAssignment_1_3; }

		//INT
		public RuleCall getLengthINTTerminalRuleCall_1_3_0() { return cLengthINTTerminalRuleCall_1_3_0; }

		//")"
		public Keyword getRightParenthesisKeyword_1_4() { return cRightParenthesisKeyword_1_4; }

		//{Matrix} name="Matrix" "{" "Scale:" "(" Identifier ("|" Identifier)* ")" "Questions:" "(" matrixQuestion+=MatrixQuestion
		//("|" matrixQuestion+=MatrixQuestion)* ")" "}"
		public Group getGroup_2() { return cGroup_2; }

		//{Matrix}
		public Action getMatrixAction_2_0() { return cMatrixAction_2_0; }

		//name="Matrix"
		public Assignment getNameAssignment_2_1() { return cNameAssignment_2_1; }

		//"Matrix"
		public Keyword getNameMatrixKeyword_2_1_0() { return cNameMatrixKeyword_2_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2_2() { return cLeftCurlyBracketKeyword_2_2; }

		//"Scale:"
		public Keyword getScaleKeyword_2_3() { return cScaleKeyword_2_3; }

		//"("
		public Keyword getLeftParenthesisKeyword_2_4() { return cLeftParenthesisKeyword_2_4; }

		//Identifier
		public RuleCall getIdentifierParserRuleCall_2_5() { return cIdentifierParserRuleCall_2_5; }

		//("|" Identifier)*
		public Group getGroup_2_6() { return cGroup_2_6; }

		//"|"
		public Keyword getVerticalLineKeyword_2_6_0() { return cVerticalLineKeyword_2_6_0; }

		//Identifier
		public RuleCall getIdentifierParserRuleCall_2_6_1() { return cIdentifierParserRuleCall_2_6_1; }

		//")"
		public Keyword getRightParenthesisKeyword_2_7() { return cRightParenthesisKeyword_2_7; }

		//"Questions:"
		public Keyword getQuestionsKeyword_2_8() { return cQuestionsKeyword_2_8; }

		//"("
		public Keyword getLeftParenthesisKeyword_2_9() { return cLeftParenthesisKeyword_2_9; }

		//matrixQuestion+=MatrixQuestion
		public Assignment getMatrixQuestionAssignment_2_10() { return cMatrixQuestionAssignment_2_10; }

		//MatrixQuestion
		public RuleCall getMatrixQuestionMatrixQuestionParserRuleCall_2_10_0() { return cMatrixQuestionMatrixQuestionParserRuleCall_2_10_0; }

		//("|" matrixQuestion+=MatrixQuestion)*
		public Group getGroup_2_11() { return cGroup_2_11; }

		//"|"
		public Keyword getVerticalLineKeyword_2_11_0() { return cVerticalLineKeyword_2_11_0; }

		//matrixQuestion+=MatrixQuestion
		public Assignment getMatrixQuestionAssignment_2_11_1() { return cMatrixQuestionAssignment_2_11_1; }

		//MatrixQuestion
		public RuleCall getMatrixQuestionMatrixQuestionParserRuleCall_2_11_1_0() { return cMatrixQuestionMatrixQuestionParserRuleCall_2_11_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_2_12() { return cRightParenthesisKeyword_2_12; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_2_13() { return cRightCurlyBracketKeyword_2_13; }

		//{ComboBox} name="ComboBox" "{" answer+=Answer+ "}"
		public Group getGroup_3() { return cGroup_3; }

		//{ComboBox}
		public Action getComboBoxAction_3_0() { return cComboBoxAction_3_0; }

		//name="ComboBox"
		public Assignment getNameAssignment_3_1() { return cNameAssignment_3_1; }

		//"ComboBox"
		public Keyword getNameComboBoxKeyword_3_1_0() { return cNameComboBoxKeyword_3_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3_2() { return cLeftCurlyBracketKeyword_3_2; }

		//answer+=Answer+
		public Assignment getAnswerAssignment_3_3() { return cAnswerAssignment_3_3; }

		//Answer
		public RuleCall getAnswerAnswerParserRuleCall_3_3_0() { return cAnswerAnswerParserRuleCall_3_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3_4() { return cRightCurlyBracketKeyword_3_4; }

		//{DropDown} name="DropDown" "{" answer+=Answer+ "}"
		public Group getGroup_4() { return cGroup_4; }

		//{DropDown}
		public Action getDropDownAction_4_0() { return cDropDownAction_4_0; }

		//name="DropDown"
		public Assignment getNameAssignment_4_1() { return cNameAssignment_4_1; }

		//"DropDown"
		public Keyword getNameDropDownKeyword_4_1_0() { return cNameDropDownKeyword_4_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_2() { return cLeftCurlyBracketKeyword_4_2; }

		//answer+=Answer+
		public Assignment getAnswerAssignment_4_3() { return cAnswerAssignment_4_3; }

		//Answer
		public RuleCall getAnswerAnswerParserRuleCall_4_3_0() { return cAnswerAnswerParserRuleCall_4_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }

		//{Radio} name="Radio" "{" answer+=Answer+ "}"
		public Group getGroup_5() { return cGroup_5; }

		//{Radio}
		public Action getRadioAction_5_0() { return cRadioAction_5_0; }

		//name="Radio"
		public Assignment getNameAssignment_5_1() { return cNameAssignment_5_1; }

		//"Radio"
		public Keyword getNameRadioKeyword_5_1_0() { return cNameRadioKeyword_5_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_2() { return cLeftCurlyBracketKeyword_5_2; }

		//answer+=Answer+
		public Assignment getAnswerAssignment_5_3() { return cAnswerAssignment_5_3; }

		//Answer
		public RuleCall getAnswerAnswerParserRuleCall_5_3_0() { return cAnswerAnswerParserRuleCall_5_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_4() { return cRightCurlyBracketKeyword_5_4; }
	}

	public class IdentifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Identifier");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		/// *Following Question Types are available:
		// *TextLn (Textline) and TextBl (Textblock) require the indication of the maximal length of text input in brackets.* / Identifier:
		//	ID | STRING | INT;
		public ParserRule getRule() { return rule; }

		//ID | STRING | INT
		public Alternatives getAlternatives() { return cAlternatives; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_1() { return cSTRINGTerminalRuleCall_1; }

		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }
	}
	
	
	private SurveyElements pSurvey;
	private QuestionnaireElements pQuestionnaire;
	private PartElements pPart;
	private QuestionElements pQuestion;
	private MatrixQuestionElements pMatrixQuestion;
	private AnswerElements pAnswer;
	private SurveyTerminalTypesElements pSurveyTerminalTypes;
	private IdentifierElements pIdentifier;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public SurveyGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.nordakademie.mwi13a.team1.survey.Survey".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	/// *Root element Survey* / Survey:
	//	questionnaire+=Questionnaire+;
	public SurveyElements getSurveyAccess() {
		return (pSurvey != null) ? pSurvey : (pSurvey = new SurveyElements());
	}
	
	public ParserRule getSurveyRule() {
		return getSurveyAccess().getRule();
	}

	/// *A Questionnaire must contain at least 1 Part* / Questionnaire:
	//	"Questionnaire:" name=STRING "{" "Questionnaire-ID:" id=Identifier part+=Part+ "}";
	public QuestionnaireElements getQuestionnaireAccess() {
		return (pQuestionnaire != null) ? pQuestionnaire : (pQuestionnaire = new QuestionnaireElements());
	}
	
	public ParserRule getQuestionnaireRule() {
		return getQuestionnaireAccess().getRule();
	}

	/// *A Part must contain at least 1 Question* / Part:
	//	"Part:" name=STRING "{" "Part-ID:" id=Identifier question+=Question+ "}";
	public PartElements getPartAccess() {
		return (pPart != null) ? pPart : (pPart = new PartElements());
	}
	
	public ParserRule getPartRule() {
		return getPartAccess().getRule();
	}

	/// *For each Question will be defined a type and wether it's a mandatory field or not* / Question:
	//	"Question:" name=STRING "{" "Question-ID:" id=Identifier mandatory?="Mandatory Field"? "Type:" questionType= //(dropdown+=DropDown | combobox=ComboBoxT | radio+=Radio | matrix+=Matrix | textln+=TextLn | textbl+=TextBl)
	//	SurveyTerminalTypes / *For each Question can be defined an arbitraty number of Answers. 
	//		 *The Question Types TextLn and TextBl don't require any answers because there's an STRING expected by default.* / "}";
	public QuestionElements getQuestionAccess() {
		return (pQuestion != null) ? pQuestion : (pQuestion = new QuestionElements());
	}
	
	public ParserRule getQuestionRule() {
		return getQuestionAccess().getRule();
	}

	//MatrixQuestion:
	//	"Question-ID:" id=Identifier "Question:" name=STRING;
	public MatrixQuestionElements getMatrixQuestionAccess() {
		return (pMatrixQuestion != null) ? pMatrixQuestion : (pMatrixQuestion = new MatrixQuestionElements());
	}
	
	public ParserRule getMatrixQuestionRule() {
		return getMatrixQuestionAccess().getRule();
	}

	//Answer:
	//	"Answer-ID:" id=Identifier "Answer:" name=STRING;
	public AnswerElements getAnswerAccess() {
		return (pAnswer != null) ? pAnswer : (pAnswer = new AnswerElements());
	}
	
	public ParserRule getAnswerRule() {
		return getAnswerAccess().getRule();
	}

	//SurveyTerminalTypes:
	//	{TextLine} name="TextLine" "(" length=INT ")" | {TextBlock} name="TextBlock" "(" length=INT ")" | {Matrix}
	//	name="Matrix" "{" "Scale:" "(" Identifier ("|" Identifier)* ")" "Questions:" "(" matrixQuestion+=MatrixQuestion ("|"
	//	matrixQuestion+=MatrixQuestion)* ")" "}" | {ComboBox} name="ComboBox" "{" answer+=Answer+ "}" | {DropDown}
	//	name="DropDown" "{" answer+=Answer+ "}" | {Radio} name="Radio" "{" answer+=Answer+ "}";
	public SurveyTerminalTypesElements getSurveyTerminalTypesAccess() {
		return (pSurveyTerminalTypes != null) ? pSurveyTerminalTypes : (pSurveyTerminalTypes = new SurveyTerminalTypesElements());
	}
	
	public ParserRule getSurveyTerminalTypesRule() {
		return getSurveyTerminalTypesAccess().getRule();
	}

	/// *Following Question Types are available:
	// *TextLn (Textline) and TextBl (Textblock) require the indication of the maximal length of text input in brackets.* / Identifier:
	//	ID | STRING | INT;
	public IdentifierElements getIdentifierAccess() {
		return (pIdentifier != null) ? pIdentifier : (pIdentifier = new IdentifierElements());
	}
	
	public ParserRule getIdentifierRule() {
		return getIdentifierAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}