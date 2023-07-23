import java.awt.*;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;



public class SwingLayouts extends JFrame{
    static JButton b1;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Layouts ");
        b1 = new JButton("Button1");
        // b1.setBounds(10, 20, 100, 20);
        frame.add(b1);
        frame.setLayout(new FlowLayout(1));
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
