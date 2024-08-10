class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

public class insertLast {
    public static void main(String[] args) {
        Node head = new Node(1);
         head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head = insertLastNode(head, 6);
        System.out.println(head);
    }

    public static Node insertLastNode(Node head, int x) {
        Node newNode = new Node(x);

        if (head == null) {
            return newNode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;

    }
}
