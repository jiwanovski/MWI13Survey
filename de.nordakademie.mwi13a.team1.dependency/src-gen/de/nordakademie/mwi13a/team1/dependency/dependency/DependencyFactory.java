/**
 */
package de.nordakademie.mwi13a.team1.dependency.dependency;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.nordakademie.mwi13a.team1.dependency.dependency.DependencyPackage
 * @generated
 */
public interface DependencyFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DependencyFactory eINSTANCE = de.nordakademie.mwi13a.team1.dependency.dependency.impl.DependencyFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Survey Dependencies</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Survey Dependencies</em>'.
   * @generated
   */
  SurveyDependencies createSurveyDependencies();

  /**
   * Returns a new object of class '<em>Survey Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Survey Dependency</em>'.
   * @generated
   */
  SurveyDependency createSurveyDependency();

  /**
   * Returns a new object of class '<em>SD Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SD Part</em>'.
   * @generated
   */
  SDPart createSDPart();

  /**
   * Returns a new object of class '<em>SD Next Parts</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SD Next Parts</em>'.
   * @generated
   */
  SDNextParts createSDNextParts();

  /**
   * Returns a new object of class '<em>SD Part Dependencies</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SD Part Dependencies</em>'.
   * @generated
   */
  SDPartDependencies createSDPartDependencies();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DependencyPackage getDependencyPackage();

} //DependencyFactory
