import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Hand
 */
public class Hand implements Comparable<Hand>{

    private ArrayList<Card> cards;

    public Hand(){
        this.cards = new ArrayList<>();
    }
    public void add (Card card){
        this.cards.add(card);
    }
    public void print(){
        cards.stream()
            .forEach(card -> System.out.println(card));
    }
    public void sort(){
        Collections.sort(cards);
    }

    public void sortBySuit(){
        BySuitInValueOrder bySuitInValueOrder = new BySuitInValueOrder();
        Collections.sort(cards, bySuitInValueOrder);
        cards.stream()
            .forEach(c -> System.out.println(c));
    }

	@Override
	public int compareTo(Hand hand) {
        int thisHandSum = cards.stream()
            .map(card -> card.getValue())
            .mapToInt(num -> Integer.valueOf(num))
            .sum();

        int handToCompare = hand.cards.stream()
            .map(card -> card.getValue())
            .mapToInt(num -> Integer.valueOf(num))
            .sum();
        if (thisHandSum==handToCompare) {
            return 0;
        } else if (thisHandSum>handToCompare){
            return 1;
        } else {
        return -1;
        }

	}
}
