/**
 * ProductWarehouseWithHistory
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);
        super.setBalance(initialBalance);

    }
    public String history(){
        return changeHistory.toString();
    }

    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        changeHistory.add(super.getBalance());
    }
    public double takeFromWarehouse(double amount){
         double amountFromWarehouse = super.takeFromWarehouse(amount);
        changeHistory.add(super.getBalance());
        return amountFromWarehouse;
    }
    public void printAnalysis(){
        System.out.println("Product: " + super.getName() + "\nHistory: " + history() + "\n Largest amount of product: " + this.changeHistory.maxValue() + "\n Smallest amount of product: " + this.changeHistory.minValue() + "Average: " + this.changeHistory.average());

    }

            //     Product: Juice
            // History: [1000.0, 988.7, 989.7]
            // Largest amount of product: 1000.0
            // Smallest amount of product: 988.7
            // Average: 992.8
}
