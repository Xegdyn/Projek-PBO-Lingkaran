/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import com.mysql.cj.xdevapi.Statement;
import java.sql.SQLException;

/**
 *
 * @author isatr
 */
public class InsertDB {
    
//    private double jari, tinggi, luas, keliling, volumetabung, permukaantabung, volumebola, permukaanbola, volumekerucut, permukaankerucut;
//
//    public InsertDB(double jari, double tinggi, double luas, double keliling, double volumetabung, double permukaantabung, double volumebola, double permukaanbola, double volumekerucut, double permukaankerucut) {
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
//        
//    }


    
    
    Connector connector = new Connector();
        
        public void InsertDB(double jari, double tinggi, double luas, double keliling, double volumetabung, double permukaantabung, double volumekerucut, double permukaankerucut){
            try {
                String query = "INSERT INTO `hasil`(`jari`, `tinggi`, `luaslingkaran`, `kelilinglingkaran`, `volumetabung`, `permukaantabung`, `volumekerucut`, `permukaankerucut`) VALUES ('"+jari+"', '"+tinggi+"', '"+luas+"', '"+keliling+"', '"+volumetabung+"', '"+permukaantabung+"', '"+volumekerucut+"', '"+permukaankerucut+"')";
                connector.statement = connector.koneksi.createStatement();
                connector.statement.executeUpdate(query);
                connector.statement.close();
            }
            catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
//            
//            public void InsertDB1(double jari, double volbola, double luasbola){
//            try {
//                String query = "INSERT INTO `bola`(`jari`, `voluumebola`, `luasbola`) VALUES ('"+jari+"','"+volbola+"', '"+luasbola+"')";
//                connector.statement = connector.koneksi.createStatement();
//                connector.statement.executeUpdate(query);
//                connector.statement.close();
//            }
//            catch(SQLException ex){
//                System.out.println(ex.getMessage());
//            }
//        }
}
