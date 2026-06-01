package TugasPekan8_2511533025;
class Lagu_3025 {
    String judul_3025;
    String penyanyi_3025;
    int durasi_3025;

    Lagu_3025(String judul_3025, String penyanyi_3025, int durasi_3025) {
        this.judul_3025 = judul_3025;
        this.penyanyi_3025 = penyanyi_3025;
        this.durasi_3025 = durasi_3025;
    }
}
public class Sorting_2511533025 {
    Lagu_3025[] dataLagu_3025 = new Lagu_3025[20];
    int jumlahData_3025 = 0;
    void inputData_3025() {
        dataLagu_3025[jumlahData_3025++] =
                new Lagu_3025("Laskar Pelangi", "Nidji", 226);
        dataLagu_3025[jumlahData_3025++] =
                new Lagu_3025("Hati-Hati di Jalan", "Muhammad Tulus & Ari Renaldi", 242);
        dataLagu_3025[jumlahData_3025++] =
                new Lagu_3025("Bunga Terakhir", "Bebi Romeo", 281);
        dataLagu_3025[jumlahData_3025++] =
                new Lagu_3025("Perfect", "Ed Sheeran", 263);
        dataLagu_3025[jumlahData_3025++] =
                new Lagu_3025("Hymn For The Weekend", "Coldplay", 258);
        dataLagu_3025[jumlahData_3025++] =
                new Lagu_3025("Believer", "Imagine Dragons", 204);
        dataLagu_3025[jumlahData_3025++] =
                new Lagu_3025("Billie", "Michael Jackson", 294);
    }
    void tampilData_3025() {
        for (int i_3025 = 0; i_3025 < jumlahData_3025; i_3025++) {
            System.out.println((i_3025 + 1) + ". "
                    + dataLagu_3025[i_3025].judul_3025 + " - "
                    + dataLagu_3025[i_3025].durasi_3025 + " detik");
        }
    }
    // Shell Sort berdasarkan Judul A-Z
    void shellSort_3025() {
        int n_3025 = jumlahData_3025;
        for (int gap_3025 = n_3025 / 2; gap_3025 > 0; gap_3025 /= 2) {
            for (int i_3025 = gap_3025; i_3025 < n_3025; i_3025++) {
                Lagu_3025 temp_3025 = dataLagu_3025[i_3025];
                int j_3025 = i_3025;
                while (j_3025 >= gap_3025 &&
                        dataLagu_3025[j_3025 - gap_3025].judul_3025
                                .compareToIgnoreCase(temp_3025.judul_3025) > 0) {
                    dataLagu_3025[j_3025] =
                            dataLagu_3025[j_3025 - gap_3025];
                    j_3025 -= gap_3025;
                }
                dataLagu_3025[j_3025] = temp_3025;
            }
        }
    }
    public static void main(String[] args) {
        Sorting_2511533025 playlist_3025 =
                new Sorting_2511533025();
        playlist_3025.inputData_3025();
        System.out.println("=== Sorting Playlist NIM: 2511533025 ===\n");

        System.out.println("=== Playlist Sebelum Sorting ===");
        playlist_3025.tampilData_3025();

        playlist_3025.shellSort_3025();

        System.out.println("\n=== Playlist Setelah Shell Sort (Judul A-Z) ===");
        playlist_3025.tampilData_3025();
    }
}