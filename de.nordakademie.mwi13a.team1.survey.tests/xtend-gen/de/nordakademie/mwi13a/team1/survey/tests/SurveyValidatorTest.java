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
      _builder.append("Questionnaire: \"Name\" {}");
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
      _builder.append("Questionnaire:\"Fragebogen Rauchen\"{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Questionnaire-ID:Rauchen");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Part:\"Männlich unter 30 Zigaretten\"{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Part-ID:RauchMaennlU30Ziga");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
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
  
  @Test
  public void testDropDownWith2Answers() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Questionnaire:\"Fragebogen Rauchen\"{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Questionnaire-ID:Rauchen");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Part:\"Männlich unter 30 Zigaretten\"{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Part-ID:RauchMaennlU30Ziga");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Question:\"Wie häufig rauchen Sie?\"{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Question-ID:RauchMaennlU30ZigaHaeuf");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Mandatory Field");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Type:DropDown{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("Answer-ID:RauchMaennlU30ZigaHaeufTaegl");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("Answer:\"Täglich\"");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}\t\t");
      _builder.newLine();
      Survey _parse = this._parseHelper.parse(_builder);
      EClass _dropDown = SurveyPackage.eINSTANCE.getDropDown();
      this._validationTestHelper.assertError(_parse, _dropDown, 
        SurveyValidator.DROPDOWN_WITH_2_ANSWERS, 
        "A DropDown Question must contain at least 2 Answers!");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIDQuestionnaire() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Questionnaire:\"Fragebogen Getränke\"{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Questionnaire-ID:Getraenke");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("Questionnaire:\"Fragebogen Rauchen\"{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Questionnaire-ID:Getraenke");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Survey _parse = this._parseHelper.parse(_builder);
      EClass _questionnaire = SurveyPackage.eINSTANCE.getQuestionnaire();
      this._validationTestHelper.assertError(_parse, _questionnaire, 
        SurveyValidator.ID_QUESTIONNAIRE, 
        "Duplicate ID of Questionnaires.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIDPart() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Questionnaire:\"Fragebogen Rauchen\"{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Questionnaire-ID:Rauchen");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Part:\"Personendaten\"{   ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Part-ID:RauchPersonendaten");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Question:\"Was denken Sie über das Rauchen in der Schwangerschaft?\"{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Question-ID:RauchWeiblU30ZigaSchwang");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Type:TextBlock(30)");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Part:\"Männlich unter 30 Zigaretten\"{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Part-ID:RauchPersonendaten");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Question:\"Was denken Sie über das Rauchen in der Schwangerschaft?\"{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Question-ID:RauchWeiblU30ZigaSchwang");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Type:TextBlock(30)");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}\t");
      _builder.newLine();
      Survey _parse = this._parseHelper.parse(_builder);
      EClass _part = SurveyPackage.eINSTANCE.getPart();
      this._validationTestHelper.assertError(_parse, _part, 
        SurveyValidator.ID_PART, 
        "Duplicate ID of Parts.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIDQuestion() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Questionnaire:\"Fragebogen Rauchen\"{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Questionnaire-ID:Rauchen");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Part:\"Sonstiges/Bewertung\"{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Part-ID:RauchSonstBew");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Question:\"Haben Sie noch Gedanken zum Thema Rauchen/Zigaretten, die Sie uns mitteilen möchten?\"{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Question-ID:RauchSonstBewSonst");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Type:TextBlock(30)");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Question:\"Haben Sie noch Gedanken zum Thema Rauchen/Zigaretten, die Sie uns mitteilen möchten?\"{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Question-ID:RauchSonstBewSonst");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Type:TextBlock(30)");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Survey _parse = this._parseHelper.parse(_builder);
      EClass _question = SurveyPackage.eINSTANCE.getQuestion();
      this._validationTestHelper.assertError(_parse, _question, 
        SurveyValidator.ID_QUESTION, 
        "Duplicate ID of Questions.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIDAnswer() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Questionnaire:\"Fragebogen Rauchen\"{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Questionnaire-ID:Rauchen");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Part:\"Personendaten\"{   ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Part-ID:RauchPersonendaten");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Question:\"Was denken Sie über das Rauchen in der Schwangerschaft?\"{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Question-ID:RauchWeiblU30ZigaTyp");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Type:DropDown{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("Answer-ID:Rauch");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("Answer:\"Normal\"");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("Answer-ID:Rauch");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("Answer:\"Light\"");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}\t\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Survey _parse = this._parseHelper.parse(_builder);
      EClass _answer = SurveyPackage.eINSTANCE.getAnswer();
      this._validationTestHelper.assertError(_parse, _answer, 
        SurveyValidator.ID_ANSWER, 
        "Duplicate ID of Answers.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTextlength() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Questionnaire:\"Fragebogen Rauchen\"{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Questionnaire-ID:Rauchen");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Part:\"Sonstiges/Bewertung\"{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Part-ID:RauchSonstBew");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Question:\"Haben Sie noch Gedanken zum Thema Rauchen/Zigaretten, die Sie uns mitteilen möchten?\"{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Question-ID:RauchSonstBewSonst");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Type:TextLine(2)");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}\t ");
      _builder.newLine();
      Survey _parse = this._parseHelper.parse(_builder);
      EClass _textLine = SurveyPackage.eINSTANCE.getTextLine();
      this._validationTestHelper.assertWarning(_parse, _textLine, 
        SurveyValidator.TEXTLENGTH_TEXTLINE, 
        "Consider the minimal of length of textline (3 caracters).");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
