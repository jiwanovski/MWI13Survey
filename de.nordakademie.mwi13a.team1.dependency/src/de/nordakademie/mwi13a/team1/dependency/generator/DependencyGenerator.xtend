/*
 * generated by Xtext
 */
package de.nordakademie.mwi13a.team1.dependency.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import de.nordakademie.mwi13a.team1.dependency.dependency.DependencyModel
import de.nordakademie.mwi13a.team1.survey.survey.Part
import de.nordakademie.mwi13a.team1.dependency.dependency.Dependency
import de.nordakademie.mwi13a.team1.dependency.dependency.And
import de.nordakademie.mwi13a.team1.dependency.dependency.Or
import de.nordakademie.mwi13a.team1.dependency.dependency.DMQuestion
import de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrix
import org.eclipse.xtend2.lib.StringConcatenation
import de.nordakademie.mwi13a.team1.survey.survey.Question
import de.nordakademie.mwi13a.team1.dependency.dependency.DMMatrixQuestion
import de.nordakademie.mwi13a.team1.survey.survey.MatrixQuestion
import de.nordakademie.mwi13a.team1.dependency.dependency.PartElements
import de.nordakademie.mwi13a.team1.survey.survey.Questionnaire

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class DependencyGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val dm = resource.contents.head as DependencyModel
		if (dm !=null) {
			for (survey: dm.elements) {
				for (part: survey.partElements) {
					val fileName = (survey.name as Questionnaire).name + "_" + (part.name as Part).name
					fsa.generateFile(fileName + ".java",toServlet(part))
				}			
			}
		}
		
	}
	
	def toServlet(PartElements part) '''		
		«generalServletHead»
		
		@WebServlet("/«(part.name as Part).name.replace(" ","_")»Servlet")
		public class «(part.name as Part).name.replace(" ","_")» extends HttpServlet {
			private static final long serialVersionUID = 1L;
			
			@Override
			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				«FOR nextPart: part.nextParts»
					«FOR expression: nextPart.expressions»
						«IF (nextPart.equals(part.nextParts.head))»
						// Prepare messages.
						Map<String, String> messages = new HashMap<String, String>();
						request.setAttribute("messages", messages);
						
						String nextPart;
						
						«getParameter(expression)»
						«ENDIF»
						// Check next page dependencies
						if («solveDependencies(expression)») {
							nextPart = "«(nextPart.name as Part).name.replace(" ","_")».jsp";
						}
					«ENDFOR»
					
				«ENDFOR»
				// call next page
				request.getRequestDispatcher(nextPart).forward(request, response);
			}
		}
	'''
	
	def dispatch Object getParameter(Dependency d) '''
		«switch (d) {
			And: {
				(d.left.getParameter as StringConcatenation).toString + (d.right.getParameter as StringConcatenation).toString
			}
			Or: {
				(d.left.getParameter as StringConcatenation).toString + (d.right.getParameter as StringConcatenation).toString
			}
			DMQuestion:{
				getQuestionParameter(d)
			}
			
			DMMatrix: {
				getMatrixQuestionParameter(d)				
			}
		}»
	'''
	
	def dispatch Object solveDependencies(Dependency d) '''
		«switch (d) {
			And: {
				printAnd(d)
			}
			Or: {
				printOr(d)
			}
			DMQuestion:{
				solveQuestion(d)
			}
			
			DMMatrix: {
				solveMatrixQuestion(d)			
			}
		}»
	'''
	
	def getQuestionParameter(DMQuestion q) '''
		// get and validate «q.question.id»
		String «q.question.id» = request.getParameter("«q.question.id»");
		«IF (q.question as Question).mandatory»
		if («q.question.id» == null || «q.question.id».trim().isEmpty()) {
			messages.put("«q.question.id»","Please enter a value");
		}
		«ENDIF»
	'''
	
	def getMatrixQuestionParameter(DMMatrix m) '''
		«FOR q: m.dmMatrixQuestion»
			// Matrix Parameter
			«getMatrixQuestionParameter(q)»
		«ENDFOR»
	'''
	
	def getMatrixQuestionParameter(DMMatrixQuestion q) '''
		// get and validate «q.matrixQuestion.id»
		String «q.matrixQuestion.id» = request.getParameter("«q.matrixQuestion.id»");
		«IF ((q.matrixQuestion as MatrixQuestion).eContainer as DMMatrix).matrix.mandatory»
		if («q.matrixQuestion.id» == null || «q.matrixQuestion.id».trim().isEmpty()) {
			messages.put("«q.matrixQuestion.id»","Please enter a value");
		}
		«ENDIF»		
	'''
	
	def printAnd(And and) '''
		«(and.left.solveDependencies as StringConcatenation)» && «(and.right.solveDependencies as StringConcatenation)»
	'''
	
	def printOr(Or or) '''
		«(or.left.solveDependencies as StringConcatenation)» || «(or.right.solveDependencies as StringConcatenation)»
	'''
	
	def solveQuestion(DMQuestion question) '''
		(«question.question.id».equals("«question.answer.id»")) 
	'''	
	
	def solveMatrixQuestion(DMMatrix m) '''
		«FOR q: m.dmMatrixQuestion»
			// Solve Matrix Question
			«solveMatrixQuestion(q)»
		«ENDFOR»
	'''
	
	def solveMatrixQuestion(DMMatrixQuestion q) '''
		(«q.matrixQuestion.id».equals("«q.matrixScale.id»"))
	'''
	
	def generalServletHead() '''
		package de.helloworld2;

		import java.io.IOException;
		import java.util.HashMap;
		import java.util.Map;

		import javax.servlet.ServletException;
		import javax.servlet.annotation.WebServlet;
		import javax.servlet.http.HttpServlet;
		import javax.servlet.http.HttpServletRequest;
		import javax.servlet.http.HttpServletResponse;
	'''
	
	def servletClassHead() '''
		
	'''
}
	
