package Day3;

public class BankDemo {
	public static void main(String[] args) {
        // Create account holders
        Person_2_1 smith = new Person_2_1("Smith", 30);
        Person_2_1 kathy = new Person_2_1("Kathy", 25);

        // Create accounts
        Accounts smithAcc = new Accounts(2000, smith);
        Accounts kathyAcc = new Accounts(3000, kathy);

        // Deposit 2000 to Smith's account
        smithAcc.deposit(2000);

        // Withdraw 2000 from Kathy's account
        kathyAcc.withdraw(2000);

        // Display updated balances
        System.out.println("Smith's Account Balance: INR " + smithAcc.getBalance());
        System.out.println("Kathy's Account Balance: INR " + kathyAcc.getBalance());

        // Display account details using toString
        System.out.println(smithAcc);
        System.out.println(kathyAcc);
    }
}
