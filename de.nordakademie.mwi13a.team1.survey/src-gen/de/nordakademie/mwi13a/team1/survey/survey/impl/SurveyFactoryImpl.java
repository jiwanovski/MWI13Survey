/**
 */
package de.nordakademie.mwi13a.team1.survey.survey.impl;

import de.nordakademie.mwi13a.team1.survey.survey.*;

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
public class SurveyFactoryImpl extends EFactoryImpl implements SurveyFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SurveyFactory init()
  {
    try
    {
      SurveyFactory theSurveyFactory = (SurveyFactory)EPackage.Registry.INSTANCE.getEFactory(SurveyPackage.eNS_URI);
      if (theSurveyFactory != null)
      {
        return theSurveyFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SurveyFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SurveyFactoryImpl()
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
      case SurveyPackage.SURVEY: return createSurvey();
      case SurveyPackage.QUESTIONNAIRE: return createQuestionnaire();
      case SurveyPackage.PART: return createPart();
      case SurveyPackage.QUESTION: return createQuestion();
      case SurveyPackage.MATRIX_QUESTION: return createMatrixQuestion();
      case SurveyPackage.MATRIX_SCALE: return createMatrixScale();
      case SurveyPackage.ANSWER: return createAnswer();
      case SurveyPackage.SURVEY_TERMINAL_TYPES: return createSurveyTerminalTypes();
      case SurveyPackage.TEXT_LINE: return createTextLine();
      case SurveyPackage.TEXT_BLOCK: return createTextBlock();
      case SurveyPackage.MATRIX: return createMatrix();
      case SurveyPackage.CHECK_BOX: return createCheckBox();
      case SurveyPackage.DROP_DOWN: return createDropDown();
      case SurveyPackage.RADIO: return createRadio();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Survey createSurvey()
  {
    SurveyImpl survey = new SurveyImpl();
    return survey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Questionnaire createQuestionnaire()
  {
    QuestionnaireImpl questionnaire = new QuestionnaireImpl();
    return questionnaire;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Part createPart()
  {
    PartImpl part = new PartImpl();
    return part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Question createQuestion()
  {
    QuestionImpl question = new QuestionImpl();
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatrixQuestion createMatrixQuestion()
  {
    MatrixQuestionImpl matrixQuestion = new MatrixQuestionImpl();
    return matrixQuestion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatrixScale createMatrixScale()
  {
    MatrixScaleImpl matrixScale = new MatrixScaleImpl();
    return matrixScale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Answer createAnswer()
  {
    AnswerImpl answer = new AnswerImpl();
    return answer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SurveyTerminalTypes createSurveyTerminalTypes()
  {
    SurveyTerminalTypesImpl surveyTerminalTypes = new SurveyTerminalTypesImpl();
    return surveyTerminalTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextLine createTextLine()
  {
    TextLineImpl textLine = new TextLineImpl();
    return textLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextBlock createTextBlock()
  {
    TextBlockImpl textBlock = new TextBlockImpl();
    return textBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Matrix createMatrix()
  {
    MatrixImpl matrix = new MatrixImpl();
    return matrix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckBox createCheckBox()
  {
    CheckBoxImpl checkBox = new CheckBoxImpl();
    return checkBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DropDown createDropDown()
  {
    DropDownImpl dropDown = new DropDownImpl();
    return dropDown;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Radio createRadio()
  {
    RadioImpl radio = new RadioImpl();
    return radio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SurveyPackage getSurveyPackage()
  {
    return (SurveyPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SurveyPackage getPackage()
  {
    return SurveyPackage.eINSTANCE;
  }

} //SurveyFactoryImpl
