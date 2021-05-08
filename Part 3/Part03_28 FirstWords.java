
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            //get user input
            String input = scanner.nextLine();
            
            //break condition
            if(input.equals("")){
                break;
            }
            
            String[] pieces = input.split(" ");
            System.out.println(pieces[0]);
            
        }

    }
}
