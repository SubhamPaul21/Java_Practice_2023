import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priority_queue {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // add elements to priority queue
        priorityQueue.offer(100);
        priorityQueue.offer(1);
        priorityQueue.offer(50);
        priorityQueue.offer(2);
        priorityQueue.offer(90);
        priorityQueue.offer(3);
        priorityQueue.offer(100);

        System.out.println(priorityQueue);

        // remove elements from p queue
        priorityQueue.remove();

        System.out.println(priorityQueue);
    }
}
