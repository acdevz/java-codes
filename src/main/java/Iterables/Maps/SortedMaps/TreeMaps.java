package Iterables.Maps.SortedMaps;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {

            TreeMap<Integer, String> tm = new TreeMap<>();
            tm.put(1, "One");
            tm.put(2, "Two");
            tm.put(3, "Three");
            tm.put(4, "Four");

            System.out.println(tm.values());
            // traversing the TreeMap
            // 1. using keySet()
            for (Integer key : tm.keySet()) {
                System.out.println(key + " : " + tm.get(key));
            }

            // 2. using entrySet()
    }
}
