import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class array_deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // adding elements in deque from first and last
        deque.add(2);
        deque.add(5);
        deque.offerFirst(10);
        deque.offerLast(100);

        // removing elements in deque from first and last
        // deque.removeFirst();
        // deque.pollFirst();
        // deque.removeLast();
        // deque.pollLast();

        // peek first and last elements
        deque.peekFirst();
        deque.peekLast();
    }
}
