package service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import entity.Developer;
import entity.Manager;
import service.SalaryService;

@RunWith(JUnit4.class)
public class SalaryServiceImplTest {

	@Test
	public void calculateSalaryForManager_shouldReturnProperSalary() {
		SalaryService salaryService = new SalaryServiceImpl();
		Manager manager = new Manager("John",10);
		int expectedSalary = 80000;
		assertEquals(salaryService.calculateSalaryForManager(manager), expectedSalary);
	}
	
	@Test
	public void calculateSalaryForDeveloper_shouldReturnProperSalary() {
		SalaryService salaryService = new SalaryServiceImpl();
		Developer developer = new Developer("John",2);
		int expectedSalary = 16000;
		assertEquals(salaryService.calculateSalaryForDeveloper(developer), expectedSalary);
	}
	
}
