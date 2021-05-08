
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isFound = true;
        while (isFound) {

            String stringToSplit = scanner.nextLine();
            String[] pieces = stringToSplit.split(" ");

            //print if 'av' is found
            //track the number of times found to break loop if needed
            if (stringToSplit.equals("")) {
                break;
            }

            for (String word : pieces) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }

        }

    }
}
