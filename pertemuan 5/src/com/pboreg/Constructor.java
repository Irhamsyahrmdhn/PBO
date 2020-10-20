package com.pboreg;

// class dengan constructor
class MahasiswaB{
    String nama;
    String NIM;
    String jurusan;

    // constructor dipanggil saat object pertama kali dibuat
    // constructor dengan parameter
    MahasiswaB(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}
public class Constructor {
    public static void main(String[] args){
        MahasiswaB mahasiswa1 = new MahasiswaB("Irhamsyah","2019071027","Informatika"+ "\n");
        MahasiswaB mahasiswa2 = new MahasiswaB("Budi","2019012891","Teknik mesin");
    }
}
