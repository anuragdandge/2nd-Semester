import java.util.*;
import java.util.Date;
import java.util.Scanner;

class Account {
    private int balance, acc_number;
    private String name, type;
    Date date;

    Account(int acc_number, String name, Date date, int balance, String type) {
        this.acc_number = acc_number;
        this.balance = balance;
        this.name = name;
        this.date = date;
        this.type = type;

    }

    public void Display() {
        System.out.println("Name = " + this.name + "\nBalance = " + this.balance + "\nAccount Opening Date " + this.date
                + "\nAccount Number = " + this.acc_number + "\nAccount Type = " + this.type);
    }

    public void Balance() {
        System.out.println("Balance of " + this.name + " is = " + this.balance);
    }

    public void Withdraw() {
        int temp;
        System.out.println("Enter Amount to be Withdraw = ");
        Scanner sc = new Scanner(System.in);
        temp = sc.nextInt();
        this.balance -= temp;
        System.out.println("New Balance = " + this.balance);
    }

    public void Deposit() {
        int temp;
        System.out.println("Enter Amount to be Deposit = ");
        Scanner sc = new Scanner(System.in);
        temp = sc.nextInt();
        this.balance += temp;
        System.out.println("New Balance = " + this.balance);
    }
}

public class AccountHolder {

    public static void main(String[] args) {
        Account a1 = new Account(031001, "Anurag", new Date(), 12000, "Savings");
        a1.Display();
        a1.Deposit();
        a1.Balance();
        a1.Withdraw();
    }

}
