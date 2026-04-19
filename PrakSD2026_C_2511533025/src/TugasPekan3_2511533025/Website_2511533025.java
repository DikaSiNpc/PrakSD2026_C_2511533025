package TugasPekan3_2511533025;
public class Website_2511533025 {
    private String judul_3025;
    private String url_3025;

    public Website_2511533025(String judul_3025, String url_3025) {
        this.judul_3025 = judul_3025;
        this.url_3025 = url_3025;
    }

    public String getJudul_3025() { return judul_3025; }
    public String getUrl_3025() { return url_3025; }
    public void setJudul_3025(String judul) { this.judul_3025 = judul_3025; }
    public void setUrl_3025(String url) { this.url_3025 = url_3025; }

    @Override
    public String toString() {
        return "Judul_3025: " + judul_3025 + " | URL_3025: " + url_3025;
    }
}