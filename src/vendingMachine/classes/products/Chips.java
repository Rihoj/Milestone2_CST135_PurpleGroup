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
package vendingMachine.classes.products;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author jamesray
 */
public class Chips extends Snack {

    /**
     * flavor of the chips
     */
    private String flavor;

    /**
     * service size for the chips
     */
    private double servingSize;

    /**
     * are the chips baked
     */
    private boolean baked;

    /**
     * Are the chips gluten free
     */
    private boolean glutenFree;

    /**
     * Create chips with generic information
     */
    public Chips() {
        super();
        flavor = "Salted";
        servingSize = ThreadLocalRandom.current().nextDouble(2, 16);
        baked = ThreadLocalRandom.current().nextBoolean();
        glutenFree = ThreadLocalRandom.current().nextBoolean();
    }

    /**
     * Create chips with specific information
     *
     * @param flavor
     * @param servingSize
     * @param baked
     * @param glutenFree
     * @param weight
     * @param calories
     * @param productName
     * @param price
     * @param quantity
     * @param dispenceLocation
     */
    public Chips(String flavor, double servingSize, boolean baked, boolean glutenFree, double weight, int calories, String productName, double price, int quantity, String dispenceLocation) {
        super(weight, calories, productName, price, quantity, dispenceLocation);
        this.flavor = flavor;
        this.servingSize = servingSize;
        this.baked = baked;
        this.glutenFree = glutenFree;
    }

    /**
     * Copy constructor
     *
     * @param chips
     */
    public Chips(Chips chips) {
        this(chips.getFlavor(), chips.getServingSize(), chips.isBaked(), chips.isGlutenFree(), chips.getWeight(), chips.getCalories(), chips.getProductName(), chips.getPrice(), chips.getQuantity(), chips.getDispenceLocation());
    }

    /**
     * Returns the string of the class.
     *
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "\nChips{" + "flavor=" + flavor + ", servingSize=" + servingSize + ", baked=" + baked + ", glutenFree=" + glutenFree + '}';
    }

    /**
     * Returns the flavor of the chips
     *
     * @return String
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * Sets the flavor of the chips
     *
     * @param flavor
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     * gets the serving size of the chips
     *
     * @return double
     */
    public double getServingSize() {
        return servingSize;
    }

    /**
     * Sets the service size of the chips
     *
     * @param servingSize
     */
    public void setServingSize(double servingSize) {
        this.servingSize = servingSize;
    }

    /**
     * Returns if the chips are baked.
     *
     * @return boolean
     */
    public boolean isBaked() {
        return baked;
    }

    /**
     * sets the baked status of the chips
     *
     * @param baked
     */
    public void setBaked(boolean baked) {
        this.baked = baked;
    }

    /**
     * Returns the gluten free status of the chips
     *
     * @return
     */
    public boolean isGlutenFree() {
        return glutenFree;
    }

    /**
     * sets the gluten free status off the chips.
     *
     * @param glutenFree
     */
    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

}
