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

}
