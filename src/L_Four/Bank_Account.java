package L_Four;


class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        double interest = balance * interestRate / 100;
        balance += interest;
        super.deposit(amount);
    }
}

public class Bank_Account {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 5); 
        double amountDeposited = 500;
        
        System.out.println("Before deposit:");
        System.out.println("Balance: " + savingsAccount.balance);
        
        savingsAccount.deposit(amountDeposited); 
        
        System.out.println("\nAfter deposit:");
        System.out.println("Balance: " + savingsAccount.balance);
    }
}
