public class LunchAccountTester{
    public static void main(String[] args) {
        LunchAccount firstAccount = new LunchAccount("Billy", 1234, 0);

        System.out.println(firstAccount.getName());
        System.out.println(firstAccount.getId());
        System.out.println(firstAccount.getBalance());

        firstAccount.addMoney(10);
        System.out.println(firstAccount.getBalance());
    }
}