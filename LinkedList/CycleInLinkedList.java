class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class CycleInLinkedList {
    public static void main(String[] args) {
        // Test cases
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // cycle here

        CycleInLinkedList solution = new CycleInLinkedList();
        ListNode cycleNode = solution.detectCycle(node1);

        if (cycleNode != null) {
            //output
            System.out.println("Cycle detected at node with value: " + cycleNode.val);
        } else {
            System.out.println("No cycle detected");
        }
    }

    public int lengthOfCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode temp = slow;
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

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                int length = lengthOfCycle(slow);
                // find the start node
                ListNode first = head;
                ListNode second = head;

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
