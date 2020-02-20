package DessertShop;
/*
Christopher Vasquez, Seth Oglesby, Scott Sakurai
February 20th, 2020
Purpose: Calculates the number of items, the cost, and the tax
Output: none
*/

import java.util.ArrayList;

public class Checkout extends java.lang.Object
{

   private ArrayList<DessertItem> desserts = new ArrayList<DessertItem>();

   private double taxRate = .10;

   public Checkout() {

   }
   
   /*
    * Default constructor that takes in the desserts arraylist
    */
   public Checkout(ArrayList<DessertItem> desserts) {
       this.desserts = desserts;
   }

   /*
    * returns the size of the arraylist
    */
   public int numberOfItems() {
       int count = 0;
       for(int i=0;i<desserts.size();i++) {
           count ++;
       }
       return count;
   }

   /*
    * enters items into the desserts arraylist 
    */
   public void enterItem(DessertItem item) {
       desserts.add(item);
   }

   /*
    * removes all the items in the desserts arraylist
    */
   public void clear() {
       while(desserts.size() > 0) {
           desserts.remove(0);
       }
   }
   

   /*
    * returns the total cost of items
    */
   public double totalCost() {
       double totalCost = 0;
       for(int i=0;i<desserts.size();i++) {
           DessertItem item = desserts.get(i);
           double itemPrice = item.getCost();
           totalCost = totalCost + itemPrice;
       }
       return totalCost;
   }
   
   /*
    * returns what tax would be of total cost
    */
   public double totalTax() {
       return totalCost() * taxRate;
   }

   /*
    * returns a receipt string
    */
   public String toString() {
       String receipt = "";
       receipt += "S & C & S Dessert Shop\n--------------------------------------------------------\n";
       for (int i=0;i<desserts.size();i++) {
           receipt += desserts.get(i);
       }
       receipt += "\nTax            " + String.format("%.2f", totalTax()) + "\nTotal Cost            "
               + String.format("%.2f", totalCost() + totalTax());
       return receipt;
   }

}

