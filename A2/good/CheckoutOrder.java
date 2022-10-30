package good;

public class CheckoutOrder {
	CustomerDetailsInterface customerDetails = new CustomerDetails();
	
	public void sendtoCustomer() {
		String customer = customerDetails.sendCustomerDetails();
		System.out.println("Order ready for " + customer);
	}

}
