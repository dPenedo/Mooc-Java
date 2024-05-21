import java.util.Scanner;

/**
 * Store
 */
public class Store {
   private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner){
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    public void shop(String customer){
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");
        for (String product : this.warehouse.products()) {
            System.out.println(product);
        }
        while (true) {
            System.out.println("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();
            if (product.isEmpty()) {
                break;
            }

            if (warehouse.products().contains(product)) {
                warehouse.take(product);
                cart.add(product, warehouse.price(product));

            }
             // Add code here that adds the product to the cart,
            // If there is any in the warehouse, and reduces the stock in the warehouse
            // Don't touch any of the other code!
        }
        System.out.println("your shoppingcart contents:");
        cart.print();
        System.out.println("total: " + cart.price());
    }



}
