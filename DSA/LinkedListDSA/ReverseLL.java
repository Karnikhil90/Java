public class ReverseLL {
    public Node reverseList(Node head) {
        // Base case: if list is empty or has reached the last node
        if (head == null || head.next == null) {
            return head;
        }

        // Recursive step: reverse the rest of the list
        Node newHead = reverseList(head.next);

        // The "Magic" flip:
        // Set the next node's next pointer back to the current node
        head.next.next = head; 
        // Break the old forward link to avoid cycles
        head.next = null;

        return newHead;
    }

}
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            var temp = head.next; // Save the rest of the list
            head.next = prev;     // Reverse the pointer
            prev = head;          // Move prev forward
            head = temp;          // Move head forward
        }

        // prev is now pointing to the new head of the reversed list
        return prev; 
    }
}
}
