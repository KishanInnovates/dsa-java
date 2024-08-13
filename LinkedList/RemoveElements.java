class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

public class RemoveElements {
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(6);
        head1.next.next.next = new Node(3);
        head1.next.next.next.next = new Node(4);
        head1.next.next.next.next.next = new Node(5);
        head1.next.next.next.next.next.next = new Node(6);

        
        Node newHead1 = removeElements(head1, 6);
        System.out.println(newHead1);
    }

    public static Node removeElements(Node head, int val) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node current = head;
        Node prev = dummy;

        while (current != null) {
            if (current.value == val) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }
        return dummy.next;
    }
}
