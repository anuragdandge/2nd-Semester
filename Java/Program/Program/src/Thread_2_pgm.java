class MyThread1 extends Thread {
    int num1, num2;

    public MyThread1(int x, int y) {
        num1 = x;
        num2 = y;
    }

    public void run() {
        try {

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class MyThread2 extends Thread {
    int num1, num2;

    public MyThread2(int x, int y) {
        num1 = x;
        num2 = y;
    }

    public void run() {
        try {
if(num1 % 2 == 0){

}
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Thread_2_pgm {
    public static void main(String[] args) {
        Thread t1 = new MyThread1(1, 3);
        t1.run();

    }
}
