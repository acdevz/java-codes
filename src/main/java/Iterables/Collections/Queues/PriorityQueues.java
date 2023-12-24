package Iterables.Collections.Queues;

import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {

//        Queue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(12);
        pq.add(36);
        pq.add(24);

        System.out.println(pq);

        System.out.println(pq.remove());
        System.out.println(pq.remove());

        System.out.println(pq.peek());
        System.out.println(pq.poll()); // returns null if queue is empty else returns the element and removes it

    }
}
