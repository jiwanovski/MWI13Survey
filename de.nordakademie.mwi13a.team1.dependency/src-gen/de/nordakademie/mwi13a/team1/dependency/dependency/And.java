/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.And#getLeft <em>Left</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.And#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getAnd()
 * @model
 * @generated
 */
public interface And extends Dependency
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Dependency)
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getAnd_Left()
   * @model containment="true"
   * @generated
   */
  Dependency getLeft();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.And#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Dependency value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Dependency)
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getAnd_Right()
   * @model containment="true"
   * @generated
   */
  Dependency getRight();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.And#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Dependency value);

} // And
