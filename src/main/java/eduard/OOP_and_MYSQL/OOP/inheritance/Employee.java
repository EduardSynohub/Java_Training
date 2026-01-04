package eduard.OOP_and_MYSQL.OOP.inheritance;

public class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public double wage;

    public Employee(int id, String firstName, String lastName, double wage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
    }

    protected void raiseWage( double percent) {
        if (percent > 0) {
            wage = (wage * (100 + percent)) / 100;
        } else {
            System.out.println("The salary increase percentage should be greater than 0.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", wage=" + wage +
                '}';
    }
}
