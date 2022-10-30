package good;

public class Main {

	public static void main(String[] args) {
		CustomerDetailsInterface customerDetails = new CustomerDetails();
		customerDetails.addData(1, "Karan", "Aggarwal");
		FoodDetails foodDetails = new FoodDetails("Pizza", true, false, false, true);
		foodDetails.furtherProcessFood();
		CustomerDetailsInterface customerDetails1 = new CustomerDetails();
		customerDetails1.addData(1, "Mc", "Laren");
		FoodDetails foodDetails1 = new FoodDetails("Sandwich", true, true, true, false);
		foodDetails1.furtherProcessFood();
	}

}
