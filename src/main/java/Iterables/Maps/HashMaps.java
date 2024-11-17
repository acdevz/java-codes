package Iterables.Maps;

import java.util.*;

public class HashMaps {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();
        Map.Entry<Character, Integer> entry = Map.entry('a', 1);
        hm.put(1, "One");
        hm.put(2, "Two");
        hm.put(3, "Three");
        hm.put(4, "Four");

//        System.out.println(hm.size());
//
//        System.out.println(hm.get(2));


//        System.out.println(hm.values());
        // traversing the HashMap
        // 1. using keySet()
//        for (Integer key : hm.keySet()) {
//            System.out.println(key + " : " + hm.get(key));
//        }

        // 2. using entrySet()
//        for (HashMap.Entry<Integer, String> entry : hm.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

        // 3. using forEach()
//        hm.forEach((key, value) -> System.out.println(key + " : " + value));

        // 4. using iterator
//        Iterator<Map.Entry<Integer, String>> itr = hm.entrySet().iterator();

        /* ⭐⭐⭐ */
        Integer key = hm.entrySet().iterator().next().getKey();
        System.out.println(key + " : " + hm.get(key));
        System.out.println(key + 1 + " : " + hm.get(key + 1));
        System.out.println(key + 2 + " : " + hm.get(key + 2));


        /* interesting */
        Map<Integer, List<Integer>> adj = new HashMap<>();
        adj.computeIfAbsent(0, x -> new ArrayList<>()).add(2);
        adj.computeIfAbsent(0, x -> new ArrayList<>()).add(5);
        for(int node : adj.get(0))
            System.out.println(node);
     }
}
