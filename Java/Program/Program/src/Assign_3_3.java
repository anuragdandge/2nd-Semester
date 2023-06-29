import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;

public class Assign_3_3 {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextField name, phon_no, email_id;
        JLabel Lname, Lphon_no, Lemail_id, Lenquiry,Title;
        JTextArea enquiry, res;
        JButton b1;
        name = new JTextField("Name");
        phon_no = new JTextField("Phone");
        email_id = new JTextField("Email");
        enquiry = new JTextArea("Message");
        res = new JTextArea("");
        Title = new JLabel(" Welcome ");


        Lname = new JLabel("Enter your Name ");
        Lphon_no = new JLabel("Enter Phone Number ");
        Lemail_id = new JLabel("Enter Mail ID  ");
        Lenquiry = new JLabel("Enter Your Message here ");

        b1 = new JButton("Submit");

        Title.setBounds(100, 10, 200, 20);
        Title.setBackground(new Color(121212));
        Lname.setBounds(50, 20, 200, 20);
        name.setBounds(50, 40, 200, 20);
        Lphon_no.setBounds(50, 60, 200, 20);
        phon_no.setBounds(50, 80, 200, 20);
        Lemail_id.setBounds(50, 100, 200, 20);
        email_id.setBounds(50, 120, 200, 20);
        Lenquiry.setBounds(50, 120, 200, 50);
        enquiry.setBounds(50, 160, 200, 50);
        b1.setBounds(50, 240, 100, 30);
        res.setBounds(50, 270, 200, 80);

        f.add(Title);
        f.add(name);
        f.add(Lname);
        f.add(phon_no);
        f.add(Lphon_no);
        f.add(email_id);
        f.add(Lemail_id);
        f.add(enquiry);
        f.add(Lenquiry);
        f.add(b1);
        f.add(res);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                res.setText(name.getText() + "\n" + phon_no.getText() + "\n" + email_id.getText() + "\n"
                        + enquiry.getText());
            }
        });
        f.setSize(400, 400);
        f.setLayout(new BorderLayout());
        f.setVisible(true);

    }
}