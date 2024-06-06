import java.util.Comparator;
import java.util.ArrayList;

/**
 * BySuitInValueOrder
 */
public class BySuitInValueOrder implements Comparator<Card> {


    public BySuitInValueOrder(){
    }






	@Override
	public int compare(Card c1, Card c2) {
        int suitComparision = c1.getSuit().ordinal() - c2.getSuit().ordinal();

        if (suitComparision == 0) {
            return c1.getValue() - c2.getValue();
        }

        return suitComparision;

	}








}
