import java.util.List;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        // Follows Last In First Out (LIFO) principle
        List<Integer> stack = new Stack<>();

        // add elements to stack
        stack.add(2);
        stack.add(2);
        stack.add(5);
        stack.add(10);
        stack.add(15);

        // System.out.println(stack);

        // stack.push(2);
        // stack.push(2);
        // stack.push(5);
        // stack.push(10);
        // stack.push(15);

        System.out.println(stack);

        // Remove elements from stack
        stack.removeLast();
        // stack.pop();
        System.out.println(stack);

        // Peek at last element
        System.out.println(stack.getLast());

        System.out.println(stack);
        // System.out.println(stack.lastElement());
        // System.out.println(stack.peek());
    }
}
