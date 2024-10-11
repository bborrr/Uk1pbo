public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", "Avanza", "Kendaraan Roda 4", 7);
        Sepeda sepeda = new Sepeda("Polygon", "Brompton", "Kendaraan Roda 2");
        Motor motor = new Motor("Yamaha", "NMAX", "Kendaraan Roda 2", 155);

        Kendaraan[] kendaraanList = {mobil, sepeda, motor};

        for (Kendaraan kendaraan : kendaraanList) {
            System.out.println(kendaraan.deskripsi()); // Polymorphism
        }
    }
}
