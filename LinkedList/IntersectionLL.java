class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class IntersectionLL {
    public static void main(String[] args) {

    }

    public static Node intersectionLL(Node head1, Node head2) {
        Node dummyNode = new Node(0);
        Node tail = dummyNode;

        while (head1 != null && head2 != null) {
            if (head1.data == head2.data) {
                tail.next = new Node(head1.data);
                tail = tail.next;
                head1 = head1.next;
                head2 = head2.next;
            } else if (head1.data < head2.data) {
                head1 = head1.next;
            } else {
                head2 = head2.next;
            }
        }
        return dummyNode.next;
    }
}
