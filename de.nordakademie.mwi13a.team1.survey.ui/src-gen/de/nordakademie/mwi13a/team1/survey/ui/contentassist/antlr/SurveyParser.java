/*
* generated by Xtext
*/
package de.nordakademie.mwi13a.team1.survey.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.nordakademie.mwi13a.team1.survey.services.SurveyGrammarAccess;

public class SurveyParser extends AbstractContentAssistParser {
	
	@Inject
	private SurveyGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.nordakademie.mwi13a.team1.survey.ui.contentassist.antlr.internal.InternalSurveyParser createParser() {
		de.nordakademie.mwi13a.team1.survey.ui.contentassist.antlr.internal.InternalSurveyParser result = new de.nordakademie.mwi13a.team1.survey.ui.contentassist.antlr.internal.InternalSurveyParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSurveyTerminalTypesAccess().getAlternatives(), "rule__SurveyTerminalTypes__Alternatives");
					put(grammarAccess.getIdentifierAccess().getAlternatives(), "rule__Identifier__Alternatives");
					put(grammarAccess.getQuestionnaireAccess().getGroup(), "rule__Questionnaire__Group__0");
					put(grammarAccess.getPartAccess().getGroup(), "rule__Part__Group__0");
					put(grammarAccess.getQuestionAccess().getGroup(), "rule__Question__Group__0");
					put(grammarAccess.getMatrixQuestionAccess().getGroup(), "rule__MatrixQuestion__Group__0");
					put(grammarAccess.getAnswerAccess().getGroup(), "rule__Answer__Group__0");
					put(grammarAccess.getSurveyTerminalTypesAccess().getGroup_0(), "rule__SurveyTerminalTypes__Group_0__0");
					put(grammarAccess.getSurveyTerminalTypesAccess().getGroup_1(), "rule__SurveyTerminalTypes__Group_1__0");
					put(grammarAccess.getSurveyTerminalTypesAccess().getGroup_2(), "rule__SurveyTerminalTypes__Group_2__0");
					put(grammarAccess.getSurveyTerminalTypesAccess().getGroup_2_6(), "rule__SurveyTerminalTypes__Group_2_6__0");
					put(grammarAccess.getSurveyTerminalTypesAccess().getGroup_2_11(), "rule__SurveyTerminalTypes__Group_2_11__0");
					put(grammarAccess.getSurveyTerminalTypesAccess().getGroup_3(), "rule__SurveyTerminalTypes__Group_3__0");
					put(grammarAccess.getSurveyTerminalTypesAccess().getGroup_4(), "rule__SurveyTerminalTypes__Group_4__0");
					put(grammarAccess.getSurveyTerminalTypesAccess().getGroup_5(), "rule__SurveyTerminalTypes__Group_5__0");
					put(grammarAccess.getSurveyAccess().getQuestionnaireAssignment(), "rule__Survey__QuestionnaireAssignment");
					put(grammarAccess.getQuestionnaireAccess().getNameAssignment_1(), "rule__Questionnaire__NameAssignment_1");
					put(grammarAccess.getQuestionnaireAccess().getIdAssignment_4(), "rule__Questionnaire__IdAssignment_4");
					put(grammarAccess.getQuestionnaireAccess().getPartAssignment_5(), "rule__Questionnaire__PartAssignment_5");
					put(grammarAccess.getPartAccess().getNameAssignment_1(), "rule__Part__NameAssignment_1");
					put(grammarAccess.getPartAccess().getIdAssignment_4(), "rule__Part__IdAssignment_4");
					put(grammarAccess.getPartAccess().getQuestionAssignment_5(), "rule__Part__QuestionAssignment_5");
					put(grammarAccess.getQuestionAccess().getNameAssignment_1(), "rule__Question__NameAssignment_1");
					put(grammarAccess.getQuestionAccess().getIdAssignment_4(), "rule__Question__IdAssignment_4");
					put(grammarAccess.getQuestionAccess().getMandatoryAssignment_5(), "rule__Question__MandatoryAssignment_5");
					put(grammarAccess.getQuestionAccess().getQuestionTypeAssignment_7(), "rule__Question__QuestionTypeAssignment_7");
					put(grammarAccess.getMatrixQuestionAccess().getIdAssignment_1(), "rule__MatrixQuestion__IdAssignment_1");
					put(grammarAccess.getMatrixQuestionAccess().getNameAssignment_3(), "rule__MatrixQuestion__NameAssignment_3");
					put(grammarAccess.getAnswerAccess().getIdAssignment_1(), "rule__Answer__IdAssignment_1");
					put(grammarAccess.getAnswerAccess().getNameAssignment_3(), "rule__Answer__NameAssignment_3");
					put(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_0_1(), "rule__SurveyTerminalTypes__NameAssignment_0_1");
					put(grammarAccess.getSurveyTerminalTypesAccess().getLengthAssignment_0_3(), "rule__SurveyTerminalTypes__LengthAssignment_0_3");
					put(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_1_1(), "rule__SurveyTerminalTypes__NameAssignment_1_1");
					put(grammarAccess.getSurveyTerminalTypesAccess().getLengthAssignment_1_3(), "rule__SurveyTerminalTypes__LengthAssignment_1_3");
					put(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_2_1(), "rule__SurveyTerminalTypes__NameAssignment_2_1");
					put(grammarAccess.getSurveyTerminalTypesAccess().getMatrixQuestionAssignment_2_10(), "rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_10");
					put(grammarAccess.getSurveyTerminalTypesAccess().getMatrixQuestionAssignment_2_11_1(), "rule__SurveyTerminalTypes__MatrixQuestionAssignment_2_11_1");
					put(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_3_1(), "rule__SurveyTerminalTypes__NameAssignment_3_1");
					put(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_3_3(), "rule__SurveyTerminalTypes__AnswerAssignment_3_3");
					put(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_4_1(), "rule__SurveyTerminalTypes__NameAssignment_4_1");
					put(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_4_3(), "rule__SurveyTerminalTypes__AnswerAssignment_4_3");
					put(grammarAccess.getSurveyTerminalTypesAccess().getNameAssignment_5_1(), "rule__SurveyTerminalTypes__NameAssignment_5_1");
					put(grammarAccess.getSurveyTerminalTypesAccess().getAnswerAssignment_5_3(), "rule__SurveyTerminalTypes__AnswerAssignment_5_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.nordakademie.mwi13a.team1.survey.ui.contentassist.antlr.internal.InternalSurveyParser typedParser = (de.nordakademie.mwi13a.team1.survey.ui.contentassist.antlr.internal.InternalSurveyParser) parser;
			typedParser.entryRuleSurvey();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SurveyGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SurveyGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
