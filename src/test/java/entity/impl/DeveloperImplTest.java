package entity.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import entity.Developer;

public class DeveloperImplTest {
	
	
	@Test
	public void test_Constructor_Developer_NotNull() {
		Developer developer = new Developer("Poorun", 10);
		assertNotNull(developer);
	}
	
	
	@Test
	public void test_Constructor_attributes() {
		Developer developer = new Developer("user", 10);
		assertEquals("user", developer.getName());
	}
	
	@Test
	public void test_Constructor_Salary_Coefficient() {
		Developer developer = new Developer("user", 10);
		assertEquals(10, developer.getSalaryCoefficient());
	}

}
