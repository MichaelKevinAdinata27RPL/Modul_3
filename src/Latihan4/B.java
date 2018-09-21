/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author HP
 */
public class B extends A{
    private int b;

    public void setB(int nilai) {
        b = nilai;
    }

    public int getB() {
        return b;
    }
    
    //melakukan overidde terhadap method tampilkanNilai() yang tedapat pada class A
    
    public void tampilkanNilai(){
        super.tampilkanNilai();
        System.out.println("Nilai a = " + getB());
    }
    
    
}
