package Serialization;

import java.io.*;

class Employee implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private transient Address address;
    private Person person;

    @Serial
    private void writeObject(ObjectOutputStream oos)
            throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(address.getHouseNumber());
    }

    @Serial
    private void readObject(ObjectInputStream ois)
            throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        Integer houseNumber = (Integer) ois.readObject();
        Address a = new Address();
        a.setHouseNumber(houseNumber);
        this.setAddress(a);
    }

    void setAddress(Address a) {
        this.address = a;
    }
    Address getAddress() {
        return address;
    }
}

class Address {
    private Integer houseNumber;
    public Integer getHouseNumber() {
        return houseNumber;
    }
    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }
}

public class Custom {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Address a = new Address();
        a.setHouseNumber(123);
        emp.setAddress(a);

        try {
            FileOutputStream fos = new FileOutputStream("employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee emp2 = (Employee) ois.readObject();
            System.out.println(emp2.getAddress().getHouseNumber());
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
