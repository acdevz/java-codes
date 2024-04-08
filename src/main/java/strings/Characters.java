package strings;

public class Characters {
    public static void main(String[] args) {
        Character ch = 'a';

        System.out.println(ch.charValue());
        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isLetterOrDigit(ch));
    }
}
