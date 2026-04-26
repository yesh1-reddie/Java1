package Day7;

import Day3.Person_2_1;

public class SavingsAccount extends BankAccount {
    private static final double MINIMUM_BALANCE = 500;

    public SavingsAccount(double balance, Person_2_1 accHolder) {
        super(balance, accHolder);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MINIMUM_BALANCE) {
            balance -= amount;
            return;
        } else {
            System.out.println("Withdrawal denied! Minimum balance of INR " + MINIMUM_BALANCE + " must be maintained.");
            return;
        }
    }
}