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
			Questionnaire: "Name" {

			}
		'''.parse.assertWarning(SurveyPackage::eINSTANCE.questionnaire, 
			SurveyValidator::QUESTIONNAIRE_CONTAINS_PART,
			"A Questionnaire must contain at least 1 Part!")	
	}
	
	@Test
	def void testPartContainsQuestion(){
		'''
			Part:"Weiblich unter 30 Jahre Zigaretten"{
			Part-ID:RauchWeiblU30Ziga
			Question:"Welche Art von Zigaretten rauchen Sie lieber?"{}
		'''.parse.assertWarning(SurveyPackage::eINSTANCE.part,
			SurveyValidator::PART_CONTAINS_QUESTION,
			"A Part must contain at least 1 Question!")	
	}
}