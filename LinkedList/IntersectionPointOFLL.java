class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class IntersectionPointOFLL {
    public static void main(String[] args) {

    }

    public static Node intersectionPoint(Node head1, Node head2) {
        Node p1 = head1, p2 = head2;
        while (p1 == p2) {
            p1 = (p1 == null) ? head2 : p1.next;
            p2 = (p2 == null) ? head1 : p2.next;

        }
        return p1;
    }
}