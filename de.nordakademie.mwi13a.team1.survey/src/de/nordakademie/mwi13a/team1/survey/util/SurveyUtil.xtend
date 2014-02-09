package de.nordakademie.mwi13a.team1.survey.util

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import de.nordakademie.mwi13a.team1.survey.survey.Survey
import org.eclipse.emf.ecore.EObject
import de.nordakademie.mwi13a.team1.survey.survey.Questionnaire
import de.nordakademie.mwi13a.team1.survey.survey.Part
import de.nordakademie.mwi13a.team1.survey.survey.Question
import de.nordakademie.mwi13a.team1.survey.survey.Answer
import de.nordakademie.mwi13a.team1.survey.survey.DropDown
import de.nordakademie.mwi13a.team1.survey.survey.CheckBox
import de.nordakademie.mwi13a.team1.survey.survey.Radio
import de.nordakademie.mwi13a.team1.survey.survey.Matrix

class SurveyUtil {
	def static containingSurvey(EObject e) {
		e.getContainerOfType(typeof(Survey))
	}
	
	def static containingQuestionnaire(EObject e) {
		e.getContainerOfType(typeof(Questionnaire))
	}
	
	def static containingPart(EObject e) {
		e.getContainerOfType(typeof(Part))
	}
	
	def static containingQuestion(EObject e) {
		e.getContainerOfType(typeof(Question))
	}
	
	def static containingAnswer(EObject e) {
		e.getContainerOfType(typeof(Answer))
	}
	
	def static containingDropDown(EObject e) {
		e.getContainerOfType(typeof(DropDown))
	}
	
	def static containingCheckBox(EObject e) {
		e.getContainerOfType(typeof(CheckBox))
	}
	
	def static containingRadio(EObject e) {
		e.getContainerOfType(typeof(Radio))
	}
	
	def static containingMatrix(EObject e) {
		e.getContainerOfType(typeof(Matrix))
	}
}