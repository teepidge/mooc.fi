
public class Main {

    public static void main(String[] args) {

        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        Person person1 = new Person("Leevi", date, 62, 9);
        Person person2 = new Person("Leevi", date, 62, 9);
//        System.out.println(person1.toString() + person1.getHeight() + person1.getName() + person1.getWeight());
//        System.out.println(person2.toString() + person2.getHeight() + person2.getName() + person2.getWeight());
//        
//        System.out.println(person1.equals(person2));
        
        if (person1.equals(person2)) {
            System.out.println("Is this quite correct?");
        } 
        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);

        if (person1.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");
        }
    }
}
