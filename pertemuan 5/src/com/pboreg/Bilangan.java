package com.pboreg;

public class Bilangan {

    private int a = 10;
    private int b = 20;
    private int c = 30;

    //method
    public int tampilkanA(){
        return this.a;
    }public int tampilkanB(){
        return this.b;
    }public int tampilkanC(){
        return this.c;
    }

    public void inputA(int nilai){
        this.a = nilai;
    }
    public void inputB(int nilai){
        this.b = nilai;
    }
    public void inputC(int nilai){
        this.c = nilai;
    }
    public int tambah(){
        int hasil = this.a + this.b + this.c;
        return hasil;
    }
    public int pengurangan(){
        int hasil =  this.c - this.a;
        return hasil;
    }
    public int perkalian(){
        int hasil = this.a * this.b * this.c;
        return hasil;
    }
    public int pembagian(){
        int hasil = this.c / this.b;
        return hasil;
    }

}
