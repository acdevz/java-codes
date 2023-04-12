package oops.properties;

import oops.properties.access.Access;

public class Subclass extends Access {
    public Subclass(int hash, String name, String code) {
        super(hash, name, code);
    }
    public static void main(String[] args) {
        Subclass sub = new Subclass(1223, "Sub", "SUB1223");
//        sub.code;
    }
}

class SubSubclass extends Subclass {
    public SubSubclass(int hash, String name, String code) {
        super(hash, name, code);
    }
    public static void main(String[] args) {
        SubSubclass sub = new SubSubclass(1223, "Sub", "SUB1223");
//        sub.code;
    }
}
