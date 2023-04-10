package oops.statics;

public class StaticBlock {
    static int a = 0;

    /* it runs once when the class is first loaded. */
    static {
        System.out.println("i'll run once!");
        a++;
    }

    public static void main(String[] args) {
        System.out.println(a);
        StaticBlock obj1 = new StaticBlock();
        System.out.println(a);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(a);

    }
}
