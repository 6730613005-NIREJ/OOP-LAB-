package lab1;


public class EmployeeTest {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Nil", "Uzuma", 25000);

        System.out.println("Employee Details:");
        System.out.println("Employee1: " +
            emp1.getFirstName() + " " +
            emp1.getLastName() +
            " Salary: " + emp1.getMonthlySalary());

        emp1.setFirstName("Nil");
        emp1.setLastName("Uzuma");
        emp1.setMonthlySalary(35000);

        System.out.println("Updated Employee:");
        System.out.println("Employee1: " +
            emp1.getFirstName() + " " +
            emp1.getLastName() +
            " Salary: " + emp1.getMonthlySalary());

        Employee employee1 = new Employee("Anom", "Uzuma", 25000);
        Employee employee2 = new Employee("Somchai", "Sunt", 45000);

        System.out.println("Employee1 yearly_salary: " +
            employee1.getYearlySalary());

        System.out.println("Employee2 yearly_salary: " +
            employee2.getYearlySalary());

        employee1.giveRaise();
        employee2.giveRaise();

        System.out.println("10% raise of employee1: " +
            employee1.getYearlySalary());

        System.out.println("10% raise of employee2: " +
            employee2.getYearlySalary());
    }
}