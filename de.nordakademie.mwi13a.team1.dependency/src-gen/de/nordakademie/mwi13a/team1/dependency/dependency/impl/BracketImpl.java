/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency.impl;

import de.nordakademie.mwi13a.team1.dependency.dependency.Bracket;
import de.nordakademie.mwi13a.team1.dependency.dependency.Dependency;
import de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bracket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.BracketImpl#getDependency <em>Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BracketImpl extends DependencyImpl implements Bracket
{
  /**
   * The cached value of the '{@link #getDependency() <em>Dependency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependency()
   * @generated
   * @ordered
   */
  protected Dependency dependency;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BracketImpl()
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
    return DependencyPackage.Literals.BRACKET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dependency getDependency()
  {
    return dependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDependency(Dependency newDependency, NotificationChain msgs)
  {
    Dependency oldDependency = dependency;
    dependency = newDependency;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependencyPackage.BRACKET__DEPENDENCY, oldDependency, newDependency);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDependency(Dependency newDependency)
  {
    if (newDependency != dependency)
    {
      NotificationChain msgs = null;
      if (dependency != null)
        msgs = ((InternalEObject)dependency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependencyPackage.BRACKET__DEPENDENCY, null, msgs);
      if (newDependency != null)
        msgs = ((InternalEObject)newDependency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependencyPackage.BRACKET__DEPENDENCY, null, msgs);
      msgs = basicSetDependency(newDependency, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DependencyPackage.BRACKET__DEPENDENCY, newDependency, newDependency));
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
      case DependencyPackage.BRACKET__DEPENDENCY:
        return basicSetDependency(null, msgs);
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
      case DependencyPackage.BRACKET__DEPENDENCY:
        return getDependency();
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
      case DependencyPackage.BRACKET__DEPENDENCY:
        setDependency((Dependency)newValue);
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
      case DependencyPackage.BRACKET__DEPENDENCY:
        setDependency((Dependency)null);
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
      case DependencyPackage.BRACKET__DEPENDENCY:
        return dependency != null;
    }
    return super.eIsSet(featureID);
  }

} //BracketImpl
