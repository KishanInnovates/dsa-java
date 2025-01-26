class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}
public class RemoveLoopFromLinkedList {
    public static void main(String[] args) {

    }

    public static void removeLoop(Node head) {
        if (head == null || head.next == null)
            return ;
        
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        if (fast == null || fast.next == null)
            return;
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        Node prev = null;
        while (fast.next != slow) {
            prev = fast;
            fast = fast.next;
        }
        fast.next = null;
    }
    
}