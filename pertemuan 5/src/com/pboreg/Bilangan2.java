package com.pboreg;

public class Bilangan2{
    private int A= 10;
    private int B= 20;
    private int C= 30;

    public int tampilkanA(){

        return this.A;
    }
    public int tampilkanB(){

        return this.B;
    }
    public int tampilkanC(){

        return this.C;
    }
    public void inputA(int nilai){
        this.A= nilai;
    }
    public void inputB(int nilai){
        this.B= nilai;
    }
    public void inputC(int nilai){
        this.C= nilai;
    }
    public int tambah(){
        int hasil= this.A + this.B + this.C;
        return hasil;
    }
    public int kurang(){
        int hasil= this.A - this.B;
        return hasil;
    }
    public int kali(){
        int hasil= this.A * this.B;
        return hasil;
    }
    public double bagi(){
        int hasil= this.C / this.A;
        return hasil;
    }
}
