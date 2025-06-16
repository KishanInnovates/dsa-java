class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class InsertInASortedList{
    public static void main(String[] args) {
        Node node = new Node(0);
        node.next = new Node(1);
    }

    public static Node sortedInsert(Node head, int key) {
        Node newNode = new Node(key);
        if(head == null || key < head.data){
            newNode.next = head;
            return newNode;
        }

        Node current = head;
        while(current.next != null && current.next.data < key){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }
}