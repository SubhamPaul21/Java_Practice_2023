import java.util.LinkedList;
import java.util.Queue;

public class linked_list_queue {

    public static void main(String[] args) {
        Queue<Integer> linkedListQueue = new LinkedList<>();

        // add element
        linkedListQueue.add(1);
        linkedListQueue.offer(2);

        System.out.println(linkedListQueue);

        //remove elements
        // linkedListQueue.poll();
        // linkedListQueue.remove();
    
        // peek at the head of queue
        linkedListQueue.peek();
        linkedListQueue.element();
    }
}