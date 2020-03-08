package Risk;

import java.util.Scanner;
import java.util.ArrayList;
public class StartUp {
	public void start() {
		Deck callDeck = new Deck();
		callDeck.deckTerritoryCards();
		callDeck.shuffleTer();
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("How many players are playing?");
		int userInput;
		int whileKey = 1;
		while(whileKey == 1) {
			if(scnr.hasNextInt()) {
				userInput = scnr.nextInt();
				if (userInput > 6) {
					System.out.println("Too many players");
				}
				else if(userInput < 2) {
					System.out.println("Too few of players");
				}
				else {
					ArrayList<ArrayList> players = new ArrayList<ArrayList>(userInput);
					ArrayList<String> plyrColor = new ArrayList<String>();
					plyrColor.add("Red");
					plyrColor.add("Yellow");
					plyrColor.add("Black");
					plyrColor.add("Gray");
					plyrColor.add("Green");
					plyrColor.add("Blue");
					String color;
					for(int i=0;i<userInput;i++) {
						System.out.println("Select a color to be");
						color = scnr.next().toUpperCase();
						if(plyrColor.contains(color)) {
							if(color == "Red") {
								ArrayList<Integer> redTroops = new ArrayList<Integer>();
								redTroops.add(30);
								players.add(redTroops);
								plyrColor.remove("Red");
							}
							else if(color == "Yellow") {
								ArrayList<Integer> yellowTroops = new ArrayList<Integer>();
								yellowTroops.add(30);
								players.add(yellowTroops);
								plyrColor.remove("Yellow");
							}
							else if(color == "Blue") {
								ArrayList<Integer> blueTroops = new ArrayList<Integer>();
								blueTroops.add(30);
								players.add(blueTroops);
								plyrColor.remove("Blue");
							}
							else if(color == "Green") {
								ArrayList<Integer> greenTroops = new ArrayList<Integer>();
								greenTroops.add(30);
								players.add(greenTroops);
								plyrColor.remove("Green");
							}
							else if(color == "Black") {
								ArrayList<Integer> blckTroops = new ArrayList<Integer>();
								blckTroops.add(30);
								players.add(blckTroops);
								plyrColor.remove("Black");
							}
							else {
								ArrayList<Integer> grayTroops = new ArrayList<Integer>();
								grayTroops.add(30);
								players.add(grayTroops);
								plyrColor.remove("Gray");
							}
						}
						else {
							System.out.println("Please choose another color.");
						}
					}
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
