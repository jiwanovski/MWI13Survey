/**
 */
package de.nordakademie.mwi13a.team1.survey.survey.impl;

import de.nordakademie.mwi13a.team1.survey.survey.Answer;
import de.nordakademie.mwi13a.team1.survey.survey.Question;
import de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage;
import de.nordakademie.mwi13a.team1.survey.survey.Type;

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
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.impl.QuestionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.impl.QuestionImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.impl.QuestionImpl#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.impl.QuestionImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.nordakademie.mwi13a.team1.survey.survey.impl.QuestionImpl#getAnswer <em>Answer</em>}</li>
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
   * The default value of the '{@link #getMandatory() <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMandatory()
   * @generated
   * @ordered
   */
  protected static final String MANDATORY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMandatory() <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMandatory()
   * @generated
   * @ordered
   */
  protected String mandatory = MANDATORY_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

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
  public String getMandatory()
  {
    return mandatory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMandatory(String newMandatory)
  {
    String oldMandatory = mandatory;
    mandatory = newMandatory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.QUESTION__MANDATORY, oldMandatory, mandatory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SurveyPackage.QUESTION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SurveyPackage.QUESTION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SurveyPackage.QUESTION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.QUESTION__TYPE, newType, newType));
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
      answer = new EObjectContainmentEList<Answer>(Answer.class, this, SurveyPackage.QUESTION__ANSWER);
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
      case SurveyPackage.QUESTION__TYPE:
        return basicSetType(null, msgs);
      case SurveyPackage.QUESTION__ANSWER:
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
      case SurveyPackage.QUESTION__NAME:
        return getName();
      case SurveyPackage.QUESTION__ID:
        return getId();
      case SurveyPackage.QUESTION__MANDATORY:
        return getMandatory();
      case SurveyPackage.QUESTION__TYPE:
        return getType();
      case SurveyPackage.QUESTION__ANSWER:
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
      case SurveyPackage.QUESTION__NAME:
        setName((String)newValue);
        return;
      case SurveyPackage.QUESTION__ID:
        setId((String)newValue);
        return;
      case SurveyPackage.QUESTION__MANDATORY:
        setMandatory((String)newValue);
        return;
      case SurveyPackage.QUESTION__TYPE:
        setType((Type)newValue);
        return;
      case SurveyPackage.QUESTION__ANSWER:
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
      case SurveyPackage.QUESTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SurveyPackage.QUESTION__ID:
        setId(ID_EDEFAULT);
        return;
      case SurveyPackage.QUESTION__MANDATORY:
        setMandatory(MANDATORY_EDEFAULT);
        return;
      case SurveyPackage.QUESTION__TYPE:
        setType((Type)null);
        return;
      case SurveyPackage.QUESTION__ANSWER:
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
      case SurveyPackage.QUESTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SurveyPackage.QUESTION__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case SurveyPackage.QUESTION__MANDATORY:
        return MANDATORY_EDEFAULT == null ? mandatory != null : !MANDATORY_EDEFAULT.equals(mandatory);
      case SurveyPackage.QUESTION__TYPE:
        return type != null;
      case SurveyPackage.QUESTION__ANSWER:
        return answer != null && !answer.isEmpty();
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
