package oops.design.bankAccount;

class BankAccount{
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }

    public void transferMoney(BankAccount toAccount, double amount){
        this.withdraw(amount);
        toAccount.deposit(amount);
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123456, "John Doe", 1000);
        BankAccount account2 = new BankAccount(654321, "Jane Doe", 2000);

        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());

        account1.transferMoney(account2, 500);

        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());
    }
}
