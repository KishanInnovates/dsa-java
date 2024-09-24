class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class TwinSum {
    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);

        int result = pairSum(head);
        System.out.println("The maximum twin sum in the linked list is : " + result);
    }

    public static int pairSum(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node firstHalf = head;
        Node secondHalf = reverse(slow);
        int maxTwinSum = 0;

        while (secondHalf != null) {
            int twinSum = firstHalf.data + secondHalf.data;
            maxTwinSum = Math.max(maxTwinSum, twinSum);
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return maxTwinSum;
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }
    
}