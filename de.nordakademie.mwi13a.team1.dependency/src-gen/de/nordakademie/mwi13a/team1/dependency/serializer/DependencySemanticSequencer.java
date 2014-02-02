package de.nordakademie.mwi13a.team1.dependency.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.nordakademie.mwi13a.team1.dependency.dependency.And;
import de.nordakademie.mwi13a.team1.dependency.dependency.DMNextParts;
import de.nordakademie.mwi13a.team1.dependency.dependency.DMQuestion;
import de.nordakademie.mwi13a.team1.dependency.dependency.DependencyModel;
import de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage;
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
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_And(context, (And) semanticObject); 
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
			case DependencyPackage.DEPENDENCY_MODEL:
				if(context == grammarAccess.getDependencyModelRule()) {
					sequence_DependencyModel(context, (DependencyModel) semanticObject); 
					return; 
				}
				else break;
			case DependencyPackage.OR:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDependencyRule() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule()) {
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
		feeder.accept(grammarAccess.getAtomicAccess().getQuestionQuestionSTRINGTerminalRuleCall_2_0_1(), semanticObject.getQuestion());
		feeder.accept(grammarAccess.getAtomicAccess().getAnswerAnswerSTRINGTerminalRuleCall_4_0_1(), semanticObject.getAnswer());
		feeder.finish();
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
	 *     (name=[Part|STRING] (nextParts+=DMNextParts nextParts+=DMNextParts*)+)
	 */
	protected void sequence_PartElements(EObject context, PartElements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=[Questionnaire|STRING] partElements+=PartElements+)
	 */
	protected void sequence_SurveyElements(EObject context, SurveyElements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}