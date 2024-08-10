class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

public class kthNode {
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);
        head1.next.next.next.next.next.next.next = new Node(8);
        head1.next.next.next.next.next.next.next.next = new Node(9);

        System.out.println(kthNodeFromLast(head1, 2)); //output : 8
    }

    public static int kthNodeFromLast(Node head, int k) {
        Node first = head;
        Node second = head;

        for (int i = 0; i < k; i++) {
            if (first == null) {
                return -1;
            }
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }
        return second.value;
    }
}
