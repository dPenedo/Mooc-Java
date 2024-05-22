import java.util.ArrayList;

/**
 * Box
 */
public class Box implements Packable{

    private double maxTotalWeight;
    private int numOfItems;
    private  ArrayList<Packable> items;

    public Box(double maxTotalWeight) {
        this.maxTotalWeight = maxTotalWeight;
        this.items = new ArrayList<>();
        this.numOfItems = 0;
    }

    public void add(Packable item){
        if (weight() + item.weight() < maxTotalWeight) {
            items.add(item);
            numOfItems++;
        }
    }

    public double weight(){
        double weight = 0;
        for (Packable packable : items) {
            weight+=packable.weight();
        }
        return weight;
    }

    @Override
    public String toString(){
        return "Box: " + numOfItems + " items, total weight " + this.weight() + " kg";
    }


}
