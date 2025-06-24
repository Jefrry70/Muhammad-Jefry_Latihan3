class BangunDatar {
    private double alas;
    private double tinggi;
    private double jariJari;
    private double hasil;

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public void hitungLuasSegitiga() {
        hasil = 0.5 * alas * tinggi;
    }

    public void hitungLuasLingkaran() {
        hasil = Math.PI * jariJari * jariJari;
    }

    public double getHasil() {
        return hasil;
    }
}

public class BangunDatarBeraksi {
    public static void main(String[] args) {
        BangunDatar bangun = new BangunDatar();

        // Hitung luas segitiga
        bangun.setAlas(10);
        bangun.setTinggi(5);
        bangun.hitungLuasSegitiga();
        System.out.println("Luas Segitiga: " + bangun.getHasil());

        // Hitung luas lingkaran
        bangun.setJariJari(7);
        bangun.hitungLuasLingkaran();
        System.out.println("Luas Lingkaran: " + bangun.getHasil());
    }
}