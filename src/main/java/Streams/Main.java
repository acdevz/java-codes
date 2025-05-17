package Streams;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Product {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d"};
        Stream<String> sm = Stream.of(arr);
//        sm.forEach(System.out::println);

//        Stream<String> s = Stream.empty();
//        Stream<Integer> si = new ArrayList<Integer>().stream();
        Stream<String> sb = Stream.<String>builder().build();

        /* infinite streams */
        Stream<Integer> s1 = Stream.iterate(0, n -> n + 2).limit(100);
        Random r = new Random();
        IntStream is = r.ints(100, 0, 100);

        /* intermediate operations (return Stream<T>) and terminal operations (return a result of definite type) */
//        List<String> list = List.of("a", "b", "c", "d", "a", "b", "c", "d", "h");
//        long count = list.stream().distinct().count();
//        boolean isExist = list.stream().anyMatch(element -> element.contains("a"));
//        Stream<String> stream = list.stream().filter(element -> element.contains("d"));
//
//        List<String> uris = new ArrayList<>();
//        uris.add("C:\\file.txt");
//        Stream<Path> paths = uris.stream().map(Paths::get);
//
//        boolean isValid = list.stream().anyMatch(element -> element.contains("h")); // true
//        boolean isValidOne = list.stream().allMatch(element -> element.contains("h")); // false
//        boolean isValidTwo = list.stream().noneMatch(element -> element.contains("h")); // false
//
//        List<Integer> integers = Arrays.asList(1, 1, 1);
//        Integer reduced = integers.stream().reduce(23, (acc, cur) -> acc + cur);

        /* radioactive ☢️ */
//        List<String> resultList = list.stream().map(String::toUpperCase).collect(Collectors.toList());

        /* collect */
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));
        List<String> collectorCollection =
                productList.stream().map(Product::getName).collect(Collectors.toList());
        String listToString = productList.stream().map(Product::getName)
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(listToString);
    }
}
