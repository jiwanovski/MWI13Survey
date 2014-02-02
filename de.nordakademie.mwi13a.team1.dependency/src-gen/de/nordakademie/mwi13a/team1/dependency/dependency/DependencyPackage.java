/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyFactory
 * @model kind="package"
 * @generated
 */
public interface DependencyPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dependency";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.nordakademie.de/mwi13a/team1/dependency/Dependency";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dependency";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DependencyPackage eINSTANCE = de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl.init();

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SurveyDependenciesImpl <em>Survey Dependencies</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.SurveyDependenciesImpl
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getSurveyDependencies()
   * @generated
   */
  int SURVEY_DEPENDENCIES = 0;

  /**
   * The feature id for the '<em><b>Survey Dependency</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY_DEPENDENCIES__SURVEY_DEPENDENCY = 0;

  /**
   * The number of structural features of the '<em>Survey Dependencies</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY_DEPENDENCIES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SurveyDependencyImpl <em>Survey Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.SurveyDependencyImpl
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getSurveyDependency()
   * @generated
   */
  int SURVEY_DEPENDENCY = 1;

  /**
   * The feature id for the '<em><b>Survey</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY_DEPENDENCY__SURVEY = 0;

  /**
   * The feature id for the '<em><b>Part</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY_DEPENDENCY__PART = 1;

  /**
   * The number of structural features of the '<em>Survey Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY_DEPENDENCY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SDPartImpl <em>SD Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.SDPartImpl
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getSDPart()
   * @generated
   */
  int SD_PART = 2;

  /**
   * The feature id for the '<em><b>Part2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_PART__PART2 = 0;

  /**
   * The feature id for the '<em><b>Default Next Part</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_PART__DEFAULT_NEXT_PART = 1;

  /**
   * The feature id for the '<em><b>Next Parts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_PART__NEXT_PARTS = 2;

  /**
   * The number of structural features of the '<em>SD Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_PART_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SDNextPartsImpl <em>SD Next Parts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.SDNextPartsImpl
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getSDNextParts()
   * @generated
   */
  int SD_NEXT_PARTS = 3;

  /**
   * The feature id for the '<em><b>Next Part</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_NEXT_PARTS__NEXT_PART = 0;

  /**
   * The feature id for the '<em><b>Part Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_NEXT_PARTS__PART_DEPENDENCIES = 1;

  /**
   * The number of structural features of the '<em>SD Next Parts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_NEXT_PARTS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SDPartDependenciesImpl <em>SD Part Dependencies</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.SDPartDependenciesImpl
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getSDPartDependencies()
   * @generated
   */
  int SD_PART_DEPENDENCIES = 4;

  /**
   * The feature id for the '<em><b>Question</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_PART_DEPENDENCIES__QUESTION = 0;

  /**
   * The feature id for the '<em><b>Answer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_PART_DEPENDENCIES__ANSWER = 1;

  /**
   * The number of structural features of the '<em>SD Part Dependencies</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_PART_DEPENDENCIES_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependencies <em>Survey Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Survey Dependencies</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependencies
   * @generated
   */
  EClass getSurveyDependencies();

  /**
   * Returns the meta object for the containment reference list '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependencies#getSurveyDependency <em>Survey Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Survey Dependency</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependencies#getSurveyDependency()
   * @see #getSurveyDependencies()
   * @generated
   */
  EReference getSurveyDependencies_SurveyDependency();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependency <em>Survey Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Survey Dependency</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependency
   * @generated
   */
  EClass getSurveyDependency();

  /**
   * Returns the meta object for the reference '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependency#getSurvey <em>Survey</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Survey</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependency#getSurvey()
   * @see #getSurveyDependency()
   * @generated
   */
  EReference getSurveyDependency_Survey();

  /**
   * Returns the meta object for the containment reference list '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependency#getPart <em>Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Part</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SurveyDependency#getPart()
   * @see #getSurveyDependency()
   * @generated
   */
  EReference getSurveyDependency_Part();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDPart <em>SD Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SD Part</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SDPart
   * @generated
   */
  EClass getSDPart();

  /**
   * Returns the meta object for the reference '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDPart#getPart2 <em>Part2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Part2</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SDPart#getPart2()
   * @see #getSDPart()
   * @generated
   */
  EReference getSDPart_Part2();

  /**
   * Returns the meta object for the reference '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDPart#getDefaultNextPart <em>Default Next Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Default Next Part</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SDPart#getDefaultNextPart()
   * @see #getSDPart()
   * @generated
   */
  EReference getSDPart_DefaultNextPart();

  /**
   * Returns the meta object for the containment reference list '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDPart#getNextParts <em>Next Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Next Parts</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SDPart#getNextParts()
   * @see #getSDPart()
   * @generated
   */
  EReference getSDPart_NextParts();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDNextParts <em>SD Next Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SD Next Parts</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SDNextParts
   * @generated
   */
  EClass getSDNextParts();

  /**
   * Returns the meta object for the reference list '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDNextParts#getNextPart <em>Next Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Next Part</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SDNextParts#getNextPart()
   * @see #getSDNextParts()
   * @generated
   */
  EReference getSDNextParts_NextPart();

  /**
   * Returns the meta object for the containment reference list '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDNextParts#getPartDependencies <em>Part Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Part Dependencies</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SDNextParts#getPartDependencies()
   * @see #getSDNextParts()
   * @generated
   */
  EReference getSDNextParts_PartDependencies();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDPartDependencies <em>SD Part Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SD Part Dependencies</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SDPartDependencies
   * @generated
   */
  EClass getSDPartDependencies();

  /**
   * Returns the meta object for the reference '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDPartDependencies#getQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Question</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SDPartDependencies#getQuestion()
   * @see #getSDPartDependencies()
   * @generated
   */
  EReference getSDPartDependencies_Question();

  /**
   * Returns the meta object for the reference '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SDPartDependencies#getAnswer <em>Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Answer</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SDPartDependencies#getAnswer()
   * @see #getSDPartDependencies()
   * @generated
   */
  EReference getSDPartDependencies_Answer();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DependencyFactory getDependencyFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SurveyDependenciesImpl <em>Survey Dependencies</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.SurveyDependenciesImpl
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getSurveyDependencies()
     * @generated
     */
    EClass SURVEY_DEPENDENCIES = eINSTANCE.getSurveyDependencies();

    /**
     * The meta object literal for the '<em><b>Survey Dependency</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SURVEY_DEPENDENCIES__SURVEY_DEPENDENCY = eINSTANCE.getSurveyDependencies_SurveyDependency();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SurveyDependencyImpl <em>Survey Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.SurveyDependencyImpl
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getSurveyDependency()
     * @generated
     */
    EClass SURVEY_DEPENDENCY = eINSTANCE.getSurveyDependency();

    /**
     * The meta object literal for the '<em><b>Survey</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SURVEY_DEPENDENCY__SURVEY = eINSTANCE.getSurveyDependency_Survey();

    /**
     * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SURVEY_DEPENDENCY__PART = eINSTANCE.getSurveyDependency_Part();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SDPartImpl <em>SD Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.SDPartImpl
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getSDPart()
     * @generated
     */
    EClass SD_PART = eINSTANCE.getSDPart();

    /**
     * The meta object literal for the '<em><b>Part2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SD_PART__PART2 = eINSTANCE.getSDPart_Part2();

    /**
     * The meta object literal for the '<em><b>Default Next Part</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SD_PART__DEFAULT_NEXT_PART = eINSTANCE.getSDPart_DefaultNextPart();

    /**
     * The meta object literal for the '<em><b>Next Parts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SD_PART__NEXT_PARTS = eINSTANCE.getSDPart_NextParts();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SDNextPartsImpl <em>SD Next Parts</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.SDNextPartsImpl
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getSDNextParts()
     * @generated
     */
    EClass SD_NEXT_PARTS = eINSTANCE.getSDNextParts();

    /**
     * The meta object literal for the '<em><b>Next Part</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SD_NEXT_PARTS__NEXT_PART = eINSTANCE.getSDNextParts_NextPart();

    /**
     * The meta object literal for the '<em><b>Part Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SD_NEXT_PARTS__PART_DEPENDENCIES = eINSTANCE.getSDNextParts_PartDependencies();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SDPartDependenciesImpl <em>SD Part Dependencies</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.SDPartDependenciesImpl
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getSDPartDependencies()
     * @generated
     */
    EClass SD_PART_DEPENDENCIES = eINSTANCE.getSDPartDependencies();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SD_PART_DEPENDENCIES__QUESTION = eINSTANCE.getSDPartDependencies_Question();

    /**
     * The meta object literal for the '<em><b>Answer</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SD_PART_DEPENDENCIES__ANSWER = eINSTANCE.getSDPartDependencies_Answer();

  }

} //DependencyPackage
