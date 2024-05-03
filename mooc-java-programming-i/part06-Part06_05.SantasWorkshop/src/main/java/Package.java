import java.util.ArrayList;

/**
 * Package
 */
public class Package {

    private ArrayList<Gift> gifts;
    public Package(){
        this.gifts = new ArrayList<>();
    }
    public void addGift(Gift gift){
        gifts.add(gift);
    }
    public int totalWeight(){
        int totalweight = 0;
        for (Gift gift : gifts) {
            totalweight += gift.getWeight();
        }
        return totalweight;
    }

}
