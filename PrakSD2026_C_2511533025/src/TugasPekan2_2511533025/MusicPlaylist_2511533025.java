package TugasPekan2_2511533025;
public class MusicPlaylist_2511533025 {
    private String judul_3025;
    private String penyanyi_3025;
    private int durasi_3025;

    public MusicPlaylist_2511533025(String judul_3025, String penyanyi_3025, int durasi_3025) {
        this.judul_3025 = judul_3025;
        this.penyanyi_3025 = penyanyi_3025;
        this.durasi_3025 = durasi_3025;
    }

    // Getter
    public String getJudul_3025() { return judul_3025; }
    public String getPenyanyi_3025() { return penyanyi_3025; }
    public int getDurasi_3025() { return durasi_3025; }

    // Setter
    public void setJudul_3025(String judul_3025) { this.judul_3025 = judul_3025; }
    public void setPenyanyi_3025(String penyanyi_3025) { this.penyanyi_3025 = penyanyi_3025; }
    public void setDurasi_3025(int durasi_3025) { this.durasi_3025 = durasi_3025; }

    @Override
    public String toString() {
        return "Judul_3025: " + judul_3025 + " | Penyanyi_3025: " + penyanyi_3025 + " | Durasi_3025: " + durasi_3025 + " detik";
    }
}