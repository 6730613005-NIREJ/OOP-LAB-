package lab1;

public class EmployeeTeamTest {
    public static void main(String[] args) {

        Employee boss = new Employee("Nil", "Uzuma", 90000);
        Employee employee = new Employee("Somchai", "Sunt", 35000);

        EmployeeTeam team = new EmployeeTeam(boss, employee);

        System.out.println("Employee Details:");
        team.printEmployeeDetails();

        System.out.println("\nAll Employees Details:");
        team.printAllEmployeesDetails();

        team.updateSalaryOfEmployee("Somchai", 40000);

        System.out.println("\nAfter Salary Update:");
        team.printAllEmployeesDetails();

        team.giveRaiseToAllEmployees();

        System.out.println("\nAfter 10% Raise:");
        team.printAllEmployeesDetails();
    }
}