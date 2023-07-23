class A {
    public void a_method(){
        System.out.println(" a_method ");
    }
}

class B extends A  {
    public void b_method(){
        // super.a_method();
        System.out.println(" b_method ");
    }
}
class C extends B  {
    public void c_method(){
        super.a_method();
        super.b_method();
        System.out.println(" C_method ");
    }
}


public class SuperKeyword {
    public static void main(String[] args) {
        C c = new C();
        c.c_method();
    }
}
