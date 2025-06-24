/**
 * Nama  : Muhammad Jefry
 * NPM   : 2310010647
 * Kelas : 4A REG BJM
 */

public class BangunDatar {
    // Atribut bertipe desimal
    double alas;
    double tinggi;
    double jariJari;
    double hasil;

    // Constructor untuk menginisialisasi semua atribut ke nol
    public BangunDatar() {
        alas = 0;
        tinggi = 0;
        jariJari = 0;
        hasil = 0;
    }

    // Method accessor untuk mengembalikan nilai hasil
    public double getHasil() {
        return hasil;
    }

    // Method mutator untuk menghitung luas segitiga
    public void hitungLuasSegitiga() {
        hasil = 0.5 * alas * tinggi;
    }

    // Method mutator untuk menghitung luas lingkaran
    public void hitungLuasLingkaran() {
        hasil = 3.14 * jariJari * jariJari;
    }
}