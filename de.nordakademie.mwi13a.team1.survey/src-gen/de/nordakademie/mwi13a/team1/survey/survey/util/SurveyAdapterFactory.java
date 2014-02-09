/**
 */
package de.nordakademie.mwi13a.team1.survey.survey.util;

import de.nordakademie.mwi13a.team1.survey.survey.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyPackage
 * @generated
 */
public class SurveyAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SurveyPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SurveyAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SurveyPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SurveySwitch<Adapter> modelSwitch =
    new SurveySwitch<Adapter>()
    {
      @Override
      public Adapter caseSurvey(Survey object)
      {
        return createSurveyAdapter();
      }
      @Override
      public Adapter caseQuestionnaire(Questionnaire object)
      {
        return createQuestionnaireAdapter();
      }
      @Override
      public Adapter casePart(Part object)
      {
        return createPartAdapter();
      }
      @Override
      public Adapter caseQuestion(Question object)
      {
        return createQuestionAdapter();
      }
      @Override
      public Adapter caseMatrixQuestion(MatrixQuestion object)
      {
        return createMatrixQuestionAdapter();
      }
      @Override
      public Adapter caseMatrixScale(MatrixScale object)
      {
        return createMatrixScaleAdapter();
      }
      @Override
      public Adapter caseAnswer(Answer object)
      {
        return createAnswerAdapter();
      }
      @Override
      public Adapter caseSurveyTerminalTypes(SurveyTerminalTypes object)
      {
        return createSurveyTerminalTypesAdapter();
      }
      @Override
      public Adapter caseTextLine(TextLine object)
      {
        return createTextLineAdapter();
      }
      @Override
      public Adapter caseTextBlock(TextBlock object)
      {
        return createTextBlockAdapter();
      }
      @Override
      public Adapter caseMatrix(Matrix object)
      {
        return createMatrixAdapter();
      }
      @Override
      public Adapter caseCheckBox(CheckBox object)
      {
        return createCheckBoxAdapter();
      }
      @Override
      public Adapter caseDropDown(DropDown object)
      {
        return createDropDownAdapter();
      }
      @Override
      public Adapter caseRadio(Radio object)
      {
        return createRadioAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.survey.survey.Survey <em>Survey</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Survey
   * @generated
   */
  public Adapter createSurveyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.survey.survey.Questionnaire <em>Questionnaire</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Questionnaire
   * @generated
   */
  public Adapter createQuestionnaireAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.survey.survey.Part <em>Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Part
   * @generated
   */
  public Adapter createPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.survey.survey.Question <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Question
   * @generated
   */
  public Adapter createQuestionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.survey.survey.MatrixQuestion <em>Matrix Question</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.survey.survey.MatrixQuestion
   * @generated
   */
  public Adapter createMatrixQuestionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.survey.survey.MatrixScale <em>Matrix Scale</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.survey.survey.MatrixScale
   * @generated
   */
  public Adapter createMatrixScaleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.survey.survey.Answer <em>Answer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Answer
   * @generated
   */
  public Adapter createAnswerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.survey.survey.SurveyTerminalTypes <em>Terminal Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.survey.survey.SurveyTerminalTypes
   * @generated
   */
  public Adapter createSurveyTerminalTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.survey.survey.TextLine <em>Text Line</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.survey.survey.TextLine
   * @generated
   */
  public Adapter createTextLineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.survey.survey.TextBlock <em>Text Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.survey.survey.TextBlock
   * @generated
   */
  public Adapter createTextBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.survey.survey.Matrix <em>Matrix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Matrix
   * @generated
   */
  public Adapter createMatrixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.survey.survey.CheckBox <em>Check Box</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.survey.survey.CheckBox
   * @generated
   */
  public Adapter createCheckBoxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.survey.survey.DropDown <em>Drop Down</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.survey.survey.DropDown
   * @generated
   */
  public Adapter createDropDownAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.nordakademie.mwi13a.team1.survey.survey.Radio <em>Radio</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.nordakademie.mwi13a.team1.survey.survey.Radio
   * @generated
   */
  public Adapter createRadioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SurveyAdapterFactory
