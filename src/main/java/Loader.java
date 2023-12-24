import java.lang.reflect.Method;

public class Loader {
    public static void main(String[] args) {

        Person person1 = new Person("Addams", 20, "India");
        Class personClass = person1.getClass(); // Class is a class in java.lang package

        System.out.println(personClass.getName());
        System.out.println(personClass.getSimpleName());

//        Method[] m = personClass.getMethods(); // all the public member methods including those declared by the class or interface and those inherited from superclasses and superinterfaces.
        Method[] m = personClass.getDeclaredMethods(); // all the methods declared by the class or interface, including public, protected, default (package) access, and private, but excluding inherited methods.
        for (Method method : m){
            System.out.println(method.getName());
        }
    }
}

class Person {
    private String name;
    private int age;
    private String country;

    public Person(String name, int age, String country){
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getCountry(){
        return this.country;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age > 0){
            this.age = age;
        }
    }

    public void setCountry(String country){
        this.country = country;
    }

    public void printInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Country: " + this.country);
    }
}
