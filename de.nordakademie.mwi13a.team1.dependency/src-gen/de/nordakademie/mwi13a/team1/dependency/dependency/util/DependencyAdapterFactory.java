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
      public Adapter caseSurveyDependencies(SurveyDependencies object)
      {
        return createSurveyDependenciesAdapter();
      }
      @Override
      public Adapter caseSurveyDependency(SurveyDependency object)
      {
        return createSurveyDependencyAdapter();
      }
      @Override
      public Adapter caseSDPart(SDPart object)
      {
        return createSDPartAdapter();
      }
      @Override
      public Adapter caseSDNextParts(SDNextParts object)
      {
        return createSDNextPartsAdapter();
      }
      @Override
      public Adapter caseSDPartDependencies(SDPartDependencies object)
      {
        return createSDPartDependenciesAdapter();
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
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependencies <em>Survey Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependencies
   * @generated
   */
  public Adapter createSurveyDependenciesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependency <em>Survey Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependency
   * @generated
   */
  public Adapter createSurveyDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDPart <em>SD Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SDPart
   * @generated
   */
  public Adapter createSDPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDNextParts <em>SD Next Parts</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SDNextParts
   * @generated
   */
  public Adapter createSDNextPartsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDPartDependencies <em>SD Part Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SDPartDependencies
   * @generated
   */
  public Adapter createSDPartDependenciesAdapter()
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
