/**
 */
package de.nordakademie.mwi13a.team1.survey.survey.impl;

import de.nordakademie.mwi13a.team1.survey.survey.Question;
import de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage;
import de.nordakademie.mwi13a.team1.survey.survey.SurveyTerminalTypes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.impl.QuestionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.impl.QuestionImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.impl.QuestionImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.impl.QuestionImpl#getQuestionType <em>Question Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionImpl extends MinimalEObjectImpl.Container implements Question
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMandatory()
   * @generated
   * @ordered
   */
  protected static final boolean MANDATORY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMandatory()
   * @generated
   * @ordered
   */
  protected boolean mandatory = MANDATORY_EDEFAULT;

  /**
   * The cached value of the '{@link #getQuestionType() <em>Question Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestionType()
   * @generated
   * @ordered
   */
  protected SurveyTerminalTypes questionType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuestionImpl()
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
    return SurveyPackage.Literals.QUESTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.QUESTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.QUESTION__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMandatory()
  {
    return mandatory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMandatory(boolean newMandatory)
  {
    boolean oldMandatory = mandatory;
    mandatory = newMandatory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.QUESTION__MANDATORY, oldMandatory, mandatory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SurveyTerminalTypes getQuestionType()
  {
    return questionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuestionType(SurveyTerminalTypes newQuestionType, NotificationChain msgs)
  {
    SurveyTerminalTypes oldQuestionType = questionType;
    questionType = newQuestionType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SurveyPackage.QUESTION__QUESTION_TYPE, oldQuestionType, newQuestionType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuestionType(SurveyTerminalTypes newQuestionType)
  {
    if (newQuestionType != questionType)
    {
      NotificationChain msgs = null;
      if (questionType != null)
        msgs = ((InternalEObject)questionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SurveyPackage.QUESTION__QUESTION_TYPE, null, msgs);
      if (newQuestionType != null)
        msgs = ((InternalEObject)newQuestionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SurveyPackage.QUESTION__QUESTION_TYPE, null, msgs);
      msgs = basicSetQuestionType(newQuestionType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.QUESTION__QUESTION_TYPE, newQuestionType, newQuestionType));
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
      case SurveyPackage.QUESTION__QUESTION_TYPE:
        return basicSetQuestionType(null, msgs);
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
      case SurveyPackage.QUESTION__NAME:
        return getName();
      case SurveyPackage.QUESTION__ID:
        return getId();
      case SurveyPackage.QUESTION__MANDATORY:
        return isMandatory();
      case SurveyPackage.QUESTION__QUESTION_TYPE:
        return getQuestionType();
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
      case SurveyPackage.QUESTION__NAME:
        setName((String)newValue);
        return;
      case SurveyPackage.QUESTION__ID:
        setId((String)newValue);
        return;
      case SurveyPackage.QUESTION__MANDATORY:
        setMandatory((Boolean)newValue);
        return;
      case SurveyPackage.QUESTION__QUESTION_TYPE:
        setQuestionType((SurveyTerminalTypes)newValue);
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
      case SurveyPackage.QUESTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SurveyPackage.QUESTION__ID:
        setId(ID_EDEFAULT);
        return;
      case SurveyPackage.QUESTION__MANDATORY:
        setMandatory(MANDATORY_EDEFAULT);
        return;
      case SurveyPackage.QUESTION__QUESTION_TYPE:
        setQuestionType((SurveyTerminalTypes)null);
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
      case SurveyPackage.QUESTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SurveyPackage.QUESTION__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case SurveyPackage.QUESTION__MANDATORY:
        return mandatory != MANDATORY_EDEFAULT;
      case SurveyPackage.QUESTION__QUESTION_TYPE:
        return questionType != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", id: ");
    result.append(id);
    result.append(", mandatory: ");
    result.append(mandatory);
    result.append(')');
    return result.toString();
  }

} //QuestionImpl
