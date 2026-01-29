public class Main2 {
    public static void main(String[] args) {
        MyTree tree1 = new MyTree();
        MyTree tree2 = new MyTree();
        MyTree test = new MyTree();

        tree1.insertN(new int[] {10 , 88, 55 , 0 , 23 ,12});
        tree2.insertN(new int[] { 10, 5, 3, 7, 20, 0, 12 });
        tree1.preorder();
        System.out.println();
        System.out.println(test.isIdentical(tree1.root, tree2.root));

    }
}
