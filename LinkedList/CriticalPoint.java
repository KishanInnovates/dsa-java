class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

class CriticalPoint{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 3, 3, 5, 1, 3}; // Expected output: 2
        int[] arr2 = {1, 2, 3, 2, 1, 3, 2};    // Expected output: 3

        Node head1 = createList(arr1);
        Node head2 = createList(arr2);

        System.out.println("Critical points count: " + countCriticalPoints(head1));
        System.out.println("Critical points count: " + countCriticalPoints(head2));
    }
        //https://www.codechef.com/practice/course/linked-lists/LINKLISTF/problems/CRITLIST

    public static int countCriticalPoints(Node head) {
        if (head == null || head.next == null || head.next.next == null)
            return 0;

        Node prev = head;
        Node current = head.next;
        Node next = head.next.next;
        int count = 0;

        while (next != null) {
            if ((prev.value > current.value && current.value < next.value)
                    || (prev.value < current.value && current.value > next.value)) {
                count++;
            }
            prev = current;
                current = next;
                next = next.next;
        }
        return count;
    }

    public static Node createList(int[] arr) {
        if (arr.length == 0)
            return null;
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }
}