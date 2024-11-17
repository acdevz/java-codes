package Iterables.Collections.Queues;

import java.util.Collections;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        PriorityQueue<Map.Entry<Character, Integer>> pq1 = new PriorityQueue<>(
////                (a, b) -> a.getValue() == b.getValue() ? a.getKey() - b.getKey() : a.getValue() - b.getValue()
//                Collections.reverseOrder()
//        );

        pq.add(12);
        pq.add(36);
        pq.add(24);
        pq.add(67);
//        return first element from front of the queue
//        System.out.println(pq.element());
//        return first element from end of the queue
//        System.out.println(pq.peek());


        System.out.println(pq.poll());

//        System.out.println(pq.remove());
//        System.out.println(pq.remove());

//        System.out.println(pq.peek());
//        System.out.println(pq.poll()); // returns null if queue is empty else returns the element and removes it

    }
}
