package entity;

/**
 * 
 * Abstract class for an Employee
 *
 */
public abstract class Employee {
	
	/**
	 * Basic salary for every employee
	 */
	public static final int BASIC_SALARY = 8000;
	
	/**
	 * Name of the employee
	 */
	private String name;
	
	/**
	 * Constructor
	 * @param name Employee name
	 */
	public Employee(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the salary coefficient of the employee
	 * @return int The salary coefficient
	 */
	public abstract int getSalaryCoefficient();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
