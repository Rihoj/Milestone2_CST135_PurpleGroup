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

public class Snack extends Product{

    private double weight;
    private double length;
    private double width;

    public Snack() {
        super();
    }

    public Snack(double weight, double length, double width, String name, double price, int quantity) {
        super(name, price, quantity);
        this.weight = weight;
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSnack{" + "weight=" + weight + ", length=" + length + ", width=" + width + '}';
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    
}
