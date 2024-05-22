import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Warehouse
 */
public class Warehouse {

    private Map<String, Integer> productsInWarehouse;
    private Map<String, Integer> stockBalance;

    public Warehouse() {
        this.productsInWarehouse = new HashMap<>();
        this.stockBalance = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productsInWarehouse.put(product, price);
        this.stockBalance.put(product, stock);

    }

    public int price(String product) {
        if (this.productsInWarehouse.get(product) != null) {
            return this.productsInWarehouse.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.stockBalance.get(product) != null) {
            return this.stockBalance.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        Integer currentStock = this.stockBalance.get(product);
        if (currentStock != null && currentStock > 0) {
            int newValue = this.stockBalance.get(product) - 1;
            stockBalance.replace(product, newValue);
            return true;
        }
        return false;
    }

    public Set<String> products(){
        Set<String> setOfProducts = productsInWarehouse.keySet();


        return setOfProducts;
        }
}
