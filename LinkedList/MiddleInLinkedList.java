class Node {
    int val;
    ListNode next;

    Node() {
    };

    Node(int val) {
        this.val = val;
    }

    Node(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MiddleInLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
              ListNode middle = middleNode(head);

        // Print the list from the middle node
        while (middle != null) {
            System.out.print(middle.val + " ");
            middle = middle.next;
        }
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
