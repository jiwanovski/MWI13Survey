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
    Survey _containerOfType = EcoreUtil2.<Survey>getContainerOfType(e, Survey.class);
    return _containerOfType;
  }
  
  public static Questionnaire containingQuestionnaire(final EObject e) {
    Questionnaire _containerOfType = EcoreUtil2.<Questionnaire>getContainerOfType(e, Questionnaire.class);
    return _containerOfType;
  }
  
  public static Part containingPart(final EObject e) {
    Part _containerOfType = EcoreUtil2.<Part>getContainerOfType(e, Part.class);
    return _containerOfType;
  }
  
  public static Question containingQuestion(final EObject e) {
    Question _containerOfType = EcoreUtil2.<Question>getContainerOfType(e, Question.class);
    return _containerOfType;
  }
  
  public static Answer containingAnswer(final EObject e) {
    Answer _containerOfType = EcoreUtil2.<Answer>getContainerOfType(e, Answer.class);
    return _containerOfType;
  }
  
  public static DropDown containingDropDown(final EObject e) {
    DropDown _containerOfType = EcoreUtil2.<DropDown>getContainerOfType(e, DropDown.class);
    return _containerOfType;
  }
  
  public static CheckBox containingCheckBox(final EObject e) {
    CheckBox _containerOfType = EcoreUtil2.<CheckBox>getContainerOfType(e, CheckBox.class);
    return _containerOfType;
  }
  
  public static Radio containingRadio(final EObject e) {
    Radio _containerOfType = EcoreUtil2.<Radio>getContainerOfType(e, Radio.class);
    return _containerOfType;
  }
  
  public static Matrix containingMatrix(final EObject e) {
    Matrix _containerOfType = EcoreUtil2.<Matrix>getContainerOfType(e, Matrix.class);
    return _containerOfType;
  }
}
