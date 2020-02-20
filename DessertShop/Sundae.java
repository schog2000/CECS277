package DessertShop;

/*
Christopher Vasquez, Seth Oglesby, Scott Sakurai
February 20th, 2020
Purpose: Creates Sundae class as child of Ice Cream class
Output: none
*/


public class Sundae extends IceCream{
	
	//initializing variables
   private String toppings;
   private double topPrice = 1.00;
   private double caloriesTop = 200;
   
   //constructor for Sundae class
   public Sundae(String name, String toppings) {
       super(name);
       this.toppings = toppings;
   }
   
   //returns toppings of Sundae
   public String getTop() {
       return toppings;
   }

   //returns cost for Sundae
   public double getCost() {
       return (getPrice() + topPrice)/100;
   }

   //returns number of calories for Sundae
   public double getCalSundae() {
       return getCal() + caloriesTop;
   }

   //returns string 
   public String toString() {
       return name + "(Sundae) with\n" + toppings + "(Topping)            " + String.format("%.2f", getCost()) + "\n"
               + name + "(Sundae) calories:" + String.format("%.2f", getCalSundae()) + "\n";
   }

}
