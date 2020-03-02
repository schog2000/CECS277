package Risk;

public class CardsTerritory {
	private String territory;
	private String troop;
	private int troopNum;
	public CardsTerritory(String territory, String troop, int troopNum) {
		this.territory = territory;
		this.troop = troop;
	}
	public String getTerritory() {
		return territory;
	}
	public String getTroop() {
		return troop;
	}
	public int getTroopNum() {
		return troopNum;
	}
	public void setTroopNum(int troopNum) {
		this.troopNum = troopNum;
	}
	public String toString() {
		return getTroop() + " of " + getTerritory();
	}
}
