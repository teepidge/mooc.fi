
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            // if empty string provided
            if (input.equals("")) {
                break;
            }

            //split phrase and store in array
            String[] pieces = input.split(" ");
            System.out.println(pieces[pieces.length - 1]);

        }

    }
}
