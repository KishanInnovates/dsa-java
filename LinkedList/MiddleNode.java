class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

public class MiddleNode {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        Node head1 = middle(head);
        printlist(head1);
    }

    public static Node middle(Node root) {
        if (root == null || root.next == null)
            return null;

        Node slow = root;
        Node fast = root;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return root;
    }

    public static void printlist(Node head) {
        while(head != null){
            System.out.print(head.value + " ");
            head = head.next;
        }
    }
}
