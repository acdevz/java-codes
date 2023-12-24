package lambda;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

//        list.forEach((item) -> System.out.println(item));
//        list.forEach(System.out::println);

        Consumer<Integer> consumer = System.out::println; // item -> System.out.println(item);
//        list.forEach(consumer);

        Main main = new Main();
        Operations sum = Integer::sum;
        Operations mul = (a, b) -> (a * b);

        System.out.println(mul.operation(2, 3));
        System.out.println(main.operate(2, 3, sum));
        System.out.println(main.operate(5, 0, mul));
    }

    private int operate(int a, int b, Operations op){
        return op.operation(a, b);
    }

    private interface Operations{
        int operation(int a, int b);
    }
}
