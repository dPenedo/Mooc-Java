import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> itemsMap;

    public ShoppingCart() {
        this.itemsMap = new HashMap<>();
    }

    public void add(String product, int price) {
        if (itemsMap.containsKey(product)) {
           itemsMap.get(product).increaseQuantity();
        } else {
        Item itemToAdd = new Item(product, 1, price);
        itemsMap.put(product, itemToAdd);
        }

    }
    public int price(){
        int sumOfItems = 0;

        for (Item item : itemsMap.values()) {
            sumOfItems+=item.price();
        }
        return sumOfItems;
    }
    public void print(){
        for (Item itemToPrint : itemsMap.values()) {
            System.out.println(itemToPrint);
        }
    }

}
