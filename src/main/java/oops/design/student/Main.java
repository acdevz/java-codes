package oops.design.student;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] student = new Student[100];
        for(int i = 0; i < 100; i++){
            student[i] = new Student();
            student[i].setName(sc.nextLine());
            student[i].setAge(sc.nextInt());
            // take other inputs
        }
    }
}
