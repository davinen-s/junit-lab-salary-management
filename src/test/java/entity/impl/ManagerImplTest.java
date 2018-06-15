package entity.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import entity.Manager;

public class ManagerImplTest {
	
	
	@Test
	public void test_Constructor_Manager_NotNull() {
		Manager Manager = new Manager("Poorun", 10);
		assertNotNull(Manager);
	}
	
	
	@Test
	public void test_Constructor_attributes() {
		Manager Manager = new Manager("user", 10);
		assertEquals("user", Manager.getName());
	}
	
	@Test
	public void test_Constructor_Salary_Coefficient() {
		Manager Manager = new Manager("user", 10);
		assertEquals(10, Manager.getSalaryCoefficient());
	}

}
