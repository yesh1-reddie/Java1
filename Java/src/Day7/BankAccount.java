package Day7;

import Day3.Person_2_1;

public class BankAccount {
	private static long accCounter = 1000;
    private long accNum;
    protected double balance;
    private Person_2_1 accHolder;

    public BankAccount(double balance, Person_2_1 accHolder) {
        this.accNum = ++accCounter;
        this.balance = balance;
        this.accHolder = accHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        }
    }

    public void withdraw(double amount) {
        if (balance - amount >= 500) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Withdrawal denied! Minimum balance of INR 500 must be maintained.");
        }
    }

    public double getBalance() { return balance; }
    public long getAccNum() { return accNum; }
    public Person_2_1 getAccHolder() { return accHolder; }

    @Override
    public String toString() {
        return "BankAccount [AccNum=" + accNum + ", Balance=" + balance + ", Holder=" + accHolder + "]";
    }
}
