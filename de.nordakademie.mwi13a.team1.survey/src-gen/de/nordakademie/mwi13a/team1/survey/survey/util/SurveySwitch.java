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
      case SurveyPackage.ANSWER:
      {
        Answer answer = (Answer)theEObject;
        T result = caseAnswer(answer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SurveyPackage.TEXT_LN:
      {
        TextLn textLn = (TextLn)theEObject;
        T result = caseTextLn(textLn);
        if (result == null) result = caseType(textLn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SurveyPackage.TEXT_BL:
      {
        TextBl textBl = (TextBl)theEObject;
        T result = caseTextBl(textBl);
        if (result == null) result = caseType(textBl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SurveyPackage.MATRIX:
      {
        Matrix matrix = (Matrix)theEObject;
        T result = caseMatrix(matrix);
        if (result == null) result = caseType(matrix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SurveyPackage.COMBO_BOX:
      {
        ComboBox comboBox = (ComboBox)theEObject;
        T result = caseComboBox(comboBox);
        if (result == null) result = caseType(comboBox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SurveyPackage.DROP_DOWN:
      {
        DropDown dropDown = (DropDown)theEObject;
        T result = caseDropDown(dropDown);
        if (result == null) result = caseType(dropDown);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SurveyPackage.RADIO:
      {
        Radio radio = (Radio)theEObject;
        T result = caseRadio(radio);
        if (result == null) result = caseType(radio);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SurveyPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
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
   * Returns the result of interpreting the object as an instance of '<em>Text Ln</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Ln</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextLn(TextLn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Bl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Bl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextBl(TextBl object)
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
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
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
