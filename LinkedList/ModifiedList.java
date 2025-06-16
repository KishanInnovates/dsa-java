import java.util.HashSet;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}


public class ModifiedList {
    public static void main(String[] args) {

    }

    public static Node modifiedLinkedList(int[] nums, Node head) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node current = dummy;

        while (current != null && current.next != null) {
            if (set.contains(current.next.value)) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return dummy;
    }
}
