import java.util.Scanner;

public class BankAccountt {

    private double balance;

    // Deposit method
    public void deposit(double money) {
        if (money > 0) {
            balance += money;
            System.out.println("Amount deposited successfully!");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccountt b = new BankAccountt();

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    b.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wit = sc.nextDouble();
                    b.withdraw(wit);
                    break;

                case 3:
                    System.out.println("Current Balance: " + b.getBalance());
                    break;

                case 4:
                    System.out.println("Thank you! Visit again.");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}