

public class Main {

    public static void main(String[] args) {
        MyTree tree = new MyTree(null);
        int[] values = { 10, 5, 3, 7, 20, 0, 12 };
        tree.insertN(values);
        tree.preorder();
        // IO.println(tree);
        // tree.postorder();
        System.out.println();

        IO.println("size=" + tree.size(tree.root));
        IO.println("height=" + tree.height(tree.root));
        IO.println("sum="+tree.sum(tree.root));
        IO.println("max=" + tree.max(tree.root));
        IO.println("min=" + tree.min(tree.root));
        
        tree.mirror(tree.root);

        IO.println("========= Mirrored the Node =========");
        tree.preorder();
        // IO.println(tree);
        IO.println("\n======================================");
        tree.preorder();
        IO.println("copy a new Node");
        Node copynode = tree.copyNode(tree.root);
        // tree.root.getLeft().setLeft(null);
        tree.nullToleft();
        tree.nullToRight();
        tree.preorder(copynode);
        // System.out.println(copynode);
        IO.println("\n======================================");
    }
}
