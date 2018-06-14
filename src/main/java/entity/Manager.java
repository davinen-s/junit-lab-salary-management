package entity;

/**
 * Object representing a Manager
 *
 */
public class Manager extends Employee {
	
	private int salaryCoefficient = 0;
	
	/**
	 * Constructor
	 * @param name Employee name
	 * @param salaryCoefficient salary coefficient
	 */
	public Manager(String name, int salaryCoefficient) {
		super(name);
		this.salaryCoefficient = salaryCoefficient;
	}

	@Override
	public int getSalaryCoefficient() {
		return salaryCoefficient;
	}

	public void setSalaryCoefficient(int salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}
	
}
