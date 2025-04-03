class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class ReverseLinkedListII {
    public static void main(String[] args) {

    }

    public static Node reverseBetween(Node head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        Node start = prev.next;
        Node then = start.next;

        for (int i = 0; i < right - left; i++) {
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }
        return dummy.next;
    }
}
