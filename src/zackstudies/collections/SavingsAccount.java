package zackstudies.collections;

public class SavingsAccount extends BankAccount {
    private int transfers;

    public SavingsAccount(String accNumber, double balance) {
        super(accNumber, balance);
        this.transfers = transfers;
    }

    @Override
    public void accountType() {
        System.out.println("Savings account, no fees.");
    }
}
