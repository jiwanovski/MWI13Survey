package de.nordakademie.mwi13a.team1.dependency;

import static com.google.common.collect.Sets.newHashSet;
import java.util.Set;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;


public class DependencyOutputConfiguration implements IOutputConfigurationProvider {
	public static final String GEN_SERVLET_OUTPUT = "gen-servlet";
	public static final String GEN_WEBXML_OUTPUT = "gen-webXml";
	public static final String GEN_EMBEDDED_APACHE_OUTPUT = "gen-embeddedApache";
	
	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
	    defaultOutput.setDescription("Output Folder");
	    defaultOutput.setOutputDirectory("./src-gen");
	    defaultOutput.setOverrideExistingResources(true);
	    defaultOutput.setCreateOutputDirectory(true);
	    defaultOutput.setCleanUpDerivedResources(true);
	    defaultOutput.setSetDerivedProperty(true);

	    OutputConfiguration servletOutput = new OutputConfiguration(GEN_SERVLET_OUTPUT);
	    servletOutput.setDescription("Read-only Output Folder");
	    servletOutput.setOutputDirectory("./src/servlets");
	    servletOutput.setOverrideExistingResources(false);
	    servletOutput.setCreateOutputDirectory(true);
	    servletOutput.setCleanUpDerivedResources(false);
	    servletOutput.setSetDerivedProperty(false);
	    
	    OutputConfiguration webXmlOutput = new OutputConfiguration(GEN_WEBXML_OUTPUT);
	    webXmlOutput.setDescription("Read-only Output Folder");
	    webXmlOutput.setOutputDirectory("./webapps/webapp/WEB-INF");
	    webXmlOutput.setOverrideExistingResources(false);
	    webXmlOutput.setCreateOutputDirectory(true);
	    webXmlOutput.setCleanUpDerivedResources(false);
	    webXmlOutput.setSetDerivedProperty(false);
	    
	    OutputConfiguration embeddedApacheOutput = new OutputConfiguration(GEN_EMBEDDED_APACHE_OUTPUT);
	    embeddedApacheOutput.setDescription("Read-only Output Folder");
	    embeddedApacheOutput.setOutputDirectory("./src/startServer");
	    embeddedApacheOutput.setOverrideExistingResources(false);
	    embeddedApacheOutput.setCreateOutputDirectory(true);
	    embeddedApacheOutput.setCleanUpDerivedResources(false);
	    embeddedApacheOutput.setSetDerivedProperty(false);
	    return newHashSet(defaultOutput, servletOutput, webXmlOutput, embeddedApacheOutput);
	}

}
