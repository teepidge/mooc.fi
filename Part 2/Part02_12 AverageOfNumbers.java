
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double avg = 0;
        int countOfNums = 0;
        int sum = 0;
        
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0){
                break;
            }
            countOfNums++;
            sum = sum + num;
            
        }
        
        avg = (double) sum / countOfNums;
        System.out.println("Average of the numbers: " + avg);
        
    }
}
