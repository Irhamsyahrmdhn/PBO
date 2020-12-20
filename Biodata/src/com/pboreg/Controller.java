package com.pboreg;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;



public class Controller {
    public TextField inNIM;
    public TextField inNama;
    public TextField inUmur;
    public TextField inJurusan;
    private Koneksi koneksi = new Koneksi();
    public void intmbl (ActionEvent actionEvent) {
        String nim = inNIM.getText();
        String nama = inNama.getText();
        String umur = inUmur.getText();
        String jurusan = inJurusan.getText();


        String query = "INSERT INTO mahasiswa(nama,nim,umur,jurusan) VALUES('" + nama + "','" + nim + "','" + umur + "','" + jurusan + "')";
        int hasil = koneksi.manipulasiData(query);
        if (hasil == 1) {
            System.out.println("Data berhasil diinput ke dalam tabel");
        }

    }
}
