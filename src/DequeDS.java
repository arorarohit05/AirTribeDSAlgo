import java.util.ArrayDeque;
import java.util.Deque;

// Sliging window maximum

// n element
// maximum

// [a b c d e f g h i j]
// m1

public class DequeDS {

//   first                      last
    //     70     60   50   100

    // doubly ended queue
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(50);
        deque.addFirst(60);
        deque.addFirst(70);

        deque.addLast(100);

       // System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
