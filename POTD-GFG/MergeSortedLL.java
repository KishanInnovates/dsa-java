class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class MergeSortedLL {
    public static void main(String[] args) {

    }

    public static Node merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node current = dummy;
        Node p1 = head1;
        Node p2 = head2;

        while (p1 != null && p2 != null) {
            if (p1.data <= p2.data) {
                current.next = p1;
                p1 = p1.next;
            } else {
                current.next = p2;
                p2 = p2.next;
            }
            current = current.next;
        }
        current.next = (p1 != null) ? p1 : p2;
        return dummy.next;
    }
}
