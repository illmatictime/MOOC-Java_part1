
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares){
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared){
        int apartmentA = this.squares * this.pricePerSquare;
        int apartmentB = compared.squares * compared.pricePerSquare;
        if(apartmentA >= apartmentB){
            return apartmentA - apartmentB;
        }else{
            return apartmentB - apartmentA;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int apartmentA = this.squares * this.pricePerSquare;
        int apartmentB = compared.squares * compared.pricePerSquare;
        
        if(apartmentA > apartmentB){
            return true;
        }else{
            return false;
        }
    }
}
