/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency;

import de.nordakademie.mwi13a.team1.survey.survey.Answer;
import de.nordakademie.mwi13a.team1.survey.survey.MatrixQuestion;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DM Matrix Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion#getQuestion <em>Question</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion#getAnswer <em>Answer</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion#getMatrixQuestion <em>Matrix Question</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion#getMatrixScale <em>Matrix Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getDMMatrixQuestion()
 * @model
 * @generated
 */
public interface DMMatrixQuestion extends Dependency
{
  /**
   * Returns the value of the '<em><b>Question</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Question</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Question</em>' reference.
   * @see #setQuestion(MatrixQuestion)
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getDMMatrixQuestion_Question()
   * @model
   * @generated
   */
  MatrixQuestion getQuestion();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion#getQuestion <em>Question</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Question</em>' reference.
   * @see #getQuestion()
   * @generated
   */
  void setQuestion(MatrixQuestion value);

  /**
   * Returns the value of the '<em><b>Answer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Answer</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Answer</em>' reference.
   * @see #setAnswer(Answer)
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getDMMatrixQuestion_Answer()
   * @model
   * @generated
   */
  Answer getAnswer();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion#getAnswer <em>Answer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Answer</em>' reference.
   * @see #getAnswer()
   * @generated
   */
  void setAnswer(Answer value);

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
