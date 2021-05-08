
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account MatthewsAccount = new Account("Matthews account", 1000.0);
        Account myAccount = new Account("My account", 0.0);
        
        double amount = 100;
        MatthewsAccount.withdrawal(amount);
        myAccount.deposit(amount);
        
        System.out.println(MatthewsAccount);
        System.out.println(myAccount);
        
    }
}
