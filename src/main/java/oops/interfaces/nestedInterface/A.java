package oops.interfaces.nestedInterface;

public class A {
    public interface B {
        public void b();
    }

    public static void main(String[] args) {
        C c = new C();
        c.b();
    }
}

class C implements A.B{
    public void b(){
        System.out.println("I'm b!");
    }
}
