package Pekan6_2511533025;

public class InsertDLL_2511533025 {
	// menambah node di awal DLL
	static NodeDLL_2511533025 insertBegin(NodeDLL_2511533025 head_3025, int data_3025) {
		// buat node baru
		NodeDLL_2511533025 new_node_3025 = new NodeDLL_2511533025(data_3025);
		// jadikan pointer nextnya head
		new_node_3025.next_3025 = head_3025;
		// jadikan pointer prev head ke new_node
		if (head_3025 != null) {
			head_3025.prev_3025 = new_node_3025;
		}
		return new_node_3025;
	}
	// fungsi menambahkan node di akhir
	public static NodeDLL_2511533025 insertEnd(NodeDLL_2511533025 head_3025, int newData_3025) {
		// buat node baru
		NodeDLL_2511533025 newNode_3025 = new NodeDLL_2511533025(newData_3025);
		// jika dll null jadikan head
		if (head_3025 == null) {
			head_3025 = newNode_3025;
		}
		else {
			NodeDLL_2511533025 curr = head_3025;
			while (curr.next_3025 != null) {
				curr = curr.next_3025;
			}
			curr.next_3025 = newNode_3025;
			newNode_3025.prev_3025 = curr;
		}
		return head_3025;
	}
	//fungsi menambahkan node di posisi tertentu
	public static NodeDLL_2511533025 insertAtPosition(NodeDLL_2511533025 head_3025, int pos_3025, int new_data_3025) {
	    // buat node baru
	    NodeDLL_2511533025 new_node_3025 = new NodeDLL_2511533025(new_data_3025);
	    if (pos_3025 == 1) {
	        new_node_3025.next_3025 = head_3025;
	        if (head_3025 != null) {
	            head_3025.prev_3025 = new_node_3025;
	        }
	        head_3025 = new_node_3025;
	        return head_3025;
	    }
	    NodeDLL_2511533025 curr_3025 = head_3025;
	    for (int i = 1; i < pos_3025 - 1 && curr_3025 != null; ++i) {
	        curr_3025 = curr_3025.next_3025;
	    }
	    if (curr_3025 == null) {
	        System.out.println("Posisi tidak ada");
	        return head_3025;
	    }
	    new_node_3025.prev_3025 = curr_3025;
	    new_node_3025.next_3025 = curr_3025.next_3025;
	    curr_3025.next_3025 = new_node_3025;
	    if (new_node_3025.next_3025 != null) {
	        new_node_3025.next_3025.prev_3025 = new_node_3025;
	    }
	    return head_3025;
	}

	public static void printList(NodeDLL_2511533025 head_3025) {
	    NodeDLL_2511533025 curr_3025 = head_3025;
	    while (curr_3025 != null) {
	        System.out.print(curr_3025.data_3025 + " <-> ");
	        curr_3025 = curr_3025.next_3025;
	    }
	    System.out.println();
	}
	public static void main(String[] args) {
	    // membuat dll 2 <-> 3 <-> 5
	    NodeDLL_2511533025 head_3025 = new NodeDLL_2511533025(2);
	    head_3025.next_3025 = new NodeDLL_2511533025(3);
	    head_3025.next_3025.prev_3025 = head_3025;
	    head_3025.next_3025.next_3025 = new NodeDLL_2511533025(5);
	    head_3025.next_3025.next_3025.prev_3025 = head_3025.next_3025;
	    // cetak DLL awal
	    System.out.print("DLL Awal: ");
	    printList(head_3025);
	    // tambah 1 di awal
	    head_3025 = insertBegin(head_3025, 1);
	    System.out.print(
	            "simpul 1 ditambah di awal: ");
	    printList(head_3025);
	    // tambah 6 di akhir
	    System.out.print(
	            "simpul 6 ditambah di akhir: ");
	    int data_3025 = 6;
	    head_3025 = insertEnd(head_3025, data_3025);
	    printList(head_3025);
	    // menambah node 4 di posisi 4
	    System.out.print("tambah node 4 di posisi 4: ");
	    int data2_3025 = 4;
	    int pos_3025 = 4;
	    head_3025 = insertAtPosition(head_3025, pos_3025, data2_3025);
	    printList(head_3025);
	}
}
	