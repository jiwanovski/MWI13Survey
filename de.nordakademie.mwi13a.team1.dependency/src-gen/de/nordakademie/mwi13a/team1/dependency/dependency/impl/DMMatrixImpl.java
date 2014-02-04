/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency.impl;

import de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrix;
import de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion;
import de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage;

import de.nordakademie.mwi13a.team1.survey.survey.Question;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DM Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.DMMatrixImpl#getMatrix <em>Matrix</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.DMMatrixImpl#getDmMatrixQuestion <em>Dm Matrix Question</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DMMatrixImpl extends DependencyImpl implements DMMatrix
{
  /**
   * The cached value of the '{@link #getMatrix() <em>Matrix</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatrix()
   * @generated
   * @ordered
   */
  protected Question matrix;

  /**
   * The cached value of the '{@link #getDmMatrixQuestion() <em>Dm Matrix Question</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDmMatrixQuestion()
   * @generated
   * @ordered
   */
  protected EList<DMMatrixQuestion> dmMatrixQuestion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DMMatrixImpl()
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
    return DependencyPackage.Literals.DM_MATRIX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Question getMatrix()
  {
    if (matrix != null && matrix.eIsProxy())
    {
      InternalEObject oldMatrix = (InternalEObject)matrix;
      matrix = (Question)eResolveProxy(oldMatrix);
      if (matrix != oldMatrix)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependencyPackage.DM_MATRIX__MATRIX, oldMatrix, matrix));
      }
    }
    return matrix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Question basicGetMatrix()
  {
    return matrix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMatrix(Question newMatrix)
  {
    Question oldMatrix = matrix;
    matrix = newMatrix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyPackage.DM_MATRIX__MATRIX, oldMatrix, matrix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DMMatrixQuestion> getDmMatrixQuestion()
  {
    if (dmMatrixQuestion == null)
    {
      dmMatrixQuestion = new EObjectContainmentEList<DMMatrixQuestion>(DMMatrixQuestion.class, this, DependencyPackage.DM_MATRIX__DM_MATRIX_QUESTION);
    }
    return dmMatrixQuestion;
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
      case DependencyPackage.DM_MATRIX__DM_MATRIX_QUESTION:
        return ((InternalEList<?>)getDmMatrixQuestion()).basicRemove(otherEnd, msgs);
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
      case DependencyPackage.DM_MATRIX__MATRIX:
        if (resolve) return getMatrix();
        return basicGetMatrix();
      case DependencyPackage.DM_MATRIX__DM_MATRIX_QUESTION:
        return getDmMatrixQuestion();
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
      case DependencyPackage.DM_MATRIX__MATRIX:
        setMatrix((Question)newValue);
        return;
      case DependencyPackage.DM_MATRIX__DM_MATRIX_QUESTION:
        getDmMatrixQuestion().clear();
        getDmMatrixQuestion().addAll((Collection<? extends DMMatrixQuestion>)newValue);
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
      case DependencyPackage.DM_MATRIX__MATRIX:
        setMatrix((Question)null);
        return;
      case DependencyPackage.DM_MATRIX__DM_MATRIX_QUESTION:
        getDmMatrixQuestion().clear();
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
      case DependencyPackage.DM_MATRIX__MATRIX:
        return matrix != null;
      case DependencyPackage.DM_MATRIX__DM_MATRIX_QUESTION:
        return dmMatrixQuestion != null && !dmMatrixQuestion.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DMMatrixImpl
