package Iterables.Collections.Sets;

import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(12);
        lhs.add(36);
        lhs.add(67);
        lhs.add(12);

        System.out.println(lhs);

        System.out.println(lhs.contains(36));

        lhs.remove(36);
//        remove first element
        lhs.remove(lhs.iterator().next());

        System.out.println(lhs);

        lhs.forEach(System.out::println);
    }
}
