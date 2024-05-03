import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int sumOfWeights = 0;
        for (Item itemToIterate : items) {
            sumOfWeights += itemToIterate.getWeight();
        }
        if (sumOfWeights + item.getWeight() <= this.maxWeight) {
            items.add(item);
        }
    }

    public String toString() {
        int sumOfWeights = 0;
        int numberOfItems = 0;
        for (Item item : items) {
            sumOfWeights += item.getWeight();
            numberOfItems++;
        }
        if (numberOfItems == 0) {
            return "no items (0 kg)";
        } else if (numberOfItems == 1) {
            return "1 item (" + sumOfWeights + " kg)";
        } else {
            return numberOfItems + " items (" + sumOfWeights + " kg)";
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + "(" + item.getWeight() + " kg) \n");
        }
    }

    public int totalWeight() {
        int sumOfWeights = 0;
        for (Item item : items) {
            sumOfWeights += item.getWeight();
        }
        return sumOfWeights;

    }

    public Item heaviestItem() {
        Item heaviestItem = null;
        for (Item item : items) {
            if (heaviestItem == null) {
                heaviestItem = item;
            } else if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }

        }
        return heaviestItem;
    }

}
