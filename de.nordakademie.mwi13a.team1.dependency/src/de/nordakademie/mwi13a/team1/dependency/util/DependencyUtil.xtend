package de.nordakademie.mwi13a.team1.dependency.util

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import de.nordakademie.mwi13a.team1.dependency.dependency.PartElements
import de.nordakademie.mwi13a.team1.survey.survey.Question
import de.nordakademie.mwi13a.team1.dependency.dependency.DMNextParts
import de.nordakademie.mwi13a.team1.dependency.dependency.DMQuestion

class DependencyUtil {
	def static questionsDefinedBefore(DMQuestion e) {
		val allQuestions = e.getContainerOfType(typeof(DMNextParts)).expressions
		val containingPart = allQuestions.findFirst[isAncestor(it, e)]
		
		allQuestions.subList(0, allQuestions.indexOf(containingPart)).typeSelect(typeof(DMQuestion))
	}
	
}