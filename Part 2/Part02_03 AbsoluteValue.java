
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());
        int result = 0;
        if (input < 0){
            result = input * -1;
            
        } else { 
            result = input;
            
        }
        System.out.println(result);
    }
}
