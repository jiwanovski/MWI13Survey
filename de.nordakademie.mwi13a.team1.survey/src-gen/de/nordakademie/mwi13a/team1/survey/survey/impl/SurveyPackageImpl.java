/**
 */
package de.nordakademie.mwi13a.team1.survey.survey.impl;

import de.nordakademie.mwi13a.team1.survey.survey.Answer;
import de.nordakademie.mwi13a.team1.survey.survey.ComboBox;
import de.nordakademie.mwi13a.team1.survey.survey.DropDown;
import de.nordakademie.mwi13a.team1.survey.survey.Matrix;
import de.nordakademie.mwi13a.team1.survey.survey.MatrixQuestion;
import de.nordakademie.mwi13a.team1.survey.survey.MatrixScale;
import de.nordakademie.mwi13a.team1.survey.survey.Part;
import de.nordakademie.mwi13a.team1.survey.survey.Question;
import de.nordakademie.mwi13a.team1.survey.survey.Questionnaire;
import de.nordakademie.mwi13a.team1.survey.survey.Radio;
import de.nordakademie.mwi13a.team1.survey.survey.Survey;
import de.nordakademie.mwi13a.team1.survey.survey.SurveyFactory;
import de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage;
import de.nordakademie.mwi13a.team1.survey.survey.SurveyTerminalTypes;
import de.nordakademie.mwi13a.team1.survey.survey.TextBlock;
import de.nordakademie.mwi13a.team1.survey.survey.TextLine;

import org.eclipse.emf.ecore.EAttribute;
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
public class SurveyPackageImpl extends EPackageImpl implements SurveyPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass surveyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass questionnaireEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass partEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass questionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matrixQuestionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matrixScaleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass answerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass surveyTerminalTypesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textLineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matrixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comboBoxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dropDownEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass radioEClass = null;

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
   * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SurveyPackageImpl()
  {
    super(eNS_URI, SurveyFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SurveyPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SurveyPackage init()
  {
    if (isInited) return (SurveyPackage)EPackage.Registry.INSTANCE.getEPackage(SurveyPackage.eNS_URI);

    // Obtain or create and register package
    SurveyPackageImpl theSurveyPackage = (SurveyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SurveyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SurveyPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSurveyPackage.createPackageContents();

    // Initialize created meta-data
    theSurveyPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSurveyPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SurveyPackage.eNS_URI, theSurveyPackage);
    return theSurveyPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSurvey()
  {
    return surveyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSurvey_Questionnaire()
  {
    return (EReference)surveyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuestionnaire()
  {
    return questionnaireEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestionnaire_Name()
  {
    return (EAttribute)questionnaireEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestionnaire_Id()
  {
    return (EAttribute)questionnaireEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuestionnaire_Part()
  {
    return (EReference)questionnaireEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPart()
  {
    return partEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPart_Name()
  {
    return (EAttribute)partEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPart_Id()
  {
    return (EAttribute)partEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPart_Question()
  {
    return (EReference)partEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuestion()
  {
    return questionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestion_Name()
  {
    return (EAttribute)questionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestion_Id()
  {
    return (EAttribute)questionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestion_Mandatory()
  {
    return (EAttribute)questionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuestion_QuestionType()
  {
    return (EReference)questionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatrixQuestion()
  {
    return matrixQuestionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMatrixQuestion_Id()
  {
    return (EAttribute)matrixQuestionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMatrixQuestion_Name()
  {
    return (EAttribute)matrixQuestionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatrixScale()
  {
    return matrixScaleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMatrixScale_Name()
  {
    return (EAttribute)matrixScaleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnswer()
  {
    return answerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnswer_Id()
  {
    return (EAttribute)answerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnswer_Name()
  {
    return (EAttribute)answerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSurveyTerminalTypes()
  {
    return surveyTerminalTypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSurveyTerminalTypes_Name()
  {
    return (EAttribute)surveyTerminalTypesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextLine()
  {
    return textLineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextLine_Length()
  {
    return (EAttribute)textLineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextBlock()
  {
    return textBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextBlock_Length()
  {
    return (EAttribute)textBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatrix()
  {
    return matrixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatrix_MatrixScale()
  {
    return (EReference)matrixEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatrix_MatrixQuestion()
  {
    return (EReference)matrixEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComboBox()
  {
    return comboBoxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComboBox_Answer()
  {
    return (EReference)comboBoxEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDropDown()
  {
    return dropDownEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDropDown_Answer()
  {
    return (EReference)dropDownEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRadio()
  {
    return radioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRadio_Answer()
  {
    return (EReference)radioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SurveyFactory getSurveyFactory()
  {
    return (SurveyFactory)getEFactoryInstance();
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
    surveyEClass = createEClass(SURVEY);
    createEReference(surveyEClass, SURVEY__QUESTIONNAIRE);

    questionnaireEClass = createEClass(QUESTIONNAIRE);
    createEAttribute(questionnaireEClass, QUESTIONNAIRE__NAME);
    createEAttribute(questionnaireEClass, QUESTIONNAIRE__ID);
    createEReference(questionnaireEClass, QUESTIONNAIRE__PART);

    partEClass = createEClass(PART);
    createEAttribute(partEClass, PART__NAME);
    createEAttribute(partEClass, PART__ID);
    createEReference(partEClass, PART__QUESTION);

    questionEClass = createEClass(QUESTION);
    createEAttribute(questionEClass, QUESTION__NAME);
    createEAttribute(questionEClass, QUESTION__ID);
    createEAttribute(questionEClass, QUESTION__MANDATORY);
    createEReference(questionEClass, QUESTION__QUESTION_TYPE);

    matrixQuestionEClass = createEClass(MATRIX_QUESTION);
    createEAttribute(matrixQuestionEClass, MATRIX_QUESTION__ID);
    createEAttribute(matrixQuestionEClass, MATRIX_QUESTION__NAME);

    matrixScaleEClass = createEClass(MATRIX_SCALE);
    createEAttribute(matrixScaleEClass, MATRIX_SCALE__NAME);

    answerEClass = createEClass(ANSWER);
    createEAttribute(answerEClass, ANSWER__ID);
    createEAttribute(answerEClass, ANSWER__NAME);

    surveyTerminalTypesEClass = createEClass(SURVEY_TERMINAL_TYPES);
    createEAttribute(surveyTerminalTypesEClass, SURVEY_TERMINAL_TYPES__NAME);

    textLineEClass = createEClass(TEXT_LINE);
    createEAttribute(textLineEClass, TEXT_LINE__LENGTH);

    textBlockEClass = createEClass(TEXT_BLOCK);
    createEAttribute(textBlockEClass, TEXT_BLOCK__LENGTH);

    matrixEClass = createEClass(MATRIX);
    createEReference(matrixEClass, MATRIX__MATRIX_SCALE);
    createEReference(matrixEClass, MATRIX__MATRIX_QUESTION);

    comboBoxEClass = createEClass(COMBO_BOX);
    createEReference(comboBoxEClass, COMBO_BOX__ANSWER);

    dropDownEClass = createEClass(DROP_DOWN);
    createEReference(dropDownEClass, DROP_DOWN__ANSWER);

    radioEClass = createEClass(RADIO);
    createEReference(radioEClass, RADIO__ANSWER);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    textLineEClass.getESuperTypes().add(this.getSurveyTerminalTypes());
    textBlockEClass.getESuperTypes().add(this.getSurveyTerminalTypes());
    matrixEClass.getESuperTypes().add(this.getSurveyTerminalTypes());
    comboBoxEClass.getESuperTypes().add(this.getSurveyTerminalTypes());
    dropDownEClass.getESuperTypes().add(this.getSurveyTerminalTypes());
    radioEClass.getESuperTypes().add(this.getSurveyTerminalTypes());

    // Initialize classes and features; add operations and parameters
    initEClass(surveyEClass, Survey.class, "Survey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSurvey_Questionnaire(), this.getQuestionnaire(), null, "questionnaire", null, 0, -1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(questionnaireEClass, Questionnaire.class, "Questionnaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuestionnaire_Name(), ecorePackage.getEString(), "name", null, 0, 1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuestionnaire_Id(), ecorePackage.getEString(), "id", null, 0, 1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuestionnaire_Part(), this.getPart(), null, "part", null, 0, -1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(partEClass, Part.class, "Part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPart_Name(), ecorePackage.getEString(), "name", null, 0, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPart_Id(), ecorePackage.getEString(), "id", null, 0, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPart_Question(), this.getQuestion(), null, "question", null, 0, -1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuestion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuestion_Id(), ecorePackage.getEString(), "id", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuestion_Mandatory(), ecorePackage.getEBoolean(), "mandatory", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuestion_QuestionType(), this.getSurveyTerminalTypes(), null, "questionType", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(matrixQuestionEClass, MatrixQuestion.class, "MatrixQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMatrixQuestion_Id(), ecorePackage.getEString(), "id", null, 0, 1, MatrixQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMatrixQuestion_Name(), ecorePackage.getEString(), "name", null, 0, 1, MatrixQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(matrixScaleEClass, MatrixScale.class, "MatrixScale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMatrixScale_Name(), ecorePackage.getEString(), "name", null, 0, 1, MatrixScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(answerEClass, Answer.class, "Answer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnswer_Id(), ecorePackage.getEString(), "id", null, 0, 1, Answer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAnswer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Answer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(surveyTerminalTypesEClass, SurveyTerminalTypes.class, "SurveyTerminalTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSurveyTerminalTypes_Name(), ecorePackage.getEString(), "name", null, 0, 1, SurveyTerminalTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textLineEClass, TextLine.class, "TextLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTextLine_Length(), ecorePackage.getEInt(), "length", null, 0, 1, TextLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textBlockEClass, TextBlock.class, "TextBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTextBlock_Length(), ecorePackage.getEInt(), "length", null, 0, 1, TextBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(matrixEClass, Matrix.class, "Matrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMatrix_MatrixScale(), this.getMatrixScale(), null, "matrixScale", null, 0, -1, Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMatrix_MatrixQuestion(), this.getMatrixQuestion(), null, "matrixQuestion", null, 0, -1, Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comboBoxEClass, ComboBox.class, "ComboBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComboBox_Answer(), this.getAnswer(), null, "answer", null, 0, -1, ComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dropDownEClass, DropDown.class, "DropDown", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDropDown_Answer(), this.getAnswer(), null, "answer", null, 0, -1, DropDown.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(radioEClass, Radio.class, "Radio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRadio_Answer(), this.getAnswer(), null, "answer", null, 0, -1, Radio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SurveyPackageImpl
