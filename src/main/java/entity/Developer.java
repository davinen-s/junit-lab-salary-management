package entity;

/**
 * Object representing a Developer
 *
 */
public class Developer extends Employee {
	
	private int salaryCoefficient = 0;
	
	/**
	 * Constructor
	 * @param name Employee name
	 * @param salaryCoefficient salary coefficient of the employee
	 */
	public Developer(String name, int salaryCoefficient) {
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
