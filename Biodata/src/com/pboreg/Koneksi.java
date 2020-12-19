package com.pboreg;

import java.sql.*;

public class Koneksi {
    //Buat attribut untuk koneksi
    private Connection con;

    //Buat deklarasi atteribut untuk statement
    private Statement st;

    //definisikan usernamme, password, dan alamat dari sever mysql
    public Koneksi(){
        try {
            String user = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/pbo-reguler";
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e){
            System.out.println("Eror = " + e.getMessage());
        }
    }
    //Untuk input data(insert), Edit data (Update), dana hapus data (Delete)
    public int manipulasiData(String query){
        try {
            st = con.createStatement();
            return st.executeUpdate(query);
        }catch (SQLException e){
            System.out.println("Eror = " + e.getMessage());
            return 0;
        }
    }
    //Untuk menampilkan data
    public ResultSet getData(String query){
        try {
            st = con.createStatement();
            return st.executeQuery(query);
        }catch (SQLException e){
            System.out.println("Eror = " + e.getMessage());
            return null;
        }
    }
}
