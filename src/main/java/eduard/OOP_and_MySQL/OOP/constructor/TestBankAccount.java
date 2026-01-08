package eduard.OOP_and_MySQL.OOP.constructor;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(765484);
        bankAccount.depositCash(20000.0);
        bankAccount.withdrawCash(5000.0);
        System.out.println(bankAccount.printInfo());
        bankAccount.withdrawCash(20000.0);
        System.out.println(bankAccount.printInfo());
        bankAccount.depositCash(10000.0);
        bankAccount.withdrawCash(-100.0);
        System.out.println(bankAccount.printInfo());
        bankAccount.withdrawCash(789.23);
        System.out.println(bankAccount.printInfo());
    }
}
