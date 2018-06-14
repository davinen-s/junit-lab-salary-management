package service.impl;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.stereotype.Service;

import entity.Manager;
import entity.Developer;
import entity.Employee;
import service.SalaryService;

@Service(BeanDefinition.SCOPE_PROTOTYPE)
public class SalaryServiceImpl implements SalaryService {
	
	public SalaryServiceImpl() {}

	@Override
	public int calculateSalaryForManager(Manager manager) {
		
		return manager.getSalaryCoefficient() * Employee.BASIC_SALARY;
		/*
		 * int salary = manager.getSalaryCoefficient() * Employee.BASIC_SALARY;
		 * 
		 * if(salary > 500000){
		 * throw new OverPaidException("The employee is over paid!")
		 * }
		 * return salary;
		 */
	}
	
	public int calculateSalaryForManagerDefered(Manager manager) {
		try {
			TimeUnit.SECONDS.sleep(2);
			return calculateSalaryForManager(manager);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	@Override
	public int calculateSalaryForDeveloper(Developer developer) {
		
		return developer.getSalaryCoefficient() * Employee.BASIC_SALARY;
		/*
		 * int salary = developer.getSalaryCoefficient() * Employee.BASIC_SALARY;
		 * 
		 * if(salary > 100000){
		 * throw new OverPaidException("The employee is over paid!")
		 * }
		 * return salary;
		 */
	}
	
}
