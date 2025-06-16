class Ndoe {
    int value;
    Node next;

    void Node(int value){
        this.value = value;
    }
}
public class RemoveNodeFromEnd {
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        Node result1 = removeNthFromEnd(head1, 2);
        while (head1 != null) {
            System.out.print(head1.value + " ");
            head1 = head1.next;
        }
        System.out.println(); //output : 1 2 3 5
    }

    public static Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node first = dummy;
        Node second = dummy;
        
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        return dummy.next;
        //return
    }
}
