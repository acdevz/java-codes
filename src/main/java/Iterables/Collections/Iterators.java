package Iterables.Collections;

import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        Iterator<Integer> it = new Iterator<Integer>() {
            int i = 0;
            @Override
            public boolean hasNext() {
                return i < 5;
            }

            @Override
            public Integer next() {
                return i++;
            }
        };
    }
}
