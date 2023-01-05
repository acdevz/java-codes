package patterns;

public class pattern22 {
    public static void main(String[] args) {
        int n = 3;

        // Sr: State of rows
        // Sc: State of cols
        boolean Sr = true;
        for (int i = 0; i < 5; i++) {
            boolean Sc = Sr;
            for (int j = 0; j < i + 1; j++) {
                if (Sc){
                    System.out.print( 1 + " ");
                }else{
                    System.out.print( 0 + " ");
                }
                Sc = Sc ? false : true;
            }
            Sr = Sr ? false : true;
            System.out.println();
        }
    }
}
