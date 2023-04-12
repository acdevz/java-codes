package oops.abstracts;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(20);
        Daughter daughter = new Daughter(22);
        son.carrer();
        daughter.carrer();
        System.out.println(son.age);
//        Parent mom = new Parent(); /* for abstract classes, this is not allowed!  */

//        final int f;
//        f = 0;
//        System.out.println(f);
//        f = 9;
    }
}
