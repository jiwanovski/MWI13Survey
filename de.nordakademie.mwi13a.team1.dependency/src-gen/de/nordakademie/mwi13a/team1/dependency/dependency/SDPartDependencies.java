/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency;

import de.nordakademie.mwi13a.team1.survey.survey.Answer;
import de.nordakademie.mwi13a.team1.survey.survey.Question;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SD Part Dependencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDPartDependencies#getQuestion <em>Question</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDPartDependencies#getAnswer <em>Answer</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getSDPartDependencies()
 * @model
 * @generated
 */
public interface SDPartDependencies extends EObject
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
   * @see #setQuestion(Question)
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getSDPartDependencies_Question()
   * @model
   * @generated
   */
  Question getQuestion();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDPartDependencies#getQuestion <em>Question</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Question</em>' reference.
   * @see #getQuestion()
   * @generated
   */
  void setQuestion(Question value);

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
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#getSDPartDependencies_Answer()
   * @model
   * @generated
   */
  Answer getAnswer();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDPartDependencies#getAnswer <em>Answer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Answer</em>' reference.
   * @see #getAnswer()
   * @generated
   */
  void setAnswer(Answer value);

} // SDPartDependencies
