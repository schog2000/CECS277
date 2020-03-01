package Risk;

import java.util.ArrayList;
import java.util.Collections;
public class Deck {
	private ArrayList<CardsTerritory> deckTerritory = new ArrayList<CardsTerritory>();
	private ArrayList<CardsMission> deckMission = new ArrayList<CardsMission>(); 
	public void deckTerritoryCards() {
		ArrayList<String> territory = new ArrayList<String>();
		territory.add("Alaska");
		territory.add("North West Territory");
		territory.add("Greenland");
		territory.add("Alberta");
		territory.add("Ontario");
		territory.add("Quebec");
		territory.add("Western United States");
		territory.add("Eastern United States");
		territory.add("Central America");
		territory.add("Venezuela");
		territory.add("Brazil");
		territory.add("Peru");
		territory.add("Argentina");
		territory.add("North Africa");
		territory.add("Egypt");
		territory.add("East Africa");
		territory.add("Congo");
		territory.add("South Africa");
		territory.add("Madagascar");
		territory.add("Iceland");
		territory.add("Great Britain");
		territory.add("Western Europe");
		territory.add("Northern Europe");
		territory.add("Scandinavia");
		territory.add("Ukraine");
		territory.add("Southern Europe");
		territory.add("Middle East");
		territory.add("India");
		territory.add("Siam");
		territory.add("China");
		territory.add("Afghanistan");
		territory.add("Ural");
		territory.add("Mongolia");
		territory.add("Siberia");
		territory.add("Irkutsk");
		territory.add("Yakutsk");
		territory.add("Kamchatka");
		territory.add("Japan");
		territory.add("Indonesia");
		territory.add("New Guinea");
		territory.add("Western Australia");
		territory.add("Eastern Australia");
		
		ArrayList<String> troop = new ArrayList<String>();
		troop.add("Infantry");
		troop.add("Cavalry");
		troop.add("Artillery");
		
		int countTer = 0;
		int countTrp = 0;
		while(countTer < territory.size()) {
			deckTerritory.add(new CardsTerritory(territory.get(countTer),troop.get(countTrp),countTrp));
			countTer++;
			countTrp++;
			if(countTrp == 3) {
				countTrp = 0;
			}
		}
		
	}
	public void shuffleTer() {
		Collections.shuffle(deckTerritory);
	}
	public void deckMission() {
		ArrayList<String> mission = new ArrayList<String>();
		mission.add("Destroy the entire red army");
		mission.add("Destroy the entire blue army");
		mission.add("Destroy the entire yellow army");
		mission.add("Destroy the entire green army");
		mission.add("Destroy the entire black army");
		mission.add("Destroy the entire gray army");
		mission.add("Capture 18 territories and occupy each with at least two troops");
		mission.add("Capture Europe,Australia, and one other continent");
		mission.add("Capture Europe, South America, and one other continent");
		mission.add("Capture North America and Africa");
		mission.add("Capture North America and Australia");
		mission.add("Capture Asia and South America");
		mission.add("Capture Asia and Africa");
		mission.add("Capture 24 territories");
		
		for(int i=0;i<mission.size();i++) {
			deckMission.add(new CardsMission(mission.get(i),i));
		}
	}
	public void shuffleMiss() {
		Collections.shuffle(deckMission);
	}

}
