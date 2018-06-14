package service;

import entity.Manager;
import entity.Developer;

/**
 * Service for calculating bonus
 *
 */
public interface BonusService {
	
	/**
	 * Calculates bonus for manager
	 * @param manager instance of Manager
	 * @param bonusRate Bonus Rate applicable to the manager
	 * @return The calculated bonus amount
	 */
	double calculateBonus(Manager manager,double bonusRate);
	
	/**
	 * Calculates bonus for developer
	 * @param developer instance of developer
	 * @param bonusRate Bonus Rate applicable to the developer
	 * @return The calculated bonus amount
	 */
	double calculateBonus(Developer developer,double bonusRate);

}
