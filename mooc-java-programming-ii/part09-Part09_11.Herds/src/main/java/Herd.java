import java.util.ArrayList;

/**
 * Herd
 */
public class Herd implements Movable {
    private ArrayList<Movable> organisms;

    public Herd() {
        this.organisms = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        organisms.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : organisms) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String toStringText = "";
        for (Movable movable : organisms) {
            toStringText += movable.toString();
            toStringText += "\n";
        }
        return toStringText;
    }

}
