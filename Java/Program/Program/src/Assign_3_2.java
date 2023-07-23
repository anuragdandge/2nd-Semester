import java.applet.*; import java.awt.*;
/*<applet code = Assign_3_2.java height = 400 width = 400>
<param name = "string1" value = "Hello">
<param name = "string2" value = " world!">
</applet>*/
public class Assign_3_2 extends Applet { String str1;
public void init() {
str1 = getParameter("string1").concat(getParameter("string2"));
}
public void paint(Graphics g) { showStatus(str1);
}
