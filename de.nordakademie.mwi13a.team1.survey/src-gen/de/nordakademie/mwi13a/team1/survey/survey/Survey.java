/**
 */
package de.nordakademie.mwi13a.team1.survey.survey;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.Survey#getQuestionnaire <em>Questionnaire</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getSurvey()
 * @model
 * @generated
 */
public interface Survey extends EObject
{
  /**
   * Returns the value of the '<em><b>Questionnaire</b></em>' containment reference list.
   * The list contents are of type {@link de.nordakademie.mwi13a.team1.survey.survey.Questionnaire}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Questionnaire</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Questionnaire</em>' containment reference list.
   * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getSurvey_Questionnaire()
   * @model containment="true"
   * @generated
   */
  EList<Questionnaire> getQuestionnaire();

} // Survey
