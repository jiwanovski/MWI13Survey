package de.nordakademie.mwi13a.team1.survey.tests;

import com.google.inject.Inject;
import de.nordakademie.mwi13a.team1.survey.SurveyInjectorProvider;
import de.nordakademie.mwi13a.team1.survey.survey.Survey;
import de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage;
import de.nordakademie.mwi13a.team1.survey.validation.SurveyValidator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SurveyInjectorProvider.class)
@SuppressWarnings("all")
public class SurveyValidatorTest {
  @Inject
  @Extension
  private ParseHelper<Survey> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testQuestionnaireContainsPart() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Questionnaire: \"Name\" {");
      _builder.newLine();
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Survey _parse = this._parseHelper.parse(_builder);
      EClass _questionnaire = SurveyPackage.eINSTANCE.getQuestionnaire();
      this._validationTestHelper.assertWarning(_parse, _questionnaire, 
        SurveyValidator.QUESTIONNAIRE_CONTAINS_PART, 
        "A Questionnaire must contain at least 1 Part!");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testPartContainsQuestion() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Part:\"Weiblich unter 30 Jahre Zigaretten\"{");
      _builder.newLine();
      _builder.append("Part-ID:RauchWeiblU30Ziga");
      _builder.newLine();
      _builder.append("Question:\"Welche Art von Zigaretten rauchen Sie lieber?\"{}");
      _builder.newLine();
      Survey _parse = this._parseHelper.parse(_builder);
      EClass _part = SurveyPackage.eINSTANCE.getPart();
      this._validationTestHelper.assertWarning(_parse, _part, 
        SurveyValidator.PART_CONTAINS_QUESTION, 
        "A Part must contain at least 1 Question!");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
