
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        boolean isLess = false;
        
        if (this.euros < compared.euros) {
            return true;
        } else return this.euros == compared.euros && this.cents < compared.cents;    
    }
    
    public Money minus(Money decreaser) {
        int newEuros = decreaser.euros;
        int newCents = decreaser.cents;
        
        
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
    
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
