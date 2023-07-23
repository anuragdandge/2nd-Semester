
class Abc {

     

     static void StaticMemberFunc() {
       System.out.println(" Static Member Function ");
    }
    
    public void NonStaticMemberFunc () {
       System.out.println(" Static Member Function ");
    }

    public static double pi = 3.14;
    
}

public class StaticMem {
    public static void main(String[] args) {
       Abc.StaticMemberFunc();
       Abc a = new Abc();
       
       a.NonStaticMemberFunc();
       System.out.println(Abc.pi);


    }
}