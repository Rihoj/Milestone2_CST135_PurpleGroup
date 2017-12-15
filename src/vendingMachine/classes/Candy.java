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

public class Candy extends Snack{
    private String flavor;
    private String type;

    public Candy() {
        super();
    }

    public Candy(String flavor, String type, double weight, double length, double width, String name, double price, int quantity) {
        super(weight, length, width, name, price, quantity);
        this.flavor = flavor;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCandy{" + "flavor=" + flavor + ", type=" + type + '}';
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
