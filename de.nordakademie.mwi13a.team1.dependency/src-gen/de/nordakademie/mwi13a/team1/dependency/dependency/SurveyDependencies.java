/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey Dependencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependencies#getSurveyDependency <em>Survey Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getSurveyDependencies()
 * @model
 * @generated
 */
public interface SurveyDependencies extends EObject
{
  /**
   * Returns the value of the '<em><b>Survey Dependency</b></em>' containment reference list.
   * The list contents are of type {@link de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Survey Dependency</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Survey Dependency</em>' containment reference list.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getSurveyDependencies_SurveyDependency()
   * @model containment="true"
   * @generated
   */
  EList<SurveyDependency> getSurveyDependency();

} // SurveyDependencies
