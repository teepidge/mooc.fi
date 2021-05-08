
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("First Name: ");
            String fName = scanner.nextLine();

            //check for empty first name condition to break while loop
            if (fName.isEmpty()) {
                break;
            }

            System.out.println("Last Name: ");
            String lName = scanner.nextLine();
            System.out.println("Identification Number: ");
            String id = scanner.nextLine();

            //instantiate new PersonalInformation object with inputs and add it to collection
            infoCollection.add(new PersonalInformation(fName, lName, id));
            
        }
        //loop through arraylist
        for (PersonalInformation persInfo : infoCollection) {
            System.out.println(persInfo.getFirstName() + " " + persInfo.getLastName());
        }
    }
}
