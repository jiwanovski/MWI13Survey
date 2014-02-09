package de.nordakademie.mwi13a.team1.survey.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.nordakademie.mwi13a.team1.survey.services.SurveyGrammarAccess;
import de.nordakademie.mwi13a.team1.survey.survey.Answer;
import de.nordakademie.mwi13a.team1.survey.survey.CheckBox;
import de.nordakademie.mwi13a.team1.survey.survey.DropDown;
import de.nordakademie.mwi13a.team1.survey.survey.Matrix;
import de.nordakademie.mwi13a.team1.survey.survey.MatrixQuestion;
import de.nordakademie.mwi13a.team1.survey.survey.MatrixScale;
import de.nordakademie.mwi13a.team1.survey.survey.Part;
import de.nordakademie.mwi13a.team1.survey.survey.Question;
import de.nordakademie.mwi13a.team1.survey.survey.Questionnaire;
import de.nordakademie.mwi13a.team1.survey.survey.Radio;
import de.nordakademie.mwi13a.team1.survey.survey.Survey;
import de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage;
import de.nordakademie.mwi13a.team1.survey.survey.TextBlock;
import de.nordakademie.mwi13a.team1.survey.survey.TextLine;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SurveySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SurveyGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SurveyPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SurveyPackage.ANSWER:
				if(context == grammarAccess.getAnswerRule()) {
					sequence_Answer(context, (Answer) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.CHECK_BOX:
				if(context == grammarAccess.getSurveyTerminalTypesRule()) {
					sequence_SurveyTerminalTypes(context, (CheckBox) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.DROP_DOWN:
				if(context == grammarAccess.getSurveyTerminalTypesRule()) {
					sequence_SurveyTerminalTypes(context, (DropDown) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.MATRIX:
				if(context == grammarAccess.getSurveyTerminalTypesRule()) {
					sequence_SurveyTerminalTypes(context, (Matrix) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.MATRIX_QUESTION:
				if(context == grammarAccess.getMatrixQuestionRule()) {
					sequence_MatrixQuestion(context, (MatrixQuestion) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.MATRIX_SCALE:
				if(context == grammarAccess.getMatrixScaleRule()) {
					sequence_MatrixScale(context, (MatrixScale) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.PART:
				if(context == grammarAccess.getPartRule()) {
					sequence_Part(context, (Part) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.QUESTION:
				if(context == grammarAccess.getQuestionRule()) {
					sequence_Question(context, (Question) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.QUESTIONNAIRE:
				if(context == grammarAccess.getQuestionnaireRule()) {
					sequence_Questionnaire(context, (Questionnaire) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.RADIO:
				if(context == grammarAccess.getSurveyTerminalTypesRule()) {
					sequence_SurveyTerminalTypes(context, (Radio) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.SURVEY:
				if(context == grammarAccess.getSurveyRule()) {
					sequence_Survey(context, (Survey) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.TEXT_BLOCK:
				if(context == grammarAccess.getSurveyTerminalTypesRule()) {
					sequence_SurveyTerminalTypes(context, (TextBlock) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.TEXT_LINE:
				if(context == grammarAccess.getSurveyTerminalTypesRule()) {
					sequence_SurveyTerminalTypes(context, (TextLine) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (id=Identifier name=STRING)
	 */
	protected void sequence_Answer(EObject context, Answer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.ANSWER__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.ANSWER__ID));
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.ANSWER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.ANSWER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnswerAccess().getIdIdentifierParserRuleCall_1_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getAnswerAccess().getNameSTRINGTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id=Identifier name=STRING)
	 */
	protected void sequence_MatrixQuestion(EObject context, MatrixQuestion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.MATRIX_QUESTION__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.MATRIX_QUESTION__ID));
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.MATRIX_QUESTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.MATRIX_QUESTION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMatrixQuestionAccess().getIdIdentifierParserRuleCall_1_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getMatrixQuestionAccess().getNameSTRINGTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=Identifier
	 */
	protected void sequence_MatrixScale(EObject context, MatrixScale semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.MATRIX_SCALE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.MATRIX_SCALE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMatrixScaleAccess().getNameIdentifierParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING id=Identifier question+=Question+)
	 */
	protected void sequence_Part(EObject context, Part semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING id=Identifier mandatory?='Mandatory Field'? questionType=SurveyTerminalTypes)
	 */
	protected void sequence_Question(EObject context, Question semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING id=Identifier part+=Part+)
	 */
	protected void sequence_Questionnaire(EObject context, Questionnaire semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='CheckBox' answer+=Answer+)
	 */
	protected void sequence_SurveyTerminalTypes(EObject context, CheckBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='DropDown' answer+=Answer+)
	 */
	protected void sequence_SurveyTerminalTypes(EObject context, DropDown semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Matrix' answer+=Answer answer+=Answer* matrixQuestion+=MatrixQuestion matrixQuestion+=MatrixQuestion*)
	 */
	protected void sequence_SurveyTerminalTypes(EObject context, Matrix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Radio' answer+=Answer+)
	 */
	protected void sequence_SurveyTerminalTypes(EObject context, Radio semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='TextBlock' length=INT)
	 */
	protected void sequence_SurveyTerminalTypes(EObject context, TextBlock semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.SURVEY_TERMINAL_TYPES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.SURVEY_TERMINAL_TYPES__NAME));
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.TEXT_BLOCK__LENGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.TEXT_BLOCK__LENGTH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSurveyTerminalTypesAccess().getNameTextBlockKeyword_1_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSurveyTerminalTypesAccess().getLengthINTTerminalRuleCall_1_3_0(), semanticObject.getLength());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='TextLine' length=INT)
	 */
	protected void sequence_SurveyTerminalTypes(EObject context, TextLine semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.SURVEY_TERMINAL_TYPES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.SURVEY_TERMINAL_TYPES__NAME));
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.TEXT_LINE__LENGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.TEXT_LINE__LENGTH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSurveyTerminalTypesAccess().getNameTextLineKeyword_0_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSurveyTerminalTypesAccess().getLengthINTTerminalRuleCall_0_3_0(), semanticObject.getLength());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     questionnaire+=Questionnaire+
	 */
	protected void sequence_Survey(EObject context, Survey semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
