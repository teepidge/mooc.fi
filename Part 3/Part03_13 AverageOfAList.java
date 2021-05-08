
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //define and implement new integer list
        ArrayList<Integer> list = new ArrayList<>();
        //take user input
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            //break the loop
            if (input == -1){
                break;
            }
            //add to the list
            list.add(input);
            
        }
        int sum = 0;
        //use the for-each construction
        for (int number : list){
            sum += number;
        }

        //make sure to cast it as a double
        System.out.println("Average: " + 1.0* sum / list.size());
        
    }
}
