
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int posNumbers = 0;
        double avg = 0;
        int sum = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num > 0) {
                posNumbers++;
                sum = sum + num;
            }

        }
        if (posNumbers != 0) {
            System.out.println((double) sum / posNumbers);
        } else {
            System.out.println("Cannot calculate the average");
            
        }

    }
}
