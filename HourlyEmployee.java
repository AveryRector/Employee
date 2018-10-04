
public class HourlyEmployee extends Employee {
	
	public HourlyEmployee() {
		super();
	}

	public HourlyEmployee(String first, String last, double hourlyWage) {
		super(first, last, hourlyWage);
	}
	
	@Override
	public double computePay(double hours) {
		if(hours <= 40) { //if working without overtime
			return this.getWage() * 40;
		} 
		else { //if working with overtime
			return this.getWage() * 40 + ((hours - 40) * (this.getWage() * 1.5)); //anything over 40 gets 1.5 pay
		}
	}
	
	@Override
	public String toString() {
		String name = this.getLastName() + ", " + this.getFirstName();
		String hourly = "$" + this.getWage() + "/hour";
		int whiteSpaces = 39 - name.length();
		String formatString = "%s %" + String.valueOf(whiteSpaces) + "s";
		String line = String.format(formatString, name, hourly);
		int i = line.length();
		return line;
	}

}
//       String.format("%s, %29s",name, hourly)