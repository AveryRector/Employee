
public class test {

	public static void main(String[] args) {
		Employee ryan = new HourlyEmployee("Ryan", "Park", 7.25);
		Employee jake = new HourlyEmployee("Jake", "BigBoi", 10.50);
		
		System.out.println(ryan.computePay(40.0));
		System.out.println(ryan.computePay(50.0));
		
		System.out.println(ryan);
		System.out.println(jake);
	}
	
	
}
