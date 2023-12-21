package basics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//
//        //Syntax
//        ArrayList<Integer> list = new ArrayList<>(10);
//
//        //Integers : generic dt, "wrapper" class for int
////        list.add(12);
////        list.add(36);
////        list.add(67);
//        for (int i = 0; i < 5; i++) {
//            list.add(in.nextInt());
//        }
//
//        list.set(0, 36);
//        list.remove(0);
//        System.out.println(list);


        //Multi-dimensional ArrayLists


        ArrayList< ArrayList<Integer> > list = new ArrayList<>();

        //initializing...
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
