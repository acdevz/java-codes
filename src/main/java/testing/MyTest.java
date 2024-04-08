package testing;

public class MyTest implements PI1, PI2 {
    public void show(){
        PI1.super.show();
        PI2.super.show();
    }

    void showPI1(){
        PI1.super.show();
    }

    public static void main(String[] args) {
        MyTest t = new MyTest();
        t.showPI1();
    }
}

interface PI1{
    default void show(){
        System.out.println("PI1");
    };
}

interface PI2{
    default void show(){
        System.out.println("PI2");
    };
}
