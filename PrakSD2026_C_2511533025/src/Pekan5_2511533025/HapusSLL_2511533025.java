package Pekan5_2511533025;
public class HapusSLL_2511533025 {
    // fungsi untuk menghapus head
    public static NodeSLL_2511533025 deleteHead(NodeSLL_2511533025 head) {
        // jika SLL kosong
        if (head == null)
            return null;
        // pindahkan head ke node berikutnya
        head = head.next_3025;
        // Return head baru
        return head;
    }
    // fungsi menghapus node terakhir SLL
    public static NodeSLL_2511533025 removeLastNode(NodeSLL_2511533025 head) {
        // jika list kosong, return null
        if (head == null) {
            return null;
        }
        //jika list satu node, hapus node dan return null
        if (head.next_3025 == null) {
            return null;
        }
        //temukan node terakhir ke dua
        NodeSLL_2511533025 secondLast = head;
        while (secondLast.next_3025.next_3025 != null) {
            secondLast = secondLast.next_3025;
        }
        // hapus node terakhir
        secondLast.next_3025 = null;
        return head;
    }
    // fungsi menghapus node di posisi tertentu
    public static NodeSLL_2511533025 deleteNode(NodeSLL_2511533025 head, int position) {
        NodeSLL_2511533025 temp_3025 = head;
        NodeSLL_2511533025 prev_3025 = null;
        // jika linked list null
        if (temp_3025 == null)
            return head;
        // kasus 1: head dihapus
        if (position == 1) {
            head = temp_3025.next_3025;
            return head;    }
        // kasus 2: menghapus node di tengah
        // telusuri ke node yang dihapus
        for (int i = 1; temp_3025 != null && i < position; i++) {
            prev_3025 = temp_3025;
            temp_3025 = temp_3025.next_3025;   }
        // jika ditemukan, hapus node
        if (temp_3025 != null) {
            prev_3025.next_3025 = temp_3025.next_3025;
        } else {
            System.out.println("Data tidak ada");        }
        return head;    }
    // fungsi mencetak SLL
    public static void printList(NodeSLL_2511533025 head) {
        NodeSLL_2511533025 curr_3025 = head;
        while (curr_3025.next_3025 != null) {
            System.out.print(curr_3025.data_3025+"-->");
            curr_3025 = curr_3025.next_3025;       }
        if (curr_3025.next_3025==null) {
            System.out.print(curr_3025.data_3025);    }
        System.out.println(); }
    //kelas main
    public static void main(String[] args) {
        // buat SLL 1 -> 2 -> 3 -> 4 -> 5-> 6 -> null
        NodeSLL_2511533025 head = new NodeSLL_2511533025(1);
        head.next_3025 = new NodeSLL_2511533025(2);
        head.next_3025.next_3025 = new NodeSLL_2511533025(3);
        head.next_3025.next_3025.next_3025 = new NodeSLL_2511533025(4);
        head.next_3025.next_3025.next_3025.next_3025 = new NodeSLL_2511533025(5);
        head.next_3025.next_3025.next_3025.next_3025.next_3025 = new NodeSLL_2511533025(6);
        // cetak list awal
        System.out.println("list awal: ");
        printList(head);
        // hapus head
        head = deleteHead(head);
        System.out.println("List setelah head dihapus: ");
        printList(head);
        //hapus node terakhir
        head = removeLastNode(head);
        System.out.println("List setelah simpul terakhir di hapus: ");
        printList(head);
        // Deleting node at position 2
        int position = 2;
        head = deleteNode(head, position);
        // Print list after deletion
        System.out.println("List setelah posisi 2 dihapus: ");
        printList(head);
    }
    
}