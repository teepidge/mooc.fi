
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if ("".equals(identifier)) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if ("".equals(name)) {
                break;
            }

            Boolean isDuplicate = false;
            if (!("".equals(name)) && !("".equals(identifier))) {
                Item item = new Item(identifier, name);
                for (Item i : items) {
                    if (i.equals(item)) {
                        isDuplicate = true;
                    }
                }
                if (!isDuplicate) {
                    items.add(item);
                }
            }
        }

        System.out.println("==Items==");
        for (Item i : items) {
            System.out.println(i);
        }
    }
}
