package oops;

public class Basic {
    public static void main(String[] args) {
/*
*        NOTE : Creating multiple objects by one type only (A good practice)
*        Animal obj = new Cat();
*        obj = new Dog();
*/

        Student aman = new Student(9, "Aman Chandra", 7.22); //constructor function

        System.out.println(aman.name+ ", cgpa: "+ aman.gpa);
        Student oggy = new Student(aman);
        System.out.println(oggy.name+ ", cgpa: "+ oggy.gpa);

        Student jack = new Student();
        System.out.println(jack.name+ ", cgpa: "+ jack.gpa);


        // ways to create an object
        // 1. using new keyword
        Test t1 = new Test("t1");

//         2. using Class.forName()
//        try {
//            Test t2 = (Test) Class.forName("Test").newInstance();
//        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        // 3. using clone()
//        try {
//            Test t3 = t1.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }

        // 4. using deserialization

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
