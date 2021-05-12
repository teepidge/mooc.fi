
public class MainProgram {

    public static void main(String[] args) {
        Money myMoney = new Money(10, 5);
        Money myMoney2 = new Money(10, 0);
        Money sum = myMoney.plus(myMoney2);
        System.out.println(sum);
    }
}
