// Create array of list of employee ,
// The list may contains Manager of sales Manager object .

import java.util.Scanner;

class employee {
    int salary;

    employee(int sal) {
        salary = sal;
    }
}

public class Manager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee[] emp = new employee[10];
        System.out.println("Enter Employee Salary :- ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Employee " + (i + 1));
            int s = sc.nextInt();
            emp[i] = new employee(s);
        }
        System.out.println("Employee Salary :- ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Employee " + (i + 1) + " = " + emp[i].salary);
        }
    }
}
