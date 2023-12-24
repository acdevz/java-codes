package Iterables.Maps;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "One");
        hm.put(2, "Two");
        hm.put(3, "Three");

        System.out.println(hm);

        System.out.println(hm.get(2));

        // traversing the HashMap
        // 1. using keySet()
        for (Integer key : hm.keySet()) {
            System.out.println(key + " : " + hm.get(key));
        }

        // 2. using entrySet()
        for (HashMap.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 3. using forEach()
        hm.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
