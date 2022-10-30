package bad;

public class Main {

	public static void main(String[] args) {
		CustomerDetails customerDetails = new CustomerDetails(1, "Karan", "Aggarwal");
		customerDetails.addData();
		FoodDetails foodDetails = new FoodDetails("Pizza", true, false, false, true);
		foodDetails.furtherProcessFood();
		CustomerDetails customerDetails1 = new CustomerDetails(1, "Mc", "Laren");
		customerDetails1.addData();
		FoodDetails foodDetails1 = new FoodDetails("Sandwich", true, true, true, false);
		foodDetails1.furtherProcessFood();
	}

}
