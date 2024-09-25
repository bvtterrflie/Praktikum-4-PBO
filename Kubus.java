package bangunruang;

class Kubus extends Bentuk3D {
    private double sisi;

    // Konstruktor untuk kelas Kubus
    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    // Implementasi metode hitungVolume
    @Override
    double hitungVolume() {
        return sisi * sisi * sisi;
    }

    // Implementasi metode hitungLuasPermukaan
    @Override
    double hitungLuasPermukaan() {
        return 6 * (sisi * sisi);
    }
}