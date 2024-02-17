package recursion;

public class StringReverse {
    private static void reverse(StringBuilder str){
        if(str.length() == 0)
            return;

        char ch = str.charAt(0);
        str.deleteCharAt(0);
        reverse(str);
        str.append(ch);
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("what the hell is going on?");
        reverse(str);
        System.out.println(str);
    }
}
