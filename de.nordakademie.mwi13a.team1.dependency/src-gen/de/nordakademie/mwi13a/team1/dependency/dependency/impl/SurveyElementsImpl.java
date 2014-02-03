/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency.impl;

import de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage;
import de.nordakademie.mwi13a.team1.dependency.dependency.PartElements;
import de.nordakademie.mwi13a.team1.dependency.dependency.SurveyElements;

import de.nordakademie.mwi13a.team1.survey.survey.Questionnaire;

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
 * An implementation of the model object '<em><b>Survey Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SurveyElementsImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SurveyElementsImpl#getPartElements <em>Part Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SurveyElementsImpl extends MinimalEObjectImpl.Container implements SurveyElements
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Questionnaire name;

  /**
   * The cached value of the '{@link #getPartElements() <em>Part Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartElements()
   * @generated
   * @ordered
   */
  protected EList<PartElements> partElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SurveyElementsImpl()
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
    return DependencyPackage.Literals.SURVEY_ELEMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Questionnaire getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (Questionnaire)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependencyPackage.SURVEY_ELEMENTS__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Questionnaire basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Questionnaire newName)
  {
    Questionnaire oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyPackage.SURVEY_ELEMENTS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PartElements> getPartElements()
  {
    if (partElements == null)
    {
      partElements = new EObjectContainmentEList<PartElements>(PartElements.class, this, DependencyPackage.SURVEY_ELEMENTS__PART_ELEMENTS);
    }
    return partElements;
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
      case DependencyPackage.SURVEY_ELEMENTS__PART_ELEMENTS:
        return ((InternalEList<?>)getPartElements()).basicRemove(otherEnd, msgs);
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
      case DependencyPackage.SURVEY_ELEMENTS__NAME:
        if (resolve) return getName();
        return basicGetName();
      case DependencyPackage.SURVEY_ELEMENTS__PART_ELEMENTS:
        return getPartElements();
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
      case DependencyPackage.SURVEY_ELEMENTS__NAME:
        setName((Questionnaire)newValue);
        return;
      case DependencyPackage.SURVEY_ELEMENTS__PART_ELEMENTS:
        getPartElements().clear();
        getPartElements().addAll((Collection<? extends PartElements>)newValue);
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
      case DependencyPackage.SURVEY_ELEMENTS__NAME:
        setName((Questionnaire)null);
        return;
      case DependencyPackage.SURVEY_ELEMENTS__PART_ELEMENTS:
        getPartElements().clear();
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
      case DependencyPackage.SURVEY_ELEMENTS__NAME:
        return name != null;
      case DependencyPackage.SURVEY_ELEMENTS__PART_ELEMENTS:
        return partElements != null && !partElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SurveyElementsImpl
