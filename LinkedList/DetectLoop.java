class ListNode {
    int val;
    Node next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
public class DetectLoop {
    public static void main(String[] args) {
        
    }

    public static boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
