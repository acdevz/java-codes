package oops.abstracts;

public abstract class Parent {
    int age;
    final int CODE;
    /* ,but you can't have abstract constructors! */
    public Parent(int age) {
        this.age = age;
        this.CODE = 0;
    }

    /* cannot create objects of abstract class, else override abstract methods while instantiating */
    abstract void career(); /* with nobody implementation */

    /* but you can have non-abstract methods */
    /* that's why it does not support multiple inheritance.*/
    void print(){
        System.out.println("I am a parent");
    };
}

class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    void career(){
        System.out.println("Entrepreneur");
    }

    void getAge(){
        System.out.println(age);
    }
}

class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    void career(){
        System.out.println("Designer");
    }
}
