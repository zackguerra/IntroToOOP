package zackstudies.collections;

public class CheckingAccount extends BankAccount {
    private double limit;

    public CheckingAccount(String accNumber, double balance) {
        super(accNumber, balance);
        this.limit = limit;
    }

    @Override
    public void accountType() {
        System.out.println("Checking account, 0.5% fee for each transaction.");
    }
    @Override
    public String toString() {
        return "Bank Account Number " + getAccNumber() + "." ;
    }
}
