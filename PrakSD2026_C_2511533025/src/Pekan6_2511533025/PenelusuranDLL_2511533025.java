package Pekan6_2511533025;
public class PenelusuranDLL_2511533025 {
    //fungsi penelusuran maju
    static void forwardTraversal(NodeDLL_2511533025 head_3025) {
        // memulai penelusuran dari head
        NodeDLL_2511533025 curr_3025 = head_3025;
        //lanjutkan sampai akhir
        while (curr_3025 != null) {
            //print data
            System.out.print(curr_3025.data_3025 + " <-> ");
            //pindah ke node berikutnya
            curr_3025 = curr_3025.next_3025;
        }
        //print spasi
        System.out.println();
    }
    // fungsi penelusuran mundur
    static void backwardTraversal(NodeDLL_2511533025 tail_3025) {
        // mulai dari akhir
        NodeDLL_2511533025 curr_3025 = tail_3025;
        //lanjut sampai head
        while (curr_3025 != null) {
            //cetak data
            System.out.print(curr_3025.data_3025 + " <-> ");
            // pindah ke node sebelumnya
            curr_3025 = curr_3025.prev_3025;
        }
        // cetak spasi
        System.out.println();
    }
    public static void main(String[] args) {
        // cetak DLL
        NodeDLL_2511533025 head_3025 = new NodeDLL_2511533025(1);
        NodeDLL_2511533025 second_3025 = new NodeDLL_2511533025(2);
        NodeDLL_2511533025 third_3025 = new NodeDLL_2511533025(3);

        head_3025.next_3025 = second_3025;
        second_3025.prev_3025 = head_3025;
        second_3025.next_3025 = third_3025;
        third_3025.prev_3025 = second_3025;

        System.out.println("Penelusuran maju:");
        forwardTraversal(head_3025);

        System.out.println("Penelusuran mundur:");
        backwardTraversal(third_3025);
    }
}