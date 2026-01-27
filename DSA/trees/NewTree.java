import java.util.TreeSet;

public class NewTree {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            tree.add(Integer.valueOf((int)(Math.random() * 1000)));   
        }
        IO.print(tree.toString());
    }
}
