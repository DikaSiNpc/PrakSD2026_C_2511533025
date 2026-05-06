package TugasPekan5_2511533025;
import java.util.Scanner;

public class DriverRumahSakit_2511533025 {
    private Pasien_2511533025 head_3025;
    private int counter_3025 = 0;
    // Method Daftarkan Pasien (Insert)
    public void daftarPasien_3025(String nama_3025, String penyakit_3025) {
        counter_3025++;
        Pasien_2511533025 baru_3025 =
                new Pasien_2511533025(nama_3025, penyakit_3025, counter_3025);

        if (head_3025 == null) {
            head_3025 = baru_3025;
        } else {
            Pasien_2511533025 temp_3025 = head_3025;
            while (temp_3025.getNext_3025() != null) {
                temp_3025 = temp_3025.getNext_3025();
            }
            temp_3025.setNext_3025(baru_3025);
        }

        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counter_3025);
    }
    // Method Panggil Pasien (Delete Head)
    public void panggilPasien_3025() {
        if (head_3025 == null) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Pasien dipanggil:");
            System.out.println("Nama : " + head_3025.getNamaPasien_3025());
            System.out.println("Keluhan : " + head_3025.getPenyakit_3025());
            System.out.println("Nomor Antrian : " + head_3025.getNomorAntrian_3025());

            head_3025 = head_3025.getNext_3025();
        }
    }
    // Method Tampilkan Atrian (Display)
    public void tampilkanAntrian_3025() {
        if (head_3025 == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        Pasien_2511533025 temp_3025 = head_3025;
        while (temp_3025 != null) {
            System.out.println("No: " + temp_3025.getNomorAntrian_3025() +
                    " | Nama: " + temp_3025.getNamaPasien_3025() +
                    " | Keluhan: " + temp_3025.getPenyakit_3025());
            temp_3025 = temp_3025.getNext_3025();
        }
    }
    // Method Cari Pasien (Search)
    public void cariPasien_3025(String nama_3025) {
        Pasien_2511533025 temp_3025 = head_3025;

        while (temp_3025 != null) {
            if (temp_3025.getNamaPasien_3025().equalsIgnoreCase(nama_3025)) {
                System.out.println("Pasien ditemukan!");
                System.out.println("No Antrian: " + temp_3025.getNomorAntrian_3025());
                return;
            }
            temp_3025 = temp_3025.getNext_3025();
        }

        System.out.println("Pasien tidak ditemukan!");
    }
    // Method Cek Status Antrian
    public void cekStatus_3025() {
        if (head_3025 == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        int jumlah_3025 = 0;
        Pasien_2511533025 temp_3025 = head_3025;

        while (temp_3025 != null) {
            jumlah_3025++;
            temp_3025 = temp_3025.getNext_3025();
        }

        System.out.println("Jumlah pasien: " + jumlah_3025);
        System.out.println("Pasien terdepan: " + head_3025.getNamaPasien_3025());
    }
    // Method Tampilkan Menu dan Main Program
    public static void main(String[] args) {
        Scanner input_3025 = new Scanner(System.in);
        DriverRumahSakit_2511533025 rs_3025 = new DriverRumahSakit_2511533025();

        int pilih_3025;

        do {
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511533025 ===");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");

            pilih_3025 = input_3025.nextInt();
            input_3025.nextLine();

            switch (pilih_3025) {
                case 1:
                    System.out.print("Masukkan Nama Pasien : ");
                    String nama_3025 = input_3025.nextLine();
                    System.out.print("Masukkan Keluhan : ");
                    String keluhan_3025 = input_3025.nextLine();
                    rs_3025.daftarPasien_3025(nama_3025, keluhan_3025);
                    break;

                case 2:
                    rs_3025.panggilPasien_3025();
                    break;

                case 3:
                    rs_3025.tampilkanAntrian_3025();
                    break;

                case 4:
                    System.out.print("Masukkan Nama : ");
                    String cari_3025 = input_3025.nextLine();
                    rs_3025.cariPasien_3025(cari_3025);
                    break;

                case 5:
                    rs_3025.cekStatus_3025();
                    break;

                case 6:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih_3025 != 6);
    }
}