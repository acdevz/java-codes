package basics;

public class Shadowing {
    static int a = 4;
    public static void main(String[] args) {
//        Shadowing... vars of higher level scope are shadowed by vars of lower level scope
        int a; // declarations

//        System.out.println(a);  //error!!!
//        Scope will begin from here after...

        a = 6; // initialization
        System.out.println(a);
        just(); //4
    }
    static void just(){
        System.out.println(a);
    }
}
