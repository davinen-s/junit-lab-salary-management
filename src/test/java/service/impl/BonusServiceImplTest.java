package service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import entity.Developer;
import entity.Manager;
import service.SalaryService;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BonusServiceImplTest {
	
	/**
	 * InjectMocks annotations initialises
	 * a real implementation of the class to test
	 * 
	 */
	@InjectMocks
	BonusServiceImpl bonusService;
	
	/**
	 * Mock annotations are used to inject a
	 * dummy object for dependencies of the tested class
	 */
	@Mock
	SalaryService salaryService;

	@Test
	public void calculateBonusForManagerShouldReturn10000() {
		Manager manager = new Manager("John",1);
		
		/*
		 * Mockito.any() is a method that can be used
		 * when mocking method calls. This tells the dummy object
		 * that for anyObject you get in the parameter, return something
		 */
		Mockito.when(salaryService.calculateSalaryForManager(Mockito.any())).thenReturn(1000);
		assertEquals(bonusService.calculateBonus(manager,1.5),1500.0,0);
	}
	
	@Test
	public void calculateBonusForDeveloperShouldReturn10000() {
		Developer developer = new Developer("John",1);
		Mockito.when(salaryService.calculateSalaryForDeveloper(Mockito.any())).thenReturn(1000);
		assertEquals(bonusService.calculateBonus(developer,1.5),1500.0,0);
	}

}
