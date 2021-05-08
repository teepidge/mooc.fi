
public class Statistics {
    private int count;
    private int sum;
   
    
    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;
        this.sum = 0;
        
    }

    public void addNumber(int number) {
        // write code here
        this.count++;       //add number to count
        this.sum += number; //add number to sum
    }

    public int getCount() {
        // write code here
        return this.count;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        if (this.count == 0) {
            return 0.0;
        } else {
            return 1.0 * this.sum / this.count;
        }
    }
}
