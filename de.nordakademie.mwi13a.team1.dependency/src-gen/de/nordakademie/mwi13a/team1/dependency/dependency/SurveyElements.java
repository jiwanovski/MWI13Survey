/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency;

import de.nordakademie.mwi13a.team1.survey.survey.Questionnaire;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.SurveyElements#getName <em>Name</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.SurveyElements#getPartElements <em>Part Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getSurveyElements()
 * @model
 * @generated
 */
public interface SurveyElements extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(Questionnaire)
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getSurveyElements_Name()
   * @model
   * @generated
   */
  Questionnaire getName();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SurveyElements#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Questionnaire value);

  /**
   * Returns the value of the '<em><b>Part Elements</b></em>' containment reference list.
   * The list contents are of type {@link de.nordakademie.mwi13a.team1.dependency.dependency.PartElements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part Elements</em>' containment reference list.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getSurveyElements_PartElements()
   * @model containment="true"
   * @generated
   */
  EList<PartElements> getPartElements();

} // SurveyElements
