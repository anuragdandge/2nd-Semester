class Even extends Thread {
    int num1, num2;

    public Even(int x, int y) {
        num1 = x;
        num2 = y;
    }

    public void run() {
        try {
            if (num1 % 2 == 0) {
                System.out.println("Even = " + num1);
            }
            if (num2 % 2 == 0) {
                System.out.println("Even = " + num2);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Odd extends Thread {
    int num1, num2;

    public Odd(int x, int y) {
        num1 = x;
        num2 = y;
    }

    public void run() {
        try {
            if (num1 % 2 != 0) {
                System.out.println("Odd = " + num1);
            }
            if (num2 % 2 != 0) {
                System.out.println("Odd = " + num2);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Thread_2_pgm {
    public static void main(String[] args) {
        Thread t1 = new Even(4, 5);
        t1.run();
        Thread t2 = new Odd(2, 3);
        t2.run();
    }
}


// Output 

// Even = 4
// Odd = 3