/**
 * generated by Xtext 2.25.0
 */
package br.ufrn.ppgti.ppgti1007.salarioLiquido;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.ufrn.ppgti.ppgti1007.salarioLiquido.SalarioLiquidoFactory
 * @model kind="package"
 * @generated
 */
public interface SalarioLiquidoPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "salarioLiquido";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ufrn.br/ppgti/ppgti1007/SalarioLiquido";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "salarioLiquido";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SalarioLiquidoPackage eINSTANCE = br.ufrn.ppgti.ppgti1007.salarioLiquido.impl.SalarioLiquidoPackageImpl.init();

  /**
   * The meta object id for the '{@link br.ufrn.ppgti.ppgti1007.salarioLiquido.impl.SalariosImpl <em>Salarios</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufrn.ppgti.ppgti1007.salarioLiquido.impl.SalariosImpl
   * @see br.ufrn.ppgti.ppgti1007.salarioLiquido.impl.SalarioLiquidoPackageImpl#getSalarios()
   * @generated
   */
  int SALARIOS = 0;

  /**
   * The feature id for the '<em><b>Salarios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SALARIOS__SALARIOS = 0;

  /**
   * The number of structural features of the '<em>Salarios</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SALARIOS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.ufrn.ppgti.ppgti1007.salarioLiquido.impl.SalarioImpl <em>Salario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufrn.ppgti.ppgti1007.salarioLiquido.impl.SalarioImpl
   * @see br.ufrn.ppgti.ppgti1007.salarioLiquido.impl.SalarioLiquidoPackageImpl#getSalario()
   * @generated
   */
  int SALARIO = 1;

  /**
   * The feature id for the '<em><b>Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SALARIO__VALOR = 0;

  /**
   * The feature id for the '<em><b>Dependentes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SALARIO__DEPENDENTES = 1;

  /**
   * The feature id for the '<em><b>Descontos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SALARIO__DESCONTOS = 2;

  /**
   * The feature id for the '<em><b>Previdencia</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SALARIO__PREVIDENCIA = 3;

  /**
   * The number of structural features of the '<em>Salario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SALARIO_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link br.ufrn.ppgti.ppgti1007.salarioLiquido.Salarios <em>Salarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Salarios</em>'.
   * @see br.ufrn.ppgti.ppgti1007.salarioLiquido.Salarios
   * @generated
   */
  EClass getSalarios();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufrn.ppgti.ppgti1007.salarioLiquido.Salarios#getSalarios <em>Salarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Salarios</em>'.
   * @see br.ufrn.ppgti.ppgti1007.salarioLiquido.Salarios#getSalarios()
   * @see #getSalarios()
   * @generated
   */
  EReference getSalarios_Salarios();

  /**
   * Returns the meta object for class '{@link br.ufrn.ppgti.ppgti1007.salarioLiquido.Salario <em>Salario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Salario</em>'.
   * @see br.ufrn.ppgti.ppgti1007.salarioLiquido.Salario
   * @generated
   */
  EClass getSalario();

  /**
   * Returns the meta object for the attribute '{@link br.ufrn.ppgti.ppgti1007.salarioLiquido.Salario#getValor <em>Valor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valor</em>'.
   * @see br.ufrn.ppgti.ppgti1007.salarioLiquido.Salario#getValor()
   * @see #getSalario()
   * @generated
   */
  EAttribute getSalario_Valor();

  /**
   * Returns the meta object for the attribute '{@link br.ufrn.ppgti.ppgti1007.salarioLiquido.Salario#getDependentes <em>Dependentes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dependentes</em>'.
   * @see br.ufrn.ppgti.ppgti1007.salarioLiquido.Salario#getDependentes()
   * @see #getSalario()
   * @generated
   */
  EAttribute getSalario_Dependentes();

  /**
   * Returns the meta object for the attribute '{@link br.ufrn.ppgti.ppgti1007.salarioLiquido.Salario#getDescontos <em>Descontos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descontos</em>'.
   * @see br.ufrn.ppgti.ppgti1007.salarioLiquido.Salario#getDescontos()
   * @see #getSalario()
   * @generated
   */
  EAttribute getSalario_Descontos();

  /**
   * Returns the meta object for the attribute '{@link br.ufrn.ppgti.ppgti1007.salarioLiquido.Salario#getPrevidencia <em>Previdencia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Previdencia</em>'.
   * @see br.ufrn.ppgti.ppgti1007.salarioLiquido.Salario#getPrevidencia()
   * @see #getSalario()
   * @generated
   */
  EAttribute getSalario_Previdencia();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SalarioLiquidoFactory getSalarioLiquidoFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link br.ufrn.ppgti.ppgti1007.salarioLiquido.impl.SalariosImpl <em>Salarios</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufrn.ppgti.ppgti1007.salarioLiquido.impl.SalariosImpl
     * @see br.ufrn.ppgti.ppgti1007.salarioLiquido.impl.SalarioLiquidoPackageImpl#getSalarios()
     * @generated
     */
    EClass SALARIOS = eINSTANCE.getSalarios();

    /**
     * The meta object literal for the '<em><b>Salarios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SALARIOS__SALARIOS = eINSTANCE.getSalarios_Salarios();

    /**
     * The meta object literal for the '{@link br.ufrn.ppgti.ppgti1007.salarioLiquido.impl.SalarioImpl <em>Salario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufrn.ppgti.ppgti1007.salarioLiquido.impl.SalarioImpl
     * @see br.ufrn.ppgti.ppgti1007.salarioLiquido.impl.SalarioLiquidoPackageImpl#getSalario()
     * @generated
     */
    EClass SALARIO = eINSTANCE.getSalario();

    /**
     * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SALARIO__VALOR = eINSTANCE.getSalario_Valor();

    /**
     * The meta object literal for the '<em><b>Dependentes</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SALARIO__DEPENDENTES = eINSTANCE.getSalario_Dependentes();

    /**
     * The meta object literal for the '<em><b>Descontos</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SALARIO__DESCONTOS = eINSTANCE.getSalario_Descontos();

    /**
     * The meta object literal for the '<em><b>Previdencia</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SALARIO__PREVIDENCIA = eINSTANCE.getSalario_Previdencia();

  }

} //SalarioLiquidoPackage
