package eduard.OOP_and_MYSQL.OOP.inheritance;

public class TestEmployeeSalary {

    public static void main(String[] args) {
        HourlyEmployee employee = new HourlyEmployee(45, "Nick", "Fury", 100.00);
        SalariedEmployee salariedEmployee = new SalariedEmployee(32, "Tony", "Stark", 150.00);

        employee.raiseWage(50);
        double salary = employee.calculatePayment(4.5);
        System.out.println(salary);

        salariedEmployee.raiseWage(46);
        double monthlySalary = salariedEmployee.calculatePayment();
        System.out.println(monthlySalary);
    }
}
