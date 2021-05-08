
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //file to search
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        //search query
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        boolean isFound = false;  //initial search state
        
        //open file
        try ( Scanner file = new Scanner(Paths.get(fileName))) {
            
            //read until empty line found
            while (file.hasNextLine()) {
                //search through text and break if found.
                if (file.nextLine().equals(searchedFor)) {
                    isFound = true;
                    break;
                }
            }
        } catch (Exception e) {
            //System.out.println("Error: " + e.getMessage());
            System.out.println("Reading the file " + fileName + " failed.");
        }
        //output results
        if (isFound) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }

    }
}
