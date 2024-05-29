public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(9);
        list.insertFirst(44);
        list.insertLast(99);
        list.insert(100, 3);
        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(2));
    
         DLL list1 = new DLL();
        list1.insertFirst(3);
        list1.insertFirst(4);
        list1.insertFirst(5);
        list1.insertFirst(9);
        list1.inserLast(99);
        list1.display();
    }
}
