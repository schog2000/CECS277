package Risk;

import java.util.ArrayList;
import java.util.Scanner;
public class DeployPhase {
	public void deploy() {
		StartUp connectStrtUp = new StartUp();
		ArrayList<ArrayList> playerTerCards = connectStrtUp.getTerCards();
		if(playerTerCards.get(0).size() == 6) {
			System.out.println("You must trade in a set. Select a set to be traded:");
			while(true) {
				for(int i=0;i<playerTerCards.get(0).size();i++) {
					System.out.println(playerTerCards.get(0).get(i));
				}
			}
		}
		else {
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

}
