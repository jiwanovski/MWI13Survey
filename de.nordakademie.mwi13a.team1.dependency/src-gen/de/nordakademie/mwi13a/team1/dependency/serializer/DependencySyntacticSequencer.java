package de.nordakademie.mwi13a.team1.dependency.serializer;

import com.google.inject.Inject;
import de.nordakademie.mwi13a.team1.dependency.services.DependencyGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class DependencySyntacticSequencer extends AbstractSyntacticSequencer {

	protected DependencyGrammarAccess grammarAccess;
	protected AbstractElementAlias match_SDNextParts_ANDKeyword_4_0_0_or_ORKeyword_4_0_1;
	protected AbstractElementAlias match_SDPart___NextPartsKeyword_5_0_RightCurlyBracketKeyword_5_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DependencyGrammarAccess) access;
		match_SDNextParts_ANDKeyword_4_0_0_or_ORKeyword_4_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSDNextPartsAccess().getANDKeyword_4_0_0()), new TokenAlias(false, false, grammarAccess.getSDNextPartsAccess().getORKeyword_4_0_1()));
		match_SDPart___NextPartsKeyword_5_0_RightCurlyBracketKeyword_5_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSDPartAccess().getNextPartsKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getSDPartAccess().getRightCurlyBracketKeyword_5_2()));
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
			if(match_SDNextParts_ANDKeyword_4_0_0_or_ORKeyword_4_0_1.equals(syntax))
				emit_SDNextParts_ANDKeyword_4_0_0_or_ORKeyword_4_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SDPart___NextPartsKeyword_5_0_RightCurlyBracketKeyword_5_2__q.equals(syntax))
				emit_SDPart___NextPartsKeyword_5_0_RightCurlyBracketKeyword_5_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'OR' | 'AND'
	 */
	protected void emit_SDNextParts_ANDKeyword_4_0_0_or_ORKeyword_4_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Next parts {' '}')?
	 */
	protected void emit_SDPart___NextPartsKeyword_5_0_RightCurlyBracketKeyword_5_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
