/*
 * generated by Xtext
 */
package de.nordakademie.mwi13a.team1.survey.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import de.nordakademie.mwi13a.team1.survey.survey.Survey
import de.nordakademie.mwi13a.team1.survey.survey.Part
import de.nordakademie.mwi13a.team1.survey.survey.Questionnaire
import de.nordakademie.mwi13a.team1.survey.survey.Question
import de.nordakademie.mwi13a.team1.survey.survey.TextBlock
import de.nordakademie.mwi13a.team1.survey.survey.TextLine
import de.nordakademie.mwi13a.team1.survey.survey.DropDown
import de.nordakademie.mwi13a.team1.survey.survey.Radio
import de.nordakademie.mwi13a.team1.survey.survey.Matrix
import de.nordakademie.mwi13a.team1.survey.SurveyOutputConfiguration
import de.nordakademie.mwi13a.team1.survey.survey.CheckBox

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class SurveyGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val survey = resource.contents.head as Survey
		if (survey != null) {
		fsa.generateFile("default.css", SurveyOutputConfiguration::GEN_CSS_OUTPUT, toCSS)	
		fsa.generateFile("index.jsp", SurveyOutputConfiguration::GEN_JSP_OUTPUT, survey.toOverview)
		fsa.generateFile("final.jsp", SurveyOutputConfiguration::GEN_JSP_OUTPUT, survey.toFinalJSP)
			for (questionnaire : survey.questionnaire){
				for (part : questionnaire.part){
					val fileName = questionnaire.name.replace(" ","").replace("ä","ae").replace("ö","oe").replace("ü","ue")
					val filepartname = part.name.replace(" ","").replace("ä","ae").replace("ö","oe").replace("ü","ue")
					fsa.generateFile(fileName+filepartname + ".jsp", SurveyOutputConfiguration::GEN_JSP_OUTPUT, toJSP( questionnaire , part))
				}					
			}
		}
	}
	
	def toOverview(Survey survey) ''' 
		<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		pageEncoding="ISO-8859-1"%>
		<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
		<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
			<head>
				  <title>Overview of all Questionnairies</title>
			<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
			<link rel="stylesheet" type="text/css" href="css/default.css" />
			</head>
			<body>    
				<form>
				<div>
					<h1>Overview of all Questionnairies </h1>
					<fieldset class="part">
					<legend>Your Questionnairies</legend>
					<p>
						«FOR questionnaire : survey.questionnaire»
							«IF !questionnaire.name.empty»
								«val partname = questionnaire.part.head»
								«val fileName = questionnaire.name.replace(" ","").replace("ä","ae").replace("ö","oe").replace("ü","ue")»
								«val filepartname = partname.name.replace(" ","").replace("ä","ae").replace("ö","oe").replace("ü","ue")»
								<p> 
								<a href="«fileName»«filepartname».jsp">«questionnaire.name»</a><br>
							«ENDIF»
						«ENDFOR»
					</p>
					</fieldset>
					</div>
				</form>
			</body>
		</html>
	'''

	def toJSP(Questionnaire questionnaire, Part part) ''' 
		<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		pageEncoding="ISO-8859-1"%>
		<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
		<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
			<head>
				  <title>«questionnaire.name»</title>
			<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
			<link rel="stylesheet" type="text/css" href="css/default.css" />
			</head>
			<body>    
				<form action="«questionnaire.name.replace(" ","").replace("ä","ae").replace("ö","oe").replace("ü","ue")»«(part.name.replace(" ","").replace("ä","ae").replace("ö","oe").replace("ü","ue"))»" method="post">
				<div>
					<h1>«questionnaire.name»</h1>
					<fieldset class="part">
					<legend>«part.name»</legend>
					<p>
						«FOR question : part.question»
							«IF !question.name.empty»
								«val questiontype = question.questionType»
								«questiongenerate(questiontype, question)»
							«ENDIF»
						«ENDFOR»
					</p>
					</fieldset>
					<p>
					<fieldset class="buttons">
						<a class="button" href="index.jsp"> Cancel</a>
						<input class="button" type="submit" value=" Next &raquo;">
					</fieldset>
					</p>
					</div>
				</form>
			</body>
		</html>
	'''
			
	def toCSS() '''
		*
		/*general CSS and boxes/frames----------------------------------------------------*/

		* /*Set's border, padding and margin to 0 for all values*/ {
			padding: 0;
			margin: 0;
			border: 0;
		}
		
		h1 /*Header: name of questionnaire*/ {
			font-weight: 200;
			color: #888888;
			background: transparent url(../img/h1.png) no-repeat center left;
			padding-left: 33px;
			margin: 7px 5px 8px 8px;
		}
		
		body,html {
			color: #373C40;
			font-family: Verdana, Arial, Helvetica, sans-serif;
			height: auto;
			background-color: #f0f0f0;
			margin: 10px;
		}
		
		p /*Sets formats for all line breaks*/ {
			padding: 7px 0 7px 0;
			font-weight: 500;
			font-size: 10pt;
			margin-top: 10px font-size:   8pt;
			clear: both;
			margin-top: 0px;
			color: black;
			padding: 4px;
		}
		
		.part /*Borders of middle Part*/ {
			height: auto;
			padding: 5px;
			border-top: 2px solid #F5F5F5;
			margin: 5px 10px auto 10px;
		}
		
		form /*Defines the formats of the form*/ {
			width: auto;
			margin: 20px 100px 20px 100px;
			height: auto;
			background-color: #fff;
			padding: 5px;
			border-radius: 300px;
			border-radius: 20px;
			box-shadow: 3px 3px 5px 6px #ccc;
		
		}
		
		div {
			margin: 20px 20px auto 50px;
		}
		
		legend /*Defines color of headline of a part*/ {
			color: #abda0f;
			padding: 2px;
			font-weight: bold;
			font-size: 14px;
			font-weight: 1000;
		}
		
		*
			/*Questions and elements----------------------------------------------------*/
			
			
		
		.lblQuestion /*Label format for all questions*/ {
			width: auto;
			float: left;
			text-align: left;
			font-weight: 700;
			margin-right: 0px;
			margin-top: 15px;
			margin-bottom: 5px;
		}
		
		ol /*Label format for all Lists*/ {
			width: auto;
			float: left;
			text-align: left;
			font-weight: 100;
			margin-right: 0px;
			margin-bottom: 5px;
			margin-left: 25px;
			font-size: 10pt;
		}
		
		.lblBox /*Label format for all questions*/ {
			width: auto;
			margin-left: 15px
		}
		
		input.textLine /*Format for all inputs with class textLine*/ {
			width: 250px;
			color: #505050;
			border: 1px solid #E1E1E1;
			height: 18px;
		}
		
		select.dropdown /*Format for all inputs with class dropdown*/ {
			min-width: 253px;
			color: #505050;
		}
		
		textarea /*Format for all textareas*/ {
			border-style: solid;
			border-width: 2px;
			border-color: #F1F1F1
		}
		
		td /*Defines distances after table columns*/ {
			margin-left: auto;
			margin-right: auto;
			padding-right: 10px;
			text-align: right;
			font-size: 70%;
		}
		
		input:focus,select:focus /*Defines color while selecting*/ {
			background-color: #EFFFE0;
		}
		
		select /*Defines border of all dropdowns*/ {
			border: 1px solid #E1E1E1;
			width: 130px;
			float: left;
			margin-bottom: 3px;
			color: #505050;
			margin-right: 5px;
		}
		
		input /*Defines all input fields*/ {
			border-bottom-width: 2px;
			border-left-width: 2px;
			border-right-width: 10px;
			border-top-width: 2px;
			color: #000000;
			font-family: use-lang-def;
			font-size: 13px;
			font-weight: 400;
			padding: 2px;
			text-indent: 0px;
			text-transform: none;
		}
		
		input.matrix {
			margin: auto 50px auto 50px;
		}
		
		*
			/*Buttons and footer----------------------------------------------------*/
			
			
		
		fieldset.buttons {
			height: auto;
			padding: 5px;
			border-top: 2px solid #F5F5F5;
			margin: 5px 10px auto 10px;
		}
		
		.button {
			background: #abda0f url(../img/overlay.png) repeat-x;
			padding: 8px 10px 8px;
			color: #fff;
			text-decoration: none;
			-moz-border-radius: 5px;
			-webkit-border-radius: 5px;
			-moz-box-shadow: 0 1px 3px rgba(0, 0, 0, 0.5);
			-webkit-box-shadow: 0 1px 3px rgba(0, 0, 0, 0.5);
			text-shadow: 0 -1px 1px rgba(0, 0, 0, 0.25);
			cursor: pointer;
			float: left;
			font-size: 18px;
			margin: 10px;
			width: 150px;
		}
	'''
 
 	def toFinalJSP(Survey survey) '''
		<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		pageEncoding="ISO-8859-1"%>
		<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
		<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
			<head>
				  <title>Thanks</title>
			<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
			<link rel="stylesheet" type="text/css" href="css/default.css" />
			</head>
			<body>    
				<form>
				<div>
					<h1>Thanks</h1>
					<fieldset class="part">
					<h2>Vielen Dank für Ihre Teilnahme.</h2><br>
					<a href="index.jsp">Zurück zur Startseite</a>
					</fieldset>
					</div>
				</form>
			</body>
		</html>
 	'''
 
def dispatch  questiongenerate(TextLine questiontype , Question question)''' 
								<p>
								<label class="lblQuestion">«question.name»
								</label>
								</p><p>
								<input name= "«question.id»" class="textLine" type="text" maxlength="«questiontype.length»"/>
								<span class="error">${messages.«question.id»}</span>
								</p>

 '''
 
 def dispatch  questiongenerate(TextBlock questiontype , Question question)''' 
								<p>
								<label class="lblQuestion">«question.name»
								</label>
								</p><p>
								<textarea name="«question.id»" maxlength="«questiontype.length»" rows="10" cols="50"></textarea>
								<span class="error">${messages.«question.id»}</span>
								</p>

 '''
 def dispatch  questiongenerate(CheckBox questiontype , Question question)''' 
								<p>
								<label class="lblQuestion">«question.name»
								</label>
								</p><p>
								«FOR answer: questiontype.answer»
									<input type="checkbox" name="«question.id»" value="«answer.id»"> «answer.name»<br>
								«ENDFOR»
								</p>

 '''
 
  def dispatch  questiongenerate(DropDown questiontype , Question question)''' 
								<p>
								<label class="lblQuestion">«question.name»
								</label>
								</p><p>
								<select name="«question.id»" class="«question.id»">
								«FOR answer: questiontype.answer»
									<option value="«answer.id»">«answer.name»
									</option>
								«ENDFOR»
								</select>
								</p>

 '''
 
  def dispatch  questiongenerate(Radio questiontype , Question question)''' 
								<p>
								<label class="lblQuestion">«question.name»
								</label>
								</p><p>
								«FOR answer: questiontype.answer»
									<p>
									<input type="radio" name="«question.id»" value="«answer.id»"/>«answer.name»
									</p>
								«ENDFOR»
								</p>

 '''
   def dispatch  questiongenerate(Matrix questiontype , Question question)''' 
								<p>
								<label class="lblQuestion">«question.name»
								</label>
								</p><p>
									<table cellspacing="5">
									<tr>
									<td>&nbsp;</td>
									«FOR answer: questiontype.answer»
									<td>«answer.name»
									</td>
									«ENDFOR»
									</tr>
									
									<tr>
									«FOR matrixquestion: questiontype.matrixQuestion»
									<tr>
									<td> «matrixquestion.name»</td>
											«FOR answer: questiontype.answer»
											<td class="radio">
											<input class="matrix" type="radio" name="«matrixquestion.id»" value="«answer.id»"/>
											</td>
											«ENDFOR»
									</tr>
									«ENDFOR»
									</table>
								</p>
 '''
}