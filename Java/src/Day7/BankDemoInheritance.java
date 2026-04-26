package Day7;

import Day3.Person_2_1;

public class BankDemoInheritance {
    public static void main(String[] args) {
        Person_2_1 smith = new Person_2_1("Smith", 30);
        Person_2_1 kathy = new Person_2_1("Kathy", 25);

        SavingsAccount smithAcc = new SavingsAccount(2000, smith);
        CurrentAccount kathyAcc = new CurrentAccount(3000, kathy, 1000);

        smithAcc.deposit(2000);

        smithAcc.withdraw(3000);   
        kathyAcc.withdraw(3500);  
        
        System.out.println("Smith's Account Balance: INR " + smithAcc.getBalance());
        System.out.println("Kathy's Account Balance: INR " + kathyAcc.getBalance());

        System.out.println(smithAcc);
        System.out.println(kathyAcc);
    }
}
