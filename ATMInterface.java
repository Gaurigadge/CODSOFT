import java.util.Scanner;

public class ATMInterface {
    private static double balance = 1000.0; // Initial account balance

    public static void main(String[] args) {
        Scanner gain = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the ATM");
            System.out.println("1. See Available Funds");
            System.out.println("2. Extract Money");
            System.out.println("3. Place a Deopsit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = gain.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Your balance is: $" + balance);
    }

    private static void withdrawMoney() {
        Scanner gain = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: $");
        double amount = gain.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
        } else {
            System.out.println("Invalid amount or insufficient funds.");
        }
    }

    private static void depositMoney() {
        Scanner gain = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: $");
        double amount = gain.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }
}