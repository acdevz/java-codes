package Labs.week02;

public class P002 {
    public static void main(String[] args) {
        JavaLanguage jl = new JavaLanguage();
        jl.abstraction();
        jl.encapsulation();
        jl.inheritance();
        jl.persistence();
        jl.interfaces();
    }
}

class ObjectOriented{
    void abstraction(){
        System.out.println("Abstraction is the concept of hiding the implementation details and showing only the functionality to the user.");
    }

    void encapsulation(){
        System.out.println("Encapsulation is the concept of wrapping the data (variables) and code acting on the data (methods) together as a single unit.");
    }

    void inheritance(){
        System.out.println("Inheritance is the concept of creating a new class that inherits properties from an existing class.");
    }
}

class JavaLanguage extends ObjectOriented{
    void persistence(){
        System.out.println("Persistence is the concept of storing the data permanently.");
    }

    void interfaces(){
        System.out.println("Interfaces are a way to achieve abstraction in Java.");
    }
}