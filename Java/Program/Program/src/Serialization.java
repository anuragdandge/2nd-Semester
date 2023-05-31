import java.io.*;

class Student implements Serializable {
    int roll_no;
    String name;

    public Student(int r, String s)

    {
        roll_no = r;
        name = s;
    }

    public String toString() {
        return " Roll = " + roll_no + "\n Name = " + name;
    }
}

public class Serialization {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(1, "Anurag");
            System.out.println(s1);
            FileOutputStream fos = new FileOutputStream("stud-details.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.flush();
            oos.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}