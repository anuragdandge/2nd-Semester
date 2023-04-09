import java.util.*;

class Base {
  protected double x, y;

  void get(double a, double b) {
    x = a;
    y = b;
  }

  void disp() {
    System.out.println(" A = " + x + " B = " + y);
  }

  void add() {
    System.out.println("Addition = " + (x + y));
  }
}

class Derived extends Base {

}

public class Hello {
  public static void main(String[] args) {
    Derived d = new Derived();
    d.get(12, 23);
    d.disp();
    d.add();
  }
}