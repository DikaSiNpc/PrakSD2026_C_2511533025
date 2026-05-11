package Pekan6_2511533025;
public class HapusDLL_2511533025 {
    // fungsi menghapus node awal
    public static NodeDLL_2511533025 delHead(NodeDLL_2511533025 head_3025) {
        if (head_3025 == null) {
            return null;    }
        NodeDLL_2511533025 temp = head_3025;
        head_3025 = head_3025.next_3025;
        if (head_3025 != null) {
            head_3025.prev_3025 = null;    }
        return head_3025;
    }
    // fungsi menghapus di akhir
    public static NodeDLL_2511533025 delLast(NodeDLL_2511533025 head_3025) {
        if (head_3025 == null) {
            return null;    }
        if (head_3025.next_3025 == null) {
            return null;    }
        NodeDLL_2511533025 curr = head_3025;
        while (curr.next_3025 != null) {
            curr = curr.next_3025;
        }
        // update pointer previous node
        if (curr.prev_3025 != null) {
            curr.prev_3025.next_3025 = null;    }
        return head_3025;
    }
 // fungsi menghapus node posisi tertentu
    public static NodeDLL_2511533025 delPos(NodeDLL_2511533025 head_3025, int pos_3025) {
        // jika DLL kosong
        if (head_3025 == null) {
            return head_3025; }
        NodeDLL_2511533025 curr_3025 = head_3025;
        // telusuri sampai ke node yang akan dihapus
        for (int i = 1; curr_3025 != null && i < pos_3025; ++i) {
            curr_3025 = curr_3025.next_3025;
        }
        // jika posisi tidak ditemukan
        if (curr_3025 == null) {
            return head_3025; }
        // Update pointer
        if (curr_3025.prev_3025 != null) {
            curr_3025.prev_3025.next_3025= curr_3025.next_3025; }
        if (curr_3025.next_3025 != null) {
            curr_3025.next_3025.prev_3025 = curr_3025.prev_3025; }
        // jika yang dihapus head
        if (head_3025 == curr_3025) {
            head_3025 = curr_3025.next_3025; }
        return head_3025;
    }

    // fungsi mencetak DLL
    public static void printList(NodeDLL_2511533025 head_3025) {
        NodeDLL_2511533025 curr_3025 = head_3025;
        while (curr_3025 != null) {
            System.out.print(curr_3025.data_3025 + " <-> ");
            curr_3025 = curr_3025.next_3025;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // buat sebuah DLL
        NodeDLL_2511533025 head_3025 = new NodeDLL_2511533025(1);
        head_3025.next_3025 = new NodeDLL_2511533025(2);
        head_3025.next_3025.prev_3025 = head_3025;
        head_3025.next_3025.next_3025 = new NodeDLL_2511533025(3);
        head_3025.next_3025.next_3025.prev_3025 = head_3025.next_3025;
        head_3025.next_3025.next_3025.next_3025 = new NodeDLL_2511533025(4);
        head_3025.next_3025.next_3025.next_3025.prev_3025 = head_3025.next_3025.next_3025;
        head_3025.next_3025.next_3025.next_3025.next_3025 = new NodeDLL_2511533025(5);
        head_3025.next_3025.next_3025.next_3025.next_3025.prev_3025 = head_3025.next_3025.next_3025.next_3025;

        System.out.print("DLL Awal: ");
        printList(head_3025);

        System.out.print("Setelah head dihapus: ");
        head_3025 = delHead(head_3025);
        printList(head_3025);

        System.out.print("Setelah node terakhir dihapus: ");
        head_3025 = delLast(head_3025);
        printList(head_3025);

        System.out.print("menghapus node ke 2: ");
        head_3025 = delPos(head_3025, 2);

        printList(head_3025);
    }
}