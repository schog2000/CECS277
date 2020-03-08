package Risk;

public class Territory {
	private String name;
	private String ownership;
	private int occupiedTroops;
	public Territory() {
		
	}
	public Territory(String name) {
		this.name = name;
	}
	public Territory(String name, String ownership, int occupiedTroops) {
		this.name = name;
		this.ownership = ownership;
		this.occupiedTroops = occupiedTroops;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return ownership;
	}
	public void setOwner(String ownership) {
		this.ownership = ownership;
	}
	public int getTroops() {
		return occupiedTroops;
	}
	public void setTroops(int occupiedTroops) {
		this.occupiedTroops = occupiedTroops;
	}
	public String toString() {
		return getTroops() + " " + getOwner() + " troops in " + getName();
	}

}
