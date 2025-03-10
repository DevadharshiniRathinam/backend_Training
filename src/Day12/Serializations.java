package Day12;

import java.io.*;

public class Serializations implements Serializable {
    private String name;
    private int age;
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
    public static void main(String[] args) {
        String fileName = "person.ser";
        Serializations person = new Serializations();
        person.setName("Devadharshini");
        person.setAge(22);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(person);
            System.out.println(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Serializations deserializedPerson = (Serializations) ois.readObject();
            System.out.println( deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

