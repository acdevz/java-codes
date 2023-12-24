package oops.abstracts;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(20);
        Daughter daughter = new Daughter(22);
        son.career();
        daughter.career();
        System.out.println(son.age);

//        Parent mom = new Parent(); /* for abstract classes, this is not allowed!  */

//        Parent mom = new Parent(40) { /* but you can create anonymous classes */
//            @Override
//            void career() {
//                System.out.println("Housewife");
//            }
//        };
//        mom.career();

        Parent p = new Son(20);
        p.career();
//        p.getAge();

//        final int f;
//        f = 0;
//        System.out.println(f);
//        f = 9;
    }
}
