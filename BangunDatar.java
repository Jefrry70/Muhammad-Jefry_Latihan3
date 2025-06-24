/**
 * Nama  : Muhammad Fadilah
 * NPM   : 2312345678
 * Kelas : Informatika 2023
 */

public class BangunDatar {
    // Atribut bertipe desimal
    double alas;
    double tinggi;
    double jariJari;
    double hasil;

    // Constructor
    public BangunDatar() {
        alas = 0;
        tinggi = 0;
        jariJari = 0;
        hasil = 0;
    }

    // Method mutator untuk menghitung luas segitiga
    public void hitungLuasSegitiga() {
        hasil = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga = " + hasil);
    }

    // Method mutator untuk menghitung luas lingkaran
    public void hitungLuasLingkaran() {
        hasil = 3.14 * jariJari * jariJari;
        System.out.println("Luas Lingkaran = " + hasil);
    }
}