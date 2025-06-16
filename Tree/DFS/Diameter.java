class Node {
    int value;
    Node left;
    Node right;

    Node(){

    }
    Node(int value){
        this.value = value;
    } 
}
class Diameter{
    public static void main(String[] args) {
            //time complexity O(n)
    }

    static int diameter = 0;

    public static int diameterOfATree(Node root) {
        height(root);
        return diameter - 1;
    }

    public static int height(Node node) {
        if (node == null)
            return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int dia = leftHeight + rightHeight + 1;
        diameter = Math.max(dia, diameter);

        return Math.max(leftHeight, rightHeight) + 1;
        }
    }