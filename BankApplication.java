
import java.util.Scanner;

public class BankApplication {

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

        int choice;

        do {

            System.out.println("\n1. Display Complete Details");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Account Summary");
            System.out.println("6. Check Minimum Balance");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    bank.displayBankDetails();
                    bank.displayUserDetails();
                    bank.displayAccountDetails();
                    break;

                case 2:

                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    boolean depositSuccess = bank.deposit(depositAmount);

                    if (depositSuccess) {
                        System.out.println("Deposit successful.");
                        System.out.println("Updated Balance: " + bank.checkBalance());
                    } else {
                        System.out.println("Deposit failed.");
                    }
                    break;

                case 3:

                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    boolean withdrawSuccess = bank.withdraw(withdrawAmount);

                    if (withdrawSuccess) {
                        System.out.println("Withdrawal successful.");
                        System.out.println("Updated Balance: " + bank.checkBalance());
                    } else {
                        System.out.println("Withdrawal failed.");
                    }
                    break;

                case 4:

                    double currentBalance = bank.checkBalance();
                    System.out.println("Current Balance: " + currentBalance);
                    break;

                case 5:

                    String accountSummary = bank.accountSummary();
                    System.out.println(accountSummary);
                    break;

                case 6:

                    System.out.print("Enter minimum balance to check: ");
                    double minimumBalance = scanner.nextDouble();
                    boolean isMaintained = bank.hasMinimumBalance(minimumBalance);

                    if (isMaintained) {
                        System.out.println("Minimum balance is maintained.");
                    } else {
                        System.out.println("Minimum balance is not maintained.");
                    }
                    break;

                case 0:

                    System.out.println("Thank you for using the Bank Application. Exiting...");
                    break;

                default:

                    System.out.println("Invalid choice. Please select a valid option.");
            }

        } while (choice != 0);

        scanner.close();
    }

}
