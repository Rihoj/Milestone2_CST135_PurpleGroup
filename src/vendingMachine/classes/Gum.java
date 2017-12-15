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
public class Gum extends Snack {

    private String flavor;
    private String type;
    private int pieces;

    public Gum() {
        super();
    }

    public Gum(String flavor, String type, int pieces, double weight, double length, double width, String name, double price, int quantity) {
        super(weight, length, width, name, price, quantity);
        this.flavor = flavor;
        this.type = type;
        this.pieces = pieces;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGum{" + "flavor=" + flavor + ", type=" + type + ", pieces=" + pieces + '}';
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

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

}
