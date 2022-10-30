package good;

public class ProcessPizza extends CheckoutOrder implements IBake {
	
	@Override
	public void bake() {
		System.out.println("Baked");
		sendtoCustomer();
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

}
