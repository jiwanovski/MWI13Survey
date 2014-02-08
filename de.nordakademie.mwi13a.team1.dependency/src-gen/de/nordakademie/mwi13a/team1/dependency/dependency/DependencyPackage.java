/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency;

import org.eclipse.emf.ecore.EAttribute;
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
   * The feature id for the '<em><b>Option</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_ELEMENTS__OPTION = 1;

  /**
   * The number of structural features of the '<em>Part Elements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_ELEMENTS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.PartOptionsImpl <em>Part Options</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.PartOptionsImpl
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getPartOptions()
   * @generated
   */
  int PART_OPTIONS = 3;

  /**
   * The number of structural features of the '<em>Part Options</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_OPTIONS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.DMNextPartsImpl <em>DM Next Parts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DMNextPartsImpl
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getDMNextParts()
   * @generated
   */
  int DM_NEXT_PARTS = 4;

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
  int DEPENDENCY = 5;

  /**
   * The number of structural features of the '<em>Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.DMMatrixQuestionImpl <em>DM Matrix Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DMMatrixQuestionImpl
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getDMMatrixQuestion()
   * @generated
   */
  int DM_MATRIX_QUESTION = 6;

  /**
   * The feature id for the '<em><b>Question</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DM_MATRIX_QUESTION__QUESTION = DEPENDENCY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Answer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DM_MATRIX_QUESTION__ANSWER = DEPENDENCY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Matrix Question</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DM_MATRIX_QUESTION__MATRIX_QUESTION = DEPENDENCY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Matrix Scale</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DM_MATRIX_QUESTION__MATRIX_SCALE = DEPENDENCY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>DM Matrix Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DM_MATRIX_QUESTION_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.DefineNextPartImpl <em>Define Next Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DefineNextPartImpl
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getDefineNextPart()
   * @generated
   */
  int DEFINE_NEXT_PART = 7;

  /**
   * The feature id for the '<em><b>Next Parts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_NEXT_PART__NEXT_PARTS = PART_OPTIONS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Define Next Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_NEXT_PART_FEATURE_COUNT = PART_OPTIONS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.LastPartImpl <em>Last Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.LastPartImpl
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getLastPart()
   * @generated
   */
  int LAST_PART = 8;

  /**
   * The feature id for the '<em><b>Last Part</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAST_PART__LAST_PART = PART_OPTIONS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Last Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAST_PART_FEATURE_COUNT = PART_OPTIONS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.OrImpl
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getOr()
   * @generated
   */
  int OR = 9;

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
  int AND = 10;

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
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.BracketImpl <em>Bracket</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.BracketImpl
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getBracket()
   * @generated
   */
  int BRACKET = 11;

  /**
   * The feature id for the '<em><b>Dependency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKET__DEPENDENCY = DEPENDENCY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bracket</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRACKET_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.DMQuestionImpl <em>DM Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DMQuestionImpl
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getDMQuestion()
   * @generated
   */
  int DM_QUESTION = 12;

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
   * Returns the meta object for the containment reference '{@link de.nordakademie.mwi13a.team1.dependency.dependency.PartElements#getOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Option</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.PartElements#getOption()
   * @see #getPartElements()
   * @generated
   */
  EReference getPartElements_Option();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.PartOptions <em>Part Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Part Options</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.PartOptions
   * @generated
   */
  EClass getPartOptions();

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
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion <em>DM Matrix Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DM Matrix Question</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion
   * @generated
   */
  EClass getDMMatrixQuestion();

  /**
   * Returns the meta object for the reference '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion#getQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Question</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion#getQuestion()
   * @see #getDMMatrixQuestion()
   * @generated
   */
  EReference getDMMatrixQuestion_Question();

  /**
   * Returns the meta object for the reference '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion#getAnswer <em>Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Answer</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion#getAnswer()
   * @see #getDMMatrixQuestion()
   * @generated
   */
  EReference getDMMatrixQuestion_Answer();

  /**
   * Returns the meta object for the reference '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion#getMatrixQuestion <em>Matrix Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Matrix Question</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion#getMatrixQuestion()
   * @see #getDMMatrixQuestion()
   * @generated
   */
  EReference getDMMatrixQuestion_MatrixQuestion();

  /**
   * Returns the meta object for the reference '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion#getMatrixScale <em>Matrix Scale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Matrix Scale</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion#getMatrixScale()
   * @see #getDMMatrixQuestion()
   * @generated
   */
  EReference getDMMatrixQuestion_MatrixScale();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DefineNextPart <em>Define Next Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Define Next Part</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DefineNextPart
   * @generated
   */
  EClass getDefineNextPart();

  /**
   * Returns the meta object for the containment reference list '{@link de.nordakademie.mwi13a.team1.dependency.dependency.DefineNextPart#getNextParts <em>Next Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Next Parts</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.DefineNextPart#getNextParts()
   * @see #getDefineNextPart()
   * @generated
   */
  EReference getDefineNextPart_NextParts();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.LastPart <em>Last Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Last Part</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.LastPart
   * @generated
   */
  EClass getLastPart();

  /**
   * Returns the meta object for the attribute '{@link de.nordakademie.mwi13a.team1.dependency.dependency.LastPart#isLastPart <em>Last Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Part</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.LastPart#isLastPart()
   * @see #getLastPart()
   * @generated
   */
  EAttribute getLastPart_LastPart();

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
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.dependency.dependency.Bracket <em>Bracket</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bracket</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.Bracket
   * @generated
   */
  EClass getBracket();

  /**
   * Returns the meta object for the containment reference '{@link de.nordakademie.mwi13a.team1.dependency.dependency.Bracket#getDependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dependency</em>'.
   * @see de.nordakademie.mwi13a.team1.dependency.dependency.Bracket#getDependency()
   * @see #getBracket()
   * @generated
   */
  EReference getBracket_Dependency();

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
     * The meta object literal for the '<em><b>Option</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PART_ELEMENTS__OPTION = eINSTANCE.getPartElements_Option();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.PartOptionsImpl <em>Part Options</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.PartOptionsImpl
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getPartOptions()
     * @generated
     */
    EClass PART_OPTIONS = eINSTANCE.getPartOptions();

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
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.DMMatrixQuestionImpl <em>DM Matrix Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DMMatrixQuestionImpl
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getDMMatrixQuestion()
     * @generated
     */
    EClass DM_MATRIX_QUESTION = eINSTANCE.getDMMatrixQuestion();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DM_MATRIX_QUESTION__QUESTION = eINSTANCE.getDMMatrixQuestion_Question();

    /**
     * The meta object literal for the '<em><b>Answer</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DM_MATRIX_QUESTION__ANSWER = eINSTANCE.getDMMatrixQuestion_Answer();

    /**
     * The meta object literal for the '<em><b>Matrix Question</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DM_MATRIX_QUESTION__MATRIX_QUESTION = eINSTANCE.getDMMatrixQuestion_MatrixQuestion();

    /**
     * The meta object literal for the '<em><b>Matrix Scale</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DM_MATRIX_QUESTION__MATRIX_SCALE = eINSTANCE.getDMMatrixQuestion_MatrixScale();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.DefineNextPartImpl <em>Define Next Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DefineNextPartImpl
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getDefineNextPart()
     * @generated
     */
    EClass DEFINE_NEXT_PART = eINSTANCE.getDefineNextPart();

    /**
     * The meta object literal for the '<em><b>Next Parts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINE_NEXT_PART__NEXT_PARTS = eINSTANCE.getDefineNextPart_NextParts();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.LastPartImpl <em>Last Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.LastPartImpl
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getLastPart()
     * @generated
     */
    EClass LAST_PART = eINSTANCE.getLastPart();

    /**
     * The meta object literal for the '<em><b>Last Part</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LAST_PART__LAST_PART = eINSTANCE.getLastPart_LastPart();

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
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.dependency.dependency.impl.BracketImpl <em>Bracket</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.BracketImpl
     * @see de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyPackageImpl#getBracket()
     * @generated
     */
    EClass BRACKET = eINSTANCE.getBracket();

    /**
     * The meta object literal for the '<em><b>Dependency</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRACKET__DEPENDENCY = eINSTANCE.getBracket_Dependency();

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
