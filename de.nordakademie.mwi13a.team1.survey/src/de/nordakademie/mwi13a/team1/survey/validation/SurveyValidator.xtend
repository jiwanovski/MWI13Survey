/*
 * generated by Xtext
 */
package de.nordakademie.mwi13a.team1.survey.validation

import de.nordakademie.mwi13a.team1.survey.survey.Answer
import de.nordakademie.mwi13a.team1.survey.survey.CheckBox
import de.nordakademie.mwi13a.team1.survey.survey.DropDown
import de.nordakademie.mwi13a.team1.survey.survey.Part
import de.nordakademie.mwi13a.team1.survey.survey.Question
import de.nordakademie.mwi13a.team1.survey.survey.Questionnaire
import de.nordakademie.mwi13a.team1.survey.survey.Radio
import de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage
import de.nordakademie.mwi13a.team1.survey.survey.SurveyTerminalTypes
import de.nordakademie.mwi13a.team1.survey.survey.TextBlock
import de.nordakademie.mwi13a.team1.survey.survey.TextLine
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.CheckType

import static extension de.nordakademie.mwi13a.team1.survey.util.SurveyUtil.*

class SurveyValidator extends AbstractSurveyValidator {
	public static val QUESTIONNAIRE_CONTAINS_PART = "de.nordakademie.mwi13a.team1.survey.QuestionnaireContainsPart"
	public static val PART_CONTAINS_QUESTION = "de.nordakademie.mwi13a.team1.survey.PartContainsQuestion"
	public static val DROPDOWN_WITH_2_ANSWERS = "de.nordakademie.mwi13a.team1.survey.DropDownWith2Answers"
	public static val CHECKBOX_WITH_1_ANSWER = "de.nordakademie.mwi13a.team1.survey.CheckBoxWith1Answer"
	public static val RADIO_WITH_1_ANSWER = "de.nordakademie.mwi13a.team1.survey.RadioWith1Answer"
	public static val ID_QUESTIONNAIRE = "de.nordakademie.mwi13a.team1.survey.IDQuestionnaire"
	public static val ID_PART = "de.nordakademie.mwi13a.team1.survey.IDPart"
	public static val ID_QUESTION = "de.nordakademie.mwi13a.team1.survey.IDQuestion"
	public static val ID_ANSWER = "de.nordakademie.mwi13a.team1.survey.IDAnswer"
	public static val TEXTLENGTH_TEXTBLOCK = "de.nordakademie.mwi13a.team1.survey.textlengthTextblock"
	public static val TEXTLENGTH_TEXTLINE = "de.nordakademie.mwi13a.team1.survey.textlengthTextline"
	public static val NAME_PART = "de.nordakademie.mwi13a.team1.survey.NamePart"
	
	
	//Every Questionnaire must contain at least 1 Part
	@Check(CheckType.FAST)
	def QuestionnaireContainsPart (Questionnaire questionnaire) {
		if(questionnaire.part.empty) 
			warning("A Questionnaire must contain at least 1 Part!", 
				SurveyPackage::eINSTANCE.questionnaire_Name,
				QUESTIONNAIRE_CONTAINS_PART,
				questionnaire.name)              
	}
	
	//Every Part must contain at least 1 Question
	@Check(CheckType.FAST)
	def PartContainsQuestion(Part part) {
		if(part.question.empty) 
			warning("A Part must contain at least 1 Question!", 
				SurveyPackage::eINSTANCE.part_Name,
				PART_CONTAINS_QUESTION,
				part.name)
	}
	
	
	//Every DropDown Question must contain at least 2 Answers	
	@Check
	def DropDownWith2Answers(DropDown dropdown) {
		if (dropdown.answer.size <= 1){
			error("A DropDown Question must contain at least 2 Answers!", 
				SurveyPackage::eINSTANCE.dropDown_Answer,
				DROPDOWN_WITH_2_ANSWERS,
				dropdown.answer.toString)
		}
	}
	
	
	//Every CheckBox Question must contain at least 1 Answer (Opt-in functionality)
	@Check
	def CheckBoxWith1Answers (CheckBox checkbox) {
		if (checkbox.answer.size <= 0){
			error("A CheckBox Question must contain at least 1 Answer!",
			SurveyPackage::eINSTANCE.checkBox_Answer,
			CHECKBOX_WITH_1_ANSWER, 
			checkbox.answer.toString)
		}
	}
	
	//Every Radio Question must contain at least 1 Answer (Opt-in functionality)
	@Check
	def RadioWith1Answer (Radio radio) {
		if (radio.answer.size <= 0){
			error("A Radio Question must contain at least 1 Answer!",
			SurveyPackage::eINSTANCE.radio_Answer,
			RADIO_WITH_1_ANSWER, 
			radio.answer.toString)
		}
	}
	
	//In a Survey may not have two or more Questionnaires the same ID
	@Check(CheckType.FAST)
	def IDQuestionnaire (Questionnaire questionnaire) {
		val questionnairearray = questionnaire.containingSurvey.questionnaire
			for (j: questionnairearray){
				if((questionnaire.id.equals(j.id)) && (questionnaire.id !== (j.id))) {
				error("Duplicate ID of Questionnaires.", 
				SurveyPackage::eINSTANCE.questionnaire_Id,
				ID_QUESTIONNAIRE,
				questionnaire.id)
			}
		}
	}

	//In a Questionnaire may not have two or more Parts the same ID
	@Check(CheckType.FAST)
	def IDPart (Part part){
		val partarray = part.containingQuestionnaire.part
			for (j: partarray){
				if((part.id.equals(j.id)) && (part.id !== (j.id))) {
				error("Duplicate ID of Parts.", 
				SurveyPackage::eINSTANCE.part_Id,
				ID_PART,
				part.id)
			}
		}
	}
	
	//In a Questionnaire may not have two or more Parts the same ID
	@Check(CheckType.FAST)
	def NamePart (Part part){
		val partarray = part.containingQuestionnaire.part
			for (j: partarray){
				if((part.name.equals(j.name)) && (part.name !== (j.name))) {
				error("Duplicate Name of Parts.", 
				SurveyPackage::eINSTANCE.part_Name,
				NAME_PART,
				part.name)
			}
		}
	}
	
	//In a Part may not have two or more Questions the same ID
	@Check(CheckType.FAST)
	def IDQuestion (Question question){
		val questionarray = question.containingPart.question
			for (j: questionarray){
				if((question.id.equals(j.id)) && (question.id !== (j.id))) {
				error("Duplicate ID of Questions.", 
				SurveyPackage::eINSTANCE.question_Id,
				ID_QUESTION,
				question.id)
			}
		}
	}
	
	//In a Question with type DropDown, Radio or CheckBox may not have two or more Answers the same ID
	@Check(CheckType.FAST)
	def IDAnswer (Answer answer){
		var questionTypename = ((answer.eContainer as SurveyTerminalTypes).eContainer as Question).questionType.name 
		 switch questionTypename {
		 	case "DropDown": {
		 		val answerarray = answer.containingDropDown.answer
				for (j: answerarray){
					if((answer.id.equals(j.id)) && (answer.id !== (j.id))) {
						error("Duplicate ID of Answers.", 
						SurveyPackage::eINSTANCE.answer_Id,
						ID_ANSWER,
						answer.id)
					}
				}
			}
			case "Radio": {
				val answerarray = answer.containingRadio.answer
				for (j: answerarray){
					if((answer.id.equals(j.id)) && (answer.id !== (j.id))) {
						error("Duplicate ID of Answers.", 
						SurveyPackage::eINSTANCE.answer_Id,
						ID_ANSWER,
						answer.id)
					}
		  		} 
		  	}
		  	case "CheckBox": {
		  		val answerarray = answer.containingCheckBox.answer
				for (j: answerarray){
					if((answer.id.equals(j.id)) && (answer.id !== (j.id))) {
						error("Duplicate ID of Answers.", 
						SurveyPackage::eINSTANCE.answer_Id,
						ID_ANSWER,
						answer.id)
					}
		  		} 
		  	}
		  	case "Matrix":{
		  		val answerarray = answer.containingMatrix.answer
				for (j: answerarray){
					if((answer.id.equals(j.id)) && (answer.id !== (j.id))) {
						error("Duplicate ID of Answers.", 
						SurveyPackage::eINSTANCE.answer_Id,
						ID_ANSWER,
						answer.id)
					}
		  		} 
			}	 
		}
	}

	//The Question types Textline and Textblock require a minimum text length of 3 caracters
	@Check
	def dispatch textlength (TextBlock textblock){
		if (textblock.length <= 2) {
			warning("Consider the minimal of length of textblock (3 caracters).", 
			SurveyPackage::eINSTANCE.textBlock_Length,
			TEXTLENGTH_TEXTBLOCK,
			textblock.length.toString)
		}
	}

	@Check
	def dispatch textlength (TextLine textline){
		if (textline.length <= 2) {
			warning("Consider the minimal of length of textline (3 caracters).", 
			SurveyPackage::eINSTANCE.textLine_Length,
			TEXTLENGTH_TEXTLINE,
			textline.length.toString)
		}			
	}	
}