class MyThread extends Thread {
    String word1, word2;

    public MyThread(String W1, String W2) {
        word1 = W1;
        word2 = W2;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(word1);
                System.out.println(word2);
                Thread.sleep(200);
            }
        } catch (Exception e) {

            System.out.println(e);
        }
    }
}

public class Thread_1_pgm {
    public static void main(String[] args) {
        Thread t1 = new MyThread("Hello Friends", "Welcome to java Programming ");
        t1.run();

    }
}


// Output :

// Hello Friends
// Welcome to java Programming
// Hello Friends
// Welcome to java Programming
// Hello Friends
// Welcome to java Programming
// Hello Friends
// Welcome to java Programming
// Hello Friends
// Welcome to java Programming
// Hello Friends
// Welcome to java Programming
// Hello Friends
// Welcome to java Programming
// Hello Friends
// Welcome to java Programming
// Hello Friends
// Welcome to java Programming
// Hello Friends
// Welcome to java Programming