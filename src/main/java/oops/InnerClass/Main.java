package oops.InnerClass;

public class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.show();
        Outer.Inner.display(); // and not o.Inner.display() why?

//        Outer.Inner i = new Outer().new Inner();
        Outer.Inner i = o.new Inner(); // this is the preferred way
        i.show();

        o.methodLocalInner();

        o.anonymousInner();

        Outer.GoldFish.bubble();

    }
}

class Outer{
    public void show(){
        System.out.println("In an outer class method");
    }

    /* Nested Inner class*/
    class Inner{
        /* cannot contain static methods */
        public void show(){
            System.out.println("In a nested class method");
        }

        public static void display(){
            System.out.println("Imma static class method");
        }
    }

    /* Method Local Inner class*/
    public void methodLocalInner(){
        class MethodLocalInner{
            public void show(){
                System.out.println("In a method local inner class method");
            }
        }
        MethodLocalInner m = new MethodLocalInner();
        m.show();
    }

    /* Anonymous Inner class */
    public void anonymousInner(){
        IceCream i = new IceCream(){
            public void lick(){
                System.out.println("yumm yumm yumm!");
            }
        };
        i.lick();
    }

    /* static inner class */
    /* -> can have static methods */
    /* -> can access static members of outer class */
    static class GoldFish{
        public static void bubble(){
            System.out.println("pew pew pew!");
        }
    }
}

interface IceCream{
    public abstract void lick();
}
