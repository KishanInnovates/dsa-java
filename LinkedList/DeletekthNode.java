class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}



class DeletekthNode {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head = removek(head, 2);
        printList(head);
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static Node removek(Node head, int k) {
        if (head == null)
            return null;

        if (k == 1) {
            Node temp = head;
            head = head.next;
            return head;
        }
        int count = 0;
        Node current = head;
        Node prev = null;
        while (current != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = current;
            current = current.next;
        }
        return head;
    }
}
