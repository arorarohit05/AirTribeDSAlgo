import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class HeapStruture {


    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap   // min

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder()); // max heap   // min

        pq2.add(10);
        pq2.add(100);
        pq2.add(2);
        pq2.add(50);
        pq2.add(5);
        pq2.add(20);

        System.out.println(pq2.poll());


        pq.add(10);
        pq.add(100);
        pq.add(2);
        pq.add(50);
        pq.add(5);
        pq.add(20);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}



//  Stone weighs problem

// array of stones
// 2 7 4 1 8 1 1
//  2 4 1 1 1 1
//  2 1 1 1 1
//
//
 // 0

// max heap

// equal size - both
// smaller one fully destroyem, larger one = larger - smaller




