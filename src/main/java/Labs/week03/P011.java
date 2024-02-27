package Labs.week03;

public class P011 {
    static class MyClass {
        private final int[] data;

        public MyClass(int size) {
            data = new int[size];
        }

        protected void finalize() {
            System.out.println("Object is garbage collected");
        }
    }

    public static void main(String[] args) {
        // Creating an object
        MyClass obj = new MyClass(1000);

        // Method 1: Nullifying the reference
        obj = null;

        // Method 2: Reassigning the reference
        MyClass obj2 = new MyClass(500);
        obj2 = new MyClass(300);

        // Method 3: Object goes out of scope
        {
            MyClass obj3 = new MyClass(200);
        }

        // Method 4: Explicitly invoking System.gc()
        MyClass obj4 = new MyClass(100);
        System.gc();
    }
}
