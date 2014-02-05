/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency;

import de.nordakademie.mwi13a.team1.survey.survey.Answer;
import de.nordakademie.mwi13a.team1.survey.survey.MatrixQuestion;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DM Matrix Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion#getMatrixQuestion <em>Matrix Question</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion#getMatrixScale <em>Matrix Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getDMMatrixQuestion()
 * @model
 * @generated
 */
public interface DMMatrixQuestion extends EObject
{
  /**
   * Returns the value of the '<em><b>Matrix Question</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Matrix Question</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Matrix Question</em>' reference.
   * @see #setMatrixQuestion(MatrixQuestion)
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getDMMatrixQuestion_MatrixQuestion()
   * @model
   * @generated
   */
  MatrixQuestion getMatrixQuestion();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion#getMatrixQuestion <em>Matrix Question</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Matrix Question</em>' reference.
   * @see #getMatrixQuestion()
   * @generated
   */
  void setMatrixQuestion(MatrixQuestion value);

  /**
   * Returns the value of the '<em><b>Matrix Scale</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Matrix Scale</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Matrix Scale</em>' reference.
   * @see #setMatrixScale(Answer)
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getDMMatrixQuestion_MatrixScale()
   * @model
   * @generated
   */
  Answer getMatrixScale();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion#getMatrixScale <em>Matrix Scale</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Matrix Scale</em>' reference.
   * @see #getMatrixScale()
   * @generated
   */
  void setMatrixScale(Answer value);

} // DMMatrixQuestion
