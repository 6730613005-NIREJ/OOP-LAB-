package Q4;
import Q3.Employee;
import Q3.Fulltimer;
import Q3.Hourly;
import Q3.Manager;

public class AdvancedPaymentModuleTest {
    public static void main(String[] args) {
        AdvancedPaymentModule payment = new AdvancedPaymentModule();

        Employee[] employees = {
            new Fulltimer("John", 30000),
            new Manager("Alice", 40000, 5),
            new Manager("Bob", 40000, 15),
            new Hourly("Mike", 500, 20)
        };

        payment.payment(employees);

        System.out.println("Total pay: " + payment.getTotalPay());
    }
}
