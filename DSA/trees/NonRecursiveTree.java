import java.util.ArrayList;
import java.util.Stack;

public class NonRecursiveTree {

    public static ArrayList<Integer> preorder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node temp = stack.pop();
            res.add(temp.getData());
            if(temp.getRight() != null) stack.push(temp.getRight());
            if(temp.getLeft() != null) stack.push(temp.getLeft());
        }
        return res;
    }

    public static ArrayList<Integer> inorder(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        boolean isDone = false;

        while(!isDone){
            if(curr != null){
                stack.push(curr);
                curr = curr.getLeft();
            }else{
                if(stack.isEmpty()) isDone = true;
                else{
                    curr = stack.pop();
                    res.add(curr.getData());
                    curr = curr.getRight();
                }
            }
        }
        return res;
    }

    
    public static ArrayList<Integer> postorder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Node prev = null;

        while (!stack.isEmpty()) {
            Node curr = stack.peek();

            // Fix 1: Moving DOWN (Parent to Child)
            if (prev == null || prev.getLeft() == curr || prev.getRight() == curr) {
                if (curr.getLeft() != null) {
                    stack.push(curr.getLeft());
                } else if (curr.getRight() != null) {
                    stack.push(curr.getRight());
                } else {
                    res.add(curr.getData());
                    stack.pop();
                }
            } 
            // Fix 2: Moving BACK UP from Left Child
            else if (curr.getLeft() == prev) {
                if (curr.getRight() != null) {
                    stack.push(curr.getRight());
                } else {
                    res.add(curr.getData());
                    stack.pop();
                }
            } 
            // Fix 3: Moving BACK UP from Right Child (or finished Left with no Right)
            else {
                res.add(curr.getData());
                stack.pop();
            }
            prev = curr;
        }
        return res;
    }


    public static void main(String[] args) {
        Node l = new Node(10, new Node(6), new Node(89));
        l.getLeft().setLeft(new Node(69));
        Node r = new Node(55, new Node(23), new Node(78));
        Node head = new Node(777 ,l , r);

        IO.println(head.toString());
        IO.println("preorder="+preorder(head));
        IO.println("inorder="+inorder(head));
        IO.println("postorder="+postorder(head));
        // IO.println("postorder+trick="+preorder(head).reversed());
    }
}
