package DessertShop;
/*
Christopher Vasquez, Seth Oglesby, Scott Sakurai
February 20th, 2020
Purpose: Creates candy class as child of dessert class
Output: none
*/

public class Cookies extends DessertItem{

   private int amountOfCookies;
   private double pricePerDozen = 9.99;
   private int calories = 200;

   /*
    * Cookie constructor that takes in name and amount of cookies
    */
   public Cookies(String name, int amountOfCookies) {
       super(name);
       this.amountOfCookies=amountOfCookies;
   }

   /*
    * returns the amount of cookies
    */
   public int getAmountofcookies() {
       return amountOfCookies;
   }
   
   /*
    * adds a value to the amount of cookies
    */
   public void setAmountofcookies(int amountOfCookies) {
       this.amountOfCookies = amountOfCookies;
   }

   /*
    * returns the cost of the amount of cookies requested
    */
   public double getCost() {
       return ( ( (double) amountOfCookies / 12) * pricePerDozen);
   }
   /*
    * returns the amount of calories the cookies are
    */
   public double getCalories() {
       return calories*amountOfCookies;
   }

   /*
    * Strings the type of cookies, amount, the cost, and the calories
    */
   public String toString() {
       return getAmountofcookies() + " @ " + pricePerDozen + "/dz.\n" + name + "(Cookie)          "
               + String.format("%.2f", getCost()) + "\n" + name + "(Cookie) calories:" + String.format("%.2f", getCalories()) + "\n";
   }

}


