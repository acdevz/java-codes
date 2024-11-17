package Iterables;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class streams {
    public static void main(String[] args) {
        Stream<Integer> s = List.of(1, 2, 3, 4, 5).stream();

        /* map : Stream<E> × (E → F) → Stream<F> */
        Stream<Double> s2 = s.map(Math::sqrt);
//        s2.forEach(System.out::println);

        /* Method References */
        Function<Double, Double> f = Math::sqrt;
        Double ans = f.apply(4.0);
        System.out.println(ans);


        /* filter : Stream<E> × (E → boolean) → Stream<E> */
        Stream<Integer> s3 = List.of(1, 2, 3, 4, 5).stream();
        Stream<Integer> s4 = s3.filter(x -> x % 2 == 0);
//        s4.forEach(System.out::println);

        /* reduce : Stream<E> × (E × E → E) → E */
        Stream<Integer> s5 = List.of(1, 2, 3, 4, 5).stream();
        Integer sum = s5.reduce(0, Integer::sum);
        System.out.println(sum); // (((((0 + 1) + 2) + 3) + 4) + 5) = 15

        /* forEach : Stream<E> × (E → ()) → () */
        Stream<Integer> s6 = List.of(1, 2, 3, 4, 5).stream();
        s6.forEach(System.out::println);

        /* reduction to another type */
        Stream<Integer> s7 = List.of(1, 2, 3, 4, 5).stream();
        String s8 = s7.reduce("", (acc, x) -> acc + x, (acc1, acc2) -> acc1 + acc2);
        /* initial value, accumulator, combiner (combines the partial results) */
    }
}
