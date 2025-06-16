class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class JoinTwoLL{
    public static void main(String[] args) {
        //o(n)
    }
    public static Node joinTwoLL(Node head1, Node head2){
        Node current = head1;
        while(current.next != null){
            current = current.next;
        }
        current.next = head2;
        return head1;
    }
}