class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}


class GetNthNode {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int result = NthNode(head, 3);
        System.out.println("The value of the Node " + result);

    }

    public static int NthNode(Node head, int index) {
        Node current = head;
        int count = 1;

        while (current != null) {
            if (count == index) {
                return current.data;
            }
            current = current.next;
            count++;
        }
        return -1;
   }
}
