package lab1;
public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor with three arguments
    public Employee(String firstName, String lastName,
                    double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    // Constructor with two arguments
    public Employee(String firstName, String lastName) {
        this(firstName, lastName, 0);
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

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise() {
        setMonthlySalary(monthlySalary * 1.10);
    }
}