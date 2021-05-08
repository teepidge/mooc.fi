
import java.util.Arrays;


public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
        System.out.println(Arrays.toString(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        // Write some code here
        int sum = 0;
        int[] arrayCopy = new int[array.length]; //create a copy of the array to prevent modifying original
        
        for (int i = 0; i < array.length; i++) {
            sum += arrayCopy[i];
        }
        arrayCopy[0] = 22;
        return sum;
    }
}
