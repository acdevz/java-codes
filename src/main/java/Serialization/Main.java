package Serialization;

import java.io.*;

class Person implements Serializable {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person();
        person.setAge(20);
        person.setName("acdevs");

        FileOutputStream fileOutputStream = new FileOutputStream("person_data.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("person_data.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person p2 = (Person) objectInputStream.readObject();
        objectInputStream.close();
    }
}
