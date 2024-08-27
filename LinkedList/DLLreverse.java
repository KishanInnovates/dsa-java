public class DLLreverse {
    public static void main(String[] args) {

    }
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        DLLNode current = head;
        DLLNode temp = null;
        
        while(current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
        return head;
    }
}
