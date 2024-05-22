import java.util.ArrayList;

/**
 * BoxWithMaxWeight
 */
public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item){
        int sumOfItems = 0;
        for (Item itemStored : items) {
            sumOfItems += itemStored.getWeight();
        }
        if (sumOfItems+item.getWeight() <= capacity) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item){
        for (Item itemStored : items) {
            if (itemStored.getName().equals(item.getName())) {
                return true;
            }
        }
        return false;
    }
}
