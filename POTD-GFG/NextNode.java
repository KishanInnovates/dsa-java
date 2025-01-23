class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}

class NextNode{
    public static void main(String[] args) {
        
    }
    Node cloneLinkedList(Node head) {
        if (head == null) return null;

        for (Node t = head; t != null; t = t.next.next) {
            Node n = new Node(t.data);
            n.next = t.next;
            t.next = n;
        }
        for (Node t = head; t != null; t = t.next.next) {
            if (t.random != null) t.next.random = t.random.next;
        }
        Node newHead = head.next;
        for (Node t = head; t != null; t = t.next) {
            Node temp = t.next;
            t.next = temp.next;
            if (temp.next != null) temp.next = temp.next.next;
        }
        return newHead;
    }
}