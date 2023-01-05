package patterns;

public class pattern21 {
    public static void main(String[] args) {
        int n = 3;

        int num = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(num + (num < 10 ? "  " : " "));
                num++;
            }
            System.out.println();
        }
    }
}
