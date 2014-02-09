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
	public static final String GEN_BEAN_OUTPUT = "gen-bean";
	
	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
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
	    
	    OutputConfiguration beanOutput = new OutputConfiguration(GEN_BEAN_OUTPUT);
	    beanOutput.setDescription("Read-only Output Folder");
	    beanOutput.setOutputDirectory("./src/beans");
	    beanOutput.setOverrideExistingResources(false);
	    beanOutput.setCreateOutputDirectory(true);
	    beanOutput.setCleanUpDerivedResources(false);
	    beanOutput.setSetDerivedProperty(false);
	    return newHashSet(servletOutput, webXmlOutput, embeddedApacheOutput, beanOutput);
	}

}
