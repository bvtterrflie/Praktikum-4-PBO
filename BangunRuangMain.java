package bangunruang;

public class BangunRuangMain {
    public static void main(String[] args) {
        // Membuat objek Balok
        Bentuk3D balok = new Balok(3, 4, 5);
        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());

        // Membuat objek Kubus
        Bentuk3D kubus = new Kubus(3);
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
    }
}