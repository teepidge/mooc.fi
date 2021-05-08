
import java.util.ArrayList;
import java.util.Scanner;


//this one had an error in the instructions - it didn't allow for "any name" to be printed, even though there were names in the test that were same length
public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfBirthYears = 0;
        double avgOfBirthYears = 0.0;
        int longestName = 0;
        String longest = "";
        int count = 0;
        while (true) {
            //Get user input
            String input = scanner.nextLine();
            //break if user enters nothing
            if (input.equals("")) {
                break;
            }

            String pieces[] = input.split(",");
            sumOfBirthYears += Integer.valueOf(pieces[1]);

            //determine if current input is longest name and reassign accordingly
            if (pieces[0].length() > longestName) {
                longestName = pieces[0].length();  //reassign length for next iteration
                longest = pieces[0];  //reassign name in case this is to be printed
            }
            count++;
            avgOfBirthYears = (double) sumOfBirthYears / count;
        }

        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + avgOfBirthYears);

    }
}
