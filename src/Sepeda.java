public class Sepeda extends Kendaraan {
    public Sepeda(String merek, String model, String jenis) {
        super(merek, model);
        new AlatTransportasi(jenis); // Hanya contoh, tidak dapat diwarisi
    }

    @Override
    public String deskripsi() {
        return "Sepeda: " + getMerek() + " " + getModel();
    }
}
