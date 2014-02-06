/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bracket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.Bracket#getDependency <em>Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getBracket()
 * @model
 * @generated
 */
public interface Bracket extends Dependency
{
  /**
   * Returns the value of the '<em><b>Dependency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependency</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependency</em>' containment reference.
   * @see #setDependency(Dependency)
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getBracket_Dependency()
   * @model containment="true"
   * @generated
   */
  Dependency getDependency();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.Bracket#getDependency <em>Dependency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dependency</em>' containment reference.
   * @see #getDependency()
   * @generated
   */
  void setDependency(Dependency value);

} // Bracket
