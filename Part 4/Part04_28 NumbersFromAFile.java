
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //get file to read
        System.out.print("File? ");
        String file = scanner.nextLine();
        

        //get lower bound to check
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        
        //get upper bound to check
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int foundCount = 0; //counter for number of found instances
        
        try ( Scanner openFile = new Scanner(Paths.get(file))) {
            while (openFile.hasNextLine()) {
                //store next line in a variable.
                //since nextLine() is a method, each time it's called it will increment through the file
                //therefore, must call only once and store it as a variable
                int checkValue = Integer.valueOf(openFile.nextLine()); 

                //if value falls within range, increment counter
                if (checkValue >= lowerBound && checkValue <= upperBound) {
                    foundCount++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Numbers: " + foundCount);
    }

}
