package DessertShop;
/*
Christopher Vasquez, Seth Oglesby, Scott Sakurai
February 20th, 2020
Purpose: Creates candy class as child of dessert class
Output: none
*/

public class Candy extends DessertItem
{
   private double weightInPounds;
   private double pricePerPound = 5.99;
   private int caloriesPerPound = 400;
   
   /*
    * Default constructor that initializes candy data
    */
   public Candy(String name, double weightInPounds) {
       super(name);
       this.weightInPounds = weightInPounds;
   }

   /*
    * returns weight of candy
    */
   public double getWeight() {
       return weightInPounds;
   }

   /*
    * adds an amount to the weight of candy
    */
   public void setWeight(int weight) {
       this.weightInPounds = weight;
   }
   
   /*
    * returns the cost of candy requested
    */
   public double getCost() {
       return (pricePerPound * weightInPounds);
   }
   
   /*
    * returns the amount of calories of the candy
    */
   public double getCal() {
       return caloriesPerPound * weightInPounds;
   }

   /*
    * Strings the name, the weight, the price, and the calories
    */
   public String toString() {
       return String.format("%.2f", getWeight()) + " @ " + pricePerPound + "/lbs.\n" + name + "(Candy)          "
               + String.format("%.2f", getCost()) + "\n" + name + "(Candy) calories:" + String.format("%.2f", getCal()) + "\n";
   }

}
