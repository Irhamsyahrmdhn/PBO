package com.pboreg;

import java.sql.*;

public class Koneksi {

    private Connection con;
    private Statement st;


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

    public int manipulasiData(String query){
        try {
            st = con.createStatement();
            return st.executeUpdate(query);
        }catch (SQLException e){
            System.out.println("Eror = " + e.getMessage());
            return 0;
        }
    }

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
