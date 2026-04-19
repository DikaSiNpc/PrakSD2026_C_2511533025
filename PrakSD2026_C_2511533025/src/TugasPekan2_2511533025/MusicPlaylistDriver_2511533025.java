package TugasPekan2_2511533025;
import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlaylistDriver_2511533025 {
	// Method untuk menampilkan menu
    public static void tampilkanMenu() {
        System.out.println("\n=== Playlist Musik NIM: 2511533025 ===");
        System.out.println("1. Tambah Lagu");
        System.out.println("2. Lihat Playlist");
        System.out.println("3. Hapus Lagu");
        System.out.println("4. Cek Kapasitas");
        System.out.println("5. Keluar");
    }
    // Method untuk tambah lagu
    public static void tambahLagu(ArrayList<MusicPlaylist_2511533025> playlist_3025, Scanner sc_3025) {
        System.out.print("Masukkan Judul: ");
        String judul_3025 = sc_3025.nextLine();
        System.out.print("Masukkan Penyanyi: ");
        String penyanyi_3025 = sc_3025.nextLine();
        System.out.print("Masukkan Durasi (detik): ");
        int durasi_3025 = Integer.parseInt(sc_3025.nextLine());
        playlist_3025.add(new MusicPlaylist_2511533025(judul_3025, penyanyi_3025, durasi_3025));
        System.out.println("Data berhasil ditambahkan!");
    }
    // Method untuk menampilkan semua data
    public static void lihatPlaylist(ArrayList<MusicPlaylist_2511533025> playlist_3025) {
        if (playlist_3025.isEmpty()) {
            System.out.println("Playlist kosong.");
        } else {
            System.out.println("\nDaftar Lagu:");
            for (int i = 0; i < playlist_3025.size(); i++) {
                System.out.println((i + 1) + ". " + playlist_3025.get(i));
            }
        }
    }
    // Method untuk hapus lagu berdasarkan judul lagu
    public static void hapusLagu(ArrayList<MusicPlaylist_2511533025> playlist_3025, Scanner sc_3025) {
        System.out.print("Masukkan judul lagu yang ingin dihapus: ");
        String judulHapus = sc_3025.nextLine();
        boolean ditemukan = false;
        for (int i = 0; i < playlist_3025.size(); i++) {
            if (playlist_3025.get(i).getJudul_3025().equalsIgnoreCase(judulHapus)) {
            	MusicPlaylist_2511533025 dihapus = playlist_3025.remove(i);
                System.out.println("Lagu \"" + dihapus.getJudul_3025() + "\" berhasil dihapus.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Lagu dengan judul \"" + judulHapus + "\" tidak ditemukan.");
        }
    }
    // Method untuk cek kapasitas lagu
    public static void cekKapasitas(ArrayList<MusicPlaylist_2511533025> playlist_3025) {
        System.out.println("Total lagu dalam playlist: " + playlist_3025.size());
    }
    public static void main(String[] args) {
        ArrayList<MusicPlaylist_2511533025> playlist_3025 = new ArrayList<>();
        Scanner sc_3025 = new Scanner(System.in);
        int pilihan;
        do {
            tampilkanMenu();
            System.out.print("Pilihan: ");
            pilihan = Integer.parseInt(sc_3025.nextLine());
            switch (pilihan) {
                case 1: tambahLagu(playlist_3025, sc_3025); break;
                case 2: lihatPlaylist(playlist_3025); break;
                case 3: hapusLagu(playlist_3025, sc_3025); break;
                case 4: cekKapasitas(playlist_3025); break;
                case 5: System.out.println("Keluar dari program."); break;
                default: System.out.println("Pilihan tidak valid."); break;
            }
        } while (pilihan != 5);
        sc_3025.close();
    }
}