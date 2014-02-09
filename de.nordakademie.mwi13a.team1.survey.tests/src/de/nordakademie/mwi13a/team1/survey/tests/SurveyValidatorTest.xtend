package de.nordakademie.mwi13a.team1.survey.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import de.nordakademie.mwi13a.team1.survey.SurveyInjectorProvider
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import de.nordakademie.mwi13a.team1.survey.survey.Survey
import org.junit.Test
import de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage
import de.nordakademie.mwi13a.team1.survey.validation.SurveyValidator

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SurveyInjectorProvider))

class SurveyValidatorTest {
	@Inject extension ParseHelper<Survey>
	@Inject extension ValidationTestHelper
	
	@Test
	def void testQuestionnaireContainsPart() { 
		'''
			Questionnaire: "Name" {}
		'''.parse.assertWarning(SurveyPackage::eINSTANCE.questionnaire, 
			SurveyValidator::QUESTIONNAIRE_CONTAINS_PART,
			"A Questionnaire must contain at least 1 Part!")	
	}
	
	@Test
	def void testPartContainsQuestion(){
		'''
		Questionnaire:"Fragebogen Rauchen"{
			Questionnaire-ID:Rauchen
			Part:"Männlich unter 30 Zigaretten"{
				Part-ID:RauchMaennlU30Ziga
			}
		}
		'''.parse.assertWarning(SurveyPackage::eINSTANCE.part,
			SurveyValidator::PART_CONTAINS_QUESTION,
			"A Part must contain at least 1 Question!")	
	}
	
	@Test
	def void testDropDownWith2Answers(){
		'''
		Questionnaire:"Fragebogen Rauchen"{
			Questionnaire-ID:Rauchen
			Part:"Männlich unter 30 Zigaretten"{
				Part-ID:RauchMaennlU30Ziga
				Question:"Wie häufig rauchen Sie?"{
					Question-ID:RauchMaennlU30ZigaHaeuf
					Mandatory Field
					Type:DropDown{
						Answer-ID:RauchMaennlU30ZigaHaeufTaegl
						Answer:"Täglich"
					}
				}
			}
		}		
		'''.parse.assertError(SurveyPackage::eINSTANCE.dropDown,
			SurveyValidator::DROPDOWN_WITH_2_ANSWERS,
			"A DropDown Question must contain at least 2 Answers!")
	}
	
	@Test
	def void testIDQuestionnaire(){
		'''
			Questionnaire:"Fragebogen Getränke"{
				Questionnaire-ID:Getraenke
			}
			Questionnaire:"Fragebogen Rauchen"{
				Questionnaire-ID:Getraenke
			}
		'''.parse.assertError(SurveyPackage::eINSTANCE.questionnaire,
			SurveyValidator::ID_QUESTIONNAIRE,
			"Duplicate ID of Questionnaires.")
	}
	
	@Test
	def void testIDPart(){
		'''
			Questionnaire:"Fragebogen Rauchen"{
				Questionnaire-ID:Rauchen
				Part:"Personendaten"{   
					Part-ID:RauchPersonendaten
					Question:"Was denken Sie über das Rauchen in der Schwangerschaft?"{
						Question-ID:RauchWeiblU30ZigaSchwang
						Type:TextBlock(30)
					}
				}
				Part:"Männlich unter 30 Zigaretten"{
					Part-ID:RauchPersonendaten
					Question:"Was denken Sie über das Rauchen in der Schwangerschaft?"{
						Question-ID:RauchWeiblU30ZigaSchwang
						Type:TextBlock(30)
					}
				}
			}	
		'''.parse.assertError(SurveyPackage::eINSTANCE.part,
			SurveyValidator::ID_PART,
			"Duplicate ID of Parts.")
	}

		@Test
	def void testIDQuestion(){
		'''
			Questionnaire:"Fragebogen Rauchen"{
				Questionnaire-ID:Rauchen
				Part:"Sonstiges/Bewertung"{
					Part-ID:RauchSonstBew
					Question:"Haben Sie noch Gedanken zum Thema Rauchen/Zigaretten, die Sie uns mitteilen möchten?"{
						Question-ID:RauchSonstBewSonst
						Type:TextBlock(30)
					}
					Question:"Haben Sie noch Gedanken zum Thema Rauchen/Zigaretten, die Sie uns mitteilen möchten?"{
						Question-ID:RauchSonstBewSonst
						Type:TextBlock(30)
					}
				}	
			}
		'''.parse.assertError(SurveyPackage::eINSTANCE.question,
			SurveyValidator::ID_QUESTION,
			"Duplicate ID of Questions.")
	}
	
	@Test
	def void testIDAnswer(){
		'''
			Questionnaire:"Fragebogen Rauchen"{
				Questionnaire-ID:Rauchen
				Part:"Personendaten"{   
					Part-ID:RauchPersonendaten
					Question:"Was denken Sie über das Rauchen in der Schwangerschaft?"{
						Question-ID:RauchWeiblU30ZigaTyp
						Type:DropDown{
							Answer-ID:Rauch
							Answer:"Normal"
							Answer-ID:Rauch
							Answer:"Light"
						}					
					}
				}
			}
		'''.parse.assertError(SurveyPackage::eINSTANCE.answer,
			SurveyValidator::ID_ANSWER,
			"Duplicate ID of Answers.")
	}

	@Test
	def void testTextlength() { 
		'''
			Questionnaire:"Fragebogen Rauchen"{
				Questionnaire-ID:Rauchen
				Part:"Sonstiges/Bewertung"{
					Part-ID:RauchSonstBew
					Question:"Haben Sie noch Gedanken zum Thema Rauchen/Zigaretten, die Sie uns mitteilen möchten?"{
						Question-ID:RauchSonstBewSonst
						Type:TextLine(2)
					}
				}
			}	 
		'''.parse.assertWarning(SurveyPackage::eINSTANCE.textLine, 
			SurveyValidator::TEXTLENGTH_TEXTLINE,
			"Consider the minimal of length of textline (3 caracters).")	
	}
}