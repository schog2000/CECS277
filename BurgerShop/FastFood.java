package BurgerShop;
public class FastFood {
	public String inputMeal;
	public String inputDrink;
	public String inputSide;
	public FastFood() {
	
	}
	public FastFood(String inputMeal, String inputDrink, String inputSide) {
		this.inputMeal = inputMeal;
		this.inputDrink = inputDrink;
		this.inputSide = inputSide;
	}
	@Override
	public String toString() {
		String finalResult;
		Queue getInfo = new Queue();
		Object order = getInfo.dequeue();
		finalResult = "Order " + order + " served.";
		return finalResult;
		
	}

}
