class Node {

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

public class MyTree {

    public Node root;

    public MyTree() {
        this.root = null;
    }

    public MyTree(Node root) {
        this.root = root;
    }

    @Override
    public String toString(){
        return root.toString();
    }

    void preorder(final Node root) {
        if (root == null) return;

        System.out.print(root.getData() + " ");
        preorder(root.getLeft());
        preorder(root.getRight());
    }

    void preorder(){
        preorder(this.root);
    }

    void inorder(final Node root) {
        if (root == null) return;

        inorder(root.getLeft());
        System.out.print(root.getData() + " ");
        inorder(root.getRight());
    }

    void inorder(){
        inorder(this.root);
    }

    void postorder(final Node root) {
        if (root == null) return;

        postorder(root.getLeft());
        postorder(root.getRight());
        System.out.print(root.getData() + " ");
    }
    
    void postorder(){
        postorder(this.root);
    }

    int size(final Node n) {
        return (n == null) ? 0 : 1 + size(n.getLeft()) + size(n.getRight());
    }

    int height(final Node n) {
        return (n == null)
            ? -1
            : 1 + Math.max(height(n.getLeft()), height(n.getRight()));
    }

    Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.getData()) {
            root.setLeft(insert(root.getLeft(), value));
        } else if (value > root.getData()) {
            root.setRight(insert(root.getRight(), value));
        }

        return root;
    }

    public void insertN(int value) {
        root = insert(root, value);
    }

    public void insertN(int[] values) {
        for (int value : values) insertN(value);
    }

    boolean search(Node root, int value) {
        if (root == null) return false;

        if (value == root.getData()) return true;

        if (value < root.getData()) {
            return search(root.getLeft(), value);
        } else {
            return search(root.getRight(), value);
        }
    }
    
    int sum(Node root){   
        return(root == null) ? 0 : root.getData() + sum(root.getLeft()) + sum(root.getRight()); 
    }

    int max(Node root){
        int result = Integer.MIN_VALUE;

        if(root != null){
            result = Math.max(root.getData(), 
                Math.max(
                    max(root.getLeft()), 
                    max(root.getRight())
                    )
            );
        }

        return result;
    }

    int min(Node root){
        return (root == null) ? Integer.MAX_VALUE 
        : (Math.min(root.getData(),
                Math.max(
                    min(root.getLeft()), 
                    min(root.getRight())
                )
            )
        );
    }

    void swap(Node from, Node to){
        Node temp = new Node(from);
        from = new Node(to);
        to = temp;
    }
    void swapChildren(Node parent) {
        if (parent == null) return;

        Node temp = parent.getLeft();
        parent.setLeft(parent.getRight());
        parent.setRight(temp);
    }


    void mirror(Node root) {
        if (root == null) return;

        swapChildren(root);
        mirror(root.getLeft());
        mirror(root.getRight());
    }

}
