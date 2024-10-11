public class Mobil extends Kendaraan {
    private int kapasitas;

    public Mobil(String merek, String model, String jenis, int kapasitas) {
        super(merek, model);
        new AlatTransportasi(jenis); // Hanya contoh, tidak dapat diwarisi
        this.kapasitas = kapasitas;
    }

    @Override
    public String deskripsi() {
        return "Mobil: " + getMerek() + " " + getModel() + ", Kapasitas: " + kapasitas;
    }
}
