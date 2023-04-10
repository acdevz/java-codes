package oops;

public class Basic {
    public static void main(String[] args) {
//        Student aman = new Student(); //constructor function
//        aman.roll = 9;
//        aman.name = "Aman Chandra";
//        aman.gpa = 7.22;

        Student aman = new Student(9, "Aman Chandra", 7.22); //constructor function

        System.out.println(aman.name+ ", cgpa: "+ aman.gpa);
        Student oggy = new Student(aman);
        System.out.println(oggy.name+ ", cgpa: "+ oggy.gpa);

        Student jack = new Student();
        System.out.println(jack.name+ ", cgpa: "+ jack.gpa);

    }
}
class Student{
    int roll;
    String name;
    double gpa;

    Student(Student other){
        this.roll = other.roll;
        this.name = other.name;
        this.gpa = other.gpa;
    }

    Student(){
        this(0, null, 0);
    }

    Student(int roll, String name, double gpa) {
        this.roll = roll;
        this.name = name;
        this.gpa = gpa;
    }
}

class Test{
    String code;

    public Test(String code) {
        this.code = code;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("destroyed!");
    }
}
