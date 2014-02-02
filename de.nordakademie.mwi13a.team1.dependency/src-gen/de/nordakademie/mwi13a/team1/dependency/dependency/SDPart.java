/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency;

import de.nordakademie.mwi13a.team1.survey.survey.Part;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SD Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDPart#getPart2 <em>Part2</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDPart#getDefaultNextPart <em>Default Next Part</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDPart#getNextParts <em>Next Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getSDPart()
 * @model
 * @generated
 */
public interface SDPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Part2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part2</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part2</em>' reference.
   * @see #setPart2(Part)
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getSDPart_Part2()
   * @model
   * @generated
   */
  Part getPart2();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDPart#getPart2 <em>Part2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part2</em>' reference.
   * @see #getPart2()
   * @generated
   */
  void setPart2(Part value);

  /**
   * Returns the value of the '<em><b>Default Next Part</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Next Part</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Next Part</em>' reference.
   * @see #setDefaultNextPart(Part)
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getSDPart_DefaultNextPart()
   * @model
   * @generated
   */
  Part getDefaultNextPart();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDPart#getDefaultNextPart <em>Default Next Part</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Next Part</em>' reference.
   * @see #getDefaultNextPart()
   * @generated
   */
  void setDefaultNextPart(Part value);

  /**
   * Returns the value of the '<em><b>Next Parts</b></em>' containment reference list.
   * The list contents are of type {@link de.nordakademie.mwi13a.team1.dependency.dependency.SDNextParts}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Parts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Parts</em>' containment reference list.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getSDPart_NextParts()
   * @model containment="true"
   * @generated
   */
  EList<SDNextParts> getNextParts();

} // SDPart
