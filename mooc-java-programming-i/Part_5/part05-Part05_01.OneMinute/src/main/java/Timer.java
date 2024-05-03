import java.time.Clock;

/**
 * Timer
 */
public class Timer {

    private ClockHand hundredOfSecond;
    private ClockHand second;

    public Timer (){
        this.hundredOfSecond = new ClockHand(100);
        this.second = new ClockHand(60);
    }

    public void advance(){
        this.hundredOfSecond.advance();
        if(this.hundredOfSecond.value() == 0){
            this.second.advance();
        }
    }



    public String toString(){
        return second + ":" + hundredOfSecond;
    }
}
