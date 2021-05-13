
public class MainProgram {

    public static void main(String[] args) {
        Money myMoney = new Money(0, 01);
        Money myMoney2 = new Money(10, 50);
        Money sum = myMoney2.minus(myMoney);
        System.out.println(sum);
    }
}
