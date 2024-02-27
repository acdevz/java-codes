package Labs.week03;

import java.util.Scanner;

public class P001 {
    public static void main(String[] args) {
        Temperature t = new Temperature();
        t.getResult();
    }
}

class Substance{
    public String[][] table = {
            {"Water", "0", "100"},
            {"Ethyl Alcohol", "-114", "78"},
            {"Mercury", "-39", "357"},
            {"Oxygen", "-218", "-183"},
            {"Gold", "1064", "2700"}
    };
}

class Temperature{
    private int temp;

    Temperature(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        temp = in.nextInt();
    }

    public void getResult(){
        Substance s = new Substance();
        for (String[] strings : s.table) {
            if (temp == Integer.parseInt(strings[1])) {
                System.out.println("Its the freezing point of " + strings[0]);
                return;
            }
            if (temp == Integer.parseInt(strings[2])) {
                System.out.println("Its the boiling point of " + strings[0]);
                return;
            }
        }
        System.out.println("Its neither freezing nor boiling point of any substance");
    }
}
