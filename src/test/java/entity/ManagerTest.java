package entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ManagerTest {

	@Test
	public void shouldReturnInstanceOfManagerEntity() {
		Manager manager = new Manager("", 0);
		assertNotNull(manager);
	}
	
	@Test
	public void shouldSetNameOfManagerWhenInitialized() {
		final String name = "John";
		Manager manager = new Manager(name, 0);
		assertNotNull(manager);
		assertEquals(manager.getName(),name);
		
	}
	
	@Test
	public void shouldSetSalaryCoefficientOfManagerWhenInitialized() {
		final int salaryCoefficient = 1;
		Manager manager = new Manager("", salaryCoefficient);
		assertNotNull(manager);
		assertEquals(manager.getSalaryCoefficient(),salaryCoefficient);
		
	}

}
