package de.nordakademie.mwi13a.team1.survey.tests;

import com.google.inject.Inject;
import de.nordakademie.mwi13a.team1.survey.SurveyInjectorProvider;
import de.nordakademie.mwi13a.team1.survey.generator.SurveyGenerator;
import de.nordakademie.mwi13a.team1.survey.survey.Survey;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SurveyInjectorProvider.class)
@SuppressWarnings("all")
public class GeneratorTest {
  @Inject
  private ParseHelper<Survey> parseHelper;
  
  @Inject
  private SurveyGenerator generator;
  
  @Test
  public void testServeyGenerator() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("artist Queen");
    _builder.newLine();
    _builder.append("album \"FooBar\" by Queen {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"First\" 10:21");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("<html>");
    _builder_1.newLine();
    _builder_1.append("<head>");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("<title>Meine Musiksammlung</title>");
    _builder_1.newLine();
    _builder_1.append("</head>");
    _builder_1.newLine();
    _builder_1.append("<body>");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("<h1>\"FooBar\"</h1>");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("<ol>");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("<li>First (10:21)</li>");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("</ol>");
    _builder_1.newLine();
    _builder_1.append("</body>");
    _builder_1.newLine();
    _builder_1.append("</html>");
    _builder_1.newLine();
    this.assertGeneratesTo(_builder, _builder_1);
  }
  
  private Object assertGeneratesTo(final CharSequence model, final CharSequence expectedJSP) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method assertEquals is undefined for the type GeneratorTest"
      + "\nInvalid number of arguments. The method toJSP(Questionnaire, Part) is not applicable for the arguments (Survey)"
      + "\nType mismatch: cannot convert from Survey to Questionnaire");
  }
}
