package de.nordakademie.mwi13a.team1.survey;

import static com.google.common.collect.Sets.newHashSet;

import java.util.Set;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

public class SurveyOutputConfiguration implements IOutputConfigurationProvider {
	public static final String GEN_JSP_OUTPUT = "gen-Jsp";
	public static final String GEN_CSS_OUTPUT = "gen-Css";
	
	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		OutputConfiguration jspOutput = new OutputConfiguration(GEN_JSP_OUTPUT);
	    jspOutput.setDescription("Read-only Output Folder");
	    jspOutput.setOutputDirectory("./webapps/webapp");
	    jspOutput.setOverrideExistingResources(false);
	    jspOutput.setCreateOutputDirectory(true);
	    jspOutput.setCleanUpDerivedResources(false);
	    jspOutput.setSetDerivedProperty(false);
	    
	    OutputConfiguration cssOutput = new OutputConfiguration(GEN_CSS_OUTPUT);
	    cssOutput.setDescription("Read-only Output Folder");
	    cssOutput.setOutputDirectory("./webapps/webapp/css");
	    cssOutput.setOverrideExistingResources(false);
	    cssOutput.setCreateOutputDirectory(true);
	    cssOutput.setCleanUpDerivedResources(false);
	    cssOutput.setSetDerivedProperty(false);
	    return newHashSet(jspOutput, cssOutput);
	}

}
