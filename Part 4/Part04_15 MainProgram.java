
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics statistics = new Statistics();
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Average: " + statistics.average());
//        

        Statistics statsEven = new Statistics();
        Statistics statsOdd = new Statistics();
        System.out.println("Enter numbers:");

        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == -1) {
                break;
            }
                statistics.addNumber(userInput);
            if (userInput % 2 == 0) {
                statsEven.addNumber(userInput);
            } else {
                statsOdd.addNumber(userInput);
            }
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statsEven.sum());
        System.out.println("Sum of odd numbers: " + statsOdd.sum());
    }
}
