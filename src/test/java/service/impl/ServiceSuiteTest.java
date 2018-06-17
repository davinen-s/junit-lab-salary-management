package service.impl;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * A Test suite is just a grouping of test under 1 class so that we can trigger the test of several classes in one go.
 * This test suite class just group the test classes for Services(two or more). 
 * 
 * @author davinen.s.curoopen
 */


/**
 * we use the @Suite.SuiteClasses to list the Existing test classes that we want to group together.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	BonusServiceImplTest.class,
	SalaryServiceImplTest.class
})
public class ServiceSuiteTest {

	/**
	 * The class body must remain empty. When launching this suite as a JUnit test you will see the result of all classes grouped
	 * with the @Suite.SuiteClasses annotation.
	 */

}
