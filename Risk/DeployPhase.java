package Risk;

import java.util.Scanner;
public class DeployPhase {
	public void deploy() {
		Scanner scnr = new Scanner(System.in);
		String userInput;
		System.out.println("Would you like to trade in Cards? Y/N");
		userInput = scnr.next().toUpperCase();
		while(userInput != "Y" || userInput != "N") {
			System.out.println("Would you like to trade in Cards? Y/N");
			userInput = scnr.next().toUpperCase();
		}
		if(userInput == "Y") {
			
		}
		scnr.close();

	}

}
