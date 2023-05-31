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
        return "DeSerialization\n : Roll = " + roll_no + "\n Name = " + name;
    }
}

public class DeSerialization {

    public static void main(String[] args) {
        try {
            Student s1;
            FileInputStream fis = new FileInputStream("stud-details.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (Student) ois.readObject();
            ois.close();
            System.out.println(s1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
