class Node{
    Node next;
    int val;
    public Node(){}
    public Node(int val, Node next){
        this.val = val;
        this.next = next;
    }
    public Node(int val){
        this(val,null);
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((next == null) ? 0 : next.hashCode());
        result = prime * result + val;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Node other = (Node) obj;
        if (next == null) {
            if (other.next != null)
                return false;
        } else if (!next.equals(other.next))
            return false;
        if (val != other.val)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Node [next=" + next + ", val=" + val + ", toString()=" + super.toString() + "]";
    }
    
}


public class MyStack {
    Node head;
    int len;
    
    boolean isEmpty(){
        return head == null;
    }

    int peek(){
        if(isEmpty()) {
            System.out.println("underflow");
            return -1;
        }
        return head.val;
    }
    int pop(){
        if(isEmpty()) {
            System.out.println("underflow");
            return -1;
        }
        len--;
        var pop_val = head.val;
        head = head.next;
        return pop_val;
    }
    void push(int ele){
        Node node = new Node(ele,head);
        // if(!isEmpty()) head = node;
        // node.next = head;
        head = node;
        len++;
    }
    int size(){
        return len;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        var temp = head;
        sb.append("[");
        while(temp != null){
            sb.append(temp.val);
            if(temp.next != null) sb.append(", ");
            temp = temp.next;
        }
        sb.append("]");
        
        return sb.toString();
    }
    public static void main(String[] args) {
        MyStack st = new MyStack();

        st.push(10);
        st.push(12);
        st.push(66);
        st.push(98);
        st.push(34);

        System.out.println(st);
        System.out.println(st.size());
        System.out.println("pop="+st.pop());
        System.out.println(st);
        System.out.println(st.size());
        System.out.println("peek="+st.peek());
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        // st.pop();
        System.out.println(st);
        System.out.println(st.size());
    }

}