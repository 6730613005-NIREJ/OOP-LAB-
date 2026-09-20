package lab1;

public class EmployeeTeam {
    private Employee boss;
    private Employee employee;

    public EmployeeTeam(Employee boss, Employee employee) {
        this.boss = boss;
        this.employee = employee;
    }

    public void printEmployeeDetails() {
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getMonthlySalary());
    }

    public void printAllEmployeesDetails() {
        System.out.println(boss.getFirstName());
        System.out.println(boss.getLastName());
        System.out.println(boss.getMonthlySalary());

        printEmployeeDetails();
    }

    public void updateSalaryOfEmployee(
            String firstname, double newSalary) {

        if (newSalary > 0) {
            if (boss.getFirstName().equals(firstname)) {
                boss.setMonthlySalary(newSalary);
            }

            if (employee.getFirstName().equals(firstname)) {
                employee.setMonthlySalary(newSalary);
            }
        }
    }

    public void giveRaiseToAllEmployees() {
        boss.giveRaise();
        employee.giveRaise();
    }
}