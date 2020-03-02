package Risk;

import java.util.Scanner;
import java.util.ArrayList;
public class StartUp {
	public void start() {
		int userInput = 0;
		Scanner scnr = new Scanner(System.in);
		System.out.println("How many players are playing?");
		int whileKey = 1;
		while(whileKey == 1) {
			if(scnr.hasNextInt()) {
				userInput = scnr.nextInt();
				if (userInput > 6) {
					System.out.println("Too many players");
				}
				else if(userInput < 0) {
					System.out.println("Too few of players");
				}
				else {
					whileKey = 0;
				}
			}
			else {
				System.out.println("Please select a number");
			}
		}
		ArrayList<ArrayList> players = new ArrayList<ArrayList>(userInput);
	}

}
