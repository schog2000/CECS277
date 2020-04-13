package Risk;

import java.util.Scanner;
import java.util.ArrayList;
public class StartUp {
	private ArrayList<Territory> territory = new ArrayList<Territory>();
	private ArrayList<ArrayList> playerTrps = new ArrayList<ArrayList>();
	private ArrayList<ArrayList> playerTerCards = new ArrayList<ArrayList>();
	public StartUp() {
		
	}
	public StartUp(ArrayList<Territory> territory, ArrayList<ArrayList> playerTrps, ArrayList<ArrayList> playerTerCards) {
		this.territory = territory;
		this.playerTrps = playerTrps;
		this.playerTerCards = playerTerCards;
	}
	public ArrayList<Territory> getTerritory(){
		return territory;
	}
	public ArrayList<ArrayList> getStrtUpTrps(){
		return playerTrps;
	}
	public ArrayList<ArrayList> getTerCards(){
		return playerTerCards;
	}
	public void createTer() {
		getTerritory().add(new Territory("Alaska"));
		getTerritory().add(new Territory("North West Territory"));
		getTerritory().add(new Territory("Greenland"));
		getTerritory().add(new Territory("Alberta"));
		getTerritory().add(new Territory("Ontario"));
		getTerritory().add(new Territory("Quebec"));
		getTerritory().add(new Territory("Western United States"));
		getTerritory().add(new Territory("Eastern United States"));
		getTerritory().add(new Territory("Central America"));
		getTerritory().add(new Territory("Venezuela"));
		getTerritory().add(new Territory("Brazil"));
		getTerritory().add(new Territory("Peru"));
		getTerritory().add(new Territory("Argentina"));
		getTerritory().add(new Territory("North Africa"));
		getTerritory().add(new Territory("Egypt"));
		getTerritory().add(new Territory("East Africa"));
		getTerritory().add(new Territory("Congo"));
		getTerritory().add(new Territory("South Africa"));
		getTerritory().add(new Territory("Madagascar"));
		getTerritory().add(new Territory("Iceland"));
		getTerritory().add(new Territory("Great Britain"));
		getTerritory().add(new Territory("Western Europe"));
		getTerritory().add(new Territory("Northern Europe"));
		getTerritory().add(new Territory("Scandinavia"));
		getTerritory().add(new Territory("Ukraine"));
		getTerritory().add(new Territory("Southern Europe"));
		getTerritory().add(new Territory("Middle East"));
		getTerritory().add(new Territory("India"));
		getTerritory().add(new Territory("Siam"));
		getTerritory().add(new Territory("China"));
		getTerritory().add(new Territory("Afghanistan"));
		getTerritory().add(new Territory("Ural"));
		getTerritory().add(new Territory("Mongolia"));
		getTerritory().add(new Territory("Siberia"));
		getTerritory().add(new Territory("Irkutsk"));
		getTerritory().add(new Territory("Yakutsk"));
		getTerritory().add(new Territory("Kamchatka"));
		getTerritory().add(new Territory("Japan"));
		getTerritory().add(new Territory("Indonesia"));
		getTerritory().add(new Territory("New Guinea"));
		getTerritory().add(new Territory("Western Australia"));
		getTerritory().add(new Territory("Eastern Australia"));
	}
	public void startPlayers() {
		Deck callDeck = new Deck();
		callDeck.deckTerritoryCards();
		callDeck.shuffleTer();
		
		Scanner scnr = new Scanner(System.in);
		
		while(true) {
			System.out.println("Do you want to play with missions?");
			String userInputMis;
			userInputMis = scnr.next().toUpperCase();
			if(userInputMis.equals("YES")) {
				callDeck.deckMission();
				callDeck.shuffleMiss();
				break;
			}
			else if(userInputMis.equals("NO")){
				break;
			}
			else {
				System.out.println("Please say yes or no");
			}
		}
		
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
					System.out.println("Too few players");
				}
				else {
					ArrayList<String> plyrColor = new ArrayList<String>();
					plyrColor.add("RED");
					plyrColor.add("YELLOW");
					plyrColor.add("BLACK");
					plyrColor.add("GRAY");
					plyrColor.add("GREEN");
					plyrColor.add("BLUE");
					ArrayList<String> selectedClr = new ArrayList<String>();
					String color;
					int i=0;
					while(i<userInput) {
						for(String colorLeft: plyrColor) {
							System.out.print(colorLeft + "| ");
						}
						System.out.println("Select a color to be: ");
						color = scnr.next().toUpperCase();
						if(plyrColor.contains(color)) {
							if(color.equals("RED")) {
								ArrayList<Integer> redTroops = new ArrayList<Integer>();
								redTroops.add(30);
								getStrtUpTrps().add(redTroops);
								selectedClr.add("Red");
								plyrColor.remove("RED");
								ArrayList<CardsTerritory> playerRedCardTer = new ArrayList<CardsTerritory>();
								getTerCards().add(playerRedCardTer);
							}
							else if(color.equals("YELLOW")) {
								ArrayList<Integer> yellowTroops = new ArrayList<Integer>();
								yellowTroops.add(30);
								getStrtUpTrps().add(yellowTroops);
								selectedClr.add("Yellow");
								plyrColor.remove("YELLOW");
								ArrayList<CardsTerritory> playerYelCardTer = new ArrayList<CardsTerritory>();
								getTerCards().add(playerYelCardTer);
							}
							else if(color.equals("BLUE")) {
								ArrayList<Integer> blueTroops = new ArrayList<Integer>();
								blueTroops.add(30);
								getStrtUpTrps().add(blueTroops);
								selectedClr.add("Blue");
								plyrColor.remove("BLUE");
								ArrayList<CardsTerritory> playerBluCardTer = new ArrayList<CardsTerritory>();
								getTerCards().add(playerBluCardTer);
							}
							else if(color.equals("GREEN")) {
								ArrayList<Integer> greenTroops = new ArrayList<Integer>();
								greenTroops.add(30);
								getStrtUpTrps().add(greenTroops);
								selectedClr.add("Green");
								plyrColor.remove("GREEN");
								ArrayList<CardsTerritory> playerGrnCardTer = new ArrayList<CardsTerritory>();
								getTerCards().add(playerGrnCardTer);
							}
							else if(color.equals("BLACK")) {
								ArrayList<Integer> blckTroops = new ArrayList<Integer>();
								blckTroops.add(30);
								getStrtUpTrps().add(blckTroops);
								selectedClr.add("Black");
								plyrColor.remove("BLACK");
								ArrayList<CardsTerritory> playerBlckCardTer = new ArrayList<CardsTerritory>();
								getTerCards().add(playerBlckCardTer);
							}
							else {
								ArrayList<Integer> grayTroops = new ArrayList<Integer>();
								grayTroops.add(30);
								getStrtUpTrps().add(grayTroops);
								selectedClr.add("Gray");
								plyrColor.remove("GRAY");
								ArrayList<CardsTerritory> playerGrayCardTer = new ArrayList<CardsTerritory>();
								getTerCards().add(playerGrayCardTer);
							}
							i++;
						}
						else {
							System.out.println("Please choose a valid color.");
						}
					}
					ArrayList<Territory> activeTerritory = getTerritory();
					int playerTurn = 0;
					int ttlDeployedTrps = 0;
					String selectTer;
					while(true) {
						System.out.println("Please select a territory " + selectedClr.get(playerTurn) + " player");
						selectTer = scnr.nextLine();
						String upperCaseLine = "";
						Scanner lineScan = new Scanner(selectTer);
						while(lineScan.hasNext()) {
							String word = lineScan.next();
							upperCaseLine += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
						}
						
						for(int k = 0; k < activeTerritory.size(); k++) {
							Territory checkTer = activeTerritory.get(k);
							if(upperCaseLine == checkTer.getName()) {
								int trpsSent = 1;
								Territory checkTrpCount = getTerritory().get(i);
								if(checkTrpCount.getTroops() >= 1) {
									trpsSent++;
								}
								getTerritory().set(k, new Territory(upperCaseLine, selectedClr.get(playerTurn), trpsSent));
								break;
							}
						}
						playerTurn++;
						if(playerTurn == 5 && ttlDeployedTrps == 30) {
							break;
						}
						else if (playerTurn == 5 && ttlDeployedTrps != 30){
							playerTurn = 0;
							ttlDeployedTrps++;
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
