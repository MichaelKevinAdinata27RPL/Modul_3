package Latihan5;

/**
 *
 * @author HP
 */
public class Truck {
    //the truck has 3 fields
    public int cadence;
    public int gear;
    public int speed;
    
    //konstruktor

    public Truck(int startCadence, int startGear, int startSpeed) {
        cadence = startCadence;
        gear = startGear;
        speed = startSpeed;
    }
    
    //the truck has 4 method

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }
    
    public void applyBrake(int decrement){
        speed = decrement;
    }
    
    public void speedUp(int increment){
        speed = increment;
    }
    
}
