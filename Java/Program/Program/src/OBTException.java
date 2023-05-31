class MyCustomException extends Exception {
    MyCustomException() {
        System.out.println("Exception Thrown");
    }
}

public class OBTException {
    public static void main(String[] args) {
        try{
           int a =10;
            int b = 20;
            int c = 0;
            if(a/c == 0){
                // throw MyCustomException;
            }
        }catch(MyCustomException e){
                System.out.println("Exception thrown");
        }
    }
}