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
public class Kerucut extends Tabung implements MenghitungRuang, Runnable{
    
     private double volume1, permukaan, s, t;

     private double jari2, tinggi2;

    public Kerucut(double jari2, double tinggi2) {
        this.jari2 = jari2;
        this.tinggi2 = tinggi2;
    }
     
    
    //@Override
    public void hitungvolumeker(){
        try {
            volume1 = getVolumeTabung()/3;
        } catch (Exception ex) {
            System.out.println("Error");
            System.out.println(ex.getMessage());
        }
    }
    
    public double getVolumeKerucut(){
        return this.volume1;
    }
    
    
    //@Override
    public void hitungpermukaanker(){
        try {
            t = getVolumeTabung()/getLuas();
            s = Math.sqrt(((getLuas()/3.14159265358979323846)+(t*t)));
            permukaan = ((getKeliling()/2)*s)+getLuas();
        } catch (Exception ex) {
            System.out.println("Error");
            System.out.println(ex.getMessage());
        }
    }
    
    @Override
    public void run() {
        setJari(jari2);
        setTinggi(tinggi2);
        hitungluas();
        hitungkeliling();
        hitungvolume();
        hitungpermukaan();
        hitungvolumeker();
        hitungpermukaanker();
        InsertDB insertdb = new InsertDB();
        insertdb.InsertDB(jari2, tinggi2, getLuas(), getKeliling(), getVolumeTabung(), getPermukaanTabung(), getVolumeKerucut(), getPermukaanKerucut());
    }
    
    public double getPermukaanKerucut(){
        return this.permukaan;
    }
    
}
