class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

public class RotateLinkedList {
    public static void main(String[] args) {

    }

    public static Node findNthNode(Node temp, int k) {
        int count = 1;
        while (temp != null) {
            if (count == k)
                return temp;
            count++;
            temp = temp.next;

        }
        return temp;
    }

    public static Node rotate(Node head, int k) {
        if (head == null || k == 0)
            return head;
        int len = 1;
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        if (k % len == 0)
            return head;
        k = k % len;
        tail.next = head;
        Node newLastNode = findNthNode(head, len - k);
        head = newLastNode.next;
        newLastNode.next = null;
        return head;
    }
}
