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
public class Bola extends Lingkaran implements MenghitungRuang, Runnable{
    
    private double volume, permukaan, jari2;

    public Bola(double jari2) {
        this.jari2 = jari2;
    }
    
    @Override
    public void hitungvolume(){
        try {
            volume = getLuas()*getKeliling()*2/(3.14159265358979323846*3);
        } catch (Exception ex) {
            System.out.println("Error");
            System.out.println(ex.getMessage());
        }
    }
    
    public double getVolumeBola(){
        return this.volume;
    }
    
    @Override
    public void hitungpermukaan(){
        try {
            permukaan = (4*getLuas());
        } catch (Exception ex) {
            System.out.println("Error");
            System.out.println(ex.getMessage());
        }
    }
    
    @Override
    public void run(){
        setJari(jari2);
        hitungluas();
        hitungkeliling();
        hitungvolume();
        hitungpermukaan();
        InsertFile insertfile = new InsertFile();
        insertfile.InsertFile(jari2, getVolumeBola(), getPermukaanBola());
        

    }
    
    public double getPermukaanBola(){
        return this.permukaan;
    }
    
}
