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
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  DependencyModel createDependencyModel();

  /**
   * Returns a new object of class '<em>Survey Elements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Survey Elements</em>'.
   * @generated
   */
  SurveyElements createSurveyElements();

  /**
   * Returns a new object of class '<em>Part Elements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Part Elements</em>'.
   * @generated
   */
  PartElements createPartElements();

  /**
   * Returns a new object of class '<em>DM Next Parts</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DM Next Parts</em>'.
   * @generated
   */
  DMNextParts createDMNextParts();

  /**
   * Returns a new object of class '<em>Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependency</em>'.
   * @generated
   */
  Dependency createDependency();

  /**
   * Returns a new object of class '<em>DM Matrix Question</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DM Matrix Question</em>'.
   * @generated
   */
  DMMatrixQuestion createDMMatrixQuestion();

  /**
   * Returns a new object of class '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or</em>'.
   * @generated
   */
  Or createOr();

  /**
   * Returns a new object of class '<em>And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And</em>'.
   * @generated
   */
  And createAnd();

  /**
   * Returns a new object of class '<em>Bracket</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bracket</em>'.
   * @generated
   */
  Bracket createBracket();

  /**
   * Returns a new object of class '<em>DM Question</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DM Question</em>'.
   * @generated
   */
  DMQuestion createDMQuestion();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DependencyPackage getDependencyPackage();

} //DependencyFactory
