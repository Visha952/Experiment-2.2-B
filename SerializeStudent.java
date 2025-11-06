import java.io.*;

public class SerializeStudent {
    public static void main(String[] args) {
        try {
            Student s = new Student(101, "Vishal", 88.5f);

            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s);

            oos.close();
            fos.close();
            System.out.println("Student object saved to file.");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
