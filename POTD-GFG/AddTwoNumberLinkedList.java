class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
public class AddTwoNumberLinkedList {
    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(5);

        Node head2 = new Node(3);
        head2.next = new Node(4);
        head2.next.next = new Node(5);

        Node sum = addTwoLinkedList(head, head2);
        printList(sum);
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    public static Node addTwoLinkedList(Node head1, Node head2) {
        head1 = reverse(head1);
        head2 = reverse(head2);
        Node dummyNode = new Node(-1);
        int carry = 0;
        Node current = dummyNode;
        Node p1 = head1, p2 = head2;

        while (p1 != null || p2 != null || carry > 0) {
            int sum = carry;
            if (p1 != null) {
                sum += p1.data;
                p1 = p1.next;
            }
                
            if (p2 != null) {
                sum += p2.data;
                p2 = p2.next;
            }
                

            current.next = new Node(sum % 10);
            carry = sum / 10;
            current = current.next;
            
                
        }
        
        return reverse(dummyNode.next);
    }
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }
}
