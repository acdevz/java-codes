package basics;

import java.util.Scanner;
import java.time.Month;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        char l = in.next().charAt(0);
//        System.out.println(l);

//        enhanced switch, no use of breaks!!!

        System.out.print("What's ur fruit? ");
        String fruit = in.next();
        switch (fruit) {
            case "Apple" -> System.out.println("That sweet red, but i like the green.");
            case "Guava" -> System.out.println("That white flesh or red?");
            default -> System.out.println("You didn't matched mine.");
        }


//        Skipping breaks!
//        System.out.print("Day1? ");
//        int day1 = in.nextInt();
//        System.out.print("Day2? ");
//        int day2 = in.nextInt();
//        System.out.println(day1 +" "+ day2);
//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekday!");
//            case 6, 7 -> System.out.println("Weekend!");
//            default -> System.out.println("i didn't mean what u said!?");
//        }

//        ...
//        Nested Switch

        System.out.print("enter Course: ");
        int course = in.nextInt();

//        1 PhD, 2 M.Tech 3 B.Tech and else...

        switch (course) {
            case 1, 2 -> System.out.println("apology! i don't know about PhD or M.tech");
            case 3 -> {
                System.out.print("enter Department: ");
                String dept = in.next();
                switch (dept) {
                    case "IT" -> System.out.println("from my branch?!, amazing!");
                    case "CS" -> System.out.println("it is way too tough to get here, congrats!");
                    default -> System.out.println("you maybe elsewhere!");
                }
            }
            default -> System.out.println("hey, does this course even exist?!!");
        }

        System.out.print("Enter the month (e.g., JANUARY): ");
        Month month = Month.valueOf(in.next().toUpperCase());
        var result = switch (month) {
            case JANUARY, JUNE, JULY -> 3;
            case FEBRUARY, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER -> 1;
            case MARCH, MAY, APRIL, AUGUST -> {
                int monthLength = month.toString().length();
                yield monthLength * 4;
            }
            default -> 0;
        };
    }
}
