class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class DeleteNodeHavingGreaterValue {
    public static void main(String[] args) {

    }

    public static Node compute(Node head) {
        head = reverse(head);

        Node current = head;
        int maxSoFar = current.data;
        Node temp = current;

        while (temp != null && temp.next != null) {
            if (temp.next.data < maxSoFar) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
                maxSoFar = temp.data;
            }
        }
        return reverse(head);
    }

    public static Node reverse(Node head) {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
