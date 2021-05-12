
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
    public void advance() {
        addDay();
    }
    public void advance(int howManyDays) {
        for (int i = 0; i < howManyDays; i++) {
            addDay();
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }
    
    private void addDay() {
        if (day != 30) {
            day++;
        } else {
            day = 1;
            addMonth();
        }
    }
    
    private void addMonth() {
        if (month != 12) {
            month++;
        } else {
            month = 1;
            addYear();
        }
                
    }
    
    private void addYear() {
        year++;
    }
    
    
    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
