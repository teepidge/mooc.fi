
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public int getSquares() {
        return this.squares;
    }
    
    public boolean largerThan(Apartment compared){
        if (this.squares > compared.getSquares()) {
            return true;
        }
        return false;
    }
    
    public int getpricePerSquare() {
        return this.pricePerSquare;
    }
    public int priceDifference(Apartment compared) {
        return Math.abs(this.squares * this.pricePerSquare - compared.getSquares() * compared.getpricePerSquare());
    }
    public boolean moreExpensiveThan(Apartment compared) {
        if(this.squares * this.pricePerSquare > compared.getSquares() * compared.getpricePerSquare()) {
            return true;
        }
        return false;
    }
}
