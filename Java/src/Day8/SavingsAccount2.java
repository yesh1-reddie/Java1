package Day8;

import Day3.Person_2_1;

public class SavingsAccount2 extends BankAccount2 {
    private static final double MINIMUM_BALANCE = 500;

    public SavingsAccount2(double balance, Person_2_1 accHolder) {
        super(balance, accHolder);
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= MINIMUM_BALANCE) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Withdrawal denied! Minimum balance of INR " + MINIMUM_BALANCE + " must be maintained.");
            return false;
        }
    }
}
