package lab1;

public class AccountTest {
    public static void main(String[] args) {

        Account account = new Account("Nil Uzuma", 25000);

        System.out.println("Account Details:");
        System.out.println("Account Name: " + account.getName());
        System.out.println("Account Balance: " + account.getBalance());

        account.setName("Nil Uzuma");
        account.deposit(5000);

        System.out.println("\nAfter Deposit:");
        System.out.println("Account Name: " + account.getName());
        System.out.println("Account Balance: " + account.getBalance());

        account.deposit(-1000);

        System.out.println("\nAfter Invalid Deposit:");
        System.out.println("Account Balance: " + account.getBalance());

        Account account2 = new Account("Nil Uzuma", 0);

        System.out.println("\nInvalid Initial Balance:");
        System.out.println("Account Balance: " + account2.getBalance());
    }
}
