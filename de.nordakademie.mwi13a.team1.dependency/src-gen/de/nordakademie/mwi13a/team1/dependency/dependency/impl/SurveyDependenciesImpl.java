/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency.impl;

import de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage;
import de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependencies;
import de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependency;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SurveyDependenciesImpl#getSurveyDependency <em>Survey Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SurveyDependenciesImpl extends MinimalEObjectImpl.Container implements SurveyDependencies
{
  /**
   * The cached value of the '{@link #getSurveyDependency() <em>Survey Dependency</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSurveyDependency()
   * @generated
   * @ordered
   */
  protected EList<SurveyDependency> surveyDependency;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SurveyDependenciesImpl()
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
    return DependencyPackage.Literals.SURVEY_DEPENDENCIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SurveyDependency> getSurveyDependency()
  {
    if (surveyDependency == null)
    {
      surveyDependency = new EObjectContainmentEList<SurveyDependency>(SurveyDependency.class, this, DependencyPackage.SURVEY_DEPENDENCIES__SURVEY_DEPENDENCY);
    }
    return surveyDependency;
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
      case DependencyPackage.SURVEY_DEPENDENCIES__SURVEY_DEPENDENCY:
        return ((InternalEList<?>)getSurveyDependency()).basicRemove(otherEnd, msgs);
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
      case DependencyPackage.SURVEY_DEPENDENCIES__SURVEY_DEPENDENCY:
        return getSurveyDependency();
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
      case DependencyPackage.SURVEY_DEPENDENCIES__SURVEY_DEPENDENCY:
        getSurveyDependency().clear();
        getSurveyDependency().addAll((Collection<? extends SurveyDependency>)newValue);
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
      case DependencyPackage.SURVEY_DEPENDENCIES__SURVEY_DEPENDENCY:
        getSurveyDependency().clear();
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
      case DependencyPackage.SURVEY_DEPENDENCIES__SURVEY_DEPENDENCY:
        return surveyDependency != null && !surveyDependency.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SurveyDependenciesImpl
