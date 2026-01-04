package eduard.OOP_and_MYSQL.OOP.inheritance;

public class SalariedEmployee extends Employee{

    final static double MONTH_HOURS = 190;
    public SalariedEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    protected double calculatePayment() {
        return wage * MONTH_HOURS;
    }
}
