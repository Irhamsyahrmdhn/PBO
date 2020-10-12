package com.pboreg;

public class Fungsi_void_tanpa_return_vidio {

    public static void main (String[] args){

        // void itu artinya hampa

        System.out.println(simpel());

        fungsiVoid("good morning");
        selamatPagi("mama");
        selamatPagi("papa");

    }

    private static void selamatPagi(String nama){
        System.out.println("selamat pagi " + nama);
    }


    // fungsi atau method tanpa kembalian
    private static void fungsiVoid(String input){
        System.out.println(input);
    }

    // fungsi atau method dengan kembalian
    // sehingga menggunakan return untuk
    // mengembalikan nilainya (10.0f)
    private static float simpel(){
        return 10.0f;
    }
}