/**
 */
package de.nordakademie.mwi13a.team1.survey.survey;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.Question#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.Question#getType <em>Type</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.Question#getAnswer <em>Answer</em>}</li>
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
   * @see #setMandatory(String)
   * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getQuestion_Mandatory()
   * @model
   * @generated
   */
  String getMandatory();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.survey.survey.Question#getMandatory <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mandatory</em>' attribute.
   * @see #getMandatory()
   * @generated
   */
  void setMandatory(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getQuestion_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.survey.survey.Question#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Answer</b></em>' containment reference list.
   * The list contents are of type {@link de.nordakademie.mwi13a.team1.survey.survey.Answer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Answer</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Answer</em>' containment reference list.
   * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getQuestion_Answer()
   * @model containment="true"
   * @generated
   */
  EList<Answer> getAnswer();

} // Question
