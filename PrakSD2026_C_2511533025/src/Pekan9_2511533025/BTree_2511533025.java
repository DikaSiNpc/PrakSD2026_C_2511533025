package Pekan9_2511533025;
public class BTree_2511533025 {
    private Node_2511533025 root_3025;
    private Node_2511533025 currentNode;

    public BTree_2511533025() {
        root_3025 = null;
    }

    public boolean search(int data_3025) {
        return search(root_3025, data_3025);
    }

    private boolean search(Node_2511533025 node_3025, int data_3025) {
        if (node_3025.getData() == data_3025)
            return true;
        if (node_3025.getLeft() != null)
            if (search(node_3025.getLeft(), data_3025))
                return true;
        if (node_3025.getRight() != null)
            if (search(node_3025.getRight(), data_3025))
                return true;
        return false;
    }

    public void printInorder() {
        root_3025.printInorder(root_3025);
    }

    public void printPreOrder() {
        root_3025.printPreorder(root_3025);
    }

    public void printPostOrder() {
        root_3025.printPostorder(root_3025);
    }

    public Node_2511533025 getRoot() {
        return root_3025;
    }
    public boolean isEmpty() {
    	return root_3025 == null;
    }
    public int countNodes() {
    	return countNodes(root_3025);
    }
    private int countNodes(Node_2511533025 node_3025) {
    	int count_3025 = 1;
    	if (node_3025 == null) {
    		return 0;
    	} else {
    		count_3025 += countNodes(node_3025.getLeft());
    		count_3025 += countNodes(node_3025.getRight());
    		return count_3025;
    	}
    }
    public void print() {
    	root_3025.print();
    }
    public Node_2511533025 getCurrent() {
    	return currentNode;
    }
    public void setCurrent(Node_2511533025 node_3025) {
    	this.currentNode = node_3025;
    }
    public void setRoot(Node_2511533025 root_3025) {
    	this.root_3025 = root_3025;
    }
}