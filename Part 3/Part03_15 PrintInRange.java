
import java.util.ArrayList;

public class PrintInRange {

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
//        System.out.println("The numbers in the range [" +  + "]" + "[" +  + "]");
        System.out.println(String.format("The numbers in the range [%d,%d]",lowerLimit,upperLimit));
        for (int i : numbers) { 
            if (i >= lowerLimit && i <= upperLimit)
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
//        
//        
//        for (int i = 0; i <= 20; i+=3) {
//            list.add(i);
//        }
//        
//        printNumbersInRange(list, 6, 14);
    }

}
