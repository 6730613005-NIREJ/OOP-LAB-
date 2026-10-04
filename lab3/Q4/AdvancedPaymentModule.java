package Q4;
import Q3.Employee;
import Q3.PaymentModule;

public class AdvancedPaymentModule extends PaymentModule {
    public void payment(Employee[] employees) {
        for (Employee employee : employees) {
            super.payment(employee);
        }
    }
}
