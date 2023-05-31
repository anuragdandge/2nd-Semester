import java.util.Scanner;

class Stud {
    int mark;
}

class mark_exception extends Exception {
    mark_exception(int data) {
        if (data < 0)
            System.out.println(data + " is less than 0");
        else
            System.out.println(data + " is more than 100");

    }
}

public class Custom_Exception extends Exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            Stud s = new Stud();

            System.err.println("Enter Marks ");
            for (int j = 0; j < 3; j++) {
                int temp = s.mark = sc.nextInt();
                if (temp < 0 || temp > 100) {
                    throw new mark_exception(temp);
                }
            }
        } catch (mark_exception m) {
            System.out.println(" Check the Marks ");
        }
    }
}
