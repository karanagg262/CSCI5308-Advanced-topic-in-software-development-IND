package bad;

public class CustomerDetails {
	public int customerId;
	public static String firstName;
	public static String lastName;
	
	public CustomerDetails(int customerId, String firstName,String lastName) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public static String sendCustomerDetails() {
		return firstName + " " + lastName;
	}
	
	public void addData() {
		System.out.println("Customer Details Added");
	}
}
