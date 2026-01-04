package eduard.OOP_and_MYSQL.OOP.inheritance;

public class HourlyEmployee extends Employee{

    public HourlyEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    protected double calculatePayment(double hours) {
        return wage * hours;
    }
}
