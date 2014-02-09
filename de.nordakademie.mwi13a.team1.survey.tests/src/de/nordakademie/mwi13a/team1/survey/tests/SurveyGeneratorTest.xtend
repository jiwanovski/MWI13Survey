package de.nordakademie.mwi13a.team1.survey.tests;

import com.google.inject.Inject
import de.nordakademie.mwi13a.team1.survey.SurveyInjectorProvider
import de.nordakademie.mwi13a.team1.survey.generator.SurveyGenerator
import de.nordakademie.mwi13a.team1.survey.survey.Survey
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(SurveyInjectorProvider)

class SurveyGeneratorTest {
	
	@Inject ParseHelper<Survey> parseHelper
	@Inject SurveyGenerator generator
	
	@Test
	def void testSurveyGenerator() {
		'''
			Questionnaire:"Fragebogen Getränke"{
				Questionnaire-ID:Getraenke
					Part:"Personendaten"{
						Part-ID:GetrPersonendaten
						Question:"Bitte nennen Sie Ihren Vornamen."{
							Question-ID:GetrPersVor
							Mandatory Field
							Type:TextLine(30)		
						}
						Question:"Bitte nennen Sie Ihren Nachnamen."{
							Question-ID:GetrPersNach
							Mandatory Field
							Type:TextLine(30)		
						}
						Question:"Bitte wählen Sie Ihr Geschlecht!"{
							Question-ID:GetrPersGeschlecht
							Mandatory Field
							Type:Radio{
								Answer-ID:GetrPersGeschlAntMaennl
								Answer:"Männlich" 
								Answer-ID:GetrPersGeschlAntWeibl
								Answer:"Weiblich"
							}
						}
						Question:"Bitte bestimmen Sie Ihr Alter."{
							Question-ID:GetrPersAlt
							Mandatory Field
							Type:DropDown{
								Answer-ID:GetrPersAltAnt16
								Answer:"Unter 16 Jahre"
								Answer-ID:GetrPersAltAnt29
								Answer:"17 bis 29 Jahre"
								Answer-ID:GetrPersAltAnt50
								Answer:"30 bis 50 Jahre"
								Answer-ID:GetrPersAltAnt99
								Answer:"Über 50 Jahre"		
							}
						}
						Question:"Wählen Sie Ihren Familienstand."{
							Question-ID:GetrPersFam
							Mandatory Field
							Type:DropDown{
								Answer-ID:GetrPersGeschlAntLed
								Answer:"Ledig"
								Answer-ID:GetrPersGeschlAntVerh
								Answer:"Verheiratet"
								Answer-ID:GetrPersGeschlAntGesch
								Answer:"Geschieden"
								Answer-ID:GetrPersGeschlAntVerw
								Answer:"Verwittwert"
							}
						}
						Question:"Bitte beschreiben Sie Ihre generelle Einstellung zu alkoholischen Getränken."{
							Question-ID:GetrPersEinst
							Type:TextBlock(30)
						}
						Question:"Wie gern trinken Sie die folgenden Getränke?"{
							Question-ID:GetrPersGern
							Mandatory Field
							Type:Matrix{
								Scale:(Answer-ID:MatrANicht Answer:"Gar nicht"|Answer-ID:MatrAUng Answer:"Ungern"|Answer-ID:MatrANeutr Answer:"Neutral"|Answer-ID:MatrAGern Answer:"Gern"|Answer-ID:MatrASGern Answer:"Sehr gern")
									Questions:(Question-ID:MatrQBier Question:"Bier"|Question-ID:MatrQWein Question:"Wein"|Question-ID:MatrQSekt Question:"Sekt"|Question-ID:MatrQSchnaps Question:"Schnaps")
							}
						}
					}
			}
		'''
		.assertGeneratesTo(
		'''
			<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
			pageEncoding="ISO-8859-1"%>
			<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
			<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
				<head>
					  <title>Fragebogen Getränke</title>
				<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
				<link rel="stylesheet" type="text/css" href="css/default.css" />
				</head>
				<body>    
					<form action="FragebogenGetraenkePersonendaten" method="post">
					<div>
						<h1>Fragebogen Getränke</h1>
						<fieldset class="part">
						<legend>Personendaten</legend>
						<p>
							<p>
							<label class="lblQuestion">Bitte nennen Sie Ihren Vornamen.
							</label>
							</p><p>
							<input name= "GetrPersVor" class="textLine" type="text" maxlength="30"/>
							<span class="error">${messages.GetrPersVor}</span>
							</p>
							
							<p>
							<label class="lblQuestion">Bitte nennen Sie Ihren Nachnamen.
							</label>
							</p><p>
							<input name= "GetrPersNach" class="textLine" type="text" maxlength="30"/>
							<span class="error">${messages.GetrPersNach}</span>
							</p>
							
							<p>
							<label class="lblQuestion">Bitte wählen Sie Ihr Geschlecht!
							</label>
							</p><p>
							<p>
							<input type="radio" name="GetrPersGeschlecht" value="GetrPersGeschlAntMaennl"/>Männlich
							</p>
							<p>
							<input type="radio" name="GetrPersGeschlecht" value="GetrPersGeschlAntWeibl"/>Weiblich
							</p>
							</p>
							
							<p>
							<label class="lblQuestion">Bitte bestimmen Sie Ihr Alter.
							</label>
							</p><p>
							<select name="GetrPersAlt" class="GetrPersAlt">
							<option value="GetrPersAltAnt16">Unter 16 Jahre
							</option>
							<option value="GetrPersAltAnt29">17 bis 29 Jahre
							</option>
							<option value="GetrPersAltAnt50">30 bis 50 Jahre
							</option>
							<option value="GetrPersAltAnt99">Über 50 Jahre
							</option>
							</select>
							</p>
							
							<p>
							<label class="lblQuestion">Wählen Sie Ihren Familienstand.
							</label>
							</p><p>
							<select name="GetrPersFam" class="GetrPersFam">
							<option value="GetrPersGeschlAntLed">Ledig
							</option>
							<option value="GetrPersGeschlAntVerh">Verheiratet
							</option>
							<option value="GetrPersGeschlAntGesch">Geschieden
							</option>
							<option value="GetrPersGeschlAntVerw">Verwittwert
							</option>
							</select>
							</p>
							
							<p>
							<label class="lblQuestion">Bitte beschreiben Sie Ihre generelle Einstellung zu alkoholischen Getränken.
							</label>
							</p><p>
							<textarea name="GetrPersEinst" maxlength="30" rows="10" cols="50"></textarea>
							<span class="error">${messages.GetrPersEinst}</span>
							</p>
							
							<p>
							<label class="lblQuestion">Wie gern trinken Sie die folgenden Getränke?
							</label>
							</p><p>
								<table cellspacing="5">
								<tr>
								<td>&nbsp;</td>
								<td>Gar nicht
								</td>
								<td>Ungern
								</td>
								<td>Neutral
								</td>
								<td>Gern
								</td>
								<td>Sehr gern
								</td>
								</tr>
								
								<tr>
								<tr>
								<td> Bier</td>
										<td class="radio">
										<input class="matrix" type="radio" name="MatrQBier" value="MatrANicht"/>
										</td>
										<td class="radio">
										<input class="matrix" type="radio" name="MatrQBier" value="MatrAUng"/>
										</td>
										<td class="radio">
										<input class="matrix" type="radio" name="MatrQBier" value="MatrANeutr"/>
										</td>
										<td class="radio">
										<input class="matrix" type="radio" name="MatrQBier" value="MatrAGern"/>
										</td>
										<td class="radio">
										<input class="matrix" type="radio" name="MatrQBier" value="MatrASGern"/>
										</td>
								</tr>
								<tr>
								<td> Wein</td>
										<td class="radio">
										<input class="matrix" type="radio" name="MatrQWein" value="MatrANicht"/>
										</td>
										<td class="radio">
										<input class="matrix" type="radio" name="MatrQWein" value="MatrAUng"/>
										</td>
										<td class="radio">
										<input class="matrix" type="radio" name="MatrQWein" value="MatrANeutr"/>
										</td>
										<td class="radio">
										<input class="matrix" type="radio" name="MatrQWein" value="MatrAGern"/>
										</td>
										<td class="radio">
										<input class="matrix" type="radio" name="MatrQWein" value="MatrASGern"/>
										</td>
								</tr>
								<tr>
								<td> Sekt</td>
										<td class="radio">
										<input class="matrix" type="radio" name="MatrQSekt" value="MatrANicht"/>
										</td>
										<td class="radio">
										<input class="matrix" type="radio" name="MatrQSekt" value="MatrAUng"/>
										</td>
										<td class="radio">
										<input class="matrix" type="radio" name="MatrQSekt" value="MatrANeutr"/>
										</td>
										<td class="radio">
										<input class="matrix" type="radio" name="MatrQSekt" value="MatrAGern"/>
										</td>
										<td class="radio">
										<input class="matrix" type="radio" name="MatrQSekt" value="MatrASGern"/>
										</td>
								</tr>
								<tr>
								<td> Schnaps</td>
										<td class="radio">
										<input class="matrix" type="radio" name="MatrQSchnaps" value="MatrANicht"/>
										</td>
										<td class="radio">
										<input class="matrix" type="radio" name="MatrQSchnaps" value="MatrAUng"/>
										</td>
										<td class="radio">
										<input class="matrix" type="radio" name="MatrQSchnaps" value="MatrANeutr"/>
										</td>
										<td class="radio">
										<input class="matrix" type="radio" name="MatrQSchnaps" value="MatrAGern"/>
										</td>
										<td class="radio">
										<input class="matrix" type="radio" name="MatrQSchnaps" value="MatrASGern"/>
										</td>
								</tr>
								</table>
							</p>
						</p>
						</fieldset>
						<p>
						<fieldset class="buttons">
							<input class="button" type="reset" value=" Cancel">
							<input class="button" type="submit" value=" Next &raquo;">
						</fieldset>
						</p>
						</div>
					</form>
				</body>
			</html>
		'''
		)
	}
	
	// Test the "toJSP" generator to create the jsp/html code for each question
	// this test runs only for a model with only one questionnaire and one part.
	private def assertGeneratesTo(CharSequence surveymodel, CharSequence expectedJSP) {
		val survey = parseHelper.parse(surveymodel)
		val questionnaire = survey.questionnaire.head
		val jsp = generator.toJSP(questionnaire , questionnaire.part.head).toString
		expectedJSP.toString.assertEquals(jsp)
		
		}
	}