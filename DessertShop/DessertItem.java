package DessertShop;
/*
Christopher Vasquez, Seth Oglesby, Scott Sakurai
February 20th, 2020
Purpose: Creates candy class as child of dessert class
Output: none
*/

import java.util.ArrayList;

public abstract class DessertItem {
	protected String name;
	
	/**
     * Null constructor for DessertItem class
	 */
	public DessertItem() {
		this("");
	}
	/**
	 * Initializes DessertItem data
	 */
	public DessertItem(String name) {
		this.name = name;
    	 }
	/**
	 * Returns name of DessertItem
	 * @return name of DessertItem
	*/
	public final String getName() {
	    return name;
	}
	
	/*
	 * compares the two dessert objects and returns an integer depending on which one is larger
	 */
	public int compareTo(Object dessert) {
  		 if (dessert instanceof DessertItem){
       			double d1 = this.getCost();
       			double d2 = ((DessertItem) dessert).getCost();

       				if (d1 > d2)
          				 	return 1;
       				else if (d1 < d2)
           					return -1;
       				else
           					return 0;

  	 	}
   	return 0;
}
	
	/*
	 * Finds the larger of the two dessert objects and returns the largest
	 */
	public static DessertItem max (ArrayList<Object> dessert){
		   if (dessert instanceof Comparable){
		       DessertItem max = (DessertItem) dessert.get(0);
		      
		       for (int i = 1; i <dessert.size(); i++){
		           if (max.compareTo(dessert.get(i)) < 0)
		               max = (DessertItem) dessert.get(i);
		       }
		       return max;
		   }
		   return null;
		}
		


	
	/**
	 * Returns cost of DessertItem
	 * @return cost of DessertItem
	 */
	 public abstract double getCost();

}
