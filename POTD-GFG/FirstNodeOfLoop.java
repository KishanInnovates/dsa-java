class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}
public class FirstNodeOfLoop {
    public static void main(String[] args) {

    }

    public static Node firstNodeOfLoop(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
