package testing;

import strings.Strings;

import java.util.Arrays;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String s = "A34";
        System.out.println(s.charAt(2) - '0');

        System.out.println(1/3 * 3.14);

        System.out.println(5 < 2 && 1  ==  0 / 0);

        int[][][] arr = new int[3][3][];

        byte u = 50;
        u *= 2.5;
        System.out.println(u);

        Y y = new Y();
        System.out.println(y.b);

        y.sayHi();
        Y z = new Z();
        z.sayHi();
    }
}

class Y implements X {
    int b = 0;

    Y() {
        System.out.println("Y" + X.a);
        X.sayHiii();
    }

    void sayHi() {
        System.out.println("Hi");
    }
}

class Z extends Y {
    Z() {
        System.out.println("Z");
    }

    void sayHi() {
        System.out.println("Hello");
    }
}

interface X{
     int a = 10;

     static void sayHiii() {
         System.out.println("Hi");
     }
}
