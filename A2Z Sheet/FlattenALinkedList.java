class Node {
    int value;
    Node next;
    Node child;

    Node(int value) {
        this.value = value;
    }
}

public class FlattenALinkedList {
    public static void main(String[] args) {

    }

    public static Node merge(Node list1, Node list2) {
        Node dummyNode = new Node(-1);
        Node res = dummyNode;
        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                res.child = list1;
                res = list1;
                list1 = list1.child;
            } else {
                res.child = list2;
                res = list2;
                list2 = list2.child;
            }
            res.next = null;
        }
        if (list1 != null) {
            res.child = list1;
        } else {
            res.child = list2;
        }

        if (dummyNode.child != null) {
            dummyNode.child.next = null;
        }
        return dummyNode.child;
    }

    public static Node flattenLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mergedHead = flattenLinkedList(head.next);
        head = merge(head, mergedHead);
        return head;
    }
}
