import java.util.Scanner;


abstract class Account {
    String customerName;
    long accountNumber;
    String accountType;
    double balance;
    boolean updated = false;

    public Account(String customerName, long accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        updated = false;
        balance += amount;
        System.out.println("Deposit of ₹ " + amount + " successful.");
    }

    public void withdraw(double amount) {
	updated = false;
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of ₹ " + amount + " successful.");
        } else {
            System.out.println("Insufficient funds. Withdrawal not allowed.");
        }
    }

    public void displayBalance() {
	update();
        System.out.println("Account Balance: ₹ " + balance);
    }

    public abstract void update();
}


class CurAcct extends Account {
    double minBalance;
    double serviceCharge;

    public CurAcct(String customerName, long accountNumber, double balance) {
        super(customerName, accountNumber, "Current", balance);
        this.minBalance = 500;
        this.serviceCharge = 10;
    }

    public void update() {
	if(!updated) {
        if (balance < minBalance) {
            balance -= serviceCharge;
            System.out.println("Service charge of ₹ " + serviceCharge + " imposed for falling below minimum balance.");
        }
	updated = true;
	}
    }

}

class SavAcct extends Account {
    double interestRate;

    public SavAcct(String customerName, long accountNumber, double balance) {
        super(customerName, accountNumber, "Savings", balance);
        this.interestRate = 0.05;
    }

    public void update() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of ₹ " + interest + " computed and deposited. Updated balance: ₹ " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        CurAcct currentAccount = new CurAcct("Priyanshu", 123456789, 1000);
        SavAcct savingsAccount = new SavAcct("Ajit", 987654321, 5000);
        
        currentAccount.deposit(200);
        currentAccount.displayBalance();
        currentAccount.withdraw(200);
        currentAccount.displayBalance();
       
        savingsAccount.deposit(1000);
        savingsAccount.displayBalance();
        savingsAccount.withdraw(800);
        savingsAccount.displayBalance();
    }
}




