package Risk;

public class CardsTerritory {
	private String territory;
	private String troop;
	public CardsTerritory(String territory, String troop) {
		this.territory = territory;
		this.troop = troop;
	}
	public String getTerritory() {
		return territory;
	}
	public String getTroop() {
		return troop;
	}
	public void setTerritory(String territory) {
		this.territory = territory;
	}
	public void setTroop(String troop) {
		this.troop = troop;
	}

}
