class Node {
    int val;
    Node next;
    Node() {}
    Node(int val) {this.val = val;}
    Node(int val, Node next){
        this.val = val;
        this.next = next;
    }
}

class RemoveDuplicates {
    public Node deleteDuplicate(Node head) {
        if (head == null) {
            return null;
        }
        Node current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("End");
    }
    public static void main(String[] args) {
        Node head1 = new Node(1, new Node(1, new Node(2)));
        RemoveDuplicates sol = new RemoveDuplicates();
        Node result = sol.deleteDuplicate(head1);
        System.out.println("Output: ");
        printList(head1);
    }
}
