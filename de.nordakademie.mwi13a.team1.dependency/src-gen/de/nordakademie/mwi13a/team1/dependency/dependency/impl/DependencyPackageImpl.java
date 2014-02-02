/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency.impl;

import de.nordakademie.mwi13a.team1.dependency.dependency.DependencyFactory;
import de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage;
import de.nordakademie.mwi13a.team1.dependency.dependency.SDNextParts;
import de.nordakademie.mwi13a.team1.dependency.dependency.SDPart;
import de.nordakademie.mwi13a.team1.dependency.dependency.SDPartDependencies;
import de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependencies;
import de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependency;

import de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependencyPackageImpl extends EPackageImpl implements DependencyPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass surveyDependenciesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass surveyDependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sdPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sdNextPartsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sdPartDependenciesEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DependencyPackageImpl()
  {
    super(eNS_URI, DependencyFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DependencyPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DependencyPackage init()
  {
    if (isInited) return (DependencyPackage)EPackage.Registry.INSTANCE.getEPackage(DependencyPackage.eNS_URI);

    // Obtain or create and register package
    DependencyPackageImpl theDependencyPackage = (DependencyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DependencyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DependencyPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    SurveyPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theDependencyPackage.createPackageContents();

    // Initialize created meta-data
    theDependencyPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDependencyPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DependencyPackage.eNS_URI, theDependencyPackage);
    return theDependencyPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSurveyDependencies()
  {
    return surveyDependenciesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSurveyDependencies_SurveyDependency()
  {
    return (EReference)surveyDependenciesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSurveyDependency()
  {
    return surveyDependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSurveyDependency_Survey()
  {
    return (EReference)surveyDependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSurveyDependency_Part()
  {
    return (EReference)surveyDependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSDPart()
  {
    return sdPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSDPart_Part2()
  {
    return (EReference)sdPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSDPart_DefaultNextPart()
  {
    return (EReference)sdPartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSDPart_NextParts()
  {
    return (EReference)sdPartEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSDNextParts()
  {
    return sdNextPartsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSDNextParts_NextPart()
  {
    return (EReference)sdNextPartsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSDNextParts_PartDependencies()
  {
    return (EReference)sdNextPartsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSDPartDependencies()
  {
    return sdPartDependenciesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSDPartDependencies_Question()
  {
    return (EReference)sdPartDependenciesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSDPartDependencies_Answer()
  {
    return (EReference)sdPartDependenciesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencyFactory getDependencyFactory()
  {
    return (DependencyFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    surveyDependenciesEClass = createEClass(SURVEY_DEPENDENCIES);
    createEReference(surveyDependenciesEClass, SURVEY_DEPENDENCIES__SURVEY_DEPENDENCY);

    surveyDependencyEClass = createEClass(SURVEY_DEPENDENCY);
    createEReference(surveyDependencyEClass, SURVEY_DEPENDENCY__SURVEY);
    createEReference(surveyDependencyEClass, SURVEY_DEPENDENCY__PART);

    sdPartEClass = createEClass(SD_PART);
    createEReference(sdPartEClass, SD_PART__PART2);
    createEReference(sdPartEClass, SD_PART__DEFAULT_NEXT_PART);
    createEReference(sdPartEClass, SD_PART__NEXT_PARTS);

    sdNextPartsEClass = createEClass(SD_NEXT_PARTS);
    createEReference(sdNextPartsEClass, SD_NEXT_PARTS__NEXT_PART);
    createEReference(sdNextPartsEClass, SD_NEXT_PARTS__PART_DEPENDENCIES);

    sdPartDependenciesEClass = createEClass(SD_PART_DEPENDENCIES);
    createEReference(sdPartDependenciesEClass, SD_PART_DEPENDENCIES__QUESTION);
    createEReference(sdPartDependenciesEClass, SD_PART_DEPENDENCIES__ANSWER);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    SurveyPackage theSurveyPackage = (SurveyPackage)EPackage.Registry.INSTANCE.getEPackage(SurveyPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(surveyDependenciesEClass, SurveyDependencies.class, "SurveyDependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSurveyDependencies_SurveyDependency(), this.getSurveyDependency(), null, "surveyDependency", null, 0, -1, SurveyDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(surveyDependencyEClass, SurveyDependency.class, "SurveyDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSurveyDependency_Survey(), theSurveyPackage.getQuestionnaire(), null, "survey", null, 0, 1, SurveyDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSurveyDependency_Part(), this.getSDPart(), null, "part", null, 0, -1, SurveyDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sdPartEClass, SDPart.class, "SDPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSDPart_Part2(), theSurveyPackage.getPart(), null, "part2", null, 0, 1, SDPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSDPart_DefaultNextPart(), theSurveyPackage.getPart(), null, "defaultNextPart", null, 0, 1, SDPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSDPart_NextParts(), this.getSDNextParts(), null, "nextParts", null, 0, -1, SDPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sdNextPartsEClass, SDNextParts.class, "SDNextParts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSDNextParts_NextPart(), theSurveyPackage.getPart(), null, "nextPart", null, 0, -1, SDNextParts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSDNextParts_PartDependencies(), this.getSDPartDependencies(), null, "partDependencies", null, 0, -1, SDNextParts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sdPartDependenciesEClass, SDPartDependencies.class, "SDPartDependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSDPartDependencies_Question(), theSurveyPackage.getQuestion(), null, "question", null, 0, 1, SDPartDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSDPartDependencies_Answer(), theSurveyPackage.getAnswer(), null, "answer", null, 0, 1, SDPartDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DependencyPackageImpl
