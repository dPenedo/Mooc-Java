/**
 * Item
 */
public class Item {

    private String productName;
    private int quantity;
    private int unitPrice;

    public Item(String productName, int qty, int unitPrice){
        this.productName = productName;
        this.quantity = qty;
        this.unitPrice = unitPrice;
    }
    public int price(){
        return this.quantity * this.unitPrice;
    }
    public void increaseQuantity(){
        this.quantity+=1;
    }
    @Override
    public String toString(){
        return this.productName + ": " + this.quantity;
    }
}
