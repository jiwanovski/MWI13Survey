package de.nordakademie.mwi13a.team1.dependency.util;

import com.google.common.base.Objects;
import de.nordakademie.mwi13a.team1.dependency.dependency.DMNextParts;
import de.nordakademie.mwi13a.team1.dependency.dependency.DMQuestion;
import de.nordakademie.mwi13a.team1.dependency.dependency.Dependency;
import de.nordakademie.mwi13a.team1.dependency.dependency.PartElements;
import de.nordakademie.mwi13a.team1.survey.survey.MatrixQuestion;
import de.nordakademie.mwi13a.team1.survey.survey.Question;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DependencyUtil {
  private final static ArrayList<Question> questionsAdded = new Function0<ArrayList<Question>>() {
    public ArrayList<Question> apply() {
      ArrayList<Question> _newArrayList = CollectionLiterals.<Question>newArrayList();
      return _newArrayList;
    }
  }.apply();
  
  private final static ArrayList<MatrixQuestion> matrixQuestionsAdded = new Function0<ArrayList<MatrixQuestion>>() {
    public ArrayList<MatrixQuestion> apply() {
      ArrayList<MatrixQuestion> _newArrayList = CollectionLiterals.<MatrixQuestion>newArrayList();
      return _newArrayList;
    }
  }.apply();
  
  public static void partHierarchy(final PartElements c) {
    final ArrayList<PartElements> visited = CollectionLiterals.<PartElements>newArrayList();
  }
  
  public static boolean addedQuestionParameters(final Question q) {
    boolean _xblockexpression = false;
    {
      boolean contains = false;
      boolean _notEquals = (!Objects.equal(q, null));
      if (_notEquals) {
        boolean _contains = DependencyUtil.questionsAdded.contains(q);
        contains = _contains;
        boolean _not = (!contains);
        if (_not) {
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
        boolean _not = (!contains);
        if (_not) {
          DependencyUtil.matrixQuestionsAdded.add(q);
        }
      }
      _xblockexpression = (contains);
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
          boolean _isAncestor = EcoreUtil.isAncestor(it, e);
          return Boolean.valueOf(_isAncestor);
        }
      };
      final Dependency containingPart = IterableExtensions.<Dependency>findFirst(allQuestions, _function);
      int _indexOf = allQuestions.indexOf(containingPart);
      List<Dependency> _subList = allQuestions.subList(0, _indexOf);
      List<DMQuestion> _typeSelect = EcoreUtil2.<DMQuestion>typeSelect(_subList, DMQuestion.class);
      _xblockexpression = (_typeSelect);
    }
    return _xblockexpression;
  }
}
