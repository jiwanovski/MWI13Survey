/**
 */
package de.nordakademie.mwi13a.team1.survey.survey;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.Question#getName <em>Name</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.Question#getId <em>Id</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.Question#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.Question#getQuestionType <em>Question Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getQuestion_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.survey.survey.Question#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getQuestion_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.survey.survey.Question#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mandatory</em>' attribute.
   * @see #setMandatory(boolean)
   * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getQuestion_Mandatory()
   * @model
   * @generated
   */
  boolean isMandatory();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.survey.survey.Question#isMandatory <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mandatory</em>' attribute.
   * @see #isMandatory()
   * @generated
   */
  void setMandatory(boolean value);

  /**
   * Returns the value of the '<em><b>Question Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Question Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Question Type</em>' containment reference.
   * @see #setQuestionType(SurveyTerminalTypes)
   * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getQuestion_QuestionType()
   * @model containment="true"
   * @generated
   */
  SurveyTerminalTypes getQuestionType();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.survey.survey.Question#getQuestionType <em>Question Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Question Type</em>' containment reference.
   * @see #getQuestionType()
   * @generated
   */
  void setQuestionType(SurveyTerminalTypes value);

} // Question
