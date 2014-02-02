/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency;

import de.nordakademie.mwi13a.team1.survey.survey.Part;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SD Next Parts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDNextParts#getNextPart <em>Next Part</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDNextParts#getPartDependencies <em>Part Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getSDNextParts()
 * @model
 * @generated
 */
public interface SDNextParts extends EObject
{
  /**
   * Returns the value of the '<em><b>Next Part</b></em>' reference list.
   * The list contents are of type {@link de.nordakademie.mwi13a.team1.survey.survey.Part}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Part</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Part</em>' reference list.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getSDNextParts_NextPart()
   * @model
   * @generated
   */
  EList<Part> getNextPart();

  /**
   * Returns the value of the '<em><b>Part Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link de.nordakademie.mwi13a.team1.dependency.dependency.SDPartDependencies}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part Dependencies</em>' containment reference list.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getSDNextParts_PartDependencies()
   * @model containment="true"
   * @generated
   */
  EList<SDPartDependencies> getPartDependencies();

} // SDNextParts
