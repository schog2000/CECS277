package Risk;

import java.util.Scanner;
import java.util.ArrayList;
public class StartUp {
	public void start() {
		int userInput;
		String color;
		Scanner scnr = new Scanner(System.in);
		System.out.println("How many players are playing?");
		int whileKey = 1;
		while(whileKey == 1) {
			if(scnr.hasNextInt()) {
				userInput = scnr.nextInt();
				ArrayList<ArrayList> players = new ArrayList<ArrayList>(userInput);
				for(int i=0;i<userInput;i++) {
					System.out.println("Select a color to be");
						color = scnr.next();
				}
				if (userInput > 6) {
					System.out.println("Too many players");
				}
				else if(userInput < 2) {
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
		scnr.close();
	}

}
