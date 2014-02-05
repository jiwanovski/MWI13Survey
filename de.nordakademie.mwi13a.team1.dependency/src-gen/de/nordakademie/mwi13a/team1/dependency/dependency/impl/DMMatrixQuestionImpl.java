/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency.impl;

import de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion;
import de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage;

import de.nordakademie.mwi13a.team1.survey.survey.Answer;
import de.nordakademie.mwi13a.team1.survey.survey.MatrixQuestion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DM Matrix Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.DMMatrixQuestionImpl#getMatrixQuestion <em>Matrix Question</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.DMMatrixQuestionImpl#getMatrixScale <em>Matrix Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DMMatrixQuestionImpl extends MinimalEObjectImpl.Container implements DMMatrixQuestion
{
  /**
   * The cached value of the '{@link #getMatrixQuestion() <em>Matrix Question</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatrixQuestion()
   * @generated
   * @ordered
   */
  protected MatrixQuestion matrixQuestion;

  /**
   * The cached value of the '{@link #getMatrixScale() <em>Matrix Scale</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatrixScale()
   * @generated
   * @ordered
   */
  protected Answer matrixScale;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DMMatrixQuestionImpl()
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
    return DependencyPackage.Literals.DM_MATRIX_QUESTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatrixQuestion getMatrixQuestion()
  {
    if (matrixQuestion != null && matrixQuestion.eIsProxy())
    {
      InternalEObject oldMatrixQuestion = (InternalEObject)matrixQuestion;
      matrixQuestion = (MatrixQuestion)eResolveProxy(oldMatrixQuestion);
      if (matrixQuestion != oldMatrixQuestion)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependencyPackage.DM_MATRIX_QUESTION__MATRIX_QUESTION, oldMatrixQuestion, matrixQuestion));
      }
    }
    return matrixQuestion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatrixQuestion basicGetMatrixQuestion()
  {
    return matrixQuestion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMatrixQuestion(MatrixQuestion newMatrixQuestion)
  {
    MatrixQuestion oldMatrixQuestion = matrixQuestion;
    matrixQuestion = newMatrixQuestion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyPackage.DM_MATRIX_QUESTION__MATRIX_QUESTION, oldMatrixQuestion, matrixQuestion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Answer getMatrixScale()
  {
    if (matrixScale != null && matrixScale.eIsProxy())
    {
      InternalEObject oldMatrixScale = (InternalEObject)matrixScale;
      matrixScale = (Answer)eResolveProxy(oldMatrixScale);
      if (matrixScale != oldMatrixScale)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependencyPackage.DM_MATRIX_QUESTION__MATRIX_SCALE, oldMatrixScale, matrixScale));
      }
    }
    return matrixScale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Answer basicGetMatrixScale()
  {
    return matrixScale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMatrixScale(Answer newMatrixScale)
  {
    Answer oldMatrixScale = matrixScale;
    matrixScale = newMatrixScale;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyPackage.DM_MATRIX_QUESTION__MATRIX_SCALE, oldMatrixScale, matrixScale));
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
      case DependencyPackage.DM_MATRIX_QUESTION__MATRIX_QUESTION:
        if (resolve) return getMatrixQuestion();
        return basicGetMatrixQuestion();
      case DependencyPackage.DM_MATRIX_QUESTION__MATRIX_SCALE:
        if (resolve) return getMatrixScale();
        return basicGetMatrixScale();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DependencyPackage.DM_MATRIX_QUESTION__MATRIX_QUESTION:
        setMatrixQuestion((MatrixQuestion)newValue);
        return;
      case DependencyPackage.DM_MATRIX_QUESTION__MATRIX_SCALE:
        setMatrixScale((Answer)newValue);
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
      case DependencyPackage.DM_MATRIX_QUESTION__MATRIX_QUESTION:
        setMatrixQuestion((MatrixQuestion)null);
        return;
      case DependencyPackage.DM_MATRIX_QUESTION__MATRIX_SCALE:
        setMatrixScale((Answer)null);
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
      case DependencyPackage.DM_MATRIX_QUESTION__MATRIX_QUESTION:
        return matrixQuestion != null;
      case DependencyPackage.DM_MATRIX_QUESTION__MATRIX_SCALE:
        return matrixScale != null;
    }
    return super.eIsSet(featureID);
  }

} //DMMatrixQuestionImpl
