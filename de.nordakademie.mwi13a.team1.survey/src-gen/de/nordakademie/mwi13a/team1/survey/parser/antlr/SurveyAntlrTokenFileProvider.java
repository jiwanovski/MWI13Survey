/*
* generated by Xtext
*/
package de.nordakademie.mwi13a.team1.survey.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SurveyAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("de/nordakademie/mwi13a/team1/survey/parser/antlr/internal/InternalSurvey.tokens");
	}
}
