package Consumers;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        /* Consumers */
        Consumer<Integer> c = (x) -> {
            System.out.println(x);
            System.out.println(x * x);
        };

        BiConsumer<Integer, Integer> bc = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };

        c.accept(5);
        bc.accept(5, 10);
    }
}