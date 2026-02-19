
class ATM {
    private int balance = 5000;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amt) throws Exception {
        if (amt <= 0) {
            throw new Exception("Negative amount is invalid to deposit");
        }
        balance += amt;
        System.out.println("Deposit: " + amt);
    }

    public void withdraw(int amt) throws Exception {
        if (amt <= 0) {
            throw new Exception("Negative amount is invalid to withdraw");
        }
        if (amt > balance) {
            throw new Exception("Insufficient balance");
        }
        balance -= amt;
        System.out.println("Withdraw: " + amt);
    }
}

public class ThrowsTester {
    public static void main(String[] args) {
        try {
            ATM a1 = new ATM();
            System.out.println("Balance: " + a1.getBalance());

            a1.deposit(2000);
            System.out.println("Balance: " + a1.getBalance());

            a1.withdraw(2500);
            System.out.println("Balance: " + a1.getBalance());

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally reached the end");
        }
    }
}
