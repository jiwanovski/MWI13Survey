/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency;

import de.nordakademie.mwi13a.team1.survey.survey.Question;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DM Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrix#getMatrix <em>Matrix</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrix#getDmMatrixQuestion <em>Dm Matrix Question</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getDMMatrix()
 * @model
 * @generated
 */
public interface DMMatrix extends Dependency
{
  /**
   * Returns the value of the '<em><b>Matrix</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Matrix</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Matrix</em>' reference.
   * @see #setMatrix(Question)
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getDMMatrix_Matrix()
   * @model
   * @generated
   */
  Question getMatrix();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrix#getMatrix <em>Matrix</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Matrix</em>' reference.
   * @see #getMatrix()
   * @generated
   */
  void setMatrix(Question value);

  /**
   * Returns the value of the '<em><b>Dm Matrix Question</b></em>' containment reference list.
   * The list contents are of type {@link de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dm Matrix Question</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dm Matrix Question</em>' containment reference list.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getDMMatrix_DmMatrixQuestion()
   * @model containment="true"
   * @generated
   */
  EList<DMMatrixQuestion> getDmMatrixQuestion();

} // DMMatrix
