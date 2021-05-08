
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication Year:");
            int pubYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pubYear, pages));
            
        }
        
        System.out.println("What information will be printed?");
        String printWhat = scanner.nextLine();
        for (Book book : books) {
            if (printWhat.equals("everything")) {
                System.out.println(book);
            } else if (printWhat.equals("name")) {
                System.out.println(book.getName());
                
            } else {
                System.out.println("Incorrect selection!");
            }
        }
    }
}
