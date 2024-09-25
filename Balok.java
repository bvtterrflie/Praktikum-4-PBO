package bangunruang;

class Balok extends Bentuk3D {
    private double panjang, lebar, tinggi;

    // Konstruktor untuk kelas Balok
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Implementasi metode hitungVolume
    @Override
    double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    // Implementasi metode hitungLuasPermukaan
    @Override
    double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}   