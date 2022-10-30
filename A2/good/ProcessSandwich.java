package good;

public class ProcessSandwich extends CheckoutOrder implements IToast {

	@Override
	public void toast() {
		System.out.println("Toasted");
		sendtoCustomer();
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

}
