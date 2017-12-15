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

/**
 *
 * @author jamesray
 */
public class Chips extends Snack{
    private String flavor;

    public Chips() {
        super();
    }

    public Chips(String flavor, double weight, double length, double width, String name, double price, int quantity) {
        super(weight, length, width, name, price, quantity);
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return super.toString()+"\nChips{" + "flavor=" + flavor + '}';
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
