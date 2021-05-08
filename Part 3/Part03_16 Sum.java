
import java.util.ArrayList;

public class Sum {
    
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum +=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 5; i+=1){
            list.add(i);
        }
        System.out.println(list);
        System.out.println(sum(list));
    }

}
