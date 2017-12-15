/**
 * @project Milestone2
 * @course CST-135
 * @author James Ray
 * @author Christopher Hyde
 * @author Jesus Leon
 * @author Robert Wayde
 * @teacher Dr. Lively
 * @date 12/11/17
 */
package vendingMachine.classes;

import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

abstract public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product() {
        name = "Product Name Here";
        double randomPrice = ThreadLocalRandom.current().nextDouble(0.5, 6);
        DecimalFormat dec = new DecimalFormat("#.00");
        price = Double.parseDouble(dec.format(randomPrice));
        int randomQuantity = ThreadLocalRandom.current().nextInt(1, 11);
        quantity = randomQuantity;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", quantity=" + quantity + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void increaseQuantity() {
        this.quantity++;
    }

    public void increaseQuantity(int increase) {
        this.quantity += increase;
    }

    public void decreaseQuantity() {
        this.quantity--;
    }

    public void decreaseQuantity(int decrease) {
        this.quantity -= decrease;
    }
}
