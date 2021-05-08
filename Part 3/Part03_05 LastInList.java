
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        ArrayList<String> list = new ArrayList<>();
//        while (true) {
//            String input = scanner.nextLine();
//            if (input.equals("")) {
//                break;
//            }
//
//            list.add(input);
//        }


        ArrayList<String> stringList = new ArrayList<>();
        while (true) { 
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            stringList.add(input);
            
        }
        
        //run through all items in the list first to last
//        for(int i = 0; i < stringList.size(); i++) {
//            System.out.println(stringList.get(i));
//        }
        
        //loop last to first
        
//        for(int i = stringList.size()-1; i >= 0; i-=1) {
//            System.out.println(stringList.get(i));
//        }


        //get last in list
        
        
        System.out.println(stringList.get(stringList.size()-1));
        
        
    }
}
