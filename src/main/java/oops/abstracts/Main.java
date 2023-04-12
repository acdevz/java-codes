package oops.abstracts;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(20);
        Daughter daughter = new Daughter(22);
        son.carrer();
        daughter.carrer();

//        Parent mom = new Parent(); /* for abstract classes, this is not allowed!  */
    }
}
