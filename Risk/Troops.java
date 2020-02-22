package Risk;

public class Troops {
	private int infantry;
	private int cavalry;
	private int artillery;
	public Troops() {
		this.infantry = 1;
		this.cavalry = 5;
		this.artillery = 10;
	}
	public  int getInf() {
		return infantry;
	}
	public int getCav() {
		return cavalry;
	}
	public int getArt() {
		return artillery;
	}

}
