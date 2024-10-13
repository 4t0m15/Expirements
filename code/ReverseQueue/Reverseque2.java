import java.util.Stack;
public class NotMyReverseQueue {
    public static <T> void reverseQueue(Queue<T> queue) {
        Stack<T> stack = new Stack<>();
        while (!queue.isEmpty()) {stack.push(queue.dequeue());}
        while (!stack.isEmpty()) {queue.enqueue(stack.pop());}
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        reverseQueue(queue);
        System.out.println(queue.dequeue());  // Output: 3
        System.out.println(queue.dequeue());  // Output: 2
        System.out.println(queue.dequeue());  // Output: 1
    }
}