import java.awt.*;

public class Assign_3_1 extends Frame {

    public void paint(Graphics g) {

        g.fillOval(100, 100, 100, 100);
    }

    public static void main(String[] args) {
        Frame f = new Assign_3_1();
        f.setSize(300, 300);
        f.setVisible(true);
    }



// import java.awt.Color;
// import java.awt.Graphics;
// import javax.swing.JApplet;

// /*<applet code="Assign_3_1" width=500 height=500></applet>*/ public class Assign_3_1 extends JApplet
//         implements Runnable {
//     int x = 0, increment = 1;
//     Thread t = null;

//     public void start() {
//         t = new Thread(this);
//         t.start();
//     }

//     public void run() {
//         while (true) {
//             if (x == 0) {
//                 increment = 1;
//             } else if (x > getWidth() - 50) {
//                 increment = -1;
//             }
//             x += increment;
//             repaint();
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                 System.out.println(e);
//             }

//         }
//     }

//     public void paint(Graphics g) {
//         g.setColor(Color.white);
//         g.fillRect(0, 0, 500, 500);
//         g.setColor(Color.red);
//         g.fillOval(x, 200, 50, 50);
//         g.setColor(Color.blue);
//         g.fillOval(x + 5, 205, 40, 40);
//     }
// }
