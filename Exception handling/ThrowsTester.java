class ATM{
    private int balance = 5000;
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void deposit(int amt){
        balance += amt;

    }
    public void withdraw(int amt){
        if(amt>balance)
            System.out.println("Insufficient balance");
        else
        balance -= amt;
    }
}
public class ThrowsTester {
    public static void main(String[] args) {
        try {
            ATM a1 = new ATM();
            System.out.println("Balance: " +a1.getBalance());
            a1.deposit(2000);
            System.out.println("Balance: " +a1.getBalance());
            a1.withdraw(2500);
             System.out.println("Balance: " +a1.getBalance());
            
        } catch (Exception e) {
        }
    }
}
