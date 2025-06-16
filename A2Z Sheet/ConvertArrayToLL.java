class Node {
    int value;
    Node next;
    Node(int value){
        this.value = value;
    }
}
public class ConvertArrayToLL {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Node head = convert(arr);
        printlist(head);
    }

    public static Node convert(int[] arr) {
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            current.next = temp;
            current = current.next;
        }
        
        return head;
    }

    public static void printlist(Node head) {
        while (head != null) {
            System.out.print(head.value + " -> ");
            head = head.next;
        }
    }
}
