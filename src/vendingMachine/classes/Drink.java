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

public class Drink extends Product{

    private double ounces;
    private String type;

    public Drink() {
        super();
        double randomOunces = ThreadLocalRandom.current().nextDouble(1, 11);
        DecimalFormat dec = new DecimalFormat("#.00");
        ounces = Double.parseDouble(dec.format(randomOunces));
        type = "Water";
    }

    public Drink(double ounces, String type, String name, double price, int quantity) {
        super(name, price, quantity);
        this.ounces = ounces;
        this.type = type;
    }

    public double getOunces() {
        return ounces;
    }

    public void setOunces(double ounces) {
        this.ounces = ounces;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
