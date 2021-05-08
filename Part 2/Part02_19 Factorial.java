
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Give a number:");
        int end = Integer.valueOf(scanner.nextLine());
        
        for (int i = 1; i < end; i++) {
            System.out.println("factorial" + " += " + factorial + " + " + factorial + "*" + i);
            factorial += factorial * i;
        }
        
        System.out.println("Factorial: " + factorial);
        
        factorial = 1;
        for (int i = 1; i <= end; i++) {
            System.out.println("factorial = " + factorial + "*" + i);
            factorial = factorial * i;
        }
        
    }
}
