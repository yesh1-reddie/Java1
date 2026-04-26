package Day8;

import Day3.Person_2_1;

public abstract class BankAccount2 {
	private static long accCounter = 1000;
    private long accNum;
    protected double balance;
    private Person_2_1 accHolder;

    public BankAccount2(double balance, Person_2_1 accHolder) {
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

    public abstract boolean withdraw(double amount);

    public double getBalance() { return balance; }
    public long getAccNum() { return accNum; }
    public Person_2_1 getAccHolder() { return accHolder; }

    @Override
    public String toString() {
        return "BankAccount2 [AccNum=" + accNum + ", Balance=" + balance + ", Holder=" + accHolder + "]";
    }
}
