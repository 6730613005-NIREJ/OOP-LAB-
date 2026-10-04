package Q3;

public class PaymentModuleTest {
    public static void main(String[] args) {
        PaymentModule payment = new PaymentModule();

        Employee e1 = new Fulltimer("John", 30000);
        Employee e2 = new Manager("Alice", 40000, 5);
        Employee e3 = new Manager("Bob", 40000, 15);
        Employee e4 = new Hourly("Mike", 500, 20);

        payment.payment(e1);
        payment.payment(e2);
        payment.payment(e3);
        payment.payment(e4);

        System.out.println("Total pay: " + payment.getTotalPay());
    }
}
