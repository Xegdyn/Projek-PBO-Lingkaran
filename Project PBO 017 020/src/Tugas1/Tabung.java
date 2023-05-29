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
public class Tabung extends Lingkaran implements MenghitungRuang{
    
    private double tinggi, volume, permukaan;
    
    @Override
    public void hitungvolume(){
        try {
            volume = getLuas()*tinggi;
        } catch (Exception ex) {
            System.out.println("Error");
            System.out.println(ex.getMessage());
        }
    }
    
    public double getVolumeTabung(){
        return this.volume;
    }
    
    @Override
    public void hitungpermukaan(){
        try {
            permukaan = (2*getLuas()+getKeliling()*tinggi);
        } catch (Exception ex) {
            System.out.println("Error");
            System.out.println(ex.getMessage());
        }
    }
    
    public double getPermukaanTabung(){
        return this.permukaan;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
