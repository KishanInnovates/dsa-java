class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class MultiplyLL {
    static final int MOD = 1000000007;
    public static void main(String[] args) {

    }

    public static long getNumber(Node head) {
        long num = 0;
        while (head != null) {
            num = (num * 10 + head.data) % MOD;
            head = head.next;
        }
        return num;
    }

    public static long multiplyLL(Node first, Node second) {
        long num1 = getNumber(first);
        long num2 = getNumber(second);
        return (num1 * num2) % MOD;
    }
}
