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
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyModelImpl
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getDependencyModel()
   * @generated
   */
  int DEPENDENCY_MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SurveyElementsImpl <em>Survey Elements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.SurveyElementsImpl
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getSurveyElements()
   * @generated
   */
  int SURVEY_ELEMENTS = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY_ELEMENTS__NAME = 0;

  /**
   * The feature id for the '<em><b>Part Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY_ELEMENTS__PART_ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Survey Elements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY_ELEMENTS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.PartElementsImpl <em>Part Elements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.PartElementsImpl
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getPartElements()
   * @generated
   */
  int PART_ELEMENTS = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_ELEMENTS__NAME = 0;

  /**
   * The feature id for the '<em><b>Next Parts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_ELEMENTS__NEXT_PARTS = 1;

  /**
   * The number of structural features of the '<em>Part Elements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_ELEMENTS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.DMNextPartsImpl <em>DM Next Parts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DMNextPartsImpl
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getDMNextParts()
   * @generated
   */
  int DM_NEXT_PARTS = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DM_NEXT_PARTS__NAME = 0;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DM_NEXT_PARTS__EXPRESSIONS = 1;

  /**
   * The number of structural features of the '<em>DM Next Parts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DM_NEXT_PARTS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyImpl <em>Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyImpl
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getDependency()
   * @generated
   */
  int DEPENDENCY = 4;

  /**
   * The number of structural features of the '<em>Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.OrImpl
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getOr()
   * @generated
   */
  int OR = 5;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__LEFT = DEPENDENCY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__RIGHT = DEPENDENCY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.AndImpl
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getAnd()
   * @generated
   */
  int AND = 6;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__LEFT = DEPENDENCY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__RIGHT = DEPENDENCY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.DMQuestionImpl <em>DM Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DMQuestionImpl
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getDMQuestion()
   * @generated
   */
  int DM_QUESTION = 7;

  /**
   * The feature id for the '<em><b>Question</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DM_QUESTION__QUESTION = DEPENDENCY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Answer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DM_QUESTION__ANSWER = DEPENDENCY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>DM Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DM_QUESTION_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DependencyModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyModel
   * @generated
   */
  EClass getDependencyModel();

  /**
   * Returns the meta object for the containment reference list '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DependencyModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyModel#getElements()
   * @see #getDependencyModel()
   * @generated
   */
  EReference getDependencyModel_Elements();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SurveyElements <em>Survey Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Survey Elements</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SurveyElements
   * @generated
   */
  EClass getSurveyElements();

  /**
   * Returns the meta object for the reference '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SurveyElements#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SurveyElements#getName()
   * @see #getSurveyElements()
   * @generated
   */
  EReference getSurveyElements_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.nordakademie.mwi13a.team1.dependency.dependency.SurveyElements#getPartElements <em>Part Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Part Elements</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.SurveyElements#getPartElements()
   * @see #getSurveyElements()
   * @generated
   */
  EReference getSurveyElements_PartElements();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.PartElements <em>Part Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Part Elements</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.PartElements
   * @generated
   */
  EClass getPartElements();

  /**
   * Returns the meta object for the reference '{@link de.nordakademie.mwi13a.team1.dependency.dependency.PartElements#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.PartElements#getName()
   * @see #getPartElements()
   * @generated
   */
  EReference getPartElements_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.nordakademie.mwi13a.team1.dependency.dependency.PartElements#getNextParts <em>Next Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Next Parts</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.PartElements#getNextParts()
   * @see #getPartElements()
   * @generated
   */
  EReference getPartElements_NextParts();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMNextParts <em>DM Next Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DM Next Parts</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DMNextParts
   * @generated
   */
  EClass getDMNextParts();

  /**
   * Returns the meta object for the reference '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMNextParts#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DMNextParts#getName()
   * @see #getDMNextParts()
   * @generated
   */
  EReference getDMNextParts_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMNextParts#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DMNextParts#getExpressions()
   * @see #getDMNextParts()
   * @generated
   */
  EReference getDMNextParts_Expressions();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.Dependency
   * @generated
   */
  EClass getDependency();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.Or
   * @generated
   */
  EClass getOr();

  /**
   * Returns the meta object for the containment reference '{@link de.nordakademie.mwi13a.team1.dependency.dependency.Or#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.Or#getLeft()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.nordakademie.mwi13a.team1.dependency.dependency.Or#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.Or#getRight()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Right();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.And
   * @generated
   */
  EClass getAnd();

  /**
   * Returns the meta object for the containment reference '{@link de.nordakademie.mwi13a.team1.dependency.dependency.And#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.And#getLeft()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.nordakademie.mwi13a.team1.dependency.dependency.And#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.And#getRight()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Right();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMQuestion <em>DM Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DM Question</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DMQuestion
   * @generated
   */
  EClass getDMQuestion();

  /**
   * Returns the meta object for the reference '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMQuestion#getQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Question</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DMQuestion#getQuestion()
   * @see #getDMQuestion()
   * @generated
   */
  EReference getDMQuestion_Question();

  /**
   * Returns the meta object for the reference '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMQuestion#getAnswer <em>Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Answer</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DMQuestion#getAnswer()
   * @see #getDMQuestion()
   * @generated
   */
  EReference getDMQuestion_Answer();

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
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyModelImpl
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getDependencyModel()
     * @generated
     */
    EClass DEPENDENCY_MODEL = eINSTANCE.getDependencyModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY_MODEL__ELEMENTS = eINSTANCE.getDependencyModel_Elements();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.SurveyElementsImpl <em>Survey Elements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.SurveyElementsImpl
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getSurveyElements()
     * @generated
     */
    EClass SURVEY_ELEMENTS = eINSTANCE.getSurveyElements();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SURVEY_ELEMENTS__NAME = eINSTANCE.getSurveyElements_Name();

    /**
     * The meta object literal for the '<em><b>Part Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SURVEY_ELEMENTS__PART_ELEMENTS = eINSTANCE.getSurveyElements_PartElements();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.PartElementsImpl <em>Part Elements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.PartElementsImpl
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getPartElements()
     * @generated
     */
    EClass PART_ELEMENTS = eINSTANCE.getPartElements();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PART_ELEMENTS__NAME = eINSTANCE.getPartElements_Name();

    /**
     * The meta object literal for the '<em><b>Next Parts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PART_ELEMENTS__NEXT_PARTS = eINSTANCE.getPartElements_NextParts();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.DMNextPartsImpl <em>DM Next Parts</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DMNextPartsImpl
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getDMNextParts()
     * @generated
     */
    EClass DM_NEXT_PARTS = eINSTANCE.getDMNextParts();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DM_NEXT_PARTS__NAME = eINSTANCE.getDMNextParts_Name();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DM_NEXT_PARTS__EXPRESSIONS = eINSTANCE.getDMNextParts_Expressions();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyImpl
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getDependency()
     * @generated
     */
    EClass DEPENDENCY = eINSTANCE.getDependency();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.OrImpl
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getOr()
     * @generated
     */
    EClass OR = eINSTANCE.getOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__LEFT = eINSTANCE.getOr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__RIGHT = eINSTANCE.getOr_Right();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.AndImpl
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getAnd()
     * @generated
     */
    EClass AND = eINSTANCE.getAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__LEFT = eINSTANCE.getAnd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__RIGHT = eINSTANCE.getAnd_Right();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.DMQuestionImpl <em>DM Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DMQuestionImpl
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getDMQuestion()
     * @generated
     */
    EClass DM_QUESTION = eINSTANCE.getDMQuestion();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DM_QUESTION__QUESTION = eINSTANCE.getDMQuestion_Question();

    /**
     * The meta object literal for the '<em><b>Answer</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DM_QUESTION__ANSWER = eINSTANCE.getDMQuestion_Answer();

  }

} //DependencyPackage
