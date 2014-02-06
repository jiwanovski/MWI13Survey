/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency.util;

import de.nordakademie.mwi13a.team1.dependency.dependency.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage
 * @generated
 */
public class DependencyAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DependencyPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencyAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DependencyPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependencySwitch<Adapter> modelSwitch =
    new DependencySwitch<Adapter>()
    {
      @Override
      public Adapter caseDependencyModel(DependencyModel object)
      {
        return createDependencyModelAdapter();
      }
      @Override
      public Adapter caseSurveyElements(SurveyElements object)
      {
        return createSurveyElementsAdapter();
      }
      @Override
      public Adapter casePartElements(PartElements object)
      {
        return createPartElementsAdapter();
      }
      @Override
      public Adapter caseDMNextParts(DMNextParts object)
      {
        return createDMNextPartsAdapter();
      }
      @Override
      public Adapter caseDependency(Dependency object)
      {
        return createDependencyAdapter();
      }
      @Override
      public Adapter caseDMMatrixQuestion(DMMatrixQuestion object)
      {
        return createDMMatrixQuestionAdapter();
      }
      @Override
      public Adapter caseOr(Or object)
      {
        return createOrAdapter();
      }
      @Override
      public Adapter caseAnd(And object)
      {
        return createAndAdapter();
      }
      @Override
      public Adapter caseBracket(Bracket object)
      {
        return createBracketAdapter();
      }
      @Override
      public Adapter caseDMQuestion(DMQuestion object)
      {
        return createDMQuestionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DependencyModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyModel
   * @generated
   */
  public Adapter createDependencyModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SurveyElements <em>Survey Elements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SurveyElements
   * @generated
   */
  public Adapter createSurveyElementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.PartElements <em>Part Elements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.PartElements
   * @generated
   */
  public Adapter createPartElementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMNextParts <em>DM Next Parts</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DMNextParts
   * @generated
   */
  public Adapter createDMNextPartsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.Dependency
   * @generated
   */
  public Adapter createDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion <em>DM Matrix Question</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion
   * @generated
   */
  public Adapter createDMMatrixQuestionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.Or
   * @generated
   */
  public Adapter createOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.And
   * @generated
   */
  public Adapter createAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.Bracket <em>Bracket</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.Bracket
   * @generated
   */
  public Adapter createBracketAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMQuestion <em>DM Question</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DMQuestion
   * @generated
   */
  public Adapter createDMQuestionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DependencyAdapterFactory
