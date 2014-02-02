package de.nordakademie.mwi13a.team1.dependency.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage;
import de.nordakademie.mwi13a.team1.dependency.dependency.SDNextParts;
import de.nordakademie.mwi13a.team1.dependency.dependency.SDPart;
import de.nordakademie.mwi13a.team1.dependency.dependency.SDPartDependencies;
import de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependencies;
import de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependency;
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
			case DependencyPackage.SD_NEXT_PARTS:
				if(context == grammarAccess.getSDNextPartsRule()) {
					sequence_SDNextParts(context, (SDNextParts) semanticObject); 
					return; 
				}
				else break;
			case DependencyPackage.SD_PART:
				if(context == grammarAccess.getSDPartRule()) {
					sequence_SDPart(context, (SDPart) semanticObject); 
					return; 
				}
				else break;
			case DependencyPackage.SD_PART_DEPENDENCIES:
				if(context == grammarAccess.getSDPartDependenciesRule()) {
					sequence_SDPartDependencies(context, (SDPartDependencies) semanticObject); 
					return; 
				}
				else break;
			case DependencyPackage.SURVEY_DEPENDENCIES:
				if(context == grammarAccess.getSurveyDependenciesRule()) {
					sequence_SurveyDependencies(context, (SurveyDependencies) semanticObject); 
					return; 
				}
				else break;
			case DependencyPackage.SURVEY_DEPENDENCY:
				if(context == grammarAccess.getSurveyDependencyRule()) {
					sequence_SurveyDependency(context, (SurveyDependency) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (nextPart+=[Part|STRING] partDependencies+=SDPartDependencies partDependencies+=SDPartDependencies*)
	 */
	protected void sequence_SDNextParts(EObject context, SDNextParts semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (question=[Question|STRING] answer=[Answer|STRING])
	 */
	protected void sequence_SDPartDependencies(EObject context, SDPartDependencies semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DependencyPackage.Literals.SD_PART_DEPENDENCIES__QUESTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DependencyPackage.Literals.SD_PART_DEPENDENCIES__QUESTION));
			if(transientValues.isValueTransient(semanticObject, DependencyPackage.Literals.SD_PART_DEPENDENCIES__ANSWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DependencyPackage.Literals.SD_PART_DEPENDENCIES__ANSWER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSDPartDependenciesAccess().getQuestionQuestionSTRINGTerminalRuleCall_1_0_1(), semanticObject.getQuestion());
		feeder.accept(grammarAccess.getSDPartDependenciesAccess().getAnswerAnswerSTRINGTerminalRuleCall_3_0_1(), semanticObject.getAnswer());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (part2=[Part|STRING] defaultNextPart=[Part|STRING] nextParts+=SDNextParts*)
	 */
	protected void sequence_SDPart(EObject context, SDPart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     surveyDependency+=SurveyDependency+
	 */
	protected void sequence_SurveyDependencies(EObject context, SurveyDependencies semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (survey=[Questionnaire|STRING] part+=SDPart+)
	 */
	protected void sequence_SurveyDependency(EObject context, SurveyDependency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
