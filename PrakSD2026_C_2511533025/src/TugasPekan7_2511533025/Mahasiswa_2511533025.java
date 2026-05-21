package TugasPekan7_2511533025;

class Mahasiswa_2511533025 {
    private String nama_3025;
    private String nim_3025;
    private String prodi_3025;
    public Mahasiswa_2511533025(String nama_3025, String nim_3025, String prodi_3025) {
        this.nama_3025 = nama_3025;
        this.nim_3025 = nim_3025;
        this.prodi_3025 = prodi_3025;
    }
    public String getNama() {
        return nama_3025;
    }
    public String getNim() {
        return nim_3025;
    }
    public String getProdi() {
        return prodi_3025;
    }
    @Override
    public String toString() {
        return nama_3025 + " - " + nim_3025 + " - " + prodi_3025;
    }
}