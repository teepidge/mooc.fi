
public class Timer {
    private ClockHand hundredthsHand;
    private ClockHand secondsHand;
    
    
    public Timer() {
        this.hundredthsHand = new ClockHand(100);
        this.secondsHand = new ClockHand(60);
        
    }
    
    public void advance() {
        //value == 1
        this.hundredthsHand.advance();
        //value == 2 now.
        
        //advance seconds if value of 100 is reached
        if (this.hundredthsHand.value() == 0) {
            this.secondsHand.advance();
        }
        
    }
    
    @Override
    public String toString() {
        //only need to call the object because toString is overridden
        //will already add the extra 0 at the front
        return secondsHand + ":" + hundredthsHand;
    }
}
