package eduard.OOP_and_MYSQL.OOP.constructor;

public class BankAccount {
    private int number;
    private double cash;

    public BankAccount(int number) {
        this.number = number;
        this.cash = 0.0;
    }

    public int getNumber() {
        return number;
    }

    public double getCash() {
        return cash;
    }

    public void depositCash(double amount) {
        if (amount <= 0) {
            System.out.println("The amount of money entered must be greater than 0!");
        } else {
            System.out.println("Your bank account has been credited with " + amount + " zł");
            cash += amount;
        }
    }

    public double withdrawCash(double amount) {
        if (amount <= 0) {
            System.out.println("The amount of money entered must be greater than 0!");
            return 0;
        } else {
            if (amount > cash) {
                System.out.println("The amount entered is greater than the account balance. " + cash + " zł has been withdrawn.");
                double result = cash;
                cash = 0.0;
                return result;
            }
        }
        cash -= amount;
        System.out.println(amount + " zł has been withdrawn.");
        return amount;
    }

    public String printInfo() {
        return "The balance of your bank account '" + number + "' is " + cash + " zł.";
    }
}
