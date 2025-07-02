package BankApp;

public class Account {

    private int balance;
    private String name;
    private String pin;
    private String accountNumber;

    public Account(String name, String pin, int balance, String accountNumber) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }
    public String getName() {
        return this.name;
    }
    public String getPin() {
        return this.pin;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public int deposit(int amount) {
        if (amount < 0) return this.balance;
        return this.balance = this.balance + amount;
    }

    public int withdraw(int amount) {
        if (amount <= balance && amount > 0) return this.balance -= amount;
        return this.balance;
    }

    public int transfer(int amount) {
        if (amount <= balance && amount > 0) return this.balance -= amount;
        return this.balance;
    }

    public Account createAccount(String name, String pin, int balance,String accountNumber) {
        return new Account(name, pin, 0, accountNumber);
    }

}
