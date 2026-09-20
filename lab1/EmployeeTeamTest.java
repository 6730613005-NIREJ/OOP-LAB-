package lab1;

public class EmployeeTeamTest {
    public static void main(String[] args) {

        Employee boss = new Employee("John", "Smith", 8000);
        Employee employee = new Employee("Alice", "Green", 4000);

        EmployeeTeam team = new EmployeeTeam(boss, employee);

        // Test printEmployeeDetails()
        team.printEmployeeDetails();

        // Test printAllEmployeesDetails()
        team.printAllEmployeesDetails();

        // Test updateSalaryOfEmployee()
        team.updateSalaryOfEmployee("Alice", 5000);

        // Test invalid salary
        team.updateSalaryOfEmployee("John", -100);

        team.printAllEmployeesDetails();

        // Test giveRaiseToAllEmployees()
        team.giveRaiseToAllEmployees();

        team.printAllEmployeesDetails();
    }
}
