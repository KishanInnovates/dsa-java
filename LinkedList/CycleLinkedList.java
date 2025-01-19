class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

class CycleLinkedList {
    public static void main(String[] args) {

    }

    public static Node detectCycle(Node root) {
        Node slow = root;
        Node fast = root;

        while (fast != null & fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = root;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    //https://www.codechef.com/practice/course/linked-lists/LINKLISTF/problems/PREP58
}