package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.stereotype.Service;

import entity.Manager;
import entity.Developer;
import service.BonusService;
import service.SalaryService;

@Service(BeanDefinition.SCOPE_PROTOTYPE)
public class BonusServiceImpl implements BonusService{
	
	private SalaryService salaryService;

	@Override
	public double calculateBonus(Manager manager,double bonusRate) {
		
		return bonusRate*salaryService.calculateSalaryForManager(manager);
	}
	
	@Override
	public double calculateBonus(Developer developer,double bonusRate) {
		return bonusRate*salaryService.calculateSalaryForDeveloper(developer);
	}
	
	
	@Autowired
	public void setSalaryService(SalaryService salaryService) {
		this.salaryService = salaryService;
	}

}
