import javax.swing.*;
import java.awt.*;

public class Assign_3_4 extends JFrame {
    public Assign_3_4() {
        Font font = new Font("Georgia", 100, 60);
        GridLayout layout = new GridLayout(3, 1, 0, 0);
        setLayout(layout);

        setTitle("TrafficSignal");
        setBounds(100, 100, 500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JPanel red = new JPanel();
        red.setBackground(Color.RED);
        JLabel stop = new JLabel("Wait ");
        stop.setFont(font);
        red.add(stop);
        add(red);
        red.setVisible(false);
        JPanel orange = new JPanel();
        orange.setBackground(Color.ORANGE);
        JLabel ready = new JLabel("Slow Down");
        ready.setFont(font);
        orange.add(ready);
        add(orange);
        orange.setVisible(false);
        JPanel green = new JPanel();
        green.setBackground(Color.GREEN);
        JLabel go = new JLabel("GO");
        go.setFont(font);
        green.add(go);
        add(green);
        green.setVisible(false);
        Thread t = new Thread();
        t.start();
        for (;;) {
            try {
                red.setVisible(true);
                t.sleep(2000);
                red.setVisible(false);
                orange.setVisible(true);
                t.sleep(2000);
                orange.setVisible(false);
                green.setVisible(true);
                t.sleep(2000);
                green.setVisible(false);
                orange.setVisible(true);

                t.sleep(2000);
                orange.setVisible(false);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Assign_3_4();
    }
}

// class StopSign extends Frame {

// public void paint(Graphics g) {
// g.setColor(Color.gray);
// g.fillRect(198, 98, 36, 36);
// g.setColor(Color.red);
// g.fillOval(202, 100, 28, 28);
// g.setColor(Color.black);
// g.drawString("60", 210, 120);
// }
// }

// class G extends Frame {

// public void paint(Graphics g) {

// // Red Block
// g.setColor(Color.gray);
// g.fillRect(198, 98, 36, 36);
// g.setColor(Color.red);
// g.fillOval(202, 100, 28, 28);
// g.setColor(Color.black);

// g.drawString("60", 210, 120);

// // Yellow Block
// g.setColor(Color.gray);
// g.fillRect(198, 128, 36, 36);
// g.setColor(Color.yellow);
// g.fillOval(202, 130, 28, 28);

// // Green Left
// g.setColor(Color.gray);
// g.fillRect(170, 160, 32, 32);
// g.setColor(Color.green);
// g.fillOval(172, 160, 28, 28);
// g.setColor(Color.black);
// g.drawString("<-", 174, 178);

// // Green Center
// g.setColor(Color.gray);
// g.fillRect(200, 160, 32, 32);
// g.setColor(Color.green);
// g.fillOval(202, 160, 28, 28);

// // Green Right
// g.setColor(Color.gray);
// g.fillRect(230, 160, 32, 32);
// g.setColor(Color.green);
// g.fillOval(232, 160, 28, 28);
// g.setColor(Color.black);
// g.drawString("->", 248, 178);

// }
// }

// class Traffic extends Frame implements Runnable {
// public int time;

// public void paint(Graphics g) {
// g.setColor(Color.black);
// g.fillOval(100, 100, 50, 50);
// }

// public void run() {
// try {
// for (int i = time; i > 0; i--) {
// // Frame s = new StopSign();
// // System.out.println(i);
// Thread.sleep(1000);
// }

// } catch (Exception e) {
// System.out.println(e);
// // TODO: handle exception
// }
// }

// }

// public class Assign_3_4 extends Thread {

// public static void main(String[] args) {
// Frame f = new Traffic();
// f.setSize(500, 500);
// f.setVisible(true);

// Thread t = new Thread();
// t.run();

// }
// }

// import java.awt.*;
// import javax.swing.*;

// public class TrafficSignal extends JFrame implements Runnable {
// private static final long serialVersionUID = 1L;

// private JLabel redLabel, yellowLabel, greenLabel;
// private Thread thread;
// private boolean running;

// public TrafficSignal() {
// super("Traffic Signal");

// redLabel = new JLabel("Red");
// yellowLabel = new JLabel("Yellow");
// greenLabel = new JLabel("Green");

// setLayout(new GridLayout(3, 1));
// add(redLabel);
// add(yellowLabel);
// add(greenLabel);

// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// setSize(200, 300);
// setLocationRelativeTo(null);
// setVisible(true);

// thread = new Thread(this);
// running = true;
// thread.start();
// }

// @Override
// public void run() {
// try {
// while (running) {
// updateSignal("Red", Color.RED);
// Thread.sleep(3000); // Wait for 3 seconds

// updateSignal("Yellow", Color.YELLOW);
// Thread.sleep(1000); // Wait for 1 second

// updateSignal("Green", Color.GREEN);
// Thread.sleep(5000); // Wait for 5 seconds
// }
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }

// private void updateSignal(String labelText, Color color) {
// SwingUtilities.invokeLater(new Runnable() {
// public void run() {
// redLabel.setForeground(Color.BLACK);
// yellowLabel.setForeground(Color.BLACK);
// greenLabel.setForeground(Color.BLACK);

// if (labelText.equals("Red"))
// redLabel.setForeground(color);
// else if (labelText.equals("Yellow"))
// yellowLabel.setForeground(color);
// else if (labelText.equals("Green"))
// greenLabel.setForeground(color);
// }
// });
// }

// public static void main(String[] args) {
// new TrafficSignal();
// }
// }
