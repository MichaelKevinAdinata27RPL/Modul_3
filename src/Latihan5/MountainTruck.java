/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author HP
 */
public class MountainTruck extends Truck {

    //the mountaintruck subclass adds 1 field
    public int seatHeight;
    //mountaintruck subclass has 1 contrustor

    public MountainTruck(int startHeight, int startCadence, int startGear, int startSpeed) {
        super(startCadence, startGear, startSpeed);
        seatHeight = startHeight;
    }
    
    //mountaintrus has one method

    public void setSeatHeight(int newValue) {
        seatHeight = newValue;
    }
    
    
    public static void main(String[] args) {
        System.out.println("Mulai Berjalan");
        MountainTruck MB = new MountainTruck(0,0,0,0);
        System.out.println("Gear = " + MB.gear);
        System.out.println("Speed = " + MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("Gear = " + MB.gear);
        System.out.println("Speed = " + MB.speed);
        MB.speedUp(2);
        System.out.println("Gear = " + MB.gear);
        System.out.println("Speed = " + MB.speed);
    }

}
