package Labs.week03;

import java.util.List;

public class P007 {
    public static void main(String[] args) {
        UGStudent UG22124009 = new UGStudent();
        UG22124009.setName("Aman Chandra");
        UG22124009.setRegNo(22124009);
        UG22124009.setFatherName("Rajiv Kumar");
        UG22124009.setCurrAddress("123, Main Street, New York");
        UG22124009.setPermAddress("123, Main Street, New York");
        UG22124009.setPhoneNo("9335273609");
        UG22124009.setEmail("amanchandra.in@gmail.com");
        UG22124009.setDegree(new QualifyingDegree("B.Tech", "NIT Jalandhar", 2024, List.of(7.54, 7.55, 6.5)));

        PaymentUPI upi = new PaymentUPI();
        upi.setPaymentID(1001);
        upi.setUPIID("upi@okaxis");
        UG22124009.setPayment(upi);

        UG22124009.setCourses(List.of(
                new UGCourse("UG-1001", "Introduction to Programming", 3),
                new UGCourse("UG-1002", "Data Structures and Algorithms", 3),
                new UGCourse("UG-1003", "Database Management Systems", 3),
                new UGCourse("UG-1004", "Operating Systems", 3),
                new UGCourse("UG-1005", "Computer Networks", 3),
                new UGCourse("UG-1006", "Software Engineering", 3)
                ));

        System.out.println("Name: " + UG22124009.getName());
        System.out.println("Reg No: " + UG22124009.getRegNo());
        System.out.println("Father's Name: " + UG22124009.getFatherName());
        System.out.println("Degree: " + UG22124009.getDegree().degreeName);
        System.out.println("University: " + UG22124009.getDegree().university);
        System.out.println("Year of Completion: " + UG22124009.getDegree().yearOfCompletion);
        System.out.printf("Marks: %.2f", UG22124009.getDegree().getMarks());

        System.out.println();
        System.out.println("Courses:");
        UG22124009.getCourses();
        System.out.println("Payment:");
        UG22124009.getPayment();

    }
}

abstract class Student{
    protected String name;
    protected int regNo;
    protected String fatherName;
    protected String currAddress;
    protected String permAddress;
    protected String phoneNo;
    protected String email;

    protected Payment payment;
    protected List<Course> courses;

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    public void getPayment() {
        System.out.println("Payment ID: " + payment.getPaymentID());
    }
    public void getCourses() {
        for(int i = 0; i < courses.size(); i++){
            System.out.println("Course " + (i + 1) + ": " + courses.get(i).getCode() + " - " + courses.get(i).getName() + " - " + courses.get(i).getCredits() + " credits");
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRegNo() {
        return regNo;
    }
    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }
    public String getFatherName() {
        return fatherName;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public String getCurrAddress() {
        return currAddress;
    }
    public void setCurrAddress(String currAddress) {
        this.currAddress = currAddress;
    }
    public String getPermAddress() {
        return permAddress;
    }
    public void setPermAddress(String permAddress) {
        this.permAddress = permAddress;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

class QualifyingDegree{
    protected String degreeName;
    protected String university;
    protected int yearOfCompletion;
    private final List<Double> semesterMarks;

    public QualifyingDegree(String degreeName, String university, int yearOfCompletion, List<Double> semesterMarks) {
        this.degreeName = degreeName;
        this.university = university;
        this.yearOfCompletion = yearOfCompletion;
        this.semesterMarks = semesterMarks;
    }

    public double getMarks(){
        double marks = 0;
        for(double mark: semesterMarks){
            marks += mark;
        }
        return marks / semesterMarks.size();
    }
}

class UGStudent extends Student{
    private QualifyingDegree degree;
    public QualifyingDegree getDegree() {
        return degree;
    }
    public void setDegree(QualifyingDegree degree) {
        this.degree = degree;
    }
}

class PGStudent extends Student{
    private QualifyingDegree degree;
    public QualifyingDegree getDegree() {
        return degree;
    }
    public void setDegree(QualifyingDegree degree) {
        this.degree = degree;
    }
}

class PhDStudent extends Student{
    private QualifyingDegree degree;
    public QualifyingDegree getDegree() {
        return degree;
    }
    public void setDegree(QualifyingDegree degree) {
        this.degree = degree;
    }
}