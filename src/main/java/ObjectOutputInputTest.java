import java.io.*;

public class ObjectOutputInputTest {
    public static void main(String[] args) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.txt"));
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.txt"))) {
            Person person = new Person("Sam",33,178, true);
            objectOutputStream.writeObject(person);

            Person person1 = (Person)objectInputStream.readObject();
            System.out.printf("Name: %s \t Age: %d \n", person1.getName(), person1.getAge());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Person implements Serializable{

    private String name;
    private int age;
    private double height;
    private boolean merried;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMerried() {
        return merried;
    }

    Person(String n, int a, double h, boolean m){
        name = n;
        age = a;
        height  = h;
        merried = m;
    }


}
