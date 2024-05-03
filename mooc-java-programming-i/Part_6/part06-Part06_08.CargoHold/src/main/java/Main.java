
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!

         Item book = new Item("Lord of the rings", 8);
        Item phone = new Item("Nokia 3210", 6);
        Item brick = new Item("brick", 4);
        Item bricke = new Item("bricke", 4);

        Suitcase suitcase = new Suitcase(20);
        suitcase.addItem(book);
        suitcase.addItem(phone);
        suitcase.addItem(brick);
        suitcase.addItem(bricke);

        System.out.println("The suitcase contains the following items:");
        suitcase.printItems();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");
    }

}
