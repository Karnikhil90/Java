public class Node {

    private int data;
    private Node left, right;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(int data) {
        this(data, null, null);
    }
    
    public Node(Node root){
        this(root.getData(), root.getLeft(), root.getRight());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Node{");
        sb.append("data=").append(data);
        if (left != null) sb.append(", left=").append(left);
        if (right != null) sb.append(", right=").append(right);
        sb.append('}');
        return sb.toString();
    }

    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
