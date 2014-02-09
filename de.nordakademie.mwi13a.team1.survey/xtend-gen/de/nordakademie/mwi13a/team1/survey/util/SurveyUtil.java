package de.nordakademie.mwi13a.team1.survey.util;

import de.nordakademie.mwi13a.team1.survey.survey.Answer;
import de.nordakademie.mwi13a.team1.survey.survey.CheckBox;
import de.nordakademie.mwi13a.team1.survey.survey.DropDown;
import de.nordakademie.mwi13a.team1.survey.survey.Matrix;
import de.nordakademie.mwi13a.team1.survey.survey.Part;
import de.nordakademie.mwi13a.team1.survey.survey.Question;
import de.nordakademie.mwi13a.team1.survey.survey.Questionnaire;
import de.nordakademie.mwi13a.team1.survey.survey.Radio;
import de.nordakademie.mwi13a.team1.survey.survey.Survey;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;

@SuppressWarnings("all")
public class SurveyUtil {
  public static Survey containingSurvey(final EObject e) {
    return EcoreUtil2.<Survey>getContainerOfType(e, Survey.class);
  }
  
  public static Questionnaire containingQuestionnaire(final EObject e) {
    return EcoreUtil2.<Questionnaire>getContainerOfType(e, Questionnaire.class);
  }
  
  public static Part containingPart(final EObject e) {
    return EcoreUtil2.<Part>getContainerOfType(e, Part.class);
  }
  
  public static Question containingQuestion(final EObject e) {
    return EcoreUtil2.<Question>getContainerOfType(e, Question.class);
  }
  
  public static Answer containingAnswer(final EObject e) {
    return EcoreUtil2.<Answer>getContainerOfType(e, Answer.class);
  }
  
  public static DropDown containingDropDown(final EObject e) {
    return EcoreUtil2.<DropDown>getContainerOfType(e, DropDown.class);
  }
  
  public static CheckBox containingCheckBox(final EObject e) {
    return EcoreUtil2.<CheckBox>getContainerOfType(e, CheckBox.class);
  }
  
  public static Radio containingRadio(final EObject e) {
    return EcoreUtil2.<Radio>getContainerOfType(e, Radio.class);
  }
  
  public static Matrix containingMatrix(final EObject e) {
    return EcoreUtil2.<Matrix>getContainerOfType(e, Matrix.class);
  }
}
