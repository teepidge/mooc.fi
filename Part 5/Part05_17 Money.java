
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
        } else {
            return this.euros == compared.euros && this.cents < compared.cents;
        }
    }

    
    public Money minus(Money decreaser) {

        int newEuros = this.euros - decreaser.euros;
        int newCents = 0;
        
        if (this.lessThan(decreaser)){
            return new Money(0, 0);
        }
        if (this.cents >= decreaser.cents) {
            newCents = this.cents - decreaser.cents;
        } else {
            newCents = 100 + this.cents - decreaser.cents;
            newEuros-=1;
        }
        
        if (newEuros < 0) {
            newEuros = 0;
        }
        
        return new Money(newEuros, newCents);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
