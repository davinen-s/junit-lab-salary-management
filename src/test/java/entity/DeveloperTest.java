package entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import junit.framework.TestCase;

@RunWith(JUnit4.class)
public class DeveloperTest extends TestCase {

	@Test
	public void shouldReturnInstanceOfDeveloperEntity() {
		Developer developer = new Developer("", 0);
		assertNotNull(developer);
	}
	
	@Test
	public void shouldSetNameOfDeveloperWhenInitialized() {
		final String name = "John";
		Developer developer = new Developer(name, 0);
		assertNotNull(developer);
		assertEquals(developer.getName(),name);
		
	}
	
	@Test
	public void shouldSetSalaryCoefficientOfDeveloperWhenInitialized() {
		final int salaryCoefficient = 1;
		Developer developer = new Developer("", salaryCoefficient);
		assertNotNull(developer);
		assertEquals(developer.getSalaryCoefficient(),salaryCoefficient);
		
	}

}
