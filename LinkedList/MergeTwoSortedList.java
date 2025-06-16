class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;}
}
class MergeTwoSortedList {

    Node sortedMerge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node current = dummy;

        Node p1 = head1;
        Node p2 = head2;

        while (p1 != null && p2 != null) {
            if (p1.data <= p2.data) {
                current.next = p1;
                p1 = p1.next;
            } else {
                current.next = p2;
                p2 = p2.next;
            }
            current = current.next;
        }
        current.next = (p1 != null) ? p1 : p2;
        return dummy.next;
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public static void main(String[] args) {
        MergeTwoSortedList list = new MergeTwoSortedList();
          Node head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        head1.next.next.next = new Node(40);
        head1.next.next.next.next = new Node(50);
        
         Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);
        head2.next.next.next = new Node(70);

        Node mergedHead1 = list.sortedMerge(head1, head2);
        System.out.print("Merged List 1: ");
        list.printList(mergedHead1);
    }
}