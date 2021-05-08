
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        
        //read file
        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                //store line
                String line = file.nextLine();
                //split line by comma (.csv file) and store in array
                //data is: 0. name 1. age
                String[] data = line.split(",");
                
                //format correctly for age not equal to 1
                String plural = " year";
                if (Integer.valueOf(data[1]) != 1) {
                    plural = " years";
                }
                
                //output name, age as statement
                System.out.println(data[0] + ", age: " + data[1] + plural);
            }
        } catch (Exception e) {

        }
        
    }
}
