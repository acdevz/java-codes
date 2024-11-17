package Iterables.Collections.Queues;

import java.util.ArrayDeque;

public class ArrayDeques {
    public static void main(String[] args) {

        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.add(12);
        ad.add(36);

        ad.addFirst(67);
        ad.addLast(75);

//        ad.removeFirst();
//        ad.removeLast();

//        ad.remove(0);

        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());

        System.out.println(ad);
        System.out.println(ad.contains(36));

        System.out.println(ad);
        ad.clear();

    }
}
