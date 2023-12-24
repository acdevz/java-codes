package oops.generics.comparables;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student> {
    private int roll;
    private float marks;

    public Student(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }

    public String toString(){
        return "Student{" +
                " roll = " + roll +
                ", marks = " + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.marks < o.marks)
            return -1;
        else if(this.marks > o.marks)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Student aman = new Student(9, 7.23f);
        Student abdus = new Student(1, 8.23f);
        Student alok = new Student(2, 9.23f);

        Student[] list = {aman, alok, abdus};

        /* Sort using comparator */
        Arrays.sort(list, (o1, o2) -> Integer.compare(o1.roll, o2.roll));

        System.out.println(Arrays.toString(list));

        if(aman.compareTo(abdus) > 0)
            System.out.println("Aman has more marks than Abdus");
        else if(aman.compareTo(abdus) < 0)
            System.out.println("Aman has less marks than Abdus");
        else
            System.out.println("Aman and Abdus have equal marks");
    }
}
