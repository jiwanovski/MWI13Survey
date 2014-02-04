package de.nordakademie.mwi13a.team1.dependency.util;

import de.nordakademie.mwi13a.team1.dependency.dependency.DMNextParts;
import de.nordakademie.mwi13a.team1.dependency.dependency.DMQuestion;
import de.nordakademie.mwi13a.team1.dependency.dependency.Dependency;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DependencyUtil {
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
}
