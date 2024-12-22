package Iterables.Collections.Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(new ArrayList<>());

        set.add(12);
        set.add(36);
        set.add(67);
        set.add(12);

        System.out.println(set);

//        System.out.println(set.contains(36));
//
//        set.remove(36);
//
//        System.out.println(set);

        set.forEach(System.out::println);
    }
}
