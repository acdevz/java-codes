package basics;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        cake(1,2,3,4,5,6,7,8,9);

//        Special Case of "Ambiguity"!!!
//        cake();

        dounut(12, 23, "hello", "world");
    }

    static void cake(int ...nums){
        System.out.println(Arrays.toString(nums));
    }
    static void cake(String ...args){
        System.out.println(Arrays.toString(args));
    }
//    VarArgs should come at end...
    static void dounut(int a, int b, String ...s){
        System.out.println(a +" "+ b +" "+ Arrays.toString(s));
    }
}
