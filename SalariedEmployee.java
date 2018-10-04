
public class SalariedEmployee extends Employee {
	
	public double salary;
	
	public SalariedEmployee() {
		super();
	}
	
	public SalariedEmployee(String first, String last, double salary) {
		super(first, last, 0.0);
		this.salary = salary;
	}
	
	public double computePay(double hours) {
		return this.salary / 52;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	

}
