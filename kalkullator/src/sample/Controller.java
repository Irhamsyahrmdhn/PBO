package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;
import java.util.concurrent.Callable;
public class Controller {
    private String a, b;
    public Label hasil;
    public TextField angka1;
    public TextField angka2;
    DecimalFormat df = new DecimalFormat("#.#");

    public void tmbltambah(ActionEvent actionEvent) {
        a = angka1.getText();
        b = angka2.getText();
        double angka1= Double.parseDouble(a);
        double angka2 = Double.parseDouble(b);
        double hsl = angka1 + angka2;
        String output = df.format(angka1) + "+" + df.format(angka2) + "=" + df.format(hsl);
        hasil.setText(output);
    }

    public void tmblkurang(ActionEvent actionEvent) {
        a = angka1.getText();
        b = angka2.getText();
        double angka1= Double.parseDouble(a);
        double angka2 = Double.parseDouble(b);
        double hsl = angka1 - angka2;
        String output = df.format(angka1) + "-" + df.format(angka2) + "=" + df.format(hsl);
        hasil.setText(output);
    }
    public void tmblkali(ActionEvent actionEvent) {
        a = angka1.getText();
        b = angka2.getText();
        double angka1= Double.parseDouble(a);
        double angka2 = Double.parseDouble(b);
        double hsl = angka1 * angka2;
        String output = df.format(angka1) + "X" + df.format(angka2) + "=" + df.format(hsl);
        hasil.setText(output);

    }

    public void tmblbagi(ActionEvent actionEvent) {
        a = angka1.getText();
        b = angka2.getText();
        double angka1= Double.parseDouble(a);
        double angka2 = Double.parseDouble(b);
        double hsl = angka1 / angka2;
        String output = df.format(angka1) + "/" + df.format(angka2) + "=" + df.format(hsl);
        hasil.setText(output);
    }

    public void hapusA(ActionEvent actionEvent) {
        angka1.clear();
        angka2.clear();
        String output = "0";
        hasil.setText(output);
    }


}