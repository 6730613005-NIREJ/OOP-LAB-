package lab1;

public class EmployeeTest {
    public static void main(String[] args) {

        // 1. Create one Employee and read attributes
        Employee emp1 = new Employee("John", "Smith", 3000);

        System.out.println(emp1.getFirstName());
        System.out.println(emp1.getLastName());
        System.out.println(emp1.getMonthlySalary());

        // Modify all attributes
        emp1.setFirstName("James");
        emp1.setLastName("Brown");
        emp1.setMonthlySalary(3500);

        // Invalid salary should not update
        emp1.setMonthlySalary(-500);

        System.out.println(emp1.getFirstName());
        System.out.println(emp1.getLastName());
        System.out.println(emp1.getMonthlySalary());

        // 2. Create two Employee objects
        Employee emp2 = new Employee("Alice", "Green", 4000);
        Employee emp3 = new Employee("Bob", "White", 5000);

        System.out.println(emp2.getYearlySalary());
        System.out.println(emp3.getYearlySalary());

        // 3. Give each employee a 10% raise
        emp2.giveRaise();
        emp3.giveRaise();

        System.out.println(emp2.getYearlySalary());
        System.out.println(emp3.getYearlySalary());
    }
}