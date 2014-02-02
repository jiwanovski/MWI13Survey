/**
 */
package de.nordakademie.mwi13a.team1.survey.survey.impl;

import de.nordakademie.mwi13a.team1.survey.survey.Answer;
import de.nordakademie.mwi13a.team1.survey.survey.Radio;
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
 * An implementation of the model object '<em><b>Radio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.impl.RadioImpl#getAnswer <em>Answer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RadioImpl extends SurveyTerminalTypesImpl implements Radio
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RadioImpl()
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
    return SurveyPackage.Literals.RADIO;
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
      answer = new EObjectContainmentEList<Answer>(Answer.class, this, SurveyPackage.RADIO__ANSWER);
    }
    return answer;
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
      case SurveyPackage.RADIO__ANSWER:
        return ((InternalEList<?>)getAnswer()).basicRemove(otherEnd, msgs);
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
      case SurveyPackage.RADIO__ANSWER:
        return getAnswer();
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
      case SurveyPackage.RADIO__ANSWER:
        getAnswer().clear();
        getAnswer().addAll((Collection<? extends Answer>)newValue);
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
      case SurveyPackage.RADIO__ANSWER:
        getAnswer().clear();
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
      case SurveyPackage.RADIO__ANSWER:
        return answer != null && !answer.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RadioImpl
