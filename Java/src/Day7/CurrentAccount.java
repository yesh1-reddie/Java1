package Day7;

import Day3.Person_2_1;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(double balance, Person_2_1 accHolder, double overdraftLimit) {
        super(balance, accHolder);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            return;
        } else {
            System.out.println("Withdrawal denied! Overdraft limit reached.");
            return;
        }
    }
}
