package Pekan9_2511533025;

public class BtreeDriver_2511533025 {
	
    public static void main(String[] args) {
        //Membuat Pohon
        BTree_2511533025 tree_3025 = new BTree_2511533025();
        System.out.print("Jumlah Simpul awal pohon: ");
        System.out.println(tree_3025.countNodes());
        //menambahkan simpul data 1
        Node_2511533025 root_3025 = new Node_2511533025(1);
        //menjadikan simpul 1 sebagai root
        tree_3025.setRoot(root_3025);
        System.out.println("Jumlah simpul jika hanya ada root");
        System.out.println(tree_3025.countNodes());
        Node_2511533025 node2_3025 = new Node_2511533025(2);
        Node_2511533025 node3_3025 = new Node_2511533025(3);
        Node_2511533025 node4_3025 = new Node_2511533025(4);
        Node_2511533025 node5_3025 = new Node_2511533025(5);
        Node_2511533025 node6_3025 = new Node_2511533025(6);
        Node_2511533025 node7_3025 = new Node_2511533025(7);
        Node_2511533025 node8_3025 = new Node_2511533025(8);
        Node_2511533025 node9_3025 = new Node_2511533025(9);
        root_3025.setLeft(node2_3025);
        node2_3025.setLeft(node4_3025);
        node2_3025.setRight(node5_3025);
        node4_3025.setRight(node8_3025);
        root_3025.setRight(node3_3025);
        node3_3025.setLeft(node6_3025);
        node3_3025.setRight(node7_3025);
        node6_3025.setLeft(node9_3025);
        //Set root
        tree_3025.setCurrent(tree_3025.getRoot());
        System.out.println("menampilkan simpul terakhir: ");
        System.out.println(tree_3025.getCurrent().getData());
        System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
        System.out.println(tree_3025.countNodes());
        System.out.println("InOrder: ");
        tree_3025.printInorder();
        System.out.println("\nPreorder: ");
        tree_3025.printPreOrder();
        System.out.println("\nPostorder : ");
        tree_3025.printPostOrder();
        System.out.println("\nDmenampilkan simpul dalam bentuk pohon");
        tree_3025.print();
    
   }

}