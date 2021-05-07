
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give speed:");

        int speed = Integer.valueOf(scanner.nextLine());
        int SPEED_LIMIT = 120;
        if (speed > SPEED_LIMIT) {
            System.out.println("Speeding ticket");
        }

    }
}
