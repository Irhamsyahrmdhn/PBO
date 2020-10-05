package com.pboreg;

import java.util.Scanner;

public class Login {

    public static void main(String[] args){

        String user,pas;
        Scanner inputUser= new Scanner(System.in);
        System.out.print("Masukan Username: ");
        user = inputUser.next();
        System.out.print("Masukan Password: ");
        pas = inputUser.next();
        while(!user.equals ("irhamsyah") && !pas.equals("2212")){
            System.out.print("Username dan Password salah!!\n");
            System.out.print("Masukan Username: ");
            user = inputUser.next();
            System.out.print("Masukan Password: ");
            pas = inputUser.next();
        }
        System.out.println("Access Di Terima!\nSelamat Datang!");
    }
}
