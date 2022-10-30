package good;

public class FoodDetails {

	public String foodName;
	public boolean cheese, tomato, onion, chicken;
	
	public FoodDetails(String foodName, boolean cheese, boolean tomato, boolean onion, boolean chicken) {
		this.foodName = foodName;
		this.cheese = cheese;
		this.tomato = tomato;
		this.onion = onion;
		this.chicken = chicken;
	}
	
	void furtherProcessFood() {		
		if(foodName == "Pizza") {
			ProcessPizza processPizza = new ProcessPizza();
			processPizza.addIngredients(this);
		} else {
			ProcessSandwich processSandwich = new ProcessSandwich();
			processSandwich.addIngredients(this);			
		}
	}	
}
