package de.nordakademie.mwi13a.team1.dependency.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import de.nordakademie.mwi13a.team1.dependency.DependencyInjectorProvider
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import de.nordakademie.mwi13a.team1.dependency.dependency.DependencyModel
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(DependencyInjectorProvider))
class DependencyValidatorTest {
	@Inject extension ParseHelper<DependencyModel>
	@Inject extension ValidationTestHelper
	
	@Test
	def void testNextPart() {
		
	}
	
}