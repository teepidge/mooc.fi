
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String stringToSplit = scanner.nextLine();
            String sentence[] = stringToSplit.split(" ");
            
            for (int i = 0; i < sentence.length; i++) {
                System.out.println(sentence[i]);
            }
            if (sentence.length == 1) {
                break;
            }
        }

    }
}
