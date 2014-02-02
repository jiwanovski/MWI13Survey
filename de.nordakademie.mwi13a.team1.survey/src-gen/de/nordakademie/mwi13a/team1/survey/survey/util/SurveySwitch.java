/**
 */
package de.nordakademie.mwi13a.team1.survey.survey.util;

import de.nordakademie.mwi13a.team1.survey.survey.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage
 * @generated
 */
public class SurveySwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SurveyPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SurveySwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SurveyPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SurveyPackage.SURVEY:
      {
        Survey survey = (Survey)theEObject;
        T result = caseSurvey(survey);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SurveyPackage.QUESTIONNAIRE:
      {
        Questionnaire questionnaire = (Questionnaire)theEObject;
        T result = caseQuestionnaire(questionnaire);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SurveyPackage.PART:
      {
        Part part = (Part)theEObject;
        T result = casePart(part);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SurveyPackage.QUESTION:
      {
        Question question = (Question)theEObject;
        T result = caseQuestion(question);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SurveyPackage.MATRIX_QUESTION:
      {
        MatrixQuestion matrixQuestion = (MatrixQuestion)theEObject;
        T result = caseMatrixQuestion(matrixQuestion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SurveyPackage.ANSWER:
      {
        Answer answer = (Answer)theEObject;
        T result = caseAnswer(answer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SurveyPackage.SURVEY_TERMINAL_TYPES:
      {
        SurveyTerminalTypes surveyTerminalTypes = (SurveyTerminalTypes)theEObject;
        T result = caseSurveyTerminalTypes(surveyTerminalTypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SurveyPackage.TEXT_LINE:
      {
        TextLine textLine = (TextLine)theEObject;
        T result = caseTextLine(textLine);
        if (result == null) result = caseSurveyTerminalTypes(textLine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SurveyPackage.TEXT_BLOCK:
      {
        TextBlock textBlock = (TextBlock)theEObject;
        T result = caseTextBlock(textBlock);
        if (result == null) result = caseSurveyTerminalTypes(textBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SurveyPackage.MATRIX:
      {
        Matrix matrix = (Matrix)theEObject;
        T result = caseMatrix(matrix);
        if (result == null) result = caseSurveyTerminalTypes(matrix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SurveyPackage.COMBO_BOX:
      {
        ComboBox comboBox = (ComboBox)theEObject;
        T result = caseComboBox(comboBox);
        if (result == null) result = caseSurveyTerminalTypes(comboBox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SurveyPackage.DROP_DOWN:
      {
        DropDown dropDown = (DropDown)theEObject;
        T result = caseDropDown(dropDown);
        if (result == null) result = caseSurveyTerminalTypes(dropDown);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SurveyPackage.RADIO:
      {
        Radio radio = (Radio)theEObject;
        T result = caseRadio(radio);
        if (result == null) result = caseSurveyTerminalTypes(radio);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Survey</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Survey</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSurvey(Survey object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuestionnaire(Questionnaire object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePart(Part object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Question</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuestion(Question object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Matrix Question</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Matrix Question</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatrixQuestion(MatrixQuestion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Answer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Answer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnswer(Answer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terminal Types</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terminal Types</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSurveyTerminalTypes(SurveyTerminalTypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Line</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Line</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextLine(TextLine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextBlock(TextBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Matrix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Matrix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatrix(Matrix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Combo Box</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Combo Box</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComboBox(ComboBox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drop Down</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drop Down</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDropDown(DropDown object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Radio</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Radio</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRadio(Radio object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SurveySwitch
