package zackstudies.collections;

public class Driver {
    public static void main(String[] args) {
        BankAccount zack = new CheckingAccount("BC1234", 1000);
        BankAccount pri = new SavingsAccount("BC4321", 500);

        System.out.println(zack);
    }
}
