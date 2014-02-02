/**
 */
package de.nordakademie.mwi13a.team1.survey.survey;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage
 * @generated
 */
public interface SurveyFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SurveyFactory eINSTANCE = de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Survey</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Survey</em>'.
   * @generated
   */
  Survey createSurvey();

  /**
   * Returns a new object of class '<em>Questionnaire</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Questionnaire</em>'.
   * @generated
   */
  Questionnaire createQuestionnaire();

  /**
   * Returns a new object of class '<em>Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Part</em>'.
   * @generated
   */
  Part createPart();

  /**
   * Returns a new object of class '<em>Question</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Question</em>'.
   * @generated
   */
  Question createQuestion();

  /**
   * Returns a new object of class '<em>Answer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Answer</em>'.
   * @generated
   */
  Answer createAnswer();

  /**
   * Returns a new object of class '<em>Text Ln</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Ln</em>'.
   * @generated
   */
  TextLn createTextLn();

  /**
   * Returns a new object of class '<em>Text Bl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Bl</em>'.
   * @generated
   */
  TextBl createTextBl();

  /**
   * Returns a new object of class '<em>Matrix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Matrix</em>'.
   * @generated
   */
  Matrix createMatrix();

  /**
   * Returns a new object of class '<em>Combo Box</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Combo Box</em>'.
   * @generated
   */
  ComboBox createComboBox();

  /**
   * Returns a new object of class '<em>Drop Down</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Drop Down</em>'.
   * @generated
   */
  DropDown createDropDown();

  /**
   * Returns a new object of class '<em>Radio</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Radio</em>'.
   * @generated
   */
  Radio createRadio();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SurveyPackage getSurveyPackage();

} //SurveyFactory
