package TugasPekan6_2511533025;
import java.util.Scanner;
class MusikDriver_2511533025 {
    Lagu_2511533025 head_3025;
    Lagu_2511533025 tail_3025;
    // 1. Tambah Lagu
    public void tambahLagu_3025(String judul_3025, String penyanyi_3025) {
        Lagu_2511533025 laguBaru_3025 =
             new Lagu_2511533025(judul_3025, penyanyi_3025);
        if (head_3025 == null) {
            head_3025 = laguBaru_3025;
            tail_3025 = laguBaru_3025;
            } else {
                tail_3025.next_3025 = laguBaru_3025;
                laguBaru_3025.prev_3025 = tail_3025;
                tail_3025 = laguBaru_3025;
                }
        System.out.println("Lagu berhasil ditambahkan!");
   }
   // 2. Hapus Lagu Awal
   public void hapusLaguAwal_3025() {
       if (head_3025 == null) {
           System.out.println("Playlist kosong!");
           } else {
               System.out.println("Lagu dihapus: "
                 + head_3025.getJudul_3025());
               head_3025 = head_3025.next_3025;
               if (head_3025 != null) {
                   head_3025.prev_3025 = null;
           } else {
               tail_3025 = null;
         }
      }
   }
   // 3. Tampil Maju
   public void tampilMaju_3025() {
       if (head_3025 == null) {
           System.out.println("Playlist kosong!");
           return;         
       }
       Lagu_2511533025 bantu_3025 = head_3025;
       System.out.println("\n=== Playlist Maju ===");
       while (bantu_3025 != null) {
           System.out.println("Judul   : "
                   + bantu_3025.getJudul_3025());
           System.out.println("Penyanyi: "
                   + bantu_3025.getPenyanyi_3025());
           System.out.println();
           bantu_3025 = bantu_3025.next_3025;
       }
   }
   // 4. Tampil Mundur
   public void tampilMundur_3025() {
       if (tail_3025 == null) {
           System.out.println("Playlist kosong!");
           return;
       }
       Lagu_2511533025 bantu_3025 = tail_3025;
       System.out.println("\n=== Playlist Mundur ===");
       while (bantu_3025 != null) {
           System.out.println("Judul   : "
                   + bantu_3025.getJudul_3025());
           System.out.println("Penyanyi: "
                   + bantu_3025.getPenyanyi_3025());
           System.out.println();
           bantu_3025 = bantu_3025.prev_3025;
       }
   }
   // 5. Cari Lagu
   public void cariLagu_3025(String judulCari_3025) {
       Lagu_2511533025 bantu_3025 = head_3025;
       boolean ketemu_3025 = false;
       while (bantu_3025 != null) {
           if (bantu_3025.getJudul_3025()
                   .equalsIgnoreCase(judulCari_3025)) {
               System.out.println("\nLagu ditemukan!");
               System.out.println("Judul   : "
                       + bantu_3025.getJudul_3025());
               System.out.println("Penyanyi: "
                       + bantu_3025.getPenyanyi_3025());
               ketemu_3025 = true;
               break;
           }
           bantu_3025 = bantu_3025.next_3025;
       }
       if (!ketemu_3025) {
           System.out.println("Lagu tidak ditemukan!");
       }
   }
   // Main Program
   public static void main(String[] args) {
       Scanner input_3025 = new Scanner(System.in);
       MusikDriver_2511533025 playlist_3025 =
               new MusikDriver_2511533025();
       int pilihan_3025;
       do {
           System.out.println("\n=== Playlist Musik NIM: 2511533025 ===");
           System.out.println("1. Tambah Lagu");
           System.out.println("2. Hapus Lagu Pertama");
           System.out.println("3. Lihat Playlist (Maju)");
           System.out.println("4. Lihat Playlist (Mundur)");
           System.out.println("5. Cari Lagu");
           System.out.println("6. Keluar");
           System.out.print("Pilihan: ");
           pilihan_3025 = input_3025.nextInt();
           input_3025.nextLine();
           switch (pilihan_3025) {
               case 1:
                   System.out.print("Judul: ");
                   String judul_3025 =
                           input_3025.nextLine();
                   System.out.print("Penyanyi: ");
                   String penyanyi_3025 =
                           input_3025.nextLine();
                   playlist_3025.tambahLagu_3025(
                           judul_3025,
                           penyanyi_3025
                   );
                   break;
               case 2:
                   playlist_3025.hapusLaguAwal_3025();
                   break;
               case 3:
                   playlist_3025.tampilMaju_3025();
                   break;
               case 4:
                   playlist_3025.tampilMundur_3025();
                   break;
               case 5:
                   System.out.print("Masukkan judul lagu: ");
                   String cari_3025 =
                           input_3025.nextLine();
                   playlist_3025.cariLagu_3025(cari_3025);
                   break;
               case 6:
                   System.out.println("Program selesai.");
                   break;
               default:
                   System.out.println("Pilihan tidak valid!");
           }
       } while (pilihan_3025 != 6);
   }
}