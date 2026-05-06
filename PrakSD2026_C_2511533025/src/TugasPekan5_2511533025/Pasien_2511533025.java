package TugasPekan5_2511533025;
public class Pasien_2511533025 {
    private String namaPasien_3025;
    private String penyakit_3025;
    private int nomorAntrian_3025;
    private Pasien_2511533025 next_3025;
    // Constructor
    public Pasien_2511533025(String nama_3025, String penyakit_3025, int nomor_3025) {
        this.namaPasien_3025 = nama_3025;
        this.penyakit_3025 = penyakit_3025;
        this.nomorAntrian_3025 = nomor_3025;
        this.next_3025 = null;
    }
    // Getter
    public String getNamaPasien_3025() {
        return namaPasien_3025;
    }
    public String getPenyakit_3025() {
        return penyakit_3025;
    }
    public int getNomorAntrian_3025() {
        return nomorAntrian_3025;
    }
    public Pasien_2511533025 getNext_3025() {
        return next_3025;
    }
    // Setter
    public void setNamaPasien_3025(String nama_3025) {
        this.namaPasien_3025 = nama_3025;
    }
    public void setPenyakit_3025(String penyakit_3025) {
        this.penyakit_3025 = penyakit_3025;
    }
    public void setNomorAntrian_3025(int nomor_3025) {
        this.nomorAntrian_3025 = nomor_3025;
    }
    public void setNext_3025(Pasien_2511533025 next_3025) {
        this.next_3025 = next_3025;
    }
}