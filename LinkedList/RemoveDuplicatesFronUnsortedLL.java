import java.util.HashSet;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class RemoveDuplicatesFronUnsortedLL {
    public static void main(String[] args) {

    }

    public static Node removeDuplicates(Node head) {
        if (head == null)
            return null;
        
        Node current = head;
        Node prev = null;
        HashSet<Integer> seen = new HashSet<>();

        while (current != null) {
            if (seen.contains(current.data)) {
                prev.next = current.next;
            } else {
                seen.add(current.data);
                prev = current;
            }
            current = current.next;
        }
        return head;
    }
}
