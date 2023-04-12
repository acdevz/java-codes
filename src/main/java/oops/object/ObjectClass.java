package oops.object;

import oops.properties.access.Access;

public class ObjectClass {
    protected int num;
    public ObjectClass(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); /* generate the hash value of object */
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectClass)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectClass obj1 = new ObjectClass(22);
        ObjectClass obj2 = new ObjectClass(22);
////        ObjectClass obj2 = obj1;
//        System.out.println(obj1 == obj2);
//        System.out.println(obj1.equals(obj2));

        System.out.println(obj1 instanceof Object);
        System.out.println(obj2.getClass());
    }
}
