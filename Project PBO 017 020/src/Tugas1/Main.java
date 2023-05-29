/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author isatr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    private static double luas, keliling, volumetabung, permukaantabung, volumebola, permukaanbola, volumekerucut, permukaankerucut;
    
    public static void main(String[] args) {
        // TODO code application logic here
        double tinggi = 2, jari;

        int numberOfThreads = 4;
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
        
        for (int i = 0; i < 200; i++) {
            Kerucut kerucut = new Kerucut(i+1, tinggi);
            executor.execute(kerucut);
        }
        for (int i = 0; i < 1000; i++) {
            Bola bola = new Bola(i+1);
            executor.execute(bola);

        }
        

        
        

    }
}
