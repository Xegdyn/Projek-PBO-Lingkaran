/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author isatr
 */
public class InsertFile {
    
//    private double jari, tinggi, luas, keliling, volumetabung, permukaantabung, volumebola, permukaanbola, volumekerucut, permukaankerucut;

//    public InsertFile(double jari, double tinggi, double luas, double keliling, double volumetabung, double permukaantabung, double volumebola, double permukaanbola, double volumekerucut, double permukaankerucut) {
//        this.jari = jari;
//        this.tinggi = tinggi;
//        this.luas = luas;
//        this.keliling = keliling;
//        this.volumetabung = volumetabung;
//        this.permukaantabung = permukaantabung;
//        this.volumebola = volumebola;
//        this.permukaanbola = permukaanbola;
//        this.volumekerucut = volumekerucut;
//        this.permukaankerucut = permukaankerucut;
//    }



    
    
    public void InsertFile(double jari, double volumebola, double permukaanbola){
    try {
            RandomAccessFile file = new RandomAccessFile("data.txt", "rw");
            
            file.seek(file.length());
            
            file.writeChars("Jari - Jari \t\t\t= "+jari);
            file.writeChars("\n\nVolume Bola \t\t\t= "+volumebola);
            file.writeChars("\n\nLuas Permukaan Bola \t= "+permukaanbola);
            file.writeChars("\n\n\n");

            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
