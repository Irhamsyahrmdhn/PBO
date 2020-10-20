package com.pboreg;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Bilangan2 obil = new Bilangan2();
        System.out.println(obil.tampilkanA());
        System.out.println(obil.tampilkanB());
        System.out.println(obil.tampilkanC());

        //nilai A diinput
        obil.inputA(100);
        System.out.println("Nilai A setelah diinput = " + obil.tampilkanA());
        //nilai B diinput
        obil.inputB(200);
        System.out.println("Nilai B setelah diinput = " + obil.tampilkanB());
        //nilai C diinput
        obil.inputC(300);
        System.out.println("Nilai C setelah diinput = " + obil.tampilkanC());

        System.out.println("Hasil Prtambahan= "+ obil.tambah());
        System.out.println("Hasil Pengurangan= "+ obil.kurang());
        System.out.println("Hasil Perkalian= "+ obil.kali());
        System.out.println("Hasil Pembagian= "+ obil.bagi());

    }


}
