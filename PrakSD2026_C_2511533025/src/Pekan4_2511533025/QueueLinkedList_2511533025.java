package Pekan4_2511533025;
import java.util.LinkedList;
import java.util.Queue;
public class QueueLinkedList_2511533025 {
    public static void main(String[] args) {
        Queue<Integer> q_3025 = new LinkedList<>();
        // tambah elemen {0, 1, 2, 3, 4,5} ke antrian
        for (int i = 0; i < 6; i++)
            q_3025.add(i);
        // Menampilkan isi antrian.
        System.out.println("Elemen Antrian " + q_3025);
        // Untuk menghapus kepala antrian.
        int hapus = q_3025.remove();
        System.out.println("Hapus elemen = " + hapus);
        System.out.println(q_3025);
        // Untuk melihat antrian terdepan
        int depan = q_3025.peek();
        System.out.println("Kepala Antrian = " + depan);

        int banyak = q_3025.size();
        System.out.println("Size Antrian = " + banyak);
    }
}