/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency.impl;

import de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage;
import de.nordakademie.mwi13a.team1.dependency.dependency.SDNextParts;
import de.nordakademie.mwi13a.team1.dependency.dependency.SDPart;

import de.nordakademie.mwi13a.team1.survey.survey.Part;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SD Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SDPartImpl#getPart2 <em>Part2</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SDPartImpl#getDefaultNextPart <em>Default Next Part</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SDPartImpl#getNextParts <em>Next Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SDPartImpl extends MinimalEObjectImpl.Container implements SDPart
{
  /**
   * The cached value of the '{@link #getPart2() <em>Part2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPart2()
   * @generated
   * @ordered
   */
  protected Part part2;

  /**
   * The cached value of the '{@link #getDefaultNextPart() <em>Default Next Part</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultNextPart()
   * @generated
   * @ordered
   */
  protected Part defaultNextPart;

  /**
   * The cached value of the '{@link #getNextParts() <em>Next Parts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextParts()
   * @generated
   * @ordered
   */
  protected EList<SDNextParts> nextParts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SDPartImpl()
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
    return DependencyPackage.Literals.SD_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Part getPart2()
  {
    if (part2 != null && part2.eIsProxy())
    {
      InternalEObject oldPart2 = (InternalEObject)part2;
      part2 = (Part)eResolveProxy(oldPart2);
      if (part2 != oldPart2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependencyPackage.SD_PART__PART2, oldPart2, part2));
      }
    }
    return part2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Part basicGetPart2()
  {
    return part2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPart2(Part newPart2)
  {
    Part oldPart2 = part2;
    part2 = newPart2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyPackage.SD_PART__PART2, oldPart2, part2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Part getDefaultNextPart()
  {
    if (defaultNextPart != null && defaultNextPart.eIsProxy())
    {
      InternalEObject oldDefaultNextPart = (InternalEObject)defaultNextPart;
      defaultNextPart = (Part)eResolveProxy(oldDefaultNextPart);
      if (defaultNextPart != oldDefaultNextPart)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependencyPackage.SD_PART__DEFAULT_NEXT_PART, oldDefaultNextPart, defaultNextPart));
      }
    }
    return defaultNextPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Part basicGetDefaultNextPart()
  {
    return defaultNextPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultNextPart(Part newDefaultNextPart)
  {
    Part oldDefaultNextPart = defaultNextPart;
    defaultNextPart = newDefaultNextPart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyPackage.SD_PART__DEFAULT_NEXT_PART, oldDefaultNextPart, defaultNextPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SDNextParts> getNextParts()
  {
    if (nextParts == null)
    {
      nextParts = new EObjectContainmentEList<SDNextParts>(SDNextParts.class, this, DependencyPackage.SD_PART__NEXT_PARTS);
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
      case DependencyPackage.SD_PART__NEXT_PARTS:
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
      case DependencyPackage.SD_PART__PART2:
        if (resolve) return getPart2();
        return basicGetPart2();
      case DependencyPackage.SD_PART__DEFAULT_NEXT_PART:
        if (resolve) return getDefaultNextPart();
        return basicGetDefaultNextPart();
      case DependencyPackage.SD_PART__NEXT_PARTS:
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
      case DependencyPackage.SD_PART__PART2:
        setPart2((Part)newValue);
        return;
      case DependencyPackage.SD_PART__DEFAULT_NEXT_PART:
        setDefaultNextPart((Part)newValue);
        return;
      case DependencyPackage.SD_PART__NEXT_PARTS:
        getNextParts().clear();
        getNextParts().addAll((Collection<? extends SDNextParts>)newValue);
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
      case DependencyPackage.SD_PART__PART2:
        setPart2((Part)null);
        return;
      case DependencyPackage.SD_PART__DEFAULT_NEXT_PART:
        setDefaultNextPart((Part)null);
        return;
      case DependencyPackage.SD_PART__NEXT_PARTS:
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
      case DependencyPackage.SD_PART__PART2:
        return part2 != null;
      case DependencyPackage.SD_PART__DEFAULT_NEXT_PART:
        return defaultNextPart != null;
      case DependencyPackage.SD_PART__NEXT_PARTS:
        return nextParts != null && !nextParts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SDPartImpl
