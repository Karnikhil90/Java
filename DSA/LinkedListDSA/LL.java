package DSA.LinkedListDSA;

public class LL {

    private int size;
    Node head;

    class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    private LL() {
        size = 0;
    }

    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void print() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "-> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("ErrorType : Empty list");
            return;
        }
        head = head.next;
        size--;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.add("Nikil");
        list.add("Karmakar");
        list.add("is");
        list.add("my");
        list.add("name");
        list.removeFirst();
        list.removeFirst();

        list.print();
    }
}
