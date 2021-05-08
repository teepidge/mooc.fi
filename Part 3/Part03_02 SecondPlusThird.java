
import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {
// Prompts for user input
//Sums the 2nd and 3rd element and prints to console

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        //loop until user enters 0
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            // add number to arraylist
            numbers.add(number);
        }
        //print sum of 2nd and 3rd element to console
        System.out.println(numbers.get(1) + numbers.get(2));
        
    }
}
