
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //create array list to gather integers
        ArrayList<Integer> list = new ArrayList<>();
        
        //main loop
        while (true) {
            //get user input
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            //add to array list
            list.add(input);
        }
        
        System.out.println("Search for?");
        
        //value used to search in list
        int search = Integer.valueOf(scanner.nextLine());
        
        //check if in list, print out the indices
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == search) {
                System.out.println(search + " is at index " + i);
            }
        }
    }
}
