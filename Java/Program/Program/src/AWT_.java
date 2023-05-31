import java.awt.*;
import java.awt.event.MouseEvent;

public  class AWT_ extends Frame {
    
    TextField t1;
    Button b1;
   public void paint(Graphics g){
        g.drawString("Hello ",150,150);
        g.setColor(Color.red);
        g.draw3DRect(100, 100, 100, 100,true);
        g.drawArc(100, 100, 50, 60, 12, 65);
        // g.draw3DRect(100, 100, 50, 50, getFocusTraversalKeysEnabled());
    }

    AWT_(){
        t1 = new TextField(20);
        b1 = new Button("Click");
        setLayout(new FlowLayout(20));
        add(t1);
        add(b1);
        // b1.addActionListener(new Button);
        // b1.addActionListener();
    }
    public static void main(String[] args) {
        Frame f = new AWT_();
        f.setSize(300, 300);
        f.setVisible(true);
        
    }
}