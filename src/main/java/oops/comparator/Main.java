package oops.comparator;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>(List.of(
                new Student(3, "C"),
                new Student(2, "B"),
                new Student(5, "E"),
                new Student(1, "A"),
                new Student(4, "D")
        ));

        System.out.println(list);
        Collections.sort(list, new StudentComparator());
        System.out.println(list);
    }
}

class Student{
    private Integer rollNo;
    private String name;

    public Student(Integer rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    String getName(){
        return name;
    }

    public String toString(){
        return rollNo + " " + name;
    }
}

class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(@NotNull Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
