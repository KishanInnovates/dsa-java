class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

public class MoveToFront {
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(5);
        head.next.next = new Node(6);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        head = moveLastToFront(head);
        printList(head);
    }

    public static Node moveLastToFront(Node head) {
        if (head == null || head.next == null)
            return head;

        Node secondLast = null;
        Node last = head;
        while (last.next != null) {
            secondLast = last;
            last = last.next;
        }
        secondLast.next = null;
        last.next = head;
        head = last;
        return head;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
