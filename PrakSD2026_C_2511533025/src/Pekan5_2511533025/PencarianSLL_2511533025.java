package Pekan5_2511533025;
public class PencarianSLL_2511533025 {
    static boolean searchKey(NodeSLL_2511533025 head_3025, int key_3025) {
        NodeSLL_2511533025 curr_3025 = head_3025;
        while (curr_3025 != null) {
            if (curr_3025.data_3025 == key_3025)
                return true;
            curr_3025 = curr_3025.next_3025;
        }
        return false;
    }

    public static void traversal(NodeSLL_2511533025 head_3025) {
        //mulai dari head
        NodeSLL_2511533025 curr_3025 = head_3025;
        //telusuri sampai pointer null
        while (curr_3025 != null) {
            System.out.print(" " + curr_3025.data_3025);
            curr_3025 = curr_3025.next_3025;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NodeSLL_2511533025 head = new NodeSLL_2511533025(14);
        head.next_3025 = new NodeSLL_2511533025(21);
        head.next_3025.next_3025 = new NodeSLL_2511533025(13);
        head.next_3025.next_3025.next_3025 = new NodeSLL_2511533025(30);
        head.next_3025.next_3025.next_3025.next_3025 = new NodeSLL_2511533025(10);
        
        System.out.print("Penelusuran SLL : ");
        traversal(head);
        
        // data yang akan dicari
        int key = 30;
        System.out.print("cari data " + key + " = ");
        if (searchKey(head, key))
            System.out.println("ketemu");
        else
            System.out.println("tidak ada");
    }
}