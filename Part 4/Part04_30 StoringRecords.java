
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        //call method to add records to an ArrayList
        ArrayList<Person> records = readRecordsFromFile(file);

        //output size of records list
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");

        //output people in the records ArrayList
        //uses the toString @override
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {

        //create an ArrayList that matches the calling statement (i.e. <person>)
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
        try ( Scanner openFile = new Scanner(Paths.get(file))) {
            //read file lines
            while (openFile.hasNextLine()) {
                //store current line
                String line = openFile.nextLine();
                //split current line 
                String[] parts = line.split(",");
                
                //store part 1 as name
                String name = parts[0];
                //store part 2 as age
                int age = Integer.valueOf(parts[1]);
                
                //create new person and add to arraylist using name and age params
                persons.add(new Person(name, age));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        //return person object list back to main
        return persons;

    }
}
