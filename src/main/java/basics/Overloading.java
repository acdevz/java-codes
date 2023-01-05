package basics;

public class Overloading {
    public static void main(String[] args) {
        // function overloading of same name!!

        woo(4);
        woo("AC");

        woo(4, 6);
    }
    // Via change in arg type.
    static void woo(int a){
        System.out.println(a);
    }
    static void woo(String a){
        System.out.println(a);
    }

    // Via change in arg lengths.
    static void woo(int a, int b){
        System.out.println(a + b);
    }
}
