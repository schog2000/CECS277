import java.util.Scanner;
public class LinearSearchUserInput {
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		Scanner scnr1 = new Scanner(System.in);
	    int inputNum;
	    int counter = 0;
	    int array[] = new int[5];
	    int arrayLoc = -1;
	    int searchKey;
	    int arrayChecker = -1;
	      
	    System.out.println("Enter up to 5 integers, followed by a non-number:");
	    while(scnr.hasNextInt()){
	        if(scnr.hasNextInt()){
	        	inputNum = scnr.nextInt();
	        	counter ++;
	        	arrayLoc ++;
	            array[arrayLoc] = inputNum;
	            if(counter == 5){
	               System.out.println("Maximum number of elements (5) reached, discarded excess");
	               break;
	            }
	         }
	        else {
	        	break;
	        }
	      }
	      
	      System.out.println("Enter an integer to search for:");
	      if(scnr1.hasNextInt()){
	    	  searchKey = scnr1.nextInt();
	          for(int i=0;i<array.length;i++){
	        	  if(searchKey == array[i]){
	        		  System.out.println("Found at position: " + i);
	        		  arrayChecker = 1;
	              }
	          }
	          if(arrayChecker == -1){
		    	  System.out.println("Did not find the element.");
		      }
	      }
	      else{
	    	  System.out.println("Invalid entry, search stopped!");
	      }
	 }

}
