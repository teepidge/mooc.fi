
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        int largest = list.get(0);
        int num = 0;
        for (int i = 0; i <= list.size()-1;i++) {
            num = list.get(i);  //check if current index is larger
            if (num > largest){
                largest = num;  //update largest if current index is larger
            }
            
        }
        System.out.println("The largest number: " + largest);
    }
}
