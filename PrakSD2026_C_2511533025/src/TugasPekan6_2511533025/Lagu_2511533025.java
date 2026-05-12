package TugasPekan6_2511533025;
class Lagu_2511533025 {
    private String judul_3025;
    private String penyanyi_3025;
    Lagu_2511533025 next_3025;
    Lagu_2511533025 prev_3025;
    // Constructor
    public Lagu_2511533025(String judul_3025, String penyanyi_3025) {
        this.judul_3025 = judul_3025;
        this.penyanyi_3025 = penyanyi_3025;
        this.next_3025 = null;
        this.prev_3025 = null;
    }
    // Getter
    public String getJudul_3025() {
        return judul_3025;
    }
    public String getPenyanyi_3025() {
        return penyanyi_3025;
    }
    // Setter
    public void setJudul_3025(String judul_3025) {
        this.judul_3025 = judul_3025;
    }
    public void setPenyanyi_3025(String penyanyi_3025) {
        this.penyanyi_3025 = penyanyi_3025;
    }
}