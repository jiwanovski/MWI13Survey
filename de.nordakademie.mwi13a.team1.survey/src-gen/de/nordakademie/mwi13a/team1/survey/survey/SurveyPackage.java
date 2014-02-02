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
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__TYPE = 3;

  /**
   * The feature id for the '<em><b>Answer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__ANSWER = 4;

  /**
   * The number of structural features of the '<em>Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.AnswerImpl <em>Answer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.AnswerImpl
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getAnswer()
   * @generated
   */
  int ANSWER = 4;

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
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.TypeImpl
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getType()
   * @generated
   */
  int TYPE = 11;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.TextLnImpl <em>Text Ln</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.TextLnImpl
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getTextLn()
   * @generated
   */
  int TEXT_LN = 5;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_LN__LENGTH = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text Ln</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_LN_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.TextBlImpl <em>Text Bl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.TextBlImpl
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getTextBl()
   * @generated
   */
  int TEXT_BL = 6;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_BL__LENGTH = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text Bl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_BL_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.MatrixImpl <em>Matrix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.MatrixImpl
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getMatrix()
   * @generated
   */
  int MATRIX = 7;

  /**
   * The feature id for the '<em><b>Answer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX__ANSWER = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Matrix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.ComboBoxImpl <em>Combo Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.ComboBoxImpl
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getComboBox()
   * @generated
   */
  int COMBO_BOX = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBO_BOX__NAME = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Combo Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBO_BOX_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.DropDownImpl <em>Drop Down</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.DropDownImpl
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getDropDown()
   * @generated
   */
  int DROP_DOWN = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_DOWN__NAME = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Drop Down</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROP_DOWN_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.RadioImpl <em>Radio</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.RadioImpl
   * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getRadio()
   * @generated
   */
  int RADIO = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO__NAME = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Radio</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;


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
   * Returns the meta object for the attribute '{@link de.nordakademie.mwi13a.team1.survey.survey.Question#getMandatory <em>Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mandatory</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Question#getMandatory()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Mandatory();

  /**
   * Returns the meta object for the containment reference '{@link de.nordakademie.mwi13a.team1.survey.survey.Question#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Question#getType()
   * @see #getQuestion()
   * @generated
   */
  EReference getQuestion_Type();

  /**
   * Returns the meta object for the containment reference list '{@link de.nordakademie.mwi13a.team1.survey.survey.Question#getAnswer <em>Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Answer</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Question#getAnswer()
   * @see #getQuestion()
   * @generated
   */
  EReference getQuestion_Answer();

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
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.survey.survey.TextLn <em>Text Ln</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Ln</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.TextLn
   * @generated
   */
  EClass getTextLn();

  /**
   * Returns the meta object for the attribute '{@link de.nordakademie.mwi13a.team1.survey.survey.TextLn#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.TextLn#getLength()
   * @see #getTextLn()
   * @generated
   */
  EAttribute getTextLn_Length();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.survey.survey.TextBl <em>Text Bl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Bl</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.TextBl
   * @generated
   */
  EClass getTextBl();

  /**
   * Returns the meta object for the attribute '{@link de.nordakademie.mwi13a.team1.survey.survey.TextBl#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.TextBl#getLength()
   * @see #getTextBl()
   * @generated
   */
  EAttribute getTextBl_Length();

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
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.survey.survey.ComboBox <em>Combo Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Combo Box</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.ComboBox
   * @generated
   */
  EClass getComboBox();

  /**
   * Returns the meta object for the attribute '{@link de.nordakademie.mwi13a.team1.survey.survey.ComboBox#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.ComboBox#getName()
   * @see #getComboBox()
   * @generated
   */
  EAttribute getComboBox_Name();

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
   * Returns the meta object for the attribute '{@link de.nordakademie.mwi13a.team1.survey.survey.DropDown#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.DropDown#getName()
   * @see #getDropDown()
   * @generated
   */
  EAttribute getDropDown_Name();

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
   * Returns the meta object for the attribute '{@link de.nordakademie.mwi13a.team1.survey.survey.Radio#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Radio#getName()
   * @see #getRadio()
   * @generated
   */
  EAttribute getRadio_Name();

  /**
   * Returns the meta object for class '{@link de.nordakademie.mwi13a.team1.survey.survey.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Type
   * @generated
   */
  EClass getType();

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
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTION__TYPE = eINSTANCE.getQuestion_Type();

    /**
     * The meta object literal for the '<em><b>Answer</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTION__ANSWER = eINSTANCE.getQuestion_Answer();

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
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.TextLnImpl <em>Text Ln</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.TextLnImpl
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getTextLn()
     * @generated
     */
    EClass TEXT_LN = eINSTANCE.getTextLn();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_LN__LENGTH = eINSTANCE.getTextLn_Length();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.TextBlImpl <em>Text Bl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.TextBlImpl
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getTextBl()
     * @generated
     */
    EClass TEXT_BL = eINSTANCE.getTextBl();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_BL__LENGTH = eINSTANCE.getTextBl_Length();

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
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.ComboBoxImpl <em>Combo Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.ComboBoxImpl
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getComboBox()
     * @generated
     */
    EClass COMBO_BOX = eINSTANCE.getComboBox();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMBO_BOX__NAME = eINSTANCE.getComboBox_Name();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DROP_DOWN__NAME = eINSTANCE.getDropDown_Name();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RADIO__NAME = eINSTANCE.getRadio_Name();

    /**
     * The meta object literal for the '{@link de.nordakademie.mwi13a.team1.survey.survey.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.TypeImpl
     * @see de.nordakademie.mwi13a.team1.survey.survey.impl.SurveyPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

  }

} //SurveyPackage
