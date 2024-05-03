import java.security.SignedObject;
import java.util.ArrayList;

/**
 * Hold
 */
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int sumOfWeights = 0;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (sumOfWeights + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
            sumOfWeights += suitcase.totalWeight();
        }
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.sumOfWeights + " kg)";
    }

    public void printItems(){
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();

        }
    }

}
