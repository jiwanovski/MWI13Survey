/**
 */
package de.nordakademie.mwi13a.team1.survey.survey;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.CheckBox#getAnswer <em>Answer</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getCheckBox()
 * @model
 * @generated
 */
public interface CheckBox extends SurveyTerminalTypes
{
  /**
   * Returns the value of the '<em><b>Answer</b></em>' containment reference list.
   * The list contents are of type {@link de.nordakademie.mwi13a.team1.survey.survey.Answer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Answer</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Answer</em>' containment reference list.
   * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getCheckBox_Answer()
   * @model containment="true"
   * @generated
   */
  EList<Answer> getAnswer();

} // CheckBox
