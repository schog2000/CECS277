package VendingMachine;

public class Coin {
	   private String typeCoin;
	   private double value;
	   public Coin() {

	   }
	   public Coin(String type, double value) {
	       this.typeCoin = type;
	       this.value = value;
	   }
	   public String getType() {
	       return typeCoin;
	   }
	   public void setType(String type) {
	       this.typeCoin = type;
	   }
	   public double getVal() {
	       return value;
	   }
	   public void setVal(double value) {
	       this.value = value;
	   }
	   public String toString() {
	       return typeCoin + " @ " + String.format("%.2f",value);
	   }

	}

