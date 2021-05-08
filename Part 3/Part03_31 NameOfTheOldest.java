
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = "";
        
        while (true) {
            //Get user input
            String input = scanner.nextLine();
            //break if user enters nothing
            if (input.equals("")) {
                break;
            }

            String pieces[] = input.split(",");
            if (Integer.valueOf(pieces[1]) > oldest) {
                oldest = Integer.valueOf(pieces[1]);
                oldestName = pieces[0];
            }

        }

        System.out.println("Name of the oldest: " + oldestName);

    }
}
