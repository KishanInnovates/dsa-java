import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
    }
}
class IterativePostorder{
    public static void main(String[] args){

    }
    public static List<Integer> postorderTraversal(Node root){
        List<Integer> result = new ArrayList<>();
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
    }
}