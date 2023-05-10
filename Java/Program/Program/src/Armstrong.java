import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        int arm = 0;
        System.out.println("Enter A Number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int org = num;
        String str = Integer.toString(num);
        int numLength = str.length();
        System.out.println("Entered Number is = " + num);
        for (int i = 0; i < numLength; i++) {
            int temp = Integer.parseInt(String.valueOf(str.charAt(i)));
            arm += Math.pow(temp, numLength);
        }
        System.out.println("Armstrong = " + arm);
        if (org == arm) {
            System.out.println(num + " is Armstrong");
        } else {
            System.out.println(num + " is not Armstrong");
        }
    }

}
