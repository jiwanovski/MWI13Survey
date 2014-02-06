package de.nordakademie.mwi13a.team1.dependency.serializer;

import com.google.inject.Inject;
import de.nordakademie.mwi13a.team1.dependency.services.DependencyGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class DependencySyntacticSequencer extends AbstractSyntacticSequencer {

	protected DependencyGrammarAccess grammarAccess;
	protected AbstractElementAlias match_PartElements___RightCurlyBracketKeyword_2_2_NextPartsKeyword_2_0__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DependencyGrammarAccess) access;
		match_PartElements___RightCurlyBracketKeyword_2_2_NextPartsKeyword_2_0__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPartElementsAccess().getRightCurlyBracketKeyword_2_2()), new TokenAlias(false, false, grammarAccess.getPartElementsAccess().getNextPartsKeyword_2_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_PartElements___RightCurlyBracketKeyword_2_2_NextPartsKeyword_2_0__q.equals(syntax))
				emit_PartElements___RightCurlyBracketKeyword_2_2_NextPartsKeyword_2_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('}' 'Next parts {')?
	 */
	protected void emit_PartElements___RightCurlyBracketKeyword_2_2_NextPartsKeyword_2_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
