public class Statistics {
    private int count = 0;
    private int sum = 0;

    public Statistics() {
    }

    public void addNumber(int number) {
        count++;
        sum +=number;
    }

    public int getCount() {
        return count;
    }
    public int sum(){
        return sum;
    }
    public double average(){
        if (count==0) {
            return 0;
        }
        return (double) sum/count;
    }
}
