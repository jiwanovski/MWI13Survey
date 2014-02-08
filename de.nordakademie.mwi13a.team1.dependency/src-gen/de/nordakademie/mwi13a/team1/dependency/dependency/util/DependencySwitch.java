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
      case DependencyPackage.DEPENDENCY_MODEL:
      {
        DependencyModel dependencyModel = (DependencyModel)theEObject;
        T result = caseDependencyModel(dependencyModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DependencyPackage.SURVEY_ELEMENTS:
      {
        SurveyElements surveyElements = (SurveyElements)theEObject;
        T result = caseSurveyElements(surveyElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DependencyPackage.PART_ELEMENTS:
      {
        PartElements partElements = (PartElements)theEObject;
        T result = casePartElements(partElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DependencyPackage.PART_OPTIONS:
      {
        PartOptions partOptions = (PartOptions)theEObject;
        T result = casePartOptions(partOptions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DependencyPackage.DM_NEXT_PARTS:
      {
        DMNextParts dmNextParts = (DMNextParts)theEObject;
        T result = caseDMNextParts(dmNextParts);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DependencyPackage.DEPENDENCY:
      {
        Dependency dependency = (Dependency)theEObject;
        T result = caseDependency(dependency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DependencyPackage.DM_MATRIX_QUESTION:
      {
        DMMatrixQuestion dmMatrixQuestion = (DMMatrixQuestion)theEObject;
        T result = caseDMMatrixQuestion(dmMatrixQuestion);
        if (result == null) result = caseDependency(dmMatrixQuestion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DependencyPackage.DEFINE_NEXT_PART:
      {
        DefineNextPart defineNextPart = (DefineNextPart)theEObject;
        T result = caseDefineNextPart(defineNextPart);
        if (result == null) result = casePartOptions(defineNextPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DependencyPackage.LAST_PART:
      {
        LastPart lastPart = (LastPart)theEObject;
        T result = caseLastPart(lastPart);
        if (result == null) result = casePartOptions(lastPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DependencyPackage.OR:
      {
        Or or = (Or)theEObject;
        T result = caseOr(or);
        if (result == null) result = caseDependency(or);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DependencyPackage.AND:
      {
        And and = (And)theEObject;
        T result = caseAnd(and);
        if (result == null) result = caseDependency(and);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DependencyPackage.BRACKET:
      {
        Bracket bracket = (Bracket)theEObject;
        T result = caseBracket(bracket);
        if (result == null) result = caseDependency(bracket);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DependencyPackage.DM_QUESTION:
      {
        DMQuestion dmQuestion = (DMQuestion)theEObject;
        T result = caseDMQuestion(dmQuestion);
        if (result == null) result = caseDependency(dmQuestion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDependencyModel(DependencyModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Survey Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Survey Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSurveyElements(SurveyElements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Part Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Part Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePartElements(PartElements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Part Options</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Part Options</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePartOptions(PartOptions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DM Next Parts</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DM Next Parts</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDMNextParts(DMNextParts object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDependency(Dependency object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DM Matrix Question</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DM Matrix Question</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDMMatrixQuestion(DMMatrixQuestion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Define Next Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Define Next Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefineNextPart(DefineNextPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Last Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Last Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLastPart(LastPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOr(Or object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnd(And object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bracket</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bracket</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBracket(Bracket object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DM Question</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DM Question</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDMQuestion(DMQuestion object)
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
