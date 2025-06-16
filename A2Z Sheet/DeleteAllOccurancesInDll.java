class Node{
    int value;
    Node next, prev;

    Node(int value) {
        this.value = value;
    }
}

public class DeleteAllOccurancesInDll {
    public static void main(String[] args) {
        //gfg
    }

    public static Node deleteAllOccur(Node head, int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == key) {
                if (temp == head) {
                    head = head.next;
                }
                Node prevNode = temp.prev;
                Node nextNode = temp.next;
                if (nextNode != null)
                    nextNode.prev = prevNode;
                if (prevNode != null)
                    prevNode.next = nextNode;
                temp = nextNode;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}
