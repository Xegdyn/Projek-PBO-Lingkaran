/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

import java.sql.*;

/**
 *
 * @author isatr
 */
public class Connector {
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    String DBurl = "jdbc:mysql://localhost/lingkaranmt";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;

    public Connector() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = (Connection)DriverManager.getConnection(DBurl, DBusername, DBpassword);
            System.out.println("Koneksi Berhasil");
        }catch (Exception e){
            System.out.println("Koneksi gagal");
        }
    }
  

}
