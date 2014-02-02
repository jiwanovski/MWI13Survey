/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency;

import de.nordakademie.mwi13a.team1.survey.survey.Questionnaire;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependency#getSurvey <em>Survey</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependency#getPart <em>Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getSurveyDependency()
 * @model
 * @generated
 */
public interface SurveyDependency extends EObject
{
  /**
   * Returns the value of the '<em><b>Survey</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Survey</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Survey</em>' reference.
   * @see #setSurvey(Questionnaire)
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getSurveyDependency_Survey()
   * @model
   * @generated
   */
  Questionnaire getSurvey();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependency#getSurvey <em>Survey</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Survey</em>' reference.
   * @see #getSurvey()
   * @generated
   */
  void setSurvey(Questionnaire value);

  /**
   * Returns the value of the '<em><b>Part</b></em>' containment reference list.
   * The list contents are of type {@link de.nordakademie.mwi13a.team1.dependency.dependency.SDPart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part</em>' containment reference list.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getSurveyDependency_Part()
   * @model containment="true"
   * @generated
   */
  EList<SDPart> getPart();

} // SurveyDependency
