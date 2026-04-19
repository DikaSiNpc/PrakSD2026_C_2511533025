package TugasPekan3_2511533025;
import java.util.Stack;
import java.util.Scanner;

public class BrowserDriver_2511533025 {
	// Method untuk menampilkan menu
    public static void tampilkanMenu() {
        System.out.println("\n=== Browser History NIM: 2511533025 ===");
        System.out.println("1. Kunjungi Website (Push)");
        System.out.println("2. Tombol Back (Pop)");
        System.out.println("3. Lihat Halaman Aktif (Peek)");
        System.out.println("4. Cek Status History");
        System.out.println("5. Keluar");
    }
    // Method untuk menambahkan Website
    public static void kunjungiWebsite(Stack<Website_2511533025> history_3025, Scanner sc_3025) {
        System.out.print("Masukkan Judul: ");
        String judul_3025 = sc_3025.nextLine();
        System.out.print("Masukkan URL: ");
        String url_3025 = sc_3025.nextLine();
        history_3025.push(new Website_2511533025(judul_3025, url_3025));
        System.out.println("Berhasil mengunjungi halaman!");
    }
    // Method untuk menghapus atau menutup Website
    public static void tombolBack(Stack<Website_2511533025> history_3025) {
        if (history_3025.isEmpty()) {
            System.out.println("Tidak ada riwayat untuk kembali.");
        } else {
            Website_2511533025 dihapus = history_3025.pop();
            System.out.println("Kembali dari: " + dihapus.getJudul_3025());
        }
    }
    // Method untuk cek halaman aktif 
    public static void lihatHalamanAktif(Stack<Website_2511533025> history_3025) {
        if (history_3025.isEmpty()) {
            System.out.println("Tidak ada halaman yang sedang dibuka.");
        } else {
            System.out.println("Halaman Aktif: " + history_3025.peek());
        }
    }
    // Method untuk mengecek status history 
    public static void cekStatusHistory(Stack<Website_2511533025> history_3025) {
        if (history_3025.isEmpty()) {
            System.out.println("Riwayat kosong.");
        } else {
            System.out.println("Total riwayat: " + history_3025.size() + " halaman");
        }
    }
    public static void main(String[] args) {
        Stack<Website_2511533025> history_3025 = new Stack<>();
        Scanner sc_3025 = new Scanner(System.in);
        int pilihan;
        do {
            tampilkanMenu();
            System.out.print("Pilihan: ");
            pilihan = Integer.parseInt(sc_3025.nextLine());
            switch (pilihan) {
                case 1: kunjungiWebsite(history_3025, sc_3025); break;
                case 2: tombolBack(history_3025); break;
                case 3: lihatHalamanAktif(history_3025); break;
                case 4: cekStatusHistory(history_3025); break;
                case 5: System.out.println("Keluar dari browser."); break;
                default: System.out.println("Pilihan tidak valid."); break;
            }
        } while (pilihan != 5);
        sc_3025.close();
    }
}