/**
 */
package JavaModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see JavaModel.JavaModelFactory
 * @model kind="package"
 * @generated
 */
public interface JavaModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "JavaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform://plugin/no.ntnu.tdt4250.testsuite/JavaTests.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "JavaTests";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaModelPackage eINSTANCE = JavaModel.impl.JavaModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link JavaModel.impl.TestClassImpl <em>Test Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaModel.impl.TestClassImpl
	 * @see JavaModel.impl.JavaModelPackageImpl#getTestClass()
	 * @generated
	 */
	int TEST_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__IMPORTS = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__VISIBILITY = 3;

	/**
	 * The feature id for the '<em><b>Test Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS__TEST_METHODS = 4;

	/**
	 * The number of structural features of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Test Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link JavaModel.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaModel.impl.MethodImpl
	 * @see JavaModel.impl.JavaModelPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__VISIBILITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ANNOTATIONS = 3;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STATEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Test Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TEST_CLASS = 5;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link JavaModel.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaModel.impl.StatementImpl
	 * @see JavaModel.impl.JavaModelPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__METHOD = 0;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link JavaModel.impl.LineStatementImpl <em>Line Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaModel.impl.LineStatementImpl
	 * @see JavaModel.impl.JavaModelPackageImpl#getLineStatement()
	 * @generated
	 */
	int LINE_STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STATEMENT__METHOD = STATEMENT__METHOD;

	/**
	 * The feature id for the '<em><b>Line Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STATEMENT__LINE_CONTENT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Line Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Line Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JavaModel.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaModel.Visibility
	 * @see JavaModel.impl.JavaModelPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 4;

	/**
	 * The meta object id for the '{@link JavaModel.SimpleDatatype <em>Simple Datatype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaModel.SimpleDatatype
	 * @see JavaModel.impl.JavaModelPackageImpl#getSimpleDatatype()
	 * @generated
	 */
	int SIMPLE_DATATYPE = 5;


	/**
	 * Returns the meta object for class '{@link JavaModel.TestClass <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class</em>'.
	 * @see JavaModel.TestClass
	 * @generated
	 */
	EClass getTestClass();

	/**
	 * Returns the meta object for the attribute '{@link JavaModel.TestClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see JavaModel.TestClass#getName()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_Name();

	/**
	 * Returns the meta object for the attribute list '{@link JavaModel.TestClass#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Imports</em>'.
	 * @see JavaModel.TestClass#getImports()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_Imports();

	/**
	 * Returns the meta object for the attribute '{@link JavaModel.TestClass#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see JavaModel.TestClass#getPackage()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_Package();

	/**
	 * Returns the meta object for the attribute '{@link JavaModel.TestClass#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see JavaModel.TestClass#getVisibility()
	 * @see #getTestClass()
	 * @generated
	 */
	EAttribute getTestClass_Visibility();

	/**
	 * Returns the meta object for the containment reference list '{@link JavaModel.TestClass#getTestMethods <em>Test Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Methods</em>'.
	 * @see JavaModel.TestClass#getTestMethods()
	 * @see #getTestClass()
	 * @generated
	 */
	EReference getTestClass_TestMethods();

	/**
	 * Returns the meta object for class '{@link JavaModel.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see JavaModel.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link JavaModel.Method#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see JavaModel.Method#getVisibility()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link JavaModel.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see JavaModel.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the attribute '{@link JavaModel.Method#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see JavaModel.Method#getReturnType()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ReturnType();

	/**
	 * Returns the meta object for the attribute list '{@link JavaModel.Method#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Annotations</em>'.
	 * @see JavaModel.Method#getAnnotations()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link JavaModel.Method#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see JavaModel.Method#getStatements()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Statements();

	/**
	 * Returns the meta object for the container reference '{@link JavaModel.Method#getTestClass <em>Test Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Test Class</em>'.
	 * @see JavaModel.Method#getTestClass()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_TestClass();

	/**
	 * Returns the meta object for class '{@link JavaModel.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see JavaModel.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the container reference '{@link JavaModel.Statement#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Method</em>'.
	 * @see JavaModel.Statement#getMethod()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Method();

	/**
	 * Returns the meta object for class '{@link JavaModel.LineStatement <em>Line Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Statement</em>'.
	 * @see JavaModel.LineStatement
	 * @generated
	 */
	EClass getLineStatement();

	/**
	 * Returns the meta object for the attribute '{@link JavaModel.LineStatement#getLineContent <em>Line Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Content</em>'.
	 * @see JavaModel.LineStatement#getLineContent()
	 * @see #getLineStatement()
	 * @generated
	 */
	EAttribute getLineStatement_LineContent();

	/**
	 * Returns the meta object for enum '{@link JavaModel.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see JavaModel.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link JavaModel.SimpleDatatype <em>Simple Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Simple Datatype</em>'.
	 * @see JavaModel.SimpleDatatype
	 * @generated
	 */
	EEnum getSimpleDatatype();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavaModelFactory getJavaModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link JavaModel.impl.TestClassImpl <em>Test Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaModel.impl.TestClassImpl
		 * @see JavaModel.impl.JavaModelPackageImpl#getTestClass()
		 * @generated
		 */
		EClass TEST_CLASS = eINSTANCE.getTestClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__NAME = eINSTANCE.getTestClass_Name();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__IMPORTS = eINSTANCE.getTestClass_Imports();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__PACKAGE = eINSTANCE.getTestClass_Package();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CLASS__VISIBILITY = eINSTANCE.getTestClass_Visibility();

		/**
		 * The meta object literal for the '<em><b>Test Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CLASS__TEST_METHODS = eINSTANCE.getTestClass_TestMethods();

		/**
		 * The meta object literal for the '{@link JavaModel.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaModel.impl.MethodImpl
		 * @see JavaModel.impl.JavaModelPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__VISIBILITY = eINSTANCE.getMethod_Visibility();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__RETURN_TYPE = eINSTANCE.getMethod_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__ANNOTATIONS = eINSTANCE.getMethod_Annotations();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__STATEMENTS = eINSTANCE.getMethod_Statements();

		/**
		 * The meta object literal for the '<em><b>Test Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__TEST_CLASS = eINSTANCE.getMethod_TestClass();

		/**
		 * The meta object literal for the '{@link JavaModel.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaModel.impl.StatementImpl
		 * @see JavaModel.impl.JavaModelPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__METHOD = eINSTANCE.getStatement_Method();

		/**
		 * The meta object literal for the '{@link JavaModel.impl.LineStatementImpl <em>Line Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaModel.impl.LineStatementImpl
		 * @see JavaModel.impl.JavaModelPackageImpl#getLineStatement()
		 * @generated
		 */
		EClass LINE_STATEMENT = eINSTANCE.getLineStatement();

		/**
		 * The meta object literal for the '<em><b>Line Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STATEMENT__LINE_CONTENT = eINSTANCE.getLineStatement_LineContent();

		/**
		 * The meta object literal for the '{@link JavaModel.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaModel.Visibility
		 * @see JavaModel.impl.JavaModelPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link JavaModel.SimpleDatatype <em>Simple Datatype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaModel.SimpleDatatype
		 * @see JavaModel.impl.JavaModelPackageImpl#getSimpleDatatype()
		 * @generated
		 */
		EEnum SIMPLE_DATATYPE = eINSTANCE.getSimpleDatatype();

	}

} //JavaModelPackage
