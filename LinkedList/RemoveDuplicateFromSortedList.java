class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

public class RemoveDuplicateFromSortedList {
    public static void main(String[] args) {
        // Example: 1 -> 1 -> 2 -> 3 -> 3
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        System.out.println("Original List:");
        printList(head);
        head = removeDuplicate(head);

        System.out.println("List after removing duplicates:");
        printList(head);
    }

    public static Node removeDuplicate(Node root) {
        if (root == null)
            return null;

        Node current = root;
        if (current != null && current.next != null) {
            if (current.value == current.next.value) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return root;
    }
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.value + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
