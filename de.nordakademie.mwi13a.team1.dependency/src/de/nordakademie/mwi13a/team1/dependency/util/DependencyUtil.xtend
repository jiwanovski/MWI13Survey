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
import de.nordakademie.mwi13a.team1.survey.survey.Matrix
import de.nordakademie.mwi13a.team1.survey.survey.TextLine
import de.nordakademie.mwi13a.team1.survey.survey.TextBlock
import de.nordakademie.mwi13a.team1.survey.survey.DropDown
import de.nordakademie.mwi13a.team1.survey.survey.Radio
import de.nordakademie.mwi13a.team1.dependency.dependency.SurveyElements
import de.nordakademie.mwi13a.team1.survey.survey.Questionnaire
import org.eclipse.emf.ecore.EObject
import de.nordakademie.mwi13a.team1.survey.survey.Survey

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
	
	def static cleanUpString(String s) {
		var cleanString = s.replace(" ","").replace("ä","ae").replace("ö","oe").replace("ü","ue")
		cleanString
	}
	
	def static partParams(Part p) {
		val params = <Object>newArrayList()
		for (q: p.question) {
			if (q.questionType instanceof Matrix) {
				for (mq: (q.questionType as Matrix).matrixQuestion) {
					if ((mq != null) && (!params.contains(mq)))
						params.add(mq)											
				}
			} else {				
				if ((q != null) && (!params.contains(q))) 
					params.add(q)														
			}
		}
		params
	}
	
	def static getID(Object o) {
		if (o instanceof MatrixQuestion) {
			return (o as MatrixQuestion).id
		} else {
			return (o as Question).id
		}		
	}
	
	def static isMandatory(Object o) {
		if (o instanceof MatrixQuestion) {
			return (((o as MatrixQuestion).eContainer as Matrix).eContainer as Question).mandatory
		} else {
			return (o as Question).mandatory
		}
		
	}
	
	def static getQuestionaireName(PartElements e) {
		return ((e.eContainer as SurveyElements).name as Questionnaire).name
	}
	
	def static getPartName(PartElements e) {
		return (e.name as Part).name
	}
	
	def static getObjectName(PartElements e) {
		val text = e.getQuestionaireName + e.getPartName
		text.cleanUpString
	}
	
	def static questionsDefinedBefore(DMQuestion e) {
		val allQuestions = e.getContainerOfType(typeof(DMNextParts)).expressions
		val containingPart = allQuestions.findFirst[isAncestor(it, e)]
		
		allQuestions.subList(0, allQuestions.indexOf(containingPart)).typeSelect(typeof(DMQuestion))
	}
	
	def static containingSurveyElement(EObject e) {
		e.getContainerOfType(typeof(SurveyElements))
	}
	
	def static containingQuestionnaire(EObject e) {
		e.getContainerOfType(typeof(Questionnaire))
	}
	
	def static containingDMNextPart(EObject e) {
		e.getContainerOfType(typeof(DMNextParts))
	}
	
	def static containingPart(EObject e) {
		e.getContainerOfType(typeof(Part))
	}
	
	def static containingPartElement(EObject e) {
		e.getContainerOfType(typeof(PartElements))
	}
	
	def static containingQuestion(EObject e) {
		e.getContainerOfType(typeof(Question))
	}
	
}