package Pekan9_2511533025;
public class Node_2511533025 {
    int data_3025;
    Node_2511533025 left_3025;
    Node_2511533025 right_3025;

    public Node_2511533025(int data_3025) {
        this.data_3025 = data_3025;
        left_3025 = null;
        right_3025 = null;
    }

    public void setLeft(Node_2511533025 node_3025) {
        if (left_3025 == null)
            left_3025 = node_3025;
    }

    public void setRight(Node_2511533025 node_3025) {
        if (right_3025 == null)
            right_3025 = node_3025;
    }

    public Node_2511533025 getLeft() {
        return left_3025;
    }

    public Node_2511533025 getRight() {
        return right_3025;
    }

    public int getData() {
        return data_3025;
    }

    public void setData(int data) {
        this.data_3025 = data;
    }

    void printPreorder(Node_2511533025 node_3025) {
        if (node_3025 == null)
            return;
        System.out.print(node_3025.data_3025 + " ");
        printPreorder(node_3025.left_3025);
        printPreorder(node_3025.right_3025);
    }

    void printPostorder(Node_2511533025 node_3025) {
        if (node_3025 == null)
            return;
        printPostorder(node_3025.left_3025);
        printPostorder(node_3025.right_3025);
        System.out.print(node_3025.data_3025 + " ");
    }

    void printInorder(Node_2511533025 node_3025) {
        if (node_3025 == null)
            return;
        printInorder(node_3025.left_3025);
        System.out.print(node_3025.data_3025 + " ");
        printInorder(node_3025.right_3025);
    }

    public String print() {
        return this.print("", true, "");
    }

    public String print(String prefix_3025, boolean isTail_3025, String sb_3025) {
        if (right_3025 != null) {
            right_3025.print(prefix_3025 + (isTail_3025 ? "|   " : "    "), false, sb_3025);
        }
        System.out.println(prefix_3025 + (isTail_3025 ? "\\-- " : "/-- ") + data_3025);
        if (left_3025 != null) {
            left_3025.print(prefix_3025 + (isTail_3025 ? "    " : "|   "), true, sb_3025);
        }
        return sb_3025;
    }
}