/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author isatr
 */
public class Lingkaran implements MenghitungBidang{
    
    private double jari, keliling, luas;
    
    @Override
    public void hitungluas(){
        try {
            luas = (3.14159265358979323846*jari*jari);
        } catch (Exception ex) {
            System.out.println("Error");
            System.out.println(ex.getMessage());
        }
    }
    

    
    @Override
    public void hitungkeliling(){
        try {
            keliling =  3.14159265358979323846*jari*2;
        } catch (Exception ex) {
            System.out.println("Error");
            System.out.println(ex.getMessage());
        }
    }

    public double getJari() {
        return this.jari;
    }

    public double getKeliling() {
        return this.keliling;
    }

    public double getLuas() {
        return this.luas;
    }
    
    public void setJari(double jari) {
        this.jari = jari;
    }

//    public double hitungkeliling(double diameter){
//        return 3.14159265358979323846*diameter;
//    }
}
