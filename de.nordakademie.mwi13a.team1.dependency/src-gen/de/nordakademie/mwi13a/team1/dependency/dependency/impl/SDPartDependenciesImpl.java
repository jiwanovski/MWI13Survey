/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency.impl;

import de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage;
import de.nordakademie.mwi13a.team1.dependency.dependency.SDPartDependencies;

import de.nordakademie.mwi13a.team1.survey.survey.Answer;
import de.nordakademie.mwi13a.team1.survey.survey.Question;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SD Part Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SDPartDependenciesImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SDPartDependenciesImpl#getAnswer <em>Answer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SDPartDependenciesImpl extends MinimalEObjectImpl.Container implements SDPartDependencies
{
  /**
   * The cached value of the '{@link #getQuestion() <em>Question</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestion()
   * @generated
   * @ordered
   */
  protected Question question;

  /**
   * The cached value of the '{@link #getAnswer() <em>Answer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnswer()
   * @generated
   * @ordered
   */
  protected Answer answer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SDPartDependenciesImpl()
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
    return DependencyPackage.Literals.SD_PART_DEPENDENCIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Question getQuestion()
  {
    if (question != null && question.eIsProxy())
    {
      InternalEObject oldQuestion = (InternalEObject)question;
      question = (Question)eResolveProxy(oldQuestion);
      if (question != oldQuestion)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependencyPackage.SD_PART_DEPENDENCIES__QUESTION, oldQuestion, question));
      }
    }
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Question basicGetQuestion()
  {
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuestion(Question newQuestion)
  {
    Question oldQuestion = question;
    question = newQuestion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyPackage.SD_PART_DEPENDENCIES__QUESTION, oldQuestion, question));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Answer getAnswer()
  {
    if (answer != null && answer.eIsProxy())
    {
      InternalEObject oldAnswer = (InternalEObject)answer;
      answer = (Answer)eResolveProxy(oldAnswer);
      if (answer != oldAnswer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependencyPackage.SD_PART_DEPENDENCIES__ANSWER, oldAnswer, answer));
      }
    }
    return answer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Answer basicGetAnswer()
  {
    return answer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnswer(Answer newAnswer)
  {
    Answer oldAnswer = answer;
    answer = newAnswer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyPackage.SD_PART_DEPENDENCIES__ANSWER, oldAnswer, answer));
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
      case DependencyPackage.SD_PART_DEPENDENCIES__QUESTION:
        if (resolve) return getQuestion();
        return basicGetQuestion();
      case DependencyPackage.SD_PART_DEPENDENCIES__ANSWER:
        if (resolve) return getAnswer();
        return basicGetAnswer();
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
      case DependencyPackage.SD_PART_DEPENDENCIES__QUESTION:
        setQuestion((Question)newValue);
        return;
      case DependencyPackage.SD_PART_DEPENDENCIES__ANSWER:
        setAnswer((Answer)newValue);
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
      case DependencyPackage.SD_PART_DEPENDENCIES__QUESTION:
        setQuestion((Question)null);
        return;
      case DependencyPackage.SD_PART_DEPENDENCIES__ANSWER:
        setAnswer((Answer)null);
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
      case DependencyPackage.SD_PART_DEPENDENCIES__QUESTION:
        return question != null;
      case DependencyPackage.SD_PART_DEPENDENCIES__ANSWER:
        return answer != null;
    }
    return super.eIsSet(featureID);
  }

} //SDPartDependenciesImpl
