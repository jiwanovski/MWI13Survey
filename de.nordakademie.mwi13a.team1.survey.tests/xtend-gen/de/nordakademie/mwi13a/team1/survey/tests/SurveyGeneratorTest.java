package de.nordakademie.mwi13a.team1.survey.tests;

import com.google.inject.Inject;
import de.nordakademie.mwi13a.team1.survey.SurveyInjectorProvider;
import de.nordakademie.mwi13a.team1.survey.generator.SurveyGenerator;
import de.nordakademie.mwi13a.team1.survey.survey.Part;
import de.nordakademie.mwi13a.team1.survey.survey.Questionnaire;
import de.nordakademie.mwi13a.team1.survey.survey.Survey;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(SurveyInjectorProvider.class)
@SuppressWarnings("all")
public class SurveyGeneratorTest {
  @Inject
  private ParseHelper<Survey> parseHelper;
  
  @Inject
  private SurveyGenerator generator;
  
  @Test
  public void testSurveyGenerator() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Questionnaire:\"Fragebogen Getränke\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Questionnaire-ID:Getraenke");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Part:\"Personendaten\"{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Part-ID:GetrPersonendaten");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Question:\"Bitte nennen Sie Ihren Vornamen.\"{");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Question-ID:GetrPersVor");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Mandatory Field");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Type:TextLine(30)\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Question:\"Bitte nennen Sie Ihren Nachnamen.\"{");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Question-ID:GetrPersNach");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Mandatory Field");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Type:TextLine(30)\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Question:\"Bitte wählen Sie Ihr Geschlecht!\"{");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Question-ID:GetrPersGeschlecht");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Mandatory Field");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Type:Radio{");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Answer-ID:GetrPersGeschlAntMaennl");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Answer:\"Männlich\" ");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Answer-ID:GetrPersGeschlAntWeibl");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Answer:\"Weiblich\"");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Question:\"Bitte bestimmen Sie Ihr Alter.\"{");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Question-ID:GetrPersAlt");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Mandatory Field");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Type:DropDown{");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Answer-ID:GetrPersAltAnt16");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Answer:\"Unter 16 Jahre\"");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Answer-ID:GetrPersAltAnt29");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Answer:\"17 bis 29 Jahre\"");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Answer-ID:GetrPersAltAnt50");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Answer:\"30 bis 50 Jahre\"");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Answer-ID:GetrPersAltAnt99");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Answer:\"Über 50 Jahre\"\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Question:\"Wählen Sie Ihren Familienstand.\"{");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Question-ID:GetrPersFam");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Mandatory Field");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Type:DropDown{");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Answer-ID:GetrPersGeschlAntLed");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Answer:\"Ledig\"");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Answer-ID:GetrPersGeschlAntVerh");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Answer:\"Verheiratet\"");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Answer-ID:GetrPersGeschlAntGesch");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Answer:\"Geschieden\"");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Answer-ID:GetrPersGeschlAntVerw");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Answer:\"Verwittwert\"");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Question:\"Bitte beschreiben Sie Ihre generelle Einstellung zu alkoholischen Getränken.\"{");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Question-ID:GetrPersEinst");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Type:TextBlock(30)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Question:\"Wie gern trinken Sie die folgenden Getränke?\"{");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Question-ID:GetrPersGern");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Mandatory Field");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Type:Matrix{");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Scale:(Answer-ID:MatrANicht Answer:\"Gar nicht\"|Answer-ID:MatrAUng Answer:\"Ungern\"|Answer-ID:MatrANeutr Answer:\"Neutral\"|Answer-ID:MatrAGern Answer:\"Gern\"|Answer-ID:MatrASGern Answer:\"Sehr gern\")");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("Questions:(Question-ID:MatrQBier Question:\"Bier\"|Question-ID:MatrQWein Question:\"Wein\"|Question-ID:MatrQSekt Question:\"Sekt\"|Question-ID:MatrQSchnaps Question:\"Schnaps\")");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\"");
    _builder_1.newLine();
    _builder_1.append("pageEncoding=\"ISO-8859-1\"%>");
    _builder_1.newLine();
    _builder_1.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");
    _builder_1.newLine();
    _builder_1.append("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("<head>");
    _builder_1.newLine();
    _builder_1.append("\t\t  ");
    _builder_1.append("<title>Fragebogen Getränke</title>");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/default.css\" />");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("</head>");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("<body>    ");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("<form action=\"FragebogenGetraenkePersonendaten\" method=\"post\">");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("<div>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("<h1>Fragebogen Getränke</h1>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("<fieldset class=\"part\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("<legend>Personendaten</legend>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("<p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<label class=\"lblQuestion\">Bitte nennen Sie Ihren Vornamen.");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</label>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</p><p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<input name= \"GetrPersVor\" class=\"textLine\" type=\"text\" maxlength=\"30\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<span class=\"error\">${messages.GetrPersVor}</span>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<label class=\"lblQuestion\">Bitte nennen Sie Ihren Nachnamen.");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</label>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</p><p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<input name= \"GetrPersNach\" class=\"textLine\" type=\"text\" maxlength=\"30\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<span class=\"error\">${messages.GetrPersNach}</span>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<label class=\"lblQuestion\">Bitte wählen Sie Ihr Geschlecht!");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</label>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</p><p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<input type=\"radio\" name=\"GetrPersGeschlecht\" value=\"GetrPersGeschlAntMaennl\"/>Männlich");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<input type=\"radio\" name=\"GetrPersGeschlecht\" value=\"GetrPersGeschlAntWeibl\"/>Weiblich");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<label class=\"lblQuestion\">Bitte bestimmen Sie Ihr Alter.");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</label>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</p><p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<select name=\"GetrPersAlt\" class=\"GetrPersAlt\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<option value=\"GetrPersAltAnt16\">Unter 16 Jahre");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</option>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<option value=\"GetrPersAltAnt29\">17 bis 29 Jahre");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</option>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<option value=\"GetrPersAltAnt50\">30 bis 50 Jahre");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</option>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<option value=\"GetrPersAltAnt99\">Über 50 Jahre");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</option>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</select>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<label class=\"lblQuestion\">Wählen Sie Ihren Familienstand.");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</label>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</p><p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<select name=\"GetrPersFam\" class=\"GetrPersFam\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<option value=\"GetrPersGeschlAntLed\">Ledig");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</option>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<option value=\"GetrPersGeschlAntVerh\">Verheiratet");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</option>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<option value=\"GetrPersGeschlAntGesch\">Geschieden");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</option>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<option value=\"GetrPersGeschlAntVerw\">Verwittwert");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</option>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</select>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<label class=\"lblQuestion\">Bitte beschreiben Sie Ihre generelle Einstellung zu alkoholischen Getränken.");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</label>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</p><p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<textarea name=\"GetrPersEinst\" maxlength=\"30\" rows=\"10\" cols=\"50\"></textarea>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<span class=\"error\">${messages.GetrPersEinst}</span>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<label class=\"lblQuestion\">Wie gern trinken Sie die folgenden Getränke?");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</label>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</p><p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("<table cellspacing=\"5\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("<tr>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("<td>&nbsp;</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("<td>Gar nicht");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("<td>Ungern");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("<td>Neutral");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("<td>Gern");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("<td>Sehr gern");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("</tr>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("<tr>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("<tr>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("<td> Bier</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<td class=\"radio\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<input class=\"matrix\" type=\"radio\" name=\"MatrQBier\" value=\"MatrANicht\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<td class=\"radio\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<input class=\"matrix\" type=\"radio\" name=\"MatrQBier\" value=\"MatrAUng\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<td class=\"radio\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<input class=\"matrix\" type=\"radio\" name=\"MatrQBier\" value=\"MatrANeutr\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<td class=\"radio\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<input class=\"matrix\" type=\"radio\" name=\"MatrQBier\" value=\"MatrAGern\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<td class=\"radio\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<input class=\"matrix\" type=\"radio\" name=\"MatrQBier\" value=\"MatrASGern\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("</tr>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("<tr>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("<td> Wein</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<td class=\"radio\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<input class=\"matrix\" type=\"radio\" name=\"MatrQWein\" value=\"MatrANicht\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<td class=\"radio\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<input class=\"matrix\" type=\"radio\" name=\"MatrQWein\" value=\"MatrAUng\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<td class=\"radio\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<input class=\"matrix\" type=\"radio\" name=\"MatrQWein\" value=\"MatrANeutr\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<td class=\"radio\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<input class=\"matrix\" type=\"radio\" name=\"MatrQWein\" value=\"MatrAGern\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<td class=\"radio\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<input class=\"matrix\" type=\"radio\" name=\"MatrQWein\" value=\"MatrASGern\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("</tr>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("<tr>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("<td> Sekt</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<td class=\"radio\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<input class=\"matrix\" type=\"radio\" name=\"MatrQSekt\" value=\"MatrANicht\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<td class=\"radio\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<input class=\"matrix\" type=\"radio\" name=\"MatrQSekt\" value=\"MatrAUng\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<td class=\"radio\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<input class=\"matrix\" type=\"radio\" name=\"MatrQSekt\" value=\"MatrANeutr\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<td class=\"radio\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<input class=\"matrix\" type=\"radio\" name=\"MatrQSekt\" value=\"MatrAGern\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<td class=\"radio\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<input class=\"matrix\" type=\"radio\" name=\"MatrQSekt\" value=\"MatrASGern\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("</tr>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("<tr>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("<td> Schnaps</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<td class=\"radio\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<input class=\"matrix\" type=\"radio\" name=\"MatrQSchnaps\" value=\"MatrANicht\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<td class=\"radio\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<input class=\"matrix\" type=\"radio\" name=\"MatrQSchnaps\" value=\"MatrAUng\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<td class=\"radio\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<input class=\"matrix\" type=\"radio\" name=\"MatrQSchnaps\" value=\"MatrANeutr\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<td class=\"radio\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<input class=\"matrix\" type=\"radio\" name=\"MatrQSchnaps\" value=\"MatrAGern\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<td class=\"radio\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("<input class=\"matrix\" type=\"radio\" name=\"MatrQSchnaps\" value=\"MatrASGern\"/>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t\t\t");
    _builder_1.append("</td>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("</tr>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("</table>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("</p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("</p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("</fieldset>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("<p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("<fieldset class=\"buttons\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<a class=\"button\" href=\"index.jsp\"> Cancel</a>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t");
    _builder_1.append("<input class=\"button\" type=\"submit\" value=\" Next &raquo;\">");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("</fieldset>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("</p>");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("</div>");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("</form>");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("</body>");
    _builder_1.newLine();
    _builder_1.append("</html>");
    _builder_1.newLine();
    this.assertGeneratesTo(_builder, _builder_1);
  }
  
  private void assertGeneratesTo(final CharSequence surveymodel, final CharSequence expectedJSP) {
    try {
      final Survey survey = this.parseHelper.parse(surveymodel);
      EList<Questionnaire> _questionnaire = survey.getQuestionnaire();
      final Questionnaire questionnaire = IterableExtensions.<Questionnaire>head(_questionnaire);
      EList<Part> _part = questionnaire.getPart();
      Part _head = IterableExtensions.<Part>head(_part);
      CharSequence _jSP = this.generator.toJSP(questionnaire, _head);
      final String jsp = _jSP.toString();
      String _string = expectedJSP.toString();
      Assert.assertEquals(_string, jsp);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
