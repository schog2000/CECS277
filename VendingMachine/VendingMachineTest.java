package VendingMachine;

import java.util.Scanner;
import java.util.ArrayList;
public class VendingMachineTest {
   public static void main(String[] args) {
       VendingMachine machine = new VendingMachine();
       String userInput;
       String letters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       System.out.println("S)how products  I)nsert Coin  B)uy  A)dd product  "
               + "R)emove Coins  Q)uit");
       Scanner scnr = new Scanner(System.in);
       userInput = scnr.next().toUpperCase();
       while(userInput != "Q") {
           /*
            * if statement for showing the products
            */
           if(userInput.equals("S")) {
               for(int i=0;i < machine.getList().size();i++) {
                   Product showProd = machine.showProd(i);
                   System.out.println(showProd);
               }
           }
           /*
            * else if statement for inserting coins to vending machine
            */
           else if (userInput.equals("I")) {
               System.out.println("A) nickel @ 0.05\nB) dime @ 0.10\nC) quarter @ 0.25\nD) dollar @ 1.00");
               String amount = scnr.next().toUpperCase();
               String type="";
               double value=0;
               if(amount.equals("A")) {
                   type="nickel";
                   value=0.05;
               }
               else if(amount.equals("B")) {
                   type="dime";
                   value=0.10;
               }
               else if(amount.equals("C")) {
                   type="quarter";
                   value= 0.25;
               }
               else if(amount.equals("D")) {
                   type="dollar";
                   value=1.00;
               }
               Coin coin = new Coin (type,value);
               machine.inputCoin(coin);
           }
           /*
            * else if statement for buying products
            */
           else if (userInput.equals("B")) {
        	   ArrayList<Product> list = machine.getList();
               for(int i=0;i < list.size();i++) {
                   Product showProd = machine.showProd(i);
                   System.out.println(letters.charAt(i)+") "+showProd);
               }
               char foodoption = scnr.next().toUpperCase().charAt(0);
               for (int i=0;i < list.size();i++) {
                   if (foodoption==letters.charAt(i)) {
                       if (list.get(i).getAmount() > 0) {
                           if (machine.totalCoins() >= list.get(i).getPrice()) {
                               machine.removeCoin(list.get(i).getPrice());
                               list.get(i).setAmount(list.get(i).getAmount() - 1);
                           } else
                               System.out.println("Sorry not enough money please add more.");
                       }
                       else{
                           System.out.println("Sorry we are out of that item");
                       }
                   }

               }
           }
           /*
            * else if statement for adding items to vending machine
            */
           else if(userInput.equals("A")) {
               System.out.println("Description:");
               String description = scnr.next();
               System.out.println("Price:");
               Double price = scnr.nextDouble();
               System.out.println("Quantity:");
               int quantity = scnr.nextInt();
               if (quantity <= 0 ){
                   System.out.println("Please add a positive Quantity");
                   quantity = scnr.nextInt();
               }
               Product product = new Product(description, price, quantity);
               machine.insertProd(product);
           }
           /*
            * else if statement for removing coins
            */
           else if(userInput.equals("R")) {
               for(int i=0;i < machine.getObj().getCoinList().size();i++) {
                   Coin coin = machine.getObj().getCoinList().get(i);
                   System.out.println(letters.charAt(i) + ") " + coin);
               }
               char coinOption = scnr.next().toUpperCase().charAt(0);
               for (int i = 0; i < machine.getObj().getCoinList().size(); i++){
                   if ( coinOption == letters.charAt(i))
                       machine.removeCoin(machine.getObj().getCoinList().get(i).getVal());
               }

           }
           /*
            * else if statement for quitting the program
            */
           else if(userInput.equals("Q")) {
               break;
           }
           else {
               System.out.println("input not valid please try again");
           }
           System.out.println("S)how products  I)nsert Coin  B)uy  A)dd product  "
                   + "R)emove Coins  Q)uit");
           userInput = scnr.next().toUpperCase();
       }
       scnr.close();
   }

}
