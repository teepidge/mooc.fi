
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) { 
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            //# of stars equal to loop
            //# of spaces equal to size - loop
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        int countOfStars = 1;  //how many stars to print
        for (int i = 1; i <= height; i++){
            printSpaces(height - i);  //spaces is equal to height minus loop counter
            printStars(countOfStars); //countOfStars starts at 1 and increments +2
            countOfStars+=2;
        }
        //print base - always half the size of the tree minus 2.
        printSpaces(countOfStars / 2 - 2);
        printStars(3);
        //print twice for two rows of the base
        printSpaces(countOfStars / 2 - 2);
        printStars(3);
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

//        printTriangle(5);
//        System.out.println("---");
        christmasTree(7);
        System.out.println("---");
//        christmasTree(10);
    }
}
