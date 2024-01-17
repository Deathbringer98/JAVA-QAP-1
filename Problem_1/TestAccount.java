
public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("1", "Account1", 5000);
        Account acc2 = new Account("2", "Account2", 4000);

        System.out.println("Balance of Account 1: " + acc1.getBalance());
        System.out.println("Balance of Account 2: " + acc2.getBalance());

        acc1.transferTo(acc2, 1000);

        System.out.println("Balance of Account 1: " + acc1.getBalance());
        System.out.println("Balance of Account 2: " + acc2.getBalance());
    }
}