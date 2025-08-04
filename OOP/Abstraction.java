// Abstraction

abstract class BankAccount {

    double balance;

    abstract void addMoney(double amount);

    abstract void canUserwithdrawMoney(double amount);

    void updateBalance(double _balance) {
        balance = _balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    public void addMoney(double amount) {
        super.updateBalance(super.getBalance() + amount);
    }

    public void canUserwithdrawMoney(double amount) {
        if (amount <= super.getBalance()) {
            System.out.println("User can");
        } else {
            System.out.println("User cannot");
        }
    }
}

class currentAccount extends BankAccount {

    double minimumLimit = 1000.0;

    public void addMoney(double amount) {
        super.updateBalance(super.getBalance() + amount);
    }

    public void canUserwithdrawMoney(double amount) {
        if (super.getBalance() - amount >= minimumLimit) {
            System.out.println("User can");
        } else {
            System.out.println("User cannot");
        }
    }

}

public class Abstraction {

    public static void main(String[] args) {

    }
}
