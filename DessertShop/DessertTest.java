package DessertShop;
/*
Christopher Vasquez, Seth Oglesby, Scott Sakurai
February 20th, 2020
Purpose: Creates candy class as child of dessert class
Output: Prints the test of each dessert test and outputs the cost of the total of all the desserts,
*/

import java.util.ArrayList;
public class DessertTest{
 
	public static void main(String[] args) {
	       ArrayList<DessertItem> desserts = new ArrayList<DessertItem>();
	       System.out.println("----------------------------------------------"
	               + "---------------------------------");
	       System.out.println("CANDY TEST:");		//tests the candy class
	       desserts.add(new Candy("Corn", 2));
	       System.out.print(desserts.get(0));
	       desserts.add(new Candy("Lolipop",2.5));
	       System.out.print(desserts.get(1));
	       System.out.println("----------------------------------------------"
	               + "---------------------------------");
	       System.out.println("COOKIE TEST:");		//tests the cookie class
	       desserts.add(new Cookies("ChocChip",17));
	       System.out.print(desserts.get(2));
	       desserts.add(new Cookies("Oatmeal",15));
	       System.out.print(desserts.get(3));
	       System.out.println("----------------------------------------------"
	               + "---------------------------------");
	       System.out.println("ICECREAM TEST:");		//tests the ice cream class
	       desserts.add(new IceCream("Vanilla"));
	       System.out.print(desserts.get(4));
	       desserts.add(new IceCream("Chocolate"));
	       System.out.print(desserts.get(5));
	       System.out.println("----------------------------------------------"
	               + "---------------------------------");
	       System.out.println("Sundae Test:");		//tests the sundae class
	       desserts.add(new Sundae("Vanilla","HotFudge"));
	       System.out.print(desserts.get(6));
	       desserts.add(new Sundae("BananaSplit","Nuts"));
	       System.out.print(desserts.get(7));
	       System.out.println("----------------------------------------------"
	               + "---------------------------------");
	   
	       Checkout check = new Checkout();
	       for(int i=0;i<desserts.size();i++) {
	           check.enterItem(desserts.get(i));
	       }
	       System.out.println("Output Receipt:\n");
	       System.out.println("Number of items: " + check.numberOfItems());
	       System.out.println("Total Cost of Items: " + String.format("%.2f", check.totalCost()));
	      System.out.println("Total tax of Items: " + String.format("%.2f",check.totalTax() ));
System.out.println("Cost + Tax: " + String.format("%.2f",check.totalCost() + check.totalTax()) + "\n");
	       System.out.println(check);
	       
	       System.out.println("----------------------------------------------"
	               + "---------------------------------");
	       
	       System.out.println("Max Test By Cost With Same DessertItem Types:");
	       for(int i=0; i<desserts.size()-2;i+=2) {
	    	   	if (desserts.get(i).compareTo(desserts.get(i+1))==0){
	    	   		System.out.println(desserts.get(i)+"\nis equal to\n\n"+desserts.get(i+1));
	    	   	}
	    	   	else if (desserts.get(i).compareTo(desserts.get(i+1))>0){
	    	   		System.out.println(desserts.get(i)+"\nis greater than\n\n"+desserts.get(i+1));
	    	   	}
	    	   	else if (desserts.get(i).compareTo(desserts.get(i+1))<0){
	    	   		System.out.println(desserts.get(i)+"\nis less than\n\n"+desserts.get(i+1));
	    	   	}
		    	
		    }
	       
	       System.out.println("----------------------------------------------"
	               + "---------------------------------");
	       System.out.println("Max Test With Different DessertItem Types:");
	       for(int i=2; i<desserts.size();i++) {
	    	   	if (desserts.get(0).compareTo(desserts.get(i))==0){
	    	   		System.out.println(desserts.get(0)+"\nis equal to\n\n"+desserts.get(i));
	    	   	}
	    	   	else if (desserts.get(0).compareTo(desserts.get(i))>0){
	    	   		System.out.println(desserts.get(0)+"\nis greater than\n\n"+desserts.get(i));
	    	   	}
	    	   	else if (desserts.get(0).compareTo(desserts.get(i))<0){
	    	   		System.out.println(desserts.get(0)+"\nis less than\n\n"+desserts.get(i));
	    	   	}
	    	   	
		    	
		    }
	       
	       System.out.println("----------------------------------------------"
	               + "---------------------------------");
	       System.out.println("The unsorted by cost DessertList is:");
	       for (int i=0; i<desserts.size();i++) {
	    	   System.out.println(desserts.get(i));
	       }
	       sort(desserts);
	       System.out.println("----------------------------------------------"
	               + "---------------------------------");
	       System.out.println("The sorted by cost DessertList is:");
	       for (int i=0; i<desserts.size();i++) {
	    	   System.out.println(desserts.get(i));
	       }
	       
	       

	   }
	/*
	 * method that takes an array and sorts it
	 */
	public static ArrayList<DessertItem>  sort (ArrayList<DessertItem> dessert) {

	       for (int i=0; i<dessert.size(); i++) {
	           DessertItem lowest = dessert.get(i);
	           int lowestIndex = i;
	           DessertItem temp;
	           for (int j= i + 1; j<dessert.size();j++){
	               if (dessert.get(j).compareTo(lowest) < 0 )
	               {
	                   lowest = dessert.get(j);
	                   lowestIndex = j;
	               }
	           }
	           temp = dessert.get(i);
	           dessert.set(i,lowest);
	           dessert.set(lowestIndex, temp);

	       }


	   return dessert;
	}



	}
