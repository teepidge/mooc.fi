
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int numOfDays = Integer.valueOf(scanner.nextLine());
        int numOfSecs = numOfDays * 24 * 60 * 60;
        System.out.println(numOfSecs);
        
        
        // Write your program here

    }
}
