package de.nordakademie.mwi13a.team1.dependency.tests;

import com.google.inject.Inject;
import de.nordakademie.mwi13a.team1.dependency.DependencyInjectorProvider;
import de.nordakademie.mwi13a.team1.dependency.dependency.DependencyModel;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(DependencyInjectorProvider.class)
@SuppressWarnings("all")
public class DependencyValidatorTest {
  @Inject
  @Extension
  private ParseHelper<DependencyModel> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testNextPart() {
  }
}
