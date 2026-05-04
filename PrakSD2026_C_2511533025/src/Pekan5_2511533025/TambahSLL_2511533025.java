package Pekan5_2511533025;
public class TambahSLL_2511533025 {
    public static NodeSLL_2511533025 insertAtFront(NodeSLL_2511533025 head_3025, int value_3025) {
        NodeSLL_2511533025 new_node = new NodeSLL_2511533025(value_3025);
        new_node.next_3025 = head_3025;
        return new_node;
    }
    // fungsi menambahkan node di akhir SLL
    public static NodeSLL_2511533025 insertAtEnd(NodeSLL_2511533025 head_3025, int value_3025) {
        // buat sebuah node dengan sebuah nilai
        NodeSLL_2511533025 newNode = new NodeSLL_2511533025(value_3025);
        // jika list kosong maka node jadi head
        if (head_3025 == null) {
            return newNode;
        }
        // simpan head ke variabel sementara
        NodeSLL_2511533025 last = head_3025;
        // telusuri ke node akhir
        while (last.next_3025 != null) {
            last = last.next_3025;
        }
        // ubah pointer
        last.next_3025 = newNode;
        return head_3025;
    }
    static NodeSLL_2511533025 GetNode(int data) {
        return new NodeSLL_2511533025(data);
    }

    static NodeSLL_2511533025 insertPos(NodeSLL_2511533025 headNode_3025, int position_3025, int value_3025) {
        NodeSLL_2511533025 head = headNode_3025;
        if (position_3025 < 1)
            System.out.print("Invalid position");
        if (position_3025 == 1) {
            NodeSLL_2511533025 new_node = new NodeSLL_2511533025(value_3025);
            new_node.next_3025 = head;
            return new_node;
        } else {
            while (position_3025-- != 0) {
                if (position_3025 == 1) {
                    NodeSLL_2511533025 newNode = GetNode(value_3025);
                    newNode.next_3025 = headNode_3025.next_3025;
                    headNode_3025.next_3025 = newNode;
                    break;
                }
                headNode_3025 = headNode_3025.next_3025;
            }
            if (position_3025 != 1)
                System.out.print("Posisi di luar jangkauan");
        }
        return head;
    }
    public static void printList(NodeSLL_2511533025 head) {
        NodeSLL_2511533025 curr = head;
        while (curr.next_3025 != null) {
            System.out.print(curr.data_3025+"-->");
            curr = curr.next_3025;
        }
        if (curr.next_3025==null) {
            System.out.print(curr.data_3025);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // buat linked list 2->3->5->6
        NodeSLL_2511533025 head_3025 = new NodeSLL_2511533025(2);
        head_3025.next_3025 = new NodeSLL_2511533025(3);
        head_3025.next_3025.next_3025 = new NodeSLL_2511533025(5);
        head_3025.next_3025.next_3025.next_3025 = new NodeSLL_2511533025(6);
        // cetak list asli
        System.out.print("Senarai berantai awal:");
        printList(head_3025);
        // tambahkan node baru di depan
        System.out.print("tambah 1 simpul di depan: ");
        int data = 1;
        head_3025 = insertAtFront(head_3025, data);
        // cetak update list
        printList(head_3025);
        // tambahkan node baru di belakang
        System.out.print("tambah 1 simpul di belakang: ");
        int data2 = 7;
        head_3025 = insertAtEnd(head_3025, data2);
        // cetak update list
        printList(head_3025);
        System.out.print("tambah 1 simpul ke data 4: ");
        int data3 = 4;
        int pos=4;
        head_3025 = insertPos(head_3025,pos,data3);
        // cetak update list
        printList(head_3025);
    }
}