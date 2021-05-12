
public class Fitbyte {
    private int age;
    private int restingHeartRate;
//    private double maximumHeartRate;
    
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
//        this.maximumHeartRate = ;
    }
    
    public double targetHeartRate(double percentageOfMaximum) { 
        return (((206.3 - (0.711 * this.age)) - this.restingHeartRate) * (percentageOfMaximum) + this.restingHeartRate);
    }
    
}
