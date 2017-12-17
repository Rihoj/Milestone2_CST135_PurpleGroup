/**
 * @project Milestone2
 * @course CST-135
 * @author James Ray
 * @author Christopher Hyde
 * @author Jesus Leon
 * @author Robert Wayde
 * @teacher Dr. Lively
 * @date 12/16/17
 */
package vendingMachine.classes;

import java.util.ArrayList;

/**
 * @author Christopher Hyde
 */

public class Dispenser {

    /**
     * ArrayList of Products
     */
    private ArrayList<Product> productList = new ArrayList<>();

    /**
     * Balance in vendingMachine
     */
    private double balance;

    /**
     * Number of sales made
     */
    private int totalSales;

    /**
     * Create a Dispenser with generic information.
     */
    public Dispenser(){
        this.productList = new ArrayList<Product>();
        this.balance = 20.00;
        this.totalSales = 0;
    }

    /**
    * Create Dispenser with specific info and Generated productList
    */
    public Dispenser(double balance, int totalSales){
        productListFiller(); // Fill the productList with products
        this.balance = balance; // The amount of money for change giving before any sales are made.
        this.totalSales = totalSales;
    }

    /**
     * Returns a string of what is in the Dispenser and how many sales.
     *
     * @return String
     */
    @Override
    public String toString() {


        // Return the inventory string along with the balance and totalSales of the Dispenser.
        return "Inventory:\n" +displayProducts() + "Balance: " + getBalance() + "\nTotal Sales:" + getTotalSales();
    }

    /**
     * Returns a string of what products are in the dispenser.
     *
     * @return String
     */
    public String displayProducts(){
        String inventory = "";

        // Create a single string containing every product in the Dispenser
        for(int i = 0; i < getProductList().size(); i++){
            inventory += i + ": " + getProductList().get(i) + "\n\n";
        }

        return inventory;
    }

    /**
     *  Fill the productList with products
     */
    public void productListFiller(){
        // Varaity of products that will be placed in the productList ArrayList<Product>
        productList.add(new Chips("Barbecue", 1, false, false, 28.4, 139, "Lays", 0.99, 10, "A1" ));
        productList.add(new Chips("Classic", 1, false, false, 28.4, 152, "Lays", 0.99, 10, "A2" ));
        productList.add(new Chips("Original", 1, true, false, 28.2, 160, "Fritos", 0.99, 10, "A3" ));
        productList.add(new Chips("Cool Ranch", 1, true, false, 35.4, 180, "Dorito", 0.99, 10, "A4" ));
        productList.add(new Chips("Nacho Cheese", 1, true, false, 28.0, 120, "Dorito", 0.99, 10, "A5" ));
        productList.add(new Drink(12, "Soft Drink", 140, false, 1, "Coca-Cola", 1.25, 10, "D1"));
        productList.add(new Drink(12, "Soft Drink", 0, true, 1, "Diet Coca-Cola", 1.25, 10, "D2"));
        productList.add(new Drink(12, "Soft Drink", 150, false, 1, "Dr. Pepper", 1.25, 10, "D3"));
        productList.add(new Drink(12, "Soft Drink", 0, true, 1, "Diet Dr. Pepper", 1.25, 10, "D4"));
        productList.add(new Drink(16.9, "Water", 0, true, 0, "Purified Drinking Water", 1.00, 10, "D5"));
        productList.add(new Gum("Citric", 8, 1, true, 21.2, 1, "Tridant", 0.50, 10, "C1"));
        productList.add(new Gum("Starburst", 8, 1, true, 21.6, 1, "Juicy Fruit", 0.75, 10, "C2"));
        productList.add(new Gum("Spearmint", 8, 1, true, 21.6, 1, "Extra", 0.25, 10, "C3"));
        productList.add(new Gum("Cinnamon", 5, 1, false, 13.5, 10, "Big Red", 0.35, 10, "C4"));
        productList.add(new Gum("Doublemint", 5, 1, false, 13.3, 10, "Wrigley's", 0.35, 10, "C5"));

    }

    /**
     * Change product in productList at Index
     *
     * @param index
     * @param product
     */
    public void changeProduct(int index, Product product){
        getProductList().remove(index); //remove the product currently in that index.
        getProductList().add(index, product); // Add the new product to that index.
    }

    /**
     * Returns the ArrayList<Product> pruductList.
     *
     * @return productList
     */
    public ArrayList<Product> getProductList() {
        return productList;
    }

    /**
     * Sets the productList to a new ArrayList<Product>
     *
     * @param productList
     */
    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    /**
     * Returns the balance of the Dispencer
     *
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the balance of the Dipenser
     *
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Returns the totalSales of the Dispenser
     * @return totalSales
     */
    public int getTotalSales() {
        return totalSales;
    }

    /**
     * Set the totalSales of the Dispernser
     *
     * @param totalSales
     */
    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }
}
