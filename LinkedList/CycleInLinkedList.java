class Node {
    int val;
    Node next;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

public class CycleInLinkedList {
    public static void main(String[] args) {
        // Test cases
        Node node1 = new Node(3);
        Node node2 = new Node(2);
        Node node3 = new Node(0);
        Node node4 = new Node(-4);
        
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // cycle here

        CycleInLinkedList solution = new CycleInLinkedList();
        Node cycleNode = solution.detectCycle(node1);

        if (cycleNode != null) {
            //output
            System.out.println("Cycle detected at node with value: " + cycleNode.val);
        } else {
            System.out.println("No cycle detected");
        }
    }

    public int lengthOfCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                Node temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    public Node detectCycle(Node head) {
        Node fast = head;
        Node slow = head;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                int length = lengthOfCycle(slow);
                // find the start node
                Node first = head;
                Node second = head;

                while (length > 0) {
                    second = second.next;
                    length--;
                }

                // keep moving both forward and they will meet at start
                while (first != second) {
                    first = first.next;
                    second = second.next;
                }
                return second;
            }
        }
        return null;
    }
}
