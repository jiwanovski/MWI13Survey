/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency.util;

import de.nordakademie.mwi13a.team1.dependency.dependency.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage
 * @generated
 */
public class DependencySwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DependencyPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencySwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DependencyPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DependencyPackage.SURVEY_DEPENDENCIES:
      {
        SurveyDependencies surveyDependencies = (SurveyDependencies)theEObject;
        T result = caseSurveyDependencies(surveyDependencies);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DependencyPackage.SURVEY_DEPENDENCY:
      {
        SurveyDependency surveyDependency = (SurveyDependency)theEObject;
        T result = caseSurveyDependency(surveyDependency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DependencyPackage.SD_PART:
      {
        SDPart sdPart = (SDPart)theEObject;
        T result = caseSDPart(sdPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DependencyPackage.SD_NEXT_PARTS:
      {
        SDNextParts sdNextParts = (SDNextParts)theEObject;
        T result = caseSDNextParts(sdNextParts);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DependencyPackage.SD_PART_DEPENDENCIES:
      {
        SDPartDependencies sdPartDependencies = (SDPartDependencies)theEObject;
        T result = caseSDPartDependencies(sdPartDependencies);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Survey Dependencies</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Survey Dependencies</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSurveyDependencies(SurveyDependencies object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Survey Dependency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Survey Dependency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSurveyDependency(SurveyDependency object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SD Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SD Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSDPart(SDPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SD Next Parts</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SD Next Parts</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSDNextParts(SDNextParts object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SD Part Dependencies</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SD Part Dependencies</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSDPartDependencies(SDPartDependencies object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DependencySwitch
