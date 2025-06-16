class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}


class RemoveTail {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = removeTail(head);
        printList(head);
    }

    public static Node removeTail(Node head) {
        if (head == null || head.next == null)
            return null;

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
