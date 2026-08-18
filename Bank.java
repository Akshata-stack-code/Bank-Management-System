

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
        String accountSummary = "Bank name: " + bankName
                + "\nUser Name : " + userName
                + "\nAccount Number : " + accountNumber
                + "\nAccount Type : " + accountType
                + "\nAccount Balance : " + balance;
        return accountSummary;
    }

    boolean hasMinimumBalance(double minimumBalance) {
        if (balance >= minimumBalance) {
            return true;
        }
        return false;
    }
}
