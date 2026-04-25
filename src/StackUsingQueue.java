import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    Queue<Integer> queue = new LinkedList<>(); // queue available


    private boolean isEmpty() {
        return queue.isEmpty();
    }

    private int size() {
        return queue.size();
    }

    private int pop() {
        if(!queue.isEmpty()){
           return queue.remove();
        }
        return -1;
    }

    private void push(int x) {
        queue.add(x);

        int size = queue.size(); // 5
        for(int i=1;i<size;i++){
            queue.add(queue.remove());// rotation
        }
    }


    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.push(50);
        stack.push(60);
        stack.push(70);

        System.out.println(stack.pop());

        System.out.println(stack.size());

        System.out.println(stack.isEmpty());
    }


}
