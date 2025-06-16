import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;;

class StonePile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            Deque<Integer> deque = new ArrayDeque<>();
            for (int i = 0; i < n; i++) {
                deque.addLast(scanner.nextInt());
            }
            boolean isAman = true;
            int lastPlayer = -1;

            while (deque.size() > 1) {
                if (isAman) {
                    deque.addLast(deque.pollFirst());
                    deque.pollFirst();
                    lastPlayer = 1;
                } else {
                    deque.addLast(deque.pollFirst());
                    deque.addLast(deque.pollFirst());
                    deque.pollFirst();
                    lastPlayer = 0;
                }
                isAman = !isAman;

            }
            System.out.println(lastPlayer + " " + deque.peek());
        }
    }
}