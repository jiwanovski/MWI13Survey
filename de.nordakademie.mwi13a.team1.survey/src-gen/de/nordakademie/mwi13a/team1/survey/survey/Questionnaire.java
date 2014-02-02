/**
 */
package de.nordakademie.mwi13a.team1.survey.survey;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.Questionnaire#getName <em>Name</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.Questionnaire#getId <em>Id</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.Questionnaire#getPart <em>Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getQuestionnaire()
 * @model
 * @generated
 */
public interface Questionnaire extends EObject
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
   * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getQuestionnaire_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.survey.survey.Questionnaire#getName <em>Name</em>}' attribute.
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
   * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getQuestionnaire_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.survey.survey.Questionnaire#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Part</b></em>' containment reference list.
   * The list contents are of type {@link de.nordakademie.mwi13a.team1.survey.survey.Part}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part</em>' containment reference list.
   * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getQuestionnaire_Part()
   * @model containment="true"
   * @generated
   */
  EList<Part> getPart();

} // Questionnaire
