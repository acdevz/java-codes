package basics;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");
        Main.main("Mein to");
    }

    // Overloading Main...

    public static void main(String arg1, String arg2) {
        System.out.println(arg1 + " " + arg2);
    }

    public static void main(String arg) {
        System.out.print(arg + " ");
        Main.main("Sharara", "Sharara");
    }
}