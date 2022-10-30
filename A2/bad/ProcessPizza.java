package bad;

public class ProcessPizza implements Cook {
	CustomerDetails customerDetails;
	
	@Override
	public void bake() {
		System.out.println("Baked");
		sendtoCustomer(customerDetails);
	}


	@Override
	public void toast() {

	}
	
	public void addIngredients(FoodDetails pizzaDetails) {
		if(pizzaDetails.cheese) {
			System.out.println("Cheese Added");
		}
		if(pizzaDetails.tomato) {
			System.out.println("tomato Added");
		}
		if(pizzaDetails.onion) {
			System.out.println("onion Added");
		}
		if(pizzaDetails.chicken) {
			System.out.println("chicken Added");
		}
		
		bake();
		
	}
	
	
	public void sendtoCustomer(CustomerDetails customerDetails) {
		String customer = CustomerDetails.sendCustomerDetails();
		System.out.println("Order ready for " + customer);
	}

}
