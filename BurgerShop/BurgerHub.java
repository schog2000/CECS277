package BurgerShop;
import java.util.Scanner;

public class BurgerHub {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Queue connectQue = new Queue();
		String inputWhile;
		char inputWhileCh;
		String inputMeal;
		String inputDrink;
		String inputSide;
		int whileKey = 1;
		
		System.out.println("Burger Hub Operator:");
		while(whileKey == 1) {
			System.out.println("Type \"1\" to take order, \"2\" to "
						+ "serve customer, \"3\" to display backlog "
								+ "information, otherwise quit.");
			inputWhile = scnr.next();
			inputWhileCh = inputWhile.charAt(0);
			
			if(inputWhileCh == '1') {
				System.out.print("Entry name: ");
				inputMeal = scnr.next();
				System.out.print("Drink: ");
				inputDrink = scnr.next();
				System.out.print("Side: ");
				inputSide = scnr.next();
				FastFood connectFF = new FastFood(inputMeal, inputDrink, inputSide);
			}
			else if(inputWhileCh == '2') {
				FastFood connectFastF = new FastFood();
				System.out.println(connectFastF.toString());
			}
			else if(inputWhileCh == '3') {
				if(connectQue.size == 0) {
					System.out.println("There are no orders in queue.");
				}
				else {
					System.out.println("There are " + connectQue.size + " order(s) waiting.");
				}
			}
			else {
				break;
			}
		}
		
	}

}
