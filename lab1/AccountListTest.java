package lab1;

public class AccountListTest {
    public static void main(String[] args) {
        AccountList al = new AccountList(3);

        // success should be true
        boolean success = al.appendAccount(new Account("Oak", 1.0));

        success = al.appendAccount(new Account("Two", 0.1));

        // It should print the required error message
        Account account = al.getAccount(2);

        System.out.println(account);

        account = al.getAccount(1);

        // It should print 0.1
        System.out.println(account.getBalance());

        success = al.appendAccount(new Account("tmp", 0));

        success = al.appendAccount(new Account("tmp2", 0));

        // It should print false
        System.out.println(success);
    }
}
