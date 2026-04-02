package TugasPekan1_2511533025;
//NIM: 12345678
public class Driver_2511533025 {
 public static void main(String[] args) {

     // Membuat objek mobil
     Mobil_2511533025 m1 = new Mobil_2511533025("Avanza", 2020, 1300, 150000000, "Toyota");

     // Tambah mobil
     m1.tambahMobil();

     // Tampilkan data
     m1.tampil();

     // Ubah data (mutator)
     m1.setHarga(140000000);

     System.out.println("\nSetelah update harga:");
     m1.tampil();

     // Hapus mobil
     m1.hapusMobil();
 }
}