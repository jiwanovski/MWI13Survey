/**
 */
package de.nordakademie.mwi13a.team1.survey.survey;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.Part#getName <em>Name</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.Part#getId <em>Id</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.Part#getQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getPart()
 * @model
 * @generated
 */
public interface Part extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getPart_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.survey.survey.Part#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getPart_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link de.nordakademie.mwi13a.team1.survey.survey.Part#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Question</b></em>' containment reference list.
   * The list contents are of type {@link de.nordakademie.mwi13a.team1.survey.survey.Question}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Question</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Question</em>' containment reference list.
   * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#getPart_Question()
   * @model containment="true"
   * @generated
   */
  EList<Question> getQuestion();

} // Part
