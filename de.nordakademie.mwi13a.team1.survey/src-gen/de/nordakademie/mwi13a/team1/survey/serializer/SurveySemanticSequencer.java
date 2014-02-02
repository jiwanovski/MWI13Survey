package de.nordakademie.mwi13a.team1.survey.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.nordakademie.mwi13a.team1.survey.services.SurveyGrammarAccess;
import de.nordakademie.mwi13a.team1.survey.survey.Answer;
import de.nordakademie.mwi13a.team1.survey.survey.ComboBox;
import de.nordakademie.mwi13a.team1.survey.survey.DropDown;
import de.nordakademie.mwi13a.team1.survey.survey.Matrix;
import de.nordakademie.mwi13a.team1.survey.survey.Part;
import de.nordakademie.mwi13a.team1.survey.survey.Question;
import de.nordakademie.mwi13a.team1.survey.survey.Questionnaire;
import de.nordakademie.mwi13a.team1.survey.survey.Radio;
import de.nordakademie.mwi13a.team1.survey.survey.Survey;
import de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage;
import de.nordakademie.mwi13a.team1.survey.survey.TextBl;
import de.nordakademie.mwi13a.team1.survey.survey.TextLn;
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
			case SurveyPackage.COMBO_BOX:
				if(context == grammarAccess.getComboBoxRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_ComboBox(context, (ComboBox) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.DROP_DOWN:
				if(context == grammarAccess.getDropDownRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_DropDown(context, (DropDown) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.MATRIX:
				if(context == grammarAccess.getMatrixRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Matrix(context, (Matrix) semanticObject); 
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
				if(context == grammarAccess.getRadioRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Radio(context, (Radio) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.SURVEY:
				if(context == grammarAccess.getSurveyRule()) {
					sequence_Survey(context, (Survey) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.TEXT_BL:
				if(context == grammarAccess.getTextBlRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_TextBl(context, (TextBl) semanticObject); 
					return; 
				}
				else break;
			case SurveyPackage.TEXT_LN:
				if(context == grammarAccess.getTextLnRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_TextLn(context, (TextLn) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (id=Identifier name=Identifier)
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
		feeder.accept(grammarAccess.getAnswerAccess().getNameIdentifierParserRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name='ComboBox'
	 */
	protected void sequence_ComboBox(EObject context, ComboBox semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.COMBO_BOX__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.COMBO_BOX__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComboBoxAccess().getNameComboBoxKeyword_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name='DropDown'
	 */
	protected void sequence_DropDown(EObject context, DropDown semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.DROP_DOWN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.DROP_DOWN__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDropDownAccess().getNameDropDownKeyword_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (answer+=Answer answer+=Answer*)
	 */
	protected void sequence_Matrix(EObject context, Matrix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (name=STRING id=Identifier mandatory=Mandatory type=Type answer+=Answer*)
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
	 *     name='Radio'
	 */
	protected void sequence_Radio(EObject context, Radio semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.RADIO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.RADIO__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRadioAccess().getNameRadioKeyword_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     questionnaire+=Questionnaire+
	 */
	protected void sequence_Survey(EObject context, Survey semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     length=INT
	 */
	protected void sequence_TextBl(EObject context, TextBl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.TEXT_BL__LENGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.TEXT_BL__LENGTH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextBlAccess().getLengthINTTerminalRuleCall_2_0(), semanticObject.getLength());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     length=INT
	 */
	protected void sequence_TextLn(EObject context, TextLn semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyPackage.Literals.TEXT_LN__LENGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyPackage.Literals.TEXT_LN__LENGTH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextLnAccess().getLengthINTTerminalRuleCall_2_0(), semanticObject.getLength());
		feeder.finish();
	}
}
