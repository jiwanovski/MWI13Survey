/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency;

import de.nordakademie.mwi13a.team1.survey.survey.Part;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.PartElements#getName <em>Name</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.PartElements#getNextParts <em>Next Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getPartElements()
 * @model
 * @generated
 */
public interface PartElements extends EObject
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
   * @see #setName(Part)
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getPartElements_Name()
   * @model
   * @generated
   */
  Part getName();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.PartElements#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Part value);

  /**
   * Returns the value of the '<em><b>Next Parts</b></em>' containment reference list.
   * The list contents are of type {@link de.nordakademie.mwi13a.team1.dependency.dependency.DMNextParts}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Parts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Parts</em>' containment reference list.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getPartElements_NextParts()
   * @model containment="true"
   * @generated
   */
  EList<DMNextParts> getNextParts();

} // PartElements
