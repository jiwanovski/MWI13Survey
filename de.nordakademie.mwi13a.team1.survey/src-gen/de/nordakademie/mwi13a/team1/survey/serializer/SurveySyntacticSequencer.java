package de.nordakademie.mwi13a.team1.survey.serializer;

import com.google.inject.Inject;
import de.nordakademie.mwi13a.team1.survey.services.SurveyGrammarAccess;
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
public class SurveySyntacticSequencer extends AbstractSyntacticSequencer {

	protected SurveyGrammarAccess grammarAccess;
	protected AbstractElementAlias match_SurveyTerminalTypes___VerticalLineKeyword_2_6_0_IdentifierParserRuleCall_2_6_1__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SurveyGrammarAccess) access;
		match_SurveyTerminalTypes___VerticalLineKeyword_2_6_0_IdentifierParserRuleCall_2_6_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getSurveyTerminalTypesAccess().getVerticalLineKeyword_2_6_0()), new TokenAlias(false, false, grammarAccess.getSurveyTerminalTypesAccess().getIdentifierParserRuleCall_2_6_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIdentifierRule())
			return getIdentifierToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Identifier:
	 * 	ID | STRING | INT
	 * ;
	 */
	protected String getIdentifierToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_SurveyTerminalTypes___VerticalLineKeyword_2_6_0_IdentifierParserRuleCall_2_6_1__a.equals(syntax))
				emit_SurveyTerminalTypes___VerticalLineKeyword_2_6_0_IdentifierParserRuleCall_2_6_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('|' Identifier)*
	 */
	protected void emit_SurveyTerminalTypes___VerticalLineKeyword_2_6_0_IdentifierParserRuleCall_2_6_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
