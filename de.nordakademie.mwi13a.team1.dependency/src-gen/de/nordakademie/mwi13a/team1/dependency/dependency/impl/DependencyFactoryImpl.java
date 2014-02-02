/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency.impl;

import de.nordakademie.mwi13a.team1.dependency.dependency.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependencyFactoryImpl extends EFactoryImpl implements DependencyFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DependencyFactory init()
  {
    try
    {
      DependencyFactory theDependencyFactory = (DependencyFactory)EPackage.Registry.INSTANCE.getEFactory(DependencyPackage.eNS_URI);
      if (theDependencyFactory != null)
      {
        return theDependencyFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DependencyFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencyFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DependencyPackage.SURVEY_DEPENDENCIES: return createSurveyDependencies();
      case DependencyPackage.SURVEY_DEPENDENCY: return createSurveyDependency();
      case DependencyPackage.SD_PART: return createSDPart();
      case DependencyPackage.SD_NEXT_PARTS: return createSDNextParts();
      case DependencyPackage.SD_PART_DEPENDENCIES: return createSDPartDependencies();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SurveyDependencies createSurveyDependencies()
  {
    SurveyDependenciesImpl surveyDependencies = new SurveyDependenciesImpl();
    return surveyDependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SurveyDependency createSurveyDependency()
  {
    SurveyDependencyImpl surveyDependency = new SurveyDependencyImpl();
    return surveyDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDPart createSDPart()
  {
    SDPartImpl sdPart = new SDPartImpl();
    return sdPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDNextParts createSDNextParts()
  {
    SDNextPartsImpl sdNextParts = new SDNextPartsImpl();
    return sdNextParts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDPartDependencies createSDPartDependencies()
  {
    SDPartDependenciesImpl sdPartDependencies = new SDPartDependenciesImpl();
    return sdPartDependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencyPackage getDependencyPackage()
  {
    return (DependencyPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DependencyPackage getPackage()
  {
    return DependencyPackage.eINSTANCE;
  }

} //DependencyFactoryImpl
