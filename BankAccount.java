import java.util.Scanner;

public class BankAccount {

    private double balance;
    double amount;

    
    public double getBalance() {
        return balance;
    }

    
    public void deposit(double money) {
        if (money > 0) {
            balance = balance + money;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;

        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount b = new BankAccount();

       
        b.balance = 50000;
        b.deposit(2000);

       
        System.out.println("Enter amount to withdraw:");
        double amt = sc.nextDouble();
        b.withdraw(amt);

        
        System.out.println("Final Balance: ");
        System.out.println(b.getBalance());

        
    }
}
