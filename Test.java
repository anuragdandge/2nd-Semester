
class A {
    public void a_method() {
        System.out.println(" THis is a_");
    }
}

class B extends A {
    public void a_method() {
        super.a_method();
        System.out.println(" THis is  b_");
    }
}

public class Test {

    public static void main(String[] args) {
        A a = new A();
        a.a_method();
    }

}
