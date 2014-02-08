package de.nordakademie.mwi13a.team1.dependency.util

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import de.nordakademie.mwi13a.team1.dependency.dependency.PartElements
import de.nordakademie.mwi13a.team1.survey.survey.Question
import de.nordakademie.mwi13a.team1.dependency.dependency.DMNextParts
import de.nordakademie.mwi13a.team1.dependency.dependency.DMQuestion
import de.nordakademie.mwi13a.team1.survey.survey.Part
import static de.nordakademie.mwi13a.team1.dependency.util.DependencyUtil.*
import de.nordakademie.mwi13a.team1.survey.survey.MatrixQuestion

class DependencyUtil {
	static val questionsAdded = <Question>newArrayList()
	static val matrixQuestionsAdded = <MatrixQuestion>newArrayList()
	
	def static partHierarchy(PartElements c) {
		val visited = <PartElements>newArrayList()
		
		//var current = c.superclass
	}
	
	def static addedQuestionParameters(Question q) {
		var contains = false
		if (q != null) {
			contains = questionsAdded.contains(q)
			if (!contains) {
				questionsAdded.add(q)
			}			
		}
		contains
	}
	
	def static addedMatrixQuestionParameters(MatrixQuestion q) {
		var contains = false
		if (q != null) {
			contains = matrixQuestionsAdded.contains(q)
			if (!contains) {
				matrixQuestionsAdded.add(q)
			}
		}
		contains
	}
	
	def static questionsDefinedBefore(DMQuestion e) {
		val allQuestions = e.getContainerOfType(typeof(DMNextParts)).expressions
		val containingPart = allQuestions.findFirst[isAncestor(it, e)]
		
		allQuestions.subList(0, allQuestions.indexOf(containingPart)).typeSelect(typeof(DMQuestion))
	}
	
}