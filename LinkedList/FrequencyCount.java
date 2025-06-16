class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class FrequencyCount {
    public static void main(String[] args) {

    }

    public static int countFreq(Node root, int key) {
        int count = 0;
        while (root != null) {
            if (root.data == key) {
                count++;
            }
        }
        return count;
    }
}