/**
 * @project Milestone2
 * @course CST-135
 * @author James Ray
 * @author Christopher Hyde
 * @author Jesus Leon
 * @author Robert Wayde
 * @teacher Dr. Lively
 * @date 12/14/17
 */
package vendingMachine.classes;

import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

abstract public class Snack extends Product {

    /**
     * weight of the snack
     */
    private double weight;
    /**
     * calories in the snack
     */
    private int calories;

    /**
     * Create a snack with generic information.
     */
    public Snack() {
        super();
        double randomWeight = ThreadLocalRandom.current().nextDouble(1, 11);
        DecimalFormat dec = new DecimalFormat("#.00");
        weight = Double.parseDouble(dec.format(randomWeight));
        calories = ThreadLocalRandom.current().nextInt(5, 256);
    }

    /**
     * Create a snack with specific information.
     *
     * @param weight
     * @param calories
     * @param productName
     * @param price
     * @param quantity
     * @param dispenceLocation
     */
    public Snack(double weight, int calories, String productName, double price, int quantity, String dispenceLocation) {
        super(productName, price, quantity, dispenceLocation);
        this.weight = weight;
        this.calories = calories;
    }

    /**
     * Copy constructor
     *
     * @param snack
     */
    public Snack(Snack snack) {
        this(snack.getWeight(), snack.getCalories(), snack.getProductName(), snack.getPrice(), snack.getQuantity(), snack.getDispenceLocation());
    }

    /**
     * Returns a string of what the snack is.
     *
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "\nSnack{" + "weight=" + weight + ", calories=" + calories + '}';
    }

    /**
     * Gets the weight of the snack
     *
     * @return double
     */
    public double getWeight() {
        return weight;
    }

    /**
     * set the weight of a snack.
     *
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * get the calories in the snack.
     *
     * @return int
     */
    public int getCalories() {
        return calories;
    }

    /**
     * sets the calories in the snack.
     *
     * @param calories
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }

}
