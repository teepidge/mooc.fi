
public class Counter {

    private int counterValue;

    //constructor for creating counter
    public Counter(int startValue) {
        this.counterValue = startValue;
    }

    //constructor for starting the value at 0 if no value supplied
    public Counter() {
        this.counterValue = 0;
    }

    //method to increase value by 1
    public void increase() {
        this.counterValue++;
    }

    //method to increase value by number supplied
    public void increase(int increaseBy) {
        if (!(increaseBy < 0)) {            //do nothing if value supplied is negative
            this.counterValue += increaseBy;
        }
    }

    //method to decrease value by 1
    public void decrease() {
        this.counterValue--;
    }

    //method to decrease value by number supplied
    public void decrease(int decreaseBy) {

        if (!(decreaseBy < 0)) {            //do nothing if value supplied is negative
            this.counterValue -= decreaseBy;
        }
    }

    //return the value of the counter
    public int value() {
        return this.counterValue;
    }

}
