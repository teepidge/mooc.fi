
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();

        //keep adding user input to arraylist
        while (true) {
            //ask user for input
            int input = Integer.valueOf(scanner.nextLine());
            //break out of user input
            if (input == 9999) {
                break;
            }
            //add to arraylist
            list.add(input);
        }

        int index;
        int smallest = list.get(0);
        //loop through list to find smallest 
        for (int i = 0; i < list.size(); i++) {
            // check if smaller than current smallest
            if (list.get(i) < smallest) {
                smallest = list.get(i);
//                index = i;
            }

        }
        System.out.println("Smallest number: " + smallest);
        //print out number and its index
            
        for (int i = 0; i < list.size(); i++) {
            if (smallest == list.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
