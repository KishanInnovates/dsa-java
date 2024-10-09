class Node {
    int data;
    Node right, down;

    Node(int data) {
        this.data = data;
    }
}


class LinkedListMatrix {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Node head = constructMatrix(mat);
        print2DLinkedList(head);
    }

    public static Node constructMatrix(int[][] arr) {
        int n = arr.length;
        Node[][] nodes = new Node[n][n];

        //construct the linked list matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nodes[i][j] = new Node(arr[i][j]);
            }
        }

        //linked to the right and down node

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - 1) {
                    nodes[i][j].right = nodes[i][j + 1];
                }
                if (i < n - 1) {
                    nodes[i][j].down = nodes[i + 1][j];
                }
            }
        }
        return nodes[0][0];
    }

    public static void print2DLinkedList(Node head) {
        Node down = head;
        while (down != null) {
            Node right = down;
            while (right != null) {
                System.out.print(right.data + " ");
                right = right.right;
            }
            System.out.println();
            down = down.down;
        }
    }
}
