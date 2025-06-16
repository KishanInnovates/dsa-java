class Node{
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

public class CountLength {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(5);
        node.next.next = new Node(6);
        int length = countLength(node);
        System.out.println(length);
    }

    public static int countLength(Node head) {
        int length = 1;
        Node current = head;
        while (current.next != null) {
            length++;
            current = current.next;
        }
        return length;
    }
}
