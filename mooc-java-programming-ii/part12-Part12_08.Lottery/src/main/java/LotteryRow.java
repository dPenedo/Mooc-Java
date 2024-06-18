
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
	private Random random;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
		this.random = new Random();
        this.randomizeNumbers();
		
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
		if (this.numbers.contains(number)) {
			return true;
			
		}
        return false;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
		for (int i = 0; i < 7; i++) {
			while (true) {
			int randomNumber = random.nextInt(40) + 1;
				if (!this.containsNumber(randomNumber)) {
				numbers.add(randomNumber);
				break;
				}
			}
			
		}
        // Implement the random number generation here
        // the method containsNumber is probably useful
    }

}
