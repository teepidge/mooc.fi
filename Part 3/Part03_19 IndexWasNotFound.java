
import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //note that it was an array with 10 elements
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());
        int foundIndex = 0;
        boolean isFound = false;
        
        //loop to search for item in array and store index position if found
        //exit the loop once found. 
        //note that this will only find the first instance from starting pos of the array
        
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == searching) {
                isFound = true;
                foundIndex = i;
                break;
            }
        }
        
        
        if (isFound) {
            System.out.println(searching + " is at index " + foundIndex + ".");

        } else {
            System.out.println(searching + " was not found.");
        }
    }

}
