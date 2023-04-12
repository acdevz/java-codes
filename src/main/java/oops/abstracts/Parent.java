package oops.abstracts;

public abstract class Parent {
    int age;

    /* ,but you can't have abstract constructors! */
    public Parent(int age) {
        this.age = age;
    }

    /* cannot create objects of abstract class, else override abstract methods while instantiating */
    abstract void carrer(); /* with no body implementation */
}

class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    void carrer(){
        System.out.println("Entrepreneur");
    }
}

class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    void carrer(){
        System.out.println("Designer");
    }
}
