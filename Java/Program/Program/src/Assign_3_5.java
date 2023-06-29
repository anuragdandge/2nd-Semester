
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Assign_3_5 extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextField t1, t2, res;
        JButton add;
        t1 = new JTextField("Enter Num1 ");
        t2 = new JTextField("Enter Num2 ");
        res = new JTextField("");
        add = new JButton("Add");
        t1.setBounds(50, 50, 75, 20);
        t2.setBounds(50, 70, 75, 20);
        res.setBounds(50, 90, 75, 20);
        add.setBounds(25, 120, 100, 30);
        f.add(t1);
        f.add(t2);
        f.add(res);
        f.add(add);
        add.addActionListener(new ActionListener() {
            private Integer temp1, temp2;

            public void actionPerformed(ActionEvent e) {
                temp1 = Integer.parseInt(t1.getText());
                temp2 = Integer.parseInt(t2.getText());
                temp1 = temp1 + temp2;
                res.setText(temp1.toString());
            }
        });

        
        f.setSize(200, 200);
        f.setLayout(new BorderLayout());
        f.setVisible(true);

    }
}
