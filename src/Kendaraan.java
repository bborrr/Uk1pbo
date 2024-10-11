//kelas induk
public class Kendaraan {
    private String merek;
    private String model;

    public Kendaraan(String merek, String model) {
        this.merek = merek;
        this.model = model;
    }

    public String getMerek() {
        return merek;
    }

    public String getModel() {
        return model;
    }

    public String deskripsi() {
        return merek + " " + model;
    }
}
