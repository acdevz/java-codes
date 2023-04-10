package oops.statics;

public class Human {
    int age;
    String name;
    boolean married;
    static long population;

    static void message(){
        System.out.println("Hi there!");
    }
    public Human(int age, String name, boolean married) {
        this.age = age;
        this.name = name;
        this.married = married;
        Human.population += 1;
        Human.message();
    }
}
