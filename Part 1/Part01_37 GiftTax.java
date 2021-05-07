
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of gift?");
        
        int value = Integer.valueOf(scan.nextLine());
        double tax = 0.0;
        //100 + (6000-5000)_.08)
        
        int low1 = 5000; int high1 = 25000; double rate1 = 0.08; int tax1 = 100;
        int low2 = 25000; int high2 = 55000; double rate2 = 0.10; int tax2 = 1700;
        int low3 = 55000; int high3 = 200000; double rate3 = 0.12; int tax3 = 4700;
        int low4 = 200000; int high4 = 1000000; double rate4 = 0.15; int tax4 = 22100;
        double rate5 = 0.17; int tax5 = 142100;
        
        if (value < low1) { 
            System.out.println("No tax!");
            
        } else if (value >= low1 && value < high1) {
            tax = (tax1 + (value - low1) * rate1);
        } else if (value >= low2 && value < high2) {
            tax = (tax2 + (value - low2) * rate2);
        } else if (value >= low3 && value < high3) {
            tax = (tax3 + (value - low3) * rate3);
        } else if (value >= low4 && value < high4) {
            tax = (tax4 + (value - low4) * rate4);
        } else {
            tax = (tax5 + (value - high4) * rate5);
        } 
        
        System.out.println("Tax: " + tax);
    }
}
