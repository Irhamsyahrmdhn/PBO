package com.pboreg;

class MahasiswaC{
    // Data member
    String nama;
    String NIM;

    // constructor
    MahasiswaC(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }
    //Method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    //Method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }
    //Method dengan return tapi tidak ada parameter
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }
    // method dengan return dan dengan parameter
    String sayHi(String message){
        return message + " nama saya " + this.nama;
    }
}

public class Methods{
    public static void main(String[] args) {
        MahasiswaC mahasiswa1 = new MahasiswaC("Irhamsyah","2019071027");
        // method
        mahasiswa1.show();
        mahasiswa1.setNama("Budi");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("Hai");
        System.out.println(data);
    }
}
