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

	@Override
	public int compareTo(Hand hand) {
        // TODO: Parte 4
        return -1;
	}
}
