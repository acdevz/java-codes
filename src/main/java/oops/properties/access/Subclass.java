package oops.properties.access;

public class Subclass extends Access {
    public Subclass(int hash, String name, String code) {
        super(hash, name, code);
    }

    public static void main(String[] args) {
        Subclass sub = new Subclass(5437, "Sub", "SUB5437");
//        System.out.println(sub.getHash());

    }
}
