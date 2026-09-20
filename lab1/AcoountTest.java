package lab1;

public class AcoountTest {
    public static void main(String[] args) {

        Account account = new Account("Oak", 1000);

        // Read account name and balance
        System.out.println(account.getName());
        System.out.println(account.getBalance());

        // Modify account name
        account.setName("New Oak");

        // Deposit money
        account.deposit(500);

        System.out.println(account.getName());
        System.out.println(account.getBalance());

        // Invalid deposits
        account.deposit(-100);
        account.deposit(0);

        System.out.println(account.getBalance());

        // Test non-positive initial balance
        Account account2 = new Account("Test", 0);

        System.out.println(account2.getBalance());
    }
    
}
