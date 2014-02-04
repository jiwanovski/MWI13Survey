/**
 */
package de.nordakademie.mwi13a.team1.survey.survey;

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
 * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyFactory
 * @model kind="package"
 * @generated
 */
public interface SurveyPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "survey";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.nordakademie.de/mwi13a/team1/survey/Survey";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "survey";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SurveyPackage eINSTANCE = de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl.init();

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyImpl <em>Survey</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyImpl
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getSurvey()
   * @generated
   */
  int SURVEY = 0;

  /**
   * The feature id for the '<em><b>Questionnaire</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY__QUESTIONNAIRE = 0;

  /**
   * The number of structural features of the '<em>Survey</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.QuestionnaireImpl
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getQuestionnaire()
   * @generated
   */
  int QUESTIONNAIRE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE__NAME = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE__ID = 1;

  /**
   * The feature id for the '<em><b>Part</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE__PART = 2;

  /**
   * The number of structural features of the '<em>Questionnaire</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.PartImpl <em>Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.PartImpl
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getPart()
   * @generated
   */
  int PART = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__NAME = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__ID = 1;

  /**
   * The feature id for the '<em><b>Question</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__QUESTION = 2;

  /**
   * The number of structural features of the '<em>Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.QuestionImpl <em>Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.QuestionImpl
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getQuestion()
   * @generated
   */
  int QUESTION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__ID = 1;

  /**
   * The feature id for the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__MANDATORY = 2;

  /**
   * The feature id for the '<em><b>Question Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__QUESTION_TYPE = 3;

  /**
   * The number of structural features of the '<em>Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.MatrixQuestionImpl <em>Matrix Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.MatrixQuestionImpl
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getMatrixQuestion()
   * @generated
   */
  int MATRIX_QUESTION = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX_QUESTION__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX_QUESTION__NAME = 1;

  /**
   * The number of structural features of the '<em>Matrix Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX_QUESTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.AnswerImpl <em>Answer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.AnswerImpl
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getAnswer()
   * @generated
   */
  int ANSWER = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANSWER__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANSWER__NAME = 1;

  /**
   * The number of structural features of the '<em>Answer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANSWER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyTerminalTypesImpl <em>Terminal Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyTerminalTypesImpl
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getSurveyTerminalTypes()
   * @generated
   */
  int SURVEY_TERMINAL_TYPES = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY_TERMINAL_TYPES__NAME = 0;

  /**
   * The number of structural features of the '<em>Terminal Types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SURVEY_TERMINAL_TYPES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.TextLineImpl <em>Text Line</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.TextLineImpl
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getTextLine()
   * @generated
   */
  int TEXT_LINE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_LINE__NAME = SURVEY_TERMINAL_TYPES__NAME;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_LINE__LENGTH = SURVEY_TERMINAL_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text Line</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_LINE_FEATURE_COUNT = SURVEY_TERMINAL_TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.TextBlockImpl <em>Text Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.TextBlockImpl
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getTextBlock()
   * @generated
   */
  int TEXT_BLOCK = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_BLOCK__NAME = SURVEY_TERMINAL_TYPES__NAME;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_BLOCK__LENGTH = SURVEY_TERMINAL_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_BLOCK_FEATURE_COUNT = SURVEY_TERMINAL_TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.MatrixImpl <em>Matrix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.MatrixImpl
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getMatrix()
   * @generated
   */
  int MATRIX = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX__NAME = SURVEY_TERMINAL_TYPES__NAME;

  /**
   * The feature id for the '<em><b>Answer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX__ANSWER = SURVEY_TERMINAL_TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Matrix Question</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX__MATRIX_QUESTION = SURVEY_TERMINAL_TYPES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Matrix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX_FEATURE_COUNT = SURVEY_TERMINAL_TYPES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.ComboBoxImpl <em>Combo Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.ComboBoxImpl
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getComboBox()
   * @generated
   */
  int COMBO_BOX = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBO_BOX__NAME = SURVEY_TERMINAL_TYPES__NAME;

  /**
   * The feature id for the '<em><b>Answer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBO_BOX__ANSWER = SURVEY_TERMINAL_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Combo Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBO_BOX_FEATURE_COUNT = SURVEY_TERMINAL_TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.DropDownImpl <em>Drop Down</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.DropDownImpl
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getDropDown()
   * @generated
   */
  int DROP_DOWN = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_DOWN__NAME = SURVEY_TERMINAL_TYPES__NAME;

  /**
   * The feature id for the '<em><b>Answer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_DOWN__ANSWER = SURVEY_TERMINAL_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Drop Down</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_DOWN_FEATURE_COUNT = SURVEY_TERMINAL_TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.RadioImpl <em>Radio</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.RadioImpl
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getRadio()
   * @generated
   */
  int RADIO = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO__NAME = SURVEY_TERMINAL_TYPES__NAME;

  /**
   * The feature id for the '<em><b>Answer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO__ANSWER = SURVEY_TERMINAL_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Radio</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_FEATURE_COUNT = SURVEY_TERMINAL_TYPES_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.survey.survey.Survey <em>Survey</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Survey</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Survey
   * @generated
   */
  EClass getSurvey();

  /**
   * Returns the meta object for the containment reference list '{@link de.nordakademie.mwi13a.team1.survey.survey.Survey#getQuestionnaire <em>Questionnaire</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Questionnaire</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Survey#getQuestionnaire()
   * @see #getSurvey()
   * @generated
   */
  EReference getSurvey_Questionnaire();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.survey.survey.Questionnaire <em>Questionnaire</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Questionnaire</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Questionnaire
   * @generated
   */
  EClass getQuestionnaire();

  /**
   * Returns the meta object for the attribute '{@link de.nordakademie.mwi13a.team1.survey.survey.Questionnaire#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Questionnaire#getName()
   * @see #getQuestionnaire()
   * @generated
   */
  EAttribute getQuestionnaire_Name();

  /**
   * Returns the meta object for the attribute '{@link de.nordakademie.mwi13a.team1.survey.survey.Questionnaire#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Questionnaire#getId()
   * @see #getQuestionnaire()
   * @generated
   */
  EAttribute getQuestionnaire_Id();

  /**
   * Returns the meta object for the containment reference list '{@link de.nordakademie.mwi13a.team1.survey.survey.Questionnaire#getPart <em>Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Part</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Questionnaire#getPart()
   * @see #getQuestionnaire()
   * @generated
   */
  EReference getQuestionnaire_Part();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.survey.survey.Part <em>Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Part</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Part
   * @generated
   */
  EClass getPart();

  /**
   * Returns the meta object for the attribute '{@link de.nordakademie.mwi13a.team1.survey.survey.Part#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Part#getName()
   * @see #getPart()
   * @generated
   */
  EAttribute getPart_Name();

  /**
   * Returns the meta object for the attribute '{@link de.nordakademie.mwi13a.team1.survey.survey.Part#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Part#getId()
   * @see #getPart()
   * @generated
   */
  EAttribute getPart_Id();

  /**
   * Returns the meta object for the containment reference list '{@link de.nordakademie.mwi13a.team1.survey.survey.Part#getQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Question</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Part#getQuestion()
   * @see #getPart()
   * @generated
   */
  EReference getPart_Question();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.survey.survey.Question <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Question</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Question
   * @generated
   */
  EClass getQuestion();

  /**
   * Returns the meta object for the attribute '{@link de.nordakademie.mwi13a.team1.survey.survey.Question#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Question#getName()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Name();

  /**
   * Returns the meta object for the attribute '{@link de.nordakademie.mwi13a.team1.survey.survey.Question#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Question#getId()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Id();

  /**
   * Returns the meta object for the attribute '{@link de.nordakademie.mwi13a.team1.survey.survey.Question#isMandatory <em>Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mandatory</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Question#isMandatory()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Mandatory();

  /**
   * Returns the meta object for the containment reference '{@link de.nordakademie.mwi13a.team1.survey.survey.Question#getQuestionType <em>Question Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Question Type</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Question#getQuestionType()
   * @see #getQuestion()
   * @generated
   */
  EReference getQuestion_QuestionType();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.survey.survey.MatrixQuestion <em>Matrix Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Matrix Question</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.MatrixQuestion
   * @generated
   */
  EClass getMatrixQuestion();

  /**
   * Returns the meta object for the attribute '{@link de.nordakademie.mwi13a.team1.survey.survey.MatrixQuestion#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.MatrixQuestion#getId()
   * @see #getMatrixQuestion()
   * @generated
   */
  EAttribute getMatrixQuestion_Id();

  /**
   * Returns the meta object for the attribute '{@link de.nordakademie.mwi13a.team1.survey.survey.MatrixQuestion#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.MatrixQuestion#getName()
   * @see #getMatrixQuestion()
   * @generated
   */
  EAttribute getMatrixQuestion_Name();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.survey.survey.Answer <em>Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Answer</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Answer
   * @generated
   */
  EClass getAnswer();

  /**
   * Returns the meta object for the attribute '{@link de.nordakademie.mwi13a.team1.survey.survey.Answer#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Answer#getId()
   * @see #getAnswer()
   * @generated
   */
  EAttribute getAnswer_Id();

  /**
   * Returns the meta object for the attribute '{@link de.nordakademie.mwi13a.team1.survey.survey.Answer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Answer#getName()
   * @see #getAnswer()
   * @generated
   */
  EAttribute getAnswer_Name();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.survey.survey.SurveyTerminalTypes <em>Terminal Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terminal Types</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyTerminalTypes
   * @generated
   */
  EClass getSurveyTerminalTypes();

  /**
   * Returns the meta object for the attribute '{@link de.nordakademie.mwi13a.team1.survey.survey.SurveyTerminalTypes#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyTerminalTypes#getName()
   * @see #getSurveyTerminalTypes()
   * @generated
   */
  EAttribute getSurveyTerminalTypes_Name();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.survey.survey.TextLine <em>Text Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Line</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.TextLine
   * @generated
   */
  EClass getTextLine();

  /**
   * Returns the meta object for the attribute '{@link de.nordakademie.mwi13a.team1.survey.survey.TextLine#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.TextLine#getLength()
   * @see #getTextLine()
   * @generated
   */
  EAttribute getTextLine_Length();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.survey.survey.TextBlock <em>Text Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Block</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.TextBlock
   * @generated
   */
  EClass getTextBlock();

  /**
   * Returns the meta object for the attribute '{@link de.nordakademie.mwi13a.team1.survey.survey.TextBlock#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.TextBlock#getLength()
   * @see #getTextBlock()
   * @generated
   */
  EAttribute getTextBlock_Length();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.survey.survey.Matrix <em>Matrix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Matrix</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Matrix
   * @generated
   */
  EClass getMatrix();

  /**
   * Returns the meta object for the containment reference list '{@link de.nordakademie.mwi13a.team1.survey.survey.Matrix#getAnswer <em>Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Answer</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Matrix#getAnswer()
   * @see #getMatrix()
   * @generated
   */
  EReference getMatrix_Answer();

  /**
   * Returns the meta object for the containment reference list '{@link de.nordakademie.mwi13a.team1.survey.survey.Matrix#getMatrixQuestion <em>Matrix Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Matrix Question</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Matrix#getMatrixQuestion()
   * @see #getMatrix()
   * @generated
   */
  EReference getMatrix_MatrixQuestion();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.survey.survey.ComboBox <em>Combo Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Combo Box</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.ComboBox
   * @generated
   */
  EClass getComboBox();

  /**
   * Returns the meta object for the containment reference list '{@link de.nordakademie.mwi13a.team1.survey.survey.ComboBox#getAnswer <em>Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Answer</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.ComboBox#getAnswer()
   * @see #getComboBox()
   * @generated
   */
  EReference getComboBox_Answer();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.survey.survey.DropDown <em>Drop Down</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drop Down</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.DropDown
   * @generated
   */
  EClass getDropDown();

  /**
   * Returns the meta object for the containment reference list '{@link de.nordakademie.mwi13a.team1.survey.survey.DropDown#getAnswer <em>Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Answer</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.DropDown#getAnswer()
   * @see #getDropDown()
   * @generated
   */
  EReference getDropDown_Answer();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.survey.survey.Radio <em>Radio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Radio</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Radio
   * @generated
   */
  EClass getRadio();

  /**
   * Returns the meta object for the containment reference list '{@link de.nordakademie.mwi13a.team1.survey.survey.Radio#getAnswer <em>Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Answer</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Radio#getAnswer()
   * @see #getRadio()
   * @generated
   */
  EReference getRadio_Answer();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SurveyFactory getSurveyFactory();

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
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyImpl <em>Survey</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyImpl
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getSurvey()
     * @generated
     */
    EClass SURVEY = eINSTANCE.getSurvey();

    /**
     * The meta object literal for the '<em><b>Questionnaire</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SURVEY__QUESTIONNAIRE = eINSTANCE.getSurvey_Questionnaire();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.QuestionnaireImpl
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getQuestionnaire()
     * @generated
     */
    EClass QUESTIONNAIRE = eINSTANCE.getQuestionnaire();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTIONNAIRE__NAME = eINSTANCE.getQuestionnaire_Name();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTIONNAIRE__ID = eINSTANCE.getQuestionnaire_Id();

    /**
     * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTIONNAIRE__PART = eINSTANCE.getQuestionnaire_Part();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.PartImpl <em>Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.PartImpl
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getPart()
     * @generated
     */
    EClass PART = eINSTANCE.getPart();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PART__NAME = eINSTANCE.getPart_Name();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PART__ID = eINSTANCE.getPart_Id();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PART__QUESTION = eINSTANCE.getPart_Question();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.QuestionImpl <em>Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.QuestionImpl
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getQuestion()
     * @generated
     */
    EClass QUESTION = eINSTANCE.getQuestion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__NAME = eINSTANCE.getQuestion_Name();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__ID = eINSTANCE.getQuestion_Id();

    /**
     * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__MANDATORY = eINSTANCE.getQuestion_Mandatory();

    /**
     * The meta object literal for the '<em><b>Question Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTION__QUESTION_TYPE = eINSTANCE.getQuestion_QuestionType();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.MatrixQuestionImpl <em>Matrix Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.MatrixQuestionImpl
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getMatrixQuestion()
     * @generated
     */
    EClass MATRIX_QUESTION = eINSTANCE.getMatrixQuestion();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATRIX_QUESTION__ID = eINSTANCE.getMatrixQuestion_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATRIX_QUESTION__NAME = eINSTANCE.getMatrixQuestion_Name();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.AnswerImpl <em>Answer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.AnswerImpl
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getAnswer()
     * @generated
     */
    EClass ANSWER = eINSTANCE.getAnswer();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANSWER__ID = eINSTANCE.getAnswer_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANSWER__NAME = eINSTANCE.getAnswer_Name();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyTerminalTypesImpl <em>Terminal Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyTerminalTypesImpl
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getSurveyTerminalTypes()
     * @generated
     */
    EClass SURVEY_TERMINAL_TYPES = eINSTANCE.getSurveyTerminalTypes();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SURVEY_TERMINAL_TYPES__NAME = eINSTANCE.getSurveyTerminalTypes_Name();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.TextLineImpl <em>Text Line</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.TextLineImpl
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getTextLine()
     * @generated
     */
    EClass TEXT_LINE = eINSTANCE.getTextLine();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_LINE__LENGTH = eINSTANCE.getTextLine_Length();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.TextBlockImpl <em>Text Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.TextBlockImpl
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getTextBlock()
     * @generated
     */
    EClass TEXT_BLOCK = eINSTANCE.getTextBlock();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_BLOCK__LENGTH = eINSTANCE.getTextBlock_Length();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.MatrixImpl <em>Matrix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.MatrixImpl
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getMatrix()
     * @generated
     */
    EClass MATRIX = eINSTANCE.getMatrix();

    /**
     * The meta object literal for the '<em><b>Answer</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATRIX__ANSWER = eINSTANCE.getMatrix_Answer();

    /**
     * The meta object literal for the '<em><b>Matrix Question</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATRIX__MATRIX_QUESTION = eINSTANCE.getMatrix_MatrixQuestion();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.ComboBoxImpl <em>Combo Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.ComboBoxImpl
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getComboBox()
     * @generated
     */
    EClass COMBO_BOX = eINSTANCE.getComboBox();

    /**
     * The meta object literal for the '<em><b>Answer</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMBO_BOX__ANSWER = eINSTANCE.getComboBox_Answer();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.DropDownImpl <em>Drop Down</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.DropDownImpl
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getDropDown()
     * @generated
     */
    EClass DROP_DOWN = eINSTANCE.getDropDown();

    /**
     * The meta object literal for the '<em><b>Answer</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DROP_DOWN__ANSWER = eINSTANCE.getDropDown_Answer();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.RadioImpl <em>Radio</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.RadioImpl
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getRadio()
     * @generated
     */
    EClass RADIO = eINSTANCE.getRadio();

    /**
     * The meta object literal for the '<em><b>Answer</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RADIO__ANSWER = eINSTANCE.getRadio_Answer();

  }

} //SurveyPackage
