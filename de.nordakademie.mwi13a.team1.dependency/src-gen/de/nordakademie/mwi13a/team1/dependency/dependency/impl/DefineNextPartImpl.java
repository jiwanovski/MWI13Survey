/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency.impl;

import de.nordakademie.mwi13a.team1.dependency.dependency.DMNextParts;
import de.nordakademie.mwi13a.team1.dependency.dependency.DefineNextPart;
import de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Define Next Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.DefineNextPartImpl#getNextParts <em>Next Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefineNextPartImpl extends PartOptionsImpl implements DefineNextPart
{
  /**
   * The cached value of the '{@link #getNextParts() <em>Next Parts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextParts()
   * @generated
   * @ordered
   */
  protected EList<DMNextParts> nextParts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefineNextPartImpl()
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
    return DependencyPackage.Literals.DEFINE_NEXT_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DMNextParts> getNextParts()
  {
    if (nextParts == null)
    {
      nextParts = new EObjectContainmentEList<DMNextParts>(DMNextParts.class, this, DependencyPackage.DEFINE_NEXT_PART__NEXT_PARTS);
    }
    return nextParts;
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
      case DependencyPackage.DEFINE_NEXT_PART__NEXT_PARTS:
        return ((InternalEList<?>)getNextParts()).basicRemove(otherEnd, msgs);
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
      case DependencyPackage.DEFINE_NEXT_PART__NEXT_PARTS:
        return getNextParts();
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
      case DependencyPackage.DEFINE_NEXT_PART__NEXT_PARTS:
        getNextParts().clear();
        getNextParts().addAll((Collection<? extends DMNextParts>)newValue);
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
      case DependencyPackage.DEFINE_NEXT_PART__NEXT_PARTS:
        getNextParts().clear();
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
      case DependencyPackage.DEFINE_NEXT_PART__NEXT_PARTS:
        return nextParts != null && !nextParts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DefineNextPartImpl
