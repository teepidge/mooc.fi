
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;
        
        System.out.println("Give numbers:");
        
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num == -1){
                break;
            }
            
            if(num != 0 && num % 2 == 0){
                even++;
                sum+=num;
                count++;
            }
            if (num !=0 && num % 2 != 0) {
                odd++;
                sum+=num;
                count++;
            }
            
        }
        
        avg = (double) sum / count;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
