package oops.InnerClass;

public class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.show();

//        Outer.Inner i = new Outer().new Inner();
        Outer.Inner i = o.new Inner(); // this is the preferred way
        i.show();
    }
}

class Outer{

    public void show(){
        System.out.println("In an outer class method");
    }

    class Inner{

        /* cannot contain static methods */

        public void show(){
            System.out.println("In a nested class method");
        }
    }
}
