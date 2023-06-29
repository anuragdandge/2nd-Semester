class MyThread extends Thread {
    String word;

    public MyThread(String W) {
        word = W;
    }

     public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(word);
                Thread.sleep(200);
            }
        } catch (Exception e) {

            System.out.println(e);
        }
    }
}

public class Thread_1_pgm {
    public static void main(String[] args) {
        Thread t1 = new MyThread("Hello Friends");
        Thread t2 = new MyThread("Welcome to java Programming ");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.run();
        t1.run();

    }
}


// Output :

// Welcome to java Programming 
// Welcome to java Programming 
// Welcome to java Programming 
// Welcome to java Programming 
// Welcome to java Programming 
// Hello Friends
// Hello Friends
// Hello Friends
// Hello Friends
// Hello Friends