package VendingMachine;

import java.util.ArrayList;
public class VendingMachine {
   private ArrayList<Product> products = new ArrayList<Product>();
   private coinInteractions coinSet = new coinInteractions();
   public VendingMachine() {

   }
   public VendingMachine(ArrayList<Product> products, coinInteractions coinSet) {
       this.products = products;
       this.coinSet = coinSet;
   }
   public ArrayList<Product> getList(){
       return products;
   }
   public void setList(ArrayList<Product> products){
       this.products = products;
   }
   public coinInteractions getObj() {
       return coinSet;
   }
   public void setObj(coinInteractions coinSet) {
       this.coinSet = coinSet;
   }
   public void insertProd(Product product) {
       getList().add(product);
   }
   public void inputCoin(Coin coin) {
       getObj().addCoins(coin);
   }
   public double removeCoin(double amount) {
       return getObj().removeAmount(amount);
   }
   public Product showProd(int getI) {
       return getList().get(getI);
   }
   public double totalCoins() {
       return getObj().addAmount();
   }


}
