package Labs.week03;

public class P012 {
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
        // Method 4: Explicitly invoking System.gc()
        MyClass obj4 = new MyClass(100);
        System.gc();

        // Method 5: Explicitly invoking Runtime.getRuntime().gc()
        MyClass obj5 = new MyClass(200);
        Runtime.getRuntime().gc();
    }
}

