package Labs.week03;

public class P008 {
    public static void main(String[] args) {
        UGCourse UG1001 = new UGCourse("UG-1001", "Introduction to Programming", 3);

        System.out.println("Course Code: " + UG1001.getCode());
        System.out.println("Course Name: " + UG1001.getName());
        System.out.println("Course Credits: " + UG1001.getCredits());
    }
}

abstract class Course{
    protected String code;
    protected String name;
    protected int credits;

    public abstract void setCode(String code);
    public abstract void setName(String name);
    public abstract void setCredits(int credits);

    public abstract String getCode();
    public abstract String getName();
    public abstract int getCredits();
}

class UGCourse extends Course{
    UGCourse(String code, String name, int credits){
        this.code = code;
        this.name = name;
        this.credits = credits;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public int getCredits() {
        return credits;
    }
}

class PGCourse extends Course{
    PGCourse(String code, String name, int credits){
        this.code = code;
        this.name = name;
        this.credits = credits;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public int getCredits() {
        return credits;
    }
}
