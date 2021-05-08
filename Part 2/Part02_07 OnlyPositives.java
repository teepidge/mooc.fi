
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            //exit loop condition
            if (num == 0) {
                break;
            }
            
            //return to start of loop
            if (num < 0) { 
                System.out.println("Unsuitable number");
                continue;
            }
            //if all conditions pass, print cube
            System.out.println(num * num);
        }
    }
}
