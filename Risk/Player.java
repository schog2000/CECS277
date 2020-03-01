package Risk;

import java.util.ArrayList;
public class Player {
	private String color;
	private ArrayList<Troops> army = new ArrayList<Troops>();
	public Player(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public ArrayList<Troops> getArmy(){
		return army;
	}

}
