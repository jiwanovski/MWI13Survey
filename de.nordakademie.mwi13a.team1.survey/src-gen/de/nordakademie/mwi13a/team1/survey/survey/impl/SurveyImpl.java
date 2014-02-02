/**
 */
package de.nordakademie.mwi13a.team1.survey.survey.impl;

import de.nordakademie.mwi13a.team1.survey.survey.Questionnaire;
import de.nordakademie.mwi13a.team1.survey.survey.Survey;
import de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage;

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
 * An implementation of the model object '<em><b>Survey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyImpl#getQuestionnaire <em>Questionnaire</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SurveyImpl extends MinimalEObjectImpl.Container implements Survey
{
  /**
   * The cached value of the '{@link #getQuestionnaire() <em>Questionnaire</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestionnaire()
   * @generated
   * @ordered
   */
  protected EList<Questionnaire> questionnaire;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SurveyImpl()
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
    return SurveyPackage.Literals.SURVEY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Questionnaire> getQuestionnaire()
  {
    if (questionnaire == null)
    {
      questionnaire = new EObjectContainmentEList<Questionnaire>(Questionnaire.class, this, SurveyPackage.SURVEY__QUESTIONNAIRE);
    }
    return questionnaire;
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
      case SurveyPackage.SURVEY__QUESTIONNAIRE:
        return ((InternalEList<?>)getQuestionnaire()).basicRemove(otherEnd, msgs);
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
      case SurveyPackage.SURVEY__QUESTIONNAIRE:
        return getQuestionnaire();
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
      case SurveyPackage.SURVEY__QUESTIONNAIRE:
        getQuestionnaire().clear();
        getQuestionnaire().addAll((Collection<? extends Questionnaire>)newValue);
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
      case SurveyPackage.SURVEY__QUESTIONNAIRE:
        getQuestionnaire().clear();
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
      case SurveyPackage.SURVEY__QUESTIONNAIRE:
        return questionnaire != null && !questionnaire.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SurveyImpl
