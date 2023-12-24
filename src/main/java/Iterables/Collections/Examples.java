package Iterables.Collections;

import oops.interfaces.nestedInterface.A;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Examples {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Collections.addAll(list, 12, 36, 67, 24, 75);
        System.out.println(list);

        Collections.sort(list); // sorts in ascending order O(nlogn)
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); // sorts in descending order
        System.out.println(list);

        Integer key = 36;
        System.out.println("Index of " + key + " is " + Collections.binarySearch(list, key));

        /* Copy */
        List<String> src = new ArrayList<>();
        List<String> dest = new ArrayList<>();

        Collections.addAll(src, "A", "B", "C");
        Collections.addAll(dest, "1", "2", "3", "4", "5");

        Collections.copy(dest, src);

        System.out.println(src);
        System.out.println(dest);
    }
}
 