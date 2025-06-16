class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

class ReverseKGroup {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        int k = 4;
        head = reverseKGroup(head, k);
        printList(head);
    }

    public static Node reverseKGroup(Node node, int k) {
        Node current = node;
        int count = 0;

        while (current != null && count < k) {
            current = current.next;
            count++;
        }
        if (count == k) {
            Node prev = null;
            Node next = null;
            current = node;
            for (int i = 0; i < k; i++) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            node.next = reverseKGroup(current, k);
            return prev;
        }
        return node;
    }
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.value + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }
}