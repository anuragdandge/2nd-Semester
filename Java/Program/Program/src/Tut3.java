
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tut3 extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextField tf = new JTextField();
        JButton show = new JButton("show ");
        tf.setBounds(20, 50, 100, 30);
        show.setBounds(100, 50, 70, 30);
        f.add(tf);
        f.add(show);
        show.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JDialog jd = new JDialog();
                JTextField jf = new JTextField("Enter Some text");
                JButton cancel, ok;
                cancel = new JButton("Cancel");
                ok = new JButton("OK");
                cancel.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jd.dispose();
                    }
                });
                ok.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        tf.setText(jf.getText());   
                        jd.dispose();

                    }
                });
                jf.setBounds(20, 20, 50, 30);
                cancel.setBounds(20, 60, 50, 30);
                ok.setBounds(20, 90, 50, 30);
                jd.setVisible(true);
                jd.setSize(500, 100);
                jd.setLayout(new FlowLayout());
                jd.add(jf);
                jd.add(cancel);
                jd.add(ok);
            }
        });
        f.setSize(300, 200);
        f.setLayout(new BorderLayout());
        f.setVisible(true);
    }
}
