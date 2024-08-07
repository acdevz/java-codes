package Iterables.Collections;

import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        /* Common Stream Operations:
         * Intermediate operations:
            filter(): Filters elements based on a predicate.
            map(): Transforms elements into a new type.
            flatMap(): Flattens a stream of streams.
            sorted(): Sorts elements.
            distinct(): Removes duplicate elements.
            limit(): Limits the number of elements.
         * Terminal operations:
            forEach(): Performs an action for each element.
            collect(): Collects elements into a collection.
            reduce(): Reduces elements to a single value.
            findAny(): Returns an optional element.
            findFirst(): Returns the first element.
        */

        s.filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .forEach(System.out::println);

//        s.reduce(Integer::sum).ifPresent(System.out::println);

        /* from Collections : common methods
        * mapToInt() : mapToInt(i -> i)
        * .toArray() : mapToInt(i -> i).toArray()
        * .sum() : mapToInt(i -> i).sum()
        * .average() : mapToInt(i -> i).average()
        * .max() : mapToInt(i -> i).max()
        * .min() : mapToInt(i -> i).min()
        * .count() : mapToInt(i -> i).count()
        * .summaryStatistics() : mapToInt(i -> i).summaryStatistics()
        *
        *
        */
    }
}
