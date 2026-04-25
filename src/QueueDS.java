import java.util.LinkedList;
import java.util.Queue;

public class QueueDS {

// FIFO
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(50);
        queue.add(60);
        queue.add(70);

        System.out.println(queue.peek());

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        System.out.println(queue.isEmpty());
    }
}
