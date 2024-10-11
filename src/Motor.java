public class Motor extends Kendaraan {
    private int cc;

    public Motor(String merek, String model, String jenis, int cc) {
        super(merek, model);
        new AlatTransportasi(jenis); // Hanya contoh, tidak dapat diwarisi
        this.cc = cc;
    }

    @Override
    public String deskripsi() {
        return "Motor: " + getMerek() + " " + getModel() + ", CC: " + cc;
    }
}
