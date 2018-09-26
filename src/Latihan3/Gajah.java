/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author HP
 */
public class Gajah extends Hewan {

    public static void testClassMethod() {
        System.out.println("The class method in hewan...");
    }

    //meng-overidde method pada class hewan
    public static void testInstanceMethod() {
        System.out.println("The instance Method in Hewan...");
    }

    public static void main(String[] args) {
        Gajah myGajah = new Gajah();
        Hewan myHewan = new Gajah();
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }

}
