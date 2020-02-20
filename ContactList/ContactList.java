package ContactList;
import java.util.Scanner;

public class ContactList {
	public ContactNode head; 
	public ContactNode tail;
	public ContactList(){
		head = null;
	    tail = head;
	 }
	 public void addLast(ContactNode node){
		 if(head == null){
			 head = node;
	         tail = head;
	     }
	     else{
	         ContactNode current = this.head;
	         while(current.getNext() != null){
	            current = current.getNext();
	         }
	         current.nextNode = node;
	         tail = node;
	     }
	 }
	   
	 public String toString(){
		 String finalResult = "";
	     ContactNode temp = head;
	     while(temp != null){
	    	 finalResult = "Name: " + temp.getName() + "\nPhone number: " + temp.getPhoneNumber() + "\n";
	         temp.getNext();
	     }
	     return finalResult;
	 }
	 public static void main(String[] args) {
		 Scanner scnr = new Scanner(System.in);
		 ContactList obj = new ContactList();
	     char input;
	     char input1;
	     String inputName;
	     String inputPhoneNum;
	     int whileKey = 1;
	      
	     System.out.println("Enter a contact to the contact list:");
	     while(whileKey == 1){
	         System.out.println("Enter name:");
	         inputName = scnr.nextLine();
	         System.out.println("Enter phone number:");
	         inputPhoneNum = scnr.nextLine();
	         ContactNode node = new ContactNode(inputName, inputPhoneNum);
	         obj.addLast(node);  
	         System.out.println("Enter \"Y\" to add more contacts:");
	         input = scnr.nextLine().charAt(0);
	         input1 = Character.toUpperCase(input);
	         if(input1 == 'Y'){
	            continue;
	         }
	         else{
	            whileKey = -1;
	         }
	         System.out.println("CONTACT LIST");
	         System.out.println(obj.toString());
	      } 
	   }

}
