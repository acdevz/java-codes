package oops.statics;

public class Main {
    public static void main(String[] args) {
        Human aman = new Human(19, "Aman Chandra", false);
        Human jack = new Human(20, "Jack Aron", false);
        System.out.println(Human.population);
//        System.out.println(jack.population);
        System.out.println(Human.population);

//        fun(); // non-static Main method in a static context, without an instance of it! huh?
        Main obj = new Main();
        obj.fun();
    }

    void fun(){
        System.out.println("it's fun!");
    }
}
