package service;

import entity.Manager;
import entity.Developer;

/**
 * 
 * Service for salary calculations
 *
 */
public interface SalaryService {
	
	/**
	 * Calculates salary of manager
	 * @param manager instance of Manager
	 * @return calculated salary
	 */
	int calculateSalaryForManager(Manager manager);
	
	/**
	 * Calculates salary of manager but delays the response
	 * @param manager instance of Manager
	 * @return calculated salary
	 */
	int calculateSalaryForManagerDefered(Manager manager);
	
	/**
	 * Calculates salary of developer
	 * @param developer instance of Developer
	 * @return calculated salary
	 */
	int calculateSalaryForDeveloper(Developer developer);
	

}
