package Iterables.Collections.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {

        /* Syntax */

//        List<Integer> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>(10);

        /* Methods */

        Scanner in = new Scanner(System.in);
//        list.add(12);
//        list.add(36);
//        list.add(67);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        list.set(0, 36);
        list.remove(0);
        System.out.println(list.contains(36));
        System.out.println(list);

        //enhanced for loop!
        for (int i: list){
            System.out.print(i + " ");
        }

        // sorting
        Collections.sort(list); // ascending order or list.sort(null);
        list.sort(null);
        list.sort(Collections.reverseOrder()); // descending order

        //Multi-dimensional ArrayLists

//        ArrayList< ArrayList<Integer> > list = new ArrayList<>();
//
//        //initializing...
//        for (int i = 0; i < 3; i++) {
//            list.add(new ArrayList<>());
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                list.get(i).add(in.nextInt());
//            }
//        }
//        System.out.println(list);



        /* Vectors
        *   Same as ArrayLists but are synchronized
        *   i.e. only one thread can access it at a time
        */
    }
}
