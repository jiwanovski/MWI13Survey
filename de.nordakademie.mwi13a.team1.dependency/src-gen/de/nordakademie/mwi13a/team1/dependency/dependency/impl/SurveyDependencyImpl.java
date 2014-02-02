/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency.impl;

import de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage;
import de.nordakademie.mwi13a.team1.dependency.dependency.SDPart;
import de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependency;

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
 * An implementation of the model object '<em><b>Survey Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SurveyDependencyImpl#getSurvey <em>Survey</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SurveyDependencyImpl#getPart <em>Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SurveyDependencyImpl extends MinimalEObjectImpl.Container implements SurveyDependency
{
  /**
   * The cached value of the '{@link #getSurvey() <em>Survey</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSurvey()
   * @generated
   * @ordered
   */
  protected Questionnaire survey;

  /**
   * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPart()
   * @generated
   * @ordered
   */
  protected EList<SDPart> part;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SurveyDependencyImpl()
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
    return DependencyPackage.Literals.SURVEY_DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Questionnaire getSurvey()
  {
    if (survey != null && survey.eIsProxy())
    {
      InternalEObject oldSurvey = (InternalEObject)survey;
      survey = (Questionnaire)eResolveProxy(oldSurvey);
      if (survey != oldSurvey)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependencyPackage.SURVEY_DEPENDENCY__SURVEY, oldSurvey, survey));
      }
    }
    return survey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Questionnaire basicGetSurvey()
  {
    return survey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSurvey(Questionnaire newSurvey)
  {
    Questionnaire oldSurvey = survey;
    survey = newSurvey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyPackage.SURVEY_DEPENDENCY__SURVEY, oldSurvey, survey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SDPart> getPart()
  {
    if (part == null)
    {
      part = new EObjectContainmentEList<SDPart>(SDPart.class, this, DependencyPackage.SURVEY_DEPENDENCY__PART);
    }
    return part;
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
      case DependencyPackage.SURVEY_DEPENDENCY__PART:
        return ((InternalEList<?>)getPart()).basicRemove(otherEnd, msgs);
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
      case DependencyPackage.SURVEY_DEPENDENCY__SURVEY:
        if (resolve) return getSurvey();
        return basicGetSurvey();
      case DependencyPackage.SURVEY_DEPENDENCY__PART:
        return getPart();
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
      case DependencyPackage.SURVEY_DEPENDENCY__SURVEY:
        setSurvey((Questionnaire)newValue);
        return;
      case DependencyPackage.SURVEY_DEPENDENCY__PART:
        getPart().clear();
        getPart().addAll((Collection<? extends SDPart>)newValue);
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
      case DependencyPackage.SURVEY_DEPENDENCY__SURVEY:
        setSurvey((Questionnaire)null);
        return;
      case DependencyPackage.SURVEY_DEPENDENCY__PART:
        getPart().clear();
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
      case DependencyPackage.SURVEY_DEPENDENCY__SURVEY:
        return survey != null;
      case DependencyPackage.SURVEY_DEPENDENCY__PART:
        return part != null && !part.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SurveyDependencyImpl
