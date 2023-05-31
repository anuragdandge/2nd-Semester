
abstract class Shape {
    protected double radius, height;

    abstract void area();

    abstract void volume();
}

class Circle extends Shape {

    Circle() {
    }

    Circle(double r) {
        radius = r;
    }

    public void area() {
        System.out.println(" Area of Circle = " + 3.14 * radius * radius);
    }

    public void volume() {
    }

}

class Cylinder extends Circle {

    Cylinder() {
    }

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    public void area() {
        System.out.println("Area of Cylinder = " + ((2 * 3.14 * radius * height) + (2 * 3.14 * radius * radius)));
    }

    public void volume() {
        System.out.println("volume of Cylinder = " + (3.14 * (radius * radius)) * height);
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Circle ci = new Circle(4.5);
        ci.area();
        Cylinder cy = new Cylinder(5.5, 8);
        cy.area();
        cy.volume();
    }
}
