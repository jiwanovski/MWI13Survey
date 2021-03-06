package de.nordakademie.mwi13a.team1.dependency.util;

import com.google.common.base.Objects;
import de.nordakademie.mwi13a.team1.dependency.dependency.DMNextParts;
import de.nordakademie.mwi13a.team1.dependency.dependency.DMQuestion;
import de.nordakademie.mwi13a.team1.dependency.dependency.DefineNextPart;
import de.nordakademie.mwi13a.team1.dependency.dependency.Dependency;
import de.nordakademie.mwi13a.team1.dependency.dependency.PartElements;
import de.nordakademie.mwi13a.team1.dependency.dependency.PartOptions;
import de.nordakademie.mwi13a.team1.dependency.dependency.SurveyElements;
import de.nordakademie.mwi13a.team1.survey.survey.Matrix;
import de.nordakademie.mwi13a.team1.survey.survey.MatrixQuestion;
import de.nordakademie.mwi13a.team1.survey.survey.Part;
import de.nordakademie.mwi13a.team1.survey.survey.Question;
import de.nordakademie.mwi13a.team1.survey.survey.Questionnaire;
import de.nordakademie.mwi13a.team1.survey.survey.SurveyTerminalTypes;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DependencyUtil {
  private final static ArrayList<Question> questionsAdded = CollectionLiterals.<Question>newArrayList();
  
  private final static ArrayList<MatrixQuestion> matrixQuestionsAdded = CollectionLiterals.<MatrixQuestion>newArrayList();
  
  public static ArrayList<Part> partHierarchy(final PartElements e) {
    ArrayList<Part> _xblockexpression = null;
    {
      final ArrayList<Part> visited = CollectionLiterals.<Part>newArrayList();
      PartOptions _option = e.getOption();
      if ((_option instanceof DefineNextPart)) {
        PartOptions _option_1 = e.getOption();
        EList<DMNextParts> _nextParts = ((DefineNextPart) _option_1).getNextParts();
        for (final DMNextParts v : _nextParts) {
          {
            Part current = v.getName();
            boolean _and = false;
            boolean _notEquals = (!Objects.equal(current, null));
            if (!_notEquals) {
              _and = false;
            } else {
              boolean _contains = visited.contains(current);
              boolean _not = (!_contains);
              _and = _not;
            }
            if (_and) {
              visited.add(current);
              SurveyElements _containingSurveyElement = DependencyUtil.containingSurveyElement(e);
              EList<PartElements> _partElements = _containingSurveyElement.getPartElements();
              for (final PartElements t : _partElements) {
                Part _name = t.getName();
                Part _name_1 = v.getName();
                boolean _equals = _name.equals(_name_1);
                if (_equals) {
                  int i = 0;
                  i = (1 + 1);
                }
              }
            }
          }
        }
      }
      _xblockexpression = (visited);
    }
    return _xblockexpression;
  }
  
  public static void partHierarchy(final Part p) {
    final ArrayList<Part> visited = CollectionLiterals.<Part>newArrayList();
  }
  
  public static boolean addedQuestionParameters(final Question q) {
    boolean _xblockexpression = false;
    {
      boolean contains = false;
      boolean _notEquals = (!Objects.equal(q, null));
      if (_notEquals) {
        boolean _contains = DependencyUtil.questionsAdded.contains(q);
        contains = _contains;
        if ((!contains)) {
          DependencyUtil.questionsAdded.add(q);
        }
      }
      _xblockexpression = (contains);
    }
    return _xblockexpression;
  }
  
  public static boolean addedMatrixQuestionParameters(final MatrixQuestion q) {
    boolean _xblockexpression = false;
    {
      boolean contains = false;
      boolean _notEquals = (!Objects.equal(q, null));
      if (_notEquals) {
        boolean _contains = DependencyUtil.matrixQuestionsAdded.contains(q);
        contains = _contains;
        if ((!contains)) {
          DependencyUtil.matrixQuestionsAdded.add(q);
        }
      }
      _xblockexpression = (contains);
    }
    return _xblockexpression;
  }
  
  public static String cleanUpString(final String s) {
    String _xblockexpression = null;
    {
      String _replace = s.replace(" ", "");
      String _replace_1 = _replace.replace("ä", "ae");
      String _replace_2 = _replace_1.replace("ö", "oe");
      String cleanString = _replace_2.replace("ü", "ue");
      _xblockexpression = (cleanString);
    }
    return _xblockexpression;
  }
  
  public static ArrayList<Object> partParams(final Part p) {
    ArrayList<Object> _xblockexpression = null;
    {
      final ArrayList<Object> params = CollectionLiterals.<Object>newArrayList();
      EList<Question> _question = p.getQuestion();
      for (final Question q : _question) {
        SurveyTerminalTypes _questionType = q.getQuestionType();
        if ((_questionType instanceof Matrix)) {
          SurveyTerminalTypes _questionType_1 = q.getQuestionType();
          EList<MatrixQuestion> _matrixQuestion = ((Matrix) _questionType_1).getMatrixQuestion();
          for (final MatrixQuestion mq : _matrixQuestion) {
            boolean _and = false;
            boolean _notEquals = (!Objects.equal(mq, null));
            if (!_notEquals) {
              _and = false;
            } else {
              boolean _contains = params.contains(mq);
              boolean _not = (!_contains);
              _and = _not;
            }
            if (_and) {
              params.add(mq);
            }
          }
        } else {
          boolean _and_1 = false;
          boolean _notEquals_1 = (!Objects.equal(q, null));
          if (!_notEquals_1) {
            _and_1 = false;
          } else {
            boolean _contains_1 = params.contains(q);
            boolean _not_1 = (!_contains_1);
            _and_1 = _not_1;
          }
          if (_and_1) {
            params.add(q);
          }
        }
      }
      _xblockexpression = (params);
    }
    return _xblockexpression;
  }
  
  public static String getID(final Object o) {
    if ((o instanceof MatrixQuestion)) {
      return ((MatrixQuestion) o).getId();
    } else {
      return ((Question) o).getId();
    }
  }
  
  public static boolean isMandatory(final Object o) {
    if ((o instanceof MatrixQuestion)) {
      EObject _eContainer = ((MatrixQuestion) o).eContainer();
      EObject _eContainer_1 = ((Matrix) _eContainer).eContainer();
      return ((Question) _eContainer_1).isMandatory();
    } else {
      return ((Question) o).isMandatory();
    }
  }
  
  public static String getQuestionaireName(final PartElements e) {
    EObject _eContainer = e.eContainer();
    Questionnaire _name = ((SurveyElements) _eContainer).getName();
    return ((Questionnaire) _name).getName();
  }
  
  public static String getPartName(final PartElements e) {
    Part _name = e.getName();
    return ((Part) _name).getName();
  }
  
  public static String getObjectName(final PartElements e) {
    String _xblockexpression = null;
    {
      String _questionaireName = DependencyUtil.getQuestionaireName(e);
      String _partName = DependencyUtil.getPartName(e);
      final String text = (_questionaireName + _partName);
      _xblockexpression = (DependencyUtil.cleanUpString(text));
    }
    return _xblockexpression;
  }
  
  public static List<DMQuestion> questionsDefinedBefore(final DMQuestion e) {
    List<DMQuestion> _xblockexpression = null;
    {
      DMNextParts _containerOfType = EcoreUtil2.<DMNextParts>getContainerOfType(e, DMNextParts.class);
      final EList<Dependency> allQuestions = _containerOfType.getExpressions();
      final Function1<Dependency,Boolean> _function = new Function1<Dependency,Boolean>() {
        public Boolean apply(final Dependency it) {
          return Boolean.valueOf(EcoreUtil.isAncestor(it, e));
        }
      };
      final Dependency containingPart = IterableExtensions.<Dependency>findFirst(allQuestions, _function);
      int _indexOf = allQuestions.indexOf(containingPart);
      List<Dependency> _subList = allQuestions.subList(0, _indexOf);
      _xblockexpression = (EcoreUtil2.<DMQuestion>typeSelect(_subList, DMQuestion.class));
    }
    return _xblockexpression;
  }
  
  public static SurveyElements containingSurveyElement(final EObject e) {
    return EcoreUtil2.<SurveyElements>getContainerOfType(e, SurveyElements.class);
  }
  
  public static Questionnaire containingQuestionnaire(final EObject e) {
    return EcoreUtil2.<Questionnaire>getContainerOfType(e, Questionnaire.class);
  }
  
  public static DMNextParts containingDMNextPart(final EObject e) {
    return EcoreUtil2.<DMNextParts>getContainerOfType(e, DMNextParts.class);
  }
  
  public static Part containingPart(final EObject e) {
    return EcoreUtil2.<Part>getContainerOfType(e, Part.class);
  }
  
  public static PartElements containingPartElement(final EObject e) {
    return EcoreUtil2.<PartElements>getContainerOfType(e, PartElements.class);
  }
  
  public static Question containingQuestion(final EObject e) {
    return EcoreUtil2.<Question>getContainerOfType(e, Question.class);
  }
  
  public static Matrix containingMatrix(final EObject e) {
    return EcoreUtil2.<Matrix>getContainerOfType(e, Matrix.class);
  }
}
