import java.io.*;

public class DeserializeStudent {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s = (Student) ois.readObject();
            s.display();

            ois.close();
            fis.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
