package oops.interfaces.extendedInterface;

public class Main implements B, A{
    @Override
    public void a() {
        System.out.println("a");
    }

    @Override
    public void b() {
        System.out.println("b");
    }

    public static void main(String[] args) {
        A.greet();
    }
}
