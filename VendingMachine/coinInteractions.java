package VendingMachine;

import java.util.ArrayList;
public class coinInteractions {
   private ArrayList<Coin> coinIntake = new ArrayList<Coin>();
   public coinInteractions() {

   }
   public coinInteractions(ArrayList<Coin> coinIntake) {
       this.coinIntake = coinIntake;
   }
   public ArrayList<Coin> getCoinList(){
       return coinIntake;
   }
   public void setCoinList(ArrayList<Coin> coinIntake) {
       this.coinIntake = coinIntake;
   }
   public void addCoins(Coin coin) {
       coinIntake.add(coin);
   }
   public double addAmount() {
       double total = 0;
       for(int i=0;i<coinIntake.size();i++) {
           Coin getCoin = coinIntake.get(i);
           total += getCoin.getVal();
       }
       return total;
   }
   public double removeAmount( double amount) {
       double total = addAmount();
       double newTotal;
       if ( total >= amount){
           newTotal = total - amount;
           coinIntake.clear();
           while (newTotal > 0) {
               if (newTotal / 1 >= 1) {
                   Coin coin = new Coin("Dollar", 1);
                   coinIntake.add(coin);
                   newTotal = newTotal - 1;
               }else if (newTotal / .25 >= 1){
                   Coin coin = new Coin("Quarter", .25);
                   coinIntake.add(coin);
                   newTotal = newTotal - .25;
               }else if (newTotal / .1 >= 1){
                   Coin coin = new Coin("Dime", .1);
                   coinIntake.add(coin);
                   newTotal = newTotal - .1;
               }else if (newTotal / .05 >= 1){
                   Coin coin = new Coin("Nickel", .05);
                   coinIntake.add(coin);
                   newTotal = newTotal - .05;
               }else{
                   Coin coin = new Coin("Penny", .01);
                   coinIntake.add(coin);
                   newTotal = newTotal - .01;
               }
           }
           return newTotal;
       } else
           return total;

   }


}
