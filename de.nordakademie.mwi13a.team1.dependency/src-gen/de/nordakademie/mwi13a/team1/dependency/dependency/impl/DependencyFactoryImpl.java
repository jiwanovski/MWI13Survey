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
      case DependencyPackage.DEPENDENCY_MODEL: return createDependencyModel();
      case DependencyPackage.SURVEY_ELEMENTS: return createSurveyElements();
      case DependencyPackage.PART_ELEMENTS: return createPartElements();
      case DependencyPackage.DM_NEXT_PARTS: return createDMNextParts();
      case DependencyPackage.DEPENDENCY: return createDependency();
      case DependencyPackage.DM_MATRIX_QUESTION: return createDMMatrixQuestion();
      case DependencyPackage.OR: return createOr();
      case DependencyPackage.AND: return createAnd();
      case DependencyPackage.BRACKET: return createBracket();
      case DependencyPackage.DM_QUESTION: return createDMQuestion();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencyModel createDependencyModel()
  {
    DependencyModelImpl dependencyModel = new DependencyModelImpl();
    return dependencyModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SurveyElements createSurveyElements()
  {
    SurveyElementsImpl surveyElements = new SurveyElementsImpl();
    return surveyElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PartElements createPartElements()
  {
    PartElementsImpl partElements = new PartElementsImpl();
    return partElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DMNextParts createDMNextParts()
  {
    DMNextPartsImpl dmNextParts = new DMNextPartsImpl();
    return dmNextParts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dependency createDependency()
  {
    DependencyImpl dependency = new DependencyImpl();
    return dependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DMMatrixQuestion createDMMatrixQuestion()
  {
    DMMatrixQuestionImpl dmMatrixQuestion = new DMMatrixQuestionImpl();
    return dmMatrixQuestion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bracket createBracket()
  {
    BracketImpl bracket = new BracketImpl();
    return bracket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DMQuestion createDMQuestion()
  {
    DMQuestionImpl dmQuestion = new DMQuestionImpl();
    return dmQuestion;
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
