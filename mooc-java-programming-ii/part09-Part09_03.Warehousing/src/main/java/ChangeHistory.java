import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> previousChanges;

    public ChangeHistory() {
        this.previousChanges = new ArrayList<>();
    }

    public void add(double status) {
        previousChanges.add(status);
    }

    public void clear() {
        previousChanges.clear();
    }

    public String toString() {
        return previousChanges.toString();
    }

    public double maxValue() {
        if (previousChanges.isEmpty()) {
            return 0;
        } else {
            double maxValue = 0;
            for (Double doubletoCompare : previousChanges) {
                if (doubletoCompare >= maxValue) {
                    maxValue = doubletoCompare;
                }
            }
            return maxValue;
        }
    }

    public double minValue() {
        if (previousChanges.isEmpty()) {
            return 0;
        } else {
            double minValue = previousChanges.get(0);
            for (Double doubletoCompare : previousChanges) {
                if (doubletoCompare < minValue) {
                    minValue = doubletoCompare;
                }
            }
            return minValue;
        }
    }

    public double average() {
        int numOfValues = 0;
        int sumOfValues = 0;
        for (Double doubletoAverage : previousChanges) {
            numOfValues++;
            sumOfValues += doubletoAverage;
        }
        double average = (double) sumOfValues / numOfValues;
        return average;

    }
}
