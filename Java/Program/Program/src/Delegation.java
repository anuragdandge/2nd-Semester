import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends Frame {
    TextField t1;
    Button b1;

    MyFrame() {
        t1 = new TextField(10);
        b1 = new Button("Click");
        add(t1, "North");
        b1.addActionListener(new ButtonHandler(this));
        add(b1, "South");
    }


}

class ButtonHandler implements ActionListener {
    MyFrame f;

    ButtonHandler(MyFrame mf) {
        f = mf;
    }

    public void actionPerformed(ActionEvent e) {

    }
}

public class Delegation {
    public static void main(String[] args) {
        MyFrame f1 = new MyFrame();
        f1.setVisible(true);
        f1.setSize(100, 100);
       
    }
}
