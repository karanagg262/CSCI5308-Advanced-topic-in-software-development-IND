package bad;

public class ProcessSandwich implements Cook {
	CustomerDetails customerDetails;
	
	@Override
	public void bake() {

	}


	@Override
	public void toast() {
		System.out.println("Toasted");
		sendtoCustomer(customerDetails);
	}
	
	public void addIngredients(FoodDetails sandwhichDetails) {
		if(sandwhichDetails.cheese) {
			System.out.println("Cheese Added");
		}
		if(sandwhichDetails.tomato) {
			System.out.println("tomato Added");
		}
		if(sandwhichDetails.onion) {
			System.out.println("onion Added");
		}
		if(sandwhichDetails.chicken) {
			System.out.println("chicken Added");
		}
		
		toast();
		
	}
	
	public void sendtoCustomer(CustomerDetails customerDetails) {
		String customer = customerDetails.sendCustomerDetails();
		System.out.println("Order ready for " + customer);
	}

}
