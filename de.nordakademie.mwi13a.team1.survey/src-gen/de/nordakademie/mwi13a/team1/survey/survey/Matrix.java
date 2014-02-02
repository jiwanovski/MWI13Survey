/**
 */
package de.nordakademie.mwi13a.team1.survey.survey;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.Matrix#getMatrixQuestion <em>Matrix Question</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getMatrix()
 * @model
 * @generated
 */
public interface Matrix extends SurveyTerminalTypes
{
  /**
   * Returns the value of the '<em><b>Matrix Question</b></em>' containment reference list.
   * The list contents are of type {@link de.nordakademie.mwi13a.team1.survey.survey.MatrixQuestion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Matrix Question</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Matrix Question</em>' containment reference list.
   * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getMatrix_MatrixQuestion()
   * @model containment="true"
   * @generated
   */
  EList<MatrixQuestion> getMatrixQuestion();

} // Matrix
