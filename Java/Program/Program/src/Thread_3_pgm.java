// Create class Account which has 
// attributes balance, account number 
// with behavior display Balance, Withdraw and deposit
//  Write a program to demonstration how the transactions in a bank can be carried out concurrently.

class Account extends Thread {
    private double balance;
    private int acc_number;

    public Account(double b, int a) {
        this.balance = b;
        this.acc_number = a;
    }

    synchronized public void Withdraw(int w) {
        this.balance -= w;
        System.out.println("\n " + w + " Withdrawn");
        Balance();
    }

    synchronized public void Deposit(int d) {
        this.balance += d;
        System.out.println("\n " + d + " Deposited");
        Balance();
    }

    public void Balance() {
        System.out.println(" Account Number = " + acc_number);
        System.out.println(" Balance = " + this.balance);
    }
}

public class Thread_3_pgm {
    public static void main(String[] args) {
        Account a = new Account(100, 031001);
        Thread w1 = new Thread(() -> {a.Withdraw(20);});
        Thread w2 = new Thread(() -> {a.Withdraw(40);});
        Thread w3 = new Thread(() -> {a.Withdraw(60);});
        Thread d1 = new Thread(() -> {a.Deposit(30);});
        Thread d2 = new Thread(() -> {a.Deposit(80);});
        try {
            d1.start();
            w2.start();
            w1.start();
            d2.start();
            w3.start();

        } catch (Exception e) {

        }
    }
}

// Output : 


// 30 Deposited
// Account Number = 12801
// Balance = 130.0

// 80 Deposited
// Account Number = 12801
// Balance = 210.0

// 60 Withdrawn
// Account Number = 12801
// Balance = 150.0

// 20 Withdrawn
// Account Number = 12801
// Balance = 130.0

// 40 Withdrawn
// Account Number = 12801
// Balance = 90.0
