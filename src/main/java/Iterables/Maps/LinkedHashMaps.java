package Iterables.Maps;

import java.util.LinkedHashMap;
import Iterables.Maps.LinkedHashMaps;

public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
//        get elements in reverse order
        lhm.put(1, "one");
        lhm.put(2, "two");
        lhm.put(3, "three");
        lhm.put(4, "four");
        lhm.put(5, "five");

        System.out.println(lhm);

        System.out.println(lhm.get(3));

        lhm.remove(3);

        System.out.println(lhm);

        lhm.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println(lhm.keySet());
        /*iterating over keySet using for loop i*/
        for (Integer i : lhm.keySet()) {
            System.out.println(i);
        }

        /*with int i = 0; i < ....*/
        for (int i = 0; i < lhm.size(); i++) {
            System.out.println(lhm.get(i));
        }
    }

}
