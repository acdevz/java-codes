package Iterables.Collections.Lists;

import java.util.Iterator;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(12);
        stack.push(36);
        stack.push(60);

        stack.pop();
        stack.pop();
        stack.push(75);

        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.search(12));

        stack.forEach(System.out::println);

        /* iterator */
        Iterator<Integer> iterator = stack.iterator();

//        iterator.forEachRemaining(item -> System.out.println(item)); // lambda expression
        iterator.forEachRemaining(System.out::println); // lambda expression (method reference)

//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }


        /* Stack class is a child class of Vector class.
         * Alternative to Stack class is Deque interface.
         * Deque interface is implemented by ArrayDeque and LinkedList classes.
        */
    }
}
