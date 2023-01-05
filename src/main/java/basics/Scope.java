package basics;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            a = 45;
            int c = 67;
            System.out.println(a +", "+ c);
        }
        int c = 99;
        System.out.println(a +", "+ b +", "+ c);

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }
}
