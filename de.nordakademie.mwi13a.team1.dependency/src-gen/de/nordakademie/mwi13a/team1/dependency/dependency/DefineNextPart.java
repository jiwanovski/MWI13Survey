/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Define Next Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.DefineNextPart#getNextParts <em>Next Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getDefineNextPart()
 * @model
 * @generated
 */
public interface DefineNextPart extends PartOptions
{
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
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getDefineNextPart_NextParts()
   * @model containment="true"
   * @generated
   */
  EList<DMNextParts> getNextParts();

} // DefineNextPart
