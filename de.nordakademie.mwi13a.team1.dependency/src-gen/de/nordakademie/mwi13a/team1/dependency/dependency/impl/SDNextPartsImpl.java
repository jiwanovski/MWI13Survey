/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency.impl;

import de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage;
import de.nordakademie.mwi13a.team1.dependency.dependency.SDNextParts;
import de.nordakademie.mwi13a.team1.dependency.dependency.SDPartDependencies;

import de.nordakademie.mwi13a.team1.survey.survey.Part;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SD Next Parts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SDNextPartsImpl#getNextPart <em>Next Part</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SDNextPartsImpl#getPartDependencies <em>Part Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SDNextPartsImpl extends MinimalEObjectImpl.Container implements SDNextParts
{
  /**
   * The cached value of the '{@link #getNextPart() <em>Next Part</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextPart()
   * @generated
   * @ordered
   */
  protected EList<Part> nextPart;

  /**
   * The cached value of the '{@link #getPartDependencies() <em>Part Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartDependencies()
   * @generated
   * @ordered
   */
  protected EList<SDPartDependencies> partDependencies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SDNextPartsImpl()
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
    return DependencyPackage.Literals.SD_NEXT_PARTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Part> getNextPart()
  {
    if (nextPart == null)
    {
      nextPart = new EObjectResolvingEList<Part>(Part.class, this, DependencyPackage.SD_NEXT_PARTS__NEXT_PART);
    }
    return nextPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SDPartDependencies> getPartDependencies()
  {
    if (partDependencies == null)
    {
      partDependencies = new EObjectContainmentEList<SDPartDependencies>(SDPartDependencies.class, this, DependencyPackage.SD_NEXT_PARTS__PART_DEPENDENCIES);
    }
    return partDependencies;
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
      case DependencyPackage.SD_NEXT_PARTS__PART_DEPENDENCIES:
        return ((InternalEList<?>)getPartDependencies()).basicRemove(otherEnd, msgs);
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
      case DependencyPackage.SD_NEXT_PARTS__NEXT_PART:
        return getNextPart();
      case DependencyPackage.SD_NEXT_PARTS__PART_DEPENDENCIES:
        return getPartDependencies();
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
      case DependencyPackage.SD_NEXT_PARTS__NEXT_PART:
        getNextPart().clear();
        getNextPart().addAll((Collection<? extends Part>)newValue);
        return;
      case DependencyPackage.SD_NEXT_PARTS__PART_DEPENDENCIES:
        getPartDependencies().clear();
        getPartDependencies().addAll((Collection<? extends SDPartDependencies>)newValue);
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
      case DependencyPackage.SD_NEXT_PARTS__NEXT_PART:
        getNextPart().clear();
        return;
      case DependencyPackage.SD_NEXT_PARTS__PART_DEPENDENCIES:
        getPartDependencies().clear();
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
      case DependencyPackage.SD_NEXT_PARTS__NEXT_PART:
        return nextPart != null && !nextPart.isEmpty();
      case DependencyPackage.SD_NEXT_PARTS__PART_DEPENDENCIES:
        return partDependencies != null && !partDependencies.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SDNextPartsImpl
