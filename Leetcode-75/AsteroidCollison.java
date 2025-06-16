import java.util.Stack;

public class AsteroidCollison {
    public static void main(String[] args) {
        
    }

    public int[] asteriodCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            boolean destrotyed = false;
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                int top = stack.peek();
                if (Math.abs(asteroid) == top) {
                    stack.pop();
                    destrotyed = true;
                    break;
                } else if (Math.abs(asteroid) > top) {
                    stack.pop();
                } else {
                    destrotyed = true;
                    break;
                }
            }
            if (!destrotyed) {
                stack.push(asteroid);
            }
        }
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}
