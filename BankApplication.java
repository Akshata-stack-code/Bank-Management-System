
import java.util.Scanner;

class BankApplication {

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
