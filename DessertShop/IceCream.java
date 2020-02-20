package DessertShop;

public class IceCream extends DessertItem {
	private double price = 1000;
	private double calories = 400;
	public IceCream(String name) {
		super(name);
	}
	public double getCost() {
		return price/100;
	}
	public double getCal() {
		return calories;
	}
	public double getPrice() {
		return price;
	}
	public String toString() {
		return name + "(IceCream)          " + getCost() + "\n" + name + "(IceCream) calories:" 
	+ getCal() + "\n";
	}

}
