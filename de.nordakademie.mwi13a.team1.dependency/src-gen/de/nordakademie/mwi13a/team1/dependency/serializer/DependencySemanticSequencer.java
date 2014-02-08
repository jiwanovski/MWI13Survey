package de.nordakademie.mwi13a.team1.dependency.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.nordakademie.mwi13a.team1.dependency.dependency.And;
import de.nordakademie.mwi13a.team1.dependency.dependency.Bracket;
import de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion;
import de.nordakademie.mwi13a.team1.dependency.dependency.DMNextParts;
import de.nordakademie.mwi13a.team1.dependency.dependency.DMQuestion;
import de.nordakademie.mwi13a.team1.dependency.dependency.DefineNextPart;
import de.nordakademie.mwi13a.team1.dependency.dependency.DependencyModel;
import de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage;
import de.nordakademie.mwi13a.team1.dependency.dependency.LastPart;
import de.nordakademie.mwi13a.team1.dependency.dependency.Or;
import de.nordakademie.mwi13a.team1.dependency.dependency.PartElements;
import de.nordakademie.mwi13a.team1.dependency.dependency.SurveyElements;
import de.nordakademie.mwi13a.team1.dependency.services.DependencyGrammarAccess;
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
public class DependencySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DependencyGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DependencyPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DependencyPackage.AND:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDependencyRule() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0()) {
					sequence_And(context, (And) semanticObject); 
					return; 
				}
				else break;
			case DependencyPackage.BRACKET:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDependencyRule() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Primary(context, (Bracket) semanticObject); 
					return; 
				}
				else break;
			case DependencyPackage.DM_MATRIX_QUESTION:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getDependencyRule() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Atomic(context, (DMMatrixQuestion) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getDMMatrixQuestionRule()) {
					sequence_DMMatrixQuestion(context, (DMMatrixQuestion) semanticObject); 
					return; 
				}
				else break;
			case DependencyPackage.DM_NEXT_PARTS:
				if(context == grammarAccess.getDMNextPartsRule()) {
					sequence_DMNextParts(context, (DMNextParts) semanticObject); 
					return; 
				}
				else break;
			case DependencyPackage.DM_QUESTION:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getDependencyRule() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Atomic(context, (DMQuestion) semanticObject); 
					return; 
				}
				else break;
			case DependencyPackage.DEFINE_NEXT_PART:
				if(context == grammarAccess.getPartOptionsRule()) {
					sequence_PartOptions(context, (DefineNextPart) semanticObject); 
					return; 
				}
				else break;
			case DependencyPackage.DEPENDENCY_MODEL:
				if(context == grammarAccess.getDependencyModelRule()) {
					sequence_DependencyModel(context, (DependencyModel) semanticObject); 
					return; 
				}
				else break;
			case DependencyPackage.LAST_PART:
				if(context == grammarAccess.getPartOptionsRule()) {
					sequence_PartOptions(context, (LastPart) semanticObject); 
					return; 
				}
				else break;
			case DependencyPackage.OR:
				if(context == grammarAccess.getDependencyRule() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0()) {
					sequence_Or(context, (Or) semanticObject); 
					return; 
				}
				else break;
			case DependencyPackage.PART_ELEMENTS:
				if(context == grammarAccess.getPartElementsRule()) {
					sequence_PartElements(context, (PartElements) semanticObject); 
					return; 
				}
				else break;
			case DependencyPackage.SURVEY_ELEMENTS:
				if(context == grammarAccess.getSurveyElementsRule()) {
					sequence_SurveyElements(context, (SurveyElements) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=And_And_1_0 right=Primary)
	 */
	protected void sequence_And(EObject context, And semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DependencyPackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DependencyPackage.Literals.AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, DependencyPackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DependencyPackage.Literals.AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAndAccess().getAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndAccess().getRightPrimaryParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (question=[MatrixQuestion|STRING] answer=[Answer|STRING])
	 */
	protected void sequence_Atomic(EObject context, DMMatrixQuestion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (question=[Question|STRING] answer=[Answer|STRING])
	 */
	protected void sequence_Atomic(EObject context, DMQuestion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DependencyPackage.Literals.DM_QUESTION__QUESTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DependencyPackage.Literals.DM_QUESTION__QUESTION));
			if(transientValues.isValueTransient(semanticObject, DependencyPackage.Literals.DM_QUESTION__ANSWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DependencyPackage.Literals.DM_QUESTION__ANSWER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getQuestionQuestionSTRINGTerminalRuleCall_0_2_0_1(), semanticObject.getQuestion());
		feeder.accept(grammarAccess.getAtomicAccess().getAnswerAnswerSTRINGTerminalRuleCall_0_4_0_1(), semanticObject.getAnswer());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (matrixQuestion=[MatrixQuestion|STRING] matrixScale=[Answer|STRING])
	 */
	protected void sequence_DMMatrixQuestion(EObject context, DMMatrixQuestion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=[Part|STRING] expressions+=Dependency*)
	 */
	protected void sequence_DMNextParts(EObject context, DMNextParts semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=SurveyElements+
	 */
	protected void sequence_DependencyModel(EObject context, DependencyModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Or_Or_1_0 right=And)
	 */
	protected void sequence_Or(EObject context, Or semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DependencyPackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DependencyPackage.Literals.OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, DependencyPackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DependencyPackage.Literals.OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrAccess().getOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=[Part|STRING] option=PartOptions)
	 */
	protected void sequence_PartElements(EObject context, PartElements semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DependencyPackage.Literals.PART_ELEMENTS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DependencyPackage.Literals.PART_ELEMENTS__NAME));
			if(transientValues.isValueTransient(semanticObject, DependencyPackage.Literals.PART_ELEMENTS__OPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DependencyPackage.Literals.PART_ELEMENTS__OPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPartElementsAccess().getNamePartSTRINGTerminalRuleCall_1_0_1(), semanticObject.getName());
		feeder.accept(grammarAccess.getPartElementsAccess().getOptionPartOptionsParserRuleCall_2_0(), semanticObject.getOption());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     nextParts+=DMNextParts+
	 */
	protected void sequence_PartOptions(EObject context, DefineNextPart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     lastPart?='LastPart'
	 */
	protected void sequence_PartOptions(EObject context, LastPart semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DependencyPackage.Literals.LAST_PART__LAST_PART) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DependencyPackage.Literals.LAST_PART__LAST_PART));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPartOptionsAccess().getLastPartLastPartKeyword_1_1_0(), semanticObject.isLastPart());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dependency=Or
	 */
	protected void sequence_Primary(EObject context, Bracket semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DependencyPackage.Literals.BRACKET__DEPENDENCY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DependencyPackage.Literals.BRACKET__DEPENDENCY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryAccess().getDependencyOrParserRuleCall_0_2_0(), semanticObject.getDependency());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=[Questionnaire|STRING] partElements+=PartElements+)
	 */
	protected void sequence_SurveyElements(EObject context, SurveyElements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
