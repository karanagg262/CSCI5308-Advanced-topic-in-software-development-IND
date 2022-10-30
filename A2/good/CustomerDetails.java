package good;

public class CustomerDetails implements CustomerDetailsInterface {
	public int customerId;
	public static String firstName;
	public static String lastName;
	
	public CustomerDetails(int customerId, String firstName,String lastName) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public CustomerDetails() {
		
	}
	public String sendCustomerDetails() {
		return firstName + " " + lastName;
	}
	
	public void addData(int customerId, String firstName,String lastName) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Customer Details Added");
	}
}
