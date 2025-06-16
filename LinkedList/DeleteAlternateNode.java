class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}


class DeleteAlternateNode {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        deleteAlternate(head);
        printNode(head);
    }

    public static void deleteAlternate(Node root) {
        if (root == null)
            return;

        Node current = root;
        while (current != null && current.next != null) {
            current.next = current.next.next;
            current = current.next;
        }
        
    }

    public static void printNode(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }
}
