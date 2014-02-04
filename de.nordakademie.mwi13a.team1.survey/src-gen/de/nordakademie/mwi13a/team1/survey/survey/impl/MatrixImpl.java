/**
 */
package de.nordakademie.mwi13a.team1.survey.survey.impl;

import de.nordakademie.mwi13a.team1.survey.survey.Answer;
import de.nordakademie.mwi13a.team1.survey.survey.Matrix;
import de.nordakademie.mwi13a.team1.survey.survey.MatrixQuestion;
import de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.impl.MatrixImpl#getAnswer <em>Answer</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.impl.MatrixImpl#getMatrixQuestion <em>Matrix Question</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatrixImpl extends SurveyTerminalTypesImpl implements Matrix
{
  /**
   * The cached value of the '{@link #getAnswer() <em>Answer</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnswer()
   * @generated
   * @ordered
   */
  protected EList<Answer> answer;

  /**
   * The cached value of the '{@link #getMatrixQuestion() <em>Matrix Question</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatrixQuestion()
   * @generated
   * @ordered
   */
  protected EList<MatrixQuestion> matrixQuestion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MatrixImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SurveyPackage.Literals.MATRIX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Answer> getAnswer()
  {
    if (answer == null)
    {
      answer = new EObjectContainmentEList<Answer>(Answer.class, this, SurveyPackage.MATRIX__ANSWER);
    }
    return answer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MatrixQuestion> getMatrixQuestion()
  {
    if (matrixQuestion == null)
    {
      matrixQuestion = new EObjectContainmentEList<MatrixQuestion>(MatrixQuestion.class, this, SurveyPackage.MATRIX__MATRIX_QUESTION);
    }
    return matrixQuestion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SurveyPackage.MATRIX__ANSWER:
        return ((InternalEList<?>)getAnswer()).basicRemove(otherEnd, msgs);
      case SurveyPackage.MATRIX__MATRIX_QUESTION:
        return ((InternalEList<?>)getMatrixQuestion()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SurveyPackage.MATRIX__ANSWER:
        return getAnswer();
      case SurveyPackage.MATRIX__MATRIX_QUESTION:
        return getMatrixQuestion();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SurveyPackage.MATRIX__ANSWER:
        getAnswer().clear();
        getAnswer().addAll((Collection<? extends Answer>)newValue);
        return;
      case SurveyPackage.MATRIX__MATRIX_QUESTION:
        getMatrixQuestion().clear();
        getMatrixQuestion().addAll((Collection<? extends MatrixQuestion>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SurveyPackage.MATRIX__ANSWER:
        getAnswer().clear();
        return;
      case SurveyPackage.MATRIX__MATRIX_QUESTION:
        getMatrixQuestion().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SurveyPackage.MATRIX__ANSWER:
        return answer != null && !answer.isEmpty();
      case SurveyPackage.MATRIX__MATRIX_QUESTION:
        return matrixQuestion != null && !matrixQuestion.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MatrixImpl
