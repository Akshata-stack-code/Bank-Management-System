
import java.util.Scanner;

public class Bank {

    String bankName;
    int userId;
    String userName;
    long accountNumber;
    String accountType;
    double balance;

    Bank(int userId, String userName, long accountNumber, String accountType, double balance) {
        this.userId = userId;
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    void displayBankDetails() {
        System.out.println("Bank Name : " + bankName);
    }

    void displayUserDetails() {
        System.out.println("UserId : " + userId);
        System.out.println("UserName : " + userName);
    }

    void displayAccountDetails() {
        System.out.println("Account number : " + accountNumber);
        System.out.println("Account type : " + accountType);
        System.out.println("Current Balance : " + balance);
    }

    String accountSummary() {
        String accountSummary = "Bank name: " + bankName + "\nUser Name : " + userName + "\nAccount Number : "
                + accountNumber + "\nAccount Type : " + accountType + "\nAccount Balance : " + balance;
        return accountSummary;
    }

    boolean hasMinimumBalance(double minimumBalance) {
        boolean res = false;
        if (balance >= minimumBalance) {
            res = true;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bankName = scanner.nextLine();
        int userId = scanner.nextInt();
        scanner.nextLine();
        String userName = scanner.nextLine();
        long accountNumber = scanner.nextLong();
        scanner.nextLine();
        String accountType = scanner.nextLine();
        double openingBalance = scanner.nextDouble();

        Bank bank = new Bank(userId, userName, accountNumber, accountType, openingBalance);
        bank.bankName = bankName;

        bank.displayBankDetails();
        bank.displayUserDetails();
        bank.displayAccountDetails();

        String accountSummary = bank.accountSummary();
        System.out.println(accountSummary);

        double minimumBalance = scanner.nextDouble();
        boolean isMaintained = bank.hasMinimumBalance(minimumBalance);
        if (isMaintained) {
            System.out.println("Minimum balance is maintained.");
        } else {
            System.out.println("Minimum balance is not maintained.");
        }

        scanner.close();
    }
}
