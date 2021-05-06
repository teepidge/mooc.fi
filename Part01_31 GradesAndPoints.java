
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int gradeImpossible = 0;
        int gradeFailed = 49;
        int grade1 = 59;
        int grade2 = 69;
        int grade3 = 79;
        int grade4 = 89;
        int grade5 = 100;

        System.out.println("Give points [0-100]:");
        int input = Integer.valueOf(scan.nextLine());

        if (input < gradeImpossible) {
            System.out.println("impossible!");
        } else if (input <= gradeFailed) {
            System.out.println("failed");
        } else if (input <= grade1) {
            System.out.println("1");
        } else if (input <= grade2) {
            System.out.println("2");
        } else if (input <= grade3) {
            System.out.println("3");
        } else if (input <= grade4) {
            System.out.println("4");
        } else if (input <= grade5) {
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        }

    }
}
