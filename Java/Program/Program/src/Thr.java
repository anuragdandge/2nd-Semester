class PingPong implements Runnable {
    String word;

    public PingPong(String W) {
        word = W;
    }

    public void run() {
        try {
            for (;;) {
                System.out.println(word);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
// class PingPong extends Thread {
//     String word;

//     public PingPong(String W) {
//         word = W;
//     }

//     public void run() {
//         try {
//             for (int i = 0 ; i < 10 ; i ++) {
//                 System.out.println(word);
//                 Thread.sleep(100);
//             }
//         } catch (Exception e) {
//             // TODO: handle exception
//             System.out.println(e);
//         }
//     }
// }

public class Thr {

    public static void main(String[] args) {
        // Thread t1 = new PingPong("Hello");
        // t1.run();
        // Thread t2 = new PingPong("Hello");
        Runnable ping = new PingPong("ping");
        new Thread(ping).start();
        Runnable pong = new PingPong("pong");
        new Thread(pong).start();
    }
}

// Methods of Thread 
// join()
// yield()
// isALive()
// sleep()
// currentThread()